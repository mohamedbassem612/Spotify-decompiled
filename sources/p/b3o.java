package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b3o {
    public final String a;
    public final String b;

    public b3o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3o)) {
            return false;
        }
        b3o b3oVar = (b3o) obj;
        return this.a.equals(b3oVar.a) && this.b.equals(b3oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
