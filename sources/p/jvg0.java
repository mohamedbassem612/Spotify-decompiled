package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jvg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mvg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jvg0(mvg0 mvg0Var, byte b) {
        super(1);
        this.a = b;
        this.b = mvg0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mvg0 mvg0Var = this.b;
        switch (b) {
            case 0:
                return new x010(yoi1.g(mvg0Var.b.a(((ewg0) obj).k)), z4p1.F(mvg0Var.c.a(), 1), new a82(3, (lnm) null, (byte) 2), (byte) 1);
            case 1:
                ewg0 ewg0Var = (ewg0) obj;
                String str = ewg0Var.b;
                String str2 = ewg0Var.c;
                String str3 = ewg0Var.d;
                String str4 = ewg0Var.e;
                String str5 = ewg0Var.f;
                String str6 = ewg0Var.g;
                String str7 = ewg0Var.h;
                String str8 = ewg0Var.i;
                String str9 = ewg0Var.j;
                String str10 = ewg0Var.k;
                String str11 = ewg0Var.m;
                twg0 twg0Var = ewg0Var.n;
                String str12 = ewg0Var.o;
                sw9 sw9Var = mvg0Var.d;
                return new fwg0(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, twg0Var, str12, new mgc(str3, sw9Var.b, (gw70) sw9Var.c, (byte) 2), false, false);
            default:
                ((qtr) obj).b(new lcm(mvg0Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
