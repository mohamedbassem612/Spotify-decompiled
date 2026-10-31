package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mt3 extends ot3 {
    public final String a;

    public mt3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt3) && u890.j(this.a, ((mt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
