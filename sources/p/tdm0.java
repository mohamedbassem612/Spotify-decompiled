package p;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tdm0 extends p0i {
    public Function0 d;
    public eem0 e;
    public long f;
    public final View g;
    public final qdm0 h;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public tdm0(Function0 function0, eem0 eem0Var, long j, View view, flb0 flb0Var, wat watVar, UUID uuid, o95 o95Var, c9n c9nVar) throws NoWhenBranchMatchedException {
        super(new ContextThemeWrapper(view.getContext(), 2132017529), 0);
        this.d = function0;
        this.e = eem0Var;
        this.f = j;
        this.g = view;
        Window window = getWindow();
        if (window == null) {
            eg.m("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        d55.i(window, false);
        qdm0 qdm0Var = new qdm0(getContext(), window);
        qdm0Var.setTag(2131428157, "Dialog:" + uuid);
        qdm0Var.setClipChildren(false);
        qdm0Var.setElevation(watVar.X0(8.0f));
        qdm0Var.setOutlineProvider(new b4u((byte) 1));
        this.h = qdm0Var;
        setContentView((View) qdm0Var);
        x9p1.p(qdm0Var, x9p1.h(view));
        lap1.o(qdm0Var, lap1.k(view));
        hm5.J(qdm0Var, hm5.w(view));
        d(this.d, this.e, this.f, flb0Var);
        csj1 csj1Var = new csj1(window, window.getDecorView());
        this.e.getClass();
        csj1Var.g(a8o.A(this.f));
        this.e.getClass();
        csj1Var.f(a8o.A(this.f));
        this.c.a(this, new sdm0(this.e.a(), c9nVar, o95Var, new g030(this, (byte) 18)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d(Function0 function0, eem0 eem0Var, long j, flb0 flb0Var) throws NoWhenBranchMatchedException {
        this.d = function0;
        this.e = eem0Var;
        this.f = j;
        eem0Var.getClass();
        int i = 1;
        boolean zN = t6p1.n(1, a8o.B(this.g));
        Window window = getWindow();
        window.getClass();
        window.setFlags(zN ? 8192 : -8193, 8192);
        int iOrdinal = flb0Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            eg.o();
            return;
        }
        this.h.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.d.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
