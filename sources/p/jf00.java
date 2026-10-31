package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jf00 extends o4o1 {
    public final List e;

    public jf00(List list) {
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf00) && u890.j(this.e, ((jf00) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
