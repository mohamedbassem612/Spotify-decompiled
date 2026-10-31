package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kyb1 implements lyb1 {
    public final String a;

    public kyb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyb1) && this.a.equals(((kyb1) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(20) + cy30.d(-33657807, 31, this.a);
    }
}
