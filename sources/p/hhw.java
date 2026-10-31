package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hhw implements diw {
    public final String a;

    public hhw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhw) && u890.j(this.a, ((hhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
