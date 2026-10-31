package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gm21 implements d9j1 {
    public final String a;

    public gm21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm21) && u890.j(this.a, ((gm21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
