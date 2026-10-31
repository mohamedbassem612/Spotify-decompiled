package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hng0 extends wfa0 {
    public final /* synthetic */ byte d;
    public final j661 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hng0(nma0 nma0Var, nma0 nma0Var2, byte b) {
        super(nma0Var, nma0Var2);
        this.d = b;
        switch (b) {
            case 1:
                super(nma0Var, nma0Var2);
                h661[] h661VarArr = new h661[0];
                if (ihc1.y0("kotlin.Pair")) {
                    hhg1.n("Blank serial names are prohibited");
                    throw null;
                }
                neg negVar = new neg("kotlin.Pair");
                neg.b(negVar, "first", nma0Var.getDescriptor(), 12);
                neg.b(negVar, "second", nma0Var2.getDescriptor(), 12);
                this.e = new j661("kotlin.Pair", uic1.h, negVar.c.size(), f46.Q0(h661VarArr), negVar);
                return;
            default:
                this.e = omo1.k("kotlin.collections.Map.Entry", vic1.h, new h661[0], new gub0(nma0Var, nma0Var2, (byte) 2));
                return;
        }
    }

    public final Object a(Object obj) {
        switch (this.d) {
            case 0:
                return ((Map.Entry) obj).getKey();
            default:
                return ((mmr0) obj).a;
        }
    }

    public final Object b(Object obj) {
        switch (this.d) {
            case 0:
                return ((Map.Entry) obj).getValue();
            default:
                return ((mmr0) obj).b;
        }
    }

    public final Object d(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return new gng0(obj, obj2);
            default:
                return new mmr0(obj, obj2);
        }
    }

    public final h661 getDescriptor() {
        byte b = this.d;
        return this.e;
    }
}
