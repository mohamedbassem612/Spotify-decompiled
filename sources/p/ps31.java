package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ps31 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nma0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps31(nma0 nma0Var, byte b) {
        super(0);
        this.a = b;
        this.b = nma0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nma0 nma0Var = this.b;
        switch (b) {
            case 0:
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + nma0Var + ". Arguments can only be generated from concrete classes or objects.");
            default:
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                tka0 tka0VarA = ltn1.A(nma0Var.getDescriptor());
                throw new IllegalArgumentException(l1d.n(tka0VarA != null ? tka0VarA.r() : null, ". Routes can only be generated from concrete classes or objects.", sb));
        }
    }
}
