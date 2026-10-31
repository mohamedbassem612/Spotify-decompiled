package p;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ujr0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vjr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujr0(boolean z, vjr0 vjr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.b = z;
        this.c = vjr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ujr0(this.c, lnmVar, (byte) 0);
            case 1:
                return new ujr0(this.c, lnmVar, (byte) 1);
            default:
                return new ujr0(this.b, this.c, lnmVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        vjr0 vjr0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = vjr0Var.d;
                tjr0 tjr0Var = new tjr0(vjr0Var, (byte) 0);
                this.b = true;
                dt71Var.collect(tjr0Var, this);
                return d9nVar;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var2 = vjr0Var.e;
                tjr0 tjr0Var2 = new tjr0(vjr0Var, (byte) 1);
                this.b = true;
                dt71Var2.collect(tjr0Var2, this);
                return d9nVar;
            default:
                hm5.M(obj);
                if (!this.b) {
                    Iterator it = vjr0Var.f.values().iterator();
                    while (it.hasNext()) {
                        ((xm90) it.next()).a(n1i.a);
                    }
                    vjr0Var.g = null;
                    vjr0Var.h = null;
                    vjr0Var.b.a.l((Object) null);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujr0(vjr0 vjr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vjr0Var;
    }
}
