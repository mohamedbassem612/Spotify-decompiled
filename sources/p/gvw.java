package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gvw extends hab0 implements vu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvw(String str, int i, String str2, boolean z, iu30 iu30Var, Function0 function0, boolean z2, boolean z3, boolean z4, String str3, Function0 function1, int i2) {
        super(2);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = iu30Var;
        this.f = function0;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.t = str3;
        this.X = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ago1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
        return rih1.a;
    }
}
