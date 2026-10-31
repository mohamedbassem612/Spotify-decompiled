package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yfk extends nln {
    public final List e;

    public yfk(List list) {
        super((byte) 4);
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfk) && u890.j(this.e, ((yfk) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
