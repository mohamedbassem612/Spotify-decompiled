package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gad1 implements tj0 {
    public final int a;

    public gad1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gad1) && this.a == ((gad1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
