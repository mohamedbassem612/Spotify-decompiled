package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.functions.Producer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y6e0 implements s6t0, Producer {
    public final /* synthetic */ Function0 a;

    @Override // p.s6t0
    public r6t0 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        j6t0 j6t0Var = (j6t0) this.a.invoke();
        j6t0Var.c(context, layoutInflater, viewGroup);
        if (bundle != null) {
            lqb1 lqb1Var = j6t0Var instanceof lqb1 ? (lqb1) j6t0Var : null;
            if (lqb1Var != null) {
                lqb1Var.d(bundle);
            }
        }
        return new x6e0(j6t0Var);
    }

    @Override // com.spotify.mobius.functions.Producer
    public /* synthetic */ Object get() {
        return this.a.invoke();
    }
}
