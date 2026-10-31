package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sl91 extends tl91 {
    public final String a;

    public sl91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl91) && u890.j(this.a, ((sl91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
