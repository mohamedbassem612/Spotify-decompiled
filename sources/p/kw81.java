package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class kw81 implements j4m, iac0 {
    public f4h1 a;
    public final kdn0 b = new kdn0(l3r.a);
    public final tac0 c;
    public final e72 d;
    public final ek2 e;

    public kw81() {
        tac0 tac0Var = new tac0(this, true);
        this.c = tac0Var;
        e72 e72Var = new e72(this, (byte) 9);
        this.d = e72Var;
        tac0Var.a(e72Var);
        this.e = new ek2(this, (byte) 20);
    }

    public final View a() {
        f4h1 f4h1Var = this.a;
        if (f4h1Var != null) {
            return (View) f4h1Var.getView();
        }
        return null;
    }

    public final void b(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar) {
        this.a = f(context, viewGroup, layoutInflater, jhlVar);
        jhlVar.c.a(this.e);
        this.b.m(l3r.c);
    }

    public final f4h1 c() {
        return this.a;
    }

    public final void d() {
        this.b.m(l3r.a);
        w8c0 w8c0Var = w8c0.a;
        tac0 tac0Var = this.c;
        tac0Var.i(w8c0Var);
        tac0Var.d(this.d);
        this.a = null;
    }

    public final ymd0 e() {
        return this.b;
    }

    public abstract f4h1 f(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar);

    public final x8c0 getLifecycle() {
        return this.c;
    }
}
