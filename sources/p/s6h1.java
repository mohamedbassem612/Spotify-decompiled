package p;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s6h1 implements nma0 {
    public static final s6h1 a = new s6h1();
    public static final qnw0 b = omo1.c("UbiEventAbsoluteLocation", knw0.o);

    public final Object deserialize(dar darVar) throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(darVar.V(), 2)));
        try {
            r6h1 r6h1Var = (r6h1) objectInputStream.readObject();
            objectInputStream.close();
            return r6h1Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(objectInputStream, th);
                throw th2;
            }
        }
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) throws IOException {
        r6h1 r6h1Var = (r6h1) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(r6h1Var);
                objectOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                uaxVar.h0(Base64.encodeToString(byteArray, 2));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }
}
