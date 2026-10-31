package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v331 extends x331 {
    public final int a;

    public v331(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v331) && this.a == ((v331) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
