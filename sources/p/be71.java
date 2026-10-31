package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class be71 implements de71 {
    public final String a;
    public final ArrayList b;
    public final String c;

    public be71(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    @Override // p.de71
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be71)) {
            return false;
        }
        be71 be71Var = (be71) obj;
        return this.a.equals(be71Var.a) && this.b.equals(be71Var.b) && this.c.equals(be71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
