package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gyn0 extends bzn1 {
    public final String c;

    public gyn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyn0) && this.c.equals(((gyn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
