package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vm11 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lik1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm11(lik1 lik1Var, byte b) {
        super(4);
        this.a = b;
        this.b = lik1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        lik1 lik1Var = this.b;
        switch (b) {
            case 0:
                return new kxk0(Integer.valueOf(((Number) obj3).intValue()), lik1Var.a, (r6h1) obj4);
            case 1:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new h6l0(new wqk0(yon1.O3().c, lik1Var.a, (r6h1) obj4));
            case 2:
                return new d3m0(Integer.valueOf(((Number) obj3).intValue()), ((nuj1) obj).b, lik1Var.a, (r6h1) obj4);
            default:
                return new d3m0(Integer.valueOf(((Number) obj3).intValue()), "video-preview-carousel-search", lik1Var.a, (r6h1) obj4);
        }
    }
}
