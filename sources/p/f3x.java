package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f3x {
    public final FlowableMap a;
    public final kt91 b;
    public final g1b1 c;
    public final Resources d;
    public final xu4 e;
    public final vku f = new vku();

    public f3x(FlowableMap flowableMap, kt91 kt91Var, g1b1 g1b1Var, Resources resources, xu4 xu4Var) {
        this.a = flowableMap;
        this.b = kt91Var;
        this.c = g1b1Var;
        this.d = resources;
        this.e = xu4Var;
    }

    public final void a() {
        this.f.a(this.a.t(mpi1.a1).subscribe(new cfs(this, (byte) 18)));
    }
}
