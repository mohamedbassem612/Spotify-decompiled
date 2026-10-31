package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o670 implements View.OnClickListener, View.OnLongClickListener {
    public final ifl1 a;
    public String b;
    public y570 c;
    public View d;
    public boolean e;

    public o670(ifl1 ifl1Var) {
        ifl1Var.getClass();
        this.a = ifl1Var;
    }

    public final void a() {
        if (this.e) {
            eg.f("Listener is already in use");
        }
    }

    public final void b() {
        if (this.b == null) {
            eg.f("Event name not set");
        } else if (this.c == null) {
            eg.f("Model not set");
        } else {
            if (this.d != null) {
                return;
            }
            eg.f("View not set");
        }
    }

    public final void c(String str) {
        a();
        this.b = str;
    }

    public final void d() {
        a();
        b();
        this.e = true;
        this.d.setFocusable(true);
        this.d.setClickable(true);
        this.d.setOnClickListener(this);
    }

    public final void e() {
        a();
        b();
        this.e = true;
        this.d.setLongClickable(true);
        this.d.setOnLongClickListener(this);
    }

    public final void f(View view) {
        a();
        view.getClass();
        this.d = view;
    }

    public final void g(y570 y570Var) {
        a();
        y570Var.getClass();
        this.c = y570Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(u570.a(this.b, this.c));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.a.d(u570.a(this.b, this.c));
        return true;
    }
}
