package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jbg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mbg1 b;
    public final /* synthetic */ tcd1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbg1(mbg1 mbg1Var, tcd1 tcd1Var, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = mbg1Var;
        this.c = tcd1Var;
        this.d = z;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        tcd1 tcd1Var = this.c;
        mbg1 mbg1Var = this.b;
        int i2 = 1;
        switch (b) {
            case 0:
                hv31 hv31Var = (hv31) obj;
                mbg1Var.getClass();
                return new f2n0(hv31Var.a, hv31Var.c, hv31Var.b, hv31Var.d, hv31Var.e, !(tcd1Var == tcd1.c) && this.d);
            default:
                uv31 uv31Var = (uv31) obj;
                mbg1Var.getClass();
                String str = uv31Var.b;
                int i3 = uv31Var.a;
                int i4 = uv31Var.d;
                String str2 = uv31Var.e;
                z0e1 z0e1Var = uv31Var.f;
                boolean z = uv31Var.g;
                int iOrdinal = tcd1Var.ordinal();
                if (iOrdinal == 0) {
                    i = i2;
                } else if (iOrdinal == 1) {
                    i = 2;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                    i = i2;
                }
                return new wde1(str, i3, i4, str2, z0e1Var, z, this.d, i);
        }
    }
}
