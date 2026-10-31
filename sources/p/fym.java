package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fym {
    public final String a;

    public fym(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fym) && u890.j(this.a, ((fym) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
