package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o5f1 extends q5f1 {
    public final String a;

    public o5f1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5f1) && u890.j(this.a, ((o5f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
