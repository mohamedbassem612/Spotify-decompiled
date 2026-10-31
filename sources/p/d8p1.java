package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d8p1 {
    public static final r7p1 a;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r0 = p.q7p1.a;
     */
    static {
        /*
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "amd64"
            boolean r0 = java.util.Objects.equals(r0, r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L20
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            p.u7p1 r0 = p.u7p1.a     // Catch: java.lang.Throwable -> L20
            goto L22
        L1d:
            p.u7p1 r0 = p.u7p1.b     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            p.q7p1 r0 = p.q7p1.a
        L22:
            p.d8p1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d8p1.<clinit>():void");
    }

    public static long a(byte[] bArr, int i) {
        return a.a(bArr, i);
    }
}
