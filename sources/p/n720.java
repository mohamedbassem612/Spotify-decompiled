package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n720 extends t720 {
    public final List a;

    public n720(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n720) && this.a.equals(((n720) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
