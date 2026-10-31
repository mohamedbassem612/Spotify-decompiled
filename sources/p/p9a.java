package p;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class p9a {
    public static final Charset a = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        if (r6 != 4) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p9a.a(java.lang.String):byte[]");
    }

    public static String b(byte[] bArr) {
        try {
            int length = bArr.length;
            m9a m9aVar = new m9a();
            int i = (length / 3) * 4;
            if (length % 3 > 0) {
                i += 4;
            }
            m9aVar.a = new byte[i];
            m9aVar.j1(bArr, length);
            return new String((byte[]) m9aVar.a, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            eg.f(e);
            return null;
        }
    }
}
