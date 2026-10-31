package p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class bq implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ iq b;
    public final /* synthetic */ SharedPreferences c;

    public bq(ssw0 ssw0Var, iq iqVar, SharedPreferences sharedPreferences) {
        this.a = ssw0Var;
        this.b = iqVar;
        this.c = sharedPreferences;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.l(this.b.d(this.c));
    }
}
