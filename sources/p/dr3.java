package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dr3 extends hr3 {
    public final String a;

    public dr3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr3) && u890.j(this.a, ((dr3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
