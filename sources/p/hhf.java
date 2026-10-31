package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hhf {
    public final String a;

    public hhf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhf) && this.a.equals(((hhf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
