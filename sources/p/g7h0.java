package p;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g7h0 extends hab0 implements xu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ ven0 P0;
    public final /* synthetic */ Function0 Q0;
    public final /* synthetic */ boolean R0;
    public final /* synthetic */ Uri S0;
    public final /* synthetic */ boolean T0;
    public final /* synthetic */ boolean U0;
    public final /* synthetic */ boolean V0;
    public final /* synthetic */ Function0 W0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Function0 X0;
    public final /* synthetic */ String Y;
    public final /* synthetic */ ven0 Y0;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ ven0 Z0;
    public final /* synthetic */ n7h0 a;
    public final /* synthetic */ ven0 a1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ zh80 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7h0(n7h0 n7h0Var, iu30 iu30Var, boolean z, boolean z2, boolean z3, zh80 zh80Var, boolean z4, ven0 ven0Var, String str, boolean z5, boolean z6, String str2, boolean z7, boolean z8, boolean z9, boolean z10, ven0 ven0Var2, Function0 function0, boolean z11, Uri uri, boolean z12, boolean z13, boolean z14, Function0 function1, Function0 function2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5) {
        super(3);
        this.a = n7h0Var;
        this.b = iu30Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = zh80Var;
        this.g = z4;
        this.h = ven0Var;
        this.i = str;
        this.t = z5;
        this.X = z6;
        this.Y = str2;
        this.Z = z8;
        this.N0 = z9;
        this.O0 = z10;
        this.P0 = ven0Var2;
        this.Q0 = function0;
        this.R0 = z11;
        this.S0 = uri;
        this.T0 = z12;
        this.U0 = z13;
        this.V0 = z14;
        this.W0 = function1;
        this.X0 = function2;
        this.Y0 = ven0Var3;
        this.Z0 = ven0Var4;
        this.a1 = ven0Var5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        ven0 ven0Var = this.h;
        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
        b0k b0kVar = (x340) ((b0k) obj2);
        boolean zI = b0kVar.i(ven0Var);
        Object objT = b0kVar.T();
        if (zI || objT == m4cVar) {
            objT = new c470(ven0Var, (byte) 20);
            b0kVar.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        n7h0 n7h0Var = this.a;
        boolean z = true;
        boolean z2 = !n7h0Var.n;
        j2e0 j2e0Var = n7h0Var.i;
        ven0 ven0Var2 = this.P0;
        boolean zBooleanValue2 = ((Boolean) ven0Var2.getValue()).booleanValue();
        boolean zI2 = b0kVar.i(ven0Var2);
        Object objT2 = b0kVar.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new c470(ven0Var2, (byte) 21);
            b0kVar.s0(objT2);
        }
        Function0 function1 = (Function0) objT2;
        lg01 lg01Var = (lg01) this.Y0.getValue();
        if (!n7h0.b(this.Z0) || (!this.V0 && ((Boolean) this.a1.getValue()).booleanValue())) {
            z = false;
        }
        n7h0Var.a(this.b, this.c, this.d, this.e, this.f, this.g, zBooleanValue, function0, z2, this.i, this.t, this.X, j2e0Var, this.Y, this.Z, this.N0, this.O0, zBooleanValue2, function1, this.Q0, this.R0, this.S0, this.T0, lg01Var, this.U0, z, this.W0, this.X0, null, b0kVar, 0);
        return rih1.a;
    }
}
