package p;

import android.content.Intent;
import io.reactivex.rxjava3.core.CompletableSource;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ms4 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms4(w1l w1lVar, snr snrVar, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 3;
        this.d = w1lVar;
        this.e = snrVar;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ms4 ms4Var = new ms4((lnm) obj3, obj4, (byte) 0);
                ms4Var.c = (vr20) obj;
                ms4Var.d = obj2;
                return ms4Var.invokeSuspend(rih1Var);
            case 1:
                ms4 ms4Var2 = new ms4((lnm) obj3, obj4, (byte) 1);
                ms4Var2.c = (vr20) obj;
                ms4Var2.d = obj2;
                return ms4Var2.invokeSuspend(rih1Var);
            case 2:
                ms4 ms4Var3 = new ms4((lnm) obj3, obj4, (byte) 2);
                ms4Var3.c = (vr20) obj;
                ms4Var3.d = obj2;
                return ms4Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ms4 ms4Var4 = new ms4((w1l) this.d, (snr) obj4, (lnm) obj3);
                ms4Var4.c = (c2l) obj;
                ms4Var4.b = zBooleanValue;
                return ms4Var4.invokeSuspend(rih1Var);
            case 4:
                ms4 ms4Var5 = new ms4(obj4, (lnm) obj3, (byte) 4);
                ms4Var5.c = (k5a1) obj;
                ms4Var5.d = (l0l) obj2;
                return ms4Var5.invokeSuspend(rih1Var);
            case 5:
                ms4 ms4Var6 = new ms4(obj4, (lnm) obj3, (byte) 5);
                ms4Var6.c = (Intent) obj;
                ms4Var6.d = (th61) obj2;
                return ms4Var6.invokeSuspend(rih1Var);
            case 6:
                ms4 ms4Var7 = new ms4(obj4, (lnm) obj3, (byte) 6);
                ms4Var7.c = (Intent) obj;
                ms4Var7.d = (th61) obj2;
                return ms4Var7.invokeSuspend(rih1Var);
            case 7:
                ms4 ms4Var8 = new ms4(obj4, (lnm) obj3, (byte) 7);
                ms4Var8.c = (vr20) obj;
                ms4Var8.d = (Throwable) obj2;
                return ms4Var8.invokeSuspend(rih1Var);
            case 8:
                ms4 ms4Var9 = new ms4(obj4, (lnm) obj3, (byte) 8);
                ms4Var9.d = obj;
                ms4Var9.c = obj2;
                return ms4Var9.invokeSuspend(rih1Var);
            default:
                ms4 ms4Var10 = new ms4((lnm) obj3, obj4, (byte) 9);
                ms4Var10.c = (vr20) obj;
                ms4Var10.d = obj2;
                return ms4Var10.invokeSuspend(rih1Var);
        }
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        pp90 pp90VarH;
        mr20 mr20VarM;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                Object obj3 = this.d;
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
                jge jgeVarA = ((ys4) obj2).v.a((String) obj3);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, jgeVarA, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                qz4 qz4Var = (qz4) obj2;
                vr20 vr20Var2 = (vr20) this.c;
                Object obj4 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                huz huzVarM = ((Boolean) obj4).booleanValue() ? h4p1.m(new swz0(dho0.a)) : hu20.e(qz4Var.a.s().a(), new qt((lnm) null, qz4Var, (byte) 9));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVarM, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                Object obj5 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y1r y1rVar = (y1r) obj5;
                huz huzVarM2 = y1rVar instanceof x1r ? h4p1.m(y1rVar) : k2q.c((k2q) obj2);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, huzVarM2, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                c2l c2lVar = (c2l) this.c;
                boolean z4 = this.b;
                hm5.M(obj);
                w1l w1lVar = (w1l) this.d;
                return new x1l(c2lVar, z4, w1lVar.a(), w1lVar.c(), w1lVar.d(), w1lVar.b(), snr.e((snr) obj2).c(), 0);
            case 4:
                cp31 cp31Var = (cp31) obj2;
                k5a1 k5a1Var = (k5a1) this.c;
                l0l l0lVar = (l0l) this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return (pp90) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (l0lVar != null) {
                    zfr zfrVarP = cp31.p(cp31Var);
                    k5a1Var.getClass();
                    pp90VarH = zfrVarP.h(k5a1Var, l0lVar);
                } else {
                    pp90VarH = null;
                }
                if (pp90VarH != null) {
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    obj = cp31.o(cp31Var, pp90VarH, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    return (pp90) obj;
                }
                return null;
            case 5:
                Intent intent = (Intent) this.c;
                th61 th61Var = (th61) this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str = th61Var.a;
                this.c = null;
                this.d = null;
                this.b = true;
                irn0 irn0VarD = qv3.d(str, intent);
                return irn0VarD == d9nVar ? d9nVar : irn0VarD;
            case 6:
                wf2 wf2Var = (wf2) obj2;
                Intent intent2 = (Intent) this.c;
                th61 th61Var2 = (th61) this.d;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    mr20 mr20Var = wf2.c(wf2Var).a;
                    this.c = intent2;
                    this.d = th61Var2;
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (!((ibk0) obj).b()) {
                    return crn0.a;
                }
                Set set = s4b1.f;
                return new hrn0(qyj0.class, wf2.b(wf2Var, intent2, uic.x(intent2.getDataString()), th61Var2.a), new c6w0(1, true, (hd5) null, 12));
            case 7:
                vr20 vr20Var4 = (vr20) this.c;
                Throwable th = (Throwable) this.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((vr01) obj2).f("Emitting empty playlist decorations. Error: " + th.getMessage());
                bbr bbrVar = new bbr(b7x.a);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var4.emit(bbrVar, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                Object obj6 = this.d;
                Object obj7 = this.c;
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
                CompletableSource completableSource = (CompletableSource) ((vu30) obj2).invoke(obj6, obj7);
                this.d = null;
                this.c = null;
                this.b = true;
                return fc11.i(completableSource, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var5 = (vr20) this.c;
                Object obj8 = this.d;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    cn41 cn41Var = (cn41) obj8;
                    if (cn41Var instanceof an41) {
                        mr20VarM = (mr20) ((iu30) obj2).invoke(((an41) cn41Var).a.b.getValue());
                    } else {
                        bn41 bn41Var = bn41.a;
                        if (u890.j(cn41Var, bn41Var)) {
                            mr20VarM = h4p1.m(bn41Var);
                        } else {
                            eg.o();
                        }
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var5, mr20VarM, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms4(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms4(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
