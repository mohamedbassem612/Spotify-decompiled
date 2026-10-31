package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wsu implements btu {
    public final List a;
    public final boolean b;

    public wsu(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsu)) {
            return false;
        }
        wsu wsuVar = (wsu) obj;
        return this.a.equals(wsuVar.a) && this.b == wsuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
