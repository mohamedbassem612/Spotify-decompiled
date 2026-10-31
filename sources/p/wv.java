package p;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wv {
    public final ov20 a;
    public final kly0 b;

    public wv(ov20 ov20Var, g5t g5tVar) {
        this.a = ov20Var;
        this.b = g5tVar;
    }

    public final mr20 a() {
        ss61 ss61Var = (ss61) this.b.get();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("SETTINGS_PARENTAL_CONTROLS", "settings/parental-controls", 1841, "settings");
        List list = (List) ((Map) ss61Var.b.getValue()).get(p6r0VarG1);
        ov20 ov20Var = (list != null ? ss61.a(p6r0VarG1, list) : null) != null ? this.a : null;
        return ov20Var != null ? ((bw20) ov20Var).a("show-create-managed-account-in-parental-controls", false) : new huz(Boolean.FALSE, (byte) 10);
    }
}
