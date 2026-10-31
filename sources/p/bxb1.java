package p;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.protobuf.Timestamp;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bxb1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bxb1(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        tf60 tf60Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                int iIndexOf = ((xwb1) obj2).a.indexOf(((vwb1) obj3).a);
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                kwk0 kwk0Var = (kwk0) ((cxb1) obj4).h.getValue();
                Integer numValueOf = Integer.valueOf(iIndexOf);
                kwk0Var.getClass();
                x6h1 x6h1VarC = kwk0Var.a.c();
                x6h1VarC.i.add(new a7h1("lyrics_sticker", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 1:
                b0c1 b0c1Var = (b0c1) obj;
                tqw tqwVar = (tqw) obj3;
                c0c1 c0c1Var = (c0c1) obj4;
                if (((a0c1) obj2).equals(a0c1.a)) {
                    c0c1Var.a.a(c0c1.e(b0c1Var), cvl1.d(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                p2c1 p2c1Var = (p2c1) obj;
                o2c1 o2c1Var = (o2c1) obj2;
                iu30 iu30Var = ((q2c1) obj4).b;
                boolean z = p2c1Var.c;
                int i = p2c1Var.b;
                if (o2c1Var.equals(j2c1.a)) {
                    iu30Var.invoke(new p99(i, z));
                } else if (o2c1Var.equals(k2c1.a)) {
                    iu30Var.invoke(new n99(i, z));
                } else if (o2c1Var.equals(l2c1.a)) {
                    iu30Var.invoke(new k99(i, z));
                } else if (o2c1Var.equals(m2c1.a)) {
                    iu30Var.invoke(new l99(i, z));
                } else {
                    if (!o2c1Var.equals(n2c1.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new m99(i, z));
                }
                return rih1Var;
            case 3:
                x3c1 x3c1Var = (x3c1) obj2;
                ((a4c1) obj4).c.invoke(x3c1Var.a, x3c1Var.b, x3c1Var.c);
                return rih1Var;
            case 4:
                h4c1 h4c1Var = (h4c1) obj2;
                ((k4c1) obj4).e.invoke(h4c1Var.a, h4c1Var.b, h4c1Var.c);
                return rih1Var;
            case 5:
                m6c1 m6c1Var = (m6c1) obj;
                tqw tqwVar2 = (tqw) obj3;
                ((n6c1) obj4).a.invoke(m6c1Var.a, m6c1Var.h.b, tqwVar2 != null ? n3o1.y(tqwVar2) : null);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(708888685);
                qim0 qim0VarB = uyn1.B((qim0) obj, 0.0f, ((wat) x340Var.k(t4k.h)).M0(((Number) rwq.h((bpb1) ((dfn0) obj4).d.d, x340Var, 0).getValue()).intValue()), 0.0f, 0.0f, 13);
                x340Var.r(false);
                return qim0VarB;
            case 7:
                bcc1 bcc1Var = (bcc1) obj4;
                csq csqVar = bcc1Var.b;
                String str = bcc1Var.c.a.a;
                jmq jmqVar = (jmq) csqVar.a.c;
                ccc1 ccc1Var = (ccc1) jmqVar.a;
                lzn0 lzn0Var = (lzn0) ccc1Var.d.get();
                c8o.l(lzn0Var);
                kt91 kt91Var = (kt91) ccc1Var.e.get();
                c8o.l(kt91Var);
                return new tcc1(new ycc1(lzn0Var, kt91Var, (byte) 0), (dsq) ((jly0) jmqVar.b).get(), (cir0) obj2, (ick1) obj3, str);
            case 8:
                tqw tqwVar3 = (tqw) obj3;
                if (pjc1.a[((njc1) obj2).ordinal()] == 1) {
                    ((f330) obj4).b.a(nik1.d7.a, cvl1.d(tqwVar3), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                hqn1.q((lzn0) ((kls0) obj4).b, "spotify:account-management:plan-overview", (tqw) obj3, (Bundle) null);
                return rih1Var;
            case 10:
                soc1 soc1Var = (soc1) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                toc1 toc1Var = (toc1) obj4;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var2.g(soc1Var) : x340Var2.i(soc1Var) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    toc1Var.f.a(new yxe1(new ehc1(soc1Var.a)));
                    rpo1.n(soc1Var, toc1Var.d, toc1Var.e, (qim0) null, x340Var3, 14 & iIntValue);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 11:
                mtc1 mtc1Var = (mtc1) obj2;
                rrk0 rrk0Var = (rrk0) ((ngs0) obj4).d;
                Integer numValueOf2 = Integer.valueOf(mtc1Var.b);
                String str2 = mtc1Var.a;
                x6h1 x6h1VarC2 = rrk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("prompt_content", (String) null, numValueOf2, (String) null, str2));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 12:
                zvc1 zvc1Var = (zvc1) obj;
                tqw tqwVar4 = (tqw) obj3;
                vu30 vu30Var = ((awc1) obj4).b;
                if (vu30Var != null) {
                    vu30Var.invoke(zvc1Var.a, tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                }
                return rih1Var;
            case 13:
                ((q4h0) ((yup0) obj4).d).invoke((bwc1) obj2);
                return rih1Var;
            case 14:
                wxc1 wxc1Var = (wxc1) obj;
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                q7r0 q7r0VarG = ((cir0) x340Var4.k(k2r0.a)).g();
                String str3 = wxc1Var.a;
                ArrayList arrayList = wxc1Var.b;
                vi11 vi11Var = ((vxc1) obj4).c;
                boolean zI = x340Var4.i(q7r0VarG);
                Object objT = x340Var4.T();
                if (zI || objT == fkj0.X) {
                    objT = new l5v0(q7r0VarG, (byte) 26);
                    x340Var4.s0(objT);
                }
                cto1.j(str3, arrayList, vi11Var, (Function0) objT, (qim0) null, x340Var4, 512);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                long jS = ((wat) x340Var5.k(t4k.h)).s(((i2c) obj).c() * 0.6f);
                w660 w660Var = (w660) obj4;
                String str4 = w660Var.a;
                long jE = z4p1.e(w660Var.c);
                cjc0 cjc0Var = new cjc0(1);
                uwr uwrVar = cbx.a;
                uwo1.e(str4, (qim0) null, lee1.a(cbx.d(x340Var5).b, 0L, jS, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), jE, new a0e1(3), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var5, 0, 0, 1698);
                return rih1Var;
            case 16:
                azc1 azc1Var = (azc1) obj;
                tqw tqwVar5 = (tqw) obj3;
                ((bzc1) obj4).a.invoke(azc1Var.a, azc1Var.f.b, tqwVar5 != null ? n3o1.y(tqwVar5) : null);
                return rih1Var;
            case 17:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                long jK = tto1.k(i2cVar.d(), i2cVar.c());
                float fB = s3v.b(jK);
                float fA = s3v.a(jK);
                jxc1 jxc1Var = (jxc1) obj4;
                x340 x340Var6 = (b0k) obj2;
                Object objT2 = x340Var6.T();
                if (objT2 == fkj0.X) {
                    objT2 = ljc1.a1;
                    x340Var6.s0(objT2);
                }
                kto1.o(fB, fA, jxc1Var, s161.a(nim0Var, (iu30) objT2), x340Var6, 0);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                c9d1 c9d1Var = (c9d1) obj;
                b9d1 b9d1Var = (b9d1) obj2;
                if (b9d1Var instanceof b9d1) {
                    ((d9d1) obj4).b.invoke(Integer.valueOf(b9d1Var.a), c9d1Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                o1p1.h(u291.c(u291.f(nim0Var, 1.0f), 0.5f), x340Var7, 0);
                qim0 qim0VarH = l6o1.H(uyn1.w(u291.d(nim0Var, 1.0f), (vzq0) obj), l6o1.C(0, 0, 1, x340Var7), false, 14);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var7).b;
                qim0 qim0VarX = uyn1.x(qim0VarH, 16.0f);
                shm0 shm0Var = (shm0) obj4;
                mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var7).b.b, true, new um5(false)), een.P0, x340Var7, 0);
                x340 x340Var8 = x340Var7;
                int iHashCode = Long.hashCode(x340Var8.T);
                xos0 xos0VarM = x340Var8.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarX);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(hmb0.t1);
                } else {
                    x340Var9.v0();
                }
                nko1.H(mbhVarA, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                o1p1.i(x340Var7, 0);
                o1p1.t(shm0Var.a, shm0Var.b, 0, x340Var7);
                o1p1.p(x340Var7, 0);
                x340Var9.r(true);
                return rih1Var;
            case 20:
                kls0 kls0Var = (kls0) obj4;
                z710.d((z710) kls0Var.b, (String) kls0Var.c, false, 6);
                return rih1Var;
            case 21:
                tbe1 tbe1Var = (tbe1) obj;
                tqw tqwVar6 = (tqw) obj3;
                vbe1 vbe1Var = (vbe1) obj4;
                q8n q8nVar = (q8n) vbe1Var.f;
                c9n c9nVar = (c9n) vbe1Var.e;
                String string = ihc1.e1(((pbe1) obj2).a).toString();
                if (!ihc1.y0(string)) {
                    if (tbe1Var.c) {
                        fn31.T(c9nVar, (o8n) null, 0, new xba1(vbe1Var, (lnm) null, (byte) 28), 3);
                        fn31.T(c9nVar, q8nVar, 0, new ube1(vbe1Var, string, tbe1Var, (lnm) null, (byte) 0), 2);
                    } else {
                        fn31.T(c9nVar, (o8n) null, 0, new bfb1(tbe1Var, vbe1Var, tqwVar6, (lnm) null, (byte) 11), 3);
                        fn31.T(c9nVar, q8nVar, 0, new ube1(vbe1Var, string, tbe1Var, (lnm) null, (byte) 1), 2);
                    }
                }
                return rih1Var;
            case 22:
                mde1 mde1Var = (mde1) obj;
                jde1 jde1Var = (lde1) obj2;
                bvn bvnVar = ((pde1) obj4).a;
                ode1 ode1Var = mde1Var.d;
                List list = ode1Var.b;
                if (jde1Var.equals(ide1.a)) {
                    bvnVar.b.invoke(k5i0.a);
                } else if (jde1Var instanceof jde1) {
                    oce1 oce1Var = (oce1) list.get(jde1Var.a);
                    int i2 = mde1Var.a;
                    long j = ((oce1) o7h.A0(list)).b;
                    int iC = l1d.C(i2);
                    if (iC == 0) {
                        mmr0Var2 = new mmr0(Long.valueOf(oce1Var.a), Long.valueOf(j));
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        mmr0Var2 = new mmr0(Long.valueOf(oce1Var.a), Long.valueOf(oce1Var.b));
                    }
                    bvnVar.b.invoke(new i5i0(((Number) mmr0Var2.a).longValue(), ((Number) mmr0Var2.b).longValue()));
                } else if (jde1Var instanceof gde1) {
                    List list2 = ode1Var.c;
                    if (!list2.isEmpty()) {
                        int iIntValue2 = ((Number) o7h.q0(list2)).intValue();
                        int iIntValue3 = ((Number) o7h.A0(list2)).intValue();
                        gde1 gde1Var = (gde1) jde1Var;
                        int iP = yoi1.p(gde1Var.b, 0, p7h.L(list));
                        int iOrdinal = gde1Var.a.ordinal();
                        if (iOrdinal == 0) {
                            mmr0Var = new mmr0(Integer.valueOf(iP), Integer.valueOf(iIntValue3));
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            mmr0Var = new mmr0(Integer.valueOf(iIntValue2), Integer.valueOf(iP));
                        }
                        int iIntValue4 = ((Number) mmr0Var.a).intValue();
                        int iIntValue5 = ((Number) mmr0Var.b).intValue();
                        if (iIntValue4 <= iIntValue5) {
                            bvnVar.b.invoke(new i5i0(((oce1) list.get(iIntValue4)).a, ((oce1) list.get(iIntValue5)).b));
                        }
                    }
                } else if (jde1Var.equals(hde1.a)) {
                    bvnVar.b.invoke(j5i0.a);
                } else {
                    if (!(jde1Var instanceof kde1)) {
                        eg.o();
                        return null;
                    }
                    bvnVar.b.invoke(new l5i0(((kde1) jde1Var).a));
                }
                return rih1Var;
            case 23:
                tfe1 tfe1Var = (tfe1) obj;
                o3s o3sVar = (o3s) ((cb0) obj4).b.get();
                Uri uri = tfe1Var.b;
                Uri uri2 = tfe1Var.c;
                Activity activity = o3sVar.b;
                PackageManager packageManager = activity.getApplicationContext().getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(uri);
                if (packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.addFlags(268435456);
                    intent2.setData(uri2);
                    activity.startActivity(intent2);
                } else {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.addFlags(268435456);
                    intent3.setData(uri);
                    activity.startActivity(intent3);
                }
                o3sVar.c.l();
                return rih1Var;
            case 24:
                ((ije1) obj4).c.invoke((fje1) obj2);
                return rih1Var;
            case 25:
                ((Number) obj3).intValue();
                eth.a(((kte1) obj4).a, (qim0) null, irn1.o0(100, 0, (dlv) null, 6), "ticket timeline reminder button label", enj.a, (b0k) obj2, 27648, 2);
                return rih1Var;
            case 26:
                sse1 sse1Var = (sse1) obj2;
                if ((sse1Var instanceof rse1) || (sse1Var instanceof qse1) || (sse1Var instanceof pse1)) {
                    ((iu30) ((cm0) obj4).c).invoke(sse1Var);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 27:
                ite1 ite1Var = (ite1) obj2;
                tqw tqwVar7 = (tqw) obj3;
                fte1 fte1Var = (fte1) obj4;
                lte1 lte1Var = ((rte1) obj).h;
                jte1 jte1Var = lte1Var != null ? lte1Var.c : null;
                if (jte1Var == null) {
                    jte1Var = null;
                }
                if (!ite1Var.equals(gte1.a) || jte1Var == null) {
                    fte1Var.c.invoke(ite1Var);
                } else {
                    hje1 hje1Var = fte1Var.b;
                    if (hje1Var != null) {
                        y1t0 y1t0Var = hje1Var.a;
                        String str5 = jte1Var.a;
                        if (tqwVar7 == null) {
                            hhg1.n("Required value was null.");
                            return null;
                        }
                        y1t0Var.l(str5, "LiveEventPage", n3o1.y(tqwVar7));
                    }
                }
                return rih1Var;
            case 28:
                ((que1) obj4).b.invoke();
                return rih1Var;
            default:
                n2f1 n2f1Var = (p2f1) obj;
                l2f1 l2f1Var = (l2f1) obj2;
                tqw tqwVar8 = (tqw) obj3;
                t2f1 t2f1Var = (t2f1) obj4;
                if (l2f1Var.equals(g2f1.a)) {
                    t2f1Var.a.e();
                } else {
                    if (!l2f1Var.equals(j2f1.a)) {
                        eg.o();
                        return null;
                    }
                    if (n2f1Var instanceof n2f1) {
                        n2f1 n2f1Var2 = n2f1Var;
                        Timestamp timestamp = n2f1Var2.b;
                        String str6 = n2f1Var2.c;
                        f371 f371Var = n2f1Var2.a;
                        if (f371Var instanceof e371) {
                            int iOrdinal2 = n2f1Var2.d.ordinal();
                            if (iOrdinal2 == 2) {
                                tf60Var = new tf60(str6, timestamp.p(), timestamp.q(), kn71.d);
                            } else if (iOrdinal2 == 3) {
                                tf60Var = new tf60(str6, timestamp.p(), timestamp.q(), kn71.e);
                            }
                            e371 e371Var = (e371) f371Var;
                            t2f1Var.b.a(e371Var.a, e371Var.b, tf60Var, tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                        }
                    }
                }
                return rih1Var;
        }
    }
}
