package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fda1 implements ne41 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ven0 b;

    public fda1(String str, ven0 ven0Var) {
        this.a = str;
        this.b = ven0Var;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(this.a, (String) ((Function0) this.b.getValue()).invoke());
        return bundle;
    }
}
