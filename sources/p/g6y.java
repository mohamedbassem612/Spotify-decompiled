package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g6y extends yf {
    public final List c;

    public g6y(List list) {
        super(list, msg.b);
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6y) && u890.j(this.c, ((g6y) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final List i() {
        return this.c;
    }
}
