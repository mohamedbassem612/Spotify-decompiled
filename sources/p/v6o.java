package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v6o {
    public final String a;
    public final List b;

    public v6o(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6o)) {
            return false;
        }
        v6o v6oVar = (v6o) obj;
        return this.a.equals(v6oVar.a) && this.b.equals(v6oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
