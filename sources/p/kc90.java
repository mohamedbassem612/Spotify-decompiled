package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kc90 {
    public final String a;

    public kc90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc90) && this.a.equals(((kc90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
