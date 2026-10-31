package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uv31 implements aw31 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final z0e1 f;
    public final boolean g;
    public final ArrayList h;

    public uv31(int i, String str, int i2, int i3, String str2, z0e1 z0e1Var, boolean z, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = z0e1Var;
        this.g = z;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv31)) {
            return false;
        }
        uv31 uv31Var = (uv31) obj;
        return this.a == uv31Var.a && u890.j(this.b, uv31Var.b) && this.c == uv31Var.c && this.d == uv31Var.d && u890.j(this.e, uv31Var.e) && this.f.equals(uv31Var.f) && this.g == uv31Var.g && this.h.equals(uv31Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g((this.f.hashCode() + cy30.d(kaa0.f(this.d, kaa0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e)) * 31, 31, this.g);
    }

    @Override // p.aw31
    public final int p() {
        return this.a;
    }
}
