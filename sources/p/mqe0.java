package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mqe0 extends qqe0 {
    public final String a;

    public mqe0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqe0) && this.a.equals(((mqe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
