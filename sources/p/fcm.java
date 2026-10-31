package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fcm {
    public final int a;

    public fcm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcm) && this.a == ((fcm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
