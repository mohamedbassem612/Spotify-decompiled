package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ymb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cnb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymb(cnb cnbVar, byte b) {
        super(2);
        this.a = b;
        this.b = cnbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        cnb cnbVar = this.b;
        switch (b) {
            case 0:
                kdy0 kdy0Var = cnbVar.a;
                return new kpg0(new yxb0((ja8) kdy0Var.c, (sfz) kdy0Var.d, (m4e0) kdy0Var.e, (uu00) kdy0Var.b), c7b.b1);
            default:
                zob1 zob1Var = (zob1) obj;
                p410 p410Var = cnbVar.c;
                return new kpg0(new l8r0((lzn0) p410Var.b, (m8r0) p410Var.c, (w8r0) p410Var.d, (n9r0) p410Var.e, new ypg0(new anb(cnbVar, (byte) 1), cnbVar.Y), zob1Var, cnbVar.g, (kt91) p410Var.f, (kg90) p410Var.g, (ov20) p410Var.h), c7b.d1);
        }
    }
}
