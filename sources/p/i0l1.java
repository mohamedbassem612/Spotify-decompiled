package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i0l1 extends f1l1 {
    public final String a;

    public i0l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0l1) && this.a.equals(((i0l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
