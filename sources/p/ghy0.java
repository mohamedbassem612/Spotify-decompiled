package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ghy0 {
    public static final /* synthetic */ int a = 0;

    static {
        zmo1.d();
        kl1 kl1Var = j761.a;
        new nfy0();
    }

    public ghy0() {
        kl1 kl1Var = j761.a;
    }

    public final byte[] a(nma0 nma0Var, Object obj) {
        jgc jgcVar = new jgc();
        new xiy0(this, new vyq0(jgcVar, (byte) 19), nma0Var.getDescriptor()).i(nma0Var, obj);
        int i = jgcVar.b;
        byte[] bArr = new byte[i];
        f46.U(0, i, 2, jgcVar.a, bArr);
        return bArr;
    }
}
