package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cvs0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evs0 b;

    public /* synthetic */ cvs0(evs0 evs0Var, byte b) {
        this.a = b;
        this.b = evs0Var;
    }

    public final void run() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        evs0 evs0Var = this.b;
        switch (b) {
            case 0:
                t8r0 t8r0Var = evs0Var.c;
                i8h1 i8h1Var = (i8h1) t8r0Var.a;
                x6h1 x6h1VarC = ((zok0) t8r0Var.b).b.c();
                x6h1VarC.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                t8r0 t8r0Var2 = evs0Var.c;
                i8h1 i8h1Var2 = (i8h1) t8r0Var2.a;
                x6h1 x6h1VarC2 = ((zok0) t8r0Var2.b).b.c();
                x6h1VarC2.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
