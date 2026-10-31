package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class h471 extends g471 {
    public final zg0 a;
    public final c380 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public h471(zg0 zg0Var, c380 c380Var, String str, String str2, String str3, int i) {
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        String str4 = (i & 32) == 0 ? "android.intent.category.DEFAULT" : null;
        this.a = zg0Var;
        this.b = c380Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public boolean f() {
        return true;
    }

    public Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        intent.putExtra("sms_body", l0p1.j(x871Var.a, x871Var.b.a));
        return intent;
    }

    public final Object h(x871 x871Var, df71 df71Var) {
        Intent intentA = this.a.a(this);
        if (intentA != null) {
            return g(intentA, x871Var, df71Var);
        }
        jah.h("No resolvable intent found for destination ", this, ". At this stage, the intent must be resolvable.");
        return null;
    }
}
