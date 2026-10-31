package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l8v extends z6p1 {
    public final byte c;
    public k8k1 d;
    public final a6n e = new a6n(this, (byte) 16);
    public final /* synthetic */ m8v f;

    /* JADX WARN: Multi-variable type inference failed */
    public l8v(m8v m8vVar, int i) {
        this.f = m8vVar;
        this.c = i;
    }

    public final void A() {
        this.f.postDelayed(this.e, 160L);
    }

    public final void B(View view, int i) {
        ((j8v) view.getLayoutParams()).c = false;
        int i2 = this.c == 3 ? 5 : 3;
        m8v m8vVar = this.f;
        View viewD = m8vVar.d(i2);
        if (viewD != null) {
            m8vVar.b(viewD);
        }
    }

    public final void C(int i) {
        this.f.r(this.d.t, i);
    }

    public final void D(View view, int i, int i2) {
        int width = view.getWidth();
        m8v m8vVar = this.f;
        float width2 = (m8vVar.a(view, 3) ? i + width : m8vVar.getWidth() - i) / width;
        m8vVar.o(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        m8vVar.invalidate();
    }

    public final void E(View view, float f, float f2) {
        int i;
        float f3 = ((j8v) view.getLayoutParams()).b;
        int width = view.getWidth();
        m8v m8vVar = this.f;
        if (m8vVar.a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = m8vVar.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.d.p(i, view.getTop());
        m8vVar.invalidate();
    }

    public final boolean H(View view, int i) {
        if (!m8v.k(view)) {
            return false;
        }
        byte b = this.c;
        m8v m8vVar = this.f;
        return m8vVar.a(view, b) && m8vVar.f(view) == 0;
    }

    public final int u(View view, int i) {
        m8v m8vVar = this.f;
        if (m8vVar.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = m8vVar.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public final int x(View view) {
        if (m8v.k(view)) {
            return view.getWidth();
        }
        return 0;
    }

    public final void z(int i, int i2) {
        int i3 = i & 1;
        m8v m8vVar = this.f;
        View viewD = i3 == 1 ? m8vVar.d(3) : m8vVar.d(5);
        if (viewD == null || m8vVar.f(viewD) != 0) {
            return;
        }
        this.d.b(viewD, i2);
    }
}
