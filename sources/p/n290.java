package p;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class n290 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        jme.p0(bArr);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static e c(Object obj, Object obj2) {
        e eVar = (e) ((a) obj);
        ye40 ye40Var = (ye40) eVar.d(5);
        ye40Var.d();
        ye40.e(ye40Var.b, eVar);
        a aVar = (a) obj2;
        if (!ye40Var.a.getClass().isInstance(aVar)) {
            hhg1.n("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        ye40Var.d();
        ye40.e(ye40Var.b, (e) aVar);
        return ye40Var.b();
    }
}
