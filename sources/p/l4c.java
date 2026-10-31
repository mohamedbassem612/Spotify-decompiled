package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l4c extends a8d1 implements xu30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4c(boolean z, float f, lnm lnmVar) {
        super(3, lnmVar);
        this.c = z;
        this.d = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        float fFloatValue = ((Number) obj2).floatValue();
        l4c l4cVar = new l4c(this.c, this.d, (lnm) obj3);
        l4cVar.a = zBooleanValue;
        l4cVar.b = fFloatValue;
        return l4cVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        float f = this.b;
        hm5.M(obj);
        boolean z2 = this.c;
        boolean z3 = false;
        float f2 = this.d;
        if (!z2 ? !(!z || f < f2) : f < f2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
