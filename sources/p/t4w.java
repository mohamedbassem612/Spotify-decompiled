package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t4w implements v4w {
    public final List a;

    public t4w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4w) && this.a.equals(((t4w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
