package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dpa1 extends fdg1 {
    public final String c;

    public dpa1(String str) {
        this.c = str;
    }

    @Override // p.fdg1
    public final String J() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpa1) && u890.j(this.c, ((dpa1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
