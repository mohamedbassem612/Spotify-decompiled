package p;

import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ye01 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mk81 b;
    public final /* synthetic */ Consumer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye01(mk81 mk81Var, Consumer consumer, byte b) {
        super(0);
        this.a = b;
        this.b = mk81Var;
        this.c = consumer;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.c;
        b7x b7xVar = b7x.a;
        mk81 mk81Var = this.b;
        switch (b) {
            case 0:
                String str = nik1.b7.a;
                uba ubaVar = mk81Var.a;
                x6h1 x6h1VarC = mk81Var.b.a.c();
                x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                uba ubaVar2 = ubaVar;
                ubaVar2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                consumer.accept(n100.a);
                break;
            default:
                uba ubaVar3 = mk81Var.a;
                x6h1 x6h1VarC2 = mk81Var.b.a.c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                uba ubaVar4 = ubaVar3;
                ubaVar4.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                consumer.accept(q000.a);
                break;
        }
        return rih1Var;
    }
}
