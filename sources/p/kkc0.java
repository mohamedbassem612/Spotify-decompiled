package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kkc0 {
    public final String a;

    public kkc0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkc0) && u890.j(this.a, ((kkc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
