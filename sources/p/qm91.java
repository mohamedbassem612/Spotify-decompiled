package p;

import android.view.View;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qm91 implements wpw {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final poy0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public qm91(boolean z, qzh qzhVar, Flowable flowable, hj91 hj91Var, up41 up41Var, a78 a78Var) {
        this.a = (byte) 0;
        this.b = z;
        this.d = qzhVar;
        this.e = hj91Var;
        this.f = up41Var;
        this.g = a78Var;
        FlowableMap flowableMapJ = flowable.J(e2x0.O0);
        Function function = Functions.a;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableMapJ.t(function);
        Flowable flowableG = Flowable.g(flowable.j(mo9.Z).J(i2x0.Y), flowableDistinctUntilChangedT, flowable.J(new y281(this, (byte) 6)).t(function), flowableDistinctUntilChangedT.X(new tz01(this, (byte) 26)).s(h2x0.N0), r3x0.O0);
        flowableG.getClass();
        this.c = y3o1.Y(flowableG.t(function), fe91.g, new t491(this, (byte) 5), new pm91(this, (byte) 0), 8);
        this.h = lnn1.h(fe91.h, fe91.i, new pm91(this, (byte) 1));
        this.i = n3o1.q(this).a(v691.U0, v691.V0);
    }

    public static void e(ViewGroup viewGroup) {
        if (viewGroup instanceof o6) {
            ((o6) viewGroup).l();
            return;
        }
        mf20 mf20Var = new mf20(z561.T(d6d1.X0, new i46(viewGroup, (byte) 8)));
        while (mf20Var.hasNext()) {
            e((ViewGroup) ((View) mf20Var.next()));
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (ia00) this.i;
            default:
                return (rqw) this.h;
        }
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                return (kjv) this.h;
            default:
                return (nsw) this.i;
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public qm91(iu30 iu30Var, boolean z, Function0 function0, boolean z2, ArrayList arrayList, ood1 ood1Var) {
        ia00 eih1Var;
        this.a = (byte) 1;
        this.d = iu30Var;
        this.b = z;
        this.e = function0;
        this.f = arrayList;
        this.g = ood1Var;
        this.c = c2p1.o(new qwc1(this, (byte) 6), new t491(this, (byte) 22), (iu30) null, 12);
        if (z2) {
            eih1Var = n3o1.q(this).a(new kgd1(this, (byte) 0), i6d1.h);
        } else {
            eih1Var = new eih1();
        }
        this.h = eih1Var;
        this.i = jch0.j(new kgd1(this, (byte) 1));
    }
}
