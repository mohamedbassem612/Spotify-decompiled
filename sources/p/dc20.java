package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dc20 implements ec20 {
    public final List a;

    public dc20(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc20) && this.a.equals(((dc20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
