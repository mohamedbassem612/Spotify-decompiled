package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t0l1 extends f1l1 {
    public final String a;

    public t0l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0l1) && u890.j(this.a, ((t0l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
