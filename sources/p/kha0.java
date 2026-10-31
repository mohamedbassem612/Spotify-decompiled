package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kha0 extends z031 implements xu30 {
    public boolean b;
    public /* synthetic */ bcr c;
    public final /* synthetic */ mha0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kha0(mha0 mha0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.d = mha0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kha0 kha0Var = new kha0(this.d, (lnm) obj3);
        kha0Var.c = (bcr) obj;
        return kha0Var.invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object invokeSuspend(Object obj) throws SerializationException {
        mha0 mha0Var = this.d;
        y6 y6Var = mha0Var.a;
        bcr bcrVar = this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            byte B = y6Var.B();
            if (B == 1) {
                return mha0Var.d(true);
            }
            if (B == 0) {
                return mha0Var.d(false);
            }
            if (B != 6) {
                if (B == 8) {
                    return mha0Var.b();
                }
                y6.v(y6Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.c = null;
            this.b = true;
            obj = mha0Var.c(bcrVar, this);
            d9n d9nVar = d9n.a;
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
        return (ega0) obj;
    }
}
