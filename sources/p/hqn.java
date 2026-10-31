package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hqn {
    public final String a;
    public final String b;

    public hqn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqn)) {
            return false;
        }
        hqn hqnVar = (hqn) obj;
        return u890.j(this.a, hqnVar.a) && u890.j(this.b, hqnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
