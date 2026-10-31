package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ze21 implements qzh {
    public final /* synthetic */ byte a;
    public final jtl1 b;
    public final hrr0 c;
    public iu30 d;
    public final ComposeView e;

    public ze21(Context context, jtl1 jtl1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = jtl1Var;
                this.c = v8r.q(new p991("", false));
                this.d = er81.e1;
                ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setContent(new j2i(726621201, new ga91(this, (byte) 1), true));
                this.e = composeView;
                break;
            case 2:
                this.b = jtl1Var;
                this.c = v8r.q(new dsa1());
                this.d = hea1.d1;
                ComposeView composeView2 = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView2.setContent(new j2i(895583257, new kua1(this, (byte) 1), true));
                this.e = composeView2;
                break;
            default:
                this.b = jtl1Var;
                this.c = v8r.q(new ue21("", 1, 1, true));
                this.d = ma21.Q0;
                ComposeView composeView3 = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView3.setContent(new j2i(1026059722, new ye21(this, (byte) 1), true));
                this.e = composeView3;
                break;
        }
    }

    public void a(int i, int i2, b0k b0kVar, boolean z) {
        b0k b0kVar2;
        Object obj;
        Object next;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1203425071);
        int i3 = (b0kVar3.e(i) ? 4 : 2) | i2 | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(this) ? 256 : 128);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            t0z t0zVar = a5u0.e;
            d7 d7Var = new d7(t0zVar, (byte) 0);
            do {
                obj = null;
                if (!d7Var.hasNext()) {
                    next = null;
                    break;
                }
                next = d7Var.next();
            } while (((a5u0) next).a() != i);
            a5u0 a5u0Var = (a5u0) next;
            if (a5u0Var == null) {
                d7 d7Var2 = new d7(t0zVar, (byte) 0);
                while (d7Var2.hasNext()) {
                    Object next2 = d7Var2.next();
                    if (((a5u0) next2).a() == (i / 10) * 10) {
                        obj = next2;
                        break;
                    }
                }
                a5u0Var = (a5u0) obj;
            }
            if (a5u0Var == null) {
                a5u0Var = a5u0.PLAYBACK_SPEED_100;
            }
            String str = String.format("%s×", Arrays.copyOf(new Object[]{new DecimalFormat("#.##").format(Float.valueOf(a5u0Var.a / 100.0f))}, 1));
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, (qim0) null, cbx.d(b0kVar3).e, upo1.C(z, b0kVar3), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new iua1(this, i, z, i2);
        }
    }

    public void b(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-1715745448, i, x340Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            w0h1.a(rpi1.a[l1d.C(i)] == 1 ? asx.c : zrx.c, isl.a, (qim0) null, upo1.C(i != 1, x340Var), 0L, false, x340Var, 56, 52);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new we21(this, i, i2);
        }
    }

    public void e(int i, int i2, boolean z, qim0 qim0Var, b0k b0kVar, int i3) {
        qim0 qim0Var2;
        int i4;
        String strO0;
        x340 x340Var = (x340) b0kVar;
        int i5 = i3 | (kk0.t(-2018434759, i, x340Var) ? 4 : 2) | (x340Var.e(l1d.C(i2)) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | 3072 | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            ven0 ven0VarJ = f4p1.j(new nev0(this.b.b, (byte) 3), Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            int[] iArr = rpi1.a;
            String strO1 = cwl1.o0(x340Var, iArr[l1d.C(i)] == 1 ? 2131963235 : 2131963233);
            long jC = upo1.C(i != 1, x340Var);
            int iC = l1d.C(i2);
            if (iC == 0) {
                i4 = 2131960792;
            } else if (iC == 1) {
                i4 = 2131963233;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i4 = 2131963235;
            }
            String strO2 = cwl1.o0(x340Var, i4);
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new g521(this, (byte) 5);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO2), function0);
            boolean zBooleanValue = ((Boolean) ven0VarJ.getValue()).booleanValue();
            if (i == 1) {
                strO0 = x0d.k(x340Var, 1892192598, 2131963234, x340Var, false);
            } else {
                x340Var.i0(1892269633);
                strO0 = cwl1.o0(x340Var, iArr[l1d.C(i)] == 1 ? 2131963235 : 2131963233);
                x340Var.r(false);
            }
            String str = strO0;
            qim0 qim0Var3 = nim0.a;
            upo1.l(strO1, jC, gbxVar, z, zBooleanValue, qim0Var3, false, str, apo.r(-359596320, new we21(this, i), x340Var), x340Var, ((i5 << 3) & 7168) | 805502976, 192);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cc40(this, i, i2, z, qim0Var2, i3);
        }
    }

    public final void f(Object obj) {
        byte b = this.a;
        hrr0 hrr0Var = this.c;
        switch (b) {
            case 0:
                hrr0Var.setValue((ue21) obj);
                break;
            case 1:
                hrr0Var.setValue((p991) obj);
                break;
            default:
                hrr0Var.setValue((dsa1) obj);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public void k(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-553592274);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            w0h1.a(dtx.c, isl.a, (qim0) null, upo1.C(z, x340Var), 0L, false, x340Var, dtx.d | 48, 52);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ea91(i, this, z);
        }
    }

    public void l(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1326321747);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarJ = f4p1.j(new nev0(this.b.b, (byte) 6), Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            String strO0 = cwl1.o0(x340Var, 2131963238);
            long jC = upo1.C(z, x340Var);
            String strO1 = cwl1.o0(x340Var, z ? 2131960791 : 2131960790);
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new fe81(this, (byte) 14);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO1), function0);
            boolean zBooleanValue = ((Boolean) ven0VarJ.getValue()).booleanValue();
            j2i j2iVarR = apo.r(1475540794, new ea91(this, z), x340Var);
            qim0 qim0Var3 = nim0.a;
            upo1.l(strO0, jC, gbxVar, true, zBooleanValue, qim0Var3, false, (String) null, j2iVarR, x340Var, 805506048, 448);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(this, z, qim0Var2, i, (byte) 28);
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                this.d = iu30Var;
                break;
            case 1:
                this.d = iu30Var;
                break;
            default:
                this.d = iu30Var;
                break;
        }
    }

    public void r(int i, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1045266050);
        byte b = 2;
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | 3072 | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            ven0 ven0VarJ = f4p1.j(new nev0(this.b.b, (byte) 8), Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            String strO0 = cwl1.o0(x340Var, 2131963240);
            long jC = upo1.C(z, x340Var);
            String strO1 = cwl1.o0(x340Var, z ? 2131960791 : 2131960790);
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new gga1(this, b);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                qim0 qim0Var3 = nim0.a;
                upo1.l(strO0, jC, new gbx(new y50(strO1), function0), z2, ((Boolean) ven0VarJ.getValue()).booleanValue(), qim0Var3, false, (String) null, apo.r(-1211569175, new iua1(i, this, z), x340Var), x340Var, ((i3 << 3) & 7168) | 805502976, 448);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(this, i, z, z2, qim0Var2, i2);
        }
    }
}
