package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ew3 {
    public final List a;

    public ew3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ew3) && this.a.equals(((ew3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
