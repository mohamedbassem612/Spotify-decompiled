package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hfw extends iiw {
    public final String a;

    public hfw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfw) && u890.j(this.a, ((hfw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
