package p;

import com.google.protobuf.InvalidProtocolBufferException;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cj4 {
    public static final uq8 b = new uq8((byte) 29);
    public final File a;

    public cj4(File file) {
        this.a = file;
    }

    public static void b(File file) {
        if (file.delete()) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.o("File <" + file + "> deleted", new Object[0]);
            return;
        }
        utw0 utw0Var2 = ike1.a;
        utw0Var2.y("RCS");
        utw0Var2.q("Can't delete file <" + file + ">", new Object[0]);
    }

    public static svz0 d(File file) {
        if (!file.exists() || file.length() == 0) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.z("No existing configuration for file <" + file + ">. Returning the default config.", new Object[0]);
            return null;
        }
        try {
            return b.G(file, e(file));
        } catch (InvalidProtocolBufferException e) {
            utw0 utw0Var2 = ike1.a;
            utw0Var2.y("RCS");
            utw0Var2.s(e, "Can't parse protobuf from " + file, new Object[0]);
            return null;
        }
    }

    public static byte[] e(File file) {
        byte[] bArr = new byte[(int) file.length()];
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(dataInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.s(e, "Can't read from file <" + file + ">", new Object[0]);
            return bArr;
        }
    }

    public final void a() {
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o("Cleaning configuration store.", new Object[0]);
        uq8 uq8Var = b;
        File file = this.a;
        uq8Var.H(file);
        if (file.exists()) {
            if (!file.isDirectory()) {
                b(file);
                return;
            }
            utw0Var.y("RCS");
            utw0Var.o("Configuration store is a directory, removing all files in dir.", new Object[0]);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    file2.getClass();
                    b(file2);
                }
            }
        }
    }

    public final synchronized svz0 c() {
        svz0 svz0VarD;
        svz0VarD = d(this.a);
        if (svz0VarD == null) {
            svz0VarD = svz0.d;
        }
        return svz0VarD;
    }

    public final synchronized void f(svz0 svz0Var) {
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o("Storing raw configuration for " + this.a, new Object[0]);
        g(svz0Var.a.b());
        b.H(this.a);
    }

    public final void g(byte[] bArr) {
        File file = this.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                utw0 utw0Var = ike1.a;
                utw0Var.y("RCS");
                utw0Var.o("Writing <" + bArr.length + "> bytes to file <" + file + ">", new Object[0]);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            utw0 utw0Var2 = ike1.a;
            utw0Var2.y("RCS");
            utw0Var2.s(e, "Can't write to file <" + file + ">", new Object[0]);
        }
    }
}
