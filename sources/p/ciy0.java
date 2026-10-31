package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ciy0 implements t2n {
    public static final r8i0 a;

    static {
        se11 se11Var = r8i0.e;
        a = bmq0.w("application/x-protobuf");
    }

    @Override // p.t2n
    public final Object g(Object obj) {
        byte[] byteArray = ((s2j0) obj).toByteArray();
        int length = byteArray.length;
        w4n1.a(byteArray.length, 0L, length);
        return new sn21(length, a, byteArray);
    }
}
