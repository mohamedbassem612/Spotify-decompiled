package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mqg0 extends c8 {
    public final /* synthetic */ Map.Entry b;
    public final /* synthetic */ pqg0 c;

    public mqg0(Map.Entry entry, pqg0 pqg0Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = pqg0Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.c(entry.getKey(), entry.getValue());
    }
}
