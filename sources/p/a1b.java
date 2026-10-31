package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.mobius.MobiusLoop;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/a1b;", "Lp/hip;", "Lp/ug30;", "<init>", "()V", "src_main_java_com_spotify_blend_invitation-invitation"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class a1b extends hip implements ug30 {
    public d1b G1;
    public gw70 H1;
    public jly0 I1;
    public ff4 J1;
    public MobiusLoop.Controller K1;
    public final gn10 L1 = mno1.c;

    public final String A(Context context) {
        return context.getString(2131954624);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0() {
        this.h1 = true;
        MobiusLoop.Controller controller = this.K1;
        if (controller != null) {
            controller.stop();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0() {
        this.h1 = true;
        MobiusLoop.Controller controller = this.K1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getL1() {
        return this.L1;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.f0());
    }

    public final String s() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.f0().c;
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gw70 gw70Var = this.H1;
        if (gw70Var == null) {
            u890.C("imageLoader");
            throw null;
        }
        ff4 ff4Var = this.J1;
        if (ff4Var == null) {
            u890.C("properties");
            throw null;
        }
        g1b g1bVar = new g1b(layoutInflater, viewGroup, gw70Var, ff4Var);
        d1b d1bVar = this.G1;
        if (d1bVar == null) {
            u890.C("injector");
            throw null;
        }
        jly0 jly0Var = this.I1;
        if (jly0Var == null) {
            u890.C("initialModelProvider");
            throw null;
        }
        MobiusLoop.Controller controllerA = d1bVar.a((e1b) jly0Var.get());
        this.K1 = controllerA;
        controllerA.c(g1bVar);
        int i = kgr0.T0;
        return xyn1.z(g1bVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0() {
        this.h1 = true;
        MobiusLoop.Controller controller = this.K1;
        if (controller != null) {
            controller.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
