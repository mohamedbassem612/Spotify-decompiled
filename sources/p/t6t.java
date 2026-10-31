package p;

import android.R;
import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t6t {
    public final i8h1 a;
    public final bfd b;
    public final dg30 c;
    public final kt91 d;
    public final rm5 e;
    public final ic9 f;
    public final add g;
    public final q8n h;
    public final q8n i;

    public t6t(rm5 rm5Var, ic9 ic9Var, add addVar, bfd bfdVar, q8n q8nVar, q8n q8nVar2, dg30 dg30Var, kt91 kt91Var, i8h1 i8h1Var) {
        this.a = i8h1Var;
        this.b = bfdVar;
        this.c = dg30Var;
        this.d = kt91Var;
        this.e = rm5Var;
        this.f = ic9Var;
        this.g = addVar;
        this.h = q8nVar;
        this.i = q8nVar2;
    }

    public final void a(s6t s6tVar, String str, String str2) {
        mmr0 mmr0Var;
        uvk0 uvk0Var = new uvk0(str2);
        jzm jzmVar = new jzm(this, uvk0Var, str, s6tVar, (byte) 6);
        f2t f2tVar = new f2t(this, uvk0Var, (byte) 1);
        rm5 rm5Var = this.e;
        Activity activity = (Activity) rm5Var.a;
        String string = activity.getString(2131958522);
        String string2 = activity.getString(R.string.cancel);
        boolean zI = ((add) rm5Var.b).a.i();
        if (s6tVar instanceof q6t) {
            mmr0Var = zI ? new mmr0(activity.getString(2131958531), activity.getString(2131958530, ((q6t) s6tVar).a)) : new mmr0(activity.getString(2131958524), activity.getString(2131958523, ((q6t) s6tVar).a));
        } else if (!(s6tVar instanceof r6t)) {
            eg.o();
            return;
        } else if (zI) {
            zks0 zks0Var = ((r6t) s6tVar).a;
            if (zks0Var.g()) {
                mmr0Var = new mmr0(activity.getString(2131958524), activity.getString(2131958532));
            } else {
                mmr0Var = zks0Var.b() ? new mmr0(activity.getString(2131958535), activity.getString(2131958534)) : new mmr0(activity.getString(2131958535), activity.getString(2131958533));
            }
        } else {
            mmr0Var = new mmr0(activity.getString(2131958524), activity.getString(2131958532));
        }
        mw40 mw40VarT = yoi1.T(activity, (String) mmr0Var.a, (String) mmr0Var.b);
        oad oadVar = new oad(jzmVar, (byte) 0);
        mw40VarT.a = string;
        mw40VarT.c = oadVar;
        oad oadVar2 = new oad(f2tVar, (byte) 1);
        mw40VarT.b = string2;
        mw40VarT.d = oadVar2;
        mw40VarT.e = false;
        mw40VarT.b().b();
    }
}
