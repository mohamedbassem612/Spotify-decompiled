package androidx.glance.appwidget.protobuf;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import p.czh0;
import p.f290;
import p.fhc;
import p.j290;
import p.ngc;
import p.qm41;
import p.sz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d {
    public final ngc a;
    public int b;
    public int c;
    public int d = 0;

    public d(ngc ngcVar) {
        Charset charset = j290.a;
        this.a = ngcVar;
        ngcVar.b = this;
    }

    public static d a(ngc ngcVar) {
        d dVar = (d) ngcVar.b;
        return dVar != null ? dVar : new d(ngcVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public static void x(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public static void y(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public final int b() {
        int iW = this.d;
        if (iW != 0) {
            this.b = iW;
            this.d = 0;
        } else {
            iW = this.a.w();
            this.b = iW;
        }
        return (iW == 0 || iW == this.c) ? Alert.DURATION_SHOW_INDEFINITELY : iW >>> 3;
    }

    public final void c(Object obj, qm41 qm41Var, sz00 sz00Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            qm41Var.h(obj, this, sz00Var);
            if (this.b != this.c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void d(Object obj, qm41 qm41Var, sz00 sz00Var) throws InvalidProtocolBufferException {
        ngc ngcVar = this.a;
        int iX = ngcVar.x();
        if (ngcVar.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iG = ngcVar.g(iX);
        ngcVar.a++;
        qm41Var.h(obj, this, sz00Var);
        ngcVar.a(0);
        ngcVar.a--;
        ngcVar.f(iG);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void e(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Boolean.valueOf(ngcVar.h()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Boolean.valueOf(ngcVar.h()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final fhc f() throws InvalidProtocolBufferException {
        w(2);
        return this.a.i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void g(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        if ((this.b & 7) != 2) {
            czh0.d();
            return;
        }
        do {
            f290Var.add(f());
            ngc ngcVar = this.a;
            if (ngcVar.e()) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void h(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 1) {
            do {
                f290Var.add(Double.valueOf(ngcVar.j()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iX = ngcVar.x();
        y(iX);
        int iD = ngcVar.d() + iX;
        do {
            f290Var.add(Double.valueOf(ngcVar.j()));
        } while (ngcVar.d() < iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void i(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Integer.valueOf(ngcVar.k()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Integer.valueOf(ngcVar.k()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void j(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 2) {
            int iX = ngcVar.x();
            x(iX);
            int iD = ngcVar.d() + iX;
            do {
                f290Var.add(Integer.valueOf(ngcVar.l()));
            } while (ngcVar.d() < iD);
            return;
        }
        if (i != 5) {
            czh0.d();
            return;
        }
        do {
            f290Var.add(Integer.valueOf(ngcVar.l()));
            if (ngcVar.e()) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void k(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 1) {
            do {
                f290Var.add(Long.valueOf(ngcVar.m()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iX = ngcVar.x();
        y(iX);
        int iD = ngcVar.d() + iX;
        do {
            f290Var.add(Long.valueOf(ngcVar.m()));
        } while (ngcVar.d() < iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void l(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 2) {
            int iX = ngcVar.x();
            x(iX);
            int iD = ngcVar.d() + iX;
            do {
                f290Var.add(Float.valueOf(ngcVar.n()));
            } while (ngcVar.d() < iD);
            return;
        }
        if (i != 5) {
            czh0.d();
            return;
        }
        do {
            f290Var.add(Float.valueOf(ngcVar.n()));
            if (ngcVar.e()) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void m(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Integer.valueOf(ngcVar.o()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Integer.valueOf(ngcVar.o()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void n(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Long.valueOf(ngcVar.p()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Long.valueOf(ngcVar.p()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void o(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 2) {
            int iX = ngcVar.x();
            x(iX);
            int iD = ngcVar.d() + iX;
            do {
                f290Var.add(Integer.valueOf(ngcVar.q()));
            } while (ngcVar.d() < iD);
            return;
        }
        if (i != 5) {
            czh0.d();
            return;
        }
        do {
            f290Var.add(Integer.valueOf(ngcVar.q()));
            if (ngcVar.e()) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void p(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 1) {
            do {
                f290Var.add(Long.valueOf(ngcVar.r()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iX = ngcVar.x();
        y(iX);
        int iD = ngcVar.d() + iX;
        do {
            f290Var.add(Long.valueOf(ngcVar.r()));
        } while (ngcVar.d() < iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void q(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Integer.valueOf(ngcVar.s()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Integer.valueOf(ngcVar.s()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void r(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Long.valueOf(ngcVar.t()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Long.valueOf(ngcVar.t()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void s(f290 f290Var, boolean z) throws InvalidProtocolBufferException {
        String strU;
        int iW;
        if ((this.b & 7) != 2) {
            czh0.d();
            return;
        }
        do {
            ngc ngcVar = this.a;
            if (z) {
                w(2);
                strU = ngcVar.v();
            } else {
                w(2);
                strU = ngcVar.u();
            }
            f290Var.add(strU);
            if (ngcVar.e()) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void t(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Integer.valueOf(ngcVar.x()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Integer.valueOf(ngcVar.x()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void u(f290 f290Var) throws InvalidProtocolBufferException {
        int iW;
        int i = this.b & 7;
        ngc ngcVar = this.a;
        if (i == 0) {
            do {
                f290Var.add(Long.valueOf(ngcVar.y()));
                if (ngcVar.e()) {
                    return;
                } else {
                    iW = ngcVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        if (i != 2) {
            czh0.d();
            return;
        }
        int iD = ngcVar.d() + ngcVar.x();
        do {
            f290Var.add(Long.valueOf(ngcVar.y()));
        } while (ngcVar.d() < iD);
        v(iD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void v(int i) throws InvalidProtocolBufferException {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.d();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void w(int i) throws InvalidProtocolBufferException {
        if ((this.b & 7) == i) {
            return;
        }
        czh0.d();
    }
}
