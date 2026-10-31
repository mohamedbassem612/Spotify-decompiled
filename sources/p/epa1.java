package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class epa1 extends fdg1 {
    public final String c;

    public epa1(String str) {
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
        return (obj instanceof epa1) && u890.j(this.c, ((epa1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
