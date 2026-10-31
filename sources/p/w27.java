package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w27 {
    public final String a;

    public w27(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w27) && u890.j(this.a, ((w27) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
