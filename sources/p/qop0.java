package p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qop0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qop0(res resVar, byte b) {
        super(4);
        this.a = b;
        this.b = resVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new huk0(new nqk0(new iuk0(yon1.n0().c, ((lik1) resVar.d).a)));
            default:
                lik1 lik1Var = (lik1) resVar.d;
                y6h1 y6h1Var = ((huk0) obj).a;
                int iOrdinal = ((nop0) obj4).ordinal();
                b7x b7xVar = b7x.a;
                if (iOrdinal == 0) {
                    String str = lik1Var.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal == 1) {
                    String str2 = lik1Var.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str2 != null ? str2 : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
        }
    }
}
