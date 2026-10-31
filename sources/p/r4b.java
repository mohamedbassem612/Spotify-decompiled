package p;

import android.app.Activity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r4b implements Function0 {
    public final x0b a;
    public final Activity b;
    public final lzn0 c;
    public final gw70 d;
    public final kcg e;
    public final String f;
    public final i8h1 g;
    public final wnh1 h;
    public final xok0 i;

    public r4b(x0b x0bVar, Activity activity, lzn0 lzn0Var, gw70 gw70Var, kcg kcgVar, String str, i8h1 i8h1Var, wnh1 wnh1Var, xok0 xok0Var) {
        this.a = x0bVar;
        this.b = activity;
        this.c = lzn0Var;
        this.d = gw70Var;
        this.e = kcgVar;
        this.f = str;
        this.g = i8h1Var;
        this.h = wnh1Var;
        this.i = xok0Var;
    }

    public final Object invoke() {
        try {
            v3c1 v3c1Var = (v3c1) ((sy21) this.a.c(this.f).blockingGet()).b;
            if (v3c1Var != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new p4b(this, v3c1Var));
                int size = arrayList.size();
                int i = 0;
                for (Object obj : v3c1Var.c) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(new q4b(this, (cea) obj, size, i));
                    i = i2;
                }
                return new o4c1(new m4c1(arrayList));
            }
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            }
        }
        return n4c1.a;
    }
}
