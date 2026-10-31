package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0g {
    public final String a;
    public final f2g b;
    public final boolean c;

    public a0g(String str, f2g f2gVar, boolean z) {
        this.a = str;
        this.b = f2gVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0g)) {
            return false;
        }
        a0g a0gVar = (a0g) obj;
        return this.a.equals(a0gVar.a) && this.b.equals(a0gVar.b) && this.c == a0gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
