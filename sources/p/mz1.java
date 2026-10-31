package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mz1 extends fap1 {
    public final String c;

    public mz1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz1) && this.c.equals(((mz1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
