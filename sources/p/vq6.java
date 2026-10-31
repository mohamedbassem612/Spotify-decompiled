package p;

import android.app.Activity;
import android.content.Context;
import app.rive.runtime.kotlin.core.CDNAssetLoader;
import com.android.volley.VolleyError;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class vq6 implements Function, yg30, ObservableOnSubscribe, ky21 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                nzp nzpVar = (nzp) obj3;
                bct bctVar = (bct) obj2;
                daq daqVar = nzpVar.a;
                g0q g0qVar = new g0q(daqVar, nzpVar.b);
                ((qop) obj).getClass();
                bctVar.getClass();
                asn asnVar = new asn();
                asnVar.a = bctVar;
                asnVar.b = g0qVar;
                asnVar.c = iy81.a(new jwo(asnVar, (byte) 26));
                w4b1 w4b1VarD = asnVar.d();
                yzo yzoVar = (yzo) ((jly0) asnVar.c).get();
                Scheduler scheduler = (Scheduler) daqVar.z1.get();
                c8o.l(scheduler);
                return new uq6(w4b1VarD, yzoVar, scheduler);
            case 1:
                bct bctVar2 = (bct) obj2;
                lzp lzpVar = new lzp(((h0q) obj3).a);
                ((qop) obj).getClass();
                bctVar2.getClass();
                return new fb3(bctVar2.d, (a0p) ((jly0) new wzn(lzpVar, bctVar2).d).get());
            case 2:
                ozp ozpVar = (ozp) obj3;
                qop qopVar = (qop) obj;
                fl90 fl90Var = (fl90) obj2;
                kzp kzpVar = new kzp(ozpVar.a, ozpVar.b);
                qopVar.getClass();
                fl90Var.getClass();
                cp31 cp31Var = new cp31();
                cp31Var.a = qopVar;
                cp31Var.b = fl90Var;
                cp31Var.c = kzpVar;
                cp31Var.d = iy81.a(new fwo(cp31Var, 1, (byte) 28));
                cp31Var.e = iy81.a(new fwo(cp31Var, 2, (byte) 28));
                cp31Var.f = iy81.a(new fwo(cp31Var, 0, (byte) 28));
                String strD = qopVar.d();
                bk90 bk90Var = fl90Var.d;
                c8o.l(bk90Var);
                return new bg3(strD, bk90Var, (p1p) ((jly0) cp31Var.f).get());
            case 3:
                nzp nzpVar2 = (nzp) obj3;
                qop qopVar2 = (qop) obj;
                fl90 fl90Var2 = (fl90) obj2;
                daq daqVar2 = nzpVar2.a;
                teq teqVar = nzpVar2.b;
                ozp ozpVar2 = new ozp(daqVar2, teqVar);
                qopVar2.getClass();
                fl90Var2.getClass();
                a680 a680Var = new a680();
                a680Var.a = ozpVar2;
                a680Var.b = iy81.a(new fwo(a680Var, 0, (byte) 29));
                a680Var.c = iy81.a(new fwo(a680Var, 1, (byte) 29));
                a680Var.d = iy81.a(new fwo(a680Var, 2, (byte) 29));
                a680Var.e = new fwo(a680Var, 4, (byte) 29);
                a680Var.f = iy81.a(new fwo(a680Var, 3, (byte) 29));
                lik1 lik1VarG = qopVar2.g();
                d0r d0rVar = fl90Var2.b;
                yzc0 yzc0Var = fl90Var2.a;
                String strD2 = qopVar2.d();
                zs11 zs11Var = (zs11) teqVar.J8.get();
                c8o.l(zs11Var);
                muz muzVarE = qopVar2.e();
                ruz ruzVarA = ((cyp) ((uap) qopVar2.a.b).u.get()).a();
                s1p s1pVar = (s1p) ((jly0) a680Var.b).get();
                zwp zwpVar = (zwp) teqVar.qf.get();
                c8o.l(zwpVar);
                t1p t1pVar = (t1p) ((jly0) a680Var.c).get();
                d2q d2qVar = (d2q) teqVar.b.I.get();
                c8o.l(d2qVar);
                luk lukVar = (luk) daqVar2.L1.get();
                c8o.l(lukVar);
                p68 p68Var = new p68(muzVarE, ruzVarA, s1pVar, zwpVar, t1pVar, d2qVar, new jq4(lukVar).l());
                u1p u1pVar = (u1p) ((jly0) a680Var.d).get();
                Context context = (Context) daqVar2.x1.a;
                c8o.l(context);
                quc0 quc0Var = (quc0) teqVar.Mb.get();
                c8o.l(quc0Var);
                bv40 bv40Var = new bv40(new fb8(context, quc0Var), (byte) 23);
                oum oumVar = (oum) daqVar2.Eq.get();
                c8o.l(oumVar);
                ajq0 ajq0Var = new ajq0(zs11Var, p68Var, u1pVar, bv40Var, new eb8(oumVar, (v1p) ((jly0) a680Var.f).get(), (byte) 0));
                d511 d511VarH3 = teqVar.h3();
                i5y0 i5y0Var = (i5y0) teqVar.pb.get();
                c8o.l(i5y0Var);
                uxy0 uxy0Var = new uxy0(d511VarH3, i5y0Var, (byte) 18);
                f4x0 f4x0Var = new f4x0((byte) 29);
                hdn1 hdn1Var = new hdn1(qopVar2.d(), (byte) 4);
                f1n0 f1n0Var = (f1n0) teqVar.T2.get();
                c8o.l(f1n0Var);
                luk lukVar2 = (luk) daqVar2.L1.get();
                c8o.l(lukVar2);
                nm1 nm1Var = new nm1(d0rVar, f1n0Var, new jq4(lukVar2));
                String strD3 = qopVar2.d();
                d2f1 d2f1VarP3 = teqVar.P3();
                me30 me30Var = (me30) daqVar2.w7.get();
                c8o.l(me30Var);
                tu11 tu11Var = new tu11(d0rVar, strD3, d2f1VarP3, me30Var);
                me30 me30Var2 = (me30) daqVar2.w7.get();
                c8o.l(me30Var2);
                i5y0 i5y0Var2 = (i5y0) teqVar.pb.get();
                c8o.l(i5y0Var2);
                return new wo7(lik1VarG, d0rVar, yzc0Var, strD2, ajq0Var, uxy0Var, f4x0Var, hdn1Var, nm1Var, tu11Var, me30Var2, i5y0Var2);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            default:
                qop qopVar3 = (qop) obj;
                bct bctVar3 = (bct) obj2;
                daq daqVar3 = ((q0q) obj3).b;
                qopVar3.getClass();
                bctVar3.getClass();
                jly0 jly0VarA = iy81.a(new fyo((byte) 5));
                u9c0 u9c0VarQ = cto1.q(qopVar3.c());
                c3p c3pVar = (c3p) jly0VarA.get();
                Context context2 = (Context) daqVar3.x1.a;
                c8o.l(context2);
                String strD4 = qopVar3.d();
                String str = qopVar3.e;
                c8o.l(str);
                return new lsb(u9c0VarQ, bctVar3, c3pVar, new cab(context2, strD4, str));
            case 13:
                kzp kzpVar2 = (kzp) obj3;
                qop qopVar4 = (qop) obj;
                daq daqVar4 = kzpVar2.a;
                teq teqVar2 = kzpVar2.b;
                qopVar4.getClass();
                ((act) obj2).getClass();
                String strD5 = qopVar4.d();
                iyc0 iyc0Var = (iyc0) teqVar2.g1.get();
                c8o.l(iyc0Var);
                uu00 uu00Var = (uu00) daqVar4.a5.get();
                c8o.l(uu00Var);
                mnk0 mnk0Var = (mnk0) teqVar2.b6.get();
                c8o.l(mnk0Var);
                q8n q8nVar = (q8n) daqVar4.E1.get();
                c8o.l(q8nVar);
                return new yu8(strD5, iyc0Var, uu00Var, mnk0Var, q8nVar);
            case 14:
                nzp nzpVar3 = (nzp) obj3;
                qop qopVar5 = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                daq daqVar5 = nzpVar3.a;
                teq teqVar3 = nzpVar3.b;
                qopVar5.getClass();
                lbtVar.getClass();
                String strD6 = qopVar5.d();
                String strD7 = qopVar5.d();
                jjk0 jjk0Var = (jjk0) teqVar3.U5.get();
                c8o.l(jjk0Var);
                zwz0 zwz0Var = (zwz0) daqVar5.U1.get();
                c8o.l(zwz0Var);
                b9q b9qVar = (b9q) daqVar5.br.get();
                c8o.l(b9qVar);
                rwj rwjVar = new rwj(strD7, jjk0Var, zwz0Var, b9qVar, lbtVar.d);
                p5q p5qVar = (p5q) teqVar3.c6.get();
                c8o.l(p5qVar);
                d520 d520VarA = p5qVar.a(lbtVar.a);
                Context context3 = (Context) daqVar5.x1.a;
                c8o.l(context3);
                bw8 bw8Var = new bw8(context3);
                koc0 koc0Var = lbtVar.b;
                jbk0 jbk0Var = (jbk0) teqVar3.a6.get();
                c8o.l(jbk0Var);
                return new aw8(strD6, rwjVar, d520VarA, bw8Var, koc0Var, jbk0Var);
            case 16:
                ozp ozpVar3 = (ozp) obj3;
                qop qopVar6 = (qop) obj;
                bct bctVar4 = (bct) obj2;
                daq daqVar6 = ozpVar3.a;
                teq teqVar4 = ozpVar3.b;
                qopVar6.getClass();
                bctVar4.getClass();
                nfa0 nfa0Var = (nfa0) daqVar6.b2.get();
                c8o.l(nfa0Var);
                Activity activity = (Activity) teqVar4.f.a;
                c8o.l(activity);
                e3b e3bVar = (e3b) daqVar6.er.get();
                c8o.l(e3bVar);
                i8h1 i8h1Var = (i8h1) daqVar6.A5.get();
                c8o.l(i8h1Var);
                it8 it8Var = new it8(i8h1Var, bctVar4.e);
                String strD8 = qopVar6.d();
                koc0 koc0Var2 = bctVar4.d;
                Scheduler scheduler2 = (Scheduler) daqVar6.z1.get();
                c8o.l(scheduler2);
                xfx xfxVar = (xfx) teqVar4.q1.get();
                c8o.l(xfxVar);
                pp ppVar = new pp(xfxVar.c, (byte) 8);
                sb7 sb7Var = (sb7) teqVar4.V5.get();
                c8o.l(sb7Var);
                return new kza(nfa0Var, activity, e3bVar, it8Var, strD8, koc0Var2, bctVar4, scheduler2, ppVar, sb7Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                kzp kzpVar3 = (kzp) obj3;
                qop qopVar7 = (qop) obj;
                k0q k0qVar = new k0q(kzpVar3.a, kzpVar3.b);
                qopVar7.getClass();
                ((xbt) obj2).getClass();
                asn asnVar2 = new asn();
                asnVar2.a = qopVar7;
                asnVar2.b = k0qVar;
                asnVar2.c = iy81.a(new z1p(asnVar2, (byte) 8));
                return new e0t(qopVar7.d(), (u2p) ((jly0) asnVar2.c).get(), new lfb((byte) 26));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                l0q l0qVar = new l0q(((mzp) obj3).a);
                ((qop) obj).getClass();
                ((lbt) obj2).getClass();
                return new j1b((z1p) new gal(l0qVar).c);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                daq daqVar7 = ((uzp) obj3).b;
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                luk lukVar3 = (luk) daqVar7.L1.get();
                c8o.l(lukVar3);
                return new l1b(new uq8(new jq4(lukVar3), (byte) 2), (byte) 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                nzp nzpVar4 = (nzp) obj3;
                qop qopVar8 = (qop) obj;
                gl90 gl90Var = (gl90) obj2;
                daq daqVar8 = nzpVar4.a;
                m0q m0qVar = new m0q(daqVar8, nzpVar4.b);
                qopVar8.getClass();
                gl90Var.getClass();
                ham hamVar = new ham(m0qVar, qopVar8, gl90Var);
                String strD9 = qopVar8.d();
                koc0 koc0Var3 = gl90Var.c;
                me30 me30Var3 = (me30) daqVar8.w7.get();
                c8o.l(me30Var3);
                v2p v2pVar = (v2p) ((jly0) hamVar.c).get();
                nfa0 nfa0Var2 = (nfa0) daqVar8.b2.get();
                c8o.l(nfa0Var2);
                return new x1b(strD9, koc0Var3, me30Var3, v2pVar, nfa0Var2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ozp ozpVar4 = (ozp) obj3;
                qop qopVar9 = (qop) obj;
                bct bctVar5 = (bct) obj2;
                daq daqVar9 = ozpVar4.a;
                teq teqVar5 = ozpVar4.b;
                qopVar9.getClass();
                bctVar5.getClass();
                lzn0 lzn0Var = (lzn0) teqVar5.i.get();
                c8o.l(lzn0Var);
                String strD10 = qopVar9.d();
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar9.Y3.get();
                c8o.l(retrofitMaker);
                m911 m911VarV = q901.v(retrofitMaker);
                gdq gdqVar = (gdq) teqVar5.Dh.get();
                c8o.l(gdqVar);
                return new h3b(lzn0Var, strD10, m911VarV, gdqVar, bctVar5.d);
            case 22:
                kzp kzpVar4 = (kzp) obj3;
                qop qopVar10 = (qop) obj;
                bct bctVar6 = (bct) obj2;
                daq daqVar10 = kzpVar4.a;
                teq teqVar6 = kzpVar4.b;
                n0q n0qVar = new n0q(daqVar10, teqVar6, (byte) 0);
                qopVar10.getClass();
                bctVar6.getClass();
                wzn wznVar = new wzn(n0qVar, qopVar10, bctVar6);
                Context context4 = (Context) teqVar6.f.a;
                c8o.l(context4);
                String strD11 = qopVar10.d();
                String strD12 = qopVar10.d();
                n4b n4bVar = new n4b((i4b) ((jly0) wznVar.c).get(), (byte) 0);
                iyc0 iyc0Var2 = (iyc0) teqVar6.g1.get();
                c8o.l(iyc0Var2);
                lmy0 lmy0Var = (lmy0) daqVar10.N5.get();
                c8o.l(lmy0Var);
                g4b g4bVar = new g4b(strD12, n4bVar, iyc0Var2, lmy0Var);
                uqv0 uqv0VarI3 = teqVar6.i3();
                ewo ewoVar = (ewo) wznVar.d;
                kt91 kt91Var = (kt91) daqVar10.f8.get();
                c8o.l(kt91Var);
                i8h1 i8h1Var2 = (i8h1) daqVar10.A5.get();
                c8o.l(i8h1Var2);
                return new t3b(context4, strD11, g4bVar, uqv0VarI3, ewoVar, kt91Var, new ic9(i8h1Var2), bctVar6.d, qopVar10.c());
            case 23:
                nzp nzpVar5 = (nzp) obj3;
                qop qopVar11 = (qop) obj;
                bct bctVar7 = (bct) obj2;
                daq daqVar11 = nzpVar5.a;
                teq teqVar7 = nzpVar5.b;
                qopVar11.getClass();
                bctVar7.getClass();
                String strD13 = qopVar11.d();
                koc0 koc0Var4 = bctVar7.d;
                uqv0 uqv0VarI4 = teqVar7.i3();
                i8h1 i8h1Var3 = (i8h1) daqVar11.A5.get();
                c8o.l(i8h1Var3);
                return new fb3(strD13, koc0Var4, uqv0VarI4, new q59(i8h1Var3));
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                return ((w9u0) obj2).a((q9u0) obj);
            case 5:
            case 6:
            case 7:
            default:
                return ((MaybeIgnoreElementCompletable) obj2).d(Observable.just(iq8.b));
            case 8:
                return new ObservableFromPublisher(((Flowable) obj2).J(new q58((byte) 3)));
            case 9:
                return Observable.just(iq8.a).delay(120000L, TimeUnit.MILLISECONDS, ((hq8) obj2).a);
            case 10:
                Observable observable = (Observable) obj2;
                if (obj == null) {
                    return observable.map(new q58((byte) 5));
                }
                bhn0.d();
                return null;
        }
    }

    public void b(VolleyError volleyError) {
        CDNAssetLoader.a((CDNAssetLoader) this.b, volleyError);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                dj8 dj8Var = (dj8) zf30Var;
                ej8 ej8Var = (ej8) ((h21) obj).b.get();
                ej8Var.getClass();
                dj8Var.getClass();
                ham hamVar = new ham(ej8Var);
                p181 p181Var = (p181) ej8Var.b.get();
                c8o.l(p181Var);
                dj8Var.G1 = p181Var;
                q181 q181Var = (q181) ej8Var.c.get();
                c8o.l(q181Var);
                dj8Var.H1 = q181Var;
                fmy0 fmy0Var = (fmy0) ej8Var.d.get();
                c8o.l(fmy0Var);
                dj8Var.I1 = fmy0Var;
                kg0 kg0Var = (kg0) ej8Var.e.get();
                c8o.l(kg0Var);
                dj8Var.J1 = kg0Var;
                an3 an3Var = (an3) ej8Var.f.get();
                c8o.l(an3Var);
                dj8Var.K1 = an3Var;
                Activity activity = (Activity) ej8Var.a.get();
                c8o.l(activity);
                dj8Var.L1 = new dms0(activity);
                mr20 mr20Var = (mr20) ej8Var.k.get();
                c8o.l(mr20Var);
                dj8Var.M1 = mr20Var;
                ohv0 ohv0Var = (ohv0) ej8Var.i.get();
                c8o.l(ohv0Var);
                dj8Var.N1 = ohv0Var;
                ryf ryfVar = (ryf) ej8Var.l.get();
                c8o.l(ryfVar);
                dj8Var.O1 = ryfVar;
                dj8Var.P1 = (q5o) ((jly0) hamVar.c).get();
                kgv0 kgv0Var = (kgv0) ej8Var.g.get();
                c8o.l(kgv0Var);
                dj8Var.Q1 = kgv0Var;
                uf90 uf90Var = (uf90) ej8Var.n.get();
                c8o.l(uf90Var);
                dj8Var.R1 = uf90Var;
                x2g1 x2g1Var = (x2g1) ej8Var.m.get();
                c8o.l(x2g1Var);
                dj8Var.S1 = new y1t0(x2g1Var, (byte) 2);
                break;
            case 7:
                hn8 hn8Var = (hn8) zf30Var;
                fn8 fn8Var = (fn8) ((h21) obj).b.get();
                fn8Var.getClass();
                hn8Var.getClass();
                oql oqlVar = new oql(fn8Var);
                uu00 uu00Var = (uu00) fn8Var.c.get();
                c8o.l(uu00Var);
                q8n q8nVar = (q8n) fn8Var.b.get();
                c8o.l(q8nVar);
                hn8Var.c2 = new wm8(uu00Var, q8nVar);
                hn8Var.d2 = (e2p) ((jly0) oqlVar.c).get();
                c8o.l((a4v0) fn8Var.e.get());
                lzn0 lzn0Var = (lzn0) fn8Var.f.get();
                c8o.l(lzn0Var);
                hn8Var.e2 = a4v0.a(new in8(lzn0Var));
                break;
            case 15:
                qva qvaVar = (qva) zf30Var;
                rva rvaVar = (rva) ((sva) obj).b.get();
                rvaVar.getClass();
                qvaVar.getClass();
                i8h1 i8h1Var = (i8h1) rvaVar.f.get();
                c8o.l(i8h1Var);
                qvaVar.G1 = i8h1Var;
                Flowable flowable = (Flowable) rvaVar.g.get();
                c8o.l(flowable);
                qvaVar.H1 = flowable;
                SpotifyMainActivity spotifyMainActivity = (SpotifyMainActivity) rvaVar.d.get();
                c8o.l(spotifyMainActivity);
                qvaVar.I1 = spotifyMainActivity;
                gw70 gw70Var = (gw70) rvaVar.c.get();
                c8o.l(gw70Var);
                qvaVar.J1 = gw70Var;
                Scheduler scheduler = (Scheduler) rvaVar.h.get();
                c8o.l(scheduler);
                qvaVar.K1 = scheduler;
                fp8 fp8Var = new fp8((byte) 6, false);
                iw4 iw4Var = (iw4) rvaVar.e.get();
                c8o.l(iw4Var);
                fp8Var.b = iw4Var;
                qvaVar.L1 = fp8Var;
                gxn gxnVar = (gxn) rvaVar.a.get();
                c8o.l(gxnVar);
                qvaVar.M1 = gxnVar;
                xf4 xf4Var = (xf4) rvaVar.b.get();
                c8o.l(xf4Var);
                qvaVar.N1 = xf4Var;
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                BlendTasteMatchFragment blendTasteMatchFragment = (BlendTasteMatchFragment) zf30Var;
                o5b o5bVar = (o5b) ((h21) obj).b.get();
                o5bVar.getClass();
                blendTasteMatchFragment.getClass();
                x2p x2pVar = new x2p(o5bVar, blendTasteMatchFragment);
                q1n0 q1n0Var = (q1n0) o5bVar.g.get();
                c8o.l(q1n0Var);
                x0b x0bVar = (x0b) o5bVar.a.get();
                c8o.l(x0bVar);
                String str = (String) o5bVar.k.get();
                c8o.l(str);
                blendTasteMatchFragment.G1 = q1n0Var.a(bbp1.g(x0bVar.b(str).map(bbn.Y)));
                i1n0 i1n0Var = (i1n0) o5bVar.h.get();
                c8o.l(i1n0Var);
                jik1 jik1Var = (jik1) o5bVar.d.a;
                c8o.l(jik1Var);
                w2p w2pVar = (w2p) x2pVar.b.get();
                ees eesVarA = i1n0Var.a(t5b.b, jik1Var);
                s28 s28Var = s28.c;
                a680 a680Var = eesVarA.a;
                a680Var.d = s28Var;
                a680Var.b = new u5b(w2pVar, (byte) 0);
                blendTasteMatchFragment.H1 = eesVarA;
                break;
            default:
                zdb zdbVar = (zdb) zf30Var;
                aeb aebVar = (aeb) ((h21) obj).b.get();
                aebVar.getClass();
                zdbVar.getClass();
                uw0 uw0Var = new uw0(aebVar, zdbVar);
                kg0 kg0Var2 = (kg0) aebVar.e.get();
                c8o.l(kg0Var2);
                zdbVar.G1 = kg0Var2;
                lg0 lg0Var = (lg0) aebVar.f.get();
                c8o.l(lg0Var);
                zdbVar.H1 = lg0Var;
                caq caqVar = aebVar.c;
                ohv0 ohv0Var2 = (ohv0) caqVar.get();
                c8o.l(ohv0Var2);
                zdbVar.I1 = ohv0Var2;
                zdbVar.J1 = ((gmy0) ((jly0) uw0Var.f).get()).h;
                wab wabVar = (wab) aebVar.a.get();
                c8o.l(wabVar);
                zdbVar.K1 = wabVar;
                zdbVar.L1 = (bbb) ((jly0) uw0Var.h).get();
                dv dvVar = (dv) aebVar.q.get();
                c8o.l(dvVar);
                zdbVar.M1 = dvVar;
                wbd1 wbd1Var = (wbd1) aebVar.r.get();
                c8o.l(wbd1Var);
                zdbVar.N1 = wbd1Var;
                t0i t0iVar = (t0i) aebVar.b.get();
                c8o.l(t0iVar);
                zdbVar.O1 = t0iVar;
                zdbVar.P1 = uw0Var.J();
                zdbVar.Q1 = (wnh1) ((jly0) uw0Var.t).get();
                zdbVar.R1 = (mir0) ((jly0) uw0Var.X).get();
                zdbVar.S1 = (t8h1) ((jly0) uw0Var.c).get();
                g1f0 g1f0VarA = aebVar.a();
                c8o.l(g1f0VarA);
                zdbVar.T1 = g1f0VarA;
                gp41 gp41VarJ = uw0Var.J();
                ohv0 ohv0Var3 = (ohv0) caqVar.get();
                c8o.l(ohv0Var3);
                i8h1 i8h1Var2 = (i8h1) aebVar.m.get();
                c8o.l(i8h1Var2);
                zdbVar.U1 = new teb(gp41VarJ, ohv0Var3, i8h1Var2);
                zdbVar.V1 = (q5o) ((jly0) uw0Var.g).get();
                zdbVar.W1 = (Map) ((jly0) uw0Var.O0).get();
                break;
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        ((zq8) this.b).a = observableEmitter;
    }
}
