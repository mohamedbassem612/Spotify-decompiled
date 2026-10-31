package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ulk extends vlk {
    public final String a;
    public final tv80 b;

    public ulk(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulk)) {
            return false;
        }
        ulk ulkVar = (ulk) obj;
        return this.a.equals(ulkVar.a) && u890.j(this.b, ulkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
