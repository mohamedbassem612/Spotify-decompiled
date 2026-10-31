package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vhv {
    public final String a;
    public final Map b;
    public final boolean c;

    public vhv(String str, Map map, boolean z) {
        this.a = str;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhv)) {
            return false;
        }
        vhv vhvVar = (vhv) obj;
        return u890.j(this.a, vhvVar.a) && u890.j(this.b, vhvVar.b) && this.c == vhvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.e(this.a.hashCode() * 31, 31, this.b);
    }
}
