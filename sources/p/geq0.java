package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class geq0 implements ieq0 {
    public final String a;

    public geq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof geq0) && this.a.equals(((geq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
