package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tac1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ptj b;
    public final /* synthetic */ qy7 c;
    public final /* synthetic */ r2a1 d;

    public /* synthetic */ tac1(ptj ptjVar, qy7 qy7Var, r2a1 r2a1Var, byte b) {
        this.a = b;
        this.b = ptjVar;
        this.c = qy7Var;
        this.d = r2a1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        r2a1 r2a1Var = this.d;
        z6m0 z6m0Var = this.c;
        ptj ptjVar = this.b;
        switch (b) {
            case 0:
                ptjVar.invoke(e5c1.a);
                zhq0 zhq0Var = z6m0Var.f;
                if (zhq0Var == null) {
                    u890.C("playCommandHandler");
                    throw null;
                }
                zhq0Var.o(lgt0.a);
                ((i8h1) r2a1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", "")), ((h4l0) r2a1Var.c).b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            default:
                ptjVar.invoke(h5c1.a);
                zhq0 zhq0Var2 = z6m0Var.f;
                if (zhq0Var2 == null) {
                    u890.C("playCommandHandler");
                    throw null;
                }
                zhq0Var2.o(ngt0.a);
                ((i8h1) r2a1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", "")), ((h4l0) r2a1Var.c).b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
        }
    }
}
