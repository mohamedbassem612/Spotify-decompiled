package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zi5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bj5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi5(bj5 bj5Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = bj5Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        bj5 bj5Var = this.b;
        switch (b) {
            case 0:
                return new zi5(bj5Var, lnmVar, (byte) 0);
            case 1:
                return new zi5(bj5Var, lnmVar, (byte) 1);
            default:
                return new zi5(bj5Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bj5 bj5Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                tif1 tif1Var = bj5Var.P0;
                try {
                    tif1Var.e(2, "OrbitLibraryLoader", "cst");
                    if (bj5Var.X.get() == fsw0.a) {
                        fn31.T(bj5Var.R0, bj5Var.f, 0, new k2((jqq0) bj5Var.d.get(), bj5Var, (lnm) null, (byte) 28), 2);
                        break;
                    }
                    return rih1Var;
                } finally {
                    tif1Var.f("OrbitLibraryLoader", "cst");
                }
            case 1:
                hm5.M(obj);
                tif1 tif1Var2 = bj5Var.P0;
                try {
                    tif1Var2.e(2, "SpotifyStorageManager", "cst");
                    fn31.T(bj5Var.R0, bj5Var.f, 0, new kk((s6b1) bj5Var.c.get(), (lnm) null, (byte) 11), 2);
                    return rih1Var;
                } finally {
                    tif1Var2.f("SpotifyStorageManager", "cst");
                }
            default:
                hm5.M(obj);
                s45 s45Var = (zle1) bj5Var.Q0.get();
                t45 t45VarA = s45Var.a("uri_parser");
                t45VarA.l("warm_up", (String) null, true);
                t45VarA.g("warm_up");
                s45Var.b(t45VarA.e());
                return rih1Var;
        }
    }
}
