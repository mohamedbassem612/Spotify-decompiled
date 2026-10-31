package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lv80 extends lm5 {
    public final String d;

    public lv80(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv80) && u890.j(this.d, ((lv80) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
