package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xh51 {
    public final String a;

    public xh51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh51) && this.a.equals(((xh51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
