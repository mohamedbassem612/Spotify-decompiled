package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p431 implements q431 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final String d;

    public p431(int i, String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = str2;
    }

    @Override // p.q431
    public final String a() {
        return this.d;
    }

    @Override // p.q431
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p431)) {
            return false;
        }
        p431 p431Var = (p431) obj;
        return this.a.equals(p431Var.a) && this.b.equals(p431Var.b) && this.c == p431Var.c && this.d.equals(p431Var.d);
    }

    @Override // p.q431
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
