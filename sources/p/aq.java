package p;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class aq extends hab0 implements Function0 {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        super(0);
        this.a = sharedPreferences;
        this.b = onSharedPreferenceChangeListener;
    }

    public final Object invoke() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.b);
        }
        return rih1.a;
    }
}
