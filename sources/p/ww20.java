package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ww20 extends dn90 {
    public final String e;

    public ww20(String str) {
        super(2131956053, (byte) 2);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww20) && this.e.equals(((ww20) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
