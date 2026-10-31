package p;

import android.R;
import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jyb0 {
    public final i8h1 a;
    public final bfd b;
    public final dg30 c;
    public final kt91 d;
    public final rm5 e;
    public final add f;
    public final ic9 g;
    public final q8n h;
    public final q8n i;

    public jyb0(rm5 rm5Var, ic9 ic9Var, add addVar, bfd bfdVar, q8n q8nVar, q8n q8nVar2, dg30 dg30Var, kt91 kt91Var, i8h1 i8h1Var) {
        this.a = i8h1Var;
        this.b = bfdVar;
        this.c = dg30Var;
        this.d = kt91Var;
        this.e = rm5Var;
        this.f = addVar;
        this.g = ic9Var;
        this.h = q8nVar;
        this.i = q8nVar2;
    }

    public final void a(String str, String str2, String str3) {
        uvk0 uvk0Var = new uvk0(str2);
        jzm jzmVar = new jzm(this, uvk0Var, str, str3, (byte) 24);
        x680 x680Var = new x680(this, uvk0Var, (byte) 25);
        rm5 rm5Var = this.e;
        Activity activity = (Activity) rm5Var.a;
        String string = activity.getString(2131958543);
        String string2 = activity.getString(R.string.cancel);
        String string3 = ((add) rm5Var.b).a.i() ? activity.getString(2131958545) : activity.getString(2131958544);
        string3.getClass();
        mw40 mw40VarT = yoi1.T(activity, activity.getString(2131958546), string3);
        oad oadVar = new oad(jzmVar, (byte) 7);
        mw40VarT.a = string;
        mw40VarT.c = oadVar;
        oad oadVar2 = new oad(x680Var, (byte) 8);
        mw40VarT.b = string2;
        mw40VarT.d = oadVar2;
        mw40VarT.e = false;
        mw40VarT.b().b();
    }
}
