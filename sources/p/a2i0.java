package p;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.car.app.model.Alert;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a2i0 implements hxh0 {
    public final eh70 a;
    public final int b;

    public a2i0(eh70 eh70Var, int i) {
        this.a = eh70Var;
        this.b = i;
    }

    @Override // p.hxh0
    public final void a(int i, PendingIntent pendingIntent) {
        this.a.a(i, pendingIntent);
    }

    @Override // p.hxh0
    public final void b(int i) {
        this.a.b(i);
    }

    @Override // p.hxh0
    public final void c(int i, int i2, int i3) {
        this.a.c(i, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // p.hxh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r9, p.s7c0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = p.s7c0.j
            java.lang.Object r1 = r10.c
            int r2 = r10.d
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = p.s7c0.g
            int r5 = r10.a
            r3.putInt(r4, r5)
            java.lang.String r4 = p.s7c0.h
            long r5 = r10.b
            r3.putLong(r4, r5)
            p.iph0 r4 = r10.e
            if (r4 == 0) goto L26
            java.lang.String r5 = p.s7c0.i
            android.os.Bundle r4 = r4.b()
            r3.putBundle(r5, r4)
        L26:
            p.ke61 r10 = r10.f
            if (r10 == 0) goto L33
            java.lang.String r4 = p.s7c0.l
            android.os.Bundle r10 = r10.b()
            r3.putBundle(r4, r10)
        L33:
            java.lang.String r10 = p.s7c0.k
            r3.putInt(r10, r2)
            if (r1 != 0) goto L3b
            goto L7e
        L3b:
            r10 = 1
            if (r2 == r10) goto L84
            r10 = 2
            r4 = 0
            int r5 = r8.b
            if (r2 == r10) goto L75
            r10 = 3
            if (r2 == r10) goto L4b
            r10 = 4
            if (r2 == r10) goto L84
            goto L7e
        L4b:
            p.occ r10 = new p.occ
            p.b380 r1 = (p.b380) r1
            p.v280 r2 = p.b380.m()
            r6 = r4
        L54:
            int r7 = r1.size()
            if (r6 >= r7) goto L6a
            java.lang.Object r7 = r1.get(r6)
            p.yoh0 r7 = (p.yoh0) r7
            android.os.Bundle r7 = r7.e(r5, r4)
            r2.c(r7)
            int r6 = r6 + 1
            goto L54
        L6a:
            p.bg11 r1 = r2.g()
            r10.<init>(r1)
            r3.putBinder(r0, r10)
            goto L7e
        L75:
            p.yoh0 r1 = (p.yoh0) r1
            android.os.Bundle r10 = r1.e(r5, r4)
            r3.putBundle(r0, r10)
        L7e:
            p.eh70 r8 = r8.a
            r8.L(r9, r3)
            return
        L84:
            p.bhn0.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2i0.d(int, p.s7c0):void");
    }

    @Override // p.hxh0
    public final void e(int i, xg61 xg61Var, boolean z, boolean z2, int i2) {
        this.a.p0(i, xg61Var.a(z, z2).c(i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != a2i0.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((a2i0) obj).a.asBinder());
    }

    @Override // p.hxh0
    public final void f(int i, List list) {
        int i2 = 0;
        eh70 eh70Var = this.a;
        int i3 = this.b;
        if (i3 >= 7) {
            v280 v280VarM = b380.m();
            while (i2 < list.size()) {
                v280VarM.c(((udh) list.get(i2)).m(i3));
                i2++;
            }
            eh70Var.G(i, v280VarM.g());
            return;
        }
        bg11 bg11VarI = udh.i(10, list, true, true);
        v280 v280VarM2 = b380.m();
        while (i2 < bg11VarI.size()) {
            v280VarM2.c(((udh) bg11VarI.get(i2)).m(i3));
            i2++;
        }
        eh70Var.e(i, v280VarM2.g());
    }

    @Override // p.hxh0
    public final void g(int i, ch61 ch61Var) {
        this.a.W(i, ch61Var.b());
    }

    @Override // p.hxh0
    public final void h(int i, ke61 ke61Var) {
        this.a.k0(i, ke61Var.b());
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // p.hxh0
    public final void i(int i, jbu0 jbu0Var, m8u0 m8u0Var, boolean z, boolean z2) {
        Bundle bundleS;
        int i2 = this.b;
        dm5.y(i2 != 0);
        boolean z3 = z || !m8u0Var.a(17);
        boolean z4 = z2 || !m8u0Var.a(30);
        eh70 eh70Var = this.a;
        if (i2 < 2) {
            eh70Var.Q(jbu0Var.p(m8u0Var, z, true).s(i2), i, z3);
            return;
        }
        jbu0 jbu0VarP = jbu0Var.p(m8u0Var, z, z2);
        if (eh70Var instanceof xlh0) {
            bundleS = new Bundle();
            bundleS.putBinder(jbu0.o0, new fbu0(jbu0VarP));
        } else {
            bundleS = jbu0VarP.s(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(ebu0.d, z3);
        bundle.putBoolean(ebu0.e, z4);
        eh70Var.s0(i, bundleS, bundle);
    }

    @Override // p.hxh0
    public final void j(int i, pa61 pa61Var) {
        this.a.r0(i, pa61Var.b(), Bundle.EMPTY);
    }

    @Override // p.hxh0
    public final void k(int i, Bundle bundle) {
        this.a.T0(i, bundle);
    }

    @Override // p.hxh0
    public final void l(int i, m8u0 m8u0Var) {
        this.a.o0(i, m8u0Var.c());
    }

    @Override // p.hxh0
    public final void m(int i, String str) {
        this.a.q0(i, Alert.DURATION_SHOW_INDEFINITELY, null, str);
    }

    @Override // p.hxh0
    public final void n(int i, String str, iph0 iph0Var) {
        this.a.Q0(i, Alert.DURATION_SHOW_INDEFINITELY, iph0Var == null ? null : iph0Var.b(), str);
    }

    @Override // p.hxh0
    public final void o(int i, qa61 qa61Var, m8u0 m8u0Var) {
        this.a.x0(i, qa61Var.c(), m8u0Var.c());
    }

    @Override // p.hxh0
    public final void onDisconnected() {
        iqo1.r(this.a);
    }
}
