package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e1e0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wmy c;
    public final /* synthetic */ ahj1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1e0(wmy wmyVar, ahj1 ahj1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wmyVar;
        this.d = ahj1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ahj1 ahj1Var = this.d;
        wmy wmyVar = this.c;
        switch (b) {
            case 0:
                return new e1e0(wmyVar, ahj1Var, lnmVar, (byte) 0);
            default:
                return new e1e0(wmyVar, ahj1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jl71 jl71Var = (jl71) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(jl71Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        String m231Var;
        byte b = this.a;
        ahj1 ahj1Var = this.d;
        wmy wmyVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (z) {
                        if (z) {
                            hm5.M(obj);
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    u271 u271Var = (u271) wmyVar.d;
                    String str = ahj1Var.b;
                    uz70 uz70Var = uz70.a;
                    this.b = true;
                    obj = u271Var.b(str, uz70Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    m231Var = (String) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (!(m231Var instanceof m231)) {
                    return m231Var;
                }
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wh41 wh41Var = (wh41) wmyVar.a;
                String str2 = ahj1Var.a;
                String str3 = ahj1Var.b;
                this.b = true;
                Object objG = wh41Var.g(str2, str3, this);
                return objG == d9nVar ? d9nVar : objG;
        }
    }
}
