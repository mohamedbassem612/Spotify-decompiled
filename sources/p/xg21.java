package p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xg21 {
    public final dc31 a;
    public final o860 b;
    public final kt91 c;
    public final uz5 d;
    public final fwn0 e;
    public final Context f;

    public xg21(dc31 dc31Var, o860 o860Var, kt91 kt91Var, uz5 uz5Var, fwn0 fwn0Var, Context context) {
        this.a = dc31Var;
        this.b = o860Var;
        this.c = kt91Var;
        this.d = uz5Var;
        this.e = fwn0Var;
        this.f = context;
    }

    public final void a(String str) {
        Intent intentA = this.e.a(new dwn0(pcf.d(6, str, (String) null), "", false, false, 0, 0, false, null, null, null));
        intentA.putExtra("is_internal_navigation", true);
        this.d.a(intentA);
    }
}
