package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.os.Trace;
import android.text.format.DateUtils;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import com.spotify.concertcampaignview.v1.CtaType;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rqo1 {
    public static final pl10[] a = {new pl10("name_ulr_private", 1), new pl10("name_sleep_segment_request", 1), new pl10("get_last_activity_feature_id", 1), new pl10("support_context_feature_id", 1), new pl10("get_current_location", 2), new pl10("get_last_location_with_request", 1), new pl10("set_mock_mode_with_callback", 1), new pl10("set_mock_location_with_callback", 1), new pl10("inject_location_with_callback", 1), new pl10("location_updates_with_callback", 1), new pl10("use_safe_parcelable_in_intents", 1), new pl10("flp_debug_updates", 1), new pl10("google_location_accuracy_enabled", 1), new pl10("geofences_with_callback", 1), new pl10("location_enabled", 1)};
    public static b180 b;

    public static final void a(long j, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, j2i j2iVar3, b0k b0kVar, int i) {
        long jA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(502335947);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT2;
            erl1 erl1Var = (erl1) x340Var.k(ede0.a);
            kiv kivVar = t4k.h;
            int iD = erl1Var.d((wat) x340Var.k(kivVar));
            x340Var.i0(1708520701);
            wat watVar = (wat) x340Var.k(kivVar);
            uwr uwrVar = cbx.a;
            int iI0 = watVar.i0(cbx.b(x340Var).e.c);
            x340Var.r(false);
            tob1 tob1VarC = z95.c((!((Boolean) ven0Var.getValue()).booleanValue() || err0Var.s() <= 0) ? err0Var.s() + iI0 + iD : 0, irn1.o0((!((Boolean) ven0Var.getValue()).booleanValue() || err0Var.s() <= 0) ? 0 : 1000, 0, null, 4), (String) null, (iu30) null, x340Var, 0, 12);
            float f = 0.0f;
            tob1 tob1VarB = z95.b((!((Boolean) ven0Var.getValue()).booleanValue() || err0Var.s() <= 0) ? 0.0f : 1.0f, irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, null, 4), (String) null, (iu30) null, x340Var, 0, 28);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(0);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            tob1 tob1VarC2 = z95.c((!((Boolean) ven0Var.getValue()).booleanValue() || b(ven0Var2) <= 0) ? -b(ven0Var2) : 0, irn1.o0((!((Boolean) ven0Var.getValue()).booleanValue() || b(ven0Var2) <= 0) ? 0 : 500, (!((Boolean) ven0Var.getValue()).booleanValue() || b(ven0Var2) <= 0) ? 0 : 900, null, 4), (String) null, (iu30) null, x340Var, 0, 12);
            if (((Boolean) ven0Var.getValue()).booleanValue() && b(ven0Var2) > 0) {
                f = 1.0f;
            }
            tob1 tob1VarB2 = z95.b(f, irn1.o0((!((Boolean) ven0Var.getValue()).booleanValue() || b(ven0Var2) <= 0) ? 0 : 500, (!((Boolean) ven0Var.getValue()).booleanValue() || b(ven0Var2) <= 0) ? 0 : 900, null, 4), (String) null, (iu30) null, x340Var, 0, 28);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1708560880);
                x340Var.r(false);
                jA = j;
            } else {
                x340Var.i0(1708562383);
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            }
            tob1 tob1VarA = w191.a(jA, irn1.o0(((Boolean) ven0Var.getValue()).booleanValue() ? 1000 : 0, 0, null, 6), null, x340Var, 0, 12);
            String strO0 = cwl1.o0(x340Var, 2131959518);
            boolean zG = x340Var.g(strO0);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new hqa1(strO0, (byte) 9);
                x340Var.s0(objT4);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT4);
            long j2 = ((u7h) tob1VarA.getValue()).a;
            boolean zI = x340Var.i(ven0Var2) | x340Var.i(tob1VarC2) | x340Var.i(tob1VarB2);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new ny51(ven0Var2, tob1VarC2, tob1VarB2, (byte) 29);
                x340Var.s0(objT5);
            }
            iu30 iu30Var = (iu30) objT5;
            boolean zI2 = x340Var.i(err0Var) | x340Var.i(tob1VarC) | x340Var.i(tob1VarB);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new rsc1(err0Var, tob1VarC, tob1VarB, (byte) 0);
                x340Var.s0(objT6);
            }
            p(j2, iu30Var, (iu30) objT6, j2iVar, j2iVar2, qim0VarB, j2iVar3, x340Var, 1600512);
            x340Var = x340Var;
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zI3 = x340Var.i(ven0Var);
            Object objT7 = x340Var.T();
            if (zI3 || objT7 == m4cVar) {
                objT7 = new vk1(ven0Var, (lnm) null, (byte) 29);
                x340Var.s0(objT7);
            }
            qxd0.t(bool, x340Var, (vu30) objT7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rb9(j, j2iVar, j2iVar2, qim0Var, j2iVar3, i);
        }
    }

    public static final int b(ven0 ven0Var) {
        return ((Number) ven0Var.getValue()).intValue();
    }

    public static final void c(q7r0 q7r0Var, msc1 msc1Var, jsq jsqVar, ksq ksqVar, uep uepVar, k740 k740Var, stt0 stt0Var, d0r d0rVar, b0k b0kVar, int i) {
        x340 x340Var;
        s7r0 s7r0Var = q7r0Var.d;
        lsc1 lsc1Var = msc1Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-205784196);
        int i2 = i | (x340Var2.i(q7r0Var) ? 4 : 2) | (x340Var2.i(msc1Var) ? 32 : 16) | (x340Var2.i(jsqVar) ? 256 : 128) | (x340Var2.i(ksqVar) ? 2048 : 1024) | (x340Var2.i(uepVar) ? 16384 : 8192) | (x340Var2.i(k740Var) ? 131072 : 65536) | (x340Var2.i(stt0Var) ? 1048576 : 524288) | (x340Var2.i(d0rVar) ? 8388608 : 4194304);
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                iac0 iac0Var = s7r0Var.c;
                njm njmVar = new njm(q7r0Var);
                uw0 uw0Var = (uw0) jsqVar.a.c;
                pp11 pp11Var = (pp11) ((isc1) uw0Var.d).b.get();
                isc1 isc1Var = (isc1) uw0Var.d;
                isc1 isc1Var2 = (isc1) uw0Var.d;
                ckt0 ckt0Var = new ckt0(pp11Var, (kt91) isc1Var.d.get(), (i1r0) isc1Var2.h.get(), (y390) isc1Var2.i.get(), (n9r0) isc1Var2.e.get(), xqu.a((ipq) uw0Var.h), uw0Var.z(), d0rVar, iac0Var, njmVar, k740Var, stt0Var);
                x340Var2.s0(ckt0Var);
                objT = ckt0Var;
            }
            int i3 = 72 | ((i2 >> 15) & 896);
            i1o1.e((ckt0) objT, new xjt0(lsc1Var.d, lsc1Var.e, lsc1Var.b, lsc1Var.c, msc1Var.c), d0rVar, null, null, null, null, 0, null, x340Var2, i3, 252);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                njm njmVar2 = new njm(q7r0Var);
                n6r0 n6r0Var = cwl1.D(s7r0Var.b()).a;
                uw0 uw0Var2 = (uw0) ksqVar.a.c;
                a931 a931Var = (a931) ((jly0) uw0Var2.t).get();
                isc1 isc1Var3 = (isc1) uw0Var2.d;
                isc1 isc1Var4 = (isc1) uw0Var2.d;
                hc41 hc41Var = new hc41(a931Var, (kt91) isc1Var3.d.get(), (ccc0) isc1Var4.g.get(), (n9r0) isc1Var4.e.get(), (Flowable) isc1Var4.o.get(), (w9u0) ((jly0) uw0Var2.X).get(), uw0Var2.z(), d0rVar, njmVar2, n6r0Var);
                x340Var2.s0(hc41Var);
                objT2 = hc41Var;
            }
            i1o1.e((hc41) objT2, new bc41(lsc1Var.d, lsc1Var.e, lsc1Var.b, lsc1Var.c, msc1Var.d), d0rVar, null, null, null, null, 0, null, x340Var2, i3, 252);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = uepVar.a(new njm(q7r0Var));
                x340Var2.s0(objT3);
            }
            otw.c((twg1) objT3, new rwg1(dj20.e(lsc1Var.a, (sg90) null), 2), (qim0) null, (ipb1) null, x340Var2, 8, 12);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wy51((Object) q7r0Var, (Object) msc1Var, (Object) jsqVar, (Object) ksqVar, (Object) uepVar, (Object) k740Var, (Object) stt0Var, (Object) d0rVar, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void d(j2i j2iVar, qim0 qim0Var, zqo1 zqo1Var, boolean z, vu30 vu30Var, vu30 vu30Var2, kuo1 kuo1Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        vu30 vu30Var3;
        int i3;
        vu30 vu30Var4;
        int i4;
        int i5;
        boolean z2;
        vu30 vu30Var5;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1547843109);
        int i6 = i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.g(zqo1Var) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i6 | 24576;
            vu30Var3 = vu30Var;
        } else {
            vu30Var3 = vu30Var;
            i3 = i6 | (x340Var.i(vu30Var3) ? 16384 : 8192);
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((i & 196608) == 0) {
                vu30Var4 = vu30Var2;
                i3 |= x340Var.i(vu30Var4) ? 131072 : 65536;
            }
            if (x340Var.g(kuo1Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i5 = i3 | i4;
            if ((599187 & i5) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i5 & 1, z2)) {
                if (i7 != 0) {
                    vu30Var3 = null;
                }
                if (i8 != 0) {
                    vu30Var4 = null;
                }
                if (zqo1Var.equals(o7f.f)) {
                    x340Var.i0(1418556458);
                    vu30 vu30Var6 = vu30Var3;
                    vu30 vu30Var7 = vu30Var4;
                    f(((i5 << 6) & 7168) | ((i5 >> 12) & 14) | 48 | ((i5 >> 9) & 896), j2iVar, x340Var, vu30Var6, vu30Var7, qim0Var);
                    vu30Var3 = vu30Var6;
                    vu30Var4 = vu30Var7;
                    x340Var.r(false);
                } else if (zqo1Var.equals(p7f.f)) {
                    x340Var.i0(1418559937);
                    int i9 = i5 << 6;
                    k(vu30Var3, j2iVar, vu30Var4, qim0Var, kuo1Var, z, x340Var, ((i5 >> 6) & 57344) | ((i5 >> 12) & 14) | 48 | ((i5 >> 9) & 896) | (i9 & 7168) | (i9 & 458752));
                    x340Var.r(false);
                } else {
                    if (zqo1Var.equals(q7f.f)) {
                        throw p3d1.k(x340Var, 1418555182, false);
                    }
                    x340Var.i0(1418566245);
                    int i10 = i5 << 6;
                    l(vu30Var3, j2iVar, vu30Var4, qim0Var, kuo1Var, z, x340Var, ((i5 >> 6) & 57344) | ((i5 >> 12) & 14) | 48 | ((i5 >> 9) & 896) | (i10 & 7168) | (i10 & 458752));
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            vu30Var5 = vu30Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j7f(j2iVar, qim0Var, zqo1Var, z, vu30Var5, vu30Var4, kuo1Var, i, i2);
            }
        }
        i3 |= 196608;
        vu30Var4 = vu30Var2;
        if (x340Var.g(kuo1Var)) {
            i4 = 1048576;
        } else {
            i4 = 524288;
        }
        i5 = i3 | i4;
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i5 & 1, z2)) {
            if (i7 != 0) {
                vu30Var3 = null;
            }
            if (i8 != 0) {
                vu30Var4 = null;
            }
            if (zqo1Var.equals(o7f.f)) {
                x340Var.i0(1418556458);
                vu30 vu30Var8 = vu30Var3;
                vu30 vu30Var9 = vu30Var4;
                f(((i5 << 6) & 7168) | ((i5 >> 12) & 14) | 48 | ((i5 >> 9) & 896), j2iVar, x340Var, vu30Var8, vu30Var9, qim0Var);
                vu30Var3 = vu30Var8;
                vu30Var4 = vu30Var9;
                x340Var.r(false);
            } else if (zqo1Var.equals(p7f.f)) {
                x340Var.i0(1418559937);
                int i11 = i5 << 6;
                k(vu30Var3, j2iVar, vu30Var4, qim0Var, kuo1Var, z, x340Var, ((i5 >> 6) & 57344) | ((i5 >> 12) & 14) | 48 | ((i5 >> 9) & 896) | (i11 & 7168) | (i11 & 458752));
                x340Var.r(false);
            } else {
                if (zqo1Var.equals(q7f.f)) {
                    throw p3d1.k(x340Var, 1418555182, false);
                }
                x340Var.i0(1418566245);
                int i12 = i5 << 6;
                l(vu30Var3, j2iVar, vu30Var4, qim0Var, kuo1Var, z, x340Var, ((i5 >> 6) & 57344) | ((i5 >> 12) & 14) | 48 | ((i5 >> 9) & 896) | (i12 & 7168) | (i12 & 458752));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        vu30Var5 = vu30Var3;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j7f(j2iVar, qim0Var, zqo1Var, z, vu30Var5, vu30Var4, kuo1Var, i, i2);
        }
    }

    public static final void e(String str, long j, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        Object wn2Var;
        frr0 frr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-489454558);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.m(Long.max(j - SystemClock.elapsedRealtime(), 0L), x340Var);
            }
            frr0 frr0Var2 = (frr0) objT;
            Long lValueOf = Long.valueOf(frr0Var2.s());
            boolean zI = ((i2 & 896) == 256) | ((i2 & 112) == 32) | x340Var.i(frr0Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                frr0Var = frr0Var2;
                wn2Var = new wn2(j, function1, frr0Var, (lnm) null, (byte) 14);
                x340Var.s0(wn2Var);
            } else {
                wn2Var = objT2;
                frr0Var = frr0Var2;
            }
            qxd0.t(lValueOf, x340Var, (vu30) wn2Var);
            String elapsedTime = DateUtils.formatElapsedTime(frr0Var.s() / 1000);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ktx ktxVar = ktx.c;
            long j2 = cbx.a(x340Var).b.e;
            cvx cvxVar2 = cbx.b(x340Var).b;
            w0h1.a(ktxVar, isl.a, uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), j2, 0L, false, x340Var, ktx.d | 48, 48);
            elapsedTime.getClass();
            uwo1.e(nhc1.W(str, "{timeRemaining}", elapsedTime), null, cbx.d(x340Var).k, cbx.a(x340Var).b.e, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new je3((Object) str, j, (Object) function0, i, (byte) 6);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var) {
        int i2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-624616526);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(32.0f, 0.0f, 2, qim0Var);
            fra fraVar = een.O0;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(-1824325542);
                x340Var.r(false);
            } else {
                x340Var.i0(-1824325541);
                mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(-349896068, new k7f((byte) 0, vu30Var, false), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            qim0 qim0VarThen = new wnb0(1.0f, true).then(new i5j1(een.N0));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
            if (vu30Var2 == null) {
                x340Var.i0(-1824071590);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(-1824071589);
                z = true;
                mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(202452915, new k7f((byte) 1, vu30Var2, false), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, vu30Var, j2iVar, vu30Var2, qim0Var, (byte) 18);
        }
    }

    public static final void g(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-114457317);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            op71.g(x340Var, dug.f(u291.h(qim0VarF, 1.0f), cbx.a(x340Var).a.b.c(), d4o1.a));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt9(qim0Var, i, i2);
        }
    }

    public static final void h(mr20 mr20Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1794891564);
        int i2 = (x340Var.i(mr20Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ven0 ven0VarG = rwq.g(mr20Var, "", null, x340Var, (i2 & 14) | 48, 2);
            if (((CharSequence) ven0VarG.getValue()).length() > 0) {
                x340Var.i0(728391299);
                String str = (String) ven0VarG.getValue();
                uwr uwrVar = cbx.a;
                uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            } else {
                x340Var.i0(728524878);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cvn(mr20Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.c380 */
    public static final void i(String str, String str2, c380 c380Var, String str3, String str4, c380 c380Var2, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) throws c380, NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-340336177);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(c380Var) : b0kVar3.i(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(c380Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            nim0 nim0Var = nim0.a;
            if (str3 == null) {
                b0kVar3.i0(1463020438);
                b0kVar3.r(false);
                z = false;
                b0kVar2 = b0kVar3;
            } else {
                b0kVar3.i0(1463020439);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                lrn1.h((i3 >> 18) & 112, 0, str3, function0, b0kVar3, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                b0kVar2 = b0kVar3;
                b0kVar2.r(false);
                z = false;
            }
            boolean z2 = z;
            r6x r6xVar = r6x.a;
            hap1.a(new ee30(str, (String) null, str2, false, c380Var), iu30Var, r6xVar, r6xVar, null, null, b0kVar2, (i3 >> 15) & 112, 48);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            boolean z3 = (3670016 & i3) != 1048576 ? z2 : true;
            Object objT = b0kVar2.T();
            if (z3 || objT == fkj0.X) {
                objT = new g0s0(iu30Var, (byte) 8);
                b0kVar2.s0(objT);
            }
            int i4 = i3 >> 6;
            suo1.c(str2, true, str4, c380Var2, (Function0) objT, qim0VarB, b0kVar2, ((i3 >> 3) & 14) | 48 | (i4 & 896) | (i4 & 7168));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(str, str2, c380Var, str3, str4, c380Var2, iu30Var, function0, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.c380 */
    public static final void j(ihs0 ihs0Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, Function0 function1, b0k b0kVar, int i) throws c380, NoWhenBranchMatchedException {
        Function0 function2;
        ehs0 ehs0Var = ihs0Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1706386659);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(ihs0Var) : x340Var.i(ihs0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            function2 = function0;
            i2 |= x340Var.i(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function1) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            uwo1.e(ihs0Var.b, null, cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.i0(234407795);
            for (hhs0 hhs0Var : ihs0Var.c) {
                o(hhs0Var.c, 0, hhs0Var.a, hhs0Var.b, x340Var);
            }
            x340Var.r(false);
            String str = ihs0Var.g;
            if (str == null) {
                x340Var.i0(-1323208905);
                x340Var.r(false);
            } else {
                x340Var.i0(-1323208904);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                x340Var = x340Var;
                x340Var.r(false);
            }
            ghs0 ghs0Var = ihs0Var.d;
            if (ghs0Var == null) {
                x340Var.i0(-1323018689);
            } else {
                x340Var.i0(-1323018688);
                m(ghs0Var.a, ghs0Var.b, x340Var, 0);
            }
            x340Var.r(false);
            if (ehs0Var == null) {
                x340Var.i0(-1322954550);
                x340Var.r(false);
            } else {
                x340Var.i0(-1322954549);
                e(ehs0Var.b, ehs0Var.a, function2, x340Var, (i2 << 3) & 896);
                x340Var.r(false);
            }
            fhs0 fhs0Var = ihs0Var.f;
            if (fhs0Var == null) {
                x340Var.i0(-1322840780);
                x340Var.r(false);
            } else {
                x340Var.i0(-1322840779);
                x340 x340Var2 = x340Var;
                i(fhs0Var.a, fhs0Var.b, fhs0Var.c, fhs0Var.d, fhs0Var.e, fhs0Var.f, iu30Var, function1, x340Var2, ((i2 << 12) & 3670016) | ((i2 << 9) & 29360128));
                x340Var = x340Var2;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(ihs0Var, function0, iu30Var, qim0Var, function1, i, (byte) 14);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, qim0 qim0Var, kuo1 kuo1Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        j2i j2iVar2;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        vu30 vu30Var3 = vu30Var2;
        fra fraVar = een.Z;
        fra fraVar2 = een.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1711266341);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(kuo1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = er31.b(20.0f);
                x340Var.s0(objT);
            }
            cr31 cr31Var = (cr31) objT;
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            float f3 = zjy.p(0.0f, new p3v(4.0f)).a;
            if (kuo1Var.equals(jys0.b)) {
                x340Var.i0(445539743);
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            } else {
                if (!kuo1Var.equals(kys0.b)) {
                    throw p3d1.k(x340Var, 445537062, false);
                }
                x340Var.i0(445541827);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 4.0f;
            }
            fra fraVar3 = z ? fraVar2 : een.N0;
            if (!z) {
                fraVar2 = fraVar;
            }
            cvx cvxVar3 = cbx.b(x340Var).b;
            int i3 = i2;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            pw31 pw31Var = pw31.a;
            nim0 nim0Var = nim0.a;
            fra fraVar4 = fraVar3;
            qim0 qim0VarF = dug.f(i1p1.q(pw31Var.a(1.0f, nim0Var, true), cr31Var), cbx.a(x340Var).a.b.a(), d4o1.a);
            if (vu30Var != null) {
                x340Var.i0(-1329830681);
                cvx cvxVar4 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 4.0f;
            } else {
                x340Var.i0(-1329828925);
                cvx cvxVar5 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 16.0f;
            }
            qim0 qim0VarJ = u291.j(40.0f, 0.0f, 2, uyn1.B(qim0VarF, f2, 0.0f, f, 0.0f, 10));
            cvx cvxVar6 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarJ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(-124472015);
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-124472014);
                mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(1113878665, new l7f(z, f3, vu30Var, (byte) 0), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            qim0 qim0VarE3 = pw31Var.e(pw31Var.a(1.0f, nim0Var, true), fraVar4);
            mta mtaVar2 = cbx.b(x340Var).d;
            qim0 qim0VarJ2 = u291.j(32.0f, 0.0f, 2, qim0VarE3);
            gfh0 gfh0VarC = t1c.c(een.h, z2);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarJ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            k4s0.i((i3 >> 3) & 14, j2iVar2, x340Var, true, true);
            if (vu30Var2 == null) {
                x340Var.i0(1725837869);
                x340Var.r(false);
                vu30Var3 = vu30Var2;
                z3 = true;
            } else {
                x340Var.i0(1725837870);
                vu30Var3 = vu30Var2;
                z3 = true;
                mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(-257241435, new l7f(z, f3, vu30Var3, (byte) 1), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            x340Var.r(z3);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m7f(vu30Var, j2iVar2, vu30Var3, qim0Var, kuo1Var, z, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, qim0 qim0Var, kuo1 kuo1Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        j2i j2iVar2;
        vu30 vu30Var3;
        float f;
        float f2;
        boolean z2;
        fra fraVar = een.Z;
        fra fraVar2 = een.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2006119556);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(kuo1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            if (kuo1Var.equals(jys0.b)) {
                x340Var.i0(-559407157);
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            } else {
                if (!kuo1Var.equals(kys0.b)) {
                    throw p3d1.k(x340Var, -559409838, false);
                }
                x340Var.i0(-559404980);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 2.0f;
            }
            fra fraVar3 = z ? fraVar2 : een.N0;
            if (!z) {
                fraVar2 = fraVar;
            }
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            pw31 pw31Var = pw31.a;
            int i3 = i2;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(pw31Var.a(1.0f, nim0Var, true), cr31VarB), cbx.a(x340Var).a.b.a(), d4o1.a);
            if (vu30Var != null) {
                x340Var.i0(53631824);
                cvx cvxVar4 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 2.0f;
            } else {
                x340Var.i0(53633583);
                cvx cvxVar5 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 12.0f;
            }
            qim0 qim0VarB = uyn1.B(qim0VarF, f2, 0.0f, f, 0.0f, 10);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(32.0f, 0.0f, 2, qim0VarB);
            cvx cvxVar6 = cbx.b(x340Var).b;
            fra fraVar4 = fraVar3;
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarJ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(1008177488);
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(1008177489);
                mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(1784035378, new n7f((byte) 0, vu30Var, z), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            qim0 qim0VarE3 = pw31Var.e(pw31Var.a(1.0f, nim0Var, true), fraVar4);
            mta mtaVar2 = cbx.b(x340Var).d;
            qim0 qim0VarJ2 = u291.j(32.0f, 0.0f, 2, qim0VarE3);
            gfh0 gfh0VarC = t1c.c(een.h, z2);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarJ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            k4s0.i((i3 >> 3) & 14, j2iVar2, x340Var, true, true);
            if (vu30Var2 == null) {
                x340Var.i0(1663425064);
                x340Var.r(false);
                vu30Var3 = vu30Var2;
            } else {
                x340Var.i0(1663425065);
                vu30Var3 = vu30Var2;
                mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(-1278728114, new k7f((byte) 2, vu30Var3, false), x340Var), x340Var, 56);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            vu30Var3 = vu30Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m7f(vu30Var, j2iVar2, vu30Var3, qim0Var, kuo1Var, z, i, (byte) 1);
        }
    }

    public static final void m(String str, String str2, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1525009788);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vng vngVar = (vng) x340Var.k(t4k.e);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                byte[] bArrDecode = Base64.decode(str, 0);
                objT2 = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                x340Var.s0(objT2);
            }
            Bitmap bitmap = (Bitmap) objT2;
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.booleanValue();
            boolean zI = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new hj6(ven0Var, (lnm) null, (byte) 18);
                x340Var.s0(objT3);
            }
            qxd0.t(bool, x340Var, (vu30) objT3);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            bitmap.getClass();
            cwl1.g(new yk4(bitmap), (String) null, u291.r(nim0Var, 200.0f), (j6m) null, 0, x340Var, 48, 248);
            if (str2 == null) {
                x340Var.i0(1542427001);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(1542427002);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                j4e1 j4e1VarD = as10.d(cbx.a(x340Var).b.a, cbx.a(x340Var).a.c, cbx.a(x340Var).a.c, cbx.a(x340Var).c.b, cbx.a(x340Var).c.b, 0L, x340Var, 2147477454);
                Object objT4 = x340Var.T();
                if (objT4 == obj) {
                    objT4 = egs0.h;
                    x340Var.s0(objT4);
                }
                z = true;
                wpb1.g(str2, (iu30) objT4, qim0VarB2, false, true, (lee1) null, (vu30) null, apo.r(347750339, new tbs0(vngVar, str2, ven0Var, (byte) 1), x340Var), (vu30) null, (vu30) null, false, (elk1) null, (kua0) null, (bua0) null, false, 0, 0, (hw61) null, j4e1VarD, x340Var, 805330992, 0, 4193768);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 14, i, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void n(o501 o501Var, boolean z, boolean z2, boolean z3, e601 e601Var, b0k b0kVar, int i, int i2) {
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        h311 h311VarV;
        boolean z8;
        boolean z9;
        gbe0 gbe0Var;
        c380 c380VarA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2902600);
        int i8 = (x340Var.g(o501Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i8 |= x340Var.h(z) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z4 = z2;
                i8 |= x340Var.h(z4) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i8 | 3072;
            } else {
                if (x340Var.h(z3)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 = i8 | i4;
            }
            if (x340Var.g(e601Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i7 = i5 | i6;
            if ((i7 & 9363) != 9362) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i7 & 1, z5)) {
                if (i9 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                if (i3 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                int i10 = i7 & 65534;
                x340Var.i0(-1450706067);
                gbe0Var = o501Var.c;
                if (gbe0Var instanceof gbe0) {
                    c380VarA = mqo1.A(gbe0Var.a.a);
                } else {
                    c380VarA = mqo1.A(z6x.a);
                }
                boolean z10 = gbe0Var instanceof qbe0;
                int i11 = (i10 << 3) & 8064;
                int i12 = i10 << 15;
                e601Var.d(c380VarA, o501Var.d, z, z8, o501Var.b, o501Var.a, z10, (qim0) null, z9, x340Var, i11 | (234881024 & i12) | (i12 & 1879048192));
                x340Var.r((boolean) r11);
                z6 = z8;
                z7 = z9;
            } else {
                x340Var.b0();
                z6 = z4;
                z7 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new z501(o501Var, z, z6, z7, e601Var, i, i2);
            }
        }
        i8 |= 384;
        z4 = z2;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i8 | 3072;
        } else {
            if (x340Var.h(z3)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i8 | i4;
        }
        if (x340Var.g(e601Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        i7 = i5 | i6;
        if ((i7 & 9363) != 9362) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x340Var.Y(i7 & 1, z5)) {
            if (i9 != 0) {
                z8 = true;
            } else {
                z8 = z4;
            }
            if (i3 != 0) {
                z9 = false;
            } else {
                z9 = z3;
            }
            int i13 = i7 & 65534;
            x340Var.i0(-1450706067);
            gbe0Var = o501Var.c;
            if (gbe0Var instanceof gbe0) {
                c380VarA = mqo1.A(gbe0Var.a.a);
            } else {
                c380VarA = mqo1.A(z6x.a);
            }
            boolean z11 = gbe0Var instanceof qbe0;
            int i14 = (i13 << 3) & 8064;
            int i15 = i13 << 15;
            e601Var.d(c380VarA, o501Var.d, z, z8, o501Var.b, o501Var.a, z11, (qim0) null, z9, x340Var, i14 | (234881024 & i15) | (i15 & 1879048192));
            x340Var.r((boolean) r11);
            z6 = z8;
            z7 = z9;
        } else {
            x340Var.b0();
            z6 = z4;
            z7 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z501(o501Var, z, z6, z7, e601Var, i, i2);
        }
    }

    public static final void o(int i, int i2, String str, String str2, b0k b0kVar) {
        String str3;
        x340 x340Var;
        uox uoxVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1587840531);
        j06 j06Var = x340Var2.a;
        int i3 = (x340Var2.g(str) ? 4 : 2) | i2 | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.e(l1d.C(i)) ? 256 : 128);
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                uoxVar = jlx.c;
            } else if (iC == 1) {
                uoxVar = qtx.c;
            } else if (iC == 2) {
                uoxVar = dnx.c;
            } else if (iC == 3) {
                uoxVar = blx.c;
            } else {
                if (iC != 4) {
                    eg.o();
                    return;
                }
                uoxVar = uox.c;
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            w0h1.a(uoxVar, isl.a, uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), cbx.a(x340Var2).b.b, 0L, false, x340Var2, 56, 48);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(str, null, cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2042);
            str3 = str2;
            uwo1.e(str3, null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, (i3 >> 3) & 14, 0, 2034);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            str3 = str2;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dhs0(str, str3, i, i2);
        }
    }

    public static final void p(long j, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, j2i j2iVar3, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1532242961);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 131072 : 65536;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar3) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            h1p1.h(qim0Var2, null, new u7h(j), apo.r(1930875555, new nu31(j2iVar, iu30Var, j2iVar2, (byte) 26), x340Var), apo.r(-1098020956, new xw91(iu30Var2, j2iVar3, (byte) 10), x340Var), x340Var, ((i2 >> 15) & 14) | 27648 | ((i2 << 6) & 896), 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qta0(j, iu30Var, iu30Var2, j2iVar, j2iVar2, qim0Var, j2iVar3, i);
        }
    }

    public static final void q(rdi1 rdi1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1795290508);
        int i2 = (x340Var.g(rdi1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            qim0 qim0Var3 = nim0.a;
            w2g0.c(anm1.N("user-listening-status", u291.d(qim0Var3, 1.0f)), (tl3) null, apo.r(-1064328502, new n8k0(z, rdi1Var, function0, (byte) 19), x340Var), x340Var, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) rdi1Var, (Object) function0, (Object) qim0Var2, i, (byte) 17);
        }
    }

    public static final byte[] r(byte[] bArr, byte[] bArr2) {
        Object m231Var;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            m231Var = mac.doFinal(bArr2);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return (byte[]) m231Var;
    }

    public static String s(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
            return str;
        }
        String strZ = uic.y(s4b1VarX.h()).z();
        strZ.getClass();
        return strZ;
    }

    public static final ni7 t(Object obj, rf01 rf01Var, jmr0 jmr0Var, jmr0 jmr0Var2, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, j6m j6mVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        gi7 gi7Var = (gi7) x340Var.k(pce0.a);
        int i = xpi1.b;
        ia4 d5e1Var = (jmr0Var == null && jmr0Var2 == null && jmr0Var2 == null) ? ni7.W0 : new d5e1(jmr0Var, jmr0Var2, jmr0Var2, (byte) 7);
        iu30 d5e1Var2 = (iu30Var == null && iu30Var2 == null && iu30Var3 == null) ? null : new d5e1(iu30Var, iu30Var2, iu30Var3);
        x340Var.i0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            zy70 zy70VarC = xpi1.c(obj, x340Var);
            xpi1.f(zy70VarC);
            hi7 hi7Var = new hi7(rf01Var, zy70VarC, gi7Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new ni7(hi7Var);
                x340Var.s0(objT);
            }
            ni7 ni7Var = (ni7) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            ni7Var.Z = (c9n) objT2;
            ni7Var.N0 = d5e1Var;
            ni7Var.O0 = d5e1Var2;
            ni7Var.P0 = j6mVar;
            ni7Var.Q0 = 1;
            ni7Var.R0 = xpi1.a(x340Var);
            ni7Var.k(hi7Var);
            x340Var.r(false);
            return ni7Var;
        } finally {
            Trace.endSection();
        }
    }

    public static final ArrayList u(String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            bhi0 bhi0Var = (bhi0) obj;
            arrayList2.add(new ggi0(l1d.k(i, str, "-"), l1d.k(i, str2, "-"), bhi0Var.a, bhi0Var.b));
            i = i2;
        }
        return arrayList2;
    }

    public static final EntityType v(k620 k620Var) {
        switch (k620Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return null;
            case 1:
                return EntityType.Artist;
            case 2:
                return EntityType.Song;
            case 3:
                return EntityType.Album;
            case 4:
                return EntityType.Playlist;
            case 5:
                return EntityType.Podcast;
            case 6:
                return EntityType.Episode;
            case 7:
                return EntityType.Audiobook;
            default:
                eg.o();
                return null;
        }
    }

    public static final k620 w(EntityType entityType) {
        switch (k010.a[entityType.ordinal()]) {
            case 1:
                return k620.b;
            case 2:
                return k620.c;
            case 3:
                return k620.d;
            case 4:
                return k620.e;
            case 5:
                return k620.f;
            case 6:
                return k620.g;
            case 7:
                return k620.h;
            default:
                eg.o();
                return null;
        }
    }
}
