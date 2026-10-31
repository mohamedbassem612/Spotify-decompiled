package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dme0 extends gme0 {
    public final String a;

    public dme0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dme0) && u890.j(this.a, ((dme0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
