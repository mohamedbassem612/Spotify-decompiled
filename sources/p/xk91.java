package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xk91 extends yk91 {
    public final String a;

    public xk91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xk91) && u890.j(this.a, ((xk91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
