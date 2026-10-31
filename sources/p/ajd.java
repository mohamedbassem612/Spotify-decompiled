package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ajd extends a8d1 implements zu30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ajd ajdVar = new ajd(4, (lnm) obj4);
        ajdVar.a = zBooleanValue;
        ajdVar.b = zBooleanValue2;
        ajdVar.c = zBooleanValue3;
        return ajdVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        hm5.M(obj);
        return yah0.m(z && !z2 && z3);
    }
}
