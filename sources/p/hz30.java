package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hz30 extends upf {
    public final String d;

    public hz30(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz30) && u890.j(this.d, ((hz30) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
