/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE259_Hard_Coded_Password__kerberosKey_75b.java
Label Definition File: CWE259_Hard_Coded_Password.label.xml
Template File: sources-sink-75b.tmpl.java
*/
/*
 * @description
 * CWE: 259 Hard Coded Password
 * BadSource: hardcodedPassword Set data to a hardcoded string
 * GoodSource: Read data from the console using readLine()
 * Sinks: kerberosKey
 *    BadSink : data used as password in KerberosKey()
 * Flow Variant: 75 Data flow: data passed in a serialized object from one method to another in different source files in the same package
 *
 * */

package testcases.CWE259_Hard_Coded_Password;

import testcasesupport.*;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.logging.Level;

import java.io.*;

import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;

public class CWE259_Hard_Coded_Password__kerberosKey_75b
{
    public void badSink(byte[] dataSerialized ) throws Throwable
    {
        /* unserialize data */
        ByteArrayInputStream streamByteArrayInput = null;
        ObjectInputStream streamObjectInput = null;

        try
        {
            streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
            streamObjectInput = new ObjectInputStream(streamByteArrayInput);
            String data = (String)streamObjectInput.readObject();

            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }

        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
        }
        catch (ClassNotFoundException exceptClassNotFound)
        {
            IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamObjectInput != null)
                {
                    streamObjectInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
            }

            try
            {
                if (streamByteArrayInput != null)
                {
                    streamByteArrayInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
            }
        }
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(byte[] dataSerialized ) throws Throwable
    {
        /* unserialize data */
        ByteArrayInputStream streamByteArrayInput = null;
        ObjectInputStream streamObjectInput = null;

        try
        {
            streamByteArrayInput = new ByteArrayInputStream(dataSerialized);
            streamObjectInput = new ObjectInputStream(streamByteArrayInput);
            String data = (String)streamObjectInput.readObject();

            if (data != null)
            {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                /* POTENTIAL FLAW: data used as password in KerberosKey() */
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }

        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "IOException in deserialization", exceptIO);
        }
        catch (ClassNotFoundException exceptClassNotFound)
        {
            IO.logger.log(Level.WARNING, "ClassNotFoundException in deserialization", exceptClassNotFound);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamObjectInput != null)
                {
                    streamObjectInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ObjectInputStream", exceptIO);
            }

            try
            {
                if (streamByteArrayInput != null)
                {
                    streamByteArrayInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing ByteArrayInputStream", exceptIO);
            }
        }
    }
}
