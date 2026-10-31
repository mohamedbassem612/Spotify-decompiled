package p;

import android.app.Activity;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class oqo1 {
    public static final pl10 a;
    public static final pl10[] b;
    public static b180 c;

    static {
        pl10 pl10Var = new pl10(-1, 4L, "app_client", true);
        pl10 pl10Var2 = new pl10(-1, 1L, "carrier_auth", true);
        pl10 pl10Var3 = new pl10(-1, 1L, "wear3_oem_companion", true);
        a = pl10Var3;
        b = new pl10[]{pl10Var, pl10Var2, pl10Var3, new pl10(-1, 1L, "wear_await_data_sync_complete", true), new pl10(-1, 8L, "wear_backup_restore", true), new pl10(-1, 2L, "wear_consent", true), new pl10(-1, 1L, "wear_consent_recordoptin", true), new pl10(-1, 1L, "wear_consent_recordoptin_swaadl", true), new pl10(-1, 2L, "wear_consent_supervised", true), new pl10(-1, 1L, "wear_get_phone_switching_feature_status", true), new pl10(-1, 1L, "wear_fast_pair_account_key_sync", true), new pl10(-1, 1L, "wear_fast_pair_get_account_keys", true), new pl10(-1, 1L, "wear_fast_pair_get_account_key_by_account", true), new pl10(-1, 1L, "wear_flush_batched_data", true), new pl10(-1, 1L, "wear_get_related_configs", true), new pl10(-1, 1L, "wear_get_node_id", true), new pl10(-1, 2L, "wear_logging_service", true), new pl10(-1, 1L, "wear_retry_connection", true), new pl10(-1, 1L, "wear_set_cloud_sync_setting_by_node", true), new pl10(-1, 2L, "wear_first_party_consents", true), new pl10(-1, 1L, "wear_update_config", true), new pl10(-1, 1L, "wear_update_connection_retry_strategy", true), new pl10(-1, 1L, "wear_update_delay_config", true), new pl10(-1, 1L, "wearable_services", true), new pl10(-1, 1L, "wear_cancel_migration", true), new pl10(-1, 2L, "wear_customizable_screens", true), new pl10(-1, 1L, "wear_wifi_immediate_connect", true), new pl10(-1, 1L, "wear_get_node_active_network_metered", true), new pl10(-1, 3L, "wear_consents_per_watch", true), new pl10(-1, 1L, "wear_material3_experience", true), new pl10(-1, 1L, "wear_offload_connection", true), new pl10(-1, 1L, "wear_get_local_capabilities", true), new pl10(-1, 1L, "wear_notify_channel_flushed", true)};
    }

    public static final void a(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-352032806);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarF, jA, er31.b(4.0f)), cbx.b(x340Var).b.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar, i, (byte) 12);
        }
    }

    public static final void b(p2c0 p2c0Var, boolean z, iu30 iu30Var, boolean z2, b0k b0kVar, int i) {
        int i2;
        p2c0 p2c0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1940137199);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(p2c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i3 = i2;
            aex.b(z, iu30Var, null, null, 0, null, null, x340Var, (i2 >> 3) & 126, 124);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 12.0f));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new z20(iu30Var, z, (byte) 17);
                x340Var.s0(objT2);
            }
            qim0 qim0VarV = bin.v(nim0Var, idn0Var, null, false, null, null, (Function0) objT2, 28);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarV);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            p2c0Var2 = p2c0Var;
            c(p2c0Var2, x340Var, i3 & 14);
            x340Var.r(true);
            x340Var.r(true);
            String str = p2c0Var2.c;
            if (!z2 || z || str == null) {
                x340Var.i0(369871143);
                x340Var.r(false);
            } else {
                x340Var.i0(369499236);
                int i4 = af5.e;
                af5 af5VarJ = ob51.j(str, new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14), 4);
                ef5 ef5Var = new ef5(cbx.d(x340Var).k, (byte) 1);
                ye5 ye5Var = new ye5(af5VarJ);
                ye5Var.i(ef5Var);
                uwo1.d(ye5Var.p(), cbx.a(x340Var).b.d, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            p2c0Var2 = p2c0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(p2c0Var2, z, iu30Var, z2, i);
        }
    }

    public static final void c(p2c0 p2c0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-788065780);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(p2c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int i3 = af5.e;
            af5 af5VarJ = ob51.j(p2c0Var.b, new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14), 4);
            uwr uwrVar = cbx.a;
            ef5 ef5Var = new ef5(cbx.d(x340Var).k, (byte) 1);
            ye5 ye5Var = new ye5(af5VarJ);
            ye5Var.i(ef5Var);
            uwo1.f(ye5Var.p(), null, cbx.d(x340Var).j, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4090);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(p2c0Var, i, (byte) 6);
        }
    }

    public static final void d(c380 c380Var, vu30 vu30Var, cqs0 cqs0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        q2c0 q2c0Var;
        boolean z2 = z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(439829034);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(cqs0Var) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                p2c0 p2c0Var = (p2c0) it.next();
                q2c0 q2c0Var2 = p2c0Var.a;
                q2c0 q2c0Var3 = q2c0.b;
                if (q2c0Var2 != q2c0Var3) {
                    arrayList.add(p2c0Var);
                } else {
                    p2c0 p2c0Var2 = (p2c0) o7h.C0(arrayList);
                    if (p2c0Var2 == null || (q2c0Var = p2c0Var2.a) != q2c0Var3) {
                        arrayList.add(p2c0Var);
                    } else {
                        arrayList.set(p7h.L(arrayList), new p2c0(q2c0Var, xcg1.i(p2c0Var2.b, " ", p2c0Var.b), p2c0Var2.c));
                    }
                }
            }
            c380 c380VarA = mqo1.A(arrayList);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, 137609138, c380VarA);
            while (itN.hasNext()) {
                p2c0 p2c0Var3 = (p2c0) itN.next();
                int iOrdinal = p2c0Var3.a.ordinal();
                if (iOrdinal == 0) {
                    x340Var.i0(-1393020983);
                    Boolean bool = (Boolean) cqs0Var.get(p2c0Var3);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    boolean zI = x340Var.i(p2c0Var3) | ((i2 & 112) == 32);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new r2c0(vu30Var, p2c0Var3, (byte) 0);
                        x340Var.s0(objT);
                    }
                    b(p2c0Var3, zBooleanValue, (iu30) objT, z2, x340Var, i2 & 7168);
                    x340Var.r(false);
                } else if (iOrdinal == 1) {
                    x340Var.i0(-1393023231);
                    c(p2c0Var3, x340Var, 0);
                    x340Var.r(false);
                } else if (iOrdinal == 2) {
                    x340Var.i0(-1393012776);
                    a(6, apo.r(-826142851, new s2c0(p2c0Var3, (byte) 0), x340Var), x340Var);
                    x340Var.r(false);
                } else {
                    if (iOrdinal != 3) {
                        throw p3d1.k(x340Var, -1393024062, false);
                    }
                    x340Var.i0(-1393009376);
                    a(6, apo.r(-943779620, new qy90(p2c0Var3, cqs0Var, vu30Var, z2), x340Var), x340Var);
                    x340Var.r(false);
                }
                z2 = z;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((byte) 23, i, (Object) c380Var, (Object) vu30Var, (Object) cqs0Var, qim0Var, z);
        }
    }

    public static final void e(String str, gob gobVar, g5f g5fVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-599908624);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(gobVar) ? 32 : 16) | (x340Var.i(g5fVar) ? 256 : 128) | 3072;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strN0 = cwl1.n0(2131959703, new Object[]{str}, x340Var);
            af5 af5Var = new af5(cwl1.n0(2131959702, new Object[]{str}, x340Var));
            j2i j2iVarR = apo.r(-778961891, new bhs0(gobVar, g5fVar, b2), x340Var);
            qim0 qim0Var3 = nim0.a;
            o6p1.b(strN0, af5Var, qim0Var3, j2iVarR, x340Var, 3456, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, str, gobVar, g5fVar, qim0Var2, (byte) 14);
        }
    }

    public static final void f(bhx bhxVar, fhx fhxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        j2i j2iVarR;
        j2i j2iVarR2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1812461956);
        int i2 = (b0kVar3.i(bhxVar) ? 4 : 2) | i | (b0kVar3.i(fhxVar) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = b0kVar3.i(bhxVar);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                y0u y0uVar = new y0u(0, bhxVar, bhx.class, "cancel", "cancel()V", 0, (byte) 8);
                b0kVar3.s0(y0uVar);
                objT = y0uVar;
            }
            Function0 function0 = (Function0) objT;
            boolean z = fhxVar.e;
            i3u i3uVar = new i3u(4, z, z, false);
            String str = fhxVar.a;
            if (str == null) {
                b0kVar3.i0(1275027775);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(1275027776);
                j2iVarR = apo.r(-593076879, new qeu(str, (byte) 15), b0kVar3);
                b0kVar3.r(false);
            }
            iu30 iu30Var = fhxVar.g;
            if (iu30Var == null) {
                b0kVar3.i0(1275115102);
                b0kVar3.r(false);
                j2iVarR2 = null;
            } else {
                b0kVar3.i0(1275115103);
                j2iVarR2 = apo.r(1236415492, new v0j(iu30Var, (byte) 29), b0kVar3);
                b0kVar3.r(false);
            }
            if (j2iVarR2 == null) {
                b0kVar3.i0(1275234236);
                String str2 = fhxVar.b;
                if (str2 == null) {
                    b0kVar3.i0(1275234235);
                    b0kVar3.r(false);
                    j2iVarR2 = null;
                } else {
                    b0kVar3.i0(1275234236);
                    j2iVarR2 = apo.r(-55900630, new qeu(str2, (byte) 16), b0kVar3);
                    b0kVar3.r(false);
                }
            } else {
                b0kVar3.i0(1980794650);
            }
            b0kVar3.r(false);
            j2i j2iVar = j2iVarR2;
            j2i j2iVar2 = new j2i(-2000270740, new g6w(bhxVar, fhxVar.c, new idx(4), (byte) 8), true);
            ygx ygxVar = fhxVar.d;
            b0kVar2 = b0kVar3;
            mqo1.e(function0, i3uVar, null, j2iVarR, j2iVar, j2iVar2, ygxVar != null ? new j2i(-2000270740, new g6w(bhxVar, ygxVar, ldx.c, (byte) 8), true) : null, b0kVar2, 0, 4);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ghx(bhxVar, fhxVar, i);
        }
    }

    public static final void g(gw70 gw70Var, w501 w501Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1467931868);
        int i2 = (x340Var.i(gw70Var) ? 4 : 2) | i | (x340Var.g(w501Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(-1985410953, new y501(w501Var, qim0Var, iu30Var, gw70Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y501(gw70Var, w501Var, qim0Var, iu30Var, i);
        }
    }

    public static int h() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static final void i() {
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        eg.m("EncoreDialogPresenter must be called on the main thread");
    }

    public static final Integer j(xkk1 xkk1Var) {
        u7h u7hVar;
        mq70 mq70Var;
        pp70 pp70Var;
        pp70 pp70Var2;
        if (xkk1Var == null || (pp70Var2 = xkk1Var.d) == null) {
            u7hVar = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) ? null : new u7h(pp70Var.b.a.c);
        } else {
            u7hVar = new u7h(pp70Var2.b.a.c);
        }
        if (u7hVar != null) {
            return Integer.valueOf(z4p1.G(u7hVar.a));
        }
        return null;
    }

    public static final Set k(Map map) {
        return o7h.p1(q7h.V(map.values()));
    }

    public static final go80 l(klm klmVar, pbp0 pbp0Var, pbp0 pbp0Var2, pbp0 pbp0Var3, pbp0 pbp0Var4, pbp0 pbp0Var5, obp0 obp0Var, obp0 obp0Var2, pbp0 pbp0Var6, pbp0 pbp0Var7) {
        return klmVar.a("AdUnlockEligibilityDaemon", new ang(pbp0Var, pbp0Var2, pbp0Var3, pbp0Var4, pbp0Var5, obp0Var, obp0Var2, pbp0Var6, pbp0Var7, (byte) 2));
    }

    public static boolean m() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final psw n(xpw xpwVar, cgi0 cgi0Var, kly0 kly0Var, jxa jxaVar, Function0 function0, j2i j2iVar) {
        j2i j2iVar2 = new j2i(515604989, new sgi0(function0, jxaVar, cgi0Var, kly0Var, j2iVar), true);
        ien0 ien0Var = qsw.a;
        return new psw(j2iVar2, (byte) 0);
    }

    public static final mnv0 o(hii1 hii1Var) {
        Object obj = hii1Var.b;
        String str = hii1Var.a;
        if (obj instanceof Boolean) {
            return new mnv0(str);
        }
        if (obj instanceof Double) {
            return new mnv0(str);
        }
        if (obj instanceof Float) {
            return new mnv0(str);
        }
        if (obj instanceof Integer) {
            return new mnv0(str);
        }
        if (obj instanceof Long) {
            return new mnv0(str);
        }
        if (obj instanceof String) {
            return new mnv0(str);
        }
        if (obj instanceof Set) {
            return new mnv0(str);
        }
        k220.f("Unsupported storage key value type: ".concat(obj.getClass().getName()));
        return null;
    }

    public static final jge p(bpb1 bpb1Var, mr20 mr20Var, iu30 iu30Var) {
        return hu20.e(bpb1Var, new qd0((lnm) null, mr20Var, iu30Var, (byte) 19));
    }

    public static final void r(jen jenVar, j1 j1Var, n5 n5Var) {
        String str;
        String str2 = jenVar.a;
        int i = jenVar.b;
        if (i == 1) {
            str = "STARTED";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "COMPLETED";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str3 = jenVar.d;
        kgn kgnVar = new kgn(o7h.y0(f46.i0(new String[]{str2, lowerCase, str3}), ":", (String) null, (String) null, (iu30) null, 62));
        j1Var.invoke(eqr0.u(kgnVar), eqr0.v(kgnVar));
        StringBuilder sb = new StringBuilder("B ");
        sb.append(jenVar.e);
        sb.append(" [");
        sb.append(jenVar.f);
        sb.append("] Startup ");
        sb.append(i == 1 ? '>' : '<');
        sb.append(' ');
        sb.append(str2);
        if (str3 != null) {
            sb.append(" (");
            sb.append(str3);
            sb.append(')');
        }
        sb.append(" @");
        sb.append(jenVar.c);
        sb.append("ms");
        Long l = jenVar.g;
        if (l != null) {
            long jLongValue = l.longValue();
            sb.append(" (+");
            sb.append(jLongValue);
            sb.append("ms)");
        }
        n5Var.invoke(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001e A[RETURN] */
    public static final boolean s(qpt0 qpt0Var, int i) {
        int iOrdinal = qpt0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return false;
                    }
                    if (i == 2 || i == 3) {
                        return true;
                    }
                } else if (i == 3) {
                    return true;
                }
            } else if (i == 2) {
                return true;
            }
        }
        return false;
    }

    public static final bhx t(Activity activity, fhx fhxVar) {
        i();
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ComposeView composeView = new ComposeView(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        iac0 z3uVar = new z3u((byte) 0);
        iac0 iac0VarH = x9p1.h(viewGroup);
        if (iac0VarH == null) {
            iac0VarH = activity instanceof iac0 ? (iac0) activity : null;
            if (iac0VarH == null) {
                iac0VarH = z3uVar;
            }
        }
        bhx bhxVar = new bhx(composeView, z3uVar, fhxVar);
        composeView.setViewCompositionStrategy(f4x0.V0);
        x9p1.p(composeView, iac0VarH);
        iac0 iac0Var = activity instanceof sck1 ? (sck1) activity : null;
        if (iac0Var == null) {
            iac0Var = z3uVar;
        }
        lap1.o(composeView, iac0Var);
        iac0 iac0Var2 = activity instanceof qe41 ? (qe41) activity : null;
        if (iac0Var2 != null) {
            z3uVar = iac0Var2;
        }
        hm5.J(composeView, z3uVar);
        x8c0 lifecycle = iac0VarH.getLifecycle();
        bhxVar.d = lifecycle;
        lifecycle.a(bhxVar);
        composeView.addOnAttachStateChangeListener(bhxVar);
        if (lifecycle.b() == w8c0.a) {
            bhxVar.b();
        }
        if (!bhxVar.e) {
            return bhxVar;
        }
        composeView.setTag(bhxVar);
        composeView.setContent(new j2i(-179874898, new ghx(bhxVar, fhxVar, (byte) 2), true));
        viewGroup.addView((View) composeView, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(0, 0));
        return bhxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(sib sibVar, Set set, onm onmVar) {
        j110 j110Var;
        zhb m231Var;
        zhb vhbVar;
        cib cibVar;
        if (onmVar instanceof j110) {
            j110Var = (j110) onmVar;
            int i = j110Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j110Var.b = i - Integer.MIN_VALUE;
            } else {
                j110Var = new j110(onmVar);
            }
        } else {
            j110Var = new j110(onmVar);
        }
        Object objA = j110Var.a;
        int i2 = j110Var.b;
        int i3 = 1;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                j110Var.b = 1;
                objA = sibVar.a(set, qhb.BALANCED, rhb.LOW, j110Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (zhb) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            vhbVar = m231Var;
        } else {
            vhbVar = new vhb(gvg.h("Error: ", rc11.a.b(thA.getClass()).r(), ": ", thA.getMessage()));
        }
        boolean z = vhbVar instanceof xhb;
        cib cibVar2 = bib.a;
        if (z) {
            xhb xhbVar = (xhb) vhbVar;
            if (!xhbVar.equals(shb.a)) {
                if (xhbVar.equals(thb.a)) {
                    i3 = 2;
                } else if (xhbVar.equals(uhb.a)) {
                    i3 = 4;
                } else if (xhbVar.equals(whb.a)) {
                    i3 = 3;
                } else {
                    if (!(xhbVar instanceof vhb)) {
                        eg.o();
                        return null;
                    }
                    i3 = 5;
                }
            }
            cibVar = new cib(i3);
        } else {
            if (!u890.j(vhbVar, yhb.a)) {
                eg.o();
                return null;
            }
            cibVar = cibVar2;
        }
        if (cibVar.equals(cibVar2)) {
            return meo0.a;
        }
        if (cibVar instanceof cib) {
            return new neo0(cibVar.a);
        }
        if (cibVar.equals(dib.a)) {
            return oeo0.a;
        }
        eg.o();
        return null;
    }

    public static final n5f v(t7q0 t7q0Var, boolean z) {
        f7q0 f7q0Var = t7q0Var instanceof f7q0 ? (f7q0) t7q0Var : null;
        sge0 sge0Var = f7q0Var != null ? f7q0Var.f : null;
        if (z && f7q0Var != null && !(f7q0Var.e instanceof q7q0) && (sge0Var == null || (sge0Var.a instanceof oge0))) {
            return new n5f(nzy.k(f7q0Var.a), f7q0Var.c);
        }
        return null;
    }

    public static final uey0 w(t6f t6fVar, s6f s6fVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        bc71 bc71Var;
        t7q0 t7q0Var = t6fVar.a;
        bc71 bc71Var2 = t6fVar.k;
        n5f n5fVarV = v(t7q0Var, z7);
        n5f n5fVarV2 = v(s6fVar.a, z7);
        boolean z8 = n5fVarV2 != null && (!n5fVarV2.equals(n5fVarV) || bc71Var2 == null);
        t7q0 t7q0Var2 = s6fVar.a;
        boolean z9 = z ? s6fVar.d : false;
        boolean z10 = z2 ? s6fVar.e : false;
        boolean z11 = z3 ? s6fVar.c : false;
        boolean z12 = s6fVar.f;
        int i = z4 ? s6fVar.b : 1;
        if (n5fVarV2 == null) {
            bc71Var = null;
        } else {
            if (z8) {
                bc71Var2 = kb71.a;
            }
            bc71Var = bc71Var2;
        }
        t6f t6fVarX = x(t6f.a(t6fVar, t7q0Var2, z9, z10, z11, z12, i, null, false, null, null, bc71Var, 960), z5, z6);
        if (!z8) {
            n5fVarV2 = null;
        }
        return new uey0(t6fVarX, n5fVarV2);
    }

    public static final t6f x(t6f t6fVar, boolean z, boolean z2) {
        fg91 fg91VarA;
        if (z) {
            smc0 smc0VarN = k4p1.n();
            if (t6fVar.b) {
                smc0VarN.add(m5f.a);
            }
            if (t6fVar.f != 1) {
                smc0VarN.add(m5f.b);
            }
            if (t6fVar.c) {
                if (z2) {
                    smc0VarN.add(m5f.c);
                }
                smc0VarN.add(m5f.d);
            }
            fg91VarA = mqo1.A(k4p1.k(smc0VarN));
        } else {
            fg91VarA = fg91.b;
        }
        fg91 fg91Var = fg91VarA;
        return t6f.a(t6fVar, null, false, false, false, false, 0, fg91Var, t6fVar.h && !fg91Var.isEmpty() && t6fVar.a == null, null, null, null, 1855);
    }

    public static final qt20 y(mgb mgbVar) {
        b7x b7xVar = b7x.a;
        return z4p1.v(new ipr(new mmr0(b7xVar, b7xVar), mgbVar, new uvc(3, (lnm) null, (byte) 4), (byte) 16), 1);
    }
}
