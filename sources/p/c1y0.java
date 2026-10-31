package p;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class c1y0 implements SingleOnSubscribe, i2q0, yg30, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1y0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                l3q l3qVar = (l3q) obj3;
                qop qopVar = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar = l3qVar.a;
                teq teqVar = l3qVar.b;
                b0q b0qVar = new b0q(daqVar, teqVar);
                qopVar.getClass();
                jbtVar.getClass();
                wtp wtpVar = new wtp(b0qVar, qopVar, jbtVar);
                String strD = qopVar.d();
                pch1 pch1Var = (pch1) teqVar.m8.get();
                c8o.l(pch1Var);
                zb91 zb91Var = pch1Var.c;
                uyp uypVar = (uyp) wtpVar.c;
                koc0 koc0Var = jbtVar.d;
                pch1 pch1Var2 = (pch1) teqVar.m8.get();
                c8o.l(pch1Var2);
                dlg1 dlg1Var = pch1Var2.b;
                xvo xvoVar = (xvo) daqVar.H8.get();
                c8o.l(xvoVar);
                return new b1y0(strD, zb91Var, uypVar, koc0Var, dlg1Var, xvoVar);
            case 1:
                ozp ozpVar = (ozp) obj3;
                qop qopVar2 = (qop) obj;
                jbt jbtVar2 = (jbt) obj2;
                daq daqVar2 = ozpVar.a;
                teq teqVar2 = ozpVar.b;
                ibq ibqVar = new ibq(daqVar2, teqVar2);
                qopVar2.getClass();
                jbtVar2.getClass();
                wtp wtpVar2 = new wtp(ibqVar, qopVar2, jbtVar2);
                String strD2 = qopVar2.d();
                pch1 pch1Var3 = (pch1) teqVar2.m8.get();
                c8o.l(pch1Var3);
                zb91 zb91Var2 = pch1Var3.c;
                uyp uypVar2 = (uyp) wtpVar2.c;
                koc0 koc0Var2 = jbtVar2.d;
                pch1 pch1Var4 = (pch1) teqVar2.m8.get();
                c8o.l(pch1Var4);
                dlg1 dlg1Var2 = pch1Var4.b;
                xvo xvoVar2 = (xvo) daqVar2.H8.get();
                c8o.l(xvoVar2);
                return new b1y0(strD2, zb91Var2, uypVar2, koc0Var2, dlg1Var2, xvoVar2, (byte) 0);
            case 2:
                k3q k3qVar = (k3q) obj3;
                qop qopVar3 = (qop) obj;
                jbt jbtVar3 = (jbt) obj2;
                l3q l3qVar2 = new l3q(k3qVar.a, k3qVar.b);
                qopVar3.getClass();
                jbtVar3.getClass();
                qqp qqpVar = new qqp(l3qVar2, qopVar3, jbtVar3);
                return new j2y0(qopVar3.d(), (uyp) qqpVar.c, jbtVar3.d);
            case 3:
                jbq jbqVar = (jbq) obj3;
                qop qopVar4 = (qop) obj;
                daq daqVar3 = jbqVar.a;
                teq teqVar3 = jbqVar.b;
                k3q k3qVar2 = new k3q(daqVar3, teqVar3);
                qopVar4.getClass();
                ((mbt) obj2).getClass();
                return new z2y0(qopVar4.d(), teqVar3.g4(), (zkq) ((jly0) new a1q(k3qVar2, qopVar4).c).get());
            case 4:
                l3q l3qVar3 = (l3q) obj3;
                qop qopVar5 = (qop) obj;
                bct bctVar = (bct) obj2;
                daq daqVar4 = l3qVar3.a;
                teq teqVar4 = l3qVar3.b;
                g0q g0qVar = new g0q(daqVar4, teqVar4);
                qopVar5.getClass();
                bctVar.getClass();
                wtp wtpVar3 = new wtp(g0qVar, qopVar5, bctVar);
                String strD3 = qopVar5.d();
                koc0 koc0Var3 = bctVar.d;
                alq alqVar = (alq) ((jly0) wtpVar3.c).get();
                uqv0 uqv0VarI3 = teqVar4.i3();
                ags0 ags0Var = (ags0) daqVar4.a.F4.get();
                c8o.l(ags0Var);
                u6y0 u6y0Var = (u6y0) teqVar4.l8.get();
                c8o.l(u6y0Var);
                return new rb3(strD3, koc0Var3, alqVar, uqv0VarI3, ags0Var, u6y0Var, teqVar4.g4());
            case 5:
                jbq jbqVar2 = (jbq) obj3;
                qop qopVar6 = (qop) obj;
                jbt jbtVar4 = (jbt) obj2;
                k3q k3qVar3 = new k3q(jbqVar2.a, jbqVar2.b);
                qopVar6.getClass();
                jbtVar4.getClass();
                return new j2y0(jbtVar4.d, qopVar6.d(), (uyp) new qqp(k3qVar3, qopVar6, jbtVar4).c, (byte) 0);
            case 6:
                qop qopVar7 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                lzp lzpVar = new lzp(((h0q) obj3).a);
                qopVar7.getClass();
                bctVar2.getClass();
                wtp wtpVar4 = new wtp(lzpVar, qopVar7, bctVar2);
                return new w4y0(qopVar7.d(), (uyp) wtpVar4.c, bctVar2.d);
            case 7:
                l3q l3qVar4 = (l3q) obj3;
                qop qopVar8 = (qop) obj;
                daq daqVar5 = l3qVar4.a;
                teq teqVar5 = l3qVar4.b;
                jbq jbqVar3 = new jbq(daqVar5, teqVar5);
                qopVar8.getClass();
                ((vbt) obj2).getClass();
                k2q k2qVar = new k2q(jbqVar3, qopVar8);
                String strD4 = qopVar8.d();
                i5y0 i5y0Var = (i5y0) teqVar5.pb.get();
                c8o.l(i5y0Var);
                uyp uypVar3 = (uyp) k2qVar.c;
                ags0 ags0Var2 = (ags0) daqVar5.a.F4.get();
                c8o.l(ags0Var2);
                nfa0 nfa0Var = (nfa0) daqVar5.b2.get();
                c8o.l(nfa0Var);
                return new f6y0(strD4, i5y0Var, uypVar3, ags0Var2, nfa0Var);
            case 8:
                k3q k3qVar4 = (k3q) obj3;
                qop qopVar9 = (qop) obj;
                qbt qbtVar = (qbt) obj2;
                daq daqVar6 = k3qVar4.a;
                teq teqVar6 = k3qVar4.b;
                qopVar9.getClass();
                qbtVar.getClass();
                d0r d0rVar = qbtVar.a;
                String str = qopVar9.e;
                c8o.l(str);
                o3o o3oVar = (o3o) teqVar6.yg.get();
                c8o.l(o3oVar);
                qlb qlbVar = new qlb(d0rVar, str, o3oVar);
                ags0 ags0Var3 = (ags0) daqVar6.a.F4.get();
                c8o.l(ags0Var3);
                return new ca3(qlbVar, ags0Var3);
            case 9:
                l3q l3qVar5 = (l3q) obj3;
                qop qopVar10 = (qop) obj;
                daq daqVar7 = l3qVar5.a;
                teq teqVar7 = l3qVar5.b;
                qopVar10.getClass();
                ((tbt) obj2).getClass();
                String str2 = qopVar10.e;
                c8o.l(str2);
                i5y0 i5y0Var2 = (i5y0) teqVar7.pb.get();
                c8o.l(i5y0Var2);
                String strD5 = qopVar10.d();
                h3y0 h3y0Var = (h3y0) teqVar7.k8.get();
                c8o.l(h3y0Var);
                xq81 xq81Var = new xq81((i8h1) teqVar7.d.A5.get(), (byte) 25);
                e7y0 e7y0Var = (e7y0) daqVar7.a.C4.get();
                c8o.l(e7y0Var);
                mie0 mie0VarZ0 = teqVar7.a.Z0();
                x1i1 x1i1Var = (x1i1) teqVar7.F6.get();
                c8o.l(x1i1Var);
                u6y0 u6y0Var2 = (u6y0) teqVar7.l8.get();
                c8o.l(u6y0Var2);
                i5y0 i5y0Var3 = (i5y0) teqVar7.pb.get();
                c8o.l(i5y0Var3);
                iz31 iz31Var = (iz31) teqVar7.zg.get();
                c8o.l(iz31Var);
                suh1 suh1Var = new suh1(h3y0Var, xq81Var, e7y0Var, mie0VarZ0, x1i1Var, u6y0Var2, i5y0Var3, iz31Var);
                yqg yqgVar = (yqg) daqVar7.J1.get();
                c8o.l(yqgVar);
                u6y0 u6y0Var3 = (u6y0) teqVar7.l8.get();
                c8o.l(u6y0Var3);
                return new c7y0(str2, i5y0Var2, strD5, suh1Var, yqgVar, u6y0Var3);
            case 10:
                jbq jbqVar4 = (jbq) obj3;
                qop qopVar11 = (qop) obj;
                act actVar = (act) obj2;
                daq daqVar8 = jbqVar4.a;
                teq teqVar8 = jbqVar4.b;
                qopVar11.getClass();
                actVar.getClass();
                Context context = (Context) daqVar8.x1.a;
                c8o.l(context);
                u9c0 u9c0VarQ = cto1.q(qopVar11.c());
                koc0 koc0Var4 = actVar.f;
                a1r0 a1r0Var = (a1r0) teqVar8.V0.get();
                c8o.l(a1r0Var);
                uro0 uro0Var = (uro0) teqVar8.a.c.get();
                c8o.l(uro0Var);
                dto0 dto0Var = (dto0) daqVar8.eg.get();
                c8o.l(dto0Var);
                qnv0 qnv0Var = (qnv0) daqVar8.Fm.get();
                c8o.l(qnv0Var);
                e7y0 e7y0Var2 = (e7y0) daqVar8.a.C4.get();
                c8o.l(e7y0Var2);
                return new p7y0(context, u9c0VarQ, koc0Var4, a1r0Var, uro0Var, dto0Var, qnv0Var, e7y0Var2);
            case 11:
                k3q k3qVar5 = (k3q) obj3;
                act actVar2 = (act) obj2;
                daq daqVar9 = k3qVar5.a;
                teq teqVar9 = k3qVar5.b;
                ((qop) obj).getClass();
                actVar2.getClass();
                q8n q8nVar = (q8n) daqVar9.E1.get();
                c8o.l(q8nVar);
                koc0 koc0Var5 = actVar2.f;
                h3y0 h3y0Var2 = (h3y0) teqVar9.k8.get();
                c8o.l(h3y0Var2);
                i5y0 i5y0Var4 = (i5y0) teqVar9.pb.get();
                c8o.l(i5y0Var4);
                u6y0 u6y0Var4 = (u6y0) teqVar9.l8.get();
                c8o.l(u6y0Var4);
                return new r7y0(q8nVar, koc0Var5, h3y0Var2, i5y0Var4, u6y0Var4);
            case 12:
                qop qopVar12 = (qop) obj;
                jbt jbtVar5 = (jbt) obj2;
                l0q l0qVar = new l0q(((mzp) obj3).a);
                qopVar12.getClass();
                jbtVar5.getClass();
                return new t7y0(qopVar12.d(), (uyp) new wtp(l0qVar, qopVar12, jbtVar5).c, jbtVar5.d);
            case 13:
                qop qopVar13 = (qop) obj;
                gl90 gl90Var = (gl90) obj2;
                daq daqVar10 = ((uzp) obj3).b;
                qopVar13.getClass();
                gl90Var.getClass();
                yqg yqgVar2 = (yqg) daqVar10.J1.get();
                c8o.l(yqgVar2);
                return new h82(yqgVar2, gl90Var.e, qopVar13.d(), (byte) 1);
            case 14:
                l3q l3qVar6 = (l3q) obj3;
                qop qopVar14 = (qop) obj;
                jbt jbtVar6 = (jbt) obj2;
                jbq jbqVar5 = new jbq(l3qVar6.a, l3qVar6.b);
                qopVar14.getClass();
                jbtVar6.getClass();
                wtp wtpVar5 = new wtp(jbqVar5, qopVar14, jbtVar6);
                return new m8y0(qopVar14.d(), (uyp) wtpVar5.c, jbtVar6.d);
            case 15:
                qop qopVar15 = (qop) obj;
                wzp wzpVar = new wzp(((m0q) obj3).a);
                qopVar15.getClass();
                ((gl90) obj2).getClass();
                return new bvm(qopVar15.d(), (uyp) new lbq(wzpVar, qopVar15).c);
            case 16:
                k3q k3qVar6 = (k3q) obj3;
                qop qopVar16 = (qop) obj;
                gl90 gl90Var2 = (gl90) obj2;
                l3q l3qVar7 = new l3q(k3qVar6.a, k3qVar6.b);
                qopVar16.getClass();
                gl90Var2.getClass();
                return new w8y0((jxp) new tjq(l3qVar7, qopVar16, gl90Var2).e);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                jbq jbqVar6 = (jbq) obj3;
                qop qopVar17 = (qop) obj;
                jbt jbtVar7 = (jbt) obj2;
                daq daqVar11 = jbqVar6.a;
                teq teqVar10 = jbqVar6.b;
                k3q k3qVar7 = new k3q(daqVar11, teqVar10);
                qopVar17.getClass();
                jbtVar7.getClass();
                wtp wtpVar6 = new wtp(k3qVar7, qopVar17, jbtVar7);
                String str3 = qopVar17.e;
                c8o.l(str3);
                i5y0 i5y0Var5 = (i5y0) teqVar10.pb.get();
                c8o.l(i5y0Var5);
                return new sby0(str3, i5y0Var5, (uyp) wtpVar6.c, jbtVar7.d);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qop qopVar18 = (qop) obj;
                act actVar3 = (act) obj2;
                daq daqVar12 = ((p0q) obj3).b;
                qopVar18.getClass();
                actVar3.getClass();
                rzq rzqVar = actVar3.c;
                c8o.l(rzqVar);
                String strD6 = qopVar18.d();
                q8n q8nVar2 = (q8n) daqVar12.E1.get();
                c8o.l(q8nVar2);
                return new dly0(rzqVar, strD6, q8nVar2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            default:
                l3q l3qVar8 = (l3q) obj3;
                qop qopVar19 = (qop) obj;
                jbt jbtVar8 = (jbt) obj2;
                daq daqVar13 = l3qVar8.a;
                jbq jbqVar7 = new jbq(daqVar13, l3qVar8.b);
                qopVar19.getClass();
                jbtVar8.getClass();
                jmq jmqVar = new jmq(jbqVar7, qopVar19, jbtVar8);
                String strD7 = qopVar19.d();
                koc0 koc0Var6 = jbtVar8.d;
                ov20 ov20Var = (ov20) daqVar13.P5.get();
                c8o.l(ov20Var);
                return new j2y0(strD7, new pux0(koc0Var6, ov20Var, (byte) 22), (uyp) jmqVar.c);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k3q k3qVar8 = (k3q) obj3;
                zbt zbtVar = (zbt) obj2;
                daq daqVar14 = k3qVar8.a;
                teq teqVar11 = k3qVar8.b;
                ((qop) obj).getClass();
                zbtVar.getClass();
                i8h1 i8h1Var = (i8h1) daqVar14.A5.get();
                c8o.l(i8h1Var);
                qv80 qv80Var = new qv80(i8h1Var, zbtVar.e);
                aas aasVar = (aas) teqVar11.z4.get();
                c8o.l(aasVar);
                b7r0 b7r0Var = (b7r0) daqVar14.p7.get();
                c8o.l(b7r0Var);
                return new aaz0(qv80Var, aasVar, b7r0Var);
            case 22:
                tbt tbtVar = (tbt) obj2;
                z0q z0qVar = new z0q(((a0q) obj3).a);
                ((qop) obj).getClass();
                tbtVar.getClass();
                return new apz0((kmq) ((jly0) new qqp(z0qVar, tbtVar).c).get());
            case 23:
                qop qopVar20 = (qop) obj;
                teq teqVar12 = ((ibq) obj3).a;
                qopVar20.getClass();
                ((gl90) obj2).getClass();
                String strD8 = qopVar20.d();
                lqc lqcVar = new lqc((byte) 21);
                pvc pvcVar = new pvc((byte) 21, false);
                vdq vdqVar = (vdq) teqVar12.o2.get();
                c8o.l(vdqVar);
                return new yxz0(strD8, lqcVar, pvcVar, vdqVar);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                jbq jbqVar8 = (jbq) obj3;
                qop qopVar21 = (qop) obj;
                act actVar4 = (act) obj2;
                daq daqVar15 = jbqVar8.a;
                teq teqVar13 = jbqVar8.b;
                qopVar21.getClass();
                actVar4.getClass();
                String strD9 = qopVar21.d();
                iyc0 iyc0Var = (iyc0) teqVar13.g1.get();
                c8o.l(iyc0Var);
                rzq rzqVar2 = actVar4.c;
                c8o.l(rzqVar2);
                q8n q8nVar3 = (q8n) daqVar15.E1.get();
                c8o.l(q8nVar3);
                luk lukVar = (luk) daqVar15.L1.get();
                c8o.l(lukVar);
                return new fjk0(strD9, iyc0Var, (d0r) rzqVar2, q8nVar3, new vp4(false, false, lukVar));
        }
    }

    public Object apply(Object obj) {
        vov0 vov0Var = (vov0) obj;
        return vov0Var instanceof tov0 ? fq7.D((xov0) ((zsc) this.b).d) : Maybe.e(vov0Var);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 25:
                s001 s001Var = (s001) obj;
                r001 r001Var = (r001) zf30Var;
                e401 e401Var = (e401) s001Var.a.get();
                e101 e101Var = (e101) s001Var.b.get();
                e401Var.getClass();
                e101Var.getClass();
                r001Var.getClass();
                f0a f0aVar = new f0a(e401Var, e101Var);
                r001Var.W1 = (umq) ((jly0) f0aVar.h).get();
                c8o.l((af10) e401Var.d.get());
                c8o.l((gw70) e401Var.e.get());
                r001Var.X1 = (zmq) ((jly0) f0aVar.i).get();
                r001Var.Y1 = (g601) ((jly0) f0aVar.Q0).get();
                kly0 kly0Var = e401Var.i;
                i8h1 i8h1Var = (i8h1) kly0Var.get();
                c8o.l(i8h1Var);
                r001Var.Z1 = new pux0(i8h1Var);
                txz0 txz0Var = (txz0) e401Var.a.get();
                c8o.l(txz0Var);
                r001Var.a2 = txz0Var;
                i8h1 i8h1Var2 = (i8h1) kly0Var.get();
                c8o.l(i8h1Var2);
                r001Var.b2 = i8h1Var2;
                l6h1 l6h1Var = (l6h1) e401Var.j.get();
                c8o.l(l6h1Var);
                r001Var.c2 = l6h1Var;
                break;
            case 26:
                i501 i501Var = (i501) zf30Var;
                f401 f401Var = (f401) ((ynb0) ((uww0) obj).b).get();
                f401Var.getClass();
                i501Var.getClass();
                gw70 gw70Var = (gw70) f401Var.a.get();
                c8o.l(gw70Var);
                i501Var.Z1 = gw70Var;
                break;
            default:
                y901 y901Var = (y901) zf30Var;
                z901 z901Var = (z901) ((ynb0) ((uww0) obj).b).get();
                z901Var.getClass();
                y901Var.getClass();
                jnq jnqVar = new jnq(z901Var);
                y901Var.W1 = (hnq) ((jly0) jnqVar.b).get();
                y901Var.X1 = (inq) ((jly0) jnqVar.d).get();
                y901Var.Y1 = (tk21) ((jly0) jnqVar.a).get();
                break;
        }
    }

    public void onComplete(Task task) {
        SingleEmitter singleEmitter = (SingleEmitter) this.b;
        if (!task.j()) {
            Exception excF = task.f();
            Logger.l(excF, "Error getting token from firebase", new Object[0]);
            singleEmitter.onError(excF);
        } else {
            String str = (String) task.g();
            if (str != null) {
                singleEmitter.onSuccess(str);
            }
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) ((zxy0) this.b).a.get();
        firebaseMessaging.getClass();
        bsd1 bsd1Var = new bsd1();
        firebaseMessaging.f.execute(new ag20(firebaseMessaging, bsd1Var, (byte) 2));
        bsd1Var.a.b(new c1y0(singleEmitter, (byte) 20));
    }
}
