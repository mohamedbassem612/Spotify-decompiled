package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xqt0 {
    public final y390 a;
    public final yh2 b;
    public final uip0 c;
    public final x290 d;
    public final iac0 e;
    public final idd1 f = new idd1(new wqt0(this, (byte) 1));
    public final idd1 g = new idd1(new wqt0(this, (byte) 0));

    public xqt0(y390 y390Var, yh2 yh2Var, uip0 uip0Var, x290 x290Var, iac0 iac0Var) {
        this.a = y390Var;
        this.b = yh2Var;
        this.c = uip0Var;
        this.d = x290Var;
        this.e = iac0Var;
    }

    public final void a(String str, ewt0 ewt0Var) {
        int iOrdinal = ewt0Var.ordinal();
        if (iOrdinal == 0) {
            ((wr00) this.f.getValue()).a(str);
            return;
        }
        if (iOrdinal == 1) {
            this.b.b(str, (String) null);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                ((c8b) this.g.getValue()).a(str, false);
                return;
            } else {
                if (iOrdinal == 4) {
                    return;
                }
                eg.o();
                return;
            }
        }
        uip0 uip0Var = this.c;
        Activity activity = (Activity) uip0Var.b;
        pbh0 pbh0VarE = new pbh0(activity, 0).e(activity.getString(2131952186));
        ((uh3) pbh0VarE).a.f = activity.getString(2131952184);
        String string = activity.getString(2131952183);
        k6b k6bVar = k6b.i;
        qh3 qh3Var = ((uh3) pbh0VarE).a;
        qh3Var.i = string;
        qh3Var.j = k6bVar;
        String string2 = activity.getString(2131952185);
        oad oadVar = new oad(uip0Var, (byte) 22);
        qh3Var.g = string2;
        qh3Var.h = oadVar;
        qh3Var.m = vqt0.b;
        pbh0VarE.create().show();
    }
}
