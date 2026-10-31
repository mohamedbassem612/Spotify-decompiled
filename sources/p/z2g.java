package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2g extends a8d1 implements xu30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2g(int i, lnm lnmVar) {
        super(3, lnmVar);
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        z2g z2gVar = new z2g(this.c, (lnm) obj3);
        z2gVar.a = zBooleanValue;
        z2gVar.b = zBooleanValue2;
        return z2gVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        hm5.M(obj);
        return new y2g(this.c, z, z2);
    }
}
