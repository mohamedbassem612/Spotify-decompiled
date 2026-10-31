package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zrv implements usv {
    public final Set a;

    public zrv(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrv) && this.a.equals(((zrv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
