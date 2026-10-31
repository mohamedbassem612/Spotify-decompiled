package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zo71 implements bp71 {
    public final String a;
    public final List b;
    public final boolean c;

    public zo71(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo71)) {
            return false;
        }
        zo71 zo71Var = (zo71) obj;
        return u890.j(this.a, zo71Var.a) && u890.j(this.b, zo71Var.b) && this.c == zo71Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
