package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class do60 extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ un60 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xtb0 e;
    public final /* synthetic */ wat f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do60(un60 un60Var, int i, boolean z, xtb0 xtb0Var, wat watVar, boolean z2, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.b = un60Var;
        this.c = i;
        this.d = z;
        this.e = xtb0Var;
        this.f = watVar;
        this.g = z2;
        this.h = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new do60(this.b, this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        un60 un60Var = this.b;
        int iIndexOf = un60Var != null ? this.h.indexOf(un60Var) : 0;
        if (iIndexOf >= 0) {
            int i = this.c;
            if (i >= 0 && i <= iIndexOf) {
                iIndexOf++;
            }
            boolean z = this.d;
            xtb0 xtb0Var = this.e;
            d9n d9nVar = d9n.a;
            if (!z || iIndexOf == 0) {
                int i2 = iIndexOf - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                this.a = (byte) 2;
                df41 df41Var = xtb0.y;
                if (xtb0Var.f(i2, 0, this) == d9nVar) {
                    return d9nVar;
                }
            } else {
                float fX0 = this.f.X0(32.0f);
                this.a = (byte) 1;
                if (lro1.k0(xtb0Var, iIndexOf, fX0, this.g, this) == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }
}
