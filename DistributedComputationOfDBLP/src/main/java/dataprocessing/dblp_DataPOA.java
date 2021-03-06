package dataprocessing;


import java.io.IOException;

/**
* dataprocessing/dblp_DataPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw2.idl
* Thursday, October 15, 2020 1:50:26 PM CDT
*/

public abstract class dblp_DataPOA extends org.omg.PortableServer.Servant
 implements dataprocessing.dblp_DataOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sayhello", new java.lang.Integer (0));
    _methods.put ("one_author", new java.lang.Integer (1));
    _methods.put ("author_no_intereption", new java.lang.Integer (2));
    _methods.put ("top_100", new java.lang.Integer (3));
    _methods.put ("top_100_co_authors", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // dataprocessing/dblp_Data/sayhello
       {
         String $result = null;
         $result = this.sayhello ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // dataprocessing/dblp_Data/one_author
       {
         String $result = null;
         $result = this.one_author ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // dataprocessing/dblp_Data/author_no_intereption
       {
         String $result = null;
           try {
               $result = this.author_no_intereption ();
           } catch (IOException e) {
               e.printStackTrace();
           }
           out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // dataprocessing/dblp_Data/top_100
       {
         String $result = null;
         $result = this.top_100 ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // dataprocessing/dblp_Data/top_100_co_authors
       {
         String $result = null;
         $result = this.top_100_co_authors ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:dataprocessing/dblp_Data:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public dblp_Data _this() 
  {
    return dblp_DataHelper.narrow(
    super._this_object());
  }

  public dblp_Data _this(org.omg.CORBA.ORB orb) 
  {
    return dblp_DataHelper.narrow(
    super._this_object(orb));
  }


} // class dblp_DataPOA
