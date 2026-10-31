package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tgh implements vgh {
    public final String a;

    public tgh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgh) && u890.j(this.a, ((tgh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
