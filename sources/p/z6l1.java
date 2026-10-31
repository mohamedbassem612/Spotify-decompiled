package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z6l1 extends sqe {
    public final String d;

    public z6l1(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6l1) && this.d.equals(((z6l1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
