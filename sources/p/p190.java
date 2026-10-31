package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p190 implements r190 {
    public final String a;

    public p190(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p190) && u890.j(this.a, ((p190) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
