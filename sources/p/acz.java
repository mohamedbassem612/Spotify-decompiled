package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class acz extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ yzu c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acz(yzu yzuVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = yzuVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        yzu yzuVar = this.c;
        switch (b) {
            case 0:
                return new acz(yzuVar, str, lnmVar, (byte) 0);
            case 1:
                return new acz(yzuVar, str, lnmVar, (byte) 1);
            default:
                return new acz(yzuVar, str, lnmVar, (byte) 2);
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
        byte b = this.a;
        String str = this.d;
        yzu yzuVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objH = yzuVar.H(str, this);
                    return objH == d9nVar ? d9nVar : objH;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        qmg qmgVar = (qmg) yzuVar.c;
                        this.b = true;
                        obj = qmgVar.a(str, this);
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
                    m231Var = (Boolean) obj;
                    m231Var.getClass();
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null || (thA instanceof TimeoutCancellationException) || !(thA instanceof CancellationException)) {
                    return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
                }
                throw thA;
            default:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        o2b1 o2b1Var = (o2b1) yzuVar.d;
                        this.b = true;
                        obj = o2b1Var.h(str, this);
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
                    m231Var2 = (Boolean) obj;
                    m231Var2.getClass();
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var2);
                if (thA2 == null || (thA2 instanceof TimeoutCancellationException) || !(thA2 instanceof CancellationException)) {
                    return m231Var2 instanceof m231 ? Boolean.FALSE : m231Var2;
                }
                throw thA2;
        }
    }
}
