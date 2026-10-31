package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ibo {
    public final String a;
    public final List b;
    public final int c;

    public ibo(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibo)) {
            return false;
        }
        ibo iboVar = (ibo) obj;
        return u890.j(this.a, iboVar.a) && this.b.equals(iboVar.b) && this.c == iboVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
