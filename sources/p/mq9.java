package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mq9 {
    public final boolean a;

    public mq9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq9) && this.a == ((mq9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
