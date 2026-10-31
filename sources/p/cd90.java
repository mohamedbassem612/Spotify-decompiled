package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cd90 {
    public final List a;

    public cd90(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd90) && this.a.equals(((cd90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
