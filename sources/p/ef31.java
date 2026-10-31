package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ef31 {
    public final String a;

    public ef31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef31) && u890.j(this.a, ((ef31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
