package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ok41 implements qk41 {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public ok41(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok41) && this.a == ((ok41) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
