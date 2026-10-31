package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eme0 extends gme0 {
    public final String a;

    public eme0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eme0) && u890.j(this.a, ((eme0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
