package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dhd0 implements ehd0 {
    public final String a;

    public dhd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhd0) && this.a.equals(((dhd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
