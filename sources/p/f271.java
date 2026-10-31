package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f271 extends hxo1 {
    public final String c;

    public f271(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f271) && this.c.equals(((f271) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String p() {
        return this.c;
    }
}
