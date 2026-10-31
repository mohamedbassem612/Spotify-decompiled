package p;

import android.app.Activity;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vu1 {
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;
    public final Optional d;
    public final Optional e;
    public volatile String f = "";

    public vu1(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var, mhc mhcVar, Optional optional, Optional optional2, Flowable flowable) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
        this.d = optional;
        this.e = optional2;
        new FlowableTake(flowable).subscribe(new tg(this, (byte) 10));
    }

    public static /* synthetic */ void b(vu1 vu1Var, List list, String str, String str2, tv80 tv80Var, dy1 dy1Var, int i) {
        if ((i & 8) != 0) {
            tv80Var = null;
        }
        tv80 tv80Var2 = tv80Var;
        if ((i & 16) != 0) {
            dy1Var = ay1.a;
        }
        vu1Var.a(list, str, str2, tv80Var2, dy1Var, (i & 32) == 0);
    }

    public final void a(List list, String str, String str2, tv80 tv80Var, gy1 gy1Var, boolean z) {
        mhc.g(str, list, str2);
        Bundle bundle = new Bundle();
        bundle.putString("username", this.f);
        bundle.putString("source_view_uri", str);
        bundle.putString("source_context_uri", str2);
        bundle.putStringArrayList("item_uris", new ArrayList<>(list));
        bundle.putParcelable("use_case", gy1Var);
        bundle.putBoolean("force_expanded", z);
        bundle.putParcelable("interaction_logging_result", tv80Var);
        p1f0 p1f0VarW = rrn1.w(nik1.F1.a);
        p1f0VarW.B(tv80Var);
        this.a.runOnUiThread(new uu1(this, p1f0VarW.h(), bundle, (byte) 0));
    }
}
