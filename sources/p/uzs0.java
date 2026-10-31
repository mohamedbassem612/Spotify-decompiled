package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uzs0 implements vzs0 {
    public final String a;

    public uzs0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzs0) && this.a.equals(((uzs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
