package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qpa0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ boolean c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpa0(uo5 uo5Var, rpt0 rpt0Var, boolean z, rpt0 rpt0Var2, v8v v8vVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = uo5Var;
        this.e = rpt0Var;
        this.c = z;
        this.f = rpt0Var2;
        this.g = v8vVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new qpa0((uo5) this.d, (rpt0) this.e, this.c, (rpt0) obj3, (v8v) obj2, lnmVar);
            default:
                qpa0 qpa0Var = new qpa0((n4d1) obj3, (vu30) obj2, this.c, lnmVar);
                qpa0Var.e = obj;
                return qpa0Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((sl81) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        n4d1 n4d1Var;
        byte b = this.a;
        boolean z = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                rpt0 rpt0Var = (rpt0) this.e;
                rpt0 rpt0Var2 = (rpt0) obj3;
                uo5 uo5Var = (uo5) this.d;
                bjx bjxVar = (bjx) uo5Var.d;
                boolean z2 = this.b;
                try {
                    try {
                        if (!z2) {
                            hm5.M(obj);
                            ezc ezcVarG = yoi1.g(((fxu) uo5Var.b).c(z ? 2 : 1, rpt0Var.a()));
                            e8m e8mVar = new e8m(uo5Var, rpt0Var2, (v8v) obj2, (byte) 5);
                            this.b = true;
                            if (ezcVarG.collect(e8mVar, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (!z2) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                        break;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        Logger.e(e2, "Key fetch failed for " + rpt0Var.a(), new Object[0]);
                        if (!bjxVar.W(rpt0Var2).equals(dqt0.a)) {
                            bjxVar.C(rpt0Var2);
                        }
                    }
                    bjxVar.R(rpt0Var2);
                    return rih1.a;
                } catch (Throwable th) {
                    bjxVar.R(rpt0Var2);
                    throw th;
                }
            default:
                sl81 sl81Var = (sl81) this.e;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        n4d1Var = (n4d1) this.d;
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                n4d1 n4d1Var2 = (n4d1) obj3;
                this.e = null;
                this.d = n4d1Var2;
                this.b = true;
                Object objInvoke = ((vu30) obj2).invoke(sl81Var, this);
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
                obj = objInvoke;
                n4d1Var = n4d1Var2;
                if (!((Boolean) obj).booleanValue()) {
                    n4d1Var = null;
                }
                if (n4d1Var != null) {
                    return new om81(n4d1Var, z);
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpa0(n4d1 n4d1Var, vu30 vu30Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.f = n4d1Var;
        this.g = vu30Var;
        this.c = z;
    }
}
