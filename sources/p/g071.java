package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g071 extends j071 {
    public final String a;

    public g071(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g071) && u890.j(this.a, ((g071) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
