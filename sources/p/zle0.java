package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zle0 extends hme0 {
    public final List a;

    public zle0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zle0) && this.a.equals(((zle0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
