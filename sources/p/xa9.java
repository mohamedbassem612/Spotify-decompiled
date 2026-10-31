package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xa9 {
    public final String a;

    public xa9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa9) && this.a.equals(((xa9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
