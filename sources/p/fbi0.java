package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fbi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pzw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbi0(pzw pzwVar, byte b) {
        super(1);
        this.a = b;
        this.b = pzwVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pzw pzwVar = this.b;
        switch (b) {
            case 0:
                return z8p1.n((mey0) obj, (clm) pzwVar.g, (epb1) pzwVar.e, (nwt) pzwVar.b, (kko) pzwVar.f, false, false, false, false, false, false, false, false, false, (ytp0) pzwVar.N0, (uvy) null, false, false, false, 8257376);
            case 1:
                mey0 mey0Var = (mey0) obj;
                ioj0 ioj0Var = (ioj0) ((epb1) pzwVar.e).Y.getValue();
                if (ioj0Var == null) {
                    ioj0Var = new ioj0(b7x.a);
                }
                return too1.w(mey0Var, new t810(ioj0Var, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, 2097150), (yqg) pzwVar.h, (fza) pzwVar.i, (hvp0) pzwVar.t, (ytp0) pzwVar.X, (ebi0) pzwVar.d);
            default:
                ((qtr) obj).b(new k1((lzn0) pzwVar.Z, (vgm) pzwVar.Y, (lnm) null, (byte) 17));
                return rih1.a;
        }
    }
}
