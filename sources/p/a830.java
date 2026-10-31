package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a830 implements b830 {
    public final List a;

    public a830(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a830) && this.a.equals(((a830) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
