package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pof1 {
    public final String a;

    public pof1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pof1) && u890.j(this.a, ((pof1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
