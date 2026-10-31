package p;

import android.os.Parcelable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ccr0 extends hab0 implements Function0 {
    public final /* synthetic */ ebr0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ dcr0 c;
    public final /* synthetic */ ecr0 d;
    public final /* synthetic */ Parcelable e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccr0(ebr0 ebr0Var, Function0 function0, dcr0 dcr0Var, ecr0 ecr0Var, Parcelable parcelable, Object obj) {
        super(0);
        this.a = ebr0Var;
        this.b = function0;
        this.c = dcr0Var;
        this.d = ecr0Var;
        this.e = parcelable;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ebr0 ebr0Var = this.a;
        kyv0 kyv0Var = ebr0Var instanceof kyv0 ? (kyv0) ebr0Var : null;
        Parcelable parcelable = this.e;
        Object obj = this.f;
        mvn0 mvn0Var = new mvn0(ebr0Var, parcelable, obj, (byte) 15);
        mvn0 mvn0Var2 = kyv0Var != null ? new mvn0(kyv0Var, parcelable, obj, (byte) 16) : null;
        dcr0 dcr0Var = this.c;
        iac0 iac0Var = dcr0Var.e;
        iac0 iac0Var2 = dcr0Var.f;
        ecr0 ecr0Var = this.d;
        return new s7r0(mvn0Var, mvn0Var2, this.b, iac0Var, iac0Var2, dcr0Var, ecr0Var.a, (p1r0) ecr0Var.b.invoke(), ecr0Var.c, ecr0Var.d);
    }
}
