package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class prf1 implements srf1 {
    public final String a;

    public prf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prf1) && u890.j(this.a, ((prf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
