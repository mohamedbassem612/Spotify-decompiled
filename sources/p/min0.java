package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class min0 implements oin0 {
    public final String a;

    public min0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof min0) && this.a.equals(((min0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
