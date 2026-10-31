package p;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ProgressBar;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kd40 implements Connectable, c7k1 {
    public final View a;
    public final t8h1 b;
    public final Button c;
    public final Button d;
    public final Button e;
    public final Button f;
    public final Button g;
    public final ProgressBar h;
    public ViewPropertyAnimator i;
    public final AtomicBoolean t;

    public kd40(hd40 hd40Var, View view, t8h1 t8h1Var) {
        this.a = view;
        this.b = t8h1Var;
        Button button = (Button) view.findViewById(2131428988);
        this.c = button;
        Button button2 = (Button) view.findViewById(2131428989);
        this.d = button2;
        Button button3 = (Button) view.findViewById(2131428990);
        this.e = button3;
        this.f = (Button) view.findViewById(2131428991);
        this.g = (Button) view.findViewById(2131428992);
        this.h = (ProgressBar) view.findViewById(2131429817);
        this.t = new AtomicBoolean(false);
        hd40Var = hd40Var == null ? dd40.a : hd40Var;
        if (hd40Var.equals(ad40.a)) {
            e130.q(new View[]{button2, button3});
        } else if (hd40Var.equals(bd40.a)) {
            e130.q(new View[]{button, button3});
        } else if (hd40Var.equals(cd40.a)) {
            e130.q(new View[]{button2, button});
        }
    }

    public final Connection L(Consumer consumer) {
        this.c.setOnClickListener(new jd40(this, consumer, (byte) 0));
        this.d.setOnClickListener(new jd40(this, consumer, (byte) 1));
        this.e.setOnClickListener(new jd40(this, consumer, (byte) 2));
        this.f.setOnClickListener(new jd40(this, consumer, (byte) 3));
        this.g.setOnClickListener(new jd40(this, consumer, (byte) 4));
        return new rp(this, (byte) 28);
    }

    @Override // p.c7k1
    public final String b() {
        return this.a.getContext().getString(2131962530);
    }

    @Override // p.c7k1
    public final void c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.b, yon1.G1("SIGNUP_GENDER", "signup/gender", 1890, "signup"));
    }

    public final void d(Consumer consumer, View view, hd40 hd40Var, View... viewArr) {
        AtomicBoolean atomicBoolean = this.t;
        atomicBoolean.set(true);
        c8b1 c8b1Var = new c8b1(2);
        c8b1Var.a(view);
        c8b1Var.b(viewArr);
        ArrayList arrayList = c8b1Var.a;
        for (View view2 : p7h.M(arrayList.toArray(new View[arrayList.size()]))) {
            view2.animate().setListener(null);
            view2.clearAnimation();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        for (View view3 : viewArr) {
            view3.animate().alpha(0.4f).setDuration(300L).start();
        }
        atomicBoolean.set(false);
        ViewPropertyAnimator listener = view.animate().alpha(1.0f).setDuration(300L).setListener(new p3f1(this, consumer, hd40Var));
        listener.start();
        this.i = listener;
    }

    @Override // p.c7k1
    public final void a() {
    }
}
