package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x9 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ bt41 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(bt41 bt41Var, float f, float f2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = bt41Var;
        this.c = f;
        this.d = f2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new x9(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.c)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
            this.a = true;
            Object objB = ws41.b(this.b.r1, jFloatToRawIntBits, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
