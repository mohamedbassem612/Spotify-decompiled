package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dd7 extends ld7 {
    public final String a;

    public dd7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd7) && u890.j(this.a, ((dd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
