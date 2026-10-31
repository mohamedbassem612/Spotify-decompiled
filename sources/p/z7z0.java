package p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z7z0 extends z8z0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Restrictions e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public z7z0(boolean z, boolean z2, String str, String str2, Restrictions restrictions, boolean z3, int i, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = restrictions;
        this.f = z3;
        this.g = i;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7z0)) {
            return false;
        }
        z7z0 z7z0Var = (z7z0) obj;
        return this.a == z7z0Var.a && this.b == z7z0Var.b && this.c.equals(z7z0Var.c) && u890.j(this.d, z7z0Var.d) && this.e.equals(z7z0Var.e) && this.f == z7z0Var.f && this.g == z7z0Var.g && this.h == z7z0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ab80.k(this.g, xcg1.g((this.e.hashCode() + cy30.d(cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31);
    }
}
