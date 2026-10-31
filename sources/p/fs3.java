package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fs3 {
    public final String a;

    public fs3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs3) && u890.j(this.a, ((fs3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
