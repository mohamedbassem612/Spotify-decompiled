package p;

import com.google.protobuf.InvalidProtocolBufferException;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kvw0 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final File a;

    public kvw0(File file) {
        this.a = file;
    }

    public final synchronized gvw0 a() {
        gvw0 fvw0Var;
        if (this.a.exists() && this.a.length() != 0) {
            utw0 utw0Var = ike1.a;
            utw0Var.y("RCS");
            utw0Var.z("Reading the latest product state for <" + this.a + ">", new Object[0]);
            try {
                fvw0Var = new evw0(rqt0.y(b()));
            } catch (InvalidProtocolBufferException e) {
                utw0 utw0Var2 = ike1.a;
                utw0Var2.y("RCS");
                utw0Var2.s(e, "Can't parse protobuf from " + this.a, new Object[0]);
                fvw0Var = new fvw0(e);
            }
            return fvw0Var;
        }
        utw0 utw0Var3 = ike1.a;
        utw0Var3.y("RCS");
        utw0Var3.z("No product state for file <" + this.a + ">. Returning the empty product state.", new Object[0]);
        return new fvw0(nuw0.a);
    }

    public final byte[] b() {
        File file = this.a;
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

    public final void c(byte[] bArr) {
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
