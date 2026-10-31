package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uto {
    public final String a;
    public final String b;

    public uto(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uto)) {
            return false;
        }
        uto utoVar = (uto) obj;
        return u890.j(this.a, utoVar.a) && u890.j(this.b, utoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
