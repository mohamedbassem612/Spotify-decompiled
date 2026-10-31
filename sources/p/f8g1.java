package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f8g1 extends i8g1 {
    public final Exception a;

    public f8g1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8g1) && this.a.equals(((f8g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
