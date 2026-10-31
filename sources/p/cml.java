package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cml extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cml(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        int i;
        zob1 zob1Var;
        Object obj6;
        u0v u0vVar;
        String str;
        byte b = this.a;
        char c = 4;
        lxh lxhVar = null;
        char c2 = 1;
        z = true;
        boolean z = true;
        char c3 = 1;
        byte b2 = 3;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                g8p g8pVar = ((dml) obj7).d;
                g8pVar.getClass();
                bml bmlVar = new bml();
                x2p x2pVar = (x2p) g8pVar.a.c;
                boolean zBooleanValue = ((Boolean) ((eml) x2pVar.c).h.get()).booleanValue();
                eml emlVar = (eml) x2pVar.c;
                boolean zBooleanValue2 = ((Boolean) emlVar.i.get()).booleanValue();
                dg30 dg30Var = (dg30) emlVar.f.get();
                c8o.l(dg30Var);
                lzn0 lzn0Var = (lzn0) emlVar.d.get();
                c8o.l(lzn0Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                xok0 xok0Var = new xok0(yon1.o().a, (byte) 5);
                i8h1 i8h1Var = (i8h1) emlVar.j.get();
                c8o.l(i8h1Var);
                vnd1 vnd1Var = new vnd1(xok0Var, i8h1Var, (byte) 21);
                zhh1 zhh1Var = (zhh1) emlVar.g.get();
                c8o.l(zhh1Var);
                RetrofitMaker retrofitMaker = (RetrofitMaker) emlVar.e.get();
                c8o.l(retrofitMaker);
                gid0 gid0VarD = ssc0.D(retrofitMaker);
                kt91 kt91Var = (kt91) emlVar.k.get();
                c8o.l(kt91Var);
                Scheduler scheduler = (Scheduler) emlVar.b.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) emlVar.a.get();
                c8o.l(scheduler2);
                LayoutInflater layoutInflater = (LayoutInflater) emlVar.l.get();
                c8o.l(layoutInflater);
                return new gml((LayoutInflater) obj2, (ViewGroup) obj3, bmlVar, zBooleanValue, zBooleanValue2, new ytp0(dg30Var, lzn0Var, vnd1Var, zhh1Var, new wp20(gid0VarD, kt91Var, scheduler, scheduler2, layoutInflater), (byte) 1));
            case 1:
                owl owlVar = (owl) obj;
                twl twlVar = (twl) obj2;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                qwl qwlVar = twlVar instanceof qwl ? (qwl) twlVar : null;
                lxhVar = qwlVar != null ? qwlVar.c : null;
                boolean z2 = lxhVar instanceof jxh;
                if (z2) {
                    yvh yvhVar = ((jxh) lxhVar).a;
                    if (yvhVar instanceof wvh) {
                        c = 3;
                    } else if (!(yvhVar instanceof xvh)) {
                        c = 1;
                    }
                    c2 = c;
                }
                return new etl0(new qtl0(Integer.valueOf(iIntValue), ((kwl) obj7).h.path(), owlVar.a, r6h1Var), c2, z2 ? hap1.v(((jxh) lxhVar).a) : owlVar.b);
            case 2:
                owl owlVar2 = (owl) obj;
                twl twlVar2 = (twl) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                qwl qwlVar2 = twlVar2 instanceof qwl ? (qwl) twlVar2 : null;
                lxhVar = qwlVar2 != null ? qwlVar2.c : null;
                boolean z3 = lxhVar instanceof jxh;
                if (z3) {
                    yvh yvhVar2 = ((jxh) lxhVar).a;
                    if (yvhVar2 instanceof wvh) {
                        c = 3;
                    } else if (!(yvhVar2 instanceof xvh)) {
                        c = 1;
                    }
                    c3 = c;
                }
                return new etl0(new qtl0(Integer.valueOf(iIntValue2), ((n6r0) ((uwl) obj7).e).path(), owlVar2.a, r6h1Var2), c3, z3 ? hap1.v(((jxh) lxhVar).a) : owlVar2.b);
            case 3:
                return new CompletableFromAction(new wf0((pbm) obj2, (tqw) obj4, (ug3) obj7, (byte) 5));
            case 4:
                ((Number) obj3).intValue();
                return (n8h1) ((tm) obj7).e;
            case 5:
                ((Number) obj3).intValue();
                i3l0 i3l0Var = (i3l0) ((qj0) obj7).e;
                i3l0Var.getClass();
                return new l0l0(i3l0Var);
            case 6:
                ((Number) obj3).intValue();
                return new fjm((n8h1) ((nhm) obj).b.c.a.invoke((i3l0) ((qhm) obj7).d));
            case 7:
                ((Number) obj3).intValue();
                return new s0m0(new brl0(((lwm) ((nm1) obj7).g).e, (byte) 10));
            case 8:
                ((Number) obj3).intValue();
                return new u0m0(new brl0(((lwm) ((nm1) obj7).h).e, (byte) 10));
            case 9:
                ((Number) obj3).intValue();
                return new q0m0(new brl0(((lwm) ((hw2) obj7).g).e, (byte) 10), ((sxm) obj).a);
            case 10:
                ((Number) obj3).intValue();
                return new r0m0(new brl0(((lwm) ((el9) obj7).X).e, (byte) 10));
            case 11:
                i2n i2nVar = (i2n) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var = i2nVar.c;
                return new gwl0(new lvl0(new mjl0(new mjl0((urk0) ((qj0) obj7).d, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), i2nVar.d, (byte) 3), Integer.valueOf(i2nVar.e), "", i2nVar.f);
            case 12:
                return new y9n((xfx) obj7);
            case 13:
                return new u3((Context) obj2, (kun) obj7, (ViewGroup) obj3, (iu30) obj4);
            case 14:
                return new vh((xyn) obj7, (iu30) obj4, (Context) obj2);
            case 15:
                return new vh((ViewGroup) obj3, (Context) obj2, (jb3) obj7, (byte) 0);
            case 16:
                s1o s1oVar = (s1o) obj7;
                return new n2o(s1oVar.a, s1oVar.b, s1oVar.c, (Context) obj2, (iu30) obj4);
            case 17:
                dfm dfmVar = (dfm) obj7;
                return new n2o((hjc) dfmVar.d, (pp) dfmVar.e, (hjc) dfmVar.f, (Context) obj2, (iu30) obj4);
            case 18:
                return new vh((Context) obj2, (r4o) obj7, (ViewGroup) obj3);
            case 19:
                rao raoVar = (rao) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var2 = raoVar.c;
                lvl0 lvl0Var = new lvl0(new mjl0(new mjl0((urk0) ((res) obj7).d, d8r0Var2.b, d8r0Var2.a, d8r0Var2.e), d8r0Var2.d), raoVar.d, (byte) 3);
                int i2 = raoVar.e;
                Integer numValueOf = Integer.valueOf(i2);
                String str2 = raoVar.f;
                return new xvl0(new yvl0(new gwl0(lvl0Var, numValueOf, "crossword_overview", str2), Integer.valueOf(i2), str2));
            case 20:
                jjm0 jjm0Var = (jjm0) obj;
                uho uhoVar = (uho) obj2;
                int iIntValue3 = ((Number) obj4).intValue();
                String str3 = uhoVar.a;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-645569213);
                xho xhoVar = (xho) obj7;
                ven0 ven0VarH = rwq.h(xhoVar.a.a(), x340Var, 0);
                if ((((iIntValue3 & 112) ^ 48) <= 32 || !x340Var.g(uhoVar)) && (iIntValue3 & 48) != 32) {
                    z = false;
                }
                boolean zI = x340Var.i(xhoVar) | z;
                Object objT = x340Var.T();
                if (zI != 0 || objT == fkj0.X) {
                    obj5 = objT;
                    l14 l14Var = new l14(uhoVar, xhoVar, lxhVar, b2);
                    x340Var.s0(l14Var);
                    obj5 = l14Var;
                }
                obj5 = objT;
                jjm0Var.a((zu30) obj5, x340Var, (iIntValue3 << 3) & 112);
                vho vhoVar = new vho(((ijo) ven0VarH.getValue()).b.contains(str3), uhoVar.a, ((ijo) ven0VarH.getValue()).a.contains(str3), uhoVar.c, uhoVar.d, uhoVar.e, uhoVar.f, 128);
                x340Var.r(false);
                return vhoVar;
            case 21:
                ayq ayqVar = (ayq) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var2 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i = (x340Var2.g(ayqVar) ? 4 : 2) | iIntValue4;
                } else {
                    i = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i & 1, (i & 147) != 146)) {
                    irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(-1960597920, new nzd((cyq) obj7, ayqVar, iu30Var, (byte) 14), x340Var3), x340Var3, 24576, 15);
                } else {
                    x340Var3.b0();
                }
                return rih1.a;
            case 22:
                int iIntValue5 = ((Number) obj3).intValue();
                int i3 = u1r.e.a;
                u1r u1rVar = (u1r) obj7;
                t1r t1rVar = u1rVar.b;
                if (iIntValue5 == i3) {
                    t1rVar.e(true);
                    t1rVar.d(false);
                } else {
                    u1rVar.a();
                    if (iIntValue5 == 1) {
                        t1rVar.e(false);
                        t1rVar.d(true);
                    } else if (iIntValue5 == u1r.f.a) {
                        t1rVar.e(false);
                        t1rVar.d(false);
                    }
                }
                return new it61(Integer.valueOf(iIntValue5));
            case 23:
                ((Number) obj3).intValue();
                yvk0 yvk0Var = (yvk0) ((umf0) obj7).d;
                yvk0Var.getClass();
                return new srl0(yvk0Var);
            case 24:
                ((Number) obj3).intValue();
                return new prk0(((lik1) ((dx0) obj7).d).a, (r6h1) obj4);
            case 25:
                return new b14((Context) obj2, (iu30) obj4, (y04) obj7);
            case 26:
                jjm0 jjm0Var2 = (jjm0) obj;
                fzu fzuVar = (fzu) obj2;
                int iIntValue6 = ((Number) obj4).intValue();
                tm tmVar = (tm) obj7;
                m4c m4cVar = fkj0.X;
                long j = fzuVar.b;
                x340 x340Var4 = (b0k) obj3;
                x340Var4.i0(-808094934);
                boolean zI2 = x340Var4.i(fzuVar);
                Object objT2 = x340Var4.T();
                Object obj8 = objT2;
                if (zI2 || objT2 == m4cVar) {
                    wd2 wd2Var = new wd2(fzuVar, (lnm) null, (byte) 2);
                    x340Var4.s0(wd2Var);
                    obj8 = wd2Var;
                }
                jjm0Var2.a((zu30) obj8, x340Var4, (iIntValue6 << 3) & 112);
                zob1 zob1VarJ = tmVar.j(j);
                boolean zG = x340Var4.g(zob1VarJ);
                Object objT3 = x340Var4.T();
                if (zG || objT3 == m4cVar) {
                    zob1Var = zob1VarJ;
                    ezc ezcVarF = h4p1.f(new lqv(((q7r0) tmVar.d).d.c.getLifecycle(), w8c0.d, zob1Var, (lnm) null, (byte) 10));
                    x340Var4.s0(ezcVarF);
                    obj6 = ezcVarF;
                } else {
                    zob1Var = zob1VarJ;
                    obj6 = objT3;
                }
                gzu gzuVar = new gzu((jfx0) rwq.g((mr20) obj6, zob1Var.getValue(), (o8n) null, x340Var4, 0, 2).getValue(), fzuVar.a != null, j);
                x340Var4.r(false);
                return gzuVar;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                jjm0 jjm0Var3 = (jjm0) obj;
                v0v v0vVar = (v0v) obj2;
                int iIntValue7 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var5 = (b0k) obj3;
                x340Var5.i0(1569051669);
                p0v p0vVar = v0vVar.a;
                boolean zG2 = x340Var5.g(p0vVar.b);
                tvr tvrVar = (tvr) obj7;
                Object objT4 = x340Var5.T();
                Object obj9 = objT4;
                if (zG2 || objT4 == m4cVar2) {
                    ay8 ay8VarF = d3p1.F(tvrVar.e(), tvrVar.d, v0vVar);
                    x340Var5.s0(ay8VarF);
                    obj9 = ay8VarF;
                }
                ven0 ven0VarH2 = rwq.h((zob1) obj9, x340Var5, 0);
                boolean zI3 = x340Var5.i(tvrVar);
                Object objT5 = x340Var5.T();
                Object obj10 = objT5;
                if (zI3 || objT5 == m4cVar2) {
                    vd2 vd2Var = new vd2((Object) tvrVar, (lnm) lxhVar, (byte) 12);
                    x340Var5.s0(vd2Var);
                    obj10 = vd2Var;
                }
                jjm0Var3.a((zu30) obj10, x340Var5, (iIntValue7 << 3) & 112);
                i1r i1rVar = (k1r) ven0VarH2.getValue();
                if (i1rVar instanceof i1r) {
                    u0vVar = (u0v) i1rVar.a;
                } else if (u890.j(i1rVar, j1r.a)) {
                    u0vVar = s0v.a;
                } else {
                    if (!(i1rVar instanceof h1r)) {
                        eg.o();
                        return null;
                    }
                    u0vVar = t0v.a;
                }
                w0v w0vVar = new w0v(p0vVar, u0vVar);
                x340Var5.r(false);
                return w0vVar;
            case 28:
                w2s w2sVar = (w2s) obj7;
                return new u3(w2sVar, (Context) obj2, ((nsg) ((hjc) w2sVar.g).a((l0i) null).b).a);
            default:
                ((Number) obj3).intValue();
                fyk0 fyk0Var = (fyk0) ((qj0) obj7).e;
                ywi0 ywi0Var = ((xwi0) obj).a.a.a;
                List list = p110.a;
                int iOrdinal = ywi0Var.ordinal();
                if (iOrdinal == 0) {
                    str = "APPLE_TV_APP_NOT_INSTALLED";
                } else if (iOrdinal == 1) {
                    str = "EMP";
                } else if (iOrdinal == 2) {
                    str = "LOSSLESS";
                } else if (iOrdinal == 3) {
                    str = "PUFFIN";
                } else if (iOrdinal == 4) {
                    str = "LOCAL_NETWORK_AND_BLUETOOTH_PERMISSIONS";
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    str = "CONNECTDEBUG";
                }
                return new eyk0(fyk0Var, str);
        }
    }
}
