package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ms2 {
    public final String a;

    public ms2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ms2) && this.a.equals(((ms2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
