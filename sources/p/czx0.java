package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class czx0 implements dzx0 {
    public final String a;

    public czx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czx0) && this.a.equals(((czx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
