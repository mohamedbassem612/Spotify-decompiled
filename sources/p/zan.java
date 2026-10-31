package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zan implements abn {
    public final String a;

    public zan(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zan) && u890.j(this.a, ((zan) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
