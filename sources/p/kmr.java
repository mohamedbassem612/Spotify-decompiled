package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kmr implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a680 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ tv80 d;

    public /* synthetic */ kmr(a680 a680Var, List list, tv80 tv80Var, byte b) {
        this.a = b;
        this.b = a680Var;
        this.c = list;
        this.d = tv80Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        tv80 tv80Var = this.d;
        w5h w5hVar = w5h.d;
        a680 a680Var = this.b;
        pa81 pa81Var = pa81.c;
        List list = this.c;
        switch (b) {
            case 0:
                return ((pa81) obj) == pa81Var ? ((w4h) a680Var.b).a(a680.D(list, w5hVar)).ignoreElement() : ((r5h) a680Var.a).a(a680.E(list, tv80Var)).ignoreElement();
            default:
                return ((pa81) obj) == pa81Var ? ((w4h) a680Var.b).b(a680.D(list, w5hVar)).ignoreElement() : ((r5h) a680Var.a).c(a680.E(list, tv80Var)).ignoreElement();
        }
    }
}
