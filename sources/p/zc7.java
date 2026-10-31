package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zc7 extends fqo1 {
    public final List e;

    public zc7(List list) {
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc7) && this.e.equals(((zc7) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
