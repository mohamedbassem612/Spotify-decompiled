package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wsj0 extends pim0 implements j4k, zlb0 {
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        boolean z = ((pim0) this).N0 && ((Boolean) lcc.z(this, kw80.a)).booleanValue();
        long j2 = kw80.b;
        q5t0 q5t0VarH = afh0Var.H(j);
        int iMax = q5t0VarH.a;
        if (z) {
            iMax = Math.max(iMax, ifh0Var.i0(s3v.b(j2)));
        }
        int iMax2 = q5t0VarH.b;
        if (z) {
            iMax2 = Math.max(iMax2, ifh0Var.i0(s3v.a(j2)));
        }
        return ifh0Var.S(iMax, iMax2, b7x.a, new tk80(iMax, q5t0VarH, iMax2, (byte) 2));
    }
}
