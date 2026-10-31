package p;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.e;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class k290 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.e();
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
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
        e eVar = (e) ((u8) obj);
        we40 we40Var = (we40) eVar.f(5);
        we40Var.d();
        we40.e(we40Var.b, eVar);
        u8 u8Var = (u8) obj2;
        if (!we40Var.a.getClass().isInstance(u8Var)) {
            hhg1.n("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        we40Var.d();
        we40.e(we40Var.b, (e) u8Var);
        return we40Var.b();
    }
}
