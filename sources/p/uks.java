package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uks {
    public final ynb0 a;

    public uks(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final u9h1 a(wly0 wly0Var) {
        for (but butVar : (Iterable) this.a.get()) {
            if (butVar.getType() == wly0Var) {
                return butVar.a();
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }
}
