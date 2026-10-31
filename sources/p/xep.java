package p;

import android.content.Context;
import android.os.Handler;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xep implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ xep(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((r700) ((d3p) obj).a).b.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            case 1:
                i8h1 i8h1Var2 = (i8h1) ((y700) ((x2p) obj).c).g.get();
                c8o.l(i8h1Var2);
                return i8h1Var2;
            case 2:
                x390 x390Var = (x390) ((x2p) obj).d;
                r6h1 r6h1Var = (r6h1) x390Var.b;
                u8n u8nVarCreate = ((t8n) x390Var.c).create();
                r6h1Var.getClass();
                return new b6p(u8nVarCreate, r6h1Var, (byte) 4).v();
            case 3:
                return new j810((q8n) ((hhp) obj).a.b);
            case 4:
                x2p x2pVar = (x2p) obj;
                nf10 nf10Var = (nf10) x2pVar.c;
                Scheduler scheduler = (Scheduler) nf10Var.e.get();
                c8o.l(scheduler);
                c8o.l((xf10) nf10Var.a.get());
                utw0 utw0Var = new utw0();
                utw0Var.a = scheduler;
                Scheduler scheduler2 = (Scheduler) nf10Var.d.get();
                c8o.l(scheduler2);
                tac0 tac0Var = ((zf30) ((pf10) x2pVar.d)).s1;
                khc khcVar = new khc((byte) 27);
                gp41 gp41VarK = x2pVar.k();
                ohv0 ohv0Var = (ohv0) nf10Var.c.get();
                c8o.l(ohv0Var);
                return new sf10(utw0Var, scheduler2, tac0Var, khcVar, new kp00(gp41VarK, ohv0Var, (byte) 8));
            case 5:
                return new ihp(this);
            case 6:
                l8a l8aVar = ((nhp) obj).a;
                return new jj4((Context) l8aVar.a.get(), (Handler) l8aVar.b.get());
            case 7:
                return pzm.h((mos) ((y230) ((b6p) obj).b).c.get());
            case 8:
                uy2 uy2Var = ((gip) obj).a;
                return new r630(hl20.r((RetrofitMaker) uy2Var.a.get()), (Scheduler) uy2Var.b.get());
            case 9:
                return pzm.h((mos) ((fn30) ((d3p) obj).a).c.get());
            case 10:
                return pzm.h((mos) ((ln30) ((z2p) obj).b).c.get());
            case 11:
                ttm0 ttm0VarE = cwl1.E((q7r0) ((x2p) obj).d);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 12:
                return new bjp(this);
            case 13:
                wdm wdmVar = ((ejp) obj).a;
                return new wza0((Context) ((kly0) wdmVar.b).get(), (yqg) ((kly0) wdmVar.c).get(), (nfa0) ((kly0) wdmVar.d).get(), (h0b0) ((RetrofitMaker) ((kly0) wdmVar.X).get()).createWebgateService(h0b0.class, "android-genalpha-graduationimpl"), new v6a0((wve0) ((kly0) wdmVar.h).get(), (yqg) ((kly0) wdmVar.c).get(), (byte) 5), (uh8) ((kly0) wdmVar.e).get(), (Flowable) ((kly0) wdmVar.f).get(), eth.X((xm41) ((kly0) wdmVar.Y).get()).map(eh10.i), eth.X((xm41) ((kly0) wdmVar.Z).get()).map(yb10.i), new vnr((Context) ((kly0) wdmVar.b).get()), new f0b0((g0b0) ((RetrofitMaker) ((kly0) wdmVar.X).get()).createWebgateService(g0b0.class, "android-genalpha-graduationimpl")), (zmj0) ((kly0) wdmVar.g).get());
            case 14:
                return pzm.h((mos) ((tct) ((d3p) obj).a).d.get());
            case 15:
                return u1n0.z((q7r0) ((z2p) obj).b);
            case 16:
                return u1n0.z((q7r0) ((b6p) obj).b);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return u1n0.z((q7r0) ((z2p) obj).b);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return u1n0.z((q7r0) ((b6p) obj).b);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return u1n0.z((q7r0) ((d3p) obj).a);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return u1n0.z((q7r0) ((z2p) obj).b);
            case 22:
                return u1n0.z((q7r0) ((b6p) obj).b);
            case 23:
                return new fjp(this);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x2p x2pVar2 = (x2p) obj;
                String strD = ((qop) x2pVar2.c).d();
                kzp kzpVar = (kzp) x2pVar2.d;
                luk lukVar = (luk) kzpVar.a.L1.get();
                c8o.l(lukVar);
                return new tm(strD, new m980(new k35(false, false, lukVar)), kzpVar.b.K2());
            case 25:
                dkd dkdVar = ((rjp) obj).a;
                return new fuz(new ur70(new CosmosTransport(new sn0((RxRouter) dkdVar.b.get(), (byte) 21))), new ir20((byte) 4, ((Context) dkdVar.a.get()).getResources().getDisplayMetrics().density), (q8n) dkdVar.c.get());
            case 26:
                q7r0 q7r0Var = (q7r0) ((d3p) obj).a;
                i8h1 i8h1VarZ = u1n0.z(q7r0Var);
                n6r0 n6r0Var = cwl1.D(q7r0Var.d.b()).a;
                c8o.m(n6r0Var);
                return new gx70(n6r0Var, i8h1VarZ);
            case 27:
                pbq pbqVar = ((sjp) obj).a;
                q8n q8nVar = (q8n) pbqVar.f;
                c8o.l(q8nVar);
                lzn0 lzn0Var = (lzn0) pbqVar.b;
                c8o.l(lzn0Var);
                jeh jehVar = (jeh) pbqVar.g;
                c8o.l(jehVar);
                fwn0 fwn0Var = (fwn0) pbqVar.h;
                c8o.l(fwn0Var);
                jvn0 jvn0Var = (jvn0) pbqVar.i;
                c8o.l(jvn0Var);
                yym0 yym0Var = (yym0) pbqVar.t;
                c8o.l(yym0Var);
                return new s680(q8nVar, lzn0Var, new jnq(jehVar, fwn0Var, jvn0Var, yym0Var), (wcr) pbqVar.X, (h5a1) pbqVar.c, (fjb) pbqVar.e, (ae5) pbqVar.d);
            case 28:
                return new tjp(this);
            default:
                h310 h310Var = (h310) ((z2p) obj).b;
                return new wg30((mu9) h310Var.b.get(), (ig30) h310Var.c.get(), (mwn0) h310Var.a.get(), (y911) h310Var.d.get(), (gun0) h310Var.g.get(), (syn0) h310Var.h.get());
        }
    }
}
