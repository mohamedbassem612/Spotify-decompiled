package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e8w0 {
    public final List a;

    public e8w0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8w0) && u890.j(this.a, ((e8w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
