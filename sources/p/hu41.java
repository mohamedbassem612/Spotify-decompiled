package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hu41 extends ju41 {
    public final int a;

    public hu41(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu41) && this.a == ((hu41) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
