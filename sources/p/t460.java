package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t460 {
    public final String a;

    public t460(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t460) && u890.j(this.a, ((t460) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
