package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.ads.esperanto.proto.AdStateValue;
import com.spotify.ads.esperanto.proto.StateRequest;
import com.spotify.ads.esperanto.proto.StateResponse;
import com.spotify.scrollsita.v1.Section;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xba1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xba1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new xba1((d830) obj2, lnmVar, (byte) 0);
            case 1:
                return new xba1((tva1) obj2, lnmVar, (byte) 1);
            case 2:
                return new xba1((swa1) obj2, lnmVar, (byte) 2);
            case 3:
                return new xba1((dza1) obj2, lnmVar, (byte) 3);
            case 4:
                return new xba1((qza1) obj2, lnmVar, (byte) 4);
            case 5:
                return new xba1((xm41) obj2, lnmVar, (byte) 5);
            case 6:
                return new xba1((r2b1) obj2, lnmVar, (byte) 6);
            case 7:
                return new xba1((SpotifyWearableListenerService) obj2, lnmVar, (byte) 7);
            case 8:
                return new xba1((mxa1) obj2, lnmVar, (byte) 8);
            case 9:
                return new xba1((vhb1) obj2, lnmVar, (byte) 9);
            case 10:
                return new xba1((xob1) obj2, lnmVar, (byte) 10);
            case 11:
                return new xba1((epb1) obj2, lnmVar, (byte) 11);
            case 12:
                return new xba1((e821) obj2, lnmVar, (byte) 12);
            case 13:
                return new xba1((t6c1) obj2, lnmVar, (byte) 13);
            case 14:
                return new xba1((n9c1) obj2, lnmVar, (byte) 14);
            case 15:
                return new xba1((a6c1) obj2, lnmVar, (byte) 15);
            case 16:
                return new xba1((rec1) obj2, lnmVar, (byte) 16);
            case 17:
                return new xba1((n2d1) obj2, lnmVar, (byte) 17);
            case 18:
                return new xba1((b4d1) obj2, lnmVar, (byte) 18);
            case 19:
                return new xba1((k7d1) obj2, lnmVar, (byte) 19);
            case 20:
                return new xba1((qhd1) obj2, lnmVar, (byte) 20);
            case 21:
                return new xba1((gqd1) obj2, lnmVar, (byte) 21);
            case 22:
                return new xba1((cxd1) obj2, lnmVar, (byte) 22);
            case 23:
                return new xba1((n4e1) obj2, lnmVar, (byte) 23);
            case 24:
                return new xba1((qoo) obj2, lnmVar, (byte) 24);
            case 25:
                return new xba1((j6e1) obj2, lnmVar, (byte) 25);
            case 26:
                return new xba1((x6e1) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new xba1((ykc0) obj2, lnmVar, (byte) 27);
            case 28:
                return new xba1((vbe1) obj2, lnmVar, (byte) 28);
            default:
                return new xba1((qhe1) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object objA;
        Object objB;
        Object objK;
        f94 f94Var;
        byte b = 3;
        byte b2 = 4;
        byte b3 = 2;
        af5 af5VarA = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d830 d830Var = (d830) this.c;
                this.b = true;
                Object objA2 = d830Var.a(this);
                return objA2 == d9nVar ? d9nVar : objA2;
            case 1:
                rih1 rih1Var = rih1.a;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    esa1 esa1Var = (esa1) ((tva1) this.c).f;
                    this.b = true;
                    Object objA3 = esa1Var.A(true, this);
                    if (objA3 != d9nVar2) {
                        objA3 = rih1Var;
                    }
                    if (objA3 == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    swa1 swa1Var = (swa1) this.c;
                    this.b = true;
                    if (swa1Var.d(this) == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 3:
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    be91 be91Var = ((dza1) this.c).b;
                    jx0 jx0Var = jx0.c;
                    qc91 qc91Var = qc91.d;
                    this.b = true;
                    if (be91.a(be91Var, jx0Var, qc91Var, (Map) null, this, 4) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 4:
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    qza1 qza1Var = (qza1) this.c;
                    this.b = true;
                    if (qza1Var.d(this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    ph11 ph11Var = new ph11(eth.V((xm41) this.c), (byte) 12);
                    this.b = true;
                    objI = b5p1.i(ph11Var, this);
                    if (objI == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                ((l3n1) ((jn41) objI).a).b().a();
                return rih1.a;
            case 6:
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    r2b1 r2b1Var = (r2b1) this.c;
                    this.b = true;
                    if (r2b1Var.c(this) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                r2b1 r2b1Var2 = (r2b1) this.c;
                r2b1Var2.a.getClass();
                t3c t3cVar = new t3c();
                r2b1Var2.b.getClass();
                f4t f4tVar = f4t.b;
                HashMap map = t3cVar.b;
                if (map.containsKey("customer_event_alias")) {
                    map.remove("customer_event_alias");
                } else {
                    map.put("customer_event_alias", "Spotify Registration");
                }
                String strB = r2b1Var2.c.b();
                if (strB.length() > 0) {
                    t3cVar.a("android_install_referrer", strB);
                }
                String strA = r2b1Var2.c.a();
                if (strA.length() > 0) {
                    t3cVar.a("android_app_referrer", strA);
                }
                synchronized (r2b1Var2.h) {
                    r2b1Var2.h.add(t3cVar);
                }
                r2b1Var2.b();
                return rih1.a;
            case 7:
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    wo70 wo70Var = ((SpotifyWearableListenerService) this.c).Z;
                    if (wo70Var == null) {
                        u890.C("idleManager");
                        throw null;
                    }
                    wzm0 wzm0Var = wzm0.a;
                    this.b = true;
                    if (wo70Var.h(wzm0Var, this) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zrj1 zrj1Var = (zrj1) ((mxa1) this.c).e;
                this.b = true;
                Object objE = zrj1Var.e(this);
                return objE == d9nVar9 ? d9nVar9 : objE;
            case 9:
                vhb1 vhb1Var = (vhb1) this.c;
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    evz evzVarS = h5p1.s(rqt0.w(new ph11(yoi1.g(((g0l) vhb1Var.a.get()).d()), (byte) 13), dw81.X, rqt0.b), ((l7s) vhb1Var.c.get()).c, yoi1.g(((zzp0) vhb1Var.d.get()).a), new td1(4, (lnm) null, (byte) 13));
                    bda1 bda1Var = new bda1(vhb1Var, b3);
                    this.b = true;
                    if (evzVarS.collect(bda1Var, this) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 10:
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    wob1 wob1Var = ((xob1) this.c).a;
                    StateRequest stateRequest = (StateRequest) StateRequest.n().build();
                    this.b = true;
                    objA = wob1Var.a(stateRequest, this);
                    if (objA == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                Map mapN = ((StateResponse) objA).n();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapN.size()));
                for (Map.Entry entry : mapN.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new cy0(((AdStateValue) entry.getValue()).getValue(), ((AdStateValue) entry.getValue()).n()));
                }
                return linkedHashMap;
            case 11:
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    epb1 epb1Var = (epb1) this.c;
                    zob1 zob1Var = epb1Var.Y;
                    vi viVar = new vi(epb1Var, (byte) 16);
                    this.b = true;
                    if (zob1Var.collect(viVar, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                jah.d();
                return null;
            case 12:
                e821 e821Var = (e821) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    ht20 ht20Var = new ht20(hu20.e((bpb1) e821Var.c, new o681(3, (lnm) null, (byte) 5)), new ck01(2, (lnm) null, (byte) 27), (byte) 2);
                    ck01 ck01Var = new ck01(2, (lnm) null, (byte) 28);
                    this.b = true;
                    if (b5p1.j(ht20Var, ck01Var, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                e821Var.x();
                return rih1.a;
            case 13:
                t6c1 t6c1Var = (t6c1) this.c;
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    mr20 mr20VarJ = o4p1.j(t6c1Var.O0.c(), 2, 2);
                    bda1 bda1Var2 = new bda1(t6c1Var, b);
                    this.b = true;
                    if (mr20VarJ.collect(bda1Var2, this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 14:
                d9n d9nVar15 = rih1.a;
                d9n d9nVar16 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    l9c1 l9c1Var = (n9c1) this.c;
                    if (l9c1Var instanceof l9c1) {
                        a6c1 a6c1Var = l9c1Var.a;
                        this.b = true;
                        a6c1Var.dispose();
                        if (d9nVar15 == d9nVar16) {
                            return d9nVar16;
                        }
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar15;
            case 15:
                d9n d9nVar17 = rih1.a;
                d9n d9nVar18 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    a6c1 a6c1Var2 = (a6c1) this.c;
                    this.b = true;
                    a6c1Var2.dispose();
                    if (d9nVar17 == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar17;
            case 16:
                rec1 rec1Var = (rec1) this.c;
                d9n d9nVar19 = d9n.a;
                boolean z17 = this.b;
                try {
                    if (!z17) {
                        hm5.M(obj);
                        mfe mfeVarL = k4p1.l(rec1Var.h);
                        bda1 bda1Var3 = new bda1(rec1Var, b2);
                        this.b = true;
                        if (mfeVarL.collect(bda1Var3, this) == d9nVar19) {
                            return d9nVar19;
                        }
                    } else {
                        if (!z17) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (CancellationException | Exception unused) {
                }
                return rih1.a;
            case 17:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar20 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    n2d1 n2d1Var = (n2d1) this.c;
                    this.b = true;
                    Object objS = smo1.s(new w621(n2d1Var, (lnm) null, (byte) 13), this);
                    if (objS != d9nVar20) {
                        objS = rih1Var2;
                    }
                    if (objS == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 18:
                d9n d9nVar21 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    o95 o95Var = ((b4d1) this.c).i1;
                    if (o95Var != null) {
                        Float f = new Float(0.16f);
                        n8b1 n8b1Var = x3d1.h;
                        this.b = true;
                        objB = o95.b(o95Var, f, n8b1Var, (Float) null, (iu30) null, this, 12);
                        if (objB == d9nVar21) {
                            return d9nVar21;
                        }
                    }
                    return rih1.a;
                }
                if (!z19) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objB = obj;
                return rih1.a;
            case 19:
                rih1 rih1Var3 = rih1.a;
                k7d1 k7d1Var = (k7d1) this.c;
                d9n d9nVar22 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(k7d1Var.U0);
                    this.b = true;
                    objK = b5p1.k(ezcVarG, this);
                    if (objK == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                l62 l62Var = (l62) objK;
                if (l62Var != null) {
                    lsn lsnVar = l62Var.Z;
                    if (lsnVar instanceof lsn) {
                        vhc vhcVar = e6d1.P0;
                        x6d1 x6d1Var = lsnVar.c;
                        ji0 ji0Var = x6d1Var.a;
                        af5VarA = ji0Var != null ? ji0Var.W0 : null;
                        vhcVar.getClass();
                        e6d1 e6d1Var = af5VarA == null ? false : af5VarA.equals("topic_survey") ? e6d1.TOPIC_SURVEY : e6d1.BRAND_SURVEY;
                        c6d1 c6d1Var = new c6d1(e6d1Var, f6d1.d, k7d1Var.c1);
                        if (!c6d1Var.equals(k7d1Var.b1)) {
                            k7d1Var.b1 = c6d1Var;
                            k7d1Var.a1.setValue(k7d1Var.V0.a(c6d1Var));
                        }
                        k7d1Var.d1.setValue(x6d1Var);
                        k7d1Var.Y0.setBackgroundResource(e6d1Var.a);
                    }
                }
                return rih1Var3;
            case 20:
                d9n d9nVar23 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    qhd1 qhd1Var = (qhd1) this.c;
                    qzn0 qzn0Var = qhd1Var.t;
                    wqn0 wqn0VarH = qhd1Var.h();
                    this.b = true;
                    if (qzn0Var.a(wqn0VarH, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 21:
                gqd1 gqd1Var = (gqd1) this.c;
                d9n d9nVar24 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    mfe mfeVarB = k4p1.B((bbc) gqd1Var.d.c);
                    bda1 bda1Var4 = new bda1((Object) gqd1Var, (byte) 6);
                    this.b = true;
                    if (mfeVarB.collect(bda1Var4, this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                rih1 rih1Var4 = rih1.a;
                d9n d9nVar25 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    xh7 xh7Var = ((cxd1) this.c).c;
                    this.b = true;
                    Object objJ = b5p1.j(xh7Var.b, new nw5(2, (lnm) null, (byte) 2), this);
                    if (objJ != d9nVar25) {
                        objJ = rih1Var4;
                    }
                    if (objJ == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Thread.setDefaultUncaughtExceptionHandler(new cuj(new nda1(0, (cxd1) this.c, cxd1.class, "crashDetected", "crashDetected()V", 0, (byte) 23), Thread.getDefaultUncaughtExceptionHandler()));
                jxd1 jxd1Var = (jxd1) ((cxd1) this.c).a.get();
                s0u s0uVar = s0u.a;
                jxd1Var.b(s0u.f + " -- Logger initiated --");
                for (vgn vgnVar : (Set) ((cxd1) this.c).b.get()) {
                    cxd1 cxd1Var = (cxd1) this.c;
                    l4p1.u(cxd1Var.e, new fu20(vgnVar.b(), new kwb1(cxd1Var, null, (byte) 7), (byte) 1));
                }
                return rih1Var4;
            case 23:
                n4e1 n4e1Var = (n4e1) this.c;
                d9n d9nVar26 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    n811 n811Var = new n811();
                    n811Var.a = 1;
                    m441 m441VarQ = rwq.q(new qga0(n4e1Var, n811Var, (byte) 19));
                    cy9 cy9Var = new cy9(n4e1Var, (lnm) null, (byte) 15);
                    this.b = true;
                    if (l4p1.q(m441VarQ, cy9Var, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 24:
                rih1 rih1Var5 = rih1.a;
                d9n d9nVar27 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    qoo qooVar = (qoo) this.c;
                    this.b = true;
                    qooVar.getClass();
                    Object objS2 = smo1.s(new eum(qooVar, (lnm) null, (byte) 12), this);
                    if (objS2 != d9nVar27) {
                        objS2 = rih1Var5;
                    }
                    if (objS2 == d9nVar27) {
                        return d9nVar27;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var5;
            case 25:
                d9n d9nVar28 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    o95 o95Var2 = ((j6e1) this.c).V0;
                    Offset offset = new Offset(9205357640488583168L);
                    this.b = true;
                    if (o95Var2.g(offset, this) == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 26:
                x6e1 x6e1Var = (x6e1) this.c;
                d9n d9nVar29 = rih1.a;
                d9n d9nVar30 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    if (!nbe1.d(x6e1Var.l().b) && x6e1Var.h()) {
                        af5VarA = jch0.A(x6e1Var.l());
                        af5 af5VarE = jch0.D(x6e1Var.l(), x6e1Var.l().a.b.length()).e(jch0.B(x6e1Var.l(), x6e1Var.l().a.b.length()));
                        int iG = nbe1.g(x6e1Var.l().b);
                        x6e1Var.c.invoke(x6e1.b(af5VarE, e6p1.e(iG, iG)));
                        x6e1Var.r(zr50.a);
                        x6e1Var.a.e = true;
                    }
                    if (af5VarA != null && (f94Var = x6e1Var.g) != null) {
                        kmg kmgVarA = s1p1.A(af5VarA);
                        this.b = true;
                        f94Var.b(kmgVarA);
                        if (d9nVar29 == d9nVar30) {
                            return d9nVar30;
                        }
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar29;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                rih1 rih1Var6 = rih1.a;
                d9n d9nVar31 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    ykc0 ykc0Var = (ykc0) this.c;
                    this.b = true;
                    ykc0Var.getClass();
                    Object objCollect = ykc0Var.a.c().collect(new om70(new wdn0(), ykc0Var, (byte) 21), this);
                    if (objCollect != d9nVar31) {
                        objCollect = rih1Var6;
                    }
                    if (objCollect == d9nVar31) {
                        return d9nVar31;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var6;
            case 28:
                d9n d9nVar32 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    f1n0 f1n0Var = (f1n0) ((vbe1) this.c).d;
                    this.b = true;
                    if (f1n0Var.a(this) == d9nVar32) {
                        return d9nVar32;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                qhe1 qhe1Var = (qhe1) this.c;
                d9n d9nVar33 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    n811 n811Var2 = new n811();
                    mr20 mr20VarC = qhe1Var.O0.c();
                    mib mibVar = new mib(n811Var2, qhe1Var, (byte) 21);
                    this.b = true;
                    if (mr20VarC.collect(mibVar, this) == d9nVar33) {
                        return d9nVar33;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
