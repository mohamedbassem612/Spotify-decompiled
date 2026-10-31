package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class anv0 extends fae1 {
    public final String d;

    public anv0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anv0) && u890.j(this.d, ((anv0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String m() {
        return this.d;
    }
}
