package p;

import com.google.android.recaptcha.internal.zzhm;
import com.spotify.wrapped.v1.proto.RiveAnimationInput;
import io.reactivex.rxjava3.core.Completable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q4m1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4m1(boolean z, Function0 function0, iu30 iu30Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.b = z;
        this.c = function0;
        this.d = iu30Var;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                q4m1 q4m1Var = new q4m1((ima1) this.d, (bma1) obj2, lnmVar, (byte) 0);
                q4m1Var.c = obj;
                return q4m1Var;
            case 1:
                q4m1 q4m1Var2 = new q4m1((suh1) obj2, lnmVar);
                q4m1Var2.c = obj;
                return q4m1Var2;
            case 2:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 2);
            case 3:
                return new q4m1(this.b, (Function0) this.c, (iu30) this.d, (ven0) obj2, lnmVar);
            case 4:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 4);
            case 5:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 5);
            case 6:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 6);
            case 7:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 7);
            case 8:
                q4m1 q4m1Var3 = new q4m1((ArrayList) this.d, (cik1) obj2, lnmVar, (byte) 8);
                q4m1Var3.c = obj;
                return q4m1Var3;
            case 9:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 9);
            case 10:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 10);
            case 11:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 11);
            case 12:
                q4m1 q4m1Var4 = new q4m1((sln1) this.d, (p8o1) obj2, lnmVar, (byte) 12);
                q4m1Var4.c = obj;
                return q4m1Var4;
            case 13:
                q4m1 q4m1Var5 = new q4m1((ieo1) this.d, (String) obj2, lnmVar, (byte) 13);
                q4m1Var5.c = obj;
                return q4m1Var5;
            case 14:
                q4m1 q4m1Var6 = new q4m1((ieo1) this.d, (cnn1) obj2, lnmVar, (byte) 14);
                q4m1Var6.c = obj;
                return q4m1Var6;
            case 15:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 15);
            default:
                return new q4m1(this.c, this.d, obj2, lnmVar, (byte) 16);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invokeSuspend(Object obj) throws Exception {
        xab1 xab1VarT;
        Object objU;
        rvo1 rvo1Var;
        Object objQ;
        Object m231Var;
        Object objD;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set setA = ((ima1) this.d).a((bma1) obj2);
                this.c = null;
                this.b = true;
                return vr20Var.emit(setA, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 1:
                suh1 suh1Var = (suh1) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    xab1VarT = fn31.T(c9nVar, (o8n) null, 4, new fkj1(suh1Var, (lnm) null, (byte) 23), 1);
                    Completable completableE = ((hj91) suh1Var.f).e((String) suh1Var.d, rp91.a, (tv80) null);
                    this.c = null;
                    this.d = xab1VarT;
                    this.b = true;
                    if (fc11.i(completableE, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xab1VarT = (xab1) this.d;
                    hm5.M(obj);
                }
                xab1VarT.d((CancellationException) null);
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    if (xpn1.H(this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((l8m1) this.c).c.a(new ugm1(((c8m1) this.d).c, ((Boolean) ((tob1) obj2).getValue()).booleanValue()));
                return rih1Var;
            case 3:
                ven0 ven0Var = (ven0) obj2;
                iu30 iu30Var = (iu30) this.d;
                hm5.M(obj);
                boolean z4 = this.b;
                if (z4) {
                    ((Function0) this.c).invoke();
                    iu30Var.invoke(Boolean.TRUE);
                } else if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    iu30Var.invoke(Boolean.FALSE);
                }
                ven0Var.setValue(Boolean.valueOf(z4));
                return rih1Var;
            case 4:
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
                l4g l4gVar = (l4g) this.c;
                p3g p3gVar = (p3g) this.d;
                boolean zBooleanValue = ((Boolean) ((Function0) obj2).invoke()).booleanValue();
                this.b = true;
                return l4gVar.a(p3gVar, zBooleanValue, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    iu30 iu30Var2 = (iu30) this.c;
                    this.b = true;
                    if (iu30Var2.invoke(this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (!((pe) this.d).b(7)) {
                    return rih1Var;
                }
                ((ven0) obj2).setValue(Boolean.TRUE);
                return rih1Var;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    ven0 ven0Var2 = (ven0) this.c;
                    bpb1 bpb1Var = cem1.i;
                    if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    m441 m441VarQ = rwq.q(new l5m1((tob1) this.d, (byte) 4));
                    o37 o37Var = new o37(2, null, (byte) 3);
                    this.b = true;
                    if (b5p1.j(m441VarQ, o37Var, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                bpb1 bpb1Var2 = cem1.i;
                ((ven0) obj2).setValue(Boolean.TRUE);
                return rih1Var;
            case 7:
                RiveAnimationInput riveAnimationInput = (RiveAnimationInput) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ne neVar = new ne((byte) 9);
                neVar.e0(riveAnimationInput.n().getImageUrl());
                neVar.t();
                ln21 ln21Var = new ln21(neVar);
                q8n q8nVar = (q8n) this.d;
                mxj1 mxj1Var = new mxj1(riveAnimationInput, (cxc) obj2, ln21Var, (lnm) null, (byte) 13);
                this.b = true;
                Object objY = fn31.Y(q8nVar, mxj1Var, this);
                return objY == rih1Var2 ? rih1Var2 : objY;
            case 8:
                c9n c9nVar2 = (c9n) this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    ArrayList arrayList = (ArrayList) this.d;
                    cik1 cik1Var = (cik1) obj2;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(fn31.q(c9nVar2, (o8n) null, 0, new xfm1(cik1Var, (String) it.next(), (lnm) null, (byte) 1), 3));
                    }
                    this.c = null;
                    this.b = true;
                    objU = o1p1.u(arrayList2, this);
                    if (objU == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return sqg0.T(o7h.o0((Iterable) objU));
            case 9:
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
                l3g1 l3g1Var = new l3g1((String) this.c, (String) this.d, (ghm1) obj2, false, (lnm) null, (byte) 13);
                this.b = true;
                Object objO = rc2.O(1000L, l3g1Var, this);
                return objO == rih1Var2 ? rih1Var2 : objO;
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
                upm1 upm1Var = (upm1) this.c;
                xyc0 xyc0Var = upm1Var.b;
                String str = upm1Var.d;
                List list = (List) this.d;
                String str2 = upm1Var.c.a;
                tv80 tv80Var = (tv80) obj2;
                zxc0 zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
                this.b = true;
                Object objD2 = xyc0Var.d(str, list, str2, "spotify:assisted-curation", zxc0Var, this);
                return objD2 == rih1Var2 ? rih1Var2 : objD2;
            case 11:
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
                m441 m441VarQ2 = rwq.q(new wt41((xtb0) this.c, (byte) 16));
                wtl1 wtl1Var = new wtl1((g2n1) this.d, (iu30) obj2, (byte) 13);
                this.b = true;
                return m441VarQ2.collect(wtl1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 12:
                boolean z13 = this.b;
                hm5.M(obj);
                if (z13) {
                    return obj;
                }
                l3g1 l3g1Var2 = new l3g1((sln1) this.d, (zwo1) this.c, (p8o1) obj2, (lnm) null, (byte) 17);
                this.b = true;
                Object objS = smo1.s(l3g1Var2, this);
                return objS == rih1Var2 ? rih1Var2 : objS;
            case 13:
                String str3 = (String) obj2;
                ieo1 ieo1Var = (ieo1) this.d;
                try {
                    if (this.b) {
                        rvo1Var = (rvo1) this.c;
                        hm5.M(obj);
                        objQ = obj;
                    } else {
                        hm5.M(obj);
                        rvo1Var = (rvo1) this.c;
                        ieo1Var.f.put(new Integer(212), str3);
                        List list2 = ieo1Var.g;
                        if (list2 == null) {
                            list2 = null;
                        }
                        s2t s2tVarF = ieo1Var.f(new Long(((Number) list2.get(1)).longValue()), Optional.empty());
                        this.c = rvo1Var;
                        this.b = true;
                        objQ = s2tVarF.Q(this);
                        if (objQ == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                    Object obj3 = ((e331) objQ).a;
                    hm5.M(obj3);
                    byte[] bArr = (byte[]) obj3;
                    inn1 inn1VarY = inn1.y(ain1.x(0, bArr, bArr.length));
                    ieo1Var.i(rvo1Var.a);
                    return new e331(ieo1.j(str3, inn1VarY));
                } catch (Exception e) {
                    zzhm zzhmVar = e instanceof zzhm ? e : null;
                    if (zzhmVar == null) {
                        throw new zzhm(tgo1.c, ij81.M1, e.getMessage(), (Exception) null);
                    }
                    throw zzhmVar;
                }
            case 14:
                boolean z14 = this.b;
                hm5.M(obj);
                if (z14) {
                    return rih1Var;
                }
                zwo1 zwo1Var = (zwo1) this.c;
                ieo1 ieo1Var2 = (ieo1) this.d;
                o8n o8nVar = ieo1Var2.p.a().a;
                l3g1 l3g1Var3 = new l3g1(zwo1Var, ieo1Var2, (cnn1) obj2, (lnm) null, (byte) 21);
                this.b = true;
                return fn31.Y(o8nVar, l3g1Var3, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 15:
                try {
                    if (this.b) {
                        hm5.M(obj);
                        objD = obj;
                    } else {
                        hm5.M(obj);
                        zwo1 zwo1Var2 = (zwo1) this.c;
                        qag1 qag1Var = new qag1((ieo1) this.d, (yln1) obj2, zwo1Var2, (lnm) null);
                        this.b = true;
                        objD = zwo1Var2.d(76, (Integer) null, qag1Var, this);
                        if (objD == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                    m231Var = ((e331) objD).a;
                    break;
                } catch (Exception e2) {
                    m231Var = new m231(e2);
                }
                return new e331(m231Var);
            default:
                try {
                    if (this.b) {
                        hm5.M(obj);
                    } else {
                        hm5.M(obj);
                        iu30 iu30Var3 = (iu30) ((zxl1) this.c).c;
                        this.b = true;
                        if (iu30Var3.invoke(this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    }
                    break;
                } catch (Exception e3) {
                    if ((e3 instanceof CancellationException) && !(e3 instanceof TimeoutCancellationException)) {
                        iu30 iu30Var4 = (iu30) this.d;
                        if (iu30Var4 != null) {
                            iu30Var4.invoke(e3);
                        }
                        throw e3;
                    }
                    ((iu30) obj2).invoke(e3);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4m1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4m1(suh1 suh1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = suh1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4m1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
