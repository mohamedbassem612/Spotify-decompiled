package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uuj implements j4m {
    public final ymd0 a;
    public final iu30 b;
    public f4h1 c;
    public View d;
    public z11 e;
    public final kdn0 f = new kdn0(l3r.a);

    public uuj(ymd0 ymd0Var, iu30 iu30Var) {
        this.a = ymd0Var;
        this.b = iu30Var;
    }

    public final View a() {
        return this.d;
    }

    public final void b(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, jhl jhlVar) {
        f4h1 f4h1Var = (f4h1) this.b.invoke(context);
        this.c = f4h1Var;
        this.d = (View) f4h1Var.getView();
        jhlVar.c.a(new e72(f4h1Var, (byte) 2));
        z11 z11Var = new z11(this, (byte) 9);
        this.e = z11Var;
        this.a.g(z11Var);
    }

    public final f4h1 c() {
        return this.c;
    }

    public final void d() {
        z11 z11Var = this.e;
        if (z11Var != null) {
            this.a.k(z11Var);
        }
        this.e = null;
        f4h1 f4h1Var = this.c;
        if (f4h1Var != null) {
            f4h1Var.stop();
        }
        this.c = null;
        this.d = null;
        this.f.m(l3r.a);
    }

    public final ymd0 e() {
        return this.f;
    }

    public final Bundle serialize() {
        return null;
    }
}
