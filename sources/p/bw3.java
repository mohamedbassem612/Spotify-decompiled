package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bw3 extends cw3 {
    public final String a;

    public bw3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw3) && u890.j(this.a, ((bw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
