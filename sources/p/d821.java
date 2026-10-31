package p;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Single;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d821 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d821(boolean z, pe21 pe21Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.b = z;
        this.d = pe21Var;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new d821(this.d, obj2, lnmVar, (byte) 0);
            case 1:
                return new d821(this.d, obj2, lnmVar, (byte) 1);
            case 2:
                return new d821(this.d, obj2, lnmVar, (byte) 2);
            case 3:
                return new d821(this.d, obj2, lnmVar, (byte) 3);
            case 4:
                return new d821(this.d, obj2, lnmVar, (byte) 4);
            case 5:
                return new d821(this.d, obj2, lnmVar, (byte) 5);
            case 6:
                return new d821(this.d, obj2, lnmVar, (byte) 6);
            case 7:
                return new d821(this.b, (pe21) this.d, obj2, lnmVar);
            case 8:
                return new d821(this.d, obj2, lnmVar, (byte) 8);
            case 9:
                return new d821(this.d, obj2, lnmVar, (byte) 9);
            case 10:
                return new d821(this.d, obj2, lnmVar, (byte) 10);
            case 11:
                return new d821(this.d, obj2, lnmVar, (byte) 11);
            case 12:
                return new d821(this.d, obj2, lnmVar, (byte) 12);
            case 13:
                d821 d821Var = new d821((t05) obj2, lnmVar);
                d821Var.d = obj;
                return d821Var;
            case 14:
                return new d821(this.d, obj2, lnmVar, (byte) 14);
            case 15:
                return new d821(this.d, obj2, lnmVar, (byte) 15);
            case 16:
                return new d821(this.d, obj2, lnmVar, (byte) 16);
            case 17:
                return new d821(this.d, obj2, lnmVar, (byte) 17);
            case 18:
                return new d821(this.d, obj2, lnmVar, (byte) 18);
            case 19:
                return new d821(this.d, obj2, lnmVar, (byte) 19);
            case 20:
                return new d821(this.d, obj2, lnmVar, (byte) 20);
            case 21:
                return new d821(this.d, obj2, lnmVar, (byte) 21);
            case 22:
                return new d821(this.d, obj2, lnmVar, (byte) 22);
            case 23:
                return new d821(this.d, obj2, lnmVar, (byte) 23);
            case 24:
                return new d821(this.d, obj2, lnmVar, (byte) 24);
            case 25:
                return new d821(this.d, obj2, lnmVar, (byte) 25);
            case 26:
                return new d821(this.d, obj2, lnmVar, (byte) 26);
            case 27:
                return new d821(this.d, obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new d821(this.d, obj2, lnmVar, (byte) 28);
            default:
                return new d821(this.d, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x031d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0348  */
    /* JADX WARN: Code duplicated, block: B:462:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objO;
        String string;
        Object objI;
        tg71 m231Var;
        Object objG;
        Object objS;
        Object objS2;
        Object objL;
        int i;
        Object obj2;
        int i2;
        int i3;
        int i4;
        pbh0 pbh0VarE;
        Object objR;
        Object objA;
        Object objJ;
        byte b = this.a;
        bx51 bx51Var = bx51.c;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                e821 e821Var = (e821) this.d;
                dg30 dg30Var = (dg30) e821Var.b;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    m311 m311Var = new m311(e821Var, (String) obj3, null, (byte) 8);
                    this.b = true;
                    objO = rc2.O(400L, m311Var, this);
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objO = obj;
                }
                String str = (String) objO;
                if (str == null || (string = dg30Var.getString(2131962617, str)) == null) {
                    string = dg30Var.getString(2131962630);
                }
                er91 er91Var = new er91((fs91) null, string, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = (kt91) e821Var.a;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                    return rih1Var;
                }
                kt91Var.o(er91Var);
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        this.b = true;
                        objI = ((gj10) ((uxy0) this.d).c).i((String) obj3, this);
                        if (objI == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objI = obj;
                    }
                    return (String) objI;
                } catch (Exception e) {
                    v8i0.j("error removing member ", e.getMessage());
                }
                break;
            case 2:
                frd1 frd1Var = (frd1) obj3;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    sxz0 sxz0VarA = ((zj1) this.d).b.a(frd1Var);
                    if (sxz0VarA != null) {
                        this.b = true;
                        return sxz0VarA.d(frd1Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    hhg1.n("Required value was null.");
                } else {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    ak1 ak1Var = (ak1) this.d;
                    sxz0 sxz0Var = ak1Var.b;
                    frd1 frd1Var2 = ak1Var.c;
                    this.b = true;
                    if (sxz0Var.d(frd1Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new t101(((j101) obj3).a);
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    ak1 ak1Var2 = (ak1) this.d;
                    sxz0 sxz0Var2 = ak1Var2.b;
                    frd1 frd1Var3 = ak1Var2.c;
                    this.b = true;
                    if (sxz0Var2.d(frd1Var3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new b501(((k401) obj3).a);
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    return ((gc21) this.d).i((vpu0) obj3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                any anyVar = new any((xe01) ((k811) this.d).b, (byte) 18);
                zd21 zd21Var = new zd21((PlayerState) obj3, (lnm) null, (byte) 1);
                this.b = true;
                Object objJ2 = b5p1.j(anyVar, zd21Var, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
            case 7:
                hm5.M(obj);
                boolean z8 = this.b;
                HashSet hashSet = ((pe21) this.d).t;
                if (z8) {
                    hashSet.add(obj3);
                } else {
                    hashSet.remove(obj3);
                }
                return rih1Var;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ = cfd.q((cfd) ((mzr0) this.d).e, (String) obj3, this);
                    return objQ == d9nVar ? d9nVar : objQ;
                }
                if (z9) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA2 = ((fs21) this.d).b.a((wa71) obj3, this);
                    return objA2 == d9nVar ? d9nVar : objA2;
                }
                if (z10) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    if (((ziu) this.d).b) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(2000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((ven0) obj3).setValue(Boolean.TRUE);
                return rih1Var;
            case 11:
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        m021 m021Var = (m021) this.d;
                        kh71 kh71Var = (kh71) obj3;
                        this.b = true;
                        objG = m021Var.g(kh71Var, this);
                        if (objG == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objG = obj;
                    }
                    m231Var = (tg71) objG;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                Throwable thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    Logger.e(thA2, "Failed to resolve entry point plugins", new Object[0]);
                }
                if (m231Var instanceof m231) {
                    m231Var = dg71.a;
                }
                return m231Var;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wzv0 wzv0Var = (wzv0) this.d;
                qv7 qv7Var = new qv7((iu30) obj3, (byte) 29);
                this.b = true;
                return wzv0Var.collect(qv7Var, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                t05 t05Var = (t05) obj3;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c9n c9nVar = (c9n) this.d;
                mr20 mr20VarC = t05Var.O0.c();
                tzy0 tzy0Var = new tzy0(t05Var, c9nVar, (byte) 16);
                this.b = true;
                return mr20VarC.collect(tzy0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ico0 ico0Var = new ico0((byte) 1);
                this.b = true;
                Object objB = ti31.b((ti31) this.d, (String) obj3, ico0Var, this);
                return objB == d9nVar ? d9nVar : objB;
            case 15:
                kdy0 kdy0Var = (kdy0) this.d;
                zg4 zg4Var = (zg4) kdy0Var.e;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    int iK = zg4Var.k();
                    long j = zg4Var.j();
                    ob01 ob01Var = new ob01(kdy0Var, (jvy0) obj3, (lnm) null, (byte) 13);
                    this.b = true;
                    objS = ywo1.s(iK, j, ob01Var, this);
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objS = obj;
                }
                if (((Boolean) objS).booleanValue()) {
                    return rih1Var;
                }
                Logger.d(gvg.e(zg4Var.k(), "Robin received log failed after ", " retries"), new Object[0]);
                return rih1Var;
            case 16:
                kdy0 kdy0Var2 = (kdy0) this.d;
                zg4 zg4Var2 = (zg4) kdy0Var2.e;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    int iK2 = zg4Var2.k();
                    long j2 = zg4Var2.j();
                    ob01 ob01Var2 = new ob01(kdy0Var2, (pr81) obj3, (lnm) null, (byte) 14);
                    this.b = true;
                    objS2 = ywo1.s(iK2, j2, ob01Var2, this);
                    if (objS2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objS2 = obj;
                }
                if (((Boolean) objS2).booleanValue()) {
                    return rih1Var;
                }
                Logger.d(gvg.e(zg4Var2.k(), "Robin silent push log failed after ", " retries"), new Object[0]);
                return rih1Var;
            case 17:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                en31 en31Var = (en31) this.d;
                vgr vgrVar = en31Var.e;
                if (vgrVar == null) {
                    u890.C("connectionManager");
                    throw null;
                }
                q721 q721Var = new q721(en31Var, (String[]) obj3, (lnm) null, (byte) 3);
                this.b = true;
                return ((x9l) vgrVar.f).W(false, q721Var, this) == d9nVar ? d9nVar : rih1Var;
            case 18:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x94 x94Var = ((bo31) this.d).k;
                tv80 tv80Var = ((sn3) obj3).d;
                this.b = true;
                return x94Var.a(tv80Var, this) == d9nVar ? d9nVar : rih1Var;
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x94 x94Var2 = ((bo31) this.d).k;
                tv80 tv80Var2 = ((yn3) obj3).d;
                this.b = true;
                Object objA3 = ((g6c0) x94Var2.b).a(tv80Var2, this);
                if (objA3 != d9nVar) {
                    objA3 = rih1Var;
                }
                return objA3 == d9nVar ? d9nVar : rih1Var;
            case 20:
                wn3 wn3Var = (wn3) obj3;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    g2z g2zVar = ((bo31) this.d).s;
                    Map map = wn3Var.d;
                    boolean z22 = wn3Var.e;
                    this.b = true;
                    objL = g2zVar.L(map, z22, this);
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objL = obj;
                }
                d921 d921Var = (d921) objL;
                return new uq3(bx51Var, wn3Var.d.keySet(), d921Var.a, d921Var.b);
            case 21:
                jn3 jn3Var = (jn3) obj3;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    q2u q2uVar = ((bo31) this.d).g;
                    Map map2 = jn3Var.d;
                    this.b = true;
                    Activity activity = q2uVar.a;
                    ohd ohdVar = new ohd(1, aym.t(this));
                    ohdVar.t();
                    rmr rmrVar = q2uVar.c;
                    int size = map2.size();
                    Collection collectionValues = map2.values();
                    if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = collectionValues.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((aey) it.next()) == aey.h && (i = i + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    obj2 = null;
                    if (map2.isEmpty()) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!rmrVar.a((String) entry.getKey(), (aey) entry.getValue()).contains(bx51Var)) {
                                i2++;
                            }
                        }
                    }
                    aey aeyVar = (aey) o7h.W0(o7h.p1(map2.values()));
                    switch (aeyVar == null ? -1 : r2u.a[aeyVar.ordinal()]) {
                        case 1:
                            i3 = 2;
                            break;
                        case 2:
                            i3 = 3;
                            break;
                        case 3:
                            i3 = 4;
                            break;
                        case 4:
                            i3 = 5;
                            break;
                        case 5:
                            i3 = 6;
                            break;
                        case 6:
                            i3 = 7;
                            break;
                        case 7:
                            i3 = 8;
                            break;
                        default:
                            i3 = 1;
                            break;
                    }
                    Resources resources = activity.getResources();
                    smc0 smc0VarN = k4p1.n();
                    if (i > 0) {
                        smc0VarN.add(resources.getQuantityString(2131820963, i, new Integer(i)));
                    } else {
                        smc0VarN.add(activity.getString(2131964148));
                    }
                    if (i2 > 0) {
                        smc0VarN.add(resources.getQuantityString(2131820972, i2, new Integer(i2)));
                    }
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    pbh0 pbh0Var = new pbh0(activity, 0);
                    switch (l1d.C(i3)) {
                        case 0:
                            i4 = 2131820964;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY0 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var = ((uh3) pbh0VarE).a;
                            qh3Var.f = strY0;
                            qh3Var.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var2 = ((uh3) pbh0VarC).a;
                                qh3Var2.k = qh3Var2.a.getText(2131964151);
                                qh3Var2.l = m2uVar;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate = pbh0VarE.create();
                            vh3VarCreate.show();
                            ohdVar.n(new n2u(vh3VarCreate, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 1:
                            i4 = 2131820970;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY1 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var3 = ((uh3) pbh0VarE).a;
                            qh3Var3.f = strY1;
                            qh3Var3.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC2 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar2 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var4 = ((uh3) pbh0VarC2).a;
                                qh3Var4.k = qh3Var4.a.getText(2131964151);
                                qh3Var4.l = m2uVar2;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate2 = pbh0VarE.create();
                            vh3VarCreate2.show();
                            ohdVar.n(new n2u(vh3VarCreate2, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 2:
                            i4 = 2131820969;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY2 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var5 = ((uh3) pbh0VarE).a;
                            qh3Var5.f = strY2;
                            qh3Var5.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC3 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar3 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var6 = ((uh3) pbh0VarC3).a;
                                qh3Var6.k = qh3Var6.a.getText(2131964151);
                                qh3Var6.l = m2uVar3;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate3 = pbh0VarE.create();
                            vh3VarCreate3.show();
                            ohdVar.n(new n2u(vh3VarCreate3, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 3:
                            i4 = 2131820966;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY3 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var7 = ((uh3) pbh0VarE).a;
                            qh3Var7.f = strY3;
                            qh3Var7.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC4 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar4 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var8 = ((uh3) pbh0VarC4).a;
                                qh3Var8.k = qh3Var8.a.getText(2131964151);
                                qh3Var8.l = m2uVar4;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate4 = pbh0VarE.create();
                            vh3VarCreate4.show();
                            ohdVar.n(new n2u(vh3VarCreate4, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 4:
                            i4 = 2131820971;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY4 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var9 = ((uh3) pbh0VarE).a;
                            qh3Var9.f = strY4;
                            qh3Var9.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC5 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar5 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var10 = ((uh3) pbh0VarC5).a;
                                qh3Var10.k = qh3Var10.a.getText(2131964151);
                                qh3Var10.l = m2uVar5;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate5 = pbh0VarE.create();
                            vh3VarCreate5.show();
                            ohdVar.n(new n2u(vh3VarCreate5, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 5:
                            i4 = 2131820965;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY5 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var11 = ((uh3) pbh0VarE).a;
                            qh3Var11.f = strY5;
                            qh3Var11.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC6 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar6 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var12 = ((uh3) pbh0VarC6).a;
                                qh3Var12.k = qh3Var12.a.getText(2131964151);
                                qh3Var12.l = m2uVar6;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate6 = pbh0VarE.create();
                            vh3VarCreate6.show();
                            ohdVar.n(new n2u(vh3VarCreate6, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 6:
                            i4 = 2131820967;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY6 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var13 = ((uh3) pbh0VarE).a;
                            qh3Var13.f = strY6;
                            qh3Var13.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC7 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar7 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var14 = ((uh3) pbh0VarC7).a;
                                qh3Var14.k = qh3Var14.a.getText(2131964151);
                                qh3Var14.l = m2uVar7;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate7 = pbh0VarE.create();
                            vh3VarCreate7.show();
                            ohdVar.n(new n2u(vh3VarCreate7, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        case 7:
                            i4 = 2131820968;
                            pbh0VarE = pbh0Var.e(resources.getQuantityString(i4, size, new Integer(size)));
                            String strY7 = o7h.y0(smc0VarK, "\n\n", (String) null, (String) null, (iu30) null, 62);
                            qh3 qh3Var15 = ((uh3) pbh0VarE).a;
                            qh3Var15.f = strY7;
                            qh3Var15.m = new vae(ohdVar, b2);
                            if (i > 0) {
                                pbh0 pbh0VarC8 = pbh0VarE.d(2131964150, new m2u(ohdVar, (byte) 0)).c(2131964149, new m2u(ohdVar, (byte) 1));
                                m2u m2uVar8 = new m2u(ohdVar, (byte) 2);
                                qh3 qh3Var16 = ((uh3) pbh0VarC8).a;
                                qh3Var16.k = qh3Var16.a.getText(2131964151);
                                qh3Var16.l = m2uVar8;
                            } else {
                                pbh0VarE.d(2131964152, new m2u(ohdVar, (byte) 3)).c(2131964151, new m2u(ohdVar, (byte) 4));
                            }
                            vh3 vh3VarCreate8 = pbh0VarE.create();
                            vh3VarCreate8.show();
                            ohdVar.n(new n2u(vh3VarCreate8, (byte) 0));
                            objR = ohdVar.r();
                            if (objR == d9nVar) {
                                return d9nVar;
                            }
                            break;
                        default:
                            eg.o();
                            return obj2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objR = obj;
                    obj2 = null;
                }
                int iOrdinal = ((g621) objR).ordinal();
                if (iOrdinal == 0) {
                    return new qq3(jn3Var.d, false);
                }
                if (iOrdinal == 1) {
                    return new qq3(jn3Var.d, true);
                }
                if (iOrdinal != 2) {
                    eg.o();
                }
                return obj2;
            case 22:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    dai1 dai1Var = (dai1) ((g931) this.d).c;
                    this.b = true;
                    objA = dai1Var.a(this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                return Boolean.valueOf(!((dma1) objA).a(ezl1.a).contains((String) obj3));
            case 23:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA4 = ((lz31) ((dc31) this.d).c).a((String) obj3, this);
                    return objA4 == d9nVar ? d9nVar : objA4;
                }
                if (z25) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                boolean z26 = this.b;
                try {
                    if (z26) {
                        if (z26) {
                            hm5.M(obj);
                            objJ = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    rsc0 rsc0Var = ((s041) this.d).a;
                    rxc0 rxc0Var = new rxc0((String) obj3);
                    this.b = true;
                    objJ = rsc0Var.j(rxc0Var, this);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    qxc0 qxc0Var = (qxc0) ((py21) objJ).c();
                    if (qxc0Var != null) {
                        return new Integer(qxc0Var.P0);
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                return null;
            case 25:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single singleI = ((gw70) ((dc31) this.d).b).f((String) obj3).i();
                this.b = true;
                Object objJ3 = fc11.j(singleI, this);
                return objJ3 == d9nVar ? d9nVar : objJ3;
            case 26:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pp31 pp31Var = ((x841) this.d).d;
                this.b = true;
                Object objC = pp31Var.c((String) obj3, this);
                return objC == d9nVar ? d9nVar : objC;
            case 27:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    CompletableSource completableSource = (CompletableSource) ((iwu) ((ek1) this.d).b).invoke((z460) obj3);
                    this.b = true;
                    return fc11.i(completableSource, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z29) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hce1 hce1Var = (hce1) ((ek1) this.d).c;
                Completable completableFlatMapCompletable = ((Single) ((na) hce1Var.c).invoke()).flatMapCompletable(new ptf1((kai1) obj3, hce1Var, (byte) 24));
                this.b = true;
                return fc11.i(completableFlatMapCompletable, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pp31 pp31Var2 = ((x841) this.d).d;
                this.b = true;
                Object objC2 = pp31Var2.c((String) obj3, this);
                return objC2 == d9nVar ? d9nVar : objC2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d821(t05 t05Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.c = t05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d821(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = obj2;
    }
}
