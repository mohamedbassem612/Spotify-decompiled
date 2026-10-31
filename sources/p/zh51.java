package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zh51 {
    public final String a;

    public zh51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh51) && this.a.equals(((zh51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
