package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yop0 {
    public final List a;

    public yop0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yop0) && u890.j(this.a, ((yop0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
