package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l380 extends q280 {
    public final e380 b;

    public l380(e380 e380Var) {
        this.b = e380Var;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.b.c(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final mjh1 iterator() {
        return new k380(this.b);
    }

    public final int size() {
        return this.b.f;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
