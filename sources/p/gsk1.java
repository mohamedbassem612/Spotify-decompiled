package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gsk1 implements qsk1 {
    public final String a;

    public gsk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsk1) && u890.j(this.a, ((gsk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
