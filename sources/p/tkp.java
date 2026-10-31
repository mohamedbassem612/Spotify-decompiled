package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tkp implements jly0 {
    public final ukp a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public tkp(ukp ukpVar, int i) {
        this.a = ukpVar;
        this.b = i;
    }

    public final Object get() {
        so21 so21Var;
        int i;
        dot dotVar;
        ngv ngvVar = ngv.f;
        ukp ukpVar = this.a;
        byte b = this.b;
        switch (b) {
            case 0:
                q8n q8nVarE = ((dj5) ukpVar.a.b).e();
                omo omoVar = (omo) ukpVar.k.get();
                dj5 dj5Var = (dj5) ukpVar.a.b;
                Flowable flowable = (Flowable) dj5Var.r.get();
                st60 st60Var = new st60((y4s) ukpVar.l.get(), (zwz0) dj5Var.l.get(), (jir) ukpVar.n.get(), (byte) 25);
                vbm[] vbmVarArr = q601.a;
                iir iirVar = new iir(st60Var, new vx40(rqt0.u(new m010(new kge(flowable), (byte) 0)), rqt0.u(new dkm(omoVar.current(), (byte) 10)), (byte) 23), (byte) 0);
                my91 my91Var = (my91) ukpVar.q.get();
                t380 t380VarU = t380.u((z0a0) ukpVar.s.get(), (z0a0) ukpVar.B.get(), (z0a0) ukpVar.D.get());
                r4s r4sVar = (r4s) ukpVar.F.get();
                ynb0 ynb0VarA = xqu.a(ukpVar.G);
                ynb0 ynb0VarA2 = xqu.a(ukpVar.H);
                if (((no4) ((b0a0) ukpVar.f.get()).a.get()).i()) {
                    Object obj = ynb0VarA2.get();
                    obj.getClass();
                    so21Var = (so21) obj;
                } else {
                    Object obj2 = ynb0VarA.get();
                    obj2.getClass();
                    so21Var = (so21) obj2;
                }
                return new y8c0(q8nVarE, new tjq(o7h.l1(t380VarU), r4sVar, my91Var, iirVar, so21Var));
            case 1:
                ye90 ye90Var = ukpVar.a;
                ye90 ye90Var2 = ukpVar.a;
                return new b9c0(((dj5) ye90Var.b).e(), new cp31((lx91) ukpVar.j.get(), new her((g0l) ukpVar.d.get(), (byte) 0), new zfr(ukpVar.k(), new o4s(((Context) ((dj5) ye90Var2.b).a.get()).getApplicationContext()), (byte) 4), new yrg0((v5n) ((kly0) ye90Var2.c).get(), (byte) 1), (b0a0) ukpVar.f.get(), new o4s(((Context) ((dj5) ye90Var2.b).a.get()).getApplicationContext())));
            case 2:
                n381 n381VarI = ukpVar.i();
                dkd dkdVar = ukpVar.b;
                ye90 ye90Var3 = ukpVar.a;
                return new xx91(n381VarI, new ti61(((dj5) ye90Var3.b).m(), dkdVar.a()), (Flowable) ((dj5) ye90Var3.b).r.get(), xqu.a(ukpVar.d), ((dj5) ye90Var3.b).d(), ukpVar.l(), new jut(((dj5) ye90Var3.b).f(), (je61) ukpVar.g.get(), (byte) 24), ((dj5) ye90Var3.b).b(), (Scheduler) ((dj5) ye90Var3.b).f.get(), (r1a1) ukpVar.h.get(), new y281((byte) 7), new d6c(((dj5) ye90Var3.b).m(), dkdVar.a()), (Observable) ((nw7) ukpVar.c.a).a.get(), (p5a0) ukpVar.i.get(), new xgc((byte) 6));
            case 3:
                return (g0l) ((dj5) ukpVar.a.b).i.get();
            case 4:
                return new b0a0(xqu.a(ukpVar.e));
            case 5:
                return (no4) ((dj5) ukpVar.a.b).o.get();
            case 6:
                return new bos();
            case 7:
                return new r1a1((Scheduler) ((dj5) ukpVar.a.b).g.get());
            case 8:
                return new p5a0((g0l) ukpVar.d.get(), ukpVar.i());
            case 9:
                return new y4s(new zfr((ov20) ((dj5) ukpVar.a.b).n.get(), (b0a0) ukpVar.f.get()), (b0a0) ukpVar.f.get(), (am30) ((nw7) ukpVar.c.a).b.get());
            case 10:
                return new jir((gw9) ukpVar.m.get(), (mr20) ((kly0) ukpVar.c.c).get(), (b0a0) ukpVar.f.get());
            case 11:
                return new gw9();
            case 12:
                n381 n381VarI2 = ukpVar.i();
                ye90 ye90Var4 = ukpVar.a;
                ymm0 ymm0Var = new ymm0(ukpVar.k(), (byte) 28);
                ynb0 ynb0VarA3 = xqu.a(ukpVar.o);
                ynb0 ynb0VarA4 = xqu.a(ukpVar.f47p);
                int iOrdinal = ((no4) ((b0a0) ukpVar.f.get()).a.get()).n0().ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                int iC = l1d.C(i);
                if (iC == 0) {
                    dotVar = (dot) ynb0VarA3.get();
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    dotVar = (dot) ynb0VarA4.get();
                }
                return new my91(n381VarI2, ymm0Var, dotVar, new u210(((dj5) ye90Var4.b).f()), ukpVar.a(), new yrg0((v5n) ((kly0) ye90Var4.c).get(), (byte) 1), (b0a0) ukpVar.f.get(), (q8n) ((dj5) ye90Var4.b).c.get());
            case 13:
                return new ttr();
            case 14:
                return new s8o0(new a0m(new yfc0(new tzo(new idd1(new qnd0((Context) ((dj5) ukpVar.a.b).a.get(), (byte) 11)), (byte) 4), (byte) 7), (byte) 18));
            case 15:
                return new d4l((g0l) ukpVar.d.get(), (a0a0) ukpVar.r.get(), (b0a0) ukpVar.f.get());
            case 16:
                return new a0a0((iur) ((kly0) ukpVar.c.d).get(), (b0a0) ukpVar.f.get());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new xeh0((a0a0) ukpVar.r.get(), (g7s) ukpVar.A.get(), (b0a0) ukpVar.f.get());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                jly0 jly0Var = ukpVar.t;
                ye90 ye90Var5 = ukpVar.a;
                qfr qfrVar = (qfr) jly0Var.get();
                t2b t2bVar = new t2b((byte) 7);
                dj5 dj5Var2 = (dj5) ye90Var5.b;
                dxy dxyVar = new dxy(qfrVar, t2bVar, (Scheduler) dj5Var2.g.get(), dj5Var2.b());
                qfr qfrVar2 = (qfr) ukpVar.t.get();
                jap0 jap0Var = (jap0) ukpVar.z.get();
                dxz0 dxz0VarD = ((dj5) ye90Var5.b).d();
                wp20 wp20Var = ukpVar.c;
                Observable observable = (Observable) ((nw7) wp20Var.a).a.get();
                mr20 mr20Var = ((ufe0) ((kly0) wp20Var.e).get()).b;
                List list = r110.a;
                return new g7s(dxyVar, new yo31(new l6s(qfrVar2, jap0Var, rqt0.u(h5p1.s(rqt0.u(new p3t(yoi1.g(dxz0VarD.c()), (byte) 19)), rqt0.u(yoi1.g(observable)), rqt0.u(mr20Var), new dpr(4, (lnm) null, (byte) 1)))), new ulc((byte) 6), (byte) 11));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Context context = (Context) ((dj5) ukpVar.a.b).a.get();
                List list2 = r110.a;
                return new qfr(new idd1(new mo2(context, (byte) 22)));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new kap0(t380.t(new t4g0(), (jap0) ukpVar.y.get()));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                xqu.a(ukpVar.x);
                return new kap0(((dj5) ukpVar.a.b).e());
            case 22:
                return new c9c0((omo) ukpVar.k.get(), (v89) ukpVar.u.get(), (gq90) ukpVar.v.get(), (hq90) ukpVar.w.get(), ukpVar.e(), (b9c0) ukpVar.k.get(), (y8c0) ukpVar.u.get(), (d9c0) ukpVar.v.get());
            case 23:
                ye90 ye90Var6 = ukpVar.a;
                ye90 ye90Var7 = ukpVar.a;
                return new d9c0(((dj5) ye90Var6.b).e(), new o860((p5a0) ukpVar.i.get(), new d6c(((dj5) ye90Var7.b).m(), ukpVar.b.a()), new vun((y4s) ukpVar.l.get()), new sjb(new eoc((byte) 6), (byte) 6), new k9r((zwz0) ((dj5) ye90Var7.b).l.get(), new her((g0l) ukpVar.d.get(), (byte) 0), (b0a0) ukpVar.f.get(), (byte) 9)));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new f9c0(((dj5) ukpVar.a.b).e(), new vun((y4s) ukpVar.l.get()));
            case 25:
                return new s5a1((a0a0) ukpVar.r.get(), (xl01) ukpVar.C.get());
            case 26:
                return new xl01(((dj5) ukpVar.a.b).a(), ((dj5) ukpVar.a.b).e(), (b0a0) ukpVar.f.get());
            case 27:
                return new r4s((b0a0) ukpVar.f.get(), (t4s) ukpVar.E.get(), ((dj5) ukpVar.a.b).e());
            case 28:
                return new t4s();
            case 29:
                return new rjs();
            case 30:
                return new xl00(xqu.a(ukpVar.x));
            case 31:
                return new wx90((neh0) ukpVar.I.get(), (c9c0) ukpVar.x.get(), ((dj5) ukpVar.a.b).e());
            case 32:
                return new neh0(((dj5) ukpVar.a.b).d(), (g7s) ukpVar.A.get(), ukpVar.l());
            case 33:
                return new u2a0(((dj5) ukpVar.a.b).f());
            case 34:
                return new r3a0(xqu.a(ukpVar.O), (b0a0) ukpVar.f.get(), (xl01) ukpVar.C.get(), (c9c0) ukpVar.x.get(), (q8n) ((dj5) ukpVar.a.b).d.get());
            case 35:
                jly0 jly0Var2 = ukpVar.L;
                ye90 ye90Var8 = ukpVar.a;
                dkd dkdVar2 = ukpVar.b;
                wp20 wp20Var2 = ukpVar.c;
                p900 p900Var = (p900) jly0Var2.get();
                oir oirVar = (oir) dkdVar2.b.get();
                qd9 qd9Var = (qd9) dkdVar2.a.get();
                ak9 ak9Var = (ak9) ((kly0) ((ur00) wp20Var2.b).d).get();
                xir xirVar = (xir) ((kly0) ((ur00) wp20Var2.b).e).get();
                dxz0 dxz0VarD2 = ((dj5) ye90Var8.b).d();
                MobiusLoop.Logger logger = (MobiusLoop.Logger) ukpVar.N.get();
                Observable observable2 = (Observable) ((nw7) wp20Var2.a).a.get();
                xl01 xl01Var = (xl01) ukpVar.C.get();
                u2a0 u2a0Var = (u2a0) ukpVar.K.get();
                gw9 gw9Var = (gw9) ukpVar.m.get();
                b0a0 b0a0Var = (b0a0) ukpVar.f.get();
                epb epbVar = (epb) ((ur00) wp20Var2.b).f;
                c8o.l(epbVar);
                return new v4s(p900Var, oirVar, qd9Var, ak9Var, xirVar, dxz0VarD2, logger, observable2, xl01Var, u2a0Var, gw9Var, b0a0Var, epbVar, ((dj5) ye90Var8.b).b());
            case 36:
                return new p900((Scheduler) ((dj5) ukpVar.a.b).g.get());
            case 37:
                ((dj5) ukpVar.a.b).a();
                return new ji9();
            case 38:
                return ReplaySubject.g(2000);
            case 39:
                return new i4a0(xqu.a(ukpVar.T), (b0a0) ukpVar.f.get(), (hq90) ukpVar.w.get(), (q8n) ((dj5) ukpVar.a.b).d.get());
            case 40:
                jly0 jly0Var3 = ukpVar.Q;
                ye90 ye90Var9 = ukpVar.a;
                wp20 wp20Var3 = ukpVar.c;
                p900 p900Var2 = (p900) jly0Var3.get();
                dxz0 dxz0VarD3 = ((dj5) ye90Var9.b).d();
                gq90 gq90Var = (gq90) ukpVar.v.get();
                xir xirVar2 = (xir) ((kly0) ((ur00) wp20Var3.b).e).get();
                ak9 ak9Var2 = (ak9) ((kly0) ((ur00) wp20Var3.b).d).get();
                g0l g0lVar = (g0l) ukpVar.d.get();
                b0a0 b0a0Var2 = (b0a0) ukpVar.f.get();
                Scheduler schedulerB = ((dj5) ye90Var9.b).b();
                MobiusLoop.Logger logger2 = (MobiusLoop.Logger) ukpVar.S.get();
                g2z g2zVarL = ukpVar.l();
                ae9 ae9Var = (ae9) ((kly0) ((ur00) wp20Var3.b).b).get();
                epb epbVar2 = (epb) ((ur00) wp20Var3.b).f;
                c8o.l(epbVar2);
                return new x4s(p900Var2, dxz0VarD3, gq90Var, xirVar2, ak9Var2, g0lVar, b0a0Var2, schedulerB, logger2, g2zVarL, ae9Var, epbVar2);
            case 41:
                return new p900((Scheduler) ((dj5) ukpVar.a.b).g.get());
            case 42:
                ((dj5) ukpVar.a.b).a();
                return new ji9();
            case 43:
                return ReplaySubject.g(2000);
            case 44:
                n381 n381VarI3 = ukpVar.i();
                yqg yqgVarA = ((dj5) ukpVar.a.b).a();
                ytw0 ytw0Var = jfv.b;
                return new u6f0(n381VarI3, new d18(fdg1.k0(5, ngvVar), yqgVarA));
            case 45:
                return new zir0();
            case 46:
                xap xapVarE = ukpVar.e();
                yqg yqgVarA2 = ((dj5) ukpVar.a.b).a();
                ytw0 ytw0Var2 = jfv.b;
                return new ut21(xapVarE, new d18(fdg1.k0(5, ngvVar), yqgVarA2));
            default:
                jah.e(b);
                return null;
        }
    }
}
