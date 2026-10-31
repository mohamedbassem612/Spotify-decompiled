package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n321 extends o6p1 {
    public final Map c;

    public n321(Map map) {
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n321) && u890.j(this.c, ((n321) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
