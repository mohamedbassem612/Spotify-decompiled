package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oz6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lik1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz6(lik1 lik1Var, byte b) {
        super(1);
        this.a = b;
        this.b = lik1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        lik1 lik1Var = this.b;
        switch (b) {
            case 0:
                return new dz6(((im6) obj).a, lik1Var.a);
            case 1:
                a0l0 a0l0Var = (a0l0) obj;
                String str = lik1Var.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), a0l0Var.a, r6h1.c, System.currentTimeMillis());
            case 2:
                b0l0 b0l0Var = (b0l0) obj;
                String str2 = lik1Var.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), b0l0Var.a, r6h1.c, System.currentTimeMillis());
            case 3:
                c0l0 c0l0Var = (c0l0) obj;
                String str3 = lik1Var.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), c0l0Var.a, r6h1.c, System.currentTimeMillis());
            case 4:
                return new r9a1(((w8a1) obj).a, lik1Var.a);
            default:
                return new gcm(((uv11) obj).a, lik1Var.a, (ucm) null, (Function0) null, 28);
        }
    }
}
