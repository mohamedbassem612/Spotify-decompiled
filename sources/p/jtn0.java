package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jtn0 extends hab0 implements bv30 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ bw91 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtn0(Set set, float f, ven0 ven0Var, bw91 bw91Var) {
        super(5);
        this.a = set;
        this.b = f;
        this.c = ven0Var;
        this.d = bw91Var;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        otn0 otn0Var = (otn0) obj;
        btn0 btn0Var = (btn0) obj2;
        rtn0 rtn0Var = (rtn0) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean zContains = this.a.contains(btn0Var.c);
        boolean z = true;
        boolean z2 = !ukm0.a(this.c);
        float f = zContains ? this.b : 0.0f;
        x340 x340Var2 = x340Var;
        boolean zH = x340Var2.h(zContains);
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var2.g(btn0Var)) && (iIntValue & 48) != 32) {
            z = false;
        }
        boolean z3 = z | zH;
        Object objT = x340Var2.T();
        if (z3 || objT == fkj0.X) {
            objT = new vm1(zContains, this.d, btn0Var, (byte) 16);
            x340Var2.s0(objT);
        }
        rtn0Var.a(otn0Var, ern1.n(f, (Function0) objT, z2), x340Var2, iIntValue & 14);
        return rih1.a;
    }
}
