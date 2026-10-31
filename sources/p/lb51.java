package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lb51 implements jsw {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ fqg0 e;

    public lb51(Object obj, Object obj2, iu30 iu30Var, iu30 iu30Var2, fqg0 fqg0Var) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = obj;
        this.d = obj2;
        this.e = fqg0Var;
    }

    public final void a(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-2071656700);
        boolean zBooleanValue = ((Boolean) this.a.invoke(obj)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.b.invoke(obj)).booleanValue();
        int i2 = (i & 112) ^ 48;
        boolean z = true;
        boolean z2 = (i2 > 32 && x340Var.g(iu30Var)) || (i & 48) == 32;
        Object obj2 = this.c;
        boolean zI = z2 | x340Var.i(obj2);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new c3n((byte) 1, obj2, iu30Var);
            x340Var.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if ((i2 <= 32 || !x340Var.g(iu30Var)) && (i & 48) != 32) {
            z = false;
        }
        Object obj3 = this.d;
        boolean zI2 = x340Var.i(obj3) | z;
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new c3n((byte) 2, obj3, iu30Var);
            x340Var.s0(objT2);
        }
        n3o1.g(zBooleanValue, function0, zBooleanValue2, (Function0) objT2, (qim0) null, apo.r(-47721649, new pby0((Object) this.e, obj, iu30Var, (Object) kswVar, (byte) 23), x340Var), x340Var, 196608, 16);
        x340Var.r(false);
    }
}
