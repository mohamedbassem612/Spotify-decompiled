package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lnb1 implements job1 {
    public final String a;

    public lnb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnb1) && u890.j(this.a, ((lnb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
