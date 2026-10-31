package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q430 implements r430 {
    public final boolean a;

    public q430(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q430) && this.a == ((q430) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
