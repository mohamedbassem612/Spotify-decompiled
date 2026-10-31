package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y510 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c610 b;
    public final /* synthetic */ r9c c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ y510(c610 c610Var, r9c r9cVar, Bundle bundle, byte b) {
        this.a = b;
        this.b = c610Var;
        this.c = r9cVar;
        this.d = bundle;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Bundle bundle = this.d;
        r9c r9cVar = this.c;
        c610 c610Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return c610Var.e.n(zBooleanValue).map(new oi(c610Var, r9cVar, zBooleanValue, bundle)).take(1L);
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                return c610Var.e.n(zBooleanValue2).map(new oi(c610Var, r9cVar, zBooleanValue2, bundle));
        }
    }
}
