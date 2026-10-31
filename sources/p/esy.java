package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class esy implements gsy {
    public final String a;
    public final String b;

    public esy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esy)) {
            return false;
        }
        esy esyVar = (esy) obj;
        return u890.j(this.a, esyVar.a) && u890.j(this.b, esyVar.b);
    }

    public final String getEntityUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
