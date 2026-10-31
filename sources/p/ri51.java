package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ri51 {
    public final String a;

    public ri51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri51) && u890.j(this.a, ((ri51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
