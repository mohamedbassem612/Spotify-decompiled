package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ai51 {
    public final String a;

    public ai51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai51) && this.a.equals(((ai51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
