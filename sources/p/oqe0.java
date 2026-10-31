package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oqe0 extends qqe0 {
    public final String a;

    public oqe0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqe0) && this.a.equals(((oqe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
