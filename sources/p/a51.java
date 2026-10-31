package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a51 extends c51 {
    public final String a;

    public a51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a51) && u890.j(this.a, ((a51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
