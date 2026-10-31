package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v2u0 implements x2u0 {
    public final String a;

    public v2u0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2u0) && u890.j(this.a, ((v2u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
