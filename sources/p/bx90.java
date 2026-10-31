package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bx90 implements dx90 {
    public final String a;

    public bx90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx90) && u890.j(this.a, ((bx90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
