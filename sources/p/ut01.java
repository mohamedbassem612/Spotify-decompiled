package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ut01 extends vt01 {
    public final String a;

    public ut01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut01) && this.a.equals(((ut01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
