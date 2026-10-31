package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u4p0 implements l5r0 {
    public final idd1 X = new idd1(new ivn0(this, 21));
    public final r24 a;
    public final ewx b;
    public final o2p0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final ror g;
    public final w4p0 h;
    public final vu4 i;
    public ViewGroup t;

    public u4p0(r24 r24Var, ewx ewxVar, o2p0 o2p0Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, ror rorVar, w4p0 w4p0Var, vu4 vu4Var) {
        this.a = r24Var;
        this.b = ewxVar;
        this.c = o2p0Var;
        this.d = jly0Var;
        this.e = jly0Var2;
        this.f = jly0Var3;
        this.g = rorVar;
        this.h = w4p0Var;
        this.i = vu4Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ViewGroup getView() {
        ViewGroup viewGroup = this.t;
        if (viewGroup == null) {
            return null;
        }
        if (viewGroup != null) {
            return viewGroup;
        }
        u890.C("rootView");
        throw null;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131625323, viewGroup, false);
        this.t = viewGroup2;
        viewGroup2.setTag(2131430188);
    }

    public final void start() {
        r24 r24Var = this.a;
        m4p0 m4p0Var = (m4p0) r24Var.k;
        if (m4p0Var != null) {
            m4p0Var.start();
        }
        rku rkuVar = (rku) r24Var.i;
        rzo0 rzo0Var = (rzo0) r24Var.a;
        FlowableMap flowableMapJ = Flowable.h((FlowableFilter) rzo0Var.c, (Flowable) rzo0Var.d, yz10.R0).J(new qkn0(rzo0Var, (byte) 5));
        Function function = Functions.a;
        rkuVar.b(Flowable.h(new FlowableOnBackpressureLatest(flowableMapJ.t(function)), ((Flowable) r24Var.d).J(new l7c(r24Var, (byte) 16)).t(function), yi20.O0).c0(Flowable.O(0, Integer.MAX_VALUE), zi20.Z).m(new jpa0(r24Var, (byte) 23)).W((Scheduler) r24Var.e).L((Scheduler) r24Var.f).subscribe(new w090(r24Var, this, (byte) 18)));
    }

    public final void stop() {
        r24 r24Var = this.a;
        ((rku) r24Var.i).a();
        m4p0 m4p0Var = (m4p0) r24Var.k;
        if (m4p0Var != null) {
            m4p0Var.stop();
        }
    }
}
