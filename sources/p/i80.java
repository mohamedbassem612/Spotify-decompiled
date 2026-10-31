package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i80 implements n80 {
    public final String a;

    public i80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i80) && u890.j(this.a, ((i80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
