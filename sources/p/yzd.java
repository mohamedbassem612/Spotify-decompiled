package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yzd {
    public final String a;

    public yzd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzd) && u890.j(this.a, ((yzd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
