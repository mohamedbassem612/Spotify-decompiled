package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hw41 extends lw41 {
    public final f6x a;

    public hw41(f6x f6xVar) {
        this.a = f6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw41) && this.a.equals(((hw41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
