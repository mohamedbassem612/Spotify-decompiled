package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class whv {
    public final String a;
    public final Map b;
    public final boolean c;

    public whv(String str, Map map, boolean z) {
        this.a = str;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whv)) {
            return false;
        }
        whv whvVar = (whv) obj;
        return u890.j(this.a, whvVar.a) && u890.j(this.b, whvVar.b) && this.c == whvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.e(this.a.hashCode() * 31, 31, this.b);
    }
}
