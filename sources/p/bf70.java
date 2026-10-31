package p;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class bf70 implements yg30, qq70, gi80, j9a0, Function, Function3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(fm61 fm61Var) {
        ((qq70) this.b).a(fm61Var);
    }

    public Object apply(Object obj) {
        k310 k310Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 22:
                return ((n3d0) obj2).a((String) obj);
            default:
                z310 z310Var = (z310) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                f410 f410Var = z310Var.b;
                return (f410Var == null || (k310Var = f410Var.c) == null) ? z310Var : z310.a(z310Var, null, new f410(f410Var.a, f410Var.b, new k310(k310Var.a, k310Var.b, k310Var.c, k310Var.d, k310Var.e, k310Var.f, k310Var.g, zBooleanValue), f410Var.d), 13);
        }
    }

    public Object b(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                ozp ozpVar = (ozp) obj3;
                qop qopVar = (qop) obj;
                bct bctVar = (bct) obj2;
                daq daqVar = ozpVar.a;
                teq teqVar = ozpVar.b;
                vzp vzpVar = new vzp(daqVar, teqVar, (byte) 1);
                qopVar.getClass();
                bctVar.getClass();
                qjp qjpVar = new qjp(vzpVar, qopVar, bctVar);
                koc0 koc0Var = bctVar.d;
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                c8o.l(lzn0Var);
                gw70 gw70Var = (gw70) daqVar.d8.get();
                c8o.l(gw70Var);
                uap uapVar = (uap) qopVar.a.b;
                tl7 tl7Var = (tl7) uapVar.m.get();
                c8o.l(tl7Var);
                i8p i8pVar = (i8p) qjpVar.c;
                vtm0 vtm0Var = (vtm0) ((jly0) qjpVar.a).get();
                luk lukVar = (luk) daqVar.L1.get();
                c8o.l(lukVar);
                i3b i3bVar = new i3b((Object) new w75(lukVar), (byte) 8);
                abu0 abu0Var = (abu0) uapVar.j0.get();
                c8o.l(abu0Var);
                return new fb3(koc0Var, new cm0(lzn0Var, gw70Var, tl7Var, i8pVar, vtm0Var, i3bVar, abu0Var, qopVar.c()));
            case 3:
            case 4:
            case 5:
            case 11:
            case 12:
            case 13:
            case 14:
            case 22:
            case 23:
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
            default:
                daq daqVar2 = ((y0q) obj3).b;
                ((qop) obj).getClass();
                ((tbt) obj2).getClass();
                luk lukVar2 = (luk) daqVar2.L1.get();
                c8o.l(lukVar2);
                return new ka3(new rp4(false, false, lukVar2));
            case 6:
                xzp xzpVar = new xzp(((wzp) obj3).a);
                ((qop) obj).getClass();
                ((bct) obj2).getClass();
                return new prk((wkp) new z2p(xzpVar).a.get());
            case 7:
                daq daqVar3 = ((q0q) obj3).b;
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                xna0 xna0Var = (xna0) daqVar3.y9.get();
                c8o.l(xna0Var);
                return new xne(xna0Var);
            case 8:
                tbt tbtVar = (tbt) obj2;
                a0q a0qVar = new a0q(((y0q) obj3).b);
                ((qop) obj).getClass();
                tbtVar.getClass();
                return new ka3((xkp) ((jly0) new qjp(a0qVar, tbtVar).a).get());
            case 9:
                daq daqVar4 = ((z0q) obj3).a;
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                luk lukVar3 = (luk) daqVar4.L1.get();
                c8o.l(lukVar3);
                return new l1b(new uq8(new jq4(lukVar3), (byte) 2), (byte) 1);
            case 10:
                act actVar = (act) obj2;
                daq daqVar5 = ((d0q) obj3).a;
                ((qop) obj).getClass();
                actVar.getClass();
                rzq rzqVar = actVar.c;
                c8o.l(rzqVar);
                koc0 koc0Var2 = actVar.f;
                q8n q8nVar = (q8n) daqVar5.r2.get();
                c8o.l(q8nVar);
                luk lukVar4 = (luk) daqVar5.L1.get();
                c8o.l(lukVar4);
                return new w5b0(rzqVar, koc0Var2, q8nVar, new gq4(lukVar4));
            case 15:
                kzp kzpVar = (kzp) obj3;
                qop qopVar2 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar6 = kzpVar.a;
                teq teqVar2 = kzpVar.b;
                nzp nzpVar = new nzp(daqVar6, teqVar2);
                qopVar2.getClass();
                jbtVar.getClass();
                a680 a680Var = new a680();
                a680Var.a = jbtVar;
                a680Var.b = qopVar2;
                a680Var.c = nzpVar;
                a680Var.d = xqu.b(new blp(a680Var, 2, (byte) 6));
                a680Var.e = xqu.b(new blp(a680Var, 1, (byte) 6));
                a680Var.f = new blp(a680Var, 0, (byte) 6);
                d0r d0rVar = jbtVar.b;
                koc0 koc0Var3 = jbtVar.d;
                String strD = qopVar2.d();
                d2f1 d2f1VarP3 = teqVar2.P3();
                blp blpVar = (blp) a680Var.f;
                me30 me30Var = (me30) daqVar6.w7.get();
                c8o.l(me30Var);
                return new ncc0(d0rVar, koc0Var3, strD, d2f1VarP3, blpVar, me30Var);
            case 16:
                ozp ozpVar2 = (ozp) obj3;
                qop qopVar3 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                kzp kzpVar2 = new kzp(ozpVar2.a, ozpVar2.b);
                qopVar3.getClass();
                bctVar2.getClass();
                return new qpg(bctVar2.b, bctVar2.d, qopVar3.d(), (lop) ((jly0) new qjp(kzpVar2, qopVar3, bctVar2).a).get());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                nzp nzpVar2 = (nzp) obj3;
                qop qopVar4 = (qop) obj;
                bct bctVar3 = (bct) obj2;
                daq daqVar7 = nzpVar2.a;
                teq teqVar3 = nzpVar2.b;
                b1q b1qVar = new b1q(daqVar7, teqVar3, (byte) 2);
                qopVar4.getClass();
                bctVar3.getClass();
                t7p t7pVar = new t7p(b1qVar, qopVar4, bctVar3);
                d0r d0rVar2 = bctVar3.b;
                i8h1 i8h1Var = (i8h1) daqVar7.A5.get();
                c8o.l(i8h1Var);
                yge0 yge0Var = new yge0(i8h1Var, bctVar3.e);
                Context context = (Context) daqVar7.x1.a;
                c8o.l(context);
                lzn0 lzn0Var2 = (lzn0) teqVar3.i.get();
                c8o.l(lzn0Var2);
                String strD2 = qopVar4.d();
                xrc0 xrc0Var = (xrc0) teqVar3.e1.get();
                c8o.l(xrc0Var);
                iyc0 iyc0Var = (iyc0) teqVar3.g1.get();
                c8o.l(iyc0Var);
                Object obj4 = t7pVar.d;
                ff20 ff20Var = (ff20) ((jly0) obj4).get();
                op31 op31Var = (op31) teqVar3.h1.get();
                c8o.l(op31Var);
                q8n q8nVar2 = (q8n) daqVar7.V2.get();
                c8o.l(q8nVar2);
                luk lukVar5 = (luk) daqVar7.L1.get();
                c8o.l(lukVar5);
                qp4 qp4Var = new qp4(lukVar5);
                koc0 koc0Var4 = bctVar3.d;
                ff20 ff20Var2 = (ff20) ((jly0) obj4).get();
                twb twbVar = new twb((byte) 14);
                t2j0 t2j0Var = (t2j0) daqVar7.f2.get();
                c8o.l(t2j0Var);
                zdc0 zdc0Var = new zdc0(d0rVar2, yge0Var, context, lzn0Var2, strD2, xrc0Var, iyc0Var, ff20Var, op31Var, q8nVar2, qp4Var, new haa0(koc0Var4, ff20Var2, twbVar, new dmr(t2j0Var)));
                q8n q8nVar3 = (q8n) daqVar7.E1.get();
                c8o.l(q8nVar3);
                return new aec0(zdc0Var, q8nVar3, (ff20) ((jly0) obj4).get());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qop qopVar5 = (qop) obj;
                jbt jbtVar2 = (jbt) obj2;
                t2q t2qVar = new t2q(((izp) obj3).b);
                qopVar5.getClass();
                jbtVar2.getClass();
                kp5 kp5Var = new kp5(t2qVar, qopVar5, jbtVar2);
                return new ifc0(cto1.q(qopVar5.c()), (ff20) ((jly0) kp5Var.e).get(), (xec0) ((jly0) kp5Var.f).get(), (mop) ((jly0) kp5Var.g).get(), (nop) ((jly0) kp5Var.h).get());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                daq daqVar8 = ((d1q) obj3).a;
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                Context context2 = (Context) daqVar8.x1.a;
                c8o.l(context2);
                return new uqg(context2, (byte) 1);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qop qopVar6 = (qop) obj;
                tbt tbtVar2 = (tbt) obj2;
                uzp uzpVar = new uzp(((rzp) obj3).b, (byte) 3);
                qopVar6.getClass();
                tbtVar2.getClass();
                return new ka3((oop) ((jly0) new k9k(uzpVar, qopVar6, tbtVar2).f).get());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                jq21 jq21Var = (jq21) obj2;
                daq daqVar9 = ((vzp) obj3).b;
                ((sq21) obj).getClass();
                jq21Var.getClass();
                agc0 agc0Var = (agc0) daqVar9.B7.get();
                c8o.l(agc0Var);
                return new ufc0(jq21Var, agc0Var);
            case 25:
                ozp ozpVar3 = (ozp) obj3;
                qop qopVar7 = (qop) obj;
                bct bctVar4 = (bct) obj2;
                daq daqVar10 = ozpVar3.a;
                teq teqVar4 = ozpVar3.b;
                qopVar7.getClass();
                bctVar4.getClass();
                d0r d0rVar3 = bctVar4.b;
                koc0 koc0Var5 = bctVar4.d;
                String strD3 = qopVar7.d();
                z0t z0tVar = (z0t) daqVar10.wp.get();
                c8o.l(z0tVar);
                sb7 sb7Var = (sb7) teqVar4.V5.get();
                c8o.l(sb7Var);
                return new fb3(d0rVar3, koc0Var5, new o9x(strD3, z0tVar, sb7Var, (byte) 0), qopVar7.d());
            case 26:
                kzp kzpVar3 = (kzp) obj3;
                qop qopVar8 = (qop) obj;
                bct bctVar5 = (bct) obj2;
                daq daqVar11 = kzpVar3.a;
                teq teqVar5 = kzpVar3.b;
                nhc nhcVar = new nhc(daqVar11, teqVar5, (byte) 4);
                qopVar8.getClass();
                bctVar5.getClass();
                ikp ikpVar = (ikp) new d3p(nhcVar, qopVar8, bctVar5).b;
                koc0 koc0Var6 = bctVar5.d;
                lcq lcqVar = (lcq) teqVar5.hg.get();
                c8o.l(lcqVar);
                d0r d0rVar4 = bctVar5.b;
                iac0 iac0VarC = qopVar8.c();
                String strD4 = qopVar8.d();
                yha1 yha1Var = (yha1) teqVar5.te.get();
                c8o.l(yha1Var);
                String strD5 = qopVar8.d();
                n6r0 n6r0Var = qopVar8.c;
                c8o.l(n6r0Var);
                l141 l141VarA = yha1Var.a(strD5, n6r0Var, bctVar5.e);
                dma1 dma1Var = qopVar8.d;
                luk lukVar6 = (luk) daqVar11.L1.get();
                c8o.l(lukVar6);
                wj3 wj3Var = new wj3(d0rVar4, iac0VarC, strD4, l141VarA, dma1Var, new rp4(false, false, lukVar6), teqVar5.i2());
                q8n q8nVar4 = (q8n) daqVar11.V2.get();
                c8o.l(q8nVar4);
                m720 m720Var = (m720) teqVar5.gg.get();
                c8o.l(m720Var);
                luk lukVar7 = (luk) daqVar11.L1.get();
                c8o.l(lukVar7);
                return new q7d0(ikpVar, koc0Var6, lcqVar, bctVar5, wj3Var, q8nVar4, m720Var, new rp4(false, false, lukVar7));
            case 27:
                qop qopVar9 = (qop) obj;
                jbt jbtVar3 = (jbt) obj2;
                xzp xzpVar2 = new xzp(((wzp) obj3).a);
                qopVar9.getClass();
                jbtVar3.getClass();
                return new v7d0((zpp) ((jly0) new t7p(xzpVar2, qopVar9, jbtVar3).a).get());
            case 28:
                daq daqVar12 = ((q0q) obj3).b;
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                Context context3 = (Context) daqVar12.x1.a;
                c8o.l(context3);
                return new uqg(context3, (byte) 2);
        }
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        byte b2 = 17;
        t700 t700Var = (t700) this.b;
        switch (b) {
            case 0:
                ze70 ze70Var = (ze70) zf30Var;
                af70 af70Var = (af70) t700Var.b.get();
                af70Var.getClass();
                ze70Var.getClass();
                qjp qjpVar = new qjp(af70Var);
                kly0 kly0Var = af70Var.h;
                c8o.l((ohv0) kly0Var.get());
                kly0 kly0Var2 = af70Var.b;
                wab wabVar = (wab) kly0Var2.get();
                c8o.l(wabVar);
                kly0 kly0Var3 = af70Var.e;
                c8o.l((t0i) kly0Var3.get());
                ze70Var.G1 = new l7m0(wabVar, (byte) 23);
                wab wabVar2 = (wab) kly0Var2.get();
                c8o.l(wabVar2);
                ze70Var.H1 = wabVar2;
                ohv0 ohv0Var = (ohv0) kly0Var.get();
                c8o.l(ohv0Var);
                i8h1 i8h1Var = (i8h1) af70Var.i.get();
                c8o.l(i8h1Var);
                kg0 kg0Var = (kg0) af70Var.k.get();
                c8o.l(kg0Var);
                mwn0 mwn0Var = (mwn0) af70Var.j.get();
                c8o.l(mwn0Var);
                Object obj = qjpVar.a;
                ze70Var.I1 = new fdc(ohv0Var, i8h1Var, kg0Var, mwn0Var, ((gmy0) ((jly0) obj).get()).h, (byte) 14);
                jkb1 jkb1Var = (jkb1) ((jly0) qjpVar.c).get();
                gks0 gks0Var = (gks0) af70Var.f.get();
                c8o.l(gks0Var);
                ohv0 ohv0Var2 = (ohv0) kly0Var.get();
                c8o.l(ohv0Var2);
                h5a1 h5a1Var = new h5a1(ohv0Var2, (byte) 5);
                wab wabVar3 = (wab) kly0Var2.get();
                c8o.l(wabVar3);
                t0i t0iVar = (t0i) kly0Var3.get();
                c8o.l(t0iVar);
                gw70 gw70Var = (gw70) af70Var.c.get();
                c8o.l(gw70Var);
                ze70Var.J1 = new mxa1(jkb1Var, gks0Var, h5a1Var, wabVar3, t0iVar, gw70Var);
                g1f0 g1f0Var = (g1f0) af70Var.l.get();
                c8o.l(g1f0Var);
                ze70Var.K1 = g1f0Var;
                u0i u0iVar = (u0i) af70Var.a.get();
                c8o.l(u0iVar);
                ze70Var.L1 = u0iVar;
                ze70Var.M1 = ((gmy0) ((jly0) obj).get()).h;
                o8r o8rVar = (o8r) af70Var.d.get();
                c8o.l(o8rVar);
                ze70Var.N1 = o8rVar;
                break;
            case 11:
                obb0 obb0Var = (obb0) zf30Var;
                zsj0 zsj0Var = (zsj0) t700Var.b.get();
                zsj0Var.getClass();
                obb0Var.getClass();
                obb0Var.W1 = (o3n0) ((jly0) new qjp(zsj0Var).c).get();
                break;
            case 12:
                qcb0 qcb0Var = (qcb0) zf30Var;
                rcb0 rcb0Var = (rcb0) t700Var.b.get();
                rcb0Var.getClass();
                qcb0Var.getClass();
                Object obj2 = new qjp(rcb0Var).c;
                o3n0 o3n0Var = (o3n0) ((jly0) obj2).get();
                Executor executor = (Executor) rcb0Var.i.get();
                c8o.l(executor);
                qcb0Var.G1 = new lcb0(o3n0Var, executor);
                kly0 kly0Var4 = rcb0Var.f;
                RetrofitMaker retrofitMaker = (RetrofitMaker) kly0Var4.get();
                c8o.l(retrofitMaker);
                ps7 ps7Var = new ps7((x89) retrofitMaker.createWebgateService(x89.class, "android-language-musiclanguage"), (byte) 5);
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) kly0Var4.get();
                c8o.l(retrofitMaker2);
                kp00 kp00Var = new kp00(ps7Var, new o2b1((odi1) retrofitMaker2.createWebgateService(odi1.class, "android-language-musiclanguage"), (byte) 21), (byte) 29);
                RetrofitMaker retrofitMaker3 = (RetrofitMaker) kly0Var4.get();
                c8o.l(retrofitMaker3);
                n801 n801Var = new n801(new o2b1((odi1) retrofitMaker3.createWebgateService(odi1.class, "android-language-musiclanguage"), (byte) 21), (byte) 20);
                dxz0 dxz0Var = (dxz0) rcb0Var.g.get();
                c8o.l(dxz0Var);
                Scheduler scheduler = (Scheduler) rcb0Var.d.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) rcb0Var.e.get();
                c8o.l(scheduler2);
                Scheduler scheduler3 = (Scheduler) rcb0Var.c.get();
                c8o.l(scheduler3);
                qcb0Var.H1 = new hdb0(kp00Var, n801Var, dxz0Var, scheduler, scheduler2, scheduler3);
                pbb0 pbb0Var = (pbb0) rcb0Var.a.get();
                c8o.l(pbb0Var);
                qcb0Var.I1 = pbb0Var;
                xfx xfxVar = (xfx) rcb0Var.b.get();
                c8o.l(xfxVar);
                qcb0Var.J1 = xfxVar;
                qcb0Var.K1 = (o3n0) ((jly0) obj2).get();
                break;
            case 13:
                uyb0 uyb0Var = (uyb0) zf30Var;
                vyb0 vyb0Var = (vyb0) t700Var.b.get();
                vyb0Var.getClass();
                uyb0Var.getClass();
                p2o0 p2o0Var = new p2o0(vyb0Var, uyb0Var);
                r1n0 r1n0Var = (r1n0) vyb0Var.l.get();
                c8o.l(r1n0Var);
                kh5 kh5Var = (kh5) vyb0Var.i.get();
                c8o.l(kh5Var);
                kly0 kly0Var5 = vyb0Var.o;
                luk lukVar = (luk) kly0Var5.get();
                c8o.l(lukVar);
                ye90 ye90Var = new ye90(kh5Var, new co4(lukVar), b2);
                rdo rdoVar = (rdo) vyb0Var.j.get();
                c8o.l(rdoVar);
                x390 x390Var = new x390(ye90Var, rdoVar, (byte) 22);
                ay0 ay0Var = (ay0) vyb0Var.a.get();
                c8o.l(ay0Var);
                ay0 ay0Var2 = (ay0) vyb0Var.b.get();
                c8o.l(ay0Var2);
                luk lukVar2 = (luk) kly0Var5.get();
                c8o.l(lukVar2);
                uyb0Var.W1 = r1n0Var.a(uyb0Var, uyb0Var, new o6e0(new ft30(1, new bzb0(x390Var, ay0Var, ay0Var2, new ey4(false, false, lukVar2), l1b0.u(uyb0Var), (d3d1) uyb0Var.O0().getSerializable("sponsor_surface_key"), l1b0.C(uyb0Var)), bzb0.class, "getLeavebehindAds", "getLeavebehindAds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 28), f46.I(new p6e0[0])));
                i1n0 i1n0Var = (i1n0) vyb0Var.m.get();
                c8o.l(i1n0Var);
                uyb0Var.X1 = l1b0.A(i1n0Var, uyb0Var, uyb0Var, (nlp) ((jly0) p2o0Var.g).get(), l1b0.u(uyb0Var));
                break;
            default:
                wyb0 wyb0Var = (wyb0) zf30Var;
                xyb0 xyb0Var = (xyb0) t700Var.b.get();
                xyb0Var.getClass();
                wyb0Var.getClass();
                cp31 cp31Var = new cp31();
                cp31Var.a = xyb0Var;
                cp31Var.b = wyb0Var;
                cp31Var.c = iy81.a(new blp(cp31Var, 1, (byte) 4));
                cp31Var.d = new blp(cp31Var, 3, (byte) 4);
                cp31Var.e = iy81.a(new blp(cp31Var, 2, (byte) 4));
                cp31Var.f = iy81.a(new blp(cp31Var, 0, (byte) 4));
                r1n0 r1n0Var2 = (r1n0) xyb0Var.l.get();
                c8o.l(r1n0Var2);
                kh5 kh5Var2 = (kh5) xyb0Var.i.get();
                c8o.l(kh5Var2);
                kly0 kly0Var6 = xyb0Var.o;
                luk lukVar3 = (luk) kly0Var6.get();
                c8o.l(lukVar3);
                ye90 ye90Var2 = new ye90(kh5Var2, new co4(lukVar3), b2);
                rdo rdoVar2 = (rdo) xyb0Var.j.get();
                c8o.l(rdoVar2);
                x390 x390Var2 = new x390(ye90Var2, rdoVar2, (byte) 22);
                ay0 ay0Var3 = (ay0) xyb0Var.a.get();
                c8o.l(ay0Var3);
                ay0 ay0Var4 = (ay0) xyb0Var.b.get();
                c8o.l(ay0Var4);
                luk lukVar4 = (luk) kly0Var6.get();
                c8o.l(lukVar4);
                wyb0Var.G1 = r1n0Var2.a(wyb0Var, wyb0Var, new o6e0(new ft30(1, new bzb0(x390Var2, ay0Var3, ay0Var4, new ey4(false, false, lukVar4), l1b0.u(wyb0Var), (d3d1) wyb0Var.O0().getSerializable("sponsor_surface_key"), l1b0.C(wyb0Var)), bzb0.class, "getLeavebehindAds", "getLeavebehindAds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 28), f46.I(new p6e0[0])));
                i1n0 i1n0Var2 = (i1n0) xyb0Var.m.get();
                c8o.l(i1n0Var2);
                wyb0Var.H1 = l1b0.A(i1n0Var2, wyb0Var, wyb0Var, (nlp) ((jly0) cp31Var.f).get(), l1b0.u(wyb0Var));
                break;
        }
    }

    public boolean g(jl00 jl00Var, int i, Bundle bundle) {
        rcl dulVar;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((ii80) jl00Var.b).f();
                Parcelable parcelable = (Parcelable) ((ii80) jl00Var.b).c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ii80 ii80Var = (ii80) jl00Var.b;
        ClipData clipData = new ClipData(ii80Var.getDescription(), new ClipData.Item(ii80Var.a()));
        if (i2 >= 31) {
            dulVar = new rcl(clipData, 2);
        } else {
            dulVar = new dul();
            ((dul) dulVar).b = clipData;
            ((dul) dulVar).c = 2;
        }
        dulVar.a(ii80Var.b());
        dulVar.setExtras(bundle);
        return b8k1.j(appCompatEditText, dulVar.build()) == null;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return ((vvc0) this.b).d((wsc0) obj, (rp91) obj2, (Map) obj3);
    }

    public void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((axh1) obj).close();
                break;
            default:
                f9a0 f9a0Var = (f9a0) obj;
                i9a0 i9a0Var = f9a0Var.d;
                if (i9a0Var.f.compareAndSet(1, 4)) {
                    f9a0Var.a.onResponseStarted(i9a0Var, i9a0Var.o);
                }
                break;
        }
    }
}
