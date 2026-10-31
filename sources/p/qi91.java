package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qi91 extends mod {
    public final String e;

    public qi91(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi91) && u890.j(this.e, ((qi91) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
