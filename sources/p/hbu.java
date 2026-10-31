package p;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hbu implements f4h1 {
    public final xau X;
    public final MobiusLoop.Controller a;
    public final v7m0 b;
    public final ku1 c;
    public final n6s d;
    public final xjl e;
    public final cbu f;
    public final abu g;
    public final gg11 h;
    public final View i;
    public final rku t = new rku();

    public hbu(cir0 cir0Var, MobiusLoop.Controller controller, v7m0 v7m0Var, ku1 ku1Var, n6s n6sVar, xjl xjlVar, cbu cbuVar, abu abuVar, gg11 gg11Var, efr efrVar, iac0 iac0Var, o5s o5sVar, ComposeView composeView) {
        this.a = controller;
        this.b = v7m0Var;
        this.c = ku1Var;
        this.d = n6sVar;
        this.e = xjlVar;
        this.f = cbuVar;
        this.g = abuVar;
        this.h = gg11Var;
        this.i = composeView;
        this.X = abuVar instanceof xau ? (xau) abuVar : null;
        cir0Var.e().getLifecycle().a(new gbu(this));
        iac0Var.getLifecycle().a(o5sVar);
    }

    public final Object getView() {
        return this.i;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        qau qauVar = (qau) this.a.a();
        Integer num = qauVar.a;
        if (num == null) {
            num = qauVar.b;
        }
        bundle.putParcelable("discoveryFeedModel", qau.a(qauVar, null, num, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048532));
        return bundle;
    }

    public final void start() {
        xau xauVar = this.X;
        if (xauVar != null) {
        }
        cbu cbuVar = this.f;
        abu abuVar = this.g;
        cbuVar.a = abuVar;
        this.e.d(abuVar.a(), abuVar.getContextUri());
        ku1 ku1Var = this.c;
        MobiusLoop.Controller controller = this.a;
        controller.c(ku1Var);
        controller.start();
        this.d.a.onNext(Boolean.TRUE);
    }

    public final void stop() {
        xau xauVar = this.X;
        if (xauVar != null) {
        }
        MobiusLoop.Controller controller = this.a;
        controller.stop();
        controller.disconnect();
        controller.b(qau.a((qau) controller.a(), null, null, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048551));
        this.d.a.onNext(Boolean.FALSE);
        this.t.a();
    }
}
