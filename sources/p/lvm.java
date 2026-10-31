package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvm extends nvm {
    public final String a;

    public lvm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvm) && u890.j(this.a, ((lvm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
