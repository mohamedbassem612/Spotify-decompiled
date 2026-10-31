package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eu80 extends j82 {
    public final String d;

    public eu80(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu80) && this.d.equals(((eu80) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
