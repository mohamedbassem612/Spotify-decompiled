package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mq10 {
    public final boolean a;

    public mq10(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq10) && this.a == ((mq10) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
