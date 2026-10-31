package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tz implements d10 {
    public final List a;

    public tz(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz) && u890.j(this.a, ((tz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
