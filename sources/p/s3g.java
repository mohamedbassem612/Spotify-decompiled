package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s3g extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r3g b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3g(r3g r3gVar, j2i j2iVar) {
        super(2);
        this.a = (byte) 0;
        this.b = r3gVar;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        afx afxVarE;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        r3g r3gVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var2).a.c;
                    boolean zG = x340Var2.g(r3gVar) | x340Var2.f(j);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        if (r3gVar != null) {
                            int i = ihx.f;
                            afxVarE = ihx.e(24, j, r3gVar.a, u7h.f);
                        } else {
                            afxVarE = null;
                        }
                        objT = afxVarE;
                        x340Var2.s0(objT);
                    }
                    afx afxVarA = (afx) objT;
                    if (afxVarA == null) {
                        x340Var2.i0(-846000579);
                        afxVarA = cbx.a(x340Var2);
                    } else {
                        x340Var2.i0(-846001168);
                    }
                    x340Var2.r(false);
                    gfx.d(afxVarA, j2iVar, x340Var2, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                t3g.a(r3gVar, j2iVar, (b0k) obj, czo1.p(49));
                break;
            default:
                ((Number) obj2).intValue();
                t3g.b(r3gVar, j2iVar, (b0k) obj, czo1.p(49));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3g(r3g r3gVar, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r3gVar;
        this.c = j2iVar;
    }
}
