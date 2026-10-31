package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kf81 {
    public final Set a;
    public final if81 b;
    public final boolean c;

    public kf81(Set set, if81 if81Var, boolean z) {
        this.a = set;
        this.b = if81Var;
        this.c = z;
    }

    public final if81 a() {
        return this.b;
    }

    public final Set b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf81)) {
            return false;
        }
        kf81 kf81Var = (kf81) obj;
        return u890.j(this.a, kf81Var.a) && this.b == kf81Var.b && this.c == kf81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ kf81(Set set) {
        this(set, if81.a, true);
    }
}
