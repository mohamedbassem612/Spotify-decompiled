package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cuc0 extends a8d1 implements xu30 {
    public /* synthetic */ mmr0 a;
    public /* synthetic */ mmr0 b;
    public final /* synthetic */ haa0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuc0(haa0 haa0Var, String str, lnm lnmVar) {
        super(3, lnmVar);
        this.c = haa0Var;
        this.d = str;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cuc0 cuc0Var = new cuc0(this.c, this.d, (lnm) obj3);
        cuc0Var.a = (mmr0) obj;
        cuc0Var.b = (mmr0) obj2;
        return cuc0Var.invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        mmr0 mmr0Var = this.a;
        mmr0 mmr0Var2 = this.b;
        hm5.M(obj);
        boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
        Set set = (Set) mmr0Var.b;
        boolean zBooleanValue2 = ((Boolean) mmr0Var2.a).booleanValue();
        Set set2 = (Set) mmr0Var2.b;
        if (zBooleanValue || zBooleanValue2) {
            return haa0.b(set, set2);
        }
        xdc0.d1.invoke(this.d);
        return w7x.a;
    }
}
