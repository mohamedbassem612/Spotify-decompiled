package p;

import android.os.Bundle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jcs0 {
    public static final jcs0 a;
    public static final jcs0 b;
    public static final jcs0 c;
    public static final /* synthetic */ jcs0[] d;

    static {
        jcs0 jcs0Var = new jcs0("SUCCESS", 0);
        a = jcs0Var;
        jcs0 jcs0Var2 = new jcs0("ABORT", 1);
        b = jcs0Var2;
        jcs0 jcs0Var3 = new jcs0("REQUEST_FULL_PRICE_OFFER", 2);
        c = jcs0Var3;
        d = new jcs0[]{jcs0Var, jcs0Var2, jcs0Var3};
    }

    public static jcs0 valueOf(String str) {
        return (jcs0) Enum.valueOf(jcs0.class, str);
    }

    public static jcs0[] values() {
        return (jcs0[]) d.clone();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("PAYMENT_RESULT_BUNDLE_KEY", this);
        return bundle;
    }
}
