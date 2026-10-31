package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bj7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dj7 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj7(dj7 dj7Var, List list, byte b) {
        super(0);
        this.a = b;
        this.b = dj7Var;
        this.c = list;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.c;
        dj7 dj7Var = this.b;
        switch (b) {
            case 0:
                dj7Var.b.addAll(list);
                break;
            default:
                dj7Var.a.a(list);
                break;
        }
        return rih1Var;
    }
}
