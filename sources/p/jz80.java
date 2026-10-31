package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jz80 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz80(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, boolean z4, boolean z5, boolean z6) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = z4;
        this.i = z5;
        this.t = z6;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            nz80.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null, this.h, this.i, this.t, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
