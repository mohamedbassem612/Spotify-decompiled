package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uyq implements yyq {
    public final List a;

    public uyq(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyq) && this.a.equals(((uyq) obj).a);
    }

    @Override // p.yyq
    public final String getMessage() {
        return "Multiple errors: ".concat(o7h.y0(this.a, null, null, null, ywq.i, 31));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
