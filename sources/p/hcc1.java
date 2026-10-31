package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hcc1 extends kcc1 {
    public final String a;

    public hcc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcc1) && this.a.equals(((hcc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
