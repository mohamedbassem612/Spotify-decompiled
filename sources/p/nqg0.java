package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nqg0 implements su30 {
    public final /* synthetic */ pqg0 a;

    public nqg0(pqg0 pqg0Var) {
        this.a = pqg0Var;
    }

    @Override // p.su30
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return new mqg0(entry, this.a);
    }
}
