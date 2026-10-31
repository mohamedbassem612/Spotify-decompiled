package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lq21 implements nq21 {
    public final String a;

    public lq21(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq21) && u890.j(this.a, ((lq21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
