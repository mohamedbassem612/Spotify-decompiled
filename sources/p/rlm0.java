package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rlm0 {
    public final o95 a;
    public final ven0 b;
    public final ven0 c;

    public rlm0(o95 o95Var, ven0 ven0Var, ven0 ven0Var2) {
        this.a = o95Var;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final List a() {
        float fFloatValue = ((Number) this.a.e()).floatValue();
        ven0 ven0Var = this.c;
        if (fFloatValue < 1.0f) {
            ven0 ven0Var2 = this.b;
            if (!((List) ven0Var2.getValue()).isEmpty()) {
                return apo.n((List) ven0Var2.getValue(), (List) ven0Var.getValue(), fFloatValue);
            }
        }
        return (List) ven0Var.getValue();
    }
}
