package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dv80 extends lm5 {
    public final String d;

    public dv80(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv80) && u890.j(this.d, ((dv80) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
