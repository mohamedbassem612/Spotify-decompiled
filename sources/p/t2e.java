package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t2e implements w2e {
    public final String a;

    public t2e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2e) && u890.j(this.a, ((t2e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
