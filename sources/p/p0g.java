package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p0g {
    public final vqv0 a;
    public View e;
    public byte d = 0;
    public final o0g b = new o0g((byte) 0);
    public final ArrayList c = new ArrayList();

    public p0g(vqv0 vqv0Var) {
        this.a = vqv0Var;
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        vqv0 vqv0Var = this.a;
        int iP = i < 0 ? vqv0Var.p() : d(i);
        this.b.H(iP, z);
        if (z) {
            this.c.add(view);
            vqv0Var.s(view);
        }
        vqv0Var.j(view, iP, layoutParams);
    }

    public final View b(int i) {
        return this.a.o(d(i));
    }

    public final int c() {
        return this.a.p() - this.c.size();
    }

    public final int d(int i) {
        if (i < 0) {
            return -1;
        }
        int iP = this.a.p();
        int i2 = i;
        while (i2 < iP) {
            o0g o0gVar = this.b;
            int iZ = i - (i2 - o0gVar.z(i2));
            if (iZ == 0) {
                while (o0gVar.C(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iZ;
        }
        return -1;
    }

    public final int e(View view) {
        int iR = this.a.r(view);
        if (iR != -1) {
            o0g o0gVar = this.b;
            if (!o0gVar.C(iR)) {
                return iR - o0gVar.z(iR);
            }
        }
        return -1;
    }

    public final void f(int i) {
        vqv0 vqv0Var = this.a;
        byte b = this.d;
        if (b == 1) {
            eg.m("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            eg.m("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iD = d(i);
            View viewO = vqv0Var.o(iD);
            if (viewO == null) {
                return;
            }
            this.d = (byte) 1;
            this.e = viewO;
            if (this.b.L(iD)) {
                g(viewO);
            }
            vqv0Var.x(iD);
        } finally {
            this.d = (byte) 0;
            this.e = null;
        }
    }

    public final void g(View view) {
        if (this.c.remove(view)) {
            this.a.u(view);
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
