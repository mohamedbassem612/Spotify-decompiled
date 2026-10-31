package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qvn implements awn {
    public final List a;

    public qvn(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvn) && this.a.equals(((qvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
