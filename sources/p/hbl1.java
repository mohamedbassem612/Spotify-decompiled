package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hbl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbl1(o0i o0iVar, byte b) {
        super(1);
        this.a = b;
        this.b = o0iVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        o0i o0iVar = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).k(0, oap1.p(o0iVar.e), 0);
            case 1:
                return ((p3m0) obj).h(200, oap1.p(o0iVar.e));
            case 2:
                return ((p3m0) obj).h(100, oap1.p(o0iVar.e));
            case 3:
                p3m0 p3m0Var = (p3m0) obj;
                String strP = oap1.p(o0iVar.e);
                return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", strP != null ? strP : "")), p3m0Var.a, r6h1.c, System.currentTimeMillis());
            default:
                p3m0 p3m0Var2 = (p3m0) obj;
                String strP2 = oap1.p(o0iVar.e);
                return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", strP2 != null ? strP2 : "")), p3m0Var2.a, r6h1.c, System.currentTimeMillis());
        }
    }
}
