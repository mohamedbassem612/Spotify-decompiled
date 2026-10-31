package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bpd {
    public final String a;
    public final List b;
    public final List c;

    public bpd(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpd)) {
            return false;
        }
        bpd bpdVar = (bpd) obj;
        return u890.j(this.a, bpdVar.a) && u890.j(this.b, bpdVar.b) && u890.j(this.c, bpdVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
