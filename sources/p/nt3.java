package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nt3 extends ot3 {
    public final String a;

    public nt3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt3) && u890.j(this.a, ((nt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
