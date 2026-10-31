package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mh20 extends zf30 implements ug30, o6r0, jik1 {
    public final nay F1;
    public MobiusLoop.Controller G1;
    public g8e0 H1;
    public r7m0 I1;
    public final gn10 J1 = mno1.y;

    public mh20(nay nayVar) {
        this.F1 = nayVar;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    public final void D0() {
        MobiusLoop.Controller controller = this.G1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.G1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.J1;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.Q3());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.Q3();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        return oap1.i(O0().getString("uri", ""));
    }

    @Override // p.ug30
    public final String s() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.Q3().a;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g8e0 g8e0Var = this.H1;
        if (g8e0Var == null) {
            u890.C("viewConnectable");
            throw null;
        }
        viewGroup.getClass();
        View view = (View) g8e0Var.a(viewGroup);
        gas gasVar = this.I1;
        if (gasVar == null) {
            u890.C("provider");
            throw null;
        }
        MobiusLoop.Controller controllerA = gasVar.a();
        this.G1 = controllerA;
        g8e0 g8e0Var2 = this.H1;
        if (g8e0Var2 != null) {
            controllerA.c(g8e0Var2);
            return view;
        }
        u890.C("viewConnectable");
        throw null;
    }

    public final void y0() {
        MobiusLoop.Controller controller = this.G1;
        if (controller != null) {
            if (controller == null) {
                u890.C("controller");
                throw null;
            }
            controller.disconnect();
        }
        ((zf30) this).h1 = true;
    }
}
