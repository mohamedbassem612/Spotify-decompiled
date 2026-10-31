package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lje1 implements oje1 {
    public final String a;

    public lje1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lje1) && this.a.equals(((lje1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
