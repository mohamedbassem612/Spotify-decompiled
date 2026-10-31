package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m5x0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j0a1 d;
    public final /* synthetic */ l4x0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5x0(j0a1 j0a1Var, l4x0 l4x0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = j0a1Var;
        this.e = l4x0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        l4x0 l4x0Var = this.e;
        j0a1 j0a1Var = this.d;
        switch (b) {
            case 0:
                m5x0 m5x0Var = new m5x0(j0a1Var, l4x0Var, lnmVar, (byte) 0);
                m5x0Var.c = obj;
                return m5x0Var;
            case 1:
                m5x0 m5x0Var2 = new m5x0(j0a1Var, l4x0Var, lnmVar, (byte) 1);
                m5x0Var2.c = obj;
                return m5x0Var2;
            default:
                m5x0 m5x0Var3 = new m5x0(j0a1Var, l4x0Var, lnmVar, (byte) 2);
                m5x0Var3.c = obj;
                return m5x0Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean m231Var;
        Boolean m231Var2;
        Boolean m231Var3;
        byte b = this.a;
        l4x0 l4x0Var = this.e;
        j0a1 j0a1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        String str = l4x0Var.d;
                        String str2 = l4x0Var.e;
                        this.c = null;
                        this.b = true;
                        obj = j0a1Var.f(str, str2, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = (Boolean) obj;
                    m231Var.getClass();
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null || !(thA instanceof CancellationException)) {
                    return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
                }
                throw thA;
            case 1:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        String str3 = l4x0Var.d;
                        String str4 = l4x0Var.e;
                        this.c = null;
                        this.b = true;
                        obj = j0a1Var.e(str3, str4, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var2 = (Boolean) obj;
                    m231Var2.getClass();
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var2);
                if (thA2 == null || !(thA2 instanceof CancellationException)) {
                    return m231Var2 instanceof m231 ? Boolean.FALSE : m231Var2;
                }
                throw thA2;
            default:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        String str5 = l4x0Var.d;
                        String str6 = l4x0Var.e;
                        this.c = null;
                        this.b = true;
                        obj = j0a1Var.g(str5, str6, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var3 = (Boolean) obj;
                    m231Var3.getClass();
                    break;
                } catch (Throwable th3) {
                    m231Var3 = new m231(th3);
                }
                Throwable thA3 = e331.a(m231Var3);
                if (thA3 == null || !(thA3 instanceof CancellationException)) {
                    return m231Var3 instanceof m231 ? Boolean.FALSE : m231Var3;
                }
                throw thA3;
        }
    }
}
