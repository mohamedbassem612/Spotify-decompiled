package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d3y implements g3y {
    public final String a;

    public d3y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3y) && u890.j(this.a, ((d3y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
