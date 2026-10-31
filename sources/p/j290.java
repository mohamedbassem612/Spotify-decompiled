package p;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class j290 {
    public static final Charset a;
    public static final byte[] b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new b(bArr, 0, 0, false).g(0);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException((Throwable) e);
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
}
