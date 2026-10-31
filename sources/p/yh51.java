package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yh51 {
    public final String a;

    public yh51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh51) && this.a.equals(((yh51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
