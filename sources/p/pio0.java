package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pio0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qio0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pio0(qio0 qio0Var, byte b) {
        super(1);
        this.a = b;
        this.b = qio0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        qio0 qio0Var = this.b;
        switch (b) {
            case 0:
                wio0 wio0Var = qio0Var.e;
                String str = qio0Var.a.a;
                wio0Var.b(str, false);
                if (((hxb) obj) instanceof gxb) {
                    i8h1 i8h1Var = (i8h1) qio0Var.d.a.get();
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-contribution-notes-sharing-reminder-bottom-sheet";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.d = str;
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "playlist");
                    x6h1VarR.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    y6h1 y6h1VarA = x6h1VarR.a();
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return rih1.a;
            default:
                return new hp0(qio0Var.c.c(new pio0(qio0Var, b2)), (byte) 11);
        }
    }
}
