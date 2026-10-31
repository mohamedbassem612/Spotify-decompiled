package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ui1 implements vi1 {
    public final String a;

    public ui1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui1) && u890.j(this.a, ((ui1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
