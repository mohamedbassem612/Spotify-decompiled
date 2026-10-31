package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qz30 extends dug {
    public final List c;

    public qz30(List list) {
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz30) && u890.j(this.c, ((qz30) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
