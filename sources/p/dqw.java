package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dqw {
    public final String a;

    public dqw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqw) && u890.j(this.a, ((dqw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
