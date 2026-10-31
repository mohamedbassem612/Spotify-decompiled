package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ k6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        t6z0 t6z0Var = this.b;
        switch (b) {
            case 0:
                tuz tuzVar = t6z0Var.c;
                return dcu0.b(tuzVar).flatMap(new hvp0(tuzVar, (byte) 12)).map(mgx0.c).onErrorReturn(bjx0.c).toObservable();
            default:
                List list = ((k5z0) obj).d;
                int size = list.size();
                tuz tuzVar2 = t6z0Var.c;
                return dcu0.b(tuzVar2).flatMap(new sjq0(tuzVar2, list, (byte) 24)).map(new ij81(size, (byte) 28)).onErrorReturn(u3x0.d).toObservable();
        }
    }
}
