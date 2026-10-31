package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d5b extends z47 {
    public final String g;
    public final String h;

    public d5b(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5b)) {
            return false;
        }
        d5b d5bVar = (d5b) obj;
        return this.g.equals(d5bVar.g) && u890.j(this.h, d5bVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }
}
