package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sf7 implements xf7 {
    public final String a;

    public sf7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf7) && u890.j(this.a, ((sf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
