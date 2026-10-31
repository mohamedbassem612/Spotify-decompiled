package p;

import android.graphics.Rect;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class esl1 {
    public static final hsl1 b = new dmj1((byte) 8).b().a.a().a.b().a.c();
    public final hsl1 a;

    public esl1(hsl1 hsl1Var) {
        this.a = hsl1Var;
    }

    public hsl1 a() {
        return this.a;
    }

    public hsl1 b() {
        return this.a;
    }

    public hsl1 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esl1)) {
            return false;
        }
        esl1 esl1Var = (esl1) obj;
        return t() == esl1Var.t() && s() == esl1Var.s() && n8p1.o(n(), esl1Var.n()) && n8p1.o(l(), esl1Var.l()) && n8p1.o(h(), esl1Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public hju h() {
        return null;
    }

    public int hashCode() {
        return n8p1.r(new Object[]{Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h()});
    }

    public nk80 i(int i) {
        return nk80.e;
    }

    public nk80 j(int i) {
        if ((i & 8) == 0) {
            return nk80.e;
        }
        hhg1.n("Unable to query the maximum insets for IME");
        return null;
    }

    public nk80 k() {
        return n();
    }

    public nk80 l() {
        return nk80.e;
    }

    public nk80 m() {
        return n();
    }

    public nk80 n() {
        return nk80.e;
    }

    public nk80 o() {
        return n();
    }

    public hsl1 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(hsl1 hsl1Var) {
    }

    public void p(View view) {
    }

    public void v(dku dkuVar) {
    }

    public void w(nk80[] nk80VarArr) {
    }

    public void x(nk80 nk80Var) {
    }

    public void y(hsl1 hsl1Var) {
    }

    public void z(nk80 nk80Var) {
    }
}
