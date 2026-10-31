package p;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.mobius.MobiusLoop;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/k7c1;", "Lp/hip;", "<init>", "()V", "src_main_java_com_spotify_campaigns_storytelling-storytelling"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class k7c1 extends hip {
    public k7b1 G1;
    public l5b1 H1;
    public q881 I1;
    public rmr J1;
    public t7c1 K1;
    public MobiusLoop.Controller L1;
    public v9c1 M1;

    public final void F0(Bundle bundle) {
        MobiusLoop.Controller controller = this.L1;
        if (controller != null) {
            bundle.putParcelable("model", (Parcelable) controller.a());
        } else {
            u890.C("controller");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0() {
        this.h1 = true;
        MobiusLoop.Controller controller = this.L1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0() {
        MobiusLoop.Controller controller = this.L1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        this.h1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int Y0() {
        Bundle bundle = this.f;
        if (bundle != null) {
            return bundle.getInt("story_index");
        }
        eg.m("story index not found");
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoWhenBranchMatchedException {
        b9c1 b9c1Var;
        k7b1 k7b1Var = this.G1;
        if (k7b1Var == null) {
            u890.C("storyStateProvider");
            throw null;
        }
        l5b1 l5b1Var = this.H1;
        if (l5b1Var == null) {
            u890.C("storyStartConsumer");
            throw null;
        }
        q881 q881Var = this.I1;
        if (q881Var == null) {
            u890.C("storyContainerControl");
            throw null;
        }
        rmr rmrVar = this.J1;
        if (rmrVar == null) {
            u890.C("storyPlayer");
            throw null;
        }
        v9c1 v9c1Var = new v9c1(layoutInflater, viewGroup, k7b1Var, l5b1Var, q881Var, rmrVar);
        k7b1 k7b1Var2 = this.G1;
        if (k7b1Var2 == null) {
            u890.C("storyStateProvider");
            throw null;
        }
        n9c1 n9c1Var = (n9c1) k7b1Var2.invoke(Integer.valueOf(Y0()));
        if (bundle == null) {
            b9c1Var = new b9c1(Y0());
        } else {
            b9c1Var = Build.VERSION.SDK_INT > 33 ? (b9c1) bundle.getParcelable("model", b9c1.class) : (b9c1) bundle.getParcelable("model");
            if (b9c1Var == null) {
                b9c1Var = new b9c1(Y0());
            }
        }
        b9c1 b9c1Var2 = b9c1Var;
        boolean z = n9c1Var instanceof l9c1;
        b9c1 b9c1VarA = b9c1.a(b9c1Var2, z ? a8c1.a : z7c1.a, 0, (kas0) null, (u6c1) null, 29);
        ViewGroup viewGroup2 = v9c1Var.e;
        if (z) {
            int iY0 = Y0();
            a6c1 a6c1Var = ((l9c1) n9c1Var).a;
            kas0 kas0VarB = b9c1VarA.b();
            u6c1 u6c1VarG = b9c1VarA.g();
            if (v9c1Var.h == null) {
                v9c1Var.h = a6c1Var;
                v9c1Var.f.setVisibility(8);
                v9c1Var.g.setVisibility(8);
                v9c1Var.i = false;
                View viewE = a6c1Var.e(rmrVar, q881Var);
                aiq0.a(viewE, new cv70(viewE, a6c1Var, v9c1Var, iY0, (byte) 2));
                viewGroup2.addView(viewE, 0);
                v9c1Var.a(kas0VarB);
                a6c1 a6c1Var2 = v9c1Var.h;
                if (a6c1Var2 != null) {
                    v9c1Var = v9c1Var;
                    a6c1Var2.g(u6c1VarG);
                }
            }
        }
        v9c1Var = v9c1Var;
        this.M1 = v9c1Var;
        t7c1 t7c1Var = this.K1;
        if (t7c1Var == null) {
            u890.C("injector");
            throw null;
        }
        MobiusLoop.Controller controllerA = t7c1Var.a(b9c1VarA);
        this.L1 = controllerA;
        controllerA.c(v9c1Var);
        return viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0() {
        this.h1 = true;
        k7b1 k7b1Var = this.G1;
        if (k7b1Var == null) {
            u890.C("storyStateProvider");
            throw null;
        }
        c921.y(cto1.q(this), (o8n) null, 0, new xba1((n9c1) k7b1Var.invoke(Integer.valueOf(Y0())), (lnm) null, (byte) 14), 3);
        this.M1 = null;
        MobiusLoop.Controller controller = this.L1;
        if (controller != null) {
            controller.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
