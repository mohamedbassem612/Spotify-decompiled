package p;

import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pt7 implements Function {
    public final /* synthetic */ byte a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        rh7 rh7Var;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                qfd qfdVar = (qfd) obj;
                return (qfdVar.b || qfdVar.c != 3 || (rh7Var = qfdVar.d) == null) ? xa2.a : new ya2(rh7Var.a);
            default:
                return new ArrayList();
        }
    }
}
