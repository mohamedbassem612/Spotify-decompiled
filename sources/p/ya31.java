package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ya31 implements ab31 {
    public final String a;

    public ya31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya31) && u890.j(this.a, ((ya31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
