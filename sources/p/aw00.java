package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aw00 implements ww00 {
    public final String a;

    public aw00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw00) && u890.j(this.a, ((aw00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
