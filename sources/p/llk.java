package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class llk extends vlk {
    public final String a;

    public llk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llk) && this.a.equals(((llk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
