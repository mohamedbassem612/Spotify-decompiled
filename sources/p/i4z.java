package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i4z implements n4z {
    public final String a;

    public i4z(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4z) && this.a.equals(((i4z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
