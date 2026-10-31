package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gef1 {
    public final String a;

    public gef1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gef1) && u890.j(this.a, ((gef1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
