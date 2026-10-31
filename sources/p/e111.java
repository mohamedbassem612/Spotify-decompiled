package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e111 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tkt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e111(tkt tktVar, byte b) {
        super(1);
        this.a = b;
        this.b = tktVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tkt tktVar = this.b;
        switch (b) {
            case 0:
                ((ak01) tktVar.c).invoke(b011.a);
                return rih1Var;
            case 1:
                ((Number) obj).intValue();
                g611 g611Var = new g611(-1, -2);
                int i = tktVar.a;
                g611Var.setMargins(i, 0, i, tktVar.b);
                return g611Var;
            case 2:
                z2s z2sVar = (z2s) obj;
                z2sVar.R(fv31.class, (rt01) tktVar.e, t011.g, t011.h, new e111(tktVar, (byte) 1), false, atz0.b1);
                z2sVar.R(xv31.class, (vyf1) tktVar.f, new ldz0(tktVar, (byte) 16), t011.i, t011.t, false, atz0.c1);
                return rih1Var;
            default:
                o4o1.o((y2s) obj, (kdn0) tktVar.d, new e111(tktVar, (byte) 2));
                return rih1Var;
        }
    }
}
