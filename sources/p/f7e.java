package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f7e {
    public final String a;

    public f7e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7e) && u890.j(this.a, ((f7e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
