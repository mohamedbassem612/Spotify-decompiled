package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pac1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r2a1 b;

    public /* synthetic */ pac1(r2a1 r2a1Var, byte b) {
        this.a = b;
        this.b = r2a1Var;
    }

    public final void run() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        r2a1 r2a1Var = this.b;
        switch (b) {
            case 0:
                r2a1Var.p();
                break;
            case 1:
                ((i8h1) r2a1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("move_to_next_story", 1, Collections.singletonMap("story_id", "")), ((h4l0) r2a1Var.c).b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                ((i8h1) r2a1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("move_to_previous_story", 1, Collections.singletonMap("story_id", "")), ((h4l0) r2a1Var.c).b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
