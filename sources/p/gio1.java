package p;

import android.app.Notification;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gio1 {
    public static final jm a = new jm("NONE", (byte) 5);
    public static final jm b = new jm("PENDING", (byte) 5);
    public static b180 c;

    public static final sd6 C(int i, float f, xd6 xd6Var, boolean z) {
        float fS = xd6Var != null ? xd6Var.c.s() : 0.0f;
        float fS2 = xd6Var != null ? xd6Var.d.s() : 0.0f;
        float f2 = f / 240.0f;
        float fG = fd21.g(fS, 2.5f, td6.f(i), f2);
        float fP = c13.p(fS2, 2.5f, td6.g(i), f2);
        return z ? new sd6(fG, fP) : new sd6(-fG, fP);
    }

    public static final void D(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            tf80.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        tf80.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static String F(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(G(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(G(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strQ = l1d.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strQ.length() + 8 + name2.length() + 1);
            bb00.j(sb, "<", strQ, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1805330000);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fc11.e(str, function0, (hux) null, x340Var, i2 & 1022, 8);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 7);
        }
    }

    public static final bpb1 b(Object obj) {
        if (obj == null) {
            obj = wqn1.a;
        }
        return new bpb1(obj);
    }

    public static final void c(final Function0 function0, b0k b0kVar, final int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1646555525);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            i((View) x340Var.k(AndroidCompositionLocals_androidKt.f), (wat) x340Var.k(t4k.h), function0, x340Var, (i2 << 6) & 896);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.pt00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i | 1);
                    gio1.c(function0, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(808601089);
        int i2 = i | 6;
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            mmr0 mmr0Var = new mmr0(Float.valueOf(3.0f), Float.valueOf(2.0f));
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(mmr0Var);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            String strO0 = cwl1.o0(b0kVar2, 2131959577);
            lee1 lee1Var = cbx.d(b0kVar2).d;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = q4r0.a1;
                b0kVar2.s0(objT2);
            }
            qim0Var2 = qim0Var3;
            uwo1.e(strO0, s161.b(qim0VarF2, false, (iu30) objT2), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2024);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(qim0Var2, 16.0f));
            qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar2).b.c, 0.0f, 2, u291.f(u291.x(0.0f, 480.0f, 1, qim0Var2), 1.0f));
            Uri uri = Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/IAM_SeparateAccounts.png");
            boolean zI = b0kVar2.i(ven0Var);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new qtr0(ven0Var, mmr0Var, (byte) 0);
                b0kVar2.s0(objT3);
            }
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT3, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 126974);
            b0kVar2 = b0kVar2;
            eso1.h(ni7VarA, isl.a, qim0VarZ, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0Var.getValue()).a).floatValue(), ((Number) ((mmr0) ven0Var.getValue()).b).floatValue()), mif1.S0, (tl3) null, (ColorFilter) null, b0kVar2, 3120, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(16.0f, 2131959579, b0kVar2, b0kVar2, qim0Var2), u291.f(qim0Var2, 1.0f), cbx.d(b0kVar2).h, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2024);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var2, i, (byte) 22);
        }
    }

    public static final void e(i4z0 i4z0Var, o4z0 o4z0Var, xtb0 xtb0Var, p40 p40Var, qim0 qim0Var, b0k b0kVar, int i) {
        o4z0 o4z0Var2;
        x340 x340Var;
        qim0 qim0Var2;
        m4z0 m4z0Var;
        m4z0 m4z0Var2;
        i4z0 i4z0Var2 = i4z0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1093690409);
        int i2 = (x340Var2.i(i4z0Var2) ? 4 : 2) | i | (x340Var2.g(o4z0Var) ? 32 : 16) | (x340Var2.i(xtb0Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(p40Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            m4z0 m4z0Var3 = i4z0Var2.d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarH = kx40.h(1.0f, u291.f(qim0Var3, 1.0f), true);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean zG = x340Var2.g(m4z0Var3) | ((i3 & 112) == 32) | x340Var2.i(p40Var) | x340Var2.i(i4z0Var2);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                vvu0 vvu0Var = new vvu0(o4z0Var, m4z0Var3, p40Var, i4z0Var, (byte) 7);
                m4z0Var = m4z0Var3;
                i4z0Var2 = i4z0Var;
                x340Var2.s0(vvu0Var);
                objT = vvu0Var;
            } else {
                m4z0Var = m4z0Var3;
            }
            ujo1.d(qim0VarH, xtb0Var, zzq0VarJ, false, null, null, null, false, null, (iu30) objT, x340Var2, (i3 >> 3) & 112, 504);
            x340Var = x340Var2;
            if (m4z0Var.e) {
                x340Var.i0(1621154210);
                String str = o4z0Var.c;
                String str2 = m4z0Var.g;
                boolean zI = x340Var.i(i4z0Var2);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    m4z0Var2 = m4z0Var;
                    o4z0Var2 = o4z0Var;
                    v3v0 v3v0Var = new v3v0(1, i4z0Var2, i4z0.class, "updateInput", "updateInput(Ljava/lang/String;)V", 0, (byte) 11);
                    x340Var.s0(v3v0Var);
                    objT2 = v3v0Var;
                } else {
                    o4z0Var2 = o4z0Var;
                    m4z0Var2 = m4z0Var;
                }
                iu30 iu30Var = (iu30) objT2;
                boolean zI2 = x340Var.i(i4z0Var2);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    ggx0 ggx0Var = new ggx0(0, i4z0Var2, i4z0.class, "submitUserAnswer", "submitUserAnswer()V", 0, (byte) 4);
                    x340Var.s0(ggx0Var);
                    objT3 = ggx0Var;
                }
                sio1.k(str, str2, iu30Var, (Function0) objT3, o4z0Var2.d, m4z0Var2.f.isEmpty(), x340Var, 0);
                x340Var.r(false);
            } else {
                o4z0Var2 = o4z0Var;
                x340Var.i0(1621474223);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            o4z0Var2 = o4z0Var;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z6t0(i4z0Var, o4z0Var2, xtb0Var, p40Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void f(String str, String str2, b0k b0kVar, int i) {
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-832001533);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ucy0.Z0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarY, true, (iu30) objT);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            if (str2.length() > 0) {
                x340Var.i0(-1103217551);
                str3 = str2;
                uwo1.e(str3, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2034);
                x340Var.r(false);
            } else {
                str3 = str2;
                x340Var.i0(-1103071479);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            str3 = str2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 16, i, str, str3);
        }
    }

    public static final void g(i4z0 i4z0Var, p40 p40Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1628809926);
        int i2 = (x340Var.i(i4z0Var) ? 4 : 2) | i | (x340Var.i(p40Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            m4z0 m4z0Var = i4z0Var.d;
            ven0 ven0VarH = rwq.h(i4z0Var.X, x340Var, 0);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zG = x340Var.g(i4z0Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = bb00.h(((o4z0) ven0VarH.getValue()).b.size(), x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            lvb1 lvb1Var = (lvb1) rwq.h(i4z0Var.Y, x340Var, 0).getValue();
            if (lvb1Var == null) {
                lvb1Var = new lvb1(m4z0Var.i, m4z0Var.t);
            }
            String strN0 = cwl1.n0(2131960745, new Object[]{Integer.valueOf(lvb1Var.a), Integer.valueOf(lvb1Var.b)}, x340Var);
            boolean zI = x340Var.i(i4z0Var) | x340Var.g(strN0);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new g1x0(i4z0Var, strN0, (byte) 24);
                x340Var.s0(objT2);
            }
            qxd0.S((Function0) objT2, x340Var);
            Integer numValueOf = Integer.valueOf(((o4z0) ven0VarH.getValue()).b.size());
            boolean zI2 = x340Var.i(ven0VarH) | x340Var.i(hdn0Var) | x340Var.i(xtb0VarA);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                l4z0 l4z0Var = new l4z0(xtb0VarA, ven0VarH, hdn0Var, null, (byte) 0);
                x340Var.s0(l4z0Var);
                objT3 = l4z0Var;
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT3);
            e(i4z0Var, (o4z0) ven0VarH.getValue(), xtb0VarA, p40Var, null, x340Var, (i2 & 14) | ((i2 << 6) & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(i4z0Var, p40Var, i, (byte) 10);
        }
    }

    public static final void h(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1219469538);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 24.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(935285798);
                qim0Var2 = qim0Var3;
                w0h1.a(klx.c, isl.a, anm1.N("selection_circle_selected", qim0Var3), cbx.a(x340Var).b.c, 0L, false, x340Var, klx.d | 432, 48);
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                x340Var.i0(935543315);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0VarR2 = u291.r(qim0Var2, 24.0f);
                avw0 avw0Var = cbx.b(x340Var).c;
                t1c.a(anm1.N("selection_circle_unselected", d1u.E(2.0f, cbx.a(x340Var).b.b, qim0VarR2, er31.a)), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z0(z, qim0Var2, i, (byte) 2);
        }
    }

    public static final void i(View view, wat watVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1319522472);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(watVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(view) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new b6(view, function0, (byte) 21);
                x340Var.s0(objT);
            }
            qxd0.h(view, watVar, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(view, watVar, function0, i, (byte) 5);
        }
    }

    public static final void j(zmh1 zmh1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        String str = zmh1Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2034683696);
        int i2 = i | (b0kVar3.g(zmh1Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = zmh1Var.e;
            String str2 = zmh1Var.c;
            if (str2 == null) {
                str2 = "";
            }
            b0kVar2 = b0kVar3;
            i1p1.i(new ckd0(str, z, str2, cwl1.n0(2131957633, new Object[]{str}, b0kVar3), cwl1.o0(b0kVar3, 2131957632), 1, "", zmh1Var.d, cwl1.n0(2131957627, new Object[]{str}, b0kVar3), cwl1.o0(b0kVar3, 2131957626), cwl1.o0(b0kVar3, zmh1Var.f ? 2131957630 : 2131957628), cwl1.o0(b0kVar3, 2131957629), zmh1Var.f), function0, function1, function1, qim0VarF, b0kVar2, (i2 & 1008) | ((i2 << 3) & 7168), 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) zmh1Var, (Object) function0, (Object) function1, i, (byte) 9);
        }
    }

    public static final void k(boolean z, boolean z2, boolean z3, xd6 xd6Var, int i, float f, b4g1 b4g1Var, iu30 iu30Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        float fS;
        ceo ceoVar;
        b0k b0kVar3;
        tzg1 tzg1Var;
        float f2;
        float fT;
        qq20 qq20Var;
        b0k b0kVar4;
        xd6 xd6Var2;
        boolean z4;
        float f3;
        Object obj = fkj0.X;
        drr0 drr0Var = b4g1Var.c;
        b0k b0kVar5 = (x340) b0kVar;
        b0kVar5.k0(194383703);
        int i3 = i2 | (b0kVar5.h(z) ? 4 : 2) | (b0kVar5.h(z2) ? 32 : 16) | (b0kVar5.h(z3) ? 256 : 128) | (b0kVar5.g(xd6Var) ? 2048 : 1024) | (b0kVar5.e(l1d.C(i)) ? 16384 : 8192) | (b0kVar5.d(f) ? 131072 : 65536) | (b0kVar5.i(iu30Var) ? 8388608 : 4194304);
        if (b0kVar5.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            float f4 = z ? 0.0f : 180.0f;
            int i4 = i3 & 14;
            boolean z5 = i4 == 4;
            Object objT = b0kVar5.T();
            if (z5 || objT == obj) {
                boolean zA = b4g1Var.a();
                if (zA) {
                    fS = drr0Var.s();
                } else {
                    fS = (!z ? 0.0f : 180.0f) + (xd6Var != null ? xd6Var.b.s() : 0.0f);
                }
                int iU = jch0.U((Math.abs(f4 - fS) * 500.0f) / Math.abs(180.0f));
                if (iU < 1) {
                    iU = 1;
                }
                if (zA) {
                    ilv.a.getClass();
                    ceoVar = flv.g;
                } else {
                    ilv.a.getClass();
                    ceoVar = flv.e;
                }
                objT = irn1.o0(iU, 0, ceoVar, 2);
                b0kVar5.s0(objT);
            }
            pxg1 pxg1Var = (pxg1) objT;
            tzg1 tzg1Var2 = rno1.a;
            if (z3) {
                b0kVar5.i0(1270108196);
                b0kVar3 = b0kVar5;
                tzg1Var = tzg1Var2;
                f2 = 0.0f;
                float fFloatValue = ((Number) zod.G(Float.valueOf(f4), z2, tzg1Var, pxg1Var, b0kVar3, i3 & 112)).floatValue();
                b0kVar3.r(false);
                fT = fFloatValue;
            } else {
                b0kVar3 = b0kVar5;
                tzg1Var = tzg1Var2;
                f2 = 0.0f;
                b0kVar3.i0(1270306255);
                b0kVar3.r(false);
                fT = f4;
            }
            boolean z6 = fT == f4;
            boolean z7 = !z6;
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            Boolean boolValueOf = Boolean.valueOf(z7);
            boolean zG = b0kVar3.g(ven0VarS) | b0kVar3.h(z7);
            Object objT2 = b0kVar3.T();
            tzg1 tzg1Var3 = tzg1Var;
            if (zG || objT2 == obj) {
                objT2 = new hj6(z7, ven0VarS, (lnm) null, (byte) 0);
                b0kVar3.s0(objT2);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT2);
            boolean zG2 = b0kVar3.g(ven0VarS);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == obj) {
                objT3 = new xj0(ven0VarS, (byte) 26);
                b0kVar3.s0(objT3);
            }
            qxd0.i(rih1.a, (iu30) objT3, b0kVar3);
            boolean z8 = i4 == 4;
            Object objT4 = b0kVar3.T();
            if (z8 || objT4 == obj) {
                if (b4g1Var.a()) {
                    qq20Var = new qq20(fT, drr0Var.s(), b4g1Var.d.s(), b4g1Var.e.s(), b4g1Var.f.s(), b4g1Var.g.s(), b4g1Var.h.s());
                } else {
                    sd6 sd6VarC = C(i, f, xd6Var, fT <= 90.0f);
                    qq20Var = new qq20(fT, fT + (xd6Var != null ? xd6Var.b.s() : f2), xd6Var != null ? xd6Var.a.s() : f2, xd6Var != null ? xd6Var.c.s() : f2, xd6Var != null ? xd6Var.d.s() : f2, sd6VarC.a, sd6VarC.b);
                }
                objT4 = qq20Var;
                b0kVar3.s0(objT4);
            }
            qq20 qq20Var2 = (qq20) objT4;
            float f5 = qq20Var2.a;
            float f6 = f4 - f5;
            float fO = f6 != f2 ? yoi1.o((fT - f5) / f6, f2, 1.0f) : 1.0f;
            if (!z6) {
                fT = dm5.T(qq20Var2.b, f4, fO);
            }
            float f7 = fT;
            if (z6 || !z3) {
                b0kVar4 = b0kVar3;
                xd6Var2 = null;
                z4 = false;
                b0kVar4.i0(1272362299);
                b0kVar4.r(false);
                f3 = 0.0f;
            } else {
                b0kVar3.i0(1272005086);
                float f8 = qq20Var2.c;
                ilv.a.getClass();
                b0k b0kVar6 = b0kVar3;
                xd6Var2 = null;
                b0kVar4 = b0kVar6;
                float fFloatValue2 = ((Number) zod.R(new hsi1("artistCardsTradingCardTiltRelease", Float.valueOf(f8), Float.valueOf(0.0f), irn1.o0(180, 0, flv.g, 2), tzg1Var3), z2, (Function0) null, b0kVar6, 8 | (i3 & 112), 4).getValue()).floatValue();
                z4 = false;
                b0kVar4.r(false);
                f3 = fFloatValue2;
            }
            boolean z9 = ((i3 & 458752) == 131072 ? true : z4) | ((i3 & 57344) == 16384 ? true : z4);
            if (i4 == 4) {
                z4 = true;
            }
            boolean z10 = z9 | z4;
            Object objT5 = b0kVar4.T();
            if (z10 || objT5 == obj) {
                objT5 = C(i, f, xd6Var2, z);
                b0kVar4.s0(objT5);
            }
            sd6 sd6Var = (sd6) objT5;
            float fT2 = dm5.T(qq20Var2.f, sd6Var.a, fO);
            float fT3 = dm5.T(qq20Var2.g, sd6Var.b, fO);
            boolean zH = b0kVar4.h(z7) | b0kVar4.d(f7) | b0kVar4.d(f3) | b0kVar4.g(qq20Var2) | b0kVar4.d(fO) | b0kVar4.d(fT2) | b0kVar4.d(fT3);
            Object objT6 = b0kVar4.T();
            if (zH || objT6 == obj) {
                b0kVar2 = b0kVar4;
                jj6 jj6Var = new jj6(b4g1Var, z7, f7, f3, qq20Var2, fO, fT2, fT3);
                b0kVar2.s0(jj6Var);
                objT6 = jj6Var;
            } else {
                b0kVar2 = b0kVar4;
            }
            qxd0.S((Function0) objT6, b0kVar2);
        } else {
            b0kVar2 = b0kVar5;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kj6(z, z2, z3, xd6Var, i, f, b4g1Var, iu30Var, i2);
        }
    }

    public static final TextView l(View view, int i, q9c1 q9c1Var) {
        int color;
        String str = q9c1Var != null ? q9c1Var.a : null;
        String str2 = q9c1Var != null ? q9c1Var.b : null;
        View viewFindViewById = view.findViewById(i);
        TextView textView = (TextView) viewFindViewById;
        textView.setText(str);
        textView.setVisibility(textView.getText().length() > 0 ? 0 : 8);
        textView.setAlpha(0.0f);
        if (str2 != null) {
            try {
                color = Color.parseColor(str2);
            } catch (IllegalArgumentException unused) {
                color = -1;
            }
            textView.setTextColor(color);
        }
        return (TextView) viewFindViewById;
    }

    public static final int m(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return jch0.U((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    public static final mr20 n(zob1 zob1Var, o8n o8nVar, int i, int i2) {
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? mgo1.r(zob1Var, o8nVar, i, i2) : zob1Var;
    }

    public static Bundle o(Notification notification) {
        return notification.extras;
    }

    public static void q(MediaButtonReceiver mediaButtonReceiver, oo70 oo70Var) {
        mediaButtonReceiver.g = oo70Var;
    }

    public static void r(MediaButtonReceiver mediaButtonReceiver, Scheduler scheduler) {
        mediaButtonReceiver.d = scheduler;
    }

    public static void s(MediaButtonReceiver mediaButtonReceiver, zce0 zce0Var) {
        mediaButtonReceiver.b = zce0Var;
    }

    public static void t(MediaButtonReceiver mediaButtonReceiver, yqu0 yqu0Var) {
        mediaButtonReceiver.c = yqu0Var;
    }

    public static void u(MediaButtonReceiver mediaButtonReceiver, Scheduler scheduler) {
        mediaButtonReceiver.e = scheduler;
    }

    public static void v(MediaButtonReceiver mediaButtonReceiver, zn41 zn41Var) {
        mediaButtonReceiver.a = zn41Var;
    }

    public static void w(MediaButtonReceiver mediaButtonReceiver, f15 f15Var) {
        mediaButtonReceiver.f = f15Var;
    }

    public static final boolean y(hmb0 hmb0Var) {
        if (hmb0Var.i == null) {
            return false;
        }
        hmb0 hmb0VarV = hmb0Var.v();
        return (hmb0VarV != null ? hmb0VarV.i : null) == null || hmb0Var.f1.b;
    }

    public static final int z(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return -16777216;
        }
    }

    public abstract void A(boolean z);

    public abstract void B(boolean z);

    public abstract TransformationMethod E(TransformationMethod transformationMethod);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);

    public abstract boolean x();
}
