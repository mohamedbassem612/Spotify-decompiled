package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ygw implements fiw {
    public final String a;
    public final String b;

    public ygw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygw)) {
            return false;
        }
        ygw ygwVar = (ygw) obj;
        return u890.j(this.a, ygwVar.a) && u890.j(this.b, ygwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ ygw(int i, String str, String str2) {
        this(str, str2);
    }
}
