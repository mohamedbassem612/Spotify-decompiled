package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ewp0 {
    public final String a;
    public final boolean b;

    public ewp0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewp0)) {
            return false;
        }
        ewp0 ewp0Var = (ewp0) obj;
        return u890.j(this.a, ewp0Var.a) && this.b == ewp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + kaa0.f(20, this.a.hashCode() * 31, 31);
    }
}
