package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fh51 {
    public final String a;

    public fh51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh51) && u890.j(this.a, ((fh51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
