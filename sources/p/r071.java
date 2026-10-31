package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r071 implements w071 {
    public final String a;

    public r071(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r071) && u890.j(this.a, ((r071) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
