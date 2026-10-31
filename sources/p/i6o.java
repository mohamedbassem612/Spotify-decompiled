package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6o extends j6o {
    public final String a;
    public final String b;

    public i6o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6o)) {
            return false;
        }
        i6o i6oVar = (i6o) obj;
        return u890.j(this.a, i6oVar.a) && u890.j(this.b, i6oVar.b);
    }

    public final int hashCode() {
        return l1d.C(1) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f4i1.f("UserPassword(username=", this.a, ", source=CREDENTIAL_MANAGER)");
    }
}
