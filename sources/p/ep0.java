package p;

import android.R;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.messages.AdUnlockedOnDemand;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ep0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep0(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ep0 ep0Var = new ep0((jp0) this.d, (lnm) obj5, (byte) 0);
                ep0Var.b = (lo0) obj;
                ep0Var.c = (zo0) obj3;
                ep0Var.invokeSuspend(rih1Var);
                break;
            case 1:
                ep0 ep0Var2 = new ep0((res) this.d, (lnm) obj5, (byte) 1);
                ep0Var2.b = (q52) obj;
                ep0Var2.c = (lhb1) obj3;
                ep0Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                ep0 ep0Var3 = new ep0((qj0) this.d, (lnm) obj5, (byte) 2);
                ep0Var3.b = (sd2) obj3;
                ep0Var3.c = (tqw) obj4;
                ep0Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                ep0 ep0Var4 = new ep0((hg3) this.d, (lnm) obj5, (byte) 3);
                ep0Var4.b = (eg3) obj;
                ep0Var4.c = (cg3) obj3;
                ep0Var4.invokeSuspend(rih1Var);
                break;
            case 4:
                ep0 ep0Var5 = new ep0((dc8) this.d, (lnm) obj5, (byte) 4);
                ep0Var5.b = (wb8) obj;
                ep0Var5.c = (rb8) obj3;
                ep0Var5.invokeSuspend(rih1Var);
                break;
            case 5:
                ep0 ep0Var6 = new ep0((hw2) this.d, (lnm) obj5, b2);
                ep0Var6.b = (ln9) obj3;
                ep0Var6.c = (tqw) obj4;
                ep0Var6.invokeSuspend(rih1Var);
                break;
            case 6:
                ep0 ep0Var7 = new ep0((nl9) this.d, (lnm) obj5, (byte) 6);
                ep0Var7.b = (vn9) obj3;
                ep0Var7.c = (tqw) obj4;
                ep0Var7.invokeSuspend(rih1Var);
                break;
            case 7:
                ep0 ep0Var8 = new ep0((tm) this.d, (lnm) obj5, (byte) 7);
                ep0Var8.b = (yo9) obj3;
                ep0Var8.c = (tqw) obj4;
                ep0Var8.invokeSuspend(rih1Var);
                break;
            case 8:
                ep0 ep0Var9 = new ep0((ldo) this.d, (lnm) obj5, (byte) 8);
                ep0Var9.b = (n1b) obj;
                ep0Var9.c = (m1b) obj3;
                ep0Var9.invokeSuspend(rih1Var);
                break;
            case 9:
                ep0 ep0Var10 = new ep0((g9c) this.d, (lnm) obj5, (byte) 9);
                ep0Var10.b = (axz) obj3;
                ep0Var10.c = (tqw) obj4;
                ep0Var10.invokeSuspend(rih1Var);
                break;
            case 10:
                ep0 ep0Var11 = new ep0((g9e) this.d, (lnm) obj5, (byte) 10);
                ep0Var11.b = (c9e) obj3;
                ep0Var11.c = (tqw) obj4;
                ep0Var11.invokeSuspend(rih1Var);
                break;
            case 11:
                ep0 ep0Var12 = new ep0((s0f) this.d, (lnm) obj5, (byte) 11);
                ep0Var12.b = (whf) obj;
                ep0Var12.c = (p3f) obj3;
                ep0Var12.invokeSuspend(rih1Var);
                break;
            case 12:
                ep0 ep0Var13 = new ep0((qlb) this.d, (lnm) obj5, (byte) 12);
                ep0Var13.b = (cyg) obj3;
                ep0Var13.c = (tqw) obj4;
                ep0Var13.invokeSuspend(rih1Var);
                break;
            case 13:
                ep0 ep0Var14 = new ep0((owh) this.d, (lnm) obj5, (byte) 13);
                ep0Var14.b = (iwh) obj;
                ep0Var14.c = (hwh) obj3;
                ep0Var14.invokeSuspend(rih1Var);
                break;
            case 14:
                ep0 ep0Var15 = new ep0((owj) this.d, (lnm) obj5, (byte) 14);
                ep0Var15.b = (lwj) obj2;
                ep0Var15.c = (f060) obj3;
                ep0Var15.invokeSuspend(rih1Var);
                break;
            case 15:
                ep0 ep0Var16 = new ep0((iyj) this.d, (lnm) obj5, (byte) 15);
                ep0Var16.b = (gyj) obj2;
                ep0Var16.c = (eyj) obj3;
                ep0Var16.invokeSuspend(rih1Var);
                break;
            case 16:
                ep0 ep0Var17 = new ep0((kwl) this.d, (lnm) obj5, (byte) 16);
                ep0Var17.b = (twl) obj2;
                ep0Var17.c = (nwl) obj3;
                ep0Var17.invokeSuspend(rih1Var);
                break;
            case 17:
                ep0 ep0Var18 = new ep0((nm1) this.d, (lnm) obj5, (byte) 17);
                ep0Var18.b = (swm) obj3;
                ep0Var18.c = (tqw) obj4;
                ep0Var18.invokeSuspend(rih1Var);
                break;
            case 18:
                ep0 ep0Var19 = new ep0((nm1) this.d, (lnm) obj5, (byte) 18);
                ep0Var19.b = (hxm) obj3;
                ep0Var19.c = (tqw) obj4;
                ep0Var19.invokeSuspend(rih1Var);
                break;
            case 19:
                ep0 ep0Var20 = new ep0((hw2) this.d, (lnm) obj5, (byte) 19);
                ep0Var20.b = (qxm) obj3;
                ep0Var20.c = (tqw) obj4;
                ep0Var20.invokeSuspend(rih1Var);
                break;
            case 20:
                ep0 ep0Var21 = new ep0((el9) this.d, (lnm) obj5, (byte) 20);
                ep0Var21.b = (eym) obj3;
                ep0Var21.c = (tqw) obj4;
                ep0Var21.invokeSuspend(rih1Var);
                break;
            case 21:
                ep0 ep0Var22 = new ep0((jd6) this.d, (lnm) obj5, (byte) 21);
                ep0Var22.b = (j3o) obj3;
                ep0Var22.c = (tqw) obj4;
                ep0Var22.invokeSuspend(rih1Var);
                break;
            case 22:
                ep0 ep0Var23 = new ep0((zbo) this.d, (lnm) obj5, (byte) 22);
                ep0Var23.b = (wbo) obj2;
                ep0Var23.c = (rbo) obj3;
                ep0Var23.invokeSuspend(rih1Var);
                break;
            case 23:
                ep0 ep0Var24 = new ep0((quo) this.d, (lnm) obj5, (byte) 23);
                ep0Var24.b = (ouo) obj;
                ep0Var24.c = (nuo) obj3;
                ep0Var24.invokeSuspend(rih1Var);
                break;
            case 24:
                ep0 ep0Var25 = new ep0((snr) this.d, (lnm) obj5, (byte) 24);
                ep0Var25.b = (v1l) obj3;
                ep0Var25.c = (tqw) obj4;
                ep0Var25.invokeSuspend(rih1Var);
                break;
            case 25:
                ep0 ep0Var26 = new ep0((aor) this.d, (lnm) obj5, (byte) 25);
                ep0Var26.b = (e3l) obj3;
                ep0Var26.c = (tqw) obj4;
                ep0Var26.invokeSuspend(rih1Var);
                break;
            case 26:
                ep0 ep0Var27 = new ep0((ft30) this.d, (lnm) obj5, (byte) 26);
                ep0Var27.b = (t2t0) obj3;
                ep0Var27.c = (tqw) obj4;
                ep0Var27.invokeSuspend(rih1Var);
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ep0 ep0Var28 = new ep0((tm) this.d, (lnm) obj5, (byte) 27);
                ep0Var28.b = (dms) obj3;
                ep0Var28.c = (tqw) obj4;
                ep0Var28.invokeSuspend(rih1Var);
                break;
            case 28:
                ep0 ep0Var29 = new ep0((pns) this.d, (lnm) obj5, (byte) 28);
                ep0Var29.b = (gx51) obj2;
                ep0Var29.c = (ex51) obj3;
                ep0Var29.invokeSuspend(rih1Var);
                break;
            default:
                ep0 ep0Var30 = new ep0(b2, (lnm) obj5);
                ep0Var30.b = (het) obj;
                ep0Var30.c = (fet) obj3;
                ep0Var30.d = (tqw) obj4;
                ep0Var30.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        xj90 sj90Var;
        Object value;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                jp0 jp0Var = (jp0) this.d;
                lo0 lo0Var = (lo0) this.b;
                to0 to0Var = (zo0) this.c;
                hm5.M(obj);
                if (to0Var instanceof to0) {
                    jp0Var.g(lo0Var.a, to0Var.a);
                    xu30 xu30Var = lo0Var.b;
                    Boolean bool = Boolean.TRUE;
                    xu30Var.invoke((Object) null, bool, bool);
                    return rih1Var;
                }
                if (to0Var instanceof po0) {
                    po0 po0Var = (po0) to0Var;
                    xx10 xx10Var = po0Var.b;
                    boolean z2 = xx10Var instanceof ux10;
                    if (!z2 && !(xx10Var instanceof rx10)) {
                        jp0Var.g(lo0Var.a, po0Var.a);
                    }
                    xu30 xu30Var2 = lo0Var.b;
                    if (!z2 && !(xx10Var instanceof rx10) && !(xx10Var instanceof wx10) && !(xx10Var instanceof sx10)) {
                        z = true;
                    }
                    xu30Var2.invoke(xx10Var, Boolean.valueOf(z), Boolean.valueOf(!(xx10Var instanceof wx10)));
                    return rih1Var;
                }
                if (to0Var instanceof yo0) {
                    yo0 yo0Var = (yo0) to0Var;
                    xx10 xx10Var2 = yo0Var.b;
                    boolean z3 = xx10Var2 instanceof ux10;
                    if (!z3 && !(xx10Var2 instanceof rx10)) {
                        jp0Var.g(lo0Var.a, yo0Var.a);
                    }
                    xu30 xu30Var3 = lo0Var.b;
                    if (!z3 && !(xx10Var2 instanceof rx10) && !(xx10Var2 instanceof wx10) && !(xx10Var2 instanceof sx10)) {
                        z = true;
                    }
                    xu30Var3.invoke(xx10Var2, Boolean.valueOf(z), Boolean.valueOf(!(xx10Var2 instanceof wx10)));
                    return rih1Var;
                }
                if ((to0Var instanceof so0) || (to0Var instanceof uo0) || (to0Var instanceof wo0) || (to0Var instanceof vo0) || (to0Var instanceof xo0)) {
                    return rih1Var;
                }
                if (to0Var instanceof qo0) {
                    ko0 ko0Var = jp0Var.c;
                    dg30 dg30Var = jp0Var.d;
                    String str = ((qo0) to0Var).a;
                    zp0 zp0Var = lo0Var.a;
                    ko0Var.c(dg30Var, new a580(str, zp0Var.f, zp0Var.g, zp0Var.e));
                    return rih1Var;
                }
                if (to0Var instanceof no0) {
                    lo0Var.b.invoke((Object) null, Boolean.FALSE, Boolean.TRUE);
                    return rih1Var;
                }
                if ((to0Var instanceof ro0) || (to0Var instanceof oo0)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                res resVar = (res) this.d;
                lzn0 lzn0Var = (lzn0) resVar.f;
                los losVar = (los) resVar.e;
                ce31 ce31Var = (ce31) resVar.h;
                q52 q52Var = (q52) this.b;
                lhb1 lhb1Var = (lhb1) this.c;
                hm5.M(obj);
                boolean zJ = u890.j(lhb1Var, jhb1.a);
                ixb ixbVar = ixb.c;
                if (zJ) {
                    q52Var.a.invoke();
                    c01 c01VarN = AdUnlockedOnDemand.n();
                    c01VarN.n(b01.c);
                    c01VarN.s(ce31Var.b);
                    ce31Var.b(c01VarN);
                    ce31Var.a.a(c01VarN.build());
                    losVar.a(ixbVar);
                    lzn0Var.h("spotify:premium-destination");
                    return rih1Var;
                }
                if (!u890.j(lhb1Var, khb1.a)) {
                    eg.o();
                    return null;
                }
                q52Var.a.invoke();
                c01 c01VarN2 = AdUnlockedOnDemand.n();
                c01VarN2.n(b01.d);
                c01VarN2.s(ce31Var.b);
                ce31Var.b(c01VarN2);
                ce31Var.a.a(c01VarN2.build());
                losVar.a(ixbVar);
                lzn0Var.f(new dwn0(xcg1.i(nik1.e2.a, "?adSlot=on-demand-cap-reached&postAction=extend-on-demand-cap&destinationUri=", Uri.encode(((x52) resVar.g).a)), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            case 2:
                qj0 qj0Var = (qj0) this.d;
                qd2 qd2Var = (sd2) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (qd2Var instanceof rd2) {
                    vb2.a((vb2) qj0Var.d, tqwVar != null ? n3o1.y(tqwVar) : null);
                    return rih1Var;
                }
                if (qd2Var instanceof qd2) {
                    ((i9i1) qj0Var.e).b(qd2Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                eg3 eg3Var = (eg3) this.b;
                cg3 cg3Var = (cg3) this.c;
                hm5.M(obj);
                e4b1 e4b1Var = ((hg3) this.d).b;
                int i = eg3Var.k;
                zuc0 zuc0Var = (zuc0) eg3Var.l;
                rj90 rj90Var = new rj90(6, false);
                bk90 bk90Var = ((bg3) e4b1Var.b).b;
                if (cg3Var.equals(cg3.d)) {
                    sj90Var = new xj90(i, zuc0Var);
                } else if (cg3Var.equals(cg3.a) || cg3Var.equals(cg3.c)) {
                    sj90Var = new sj90(i, zuc0Var);
                } else if (cg3Var.equals(cg3.e)) {
                    sj90Var = new zj90(i, zuc0Var, rj90Var);
                } else {
                    if (!cg3Var.equals(cg3.b)) {
                        eg.o();
                        return null;
                    }
                    sj90Var = new yj90(i, zuc0Var, rj90Var, (tv80) null, 8);
                }
                bk90Var.a(sj90Var);
                return rih1Var;
            case 4:
                dc8 dc8Var = (dc8) this.d;
                wb8 wb8Var = (wb8) this.b;
                rb8 rb8Var = (rb8) this.c;
                hm5.M(obj);
                if (rb8Var == null) {
                    eg.o();
                    return null;
                }
                dc8Var.b.e();
                dc8Var.c.a(wb8Var.a);
                return rih1Var;
            case 5:
                hw2 hw2Var = (hw2) this.d;
                rm9 rm9Var = (rm9) hw2Var.f;
                ln9 ln9Var = (ln9) this.b;
                tqw tqwVar2 = (tqw) this.c;
                hm5.M(obj);
                int iOrdinal = ln9Var.ordinal();
                if (iOrdinal == 0) {
                    rm9Var.b();
                    return rih1Var;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                String str2 = rm9Var.a.h;
                if (str2 == null) {
                    return rih1Var;
                }
                ic9 ic9Var = (ic9) hw2Var.h;
                s6z.a((s6z) ic9Var.b, str2, (lik1) ic9Var.c, cvl1.d(tqwVar2), (String) null, (j380) null, vl9.a, 88);
                return rih1Var;
            case 6:
                vn9 vn9Var = (vn9) this.b;
                tqw tqwVar3 = (tqw) this.c;
                hm5.M(obj);
                if (xn9.a[vn9Var.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar3 == null) {
                    return rih1Var;
                }
                tv80 tv80VarY = n3o1.y(tqwVar3);
                nl9 nl9Var = (nl9) this.d;
                ((rm9) nl9Var.b).b();
                ((a1r0) nl9Var.i).g();
                e7p0.e((e7p0) nl9Var.h, tv80VarY);
                return rih1Var;
            case 7:
                tm tmVar = (tm) this.d;
                rm9 rm9Var2 = (rm9) tmVar.c;
                yo9 yo9Var = (yo9) this.b;
                tqw tqwVar4 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(yo9Var, to9.a)) {
                    rm9Var2.m(2);
                    return rih1Var;
                }
                if (u890.j(yo9Var, xo9.a)) {
                    ((iu30) tmVar.e).invoke(tqwVar4 != null ? n3o1.y(tqwVar4).a : null);
                    return rih1Var;
                }
                if (u890.j(yo9Var, wo9.a)) {
                    fdc fdcVar = rm9Var2.a.d;
                    if (fdcVar == null) {
                        return rih1Var;
                    }
                    fdc.d0(fdcVar, rky0.a);
                    return rih1Var;
                }
                if (u890.j(yo9Var, vo9.a)) {
                    rm9Var2.a.a();
                    return rih1Var;
                }
                if (yo9Var instanceof uo9) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                n1b n1bVar = (n1b) this.b;
                m1b m1bVar = (m1b) this.c;
                hm5.M(obj);
                if (m1bVar == null) {
                    eg.o();
                    return null;
                }
                Parcelable parcelable = n1bVar.b;
                if (parcelable == null) {
                    return rih1Var;
                }
                utw0 utw0Var = (utw0) ((ldo) this.d).c;
                ujf1 ujf1Var = new ujf1();
                Bundle bundle = new Bundle();
                bundle.putParcelable("key-view-data", parcelable);
                ujf1Var.T0(bundle);
                th30 th30Var = (th30) utw0Var.a;
                th30Var.getClass();
                nu9 nu9Var = new nu9(th30Var);
                nu9Var.k(R.id.content, ujf1Var, ujf1.class.getCanonicalName(), 1);
                nu9Var.f();
                return rih1Var;
            case 9:
                axz axzVar = (axz) this.b;
                tqw tqwVar5 = (tqw) this.c;
                hm5.M(obj);
                if (axzVar == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar5 == null) {
                    return rih1Var;
                }
                ((g9c) this.d).a.a(nik1.A1.a, n3o1.y(tqwVar5), (Bundle) null);
                return rih1Var;
            case 10:
                c9e c9eVar = (c9e) this.b;
                tqw tqwVar6 = (tqw) this.c;
                hm5.M(obj);
                if (c9eVar == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar6 == null) {
                    return rih1Var;
                }
                ((g9e) this.d).a.a(c9eVar.a, n3o1.y(tqwVar6), (Bundle) null);
                return rih1Var;
            case 11:
                s0f s0fVar = (s0f) this.d;
                whf whfVar = (whf) this.b;
                m1f m1fVar = (p3f) this.c;
                hm5.M(obj);
                if ((m1fVar instanceof u2f) || (m1fVar instanceof h2f) || (m1fVar instanceof n3f)) {
                    return rih1Var;
                }
                if (m1fVar instanceof q2f) {
                    int i2 = ReportWebViewActivity.f1;
                    s0fVar.c.a(v9p1.A(s0fVar.a.getApplication(), u2p1.r(whfVar.a)));
                    return rih1Var;
                }
                if (m1fVar instanceof m1f) {
                    z710.d(s0fVar.d, m1fVar.a, false, 6);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                cyg cygVar = (cyg) this.b;
                tqw tqwVar7 = (tqw) this.c;
                hm5.M(obj);
                if (cygVar != null) {
                    i1o1.w((njm) ((qlb) this.d).e, cygVar.b, tqwVar7 != null ? n3o1.y(tqwVar7) : null, Long.valueOf(w361.v(cygVar.c)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                owh owhVar = (owh) this.d;
                iwh iwhVar = (iwh) this.b;
                gwh gwhVar = (hwh) this.c;
                hm5.M(obj);
                if (!(gwhVar instanceof gwh)) {
                    if (gwhVar instanceof fwh) {
                        owhVar.f.b(iwhVar.a, ((fwh) gwhVar).a);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                boolean z4 = gwhVar.a;
                p2o0 p2o0Var = owhVar.b;
                if (!z4) {
                    xab1 xab1VarT = fn31.T(cto1.q((iac0) p2o0Var.b), (o8n) null, 0, new vk6(p2o0Var, (lnm) null, (byte) 25), 3);
                    p2o0Var.g = xab1VarT;
                    xab1VarT.start();
                    return rih1Var;
                }
                xab1 xab1Var = (xab1) p2o0Var.g;
                if (xab1Var != null) {
                    r561 r561VarA = j2h1.A((vu30) xab1Var.a().b);
                    while (r561VarA.hasNext()) {
                        ((faa0) r561VarA.next()).d((CancellationException) null);
                    }
                }
                xab1 xab1Var2 = (xab1) p2o0Var.g;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                bpb1 bpb1Var = (bpb1) p2o0Var.f;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, uyd.a((uyd) value, (List) null, (ArrayList) null, false, 7)));
                return rih1Var;
            case 14:
                owj owjVar = (owj) this.d;
                lwj lwjVar = (lwj) this.b;
                f060 f060Var = (f060) this.c;
                hm5.M(obj);
                if (u890.j(f060Var, b060.a)) {
                    owjVar.e.invoke();
                    return rih1Var;
                }
                if (u890.j(f060Var, d060.a)) {
                    o901 o901Var = owjVar.f;
                    String str3 = lwjVar.c;
                    boolean z5 = lwjVar.g;
                    xhm xhmVar = (xhm) o901Var.b.get();
                    pim pimVar = new pim(str3, z5);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    xhmVar.a(pimVar, yon1.D4());
                    return rih1Var;
                }
                if (!u890.j(f060Var, e060.a)) {
                    eg.o();
                    return null;
                }
                fbz0 fbz0Var = owjVar.g;
                String str4 = lwjVar.a;
                String str5 = lwjVar.c;
                uxy0 uxy0Var = (uxy0) fbz0Var.b;
                pux0 pux0Var = new pux0((th30) uxy0Var.b, (uww0) uxy0Var.c, (byte) 13);
                th30 th30Var2 = (th30) pux0Var.b;
                if (th30Var2.U()) {
                    return rih1Var;
                }
                y901 y901VarA = ((uww0) pux0Var.c).a();
                y901VarA.T0(mno1.h(new mmr0[]{new mmr0("episode_uri", str4), new mmr0("transcript_uri", str5)}));
                y901VarA.g1(th30Var2, "read_along_report_issue_dialog");
                return rih1Var;
            case 15:
                iyj iyjVar = (iyj) this.d;
                gyj gyjVar = (gyj) this.b;
                eyj eyjVar = (eyj) this.c;
                hm5.M(obj);
                if (u890.j(eyjVar, cyj.a)) {
                    iyjVar.d.invoke();
                    return rih1Var;
                }
                if (eyjVar instanceof dyj) {
                    iyjVar.e.invoke(gyjVar, ((dyj) eyjVar).a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                twl twlVar = (twl) this.b;
                nwl nwlVar = (nwl) this.c;
                hm5.M(obj);
                if ((nwlVar instanceof mwl) && (twlVar instanceof qwl)) {
                    ((kwl) this.d).g.a(((qwl) twlVar).a, false);
                }
                return rih1Var;
            case 17:
                swm swmVar = (swm) this.b;
                tqw tqwVar8 = (tqw) this.c;
                hm5.M(obj);
                if (swmVar != null) {
                    i1o1.x((njm) ((nm1) this.d).f, swmVar.b, swmVar.a, tqwVar8 != null ? n3o1.y(tqwVar8) : null, w361.v(swmVar.c));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 18:
                hxm hxmVar = (hxm) this.b;
                tqw tqwVar9 = (tqw) this.c;
                hm5.M(obj);
                if (hxmVar == null) {
                    eg.o();
                    return null;
                }
                njm njmVar = (njm) ((nm1) this.d).f;
                Set set = pxm.a;
                i1o1.w(njmVar, hxmVar.a, tqwVar9 != null ? n3o1.y(tqwVar9) : null, Long.valueOf(w361.v(hxmVar.b)));
                return rih1Var;
            case 19:
                qxm qxmVar = (qxm) this.b;
                tqw tqwVar10 = (tqw) this.c;
                hm5.M(obj);
                if (qxmVar != null) {
                    i1o1.w((njm) ((hw2) this.d).f, qxmVar.a, tqwVar10 != null ? n3o1.y(tqwVar10) : null, Long.valueOf(w361.v(qxmVar.b)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                eym eymVar = (eym) this.b;
                tqw tqwVar11 = (tqw) this.c;
                hm5.M(obj);
                if (eymVar != null) {
                    i1o1.w((njm) ((el9) this.d).g, eymVar.a, tqwVar11 != null ? n3o1.y(tqwVar11) : null, Long.valueOf(w361.v(eymVar.b)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 21:
                j3o j3oVar = (j3o) this.b;
                tqw tqwVar12 = (tqw) this.c;
                hm5.M(obj);
                if (j3oVar == null) {
                    eg.o();
                    return null;
                }
                jd6 jd6Var = (jd6) this.d;
                String str6 = j3oVar.a;
                tv80 tv80VarY2 = tqwVar12 != null ? n3o1.y(tqwVar12) : null;
                ((lzn0) jd6Var.f).f(new dwn0(str6, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY2 != null ? new bwn0(tv80VarY2) : null));
                return rih1Var;
            case 22:
                ubo uboVar = (wbo) this.b;
                rbo rboVar = (rbo) this.c;
                hm5.M(obj);
                if ((uboVar instanceof vbo) || (uboVar instanceof tbo)) {
                    return rih1Var;
                }
                if (!(uboVar instanceof ubo) || rboVar == null) {
                    eg.o();
                    return null;
                }
                bpb1 bpb1Var2 = ((zbo) this.d).g;
                Object value2 = bpb1Var2.getValue();
                tv80 tv80Var = uboVar.i;
                bpb1Var2.l(u890.j(value2, tv80Var) ? null : tv80Var);
                return rih1Var;
            case 23:
                quo quoVar = (quo) this.d;
                ouo ouoVar = (ouo) this.b;
                nuo nuoVar = (nuo) this.c;
                hm5.M(obj);
                int iOrdinal2 = nuoVar.ordinal();
                if (iOrdinal2 == 0) {
                    quoVar.a.invoke(ouoVar.a);
                    return rih1Var;
                }
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                if (!ouoVar.e || !ouoVar.f) {
                    return rih1Var;
                }
                quoVar.b.invoke(ouoVar.a);
                return rih1Var;
            case 24:
                snr snrVar = (snr) this.d;
                v1l v1lVar = (v1l) this.b;
                tqw tqwVar13 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(v1lVar, v1l.a)) {
                    ((ior) snrVar.c.get()).a(cvl1.d(tqwVar13).a.a, false);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 25:
                aor aorVar = (aor) this.d;
                e3l e3lVar = (e3l) this.b;
                tqw tqwVar14 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(e3lVar, e3l.a)) {
                    ((ior) aorVar.d.get()).a(cvl1.d(tqwVar14).a.a, false);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                ft30 ft30Var = (ft30) this.d;
                t2t0 t2t0Var = (t2t0) this.b;
                tqw tqwVar15 = (tqw) this.c;
                hm5.M(obj);
                if (t2t0Var instanceof s2t0) {
                    if (tqwVar15 == null) {
                        return rih1Var;
                    }
                    ft30Var.invoke(new wp3(n3o1.y(tqwVar15)));
                    return rih1Var;
                }
                if (t2t0Var instanceof r2t0) {
                    ft30Var.invoke(lp3.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                dms dmsVar = (dms) this.b;
                tqw tqwVar16 = (tqw) this.c;
                hm5.M(obj);
                if ((dmsVar instanceof cms) || (dmsVar instanceof bms)) {
                    ((pms) ((tm) this.d).e).a(dmsVar.a(), tqwVar16 != null ? n3o1.y(tqwVar16) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 28:
                bzm bzmVar = ((pns) this.d).a;
                gx51 gx51Var = (gx51) this.b;
                cx51 cx51Var = (ex51) this.c;
                hm5.M(obj);
                if (!(cx51Var instanceof cx51)) {
                    if (u890.j(cx51Var, dx51.a)) {
                        bzmVar.invoke(vq3.a);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                Map map = gx51Var.a;
                if (!gx51Var.c || map == null) {
                    return rih1Var;
                }
                bzmVar.invoke(new tq3(cx51Var.a, map));
                return rih1Var;
            default:
                het hetVar = (het) this.b;
                eet eetVar = (fet) this.c;
                tqw tqwVar17 = (tqw) this.d;
                hm5.M(obj);
                if (eetVar instanceof eet) {
                    hetVar.d.invoke(new Long(eetVar.a), tqwVar17 != null ? n3o1.y(tqwVar17) : null);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep0(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 29;
    }
}
