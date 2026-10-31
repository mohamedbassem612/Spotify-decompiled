package p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k380 extends mjh1 {
    public final mjh1 b;
    public Object c;
    public mjh1 d;

    public k380(e380 e380Var) {
        super((byte) 0);
        this.b = e380Var.e.g().k();
        this.c = null;
        this.d = co90.e;
    }

    public final boolean hasNext() {
        return this.d.hasNext() || this.b.hasNext();
    }

    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            this.d = ((q280) entry.getValue()).k();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new t280(obj, this.d.next());
    }
}
