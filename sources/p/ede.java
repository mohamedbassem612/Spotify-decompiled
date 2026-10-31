package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ede {
    public final String a;

    public ede(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ede) && u890.j(this.a, ((ede) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
