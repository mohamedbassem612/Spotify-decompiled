package p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.transcript.commons.views.ElementContainer;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomViewArea;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a901 implements h8l, i060, o5s {
    public final r4u X;
    public final View a;
    public final cir0 b;
    public final e7q c;
    public final sma1 d;
    public final p901 e;
    public final ElementContainer f;
    public final FrameLayout g;
    public Consumer h;
    public final idd1 i;
    public final dtw t;

    public a901(View view, cir0 cir0Var, e7q e7qVar, cx0 cx0Var, xwt0 xwt0Var, sma1 sma1Var, p901 p901Var) {
        this.a = view;
        this.b = cir0Var;
        this.c = e7qVar;
        this.d = sma1Var;
        this.e = p901Var;
        this.f = (ElementContainer) view.findViewById(2131431505);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131430291);
        this.g = frameLayout;
        ZoomViewArea zoomViewAreaFindViewById = view.findViewById(2131431510);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(2131431469);
        idd1 idd1Var = new idd1(new vwz0(this, (byte) 4));
        this.i = idd1Var;
        w801 w801Var = w801.b;
        this.X = r4u.c(new r4u[]{r4u.d(new mka((byte) 22), r4u.a(new s6z0(this, (byte) 4))), r4u.d(u3x0.e, r4u.a(new zgz0(this, (byte) 1))), r4u.d(a4x0.e, r4u.a(new m7y0(this, (byte) 5))), r4u.d(b4x0.d, r4u.a(new uqv0(this, (byte) 15)))});
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(view.getContext(), frameLayout, f6o1.A(cx0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        k8p1.o(frameLayout, dtwVarD.w);
        this.t = dtwVarD;
        zoomViewAreaFindViewById.setZoomParentView(((dtw) idd1Var.getValue()).w);
        rwq0.s(view, new f2z0(this, (byte) 16));
        k8p1.o(frameLayout2, mhc.b(view.getContext(), frameLayout2, f6o1.A(xwt0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new vwt0(p901Var.a, !p901Var.b), (ipb1) null, 112).w);
    }

    public final Connection L(Consumer consumer) {
        this.h = consumer;
        return new n1b0(this, (byte) 21);
    }

    public final void b(f060 f060Var) {
        if (f060Var.equals(b060.a)) {
            Consumer consumer = this.h;
            if (consumer != null) {
                consumer.accept(b901.a);
                return;
            } else {
                u890.C("consumer");
                throw null;
            }
        }
        if (f060Var.equals(d060.a)) {
            Consumer consumer2 = this.h;
            if (consumer2 != null) {
                consumer2.accept(c901.a);
                return;
            } else {
                u890.C("consumer");
                throw null;
            }
        }
        if (!f060Var.equals(e060.a)) {
            eg.o();
            return;
        }
        Consumer consumer3 = this.h;
        if (consumer3 != null) {
            consumer3.accept(d901.a);
        } else {
            u890.C("consumer");
            throw null;
        }
    }

    public final Object getView() {
        return this.a;
    }

    public final void onPause(iac0 iac0Var) {
        Window window;
        Context context = this.a.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    public final void onResume(iac0 iac0Var) {
        Window window;
        Context context = this.a.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.addFlags(128);
    }

    public final void start() {
        this.b.e().getLifecycle().a(this);
    }

    public final void stop() {
        Window window;
        this.b.e().getLifecycle().d(this);
        Context context = this.a.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }
}
