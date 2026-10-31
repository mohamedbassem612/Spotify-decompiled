package p;

import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z4e1 extends l5t implements m7v, rdt0, t161, mv40, mav0, hpa0, j4k, sim0, sjp0, zkb0, iz20 {
    public ggg1 Q0;
    public aae1 R0;
    public r7e1 S0;
    public dk80 T0;
    public boolean U0;
    public boolean V0;
    public kua0 W0;
    public yta0 X0;
    public boolean Y0;
    public idn0 Z0;
    public sen0 a1;
    public final l030 b1;
    public final j8d1 c1;
    public y3v d1;
    public final d4v e1;
    public crl1 f1;
    public xab1 g1;
    public final g23 h1;
    public final u4e1 i1;
    public xab1 j1;
    public final s4e1 k1;
    public final hrr0 l1;

    public z4e1(ggg1 ggg1Var, aae1 aae1Var, r7e1 r7e1Var, dk80 dk80Var, boolean z, boolean z2, kua0 kua0Var, yta0 yta0Var, boolean z3, idn0 idn0Var, sen0 sen0Var) {
        this.Q0 = ggg1Var;
        this.R0 = aae1Var;
        this.S0 = r7e1Var;
        this.T0 = dk80Var;
        this.U0 = z;
        this.V0 = z2;
        this.W0 = kua0Var;
        this.X0 = yta0Var;
        this.Y0 = z3;
        this.Z0 = idn0Var;
        this.a1 = sen0Var;
        r7e1Var.m = new s4e1(this, (byte) 3);
        this.b1 = new l030(idn0Var, new t4e1(this, (byte) 0), 2);
        j8d1 j8d1VarA = f8d1.a(new ae4(this, (byte) 12));
        H1(j8d1VarA);
        this.c1 = j8d1VarA;
        s4e1 s4e1Var = new s4e1(this, (byte) 5);
        u4e1 u4e1Var = new u4e1(this, (byte) 0);
        d4v d4vVar = new d4v(new b6(new w7d1(s4e1Var, (byte) 6), new f5e1(new t4e1(this, (byte) 1), u4e1Var, new t4e1(this, (byte) 2), new t4e1(this, (byte) 3), new t4e1(this, (byte) 4), new t4e1(this, (byte) 5)), (byte) 18), 1);
        H1(d4vVar);
        this.e1 = d4vVar;
        this.h1 = new g23((byte) 16);
        this.i1 = new u4e1(this, (byte) 1);
        this.k1 = new s4e1(this, (byte) 4);
        this.l1 = v8r.q(Boolean.FALSE);
    }

    public final void A1() {
        K1();
        this.S0.n = null;
    }

    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        this.c1.D0(bav0Var, cav0Var, j);
    }

    public final void E(elb0 elb0Var) {
        this.R0.f.setValue(elb0Var);
        if (this.U0) {
            this.b1.E(elb0Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:210:0x0408  */
    /* JADX WARN: Code duplicated, block: B:216:0x0414  */
    /* JADX WARN: Code duplicated, block: B:219:0x0429  */
    /* JADX WARN: Code duplicated, block: B:222:0x0432  */
    /* JADX WARN: Code duplicated, block: B:224:0x043e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0447  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    public final boolean J0(KeyEvent keyEvent) {
        boolean zN1;
        float fIntBitsToFloat;
        woa0 woa0Var;
        woa0 woa0Var2;
        i4e1 i4e1Var;
        int i;
        Integer numA;
        ggg1 ggg1Var = this.Q0;
        aae1 aae1Var = this.R0;
        r7e1 r7e1Var = this.S0;
        b6t b6tVarO1 = O1();
        boolean z = this.U0 && !this.V0;
        boolean z2 = this.Y0;
        g23 g23Var = this.h1;
        g23Var.getClass();
        ir20 ir20Var = (ir20) g23Var.b;
        if (ern1.t(keyEvent) == 2 && keyEvent.isFromSource(257) && (!l3p1.x(keyEvent) || !n3p1.n(keyEvent))) {
            r7e1Var.v(false);
        }
        long jD = mno1.d(keyEvent.getKeyCode());
        if (ern1.t(keyEvent) == 1) {
            ndn0 ndn0Var = (ndn0) g23Var.d;
            if (ndn0Var != null && ndn0Var.a(jD)) {
                ndn0 ndn0Var2 = (ndn0) g23Var.d;
                if (ndn0Var2 != null) {
                    ndn0Var2.e(jD);
                }
                return true;
            }
        } else if (ern1.t(keyEvent) != 0 || n3p1.n(keyEvent)) {
            if (!n3p1.n(keyEvent) || (numA = ((b8r) g23Var.c).a(keyEvent)) == null) {
                woa0 woa0VarT = fdg1.a.t(keyEvent);
                if (woa0VarT == null || (woa0VarT.a && !z)) {
                    zN1 = false;
                } else {
                    y9e1 y9e1VarC = aae1Var.c();
                    elb0 elb0VarE = aae1Var.e();
                    if (elb0VarE != null) {
                        n511 n511VarM = null;
                        if (!elb0VarE.a()) {
                            elb0VarE = null;
                        }
                        if (elb0VarE == null) {
                            fIntBitsToFloat = Float.NaN;
                        } else {
                            elb0 elb0VarB = aae1Var.b();
                            if (elb0VarB != null) {
                                if (!elb0VarB.a()) {
                                    elb0VarB = null;
                                }
                                if (elb0VarB != null) {
                                    n511VarM = elb0VarB.M(elb0VarE, true);
                                }
                            }
                            if (n511VarM != null) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (n511VarM.g() & 4294967295L));
                            } else {
                                fIntBitsToFloat = Float.NaN;
                            }
                        }
                    } else {
                        fIntBitsToFloat = Float.NaN;
                    }
                    iz51 iz51Var = new iz51(ggg1Var, y9e1VarC, l3p1.x(keyEvent), l3p1.w(keyEvent), fIntBitsToFloat, ir20Var);
                    y7e1 y7e1Var = ggg1Var.a;
                    int iOrdinal = woa0VarT.ordinal();
                    String str = iz51Var.k;
                    switch (iOrdinal) {
                        case 0:
                            woa0Var = woa0VarT;
                            ir20Var.b = Float.NaN;
                            if (str.length() > 0) {
                                if (!nbe1.d(iz51Var.i)) {
                                    boolean zB = iz51Var.b();
                                    long j = iz51Var.i;
                                    if (zB) {
                                        int iG = nbe1.g(j);
                                        iz51Var.i = e6p1.e(iG, iG);
                                    } else {
                                        int iF = nbe1.f(j);
                                        iz51Var.i = e6p1.e(iF, iF);
                                    }
                                } else if (iz51Var.b()) {
                                    iz51Var.j();
                                } else {
                                    iz51Var.g();
                                }
                            }
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2 || woa0Var == woa0.Z || woa0Var == woa0.b || woa0Var == woa0.c) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 1:
                            woa0Var = woa0VarT;
                            ir20Var.b = Float.NaN;
                            if (str.length() > 0) {
                                if (!nbe1.d(iz51Var.i)) {
                                    boolean zB2 = iz51Var.b();
                                    long j2 = iz51Var.i;
                                    if (zB2) {
                                        int iF2 = nbe1.f(j2);
                                        iz51Var.i = e6p1.e(iF2, iF2);
                                    } else {
                                        int iG2 = nbe1.g(j2);
                                        iz51Var.i = e6p1.e(iG2, iG2);
                                    }
                                } else if (iz51Var.b()) {
                                    iz51Var.g();
                                } else {
                                    iz51Var.j();
                                }
                            }
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 2:
                            woa0Var = woa0VarT;
                            if (iz51Var.b()) {
                                iz51Var.i();
                            } else {
                                iz51Var.l();
                            }
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 3:
                            woa0Var = woa0VarT;
                            if (iz51Var.b()) {
                                iz51Var.l();
                            } else {
                                iz51Var.i();
                            }
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 4:
                            woa0Var = woa0VarT;
                            iz51Var.h();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 5:
                            woa0Var = woa0VarT;
                            iz51Var.k();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 6:
                            woa0Var = woa0VarT;
                            iz51Var.p();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 7:
                            woa0Var = woa0VarT;
                            iz51Var.o();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 8:
                            woa0Var = woa0VarT;
                            if (iz51Var.b()) {
                                iz51Var.p();
                            } else {
                                iz51Var.o();
                            }
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 9:
                            woa0Var = woa0VarT;
                            if (iz51Var.b()) {
                                iz51Var.o();
                            } else {
                                iz51Var.p();
                            }
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 10:
                            woa0Var = woa0VarT;
                            iz51Var.q();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 11:
                            woa0Var = woa0VarT;
                            iz51Var.e();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 12:
                            woa0Var = woa0VarT;
                            b6tVarO1.b();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 13:
                            woa0Var = woa0VarT;
                            iz51Var.r();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 14:
                            woa0Var = woa0VarT;
                            iz51Var.f();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 15:
                            woa0Var = woa0VarT;
                            iz51Var.n();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 16:
                            woa0Var = woa0VarT;
                            iz51Var.m();
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 17:
                        case 18:
                        case 19:
                            woa0Var = woa0VarT;
                            this.i1.invoke(woa0Var, Boolean.valueOf(l3p1.w(keyEvent)));
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 20:
                            ir20Var.b = Float.NaN;
                            if (str.length() > 0) {
                                long j3 = iz51Var.i;
                                int i2 = nbe1.c;
                                int i3 = (int) (j3 & 4294967295L);
                                int iOffsetByCodePoints = -1;
                                if (i3 > 0) {
                                    a4x a4xVarY = mmo1.y();
                                    if (a4xVarY != null) {
                                        int iB = a4xVarY.b(i3 - 1, str);
                                        if (iB >= 0) {
                                            iOffsetByCodePoints = iB;
                                        } else if (i3 > 0) {
                                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                                        }
                                    } else if (i3 > 0) {
                                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                                    }
                                }
                                long jK = z5p1.k(iOffsetByCodePoints, i3, ggg1Var);
                                int i4 = (int) (jK >> 32);
                                int iJ = axo1.j(jK);
                                if (i4 != i3 || !nbe1.d(iz51Var.i)) {
                                    iz51Var.i = e6p1.e(i4, i4);
                                }
                                if (iJ != 0) {
                                    iz51Var.j = iJ;
                                }
                            }
                            iz51Var.a();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 21:
                            iz51Var.g();
                            iz51Var.a();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 22:
                            iz51Var.l();
                            iz51Var.a();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 23:
                            iz51Var.i();
                            iz51Var.a();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 24:
                            iz51Var.p();
                            iz51Var.a();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 25:
                            iz51Var.o();
                            iz51Var.a();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 26:
                            ir20Var.b = Float.NaN;
                            if (str.length() > 0) {
                                iz51Var.i = e6p1.e(0, str.length());
                            }
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            if (iz51Var.b()) {
                                iz51Var.j();
                            } else {
                                iz51Var.g();
                            }
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            if (iz51Var.b()) {
                                iz51Var.g();
                            } else {
                                iz51Var.j();
                            }
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            iz51Var.q();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case RendererMetrics.SAMPLES /* 30 */:
                            iz51Var.e();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 31:
                            iz51Var.r();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 32:
                            iz51Var.f();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            iz51Var.n();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            iz51Var.m();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            if (iz51Var.b()) {
                                iz51Var.l();
                            } else {
                                iz51Var.i();
                            }
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                            if (iz51Var.b()) {
                                iz51Var.i();
                            } else {
                                iz51Var.l();
                            }
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            iz51Var.h();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            iz51Var.k();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            iz51Var.p();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            iz51Var.o();
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            if (iz51Var.b()) {
                                iz51Var.p();
                            } else {
                                iz51Var.o();
                            }
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            if (iz51Var.b()) {
                                iz51Var.o();
                            } else {
                                iz51Var.p();
                            }
                            iz51Var.s();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            ir20Var.b = Float.NaN;
                            if (str.length() > 0) {
                                long j4 = iz51Var.i;
                                int i5 = nbe1.c;
                                int i6 = (int) (j4 & 4294967295L);
                                iz51Var.i = e6p1.e(i6, i6);
                            }
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            if (z2) {
                                zN1 = N1(this.W0.c());
                            } else {
                                ggg1.m(ggg1Var, "\n", !l3p1.x(keyEvent), l3p1.w(keyEvent), 4);
                                zN1 = true;
                            }
                            woa0Var = woa0VarT;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            if (z2) {
                                zN1 = false;
                            } else {
                                ggg1.m(ggg1Var, "\t", !l3p1.x(keyEvent), l3p1.w(keyEvent), 4);
                                zN1 = true;
                            }
                            woa0Var = woa0VarT;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            y7e1Var.g.k();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            y7e1Var.g.j();
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        case 48:
                            woa0Var = woa0VarT;
                            zN1 = true;
                            woa0Var2 = woa0.Y;
                            i4e1Var = iz51Var.g;
                            if (woa0Var != woa0Var2) {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            } else {
                                zN1 = !nbe1.c(i4e1Var.e, iz51Var.i);
                            }
                            if (!nbe1.c(iz51Var.i, i4e1Var.e)) {
                                ggg1Var.o(iz51Var.i);
                            }
                            i = iz51Var.j;
                            if (i != 0) {
                                if (!nbe1.d(y7e1Var.d().e)) {
                                    ggg1Var.q(new y061(iz51Var.h.a, i));
                                } else {
                                    ggg1Var.q(new y061(i, i));
                                }
                            }
                            break;
                        default:
                            eg.o();
                            return false;
                    }
                }
            } else {
                String string = new StringBuilder(2).appendCodePoint(numA.intValue()).toString();
                if (z) {
                    ggg1.m(ggg1Var, string, !l3p1.x(keyEvent), l3p1.w(keyEvent), 4);
                    ir20Var.b = Float.NaN;
                    zN1 = true;
                } else {
                    zN1 = false;
                }
            }
            if (zN1) {
                ndn0 ndn0Var3 = (ndn0) g23Var.d;
                if (ndn0Var3 == null) {
                    ndn0Var3 = new ndn0(3);
                    g23Var.d = ndn0Var3;
                }
                ndn0Var3.d(jD);
            }
            return zN1;
        }
        return false;
    }

    public final void K0() {
        this.c1.K0();
    }

    public final void K1() {
        xab1 xab1Var = this.j1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.j1 = null;
        sen0 sen0Var = this.a1;
        if (sen0Var != null) {
            sen0Var.d();
        }
    }

    public final void L1() {
        y3v y3vVar = this.d1;
        if (y3vVar != null) {
            this.Z0.a(new z3v(y3vVar));
            this.d1 = null;
        }
    }

    public final boolean M1() {
        uvb0 uvb0Var;
        return this.b1.V0.L1().b() && (uvb0Var = this.f1) != null && uvb0Var.b();
    }

    public final boolean N1(int i) {
        yta0 yta0Var;
        if (i != 0 && i != 1 && (yta0Var = this.X0) != null) {
            yta0Var.a();
            return true;
        }
        if (i == 6) {
            ((az20) lcc.z(this, t4k.i)).i(1, true);
            return true;
        }
        if (i == 5) {
            ((az20) lcc.z(this, t4k.i)).i(2, true);
            return true;
        }
        if (i != 7) {
            return false;
        }
        O1().a();
        return true;
    }

    public final k6a1 O1() {
        k6a1 k6a1Var = (k6a1) lcc.z(this, t4k.q);
        if (k6a1Var != null) {
            return k6a1Var;
        }
        eg.m("No software keyboard controller");
        return null;
    }

    public final void P1(boolean z) {
        if (!z) {
            Boolean bool = this.W0.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        s3o1.r(this);
        this.j1 = fn31.T(v1(), null, 4, new v4e1(this, null, (byte) 5), 1);
    }

    public final void T0(ez20 ez20Var) {
        n511 n511VarN;
        elb0 elb0VarB;
        r7e1 r7e1Var = this.S0;
        aae1 aae1Var = r7e1Var.b;
        y9e1 y9e1VarC = aae1Var.c();
        n511 n511VarI = n511.e;
        if (y9e1VarC != null) {
            if (r7e1Var.h) {
                i4e1 i4e1VarH = r7e1Var.a.h();
                if (nbe1.d(i4e1VarH.e)) {
                    n511VarN = r7e1Var.a(y9e1VarC, i4e1VarH);
                } else {
                    long j = i4e1VarH.e;
                    if (!nbe1.d(j)) {
                        int i = (int) (j >> 32);
                        zrm0 zrm0Var = y9e1VarC.b;
                        int iD = zrm0Var.d(i);
                        int i2 = (int) (4294967295L & j);
                        int iD2 = zrm0Var.d(i2);
                        if (iD == iD2) {
                            float fE = y9e1VarC.e(i, true);
                            float fE2 = y9e1VarC.e(i2, true);
                            n511VarI = new n511(Math.min(fE, fE2), zrm0Var.f(iD), Math.max(fE, fE2), zrm0Var.b(iD2));
                        } else {
                            n511VarI = y9e1VarC.k(nbe1.g(j), nbe1.f(j)).i();
                        }
                    }
                    n511VarN = n511VarI;
                }
                elb0 elb0VarE = aae1Var.e();
                if (elb0VarE != null) {
                    if (!elb0VarE.a()) {
                        elb0VarE = null;
                    }
                    if (elb0VarE != null && (elb0VarB = aae1Var.b()) != null) {
                        elb0 elb0Var = elb0VarB.a() ? elb0VarB : null;
                        if (elb0Var != null) {
                            n511VarN = n511VarN.n(elb0Var.M(elb0VarE, false).h());
                        }
                    }
                }
                n511VarI = n511VarN;
            } else {
                n511VarI = fj10.c;
            }
        }
        ez20Var.a(n511VarI);
    }

    public final void d1(elb0 elb0Var) {
        this.e1.getClass();
    }

    public final void f(long j) {
        this.e1.R0 = j;
    }

    public final void f0() {
        p9p1.z(this, new s4e1(this, (byte) 1));
    }

    public final void g(e261 e261Var) {
        i4e1 i4e1VarE = this.Q0.e();
        long j = i4e1VarE.e;
        af5 af5Var = new af5(this.Q0.a.d().d.toString());
        mma0[] mma0VarArr = b261.a;
        d261 d261Var = z161.F;
        mma0[] mma0VarArr2 = b261.a;
        mma0 mma0Var = mma0VarArr2[18];
        d261Var.getClass();
        e261Var.b(d261Var, af5Var);
        b261.q(e261Var, new af5(i4e1VarE.d.toString()));
        d261 d261Var2 = z161.H;
        mma0 mma0Var2 = mma0VarArr2[20];
        nbe1 nbe1Var = new nbe1(j);
        d261Var2.getClass();
        e261Var.b(d261Var2, nbe1Var);
        nbe1 nbe1Var2 = this.Q0.a.d().f;
        d261 d261Var3 = z161.I;
        mma0 mma0Var3 = mma0VarArr2[21];
        d261Var3.getClass();
        e261Var.b(d261Var3, nbe1Var2);
        ck80 ck80Var = new ck80(((Boolean) this.Q0.a.e.getValue()).booleanValue(), ((Boolean) this.Q0.a.f.getValue()).booleanValue());
        d261 d261Var4 = z161.M;
        mma0 mma0Var4 = mma0VarArr2[27];
        d261Var4.getClass();
        e261Var.b(d261Var4, ck80Var);
        if (!this.U0) {
            b261.a(e261Var);
        }
        boolean z = this.U0 && !this.V0;
        d261 d261Var5 = z161.Q;
        mma0 mma0Var5 = mma0VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        d261Var5.getClass();
        e261Var.b(d261Var5, boolValueOf);
        b261.m(e261Var, m9h.U0);
        ej4 ej4VarR = no80.r(i4e1VarE);
        if (ej4VarR != null) {
            b261.r(e261Var, ej4VarR);
        }
        b261.h(e261Var, new r4e1(z, this, (byte) 0));
        int i = this.W0.c;
        if (i == 6) {
            fam.a.getClass();
            b261.o(e261Var, s9m.d);
        } else if (i == 7 || i == 8) {
            fam.a.getClass();
            b261.o(e261Var, s9m.c);
        } else if (i == 4) {
            fam.a.getClass();
            b261.o(e261Var, s9m.e);
        }
        b261.b(e261Var, new t4e1(this, (byte) 6));
        if (z) {
            b261.D(e261Var, new r4e1(z, this, (byte) 1));
            b261.e(e261Var, new r4e1(z, this, (byte) 2));
        }
        e261Var.b(m161.j, new we((String) null, new pea(this, (byte) 8)));
        int iC = this.W0.c();
        u170 u170Var = new u170(this, iC, (byte) 3);
        e261Var.b(z161.J, r180.a(iC));
        e261Var.b(m161.p, new we((String) null, u170Var));
        b261.g(e261Var, (String) null, new s4e1(this, (byte) 8));
        b261.i(e261Var, (String) null, new s4e1(this, (byte) 9));
        if (!nbe1.d(j)) {
            e261Var.b(m161.q, new we((String) null, new s4e1(this, (byte) 10)));
            if (this.U0 && !this.V0) {
                e261Var.b(m161.r, new we((String) null, new s4e1(this, (byte) 0)));
            }
        }
        if (z) {
            e261Var.b(m161.s, new we((String) null, new s4e1(this, (byte) 6)));
        }
        dk80 dk80Var = this.T0;
        if (dk80Var != null) {
            dk80Var.g(e261Var);
        }
        if (this.U0) {
            this.b1.g(e261Var);
        }
    }

    public final boolean q1() {
        return true;
    }

    public final void t0(lsl lslVar) {
        lslVar.s1();
        if (((Boolean) this.l1.getValue()).booleanValue()) {
            n6a1 n6a1Var = (Brush) lcc.z(this, c69.a);
            long j = ((u7h) lcc.z(this, c69.b)).a;
            long jE = z4p1.e(1308617531);
            int i = u7h.l;
            if (!z4h1.b(j, jE)) {
                n6a1Var = new n6a1(j);
            }
            DrawScope.S0(lslVar, n6a1Var, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
        }
    }

    public final boolean x0(KeyEvent keyEvent) {
        ggg1 ggg1Var = this.Q0;
        r7e1 r7e1Var = this.S0;
        O1();
        this.h1.getClass();
        if (nbe1.d(ggg1Var.h().e) || keyEvent.getKeyCode() != 4 || ern1.t(keyEvent) != 1) {
            return false;
        }
        ggg1 ggg1Var2 = r7e1Var.a;
        if (!nbe1.d(ggg1Var2.h().e)) {
            y7e1 y7e1Var = ggg1Var2.a;
            dk80 dk80Var = ggg1Var2.b;
            y7e1Var.b.c().h();
            h4e1 h4e1Var = y7e1Var.b;
            int i = (int) (h4e1Var.g & 4294967295L);
            u2p1.v(h4e1Var, i, i);
            y7e1Var.b(dk80Var, true, 1);
            y7e1Var.g(true);
            y7e1Var.f(y7e1Var.b.e);
        }
        r7e1Var.w(false);
        r7e1Var.x(ree1.a);
        return true;
    }

    public final void z1() {
        p9p1.z(this, new s4e1(this, (byte) 1));
        this.S0.n = this.k1;
        if (this.U0) {
            H1(this.b1);
        }
    }
}
