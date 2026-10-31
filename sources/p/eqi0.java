package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqi0 extends sto1 {
    public final String b;

    public eqi0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqi0) && this.b.equals(((eqi0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
