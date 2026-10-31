package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sfk0 implements ufk0 {
    public final List a;

    public sfk0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfk0) && u890.j(this.a, ((sfk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
