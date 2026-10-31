package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aer0 extends rrn1 {
    public final String c;

    public aer0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aer0) && u890.j(this.c, ((aer0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public /* synthetic */ aer0() {
        this("");
    }
}
