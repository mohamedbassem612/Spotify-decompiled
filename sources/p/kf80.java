package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kf80 {
    public final String a;

    public kf80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf80) && this.a.equals(((kf80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 457835084;
    }
}
