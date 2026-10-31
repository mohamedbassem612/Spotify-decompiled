package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yqn {
    public final String a;
    public final String b;

    public yqn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqn)) {
            return false;
        }
        yqn yqnVar = (yqn) obj;
        return u890.j(this.a, yqnVar.a) && u890.j(this.b, yqnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
