package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9u extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hp80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9u(hp80 hp80Var, byte b) {
        super(1);
        this.a = b;
        this.b = hp80Var;
    }

    public final Object invoke(Object obj) {
        String strP;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        hp80 hp80Var = this.b;
        switch (b) {
            case 0:
                p3m0 p3m0Var = (p3m0) obj;
                strP = hp80Var != null ? oap1.p(hp80Var) : null;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", strP != null ? strP : "")), p3m0Var.a, r6h1.c, System.currentTimeMillis());
            default:
                p3m0 p3m0Var2 = (p3m0) obj;
                strP = hp80Var != null ? oap1.p(hp80Var) : null;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", strP != null ? strP : "")), p3m0Var2.a, r6h1.c, System.currentTimeMillis());
        }
    }
}
