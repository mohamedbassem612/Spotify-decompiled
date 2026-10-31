package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ar10 implements er10 {
    public final String a;

    public ar10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar10) && u890.j(this.a, ((ar10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
