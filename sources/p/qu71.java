package p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qu71 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ ima1 d;
    public final /* synthetic */ bma1 e;

    public qu71(ssw0 ssw0Var, String str, vu30 vu30Var, ima1 ima1Var, bma1 bma1Var) {
        this.a = ssw0Var;
        this.b = str;
        this.c = vu30Var;
        this.d = ima1Var;
        this.e = bma1Var;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ssw0 ssw0Var = this.a;
        if (smo1.u(ssw0Var) && u890.j(this.b, str)) {
            if (!sharedPreferences.contains(str)) {
                ssw0Var.l(new cma1(2, (Object) null));
            } else {
                Object objInvoke = this.c.invoke(this.d, this.e);
                ssw0Var.l(new cma1(objInvoke == null ? 3 : 1, objInvoke));
            }
        }
    }
}
