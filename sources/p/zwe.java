package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zwe implements nye {
    public final List a;

    public zwe(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwe) && u890.j(this.a, ((zwe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
