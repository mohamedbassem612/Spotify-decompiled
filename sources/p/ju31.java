package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ju31 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ru31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju31(ru31 ru31Var) {
        super(2);
        this.b = ru31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        uiw0 siw0Var;
        lsm0 lsm0Var;
        ksm0 ksm0Var;
        byte b = this.a;
        ru31 ru31Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ru31Var.g((b0k) obj, czo1.p(1));
                return rih1.a;
            default:
                fu31 fu31Var = (fu31) obj;
                iu31 iu31Var = (iu31) obj2;
                ku31 ku31Var = iu31Var.a;
                String str = ku31Var.a;
                cob1 cob1Var = ku31Var.b;
                int i2 = cob1Var == null ? -1 : pu31.a[cob1Var.ordinal()];
                String str2 = null;
                if (i2 == -1 || i2 == 1) {
                    i = 1;
                } else {
                    i = 2;
                    if (i2 != 2) {
                        i = 3;
                        if (i2 != 3) {
                            eg.o();
                            return null;
                        }
                    }
                }
                u061 u061Var = ku31Var.c;
                boolean z = u061Var != null ? u061Var.a : false;
                yeu0 yeu0Var = ru31Var.h;
                ftv ftvVar = fu31Var.b;
                String str3 = ftvVar.a;
                boolean z2 = ftvVar.g;
                i091 i091Var = iu31Var.b;
                String str4 = ku31Var.a;
                yeu0Var.getClass();
                if (i091Var != null && (lsm0Var = i091Var.a) != null && (ksm0Var = lsm0Var.b) != null) {
                    str2 = ksm0Var.e;
                }
                boolean zJ = u890.j(str2, str3);
                boolean z3 = (i091Var == null || i091Var.g) ? false : true;
                r091 r091Var = (r091) yeu0Var.c;
                uiw0 uiw0Var = riw0.a;
                if (r091Var == null || !z2) {
                    siw0Var = uiw0Var;
                } else {
                    if (zJ && z3 && u890.j(i091Var.h, j091.a)) {
                        uiw0Var = qiw0.a;
                    } else if (zJ && z3 && u890.j(i091Var.h, n091.a)) {
                        siw0Var = new siw0(i091Var.c, i091Var.e, i091Var.d);
                    } else if (str4 != null) {
                        uiw0Var = tiw0.a;
                    }
                    siw0Var = uiw0Var;
                }
                return new hu31(fu31Var, str, z, i, siw0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju31(ru31 ru31Var, int i) {
        super(2);
        this.b = ru31Var;
    }
}
