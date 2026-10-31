package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ou3 extends hqq0 {
    public final String d;

    public ou3(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou3) && u890.j(this.d, ((ou3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
