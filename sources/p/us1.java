package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class us1 implements bt1 {
    public final boolean a;

    public us1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us1) && this.a == ((us1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
