package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class swe implements nye {
    public final String a;

    public swe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swe) && u890.j(this.a, ((swe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
