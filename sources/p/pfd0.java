package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pfd0 extends a8d1 implements dv30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Set d;
    public /* synthetic */ int e;
    public final /* synthetic */ ip31 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd0(ip31 ip31Var, boolean z, String str, lnm lnmVar) {
        super(6, lnmVar);
        this.f = ip31Var;
        this.g = z;
        this.h = str;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Number) obj5).intValue();
        boolean z = this.g;
        String str = this.h;
        pfd0 pfd0Var = new pfd0(this.f, z, str, (lnm) obj6);
        pfd0Var.a = zBooleanValue;
        pfd0Var.b = zBooleanValue2;
        pfd0Var.c = zBooleanValue3;
        pfd0Var.d = (Set) obj4;
        pfd0Var.e = iIntValue;
        return pfd0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        Set set = this.d;
        int i = this.e;
        hm5.M(obj);
        int iE = ((add) this.f.e).a.E();
        return Boolean.valueOf(this.g && !z && z2 && !z3 && !set.contains(this.h) && (iE <= 0 || i < iE));
    }
}
