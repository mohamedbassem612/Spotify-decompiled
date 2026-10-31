package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hdd implements kdd {
    public final List a;

    public hdd(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdd) && u890.j(this.a, ((hdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
