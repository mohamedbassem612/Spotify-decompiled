package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mld {
    public final String a;

    public mld(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mld) && u890.j(this.a, ((mld) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
