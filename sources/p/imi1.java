package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class imi1 implements xmi1 {
    public final String a;

    public imi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imi1) && u890.j(this.a, ((imi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
