package p;

import android.R;
import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bxb0 {
    public final i8h1 a;
    public final bfd b;
    public final dg30 c;
    public final kt91 d;
    public final rm5 e;
    public final ic9 f;
    public final q8n g;
    public final q8n h;

    public bxb0(i8h1 i8h1Var, bfd bfdVar, dg30 dg30Var, kt91 kt91Var, rm5 rm5Var, ic9 ic9Var, q8n q8nVar, q8n q8nVar2) {
        this.a = i8h1Var;
        this.b = bfdVar;
        this.c = dg30Var;
        this.d = kt91Var;
        this.e = rm5Var;
        this.f = ic9Var;
        this.g = q8nVar;
        this.h = q8nVar2;
    }

    public final void a(String str, String str2) {
        uvk0 uvk0Var = new uvk0(str2);
        dt90 dt90Var = new dt90((Object) this, (Object) uvk0Var, (Object) str, (byte) 3);
        x680 x680Var = new x680(this, uvk0Var, (byte) 23);
        Activity activity = (Activity) this.e.a;
        String string = activity.getString(2131958537);
        String string2 = activity.getString(R.string.cancel);
        mw40 mw40VarT = yoi1.T(activity, activity.getString(2131958539), activity.getString(2131958538));
        oad oadVar = new oad(dt90Var, (byte) 5);
        mw40VarT.a = string;
        mw40VarT.c = oadVar;
        oad oadVar2 = new oad(x680Var, (byte) 6);
        mw40VarT.b = string2;
        mw40VarT.d = oadVar2;
        mw40VarT.e = false;
        mw40VarT.b().b();
    }
}
