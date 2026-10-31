package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tfe0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe0(boolean z, ven0 ven0Var, lz20 lz20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.b = z;
        this.c = ven0Var;
        this.d = lz20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                tfe0 tfe0Var = new tfe0((ufe0) obj2, lnmVar, (byte) 0);
                tfe0Var.c = obj;
                return tfe0Var;
            case 1:
                return new tfe0(this.c, obj2, lnmVar, (byte) 1);
            case 2:
                return new tfe0(this.b, (ven0) this.c, (lz20) obj2, lnmVar);
            case 3:
                return new tfe0(this.c, obj2, lnmVar, (byte) 3);
            case 4:
                return new tfe0(this.c, obj2, lnmVar, (byte) 4);
            case 5:
                return new tfe0(this.c, obj2, lnmVar, (byte) 5);
            case 6:
                return new tfe0(this.c, obj2, lnmVar, (byte) 6);
            case 7:
                return new tfe0(this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new tfe0(this.c, obj2, lnmVar, (byte) 8);
            case 9:
                return new tfe0(this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new tfe0(this.c, obj2, lnmVar, (byte) 10);
            case 11:
                tfe0 tfe0Var2 = new tfe0((jyf0) obj2, lnmVar, (byte) 11);
                tfe0Var2.c = obj;
                return tfe0Var2;
            case 12:
                return new tfe0(this.c, obj2, lnmVar, (byte) 12);
            case 13:
                return new tfe0(this.c, obj2, lnmVar, (byte) 13);
            case 14:
                return new tfe0(this.c, obj2, lnmVar, (byte) 14);
            case 15:
                tfe0 tfe0Var3 = new tfe0((c3g0) obj2, lnmVar, (byte) 15);
                tfe0Var3.c = obj;
                return tfe0Var3;
            case 16:
                tfe0 tfe0Var4 = new tfe0((f3g0) obj2, lnmVar, (byte) 16);
                tfe0Var4.c = obj;
                return tfe0Var4;
            case 17:
                return new tfe0(this.c, obj2, lnmVar, (byte) 17);
            case 18:
                return new tfe0(this.c, obj2, lnmVar, (byte) 18);
            case 19:
                return new tfe0(this.c, obj2, lnmVar, (byte) 19);
            case 20:
                return new tfe0(this.c, obj2, lnmVar, (byte) 20);
            case 21:
                return new tfe0(this.c, obj2, lnmVar, (byte) 21);
            case 22:
                return new tfe0(this.c, obj2, lnmVar, (byte) 22);
            case 23:
                return new tfe0(this.c, obj2, lnmVar, (byte) 23);
            case 24:
                tfe0 tfe0Var5 = new tfe0((wp20) obj2, lnmVar, (byte) 24);
                tfe0Var5.c = obj;
                return tfe0Var5;
            case 25:
                tfe0 tfe0Var6 = new tfe0((pbn) obj2, lnmVar, (byte) 25);
                tfe0Var6.c = obj;
                return tfe0Var6;
            case 26:
                return new tfe0(this.c, obj2, lnmVar, (byte) 26);
            case 27:
                return new tfe0(this.c, obj2, lnmVar, (byte) 27);
            case 28:
                return new tfe0(this.c, obj2, lnmVar, (byte) 28);
            default:
                return new tfe0((n6i0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objY;
        Observable observableH;
        Object objK;
        bpb1 bpb1Var;
        Object objS;
        byte b = this.a;
        byte b2 = 19;
        byte b3 = 21;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        Object obj2 = this.d;
        String str = null;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean boolValueOf = Boolean.valueOf(((ufe0) obj2).a.a());
                this.c = null;
                this.b = true;
                return vr20Var.emit(boolValueOf, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    yfl yflVar = ((zhe0) this.c).a;
                    this.b = true;
                    objB = yflVar.b("permission_coordinator", (String) obj2, this, true);
                    if (objB == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = ((e331) obj).a;
                }
                return new e331(objB);
            case 2:
                hm5.M(obj);
                if (this.b) {
                    lz20.b((lz20) obj2);
                } else {
                    ((ven0) this.c).setValue("");
                }
                return d9nVar;
            case 3:
                fqe0 fqe0Var = (fqe0) obj2;
                npe0 npe0Var = (npe0) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (npe0Var.b) {
                        this.b = true;
                        if (fqe0Var.a(this) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                fqe0Var.b.h(npe0Var.a);
                return d9nVar;
            case 4:
                ope0 ope0Var = (ope0) obj2;
                fqe0 fqe0Var2 = (fqe0) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                swv0.c(fqe0Var2.c, fqe0Var2.a, new rwv0(exf.b, null, Uri.parse(ope0Var.a)));
                if (!ope0Var.b) {
                    return d9nVar;
                }
                this.b = true;
                return fqe0Var2.a(this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 5:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jo0 jo0Var = (jo0) ((rwa0) this.c).b;
                co0 co0Var = co0.i;
                String str2 = ((axg0) obj2).c;
                this.b = true;
                return jo0.a(jo0Var, co0Var, str2, 0L, (String) null, (String) null, (String) null, (String) null, this, 252) == d9nVar2 ? d9nVar2 : d9nVar;
            case 6:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var = (o95) this.c;
                boolean z7 = ((lye0) obj2).f;
                this.b = true;
                Object objB2 = o95.b(o95Var, new Float(0.0f), z7 ? irn1.o0(500, 0, (dlv) null, 6) : irn1.o0(0, 0, (dlv) null, 6), (Float) null, (iu30) null, this, 12);
                if (objB2 != d9nVar2) {
                    objB2 = d9nVar;
                }
                return objB2 == d9nVar2 ? d9nVar2 : d9nVar;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j2e0 j2e0Var = (j2e0) ((w9f0) this.c).g;
                String str3 = ((u181) ((v181) obj2)).a;
                this.b = true;
                return j2e0Var.l(str3, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vnr vnrVar = (vnr) ((upa0) this.c).b;
                String str4 = (String) obj2;
                this.b = true;
                qdf0 qdf0VarG = kcf0.g(vnrVar.a, str4, str4);
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                jdf0 jdf0Var = new jdf0(ohdVar, (byte) 3);
                jdf0 jdf0Var2 = new jdf0(ohdVar, (byte) 2);
                qdf0VarG.b(jdf0Var);
                qdf0VarG.a(jdf0Var2);
                ohdVar.n(new lb50(qdf0VarG, jdf0Var, jdf0Var2, (byte) 29));
                Object objR = ohdVar.r();
                if (objR != d9nVar2) {
                    objR = d9nVar;
                }
                return objR == d9nVar2 ? d9nVar2 : d9nVar;
            case 9:
                p410 p410Var = (p410) this.c;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    Intent intentC = iwe0.c((iwe0) p410Var.e, (Context) p410Var.b, (Intent) p410Var.g, Uri.parse((String) obj2), 112);
                    this.b = true;
                    return p410Var.x(intentC, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z10) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                p410 p410Var2 = (p410) this.c;
                this.b = true;
                ohd ohdVar2 = new ohd(1, aym.t(this));
                ohdVar2.t();
                ca40.d((ca40) p410Var2.d, nik1.m4.a, (tv80) obj2, (u0t0) null, new u4a0(ohdVar2, (byte) 1), 12);
                Object objR2 = ohdVar2.r();
                return objR2 == d9nVar2 ? d9nVar2 : objR2;
            case 11:
                jyf0 jyf0Var = (jyf0) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set = jyf0Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nh91) it.next()).getState());
                }
                mr20[] mr20VarArr = (mr20[]) arrayList.toArray(new mr20[0]);
                kge kgeVarD = hu20.d((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length));
                a8d0 a8d0Var = new a8d0(jyf0Var, c9nVar, (byte) 20);
                this.c = null;
                this.b = true;
                return kgeVarD.collect(a8d0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var2 = ((MainLayoutContentContainerView) this.c).P0;
                p5b0 p5b0Var = new p5b0((ozf0) obj2, (byte) 11);
                this.b = true;
                bpb1Var2.collect(new o010(p5b0Var, (byte) 25), this);
                return d9nVar2;
            case 13:
                v0g0 v0g0Var = (v0g0) obj2;
                p0g0 p0g0Var = (p0g0) this.c;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(p0g0Var.c.a.getValue(), v0g0Var)) {
                    return d9nVar;
                }
                mre0 mre0Var = p0g0Var.d;
                this.b = true;
                ((p0g0) mre0Var.b).b.emit(v0g0Var, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zob1 zob1Var = (zob1) ((l1g0) this.c).d.d.getValue();
                p5b0 p5b0Var2 = new p5b0((MainLayout) obj2, (byte) 12);
                this.b = true;
                if (zob1Var.collect(p5b0Var2, this) == d9nVar2) {
                    return d9nVar2;
                }
                jah.d();
                return null;
            case 15:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean boolValueOf2 = Boolean.valueOf(((c3g0) obj2).a.c());
                this.c = null;
                this.b = true;
                return vr20Var2.emit(boolValueOf2, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 16:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean boolValueOf3 = Boolean.valueOf(((f3g0) obj2).a.c());
                this.c = null;
                this.b = true;
                return vr20Var3.emit(boolValueOf3, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 17:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ivy0 ivy0Var = (ivy0) ((uw0) this.c).X;
                woa1 woa1Var = ((le20) obj2).c;
                str = woa1Var != null ? woa1Var.a : null;
                this.b = true;
                return ivy0Var.d(str, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 18:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV = z4p1.v(rwq.q(new tzf0((ryx) this.c, b3)), 1);
                mp0 mp0Var = new mp0((ven0) obj2, (byte) 11);
                this.b = true;
                Object objCollect = qt20VarV.collect(new ilf0(mp0Var, b2), this);
                if (objCollect != d9nVar2) {
                    objCollect = d9nVar;
                }
                return objCollect == d9nVar2 ? d9nVar2 : d9nVar;
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pkw0 pkw0Var = (pkw0) this.c;
                float f = pkw0Var.a;
                pxg1 pxg1VarO0 = irn1.o0(pkw0Var.b, 0, mlv.d, 2);
                lb7 lb7Var = new lb7((drr0) obj2, (byte) 2);
                this.b = true;
                return wwo1.t(f, 1.0f, pxg1VarO0, lb7Var, this, 4) == d9nVar2 ? d9nVar2 : d9nVar;
            case 20:
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((oih0) this.c).a((nih0) obj2, this);
                    return objA == d9nVar2 ? d9nVar2 : objA;
                }
                if (z21) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA2 = ((uih0) this.c).a((nih0) obj2, this);
                    return objA2 == d9nVar2 ? d9nVar2 : objA2;
                }
                if (z22) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ = rwq.q(new ppk((upb0) this.c, (byte) 6));
                mp0 mp0Var2 = new mp0((ven0) obj2, (byte) 12);
                this.b = true;
                return m441VarQ.collect(mp0Var2, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 23:
                jrh0 jrh0Var = (jrh0) obj2;
                boolean z24 = this.b;
                try {
                    if (!z24) {
                        hm5.M(obj);
                        k3i0 k3i0Var = ((xsh0) this.c).a;
                        p8i0 p8i0Var = jrh0Var.a;
                        int i = jrh0Var.b;
                        this.b = true;
                        objY = fn31.Y((q8n) k3i0Var.b, new v2b(k3i0Var, p8i0Var, i, (lnm) null, (byte) 8), this);
                        if (objY == d9nVar2) {
                            return d9nVar2;
                        }
                    } else {
                        if (!z24) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objY = obj;
                    }
                    List list = (List) objY;
                    return new xrh0(list, list.size() == 200, jrh0Var.b, jrh0Var.a);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    return urh0.a;
                }
            case 24:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v4e0 v4e0Var = new v4e0(obj2, (Object) vr20Var4, (lnm) str, b2);
                this.c = null;
                this.b = true;
                return smo1.s(v4e0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 25:
                vr20 vr20Var5 = (vr20) this.c;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var5.emit((pbn) obj2, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z26) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                at4 at4Var = (at4) ((kly0) this.c).get();
                if (at4Var.k != null) {
                    observableH = ((Observable) at4Var.m.getValue()).map(een.S0).distinctUntilChanged();
                    observableH.getClass();
                } else {
                    observableH = l1d.h(at4Var.f);
                }
                ezc ezcVarG = yoi1.g(observableH);
                p5b0 p5b0Var3 = new p5b0((dma1) obj2, (byte) 17);
                this.b = true;
                return ezcVarG.collect(p5b0Var3, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 27:
                z3i0 z3i0Var = (z3i0) this.c;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = ((FlowableMap) z3i0Var.d).t(Functions.a);
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableDistinctUntilChangedT);
                v4e0 v4e0Var2 = new v4e0((Object) z3i0Var, obj2, (lnm) str, b3);
                this.b = true;
                return l4p1.q(kgeVar, v4e0Var2, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 28:
                pvc0 pvc0Var = (pvc0) obj2;
                boolean z29 = this.b;
                try {
                    if (!z29) {
                        hm5.M(obj);
                        n6i0 n6i0Var = (n6i0) this.c;
                        o3r o3rVar = n6i0Var.U0;
                        String str5 = pvc0Var.c;
                        this.b = true;
                        objK = n6i0Var.k(o3rVar, str5, this);
                        if (objK == d9nVar2) {
                            return d9nVar2;
                        }
                    } else {
                        if (!z29) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objK = obj;
                    }
                    str = ((jo70) objK).a;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
                return new mmr0(pvc0Var.c, str != null ? str : "");
            default:
                n6i0 n6i0Var2 = (n6i0) obj2;
                boolean z30 = this.b;
                try {
                    if (!z30) {
                        hm5.M(obj);
                        n6i0Var2.j();
                        bpb1Var = n6i0Var2.O0;
                        this.c = bpb1Var;
                        this.b = true;
                        objS = smo1.s(new c6i0(n6i0Var2, null), this);
                        if (objS == d9nVar2) {
                            return d9nVar2;
                        }
                    } else {
                        if (!z30) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bpb1Var = (bpb1) this.c;
                        hm5.M(obj);
                        objS = obj;
                    }
                    bpb1Var.l(objS);
                    n6i0Var2.i();
                    return d9nVar;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    n6i0Var2.h(e4);
                    return d9nVar;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfe0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfe0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
