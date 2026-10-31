package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pbr {
    public final String a;

    public pbr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbr) && u890.j(this.a, ((pbr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
