package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k80 implements n80 {
    public final String a;

    public k80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k80) && u890.j(this.a, ((k80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
