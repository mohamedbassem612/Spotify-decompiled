package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yc61 {
    public final List a;

    public yc61(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc61) && u890.j(this.a, ((yc61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
