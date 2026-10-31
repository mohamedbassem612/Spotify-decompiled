package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qqx0 extends frx0 {
    public final String a;

    public qqx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqx0) && this.a.equals(((qqx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
