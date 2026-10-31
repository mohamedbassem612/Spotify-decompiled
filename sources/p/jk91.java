package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jk91 extends yk91 {
    public final Map a;

    public jk91(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk91) && this.a.equals(((jk91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
