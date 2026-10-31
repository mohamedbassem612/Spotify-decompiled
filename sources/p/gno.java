package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gno implements jno {
    public final String a;

    public gno(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gno) && u890.j(this.a, ((gno) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
