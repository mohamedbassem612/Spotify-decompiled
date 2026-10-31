package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w4w implements y4w {
    public final List a;

    public w4w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4w) && this.a.equals(((w4w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
