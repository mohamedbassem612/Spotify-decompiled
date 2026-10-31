package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uo3 extends qxd0 {
    public final String d;

    public uo3(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo3) && u890.j(this.d, ((uo3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
