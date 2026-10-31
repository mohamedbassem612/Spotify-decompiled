package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yxy {
    public final String a;
    public final wxy b;

    public yxy(String str, wxy wxyVar) {
        this.a = str;
        this.b = wxyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxy)) {
            return false;
        }
        yxy yxyVar = (yxy) obj;
        return u890.j(this.a, yxyVar.a) && this.b == yxyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
