package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2u {
    public final Activity a;
    public final sgz b;
    public final rmr c;

    public q2u(Activity activity, sgz sgzVar, rmr rmrVar) {
        this.a = activity;
        this.b = sgzVar;
        this.c = rmrVar;
    }

    public static final void a(ohd ohdVar, g621 g621Var) {
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(g621Var);
        }
    }

    public final void b() {
        Activity activity = this.a;
        mw40 mw40VarT = yoi1.T(activity, activity.getText(2131964124), activity.getText(2131964122));
        CharSequence text = activity.getText(2131964123);
        oad oadVar = new oad(this, (byte) 12);
        mw40VarT.a = text;
        mw40VarT.c = oadVar;
        mw40VarT.h = new nn5(this, (byte) 2);
        mw40VarT.e = true;
        mw40VarT.b().b();
    }

    public final void c(int i) {
        Activity activity = this.a;
        mw40 mw40VarT = yoi1.T(activity, activity.getText(2131964125), activity.getResources().getQuantityString(2131820958, i, Integer.valueOf(i)));
        CharSequence text = activity.getText(2131964123);
        o2u o2uVar = new o2u(this, i);
        mw40VarT.a = text;
        mw40VarT.c = o2uVar;
        mw40VarT.h = new p2u(this, i);
        mw40VarT.e = true;
        mw40VarT.b().b();
    }
}
