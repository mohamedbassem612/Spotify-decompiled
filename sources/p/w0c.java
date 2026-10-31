package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w0c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pob0 d;
    public final /* synthetic */ lbh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0c(boolean z, pob0 pob0Var, lbh lbhVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = pob0Var;
        this.e = lbhVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new w0c(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new w0c(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lbh lbhVar = this.e;
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        pob0 pob0Var = this.d;
        switch (b) {
            case 0:
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
                if (z || !pob0Var.d()) {
                    return rih1Var;
                }
                long j = pob0Var.c().d;
                if (Size.c(j, 0L)) {
                    return rih1Var;
                }
                n511 n511Var = lbhVar.k;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / pob0Var.c().c;
                float f = n511Var.a;
                float f2 = f - ((fIntBitsToFloat - (n511Var.c - f)) / 2.0f);
                float f3 = pob0Var.c().b;
                this.b = true;
                return pob0Var.f(f2, f3, this) == d9nVar ? d9nVar : rih1Var;
            default:
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
                if (!z) {
                    return rih1Var;
                }
                tz20 tz20Var = (tz20) pob0Var.c.getValue();
                if (!pob0Var.d() || !(tz20Var instanceof qz20)) {
                    return rih1Var;
                }
                int i = ((qz20) tz20Var).a;
                this.b = true;
                return pob0Var.g(i, lbhVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
