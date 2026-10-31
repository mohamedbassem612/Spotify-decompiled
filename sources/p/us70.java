package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class us70 implements xs70 {
    public final int a;

    public us70(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us70) && this.a == ((us70) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
