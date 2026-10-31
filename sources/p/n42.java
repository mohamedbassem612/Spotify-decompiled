package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n42 extends t2u implements o6r0, jik1, Connectable {
    public final g21 V1;
    public g52 W1;
    public gw70 X1;
    public u961 Y1;
    public MobiusLoop.Controller Z1;
    public final lik1 a2;

    public n42(g21 g21Var) {
        this.V1 = g21Var;
        e1(0, 2132018159);
        this.a2 = nik1.g2;
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.Z1;
        if (controller != null) {
            controller.stop();
        } else {
            u890.C("loopController");
            throw null;
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.Z1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("loopController");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        o52 parcelable = O0().getParcelable("ad-data");
        if (parcelable == null) {
            eg.m("AdsDsaViewData required");
            return;
        }
        g52 g52Var = this.W1;
        if (g52Var == null) {
            u890.C("loopFactory");
            throw null;
        }
        h52 h52Var = new h52(8064, parcelable.a, parcelable.b, parcelable.d, parcelable.c, parcelable.f, parcelable.e, parcelable.g);
        e52 e52Var = new e52();
        v42 v42Var = g52Var.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        u961 u961Var = v42Var.a;
        subtypeEffectHandlerBuilderC.g(q42.class, new t42(u961Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(s42.class, new t42(u961Var, (byte) 1));
        u42 u42Var = new u42(v42Var, (byte) 0);
        Scheduler scheduler = v42Var.b;
        subtypeEffectHandlerBuilderC.d(r42.class, u42Var, scheduler);
        subtypeEffectHandlerBuilderC.d(p42.class, new u42(v42Var, (byte) 1), scheduler);
        MobiusLoop.Controller controllerB = Mobius.b(Mobius.d(e52Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).b(new f52(g52Var)), h52Var, new d52(), MainThreadWorkRunner.a());
        this.Z1 = controllerB;
        controllerB.c(this);
    }

    public final Connection L(Consumer consumer) {
        u961 u961Var = this.Y1;
        if (u961Var != null) {
            u961Var.c = new m42(consumer, (byte) 0);
            return new rp(this, (byte) 2);
        }
        u890.C("adsDsaView");
        throw null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("ADSDISPLAY_DSA", "adsdisplay/dsa", 28, "adsdisplay");
    }

    public final lik1 getViewUri() {
        return this.a2;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextP0 = P0();
        gw70 gw70Var = this.X1;
        if (gw70Var == null) {
            u890.C("imageLoader");
            throw null;
        }
        u961 u961Var = new u961();
        u961Var.a = gw70Var;
        u961Var.b = v8r.q(new h52(7167, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null));
        u961Var.c = ny1.Y;
        ComposeView composeView = new ComposeView(contextP0, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(267380402, new ab(u961Var, (byte) 27), true));
        u961Var.d = composeView;
        this.Y1 = u961Var;
        return (ComposeView) u961Var.d;
    }

    public final void z0() {
        super.z0();
        MobiusLoop.Controller controller = this.Z1;
        if (controller != null) {
            controller.disconnect();
        } else {
            u890.C("loopController");
            throw null;
        }
    }
}
