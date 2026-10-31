package p;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.IInterface;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class g21 implements yg30, Function, z321, pw60, e36 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g21(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public int a(int i, flb0 flb0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 28:
                return ((pl3) obj).c(0, i);
            default:
                return ((nl3) obj).a(0, i, flb0Var);
        }
    }

    public Object apply(Object obj) {
        x43 x43Var = (x43) this.b;
        if (!((Boolean) obj).booleanValue()) {
            return CompletableEmpty.a;
        }
        return ((v7s) x43Var).b.c().k(1).ignoreElement().c(new CompletableFromAction(new w43(x43Var, (byte) 0)));
    }

    public Object b() {
        TemplateWrapper templateWrapper;
        hp41 hp41Var = (hp41) this.b;
        sge1.a();
        ap41 ap41VarA = hp41Var.a();
        if (Log.isLoggable("CarApp", 3)) {
            ap41VarA.toString();
        }
        sxd1 sxd1VarD = ap41VarA.d();
        TemplateWrapper templateWrapperWrap = (!ap41VarA.f || (templateWrapper = ap41VarA.e) == null) ? TemplateWrapper.wrap(sxd1VarD) : TemplateWrapper.wrap(sxd1VarD, new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
        ap41VarA.f = false;
        ap41VarA.e = templateWrapperWrap;
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(sxd1VarD);
            ap41VarA.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (ap41 ap41Var : hp41Var.a) {
            TemplateWrapper templateWrapperWrap2 = ap41Var.e;
            if (templateWrapperWrap2 == null) {
                templateWrapperWrap2 = TemplateWrapper.wrap(ap41Var.d());
                ap41Var.e = templateWrapperWrap2;
            }
            arrayList.add(new TemplateInfo(templateWrapperWrap2.getTemplate().getClass(), ap41Var.e.getId()));
        }
        templateWrapperWrap.setTemplateInfosForScreenStack(arrayList);
        return templateWrapperWrap;
    }

    public Object c(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                kzp kzpVar = (kzp) obj3;
                qop qopVar = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar = kzpVar.a;
                lzp lzpVar = new lzp(daqVar, kzpVar.b);
                qopVar.getClass();
                jbtVar.getClass();
                asn asnVar = new asn();
                asnVar.a = qopVar;
                asnVar.b = lzpVar;
                asnVar.c = new jwo(asnVar, (byte) 7);
                koc0 koc0Var = jbtVar.d;
                String strD = qopVar.d();
                jwo jwoVar = (jwo) asnVar.c;
                luk lukVar = (luk) daqVar.L1.get();
                c8o.l(lukVar);
                return new id1(koc0Var, strD, jwoVar, new bp4(false, lukVar));
            case 2:
                bct bctVar = (bct) obj2;
                l7m0 l7m0Var = new l7m0(((mzp) obj3).a, (byte) 15);
                ((qop) obj).getClass();
                bctVar.getClass();
                return new qpg(bctVar.d, bctVar, (xwo) ((jly0) new oql(l7m0Var, bctVar).c).get());
            case 3:
                nzp nzpVar = (nzp) obj3;
                qop qopVar2 = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                ozp ozpVar = new ozp(nzpVar.a, nzpVar.b);
                qopVar2.getClass();
                lbtVar.getClass();
                asn asnVar2 = new asn();
                asnVar2.a = qopVar2;
                asnVar2.b = ozpVar;
                asnVar2.c = iy81.a(new jwo(asnVar2, (byte) 11));
                String strD2 = qopVar2.d();
                String str = qopVar2.e;
                c8o.l(str);
                return new bn1(strD2, str, lbtVar.b, (fxo) ((jly0) asnVar2.c).get());
            case 4:
                kzp kzpVar2 = (kzp) obj3;
                qop qopVar3 = (qop) obj;
                zbt zbtVar = (zbt) obj2;
                daq daqVar2 = kzpVar2.a;
                teq teqVar = kzpVar2.b;
                qopVar3.getClass();
                zbtVar.getClass();
                String strD3 = qopVar3.d();
                i8h1 i8h1Var = (i8h1) daqVar2.A5.get();
                c8o.l(i8h1Var);
                pv80 pv80Var = new pv80(i8h1Var, zbtVar.e);
                oj3 oj3Var = (oj3) teqVar.k1.get();
                c8o.l(oj3Var);
                bl3 bl3Var = (bl3) daqVar2.q8.get();
                c8o.l(bl3Var);
                return new en1(strD3, pv80Var, oj3Var, bl3Var, (byte) 0);
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            default:
                ozp ozpVar2 = (ozp) obj3;
                zbt zbtVar2 = (zbt) obj2;
                daq daqVar3 = ozpVar2.a;
                teq teqVar2 = ozpVar2.b;
                ((qop) obj).getClass();
                zbtVar2.getClass();
                f1n0 f1n0Var = (f1n0) teqVar2.T2.get();
                c8o.l(f1n0Var);
                i8h1 i8h1Var2 = (i8h1) daqVar3.A5.get();
                c8o.l(i8h1Var2);
                r6h1 r6h1Var = zbtVar2.e;
                ux3 ux3Var = (ux3) teqVar2.d8.get();
                c8o.l(ux3Var);
                return new en1(f1n0Var, i8h1Var2, r6h1Var, ux3Var, (byte) 1);
            case 9:
                kzp kzpVar3 = (kzp) obj3;
                qop qopVar4 = (qop) obj;
                jbt jbtVar2 = (jbt) obj2;
                daq daqVar4 = kzpVar3.a;
                nzp nzpVar2 = new nzp(daqVar4, kzpVar3.b);
                qopVar4.getClass();
                jbtVar2.getClass();
                wzn wznVar = new wzn(nzpVar2, qopVar4, jbtVar2);
                koc0 koc0Var2 = jbtVar2.d;
                String strD4 = qopVar4.d();
                jwo jwoVar2 = (jwo) wznVar.d;
                xvo xvoVar = (xvo) daqVar4.H8.get();
                c8o.l(xvoVar);
                return new d82(koc0Var2, strD4, jwoVar2, xvoVar);
            case 10:
                qop qopVar5 = (qop) obj;
                gl90 gl90Var = (gl90) obj2;
                daq daqVar5 = ((rzp) obj3).b;
                qopVar5.getClass();
                gl90Var.getClass();
                yqg yqgVar = (yqg) daqVar5.J1.get();
                c8o.l(yqgVar);
                return new h82(yqgVar, gl90Var.e, qopVar5.d(), (byte) 0);
            case 13:
                kzp kzpVar4 = (kzp) obj3;
                qop qopVar6 = (qop) obj;
                qbt qbtVar = (qbt) obj2;
                nzp nzpVar3 = new nzp(kzpVar4.a, kzpVar4.b);
                qopVar6.getClass();
                qbtVar.getClass();
                asn asnVar3 = new asn();
                asnVar3.a = nzpVar3;
                asnVar3.b = qbtVar;
                asnVar3.c = iy81.a(new jwo(asnVar3, (byte) 18));
                return new ca3(qopVar6.d(), (hyo) ((jly0) asnVar3.c).get());
            case 14:
                vzp vzpVar = new vzp(((uzp) obj3).b, (byte) 0);
                ((qop) obj).getClass();
                ((tbt) obj2).getClass();
                return new ka3((iyo) ((jly0) new gal(vzpVar).c).get());
            case 15:
                qop qopVar7 = (qop) obj;
                vbt vbtVar = (vbt) obj2;
                teq teqVar3 = ((wzp) obj3).a;
                qopVar7.getClass();
                vbtVar.getClass();
                jly0 jly0VarA = iy81.a(new fyo((byte) 1));
                yzc0 yzc0Var = vbtVar.b;
                String strD5 = qopVar7.d();
                jyo jyoVar = (jyo) jly0VarA.get();
                c8c0 c8c0Var = qopVar7.b;
                t740 t740Var = (t740) teqVar3.Ec.get();
                c8o.l(t740Var);
                return new qa3(yzc0Var, strD5, jyoVar, c8c0Var, t740Var);
            case 16:
                ozp ozpVar3 = (ozp) obj3;
                bct bctVar2 = (bct) obj2;
                daq daqVar6 = ozpVar3.a;
                xzp xzpVar = new xzp(daqVar6, ozpVar3.b);
                ((qop) obj).getClass();
                bctVar2.getClass();
                kyo kyoVar = (kyo) ((jly0) new ham(xzpVar, bctVar2).c).get();
                koc0 koc0Var3 = bctVar2.d;
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar6.Y3.get();
                c8o.l(retrofitMaker);
                zc80 zc80Var = new zc80((dug0) retrofitMaker.createWebgateService(dug0.class, "android-liveroom-listening-party-card"), (byte) 20);
                yqg yqgVar2 = (yqg) daqVar6.J1.get();
                c8o.l(yqgVar2);
                return new fb3(kyoVar, koc0Var3, new j2e0(zc80Var, new fug0(yqgVar2), (byte) 17));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                kzp kzpVar5 = (kzp) obj3;
                bct bctVar3 = (bct) obj2;
                daq daqVar7 = kzpVar5.a;
                yzp yzpVar = new yzp(daqVar7, kzpVar5.b);
                ((qop) obj).getClass();
                bctVar3.getClass();
                oql oqlVar = new oql(yzpVar, bctVar3);
                Context context = (Context) daqVar7.x1.a;
                c8o.l(context);
                return new rb3(context, bctVar3.d, (qyo) ((jly0) oqlVar.c).get());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                teq teqVar4 = ((zzp) obj3).a;
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                abm abmVar = (abm) teqVar4.Qa.get();
                c8o.l(abmVar);
                return new wb3(abmVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                nzp nzpVar4 = (nzp) obj3;
                shv0 shv0Var = (shv0) obj;
                daq daqVar8 = nzpVar4.a;
                teq teqVar5 = nzpVar4.b;
                shv0Var.getClass();
                ((rhv0) obj2).getClass();
                String str2 = shv0Var.b;
                c8o.l(str2);
                o241 o241Var = (o241) daqVar8.u4.get();
                c8o.l(o241Var);
                iyc0 iyc0Var = (iyc0) teqVar5.g1.get();
                c8o.l(iyc0Var);
                rh11 rh11Var = (rh11) daqVar8.ia.get();
                c8o.l(rh11Var);
                return new dc3(str2, o241Var, iyc0Var, rh11Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ozp ozpVar4 = (ozp) obj3;
                bct bctVar4 = (bct) obj2;
                daq daqVar9 = ozpVar4.a;
                kzp kzpVar6 = new kzp(daqVar9, ozpVar4.b);
                ((qop) obj).getClass();
                bctVar4.getClass();
                asn asnVar4 = new asn();
                asnVar4.a = kzpVar6;
                asnVar4.b = bctVar4;
                asnVar4.c = iy81.a(new jwo(asnVar4, (byte) 22));
                Context context2 = (Context) daqVar9.x1.a;
                c8o.l(context2);
                return new ce3(context2, bctVar4.d, (fzo) ((jly0) asnVar4.c).get(), (byte) 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                nzp nzpVar5 = (nzp) obj3;
                fl90 fl90Var = (fl90) obj2;
                daq daqVar10 = nzpVar5.a;
                ozp ozpVar5 = new ozp(daqVar10, nzpVar5.b);
                ((qop) obj).getClass();
                fl90Var.getClass();
                gzo gzoVar = (gzo) ((jly0) new gal(ozpVar5, fl90Var).c).get();
                bk90 bk90Var = fl90Var.d;
                c8o.l(bk90Var);
                Context context3 = (Context) daqVar10.x1.a;
                c8o.l(context3);
                return new bg3(gzoVar, bk90Var, context3);
            case 22:
                qop qopVar8 = (qop) obj;
                daq daqVar11 = ((a0q) obj3).a;
                qopVar8.getClass();
                ((bct) obj2).getClass();
                Context context4 = (Context) daqVar11.x1.a;
                c8o.l(context4);
                return new fb3(new dx0(new lb(context4)), new m980(qopVar8.b));
            case 23:
                kzp kzpVar7 = (kzp) obj3;
                qop qopVar9 = (qop) obj;
                bct bctVar5 = (bct) obj2;
                daq daqVar12 = kzpVar7.a;
                b0q b0qVar = new b0q(daqVar12, kzpVar7.b);
                qopVar9.getClass();
                bctVar5.getClass();
                asn asnVar5 = new asn();
                asnVar5.a = b0qVar;
                asnVar5.b = bctVar5;
                asnVar5.c = iy81.a(new jwo(asnVar5, (byte) 24));
                Context context5 = (Context) daqVar12.x1.a;
                c8o.l(context5);
                koc0 koc0Var4 = bctVar5.d;
                o241 o241Var2 = (o241) daqVar12.u4.get();
                c8o.l(o241Var2);
                return new zg3(context5, koc0Var4, o241Var2, qopVar9.b, (hzo) ((jly0) asnVar5.c).get());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                shv0 shv0Var2 = (shv0) obj;
                daq daqVar13 = ((d0q) obj3).a;
                shv0Var2.getClass();
                ((rhv0) obj2).getClass();
                Intent intent = shv0Var2.a;
                c8o.l(intent);
                String str3 = shv0Var2.b;
                c8o.l(str3);
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) daqVar13.Y3.get();
                c8o.l(retrofitMaker2);
                ej3 ej3Var = (ej3) retrofitMaker2.createWebgateService(ej3.class, "list-ux-platform-consumers-algotorial-preloaders-algosharing");
                c8o.m(ej3Var);
                return new dj3(intent, str3, ej3Var);
        }
    }

    public Object d(IInterface iInterface) {
        ((IAppHost) iInterface).sendLocation((Location) this.b);
        return null;
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        h21 h21Var = (h21) this.b;
        switch (b) {
            case 0:
                b21 b21Var = (b21) zf30Var;
                d21 d21Var = (d21) h21Var.b.get();
                d21Var.getClass();
                b21Var.getClass();
                wdm wdmVar = new wdm(d21Var);
                kg0 kg0Var = (kg0) d21Var.k.get();
                c8o.l(kg0Var);
                b21Var.G1 = kg0Var;
                lg0 lg0Var = (lg0) d21Var.l.get();
                c8o.l(lg0Var);
                b21Var.H1 = lg0Var;
                kly0 kly0Var = d21Var.m;
                ohv0 ohv0Var = (ohv0) kly0Var.get();
                c8o.l(ohv0Var);
                b21Var.I1 = new gid(ohv0Var, (b2r0) ((jly0) wdmVar.d).get(), (byte) 12);
                c8o.l((iwe0) d21Var.j.get());
                a11 a11Var = (a11) d21Var.a.get();
                c8o.l(a11Var);
                b21Var.J1 = a11Var;
                b21Var.K1 = new kr60((lwo) ((jly0) wdmVar.f).get(), (byte) 6);
                ohv0 ohv0Var2 = (ohv0) kly0Var.get();
                c8o.l(ohv0Var2);
                gid gidVar = new gid(ohv0Var2, (b2r0) ((jly0) wdmVar.d).get(), (byte) 12);
                kly0 kly0Var2 = d21Var.u;
                g1f0 g1f0Var = (g1f0) kly0Var2.get();
                c8o.l(g1f0Var);
                b21Var.L1 = new c21(gidVar, g1f0Var, (i8h1) ((jly0) wdmVar.g).get(), (qhe0) ((jly0) wdmVar.c).get(), (vzl0) ((jly0) wdmVar.h).get(), (wdl0) ((jly0) wdmVar.i).get(), (zdl0) ((jly0) wdmVar.t).get(), (xzl0) ((jly0) wdmVar.X).get(), (yzl0) ((jly0) wdmVar.Y).get(), (byte) 0);
                Observable observable = (Observable) d21Var.s.get();
                c8o.l(observable);
                b21Var.M1 = observable;
                Scheduler scheduler = (Scheduler) d21Var.b.get();
                c8o.l(scheduler);
                b21Var.N1 = scheduler;
                a031 a031Var = (a031) d21Var.t.get();
                c8o.l(a031Var);
                b21Var.O1 = a031Var;
                g1f0 g1f0Var2 = (g1f0) kly0Var2.get();
                c8o.l(g1f0Var2);
                b21Var.P1 = g1f0Var2;
                b21Var.Q1 = (mir0) ((jly0) wdmVar.Z).get();
                mwn0 mwn0Var = (mwn0) d21Var.B.get();
                c8o.l(mwn0Var);
                b21Var.R1 = mwn0Var;
                yqg yqgVar = (yqg) d21Var.C.get();
                c8o.l(yqgVar);
                b21Var.S1 = yqgVar;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                fi2 fi2Var = (fi2) zf30Var;
                gi2 gi2Var = (gi2) h21Var.b.get();
                gi2Var.getClass();
                fi2Var.getClass();
                kg0 kg0Var2 = (kg0) gi2Var.a.get();
                c8o.l(kg0Var2);
                i8h1 i8h1Var = (i8h1) gi2Var.b.get();
                c8o.l(i8h1Var);
                fi2Var.G1 = new zwg(kg0Var2, i8h1Var, new bqk0((byte) 2), new bqk0((byte) 1), new bqk0((byte) 3));
                break;
            case 5:
                jt1 jt1Var = (jt1) zf30Var;
                kt1 kt1Var = (kt1) h21Var.b.get();
                kt1Var.getClass();
                jt1Var.getClass();
                ib3 ib3Var = new ib3(kt1Var, jt1Var);
                jt1Var.H1 = (gxo) ((jly0) ib3Var.H).get();
                jt1Var.I1 = (so1) ((jly0) ib3Var.A).get();
                gw70 gw70Var = (gw70) kt1Var.j.get();
                c8o.l(gw70Var);
                jt1Var.J1 = gw70Var;
                jt1Var.K1 = (b2r0) ((jly0) ib3Var.c).get();
                jt1Var.L1 = (w1r0) ((jly0) ib3Var.I).get();
                break;
            case 6:
                lx1 lx1Var = (lx1) zf30Var;
                mx1 mx1Var = (mx1) h21Var.b.get();
                mx1Var.getClass();
                lx1Var.getClass();
                oql oqlVar = new oql(mx1Var);
                xfx xfxVar = (xfx) mx1Var.b.get();
                c8o.l(xfxVar);
                lx1Var.c2 = new yfx(xfxVar.e, (byte) 1);
                lx1Var.d2 = (kxo) ((jly0) oqlVar.c).get();
                break;
            case 7:
                h22 h22Var = (h22) zf30Var;
                i22 i22Var = (i22) h21Var.b.get();
                i22Var.getClass();
                h22Var.getClass();
                gal galVar = new gal(i22Var, h22Var, false, (byte) 24);
                idd1 idd1Var = h22Var.M1;
                n12 n12Var = (n12) idd1Var.getValue();
                c8o.m(n12Var);
                n12 n12Var2 = (n12) idd1Var.getValue();
                c8o.m(n12Var2);
                RetrofitMaker retrofitMaker = (RetrofitMaker) i22Var.c.get();
                c8o.l(retrofitMaker);
                dma1 dma1Var = (dma1) i22Var.d.get();
                c8o.l(dma1Var);
                kly0 kly0Var3 = i22Var.b;
                q8n q8nVar = (q8n) kly0Var3.get();
                c8o.l(q8nVar);
                cbm0 cbm0Var = cbm0.a;
                i12 i12VarC = cbm0.c(retrofitMaker, dma1Var, q8nVar);
                c8o.m(i12VarC);
                b8p1 b8p1VarA = galVar.a();
                kly0 kly0Var4 = i22Var.a;
                q8n q8nVar2 = (q8n) kly0Var4.get();
                c8o.l(q8nVar2);
                mmw mmwVar = new mmw(n12Var2, i12VarC, b8p1VarA, q8nVar2, new mgx0((byte) 27));
                q8n q8nVar3 = (q8n) kly0Var3.get();
                c8o.l(q8nVar3);
                q8n q8nVar4 = (q8n) kly0Var4.get();
                c8o.l(q8nVar4);
                h22Var.N1 = new q22(n12Var, mmwVar, q8nVar3, q8nVar4);
                h22Var.O1 = galVar.a();
                kt91 kt91Var = (kt91) i22Var.g.get();
                c8o.l(kt91Var);
                h22Var.P1 = kt91Var;
                hik1 hik1Var = (hik1) i22Var.e.get();
                c8o.l(hik1Var);
                h22Var.S1 = hik1Var;
                break;
            case 8:
                n42 n42Var = (n42) zf30Var;
                o42 o42Var = (o42) h21Var.b.get();
                o42Var.getClass();
                n42Var.getClass();
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) o42Var.c.get();
                c8o.l(retrofitMaker2);
                rjn rjnVar = new rjn((sav) retrofitMaker2.createWebgateService(sav.class, "android-adsdisplay-dsa"), (byte) 13);
                g341 g341Var = (g341) o42Var.b.get();
                c8o.l(g341Var);
                dg30 dg30Var = (dg30) o42Var.a.get();
                c8o.l(dg30Var);
                u961 u961Var = new u961(rjnVar, g341Var, new l7m0(dg30Var, (byte) 14), new lqr((Object) n42Var, (byte) 19));
                Scheduler scheduler2 = (Scheduler) o42Var.f.get();
                c8o.l(scheduler2);
                v42 v42Var = new v42(u961Var, scheduler2);
                Scheduler scheduler3 = (Scheduler) o42Var.e.get();
                c8o.l(scheduler3);
                n42Var.W1 = new g52(v42Var, scheduler3);
                gw70 gw70Var2 = (gw70) o42Var.d.get();
                c8o.l(gw70Var2);
                n42Var.X1 = gw70Var2;
                break;
        }
    }
}
