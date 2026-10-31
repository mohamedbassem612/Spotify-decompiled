package p;

import android.content.res.Resources;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.corex.readalongtranscript.proto.ReadAlongTranscript;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class du2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public boolean d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(boolean z, boolean z2, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.b = z;
        this.d = z2;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.c = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                du2 du2Var = new du2(this.d, lnmVar);
                du2Var.c = obj;
                return du2Var;
            case 1:
                du2 du2Var2 = new du2((ix7) this.e, (String) this.f, this.d, lnmVar);
                du2Var2.c = obj;
                return du2Var2;
            case 2:
                du2 du2Var3 = new du2((ezc) this.e, lnmVar, this.d, (kpc) this.f);
                du2Var3.c = obj;
                return du2Var3;
            case 3:
                return new du2(this.d, this.e, this.f, this.c, lnmVar, (byte) 3);
            case 4:
                return new du2(this.d, (o95) this.e, this.c, (fe5) this.f, lnmVar);
            case 5:
                return new du2(this.e, this.f, this.c, lnmVar, (byte) 5);
            case 6:
                return new du2(this.e, this.d, this.f, this.c, lnmVar, (byte) 6);
            case 7:
                return new du2(this.b, this.d, (ven0) this.e, (ven0) this.f, (ven0) this.c, lnmVar);
            case 8:
                return new du2(this.e, this.f, this.c, this.d, lnmVar, (byte) 8);
            case 9:
                return new du2(this.e, this.f, this.c, this.d, lnmVar, (byte) 9);
            case 10:
                du2 du2Var4 = new du2(this.e, this.f, this.c, lnmVar, (byte) 10);
                du2Var4.d = ((Boolean) obj).booleanValue();
                return du2Var4;
            case 11:
                return new du2(this.e, (String) this.f, this.d, (Serializable) this.c, lnmVar, (byte) 11);
            case 12:
                du2 du2Var5 = new du2((cdz) this.e, (dxy) this.f, this.b, this.d, lnmVar);
                du2Var5.c = obj;
                return du2Var5;
            case 13:
                return new du2(this.e, (String) this.f, this.d, (Serializable) this.c, lnmVar, (byte) 13);
            case 14:
                return new du2(this.e, (String) this.f, this.d, (Serializable) this.c, lnmVar, (byte) 14);
            case 15:
                return new du2(this.e, this.f, this.c, this.d, lnmVar, (byte) 15);
            case 16:
                return new du2(this.e, this.f, this.c, this.d, lnmVar, (byte) 16);
            case 17:
                return new du2(this.d, this.e, this.f, this.c, lnmVar, (byte) 17);
            case 18:
                return new du2(this.e, this.d, this.f, this.c, lnmVar, (byte) 18);
            case 19:
                return new du2(this.e, this.d, this.f, this.c, lnmVar, (byte) 19);
            case 20:
                return new du2(this.f, this.d, this.c, lnmVar, (byte) 20);
            case 21:
                return new du2(this.d, this.e, this.f, this.c, lnmVar, (byte) 21);
            case 22:
                return new du2(this.e, this.f, this.c, this.d, lnmVar, (byte) 22);
            case 23:
                return new du2(this.e, this.f, this.c, this.d, lnmVar, (byte) 23);
            case 24:
                return new du2(this.e, this.d, this.f, this.c, lnmVar, (byte) 24);
            case 25:
                return new du2(this.f, this.d, this.c, lnmVar, (byte) 25);
            default:
                return new du2(this.d, this.e, this.f, this.c, lnmVar, (byte) 26);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((du2) create((nsw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((du2) create((ssw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((du2) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((du2) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 19:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((du2) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        o811 o811Var;
        o811 o811Var2;
        nq2 nq2Var;
        String string;
        boolean z;
        Object objO;
        Object objA;
        Object objB;
        Object objK;
        bpb1 bpb1Var;
        Object objD;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                nsw0 nsw0Var = (nsw0) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (!this.d) {
                        return rih1Var;
                    }
                    o811Var = new o811();
                    o811Var2 = new o811();
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o811Var2 = (o811) this.f;
                    o811Var = (o811) this.e;
                    hm5.M(obj);
                }
                do {
                    nq2Var = new nq2(o811Var, o811Var2, nsw0Var, (byte) 1);
                    this.c = nsw0Var;
                    this.e = o811Var;
                    this.f = o811Var2;
                    this.b = true;
                } while (k5p1.x(nq2Var, this) != d9nVar);
                return d9nVar;
            case 1:
                String str = (String) this.f;
                boolean z3 = this.d;
                ix7 ix7Var = (ix7) this.e;
                Resources resources = (Resources) ix7Var.c;
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    ic9 ic9Var = (ic9) ix7Var.d;
                    i8h1 i8h1Var = (i8h1) ((jly0) ic9Var.c).get();
                    oi oiVar = new oi(i8h1Var, str, z3, (w6h1) ic9Var.b);
                    y6b1 y6b1Var = new y6b1(str, false);
                    v6b1 v6b1Var = v6b1.d;
                    v6b1 v6b1Var2 = y6b1Var.c;
                    if (v6b1Var2 == v6b1Var && z3) {
                        string = resources.getString(2131958076);
                    } else if (v6b1Var2 != v6b1Var || z3) {
                        v6b1 v6b1Var3 = v6b1.t;
                        if (v6b1Var2 == v6b1Var3 && z3) {
                            string = resources.getString(2131958078);
                        } else if (v6b1Var2 != v6b1Var3 || z3) {
                            hhg1.o(v6b1Var2, "Unsupported entity type for blocking: ");
                        } else {
                            string = resources.getString(2131958079);
                        }
                    } else {
                        string = resources.getString(2131958077);
                    }
                    String str2 = string;
                    str2.getClass();
                    i8h1Var.f(((wqk0) oiVar.d).e(), (Set) null);
                    ((kt91) ix7Var.b).k(new er91((fs91) null, str2, (Integer) null, resources.getString(2131958075), (Integer) null, new cg1(oiVar, ssw0Var, (byte) 15), (cvr) null, (xq91) null, false));
                    ssw0Var.l(nr91.a);
                    vv8 vv8Var = new vv8(ix7Var, (byte) 20);
                    this.c = null;
                    this.b = true;
                    return jch0.s(ssw0Var, vv8Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                vr20 vr20Var = (vr20) this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVar = (ezc) this.e;
                heb hebVar = new heb(vr20Var, this.d, (kpc) this.f, (byte) 2);
                this.c = null;
                this.b = true;
                return ezcVar.collect(hebVar, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (this.d) {
                    return rih1Var;
                }
                o95 o95Var = (o95) this.e;
                Float f = (Float) this.f;
                fe5 fe5Var = (fe5) this.c;
                this.b = true;
                return o95.b(o95Var, f, fe5Var, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (this.d) {
                    return rih1Var;
                }
                o95 o95Var2 = (o95) this.e;
                Object obj2 = this.c;
                fe5 fe5Var2 = (fe5) this.f;
                this.b = true;
                return o95.b(o95Var2, obj2, fe5Var2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 5:
                nqs nqsVar = (nqs) this.f;
                boolean z8 = this.d;
                if (!z8) {
                    hm5.M(obj);
                    boolean zK = ((qor) this.e).g.k(nqsVar.i, (Object) null);
                    kub1 kub1Var = (kub1) this.c;
                    this.b = zK;
                    this.d = true;
                    if (nqsVar.e(kub1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                    z = zK;
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.b;
                    hm5.M(obj);
                }
                if (z) {
                    return rih1Var;
                }
                Logger.d("Handle dismiss ignored - state has changed", new Object[0]);
                return rih1Var;
            case 6:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarC = ((idn0) this.e).c();
                heb hebVar2 = new heb(this.d, (Function0) this.f, (ven0) this.c);
                this.b = true;
                return mr20VarC.collect(hebVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                ven0 ven0Var = (ven0) this.f;
                ven0 ven0Var2 = (ven0) this.e;
                hm5.M(obj);
                if (this.b) {
                    ven0Var2.setValue(Boolean.TRUE);
                    ven0Var.setValue(Boolean.FALSE);
                } else if (!((Boolean) ven0Var.getValue()).booleanValue() && (((Boolean) ven0Var2.getValue()).booleanValue() || this.d)) {
                    Boolean bool = Boolean.FALSE;
                    ven0Var2.setValue(bool);
                    ((ven0) this.c).setValue(bool);
                }
                return rih1Var;
            case 8:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qns0 qns0Var = (qns0) this.e;
                List list = (List) this.f;
                String str3 = (String) this.c;
                boolean z11 = this.d;
                this.b = true;
                Object objA2 = qns0Var.a(str3, list, this, z11);
                return objA2 == d9nVar ? d9nVar : objA2;
            case 9:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xhv0 xhv0Var = (xhv0) this.e;
                o0i o0iVar = (o0i) this.f;
                String str4 = ((vhv0) this.c).a;
                boolean z13 = this.d;
                this.b = true;
                return xhv0Var.e(o0iVar, str4, z13, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z14 = this.d;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (!z14 || ((Boolean) ((ven0) this.f).getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    hj6 hj6Var = new hj6((ven0) this.c, (lnm) null, (byte) 19);
                    this.d = z14;
                    this.b = true;
                    objO = rc2.O(10000L, hj6Var, this);
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objO = obj;
                }
                ((iu30) this.e).invoke(((Boolean) objO) != null ? u760.d : u760.b);
                return rih1Var;
            case 11:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                u6y0 u6y0Var = (u6y0) this.e;
                String str5 = (String) this.f;
                boolean z17 = this.d;
                tv80 tv80Var = (tv80) this.c;
                this.b = true;
                return u6y0.n(u6y0Var, str5, z17, tv80Var, false, this, 24) == d9nVar ? d9nVar : rih1Var;
            case 12:
                hm5.M(obj);
                String str6 = ((cdz) this.e).f;
                k370 k370Var = new k370();
                k370Var.f((l370) null, str6);
                k370 k370VarG = k370Var.b().g();
                boolean z18 = this.b;
                boolean z19 = this.d;
                if (z18) {
                    k370VarG.a("excludeCC", "true");
                }
                if (z19) {
                    k370VarG.a("excludeChapters", "true");
                }
                l370 l370VarB = k370VarG.b();
                ne neVar = new ne((byte) 9);
                neVar.t();
                neVar.a = l370VarB;
                ry21 ry21VarE = ((w5b1) ((dxy) this.f).c).d.c().a(new ln21(neVar)).e();
                uz21 uz21Var = ry21VarE.g;
                if (ry21VarE.Q0) {
                    return ReadAlongTranscript.w(uz21Var.c());
                }
                try {
                    uz21Var.close();
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 13:
                boolean z20 = this.d;
                String str7 = (String) this.c;
                w701 w701Var = (w701) this.e;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    qa01 qa01Var = w701Var.b;
                    String str8 = (String) this.f;
                    this.b = true;
                    objA = qa01Var.a(str8, z20, false, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                sy21 sy21Var = (sy21) objA;
                ReadAlongTranscript readAlongTranscript = (ReadAlongTranscript) sy21Var.b;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0 || readAlongTranscript == null) {
                    throw new IOException("Failed to fetch transcripts for episode " + str7 + ": " + ry21Var.d);
                }
                k8g1 k8g1VarA = w701Var.c.a(str7, readAlongTranscript);
                d390 d390Var = w701Var.a;
                d390Var.getClass();
                d390Var.a.d(str7 + z20, k8g1VarA);
                return k8g1VarA;
            case 14:
                String str9 = (String) this.f;
                mzr0 mzr0Var = (mzr0) this.e;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    mjv mjvVar = (mjv) mzr0Var.f;
                    this.b = true;
                    objB = mjvVar.b(str9, this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = ((e331) obj).a;
                }
                boolean z23 = this.d;
                String str10 = (String) this.c;
                if (!(objB instanceof m231)) {
                    List list2 = (List) objB;
                    if (list2.isEmpty()) {
                        mzr0Var.n(str9, z23, true);
                    } else {
                        ((i8h1) ((wgb) mzr0Var.g).a.get()).f(wgb.a().e(), (Set) null);
                        dg30 dg30Var = (dg30) mzr0Var.a;
                        pbh0 pbh0Var = new pbh0(dg30Var, 0);
                        ((uh3) pbh0Var).a.f = dg30Var.getString(2131954354, "“" + str10 + "”");
                        pbh0 pbh0VarC = pbh0Var.d(2131954353, new u621(mzr0Var, str9, z23, list2)).c(2131954351, new t621(b2, mzr0Var, str9, z23));
                        oad oadVar = new oad(mzr0Var, (byte) 27);
                        qh3 qh3Var = ((uh3) pbh0VarC).a;
                        qh3Var.k = qh3Var.a.getText(2131954421);
                        qh3Var.l = oadVar;
                        ((uh3) pbh0VarC).a.m = new vae(mzr0Var, (byte) 11);
                        pbh0VarC.create().show();
                    }
                }
                if (e331.a(objB) == null) {
                    return rih1Var;
                }
                mzr0Var.w();
                return rih1Var;
            case 15:
                mzr0 mzr0Var2 = (mzr0) this.e;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    List list3 = (List) this.f;
                    this.b = true;
                    objK = mzr0Var2.k(list3, this);
                    if (objK == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                if (((Boolean) objK).booleanValue()) {
                    mzr0Var2.n((String) this.c, this.d, false);
                    return rih1Var;
                }
                mzr0Var2.w();
                return rih1Var;
            case 16:
                jkr0 jkr0Var = (jkr0) this.e;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n811 n811Var = new n811();
                n811Var.a = jkr0Var.o();
                m441 m441VarQ = rwq.q(new of(jkr0Var, (byte) 11));
                ln1 ln1Var = new ln1(this.f, (Serializable) n811Var, this.c, this.d, (byte) 4);
                this.b = true;
                return m441VarQ.collect(ln1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    if (!this.d) {
                        return rih1Var;
                    }
                    qz71 qz71Var = new qz71((o95) this.f, (o95) this.c, null, (byte) 0);
                    this.b = true;
                    if (smo1.s(qz71Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Function0 function0 = (Function0) this.e;
                if (function0 == null) {
                    return rih1Var;
                }
                function0.invoke();
                return rih1Var;
            case 18:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    o95 o95Var3 = (o95) this.e;
                    Float f2 = new Float(this.d ? 1.0f : 0.0f);
                    n8b1 n8b1Var = (n8b1) this.f;
                    this.b = true;
                    if (o95.b(o95Var3, f2, n8b1Var, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) this.c).invoke();
                return rih1Var;
            case 19:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    o95 o95Var4 = (o95) this.e;
                    Float f3 = new Float(this.d ? 1.0f : 0.0f);
                    pxg1 pxg1Var = (pxg1) this.f;
                    this.b = true;
                    if (o95.b(o95Var4, f3, pxg1Var, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) this.c).invoke();
                return rih1Var;
            case 20:
                ven0 ven0Var3 = (ven0) this.f;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    r9w0 r9w0Var = (r9w0) ven0Var3.getValue();
                    if (r9w0Var == null) {
                        return rih1Var;
                    }
                    boolean z30 = this.d;
                    idn0 idn0Var = (idn0) this.c;
                    s9w0 s9w0Var = z30 ? new s9w0(r9w0Var) : new q9w0(r9w0Var);
                    if (idn0Var != null) {
                        this.e = ven0Var3;
                        this.b = true;
                        if (idn0Var.b(s9w0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var3 = (ven0) this.e;
                    hm5.M(obj);
                }
                ven0Var3.setValue((Object) null);
                return rih1Var;
            case 21:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!this.d || ((Boolean) ((tob1) this.c).getValue()).booleanValue() || ((rk41) this.e).a) {
                    return rih1Var;
                }
                iu30 iu30Var = (iu30) this.f;
                this.b = true;
                return iu30Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.c;
                bpb1 bpb1Var2 = (bpb1) this.f;
                boolean z32 = this.b;
                if (z32) {
                    if (z32) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vi11 vi11Var = (vi11) this.e;
                uoa uoaVar = (uoa) vi11Var.e;
                if (uoaVar == null) {
                    boolean z33 = this.d;
                    this.b = true;
                    return vi11Var.B(bpb1Var2, videoSurfaceView, z33, this) == d9nVar ? d9nVar : rih1Var;
                }
                uoaVar.d(videoSurfaceView);
                bpb1Var2.m((Object) null, jzt0.a);
                return rih1Var;
            case 23:
                boolean z34 = this.b;
                if (z34) {
                    if (z34) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pck1 pck1Var = (pck1) this.e;
                String str11 = (String) this.f;
                t45 t45Var = (t45) this.c;
                boolean z35 = this.d;
                this.b = true;
                b880 b880Var = (x780) pck1Var.c.get();
                Object objH = c921.H(b880Var.g, new z780(b880Var, t45Var, str11, z35, (lnm) null), this);
                return objH == d9nVar ? d9nVar : objH;
            case 24:
                jkr0 jkr0Var2 = (jkr0) this.e;
                boolean z36 = this.b;
                if (z36) {
                    if (z36) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ2 = rwq.q(new of(jkr0Var2, (byte) 14));
                ln1 ln1Var2 = new ln1(this.d, jkr0Var2, (c380) this.f, (vjr0) this.c);
                this.b = true;
                return m441VarQ2.collect(ln1Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z37 = this.b;
                if (!z37) {
                    hm5.M(obj);
                    znl1 znl1Var = (znl1) this.f;
                    bpb1Var = znl1Var.X;
                    boolean z38 = this.d;
                    String str12 = (String) this.c;
                    this.e = bpb1Var;
                    this.b = true;
                    objD = znl1Var.d(str12, this, z38);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z37) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bpb1 bpb1Var3 = (bpb1) this.e;
                    hm5.M(obj);
                    bpb1Var = bpb1Var3;
                    objD = obj;
                }
                bpb1Var.l(objD);
                return rih1Var;
            default:
                boolean z39 = this.b;
                if (z39) {
                    if (z39) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fjk fjkVar = new fjk(this.d, (String) this.e, (o7m1) this.f, (String) this.c, (lnm) null, (byte) 6);
                this.b = true;
                Object objO2 = rc2.O(5000L, fjkVar, this);
                return objO2 == d9nVar ? d9nVar : objO2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(Object obj, Object obj2, Object obj3, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(Object obj, String str, boolean z, Serializable serializable, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = str;
        this.d = z;
        this.c = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(Object obj, boolean z, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.d = z;
        this.f = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(Object obj, boolean z, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.d = z;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(ix7 ix7Var, String str, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = ix7Var;
        this.f = str;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(ezc ezcVar, lnm lnmVar, boolean z, kpc kpcVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.e = ezcVar;
        this.d = z;
        this.f = kpcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(cdz cdzVar, dxy dxyVar, boolean z, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.e = cdzVar;
        this.f = dxyVar;
        this.b = z;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(boolean z, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = z;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(boolean z, o95 o95Var, Object obj, fe5 fe5Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = z;
        this.e = o95Var;
        this.c = obj;
        this.f = fe5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
    }
}
