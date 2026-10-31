package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r960 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final srt0 e;

    public r960(String str, String str2, List list, String str3, srt0 srt0Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r960)) {
            return false;
        }
        r960 r960Var = (r960) obj;
        return this.a.equals(r960Var.a) && this.b.equals(r960Var.b) && this.c.equals(r960Var.c) && this.d.equals(r960Var.d) && u890.j(this.e, r960Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
