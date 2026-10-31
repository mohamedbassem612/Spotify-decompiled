package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c620 extends pim0 implements csr0 {
    public float O0;

    public final Object e(wat watVar, Object obj) {
        it31 it31Var = obj instanceof it31 ? (it31) obj : null;
        if (it31Var == null) {
            it31Var = new it31();
        }
        cv20 cv20Var = it31Var.d;
        if (cv20Var == null) {
            float f = this.O0;
            cv20Var = new cv20();
            cv20Var.a = f;
        }
        it31Var.d = cv20Var;
        cv20Var.a = this.O0;
        return it31Var;
    }
}
