package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgv implements egv {
    public final String a;

    public dgv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgv) && u890.j(this.a, ((dgv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
