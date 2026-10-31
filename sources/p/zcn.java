package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zcn {
    public final String a;
    public final List b;
    public final int c;
    public final String d;

    public zcn(int i, String str, String str2, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcn)) {
            return false;
        }
        zcn zcnVar = (zcn) obj;
        return this.a.equals(zcnVar.a) && u890.j(this.b, zcnVar.b) && this.c == zcnVar.c && u890.j(this.d, zcnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
