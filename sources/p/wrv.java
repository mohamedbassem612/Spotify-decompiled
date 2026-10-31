package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wrv implements usv {
    public final int a;

    public wrv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrv) && this.a == ((wrv) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
