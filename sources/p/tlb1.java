package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tlb1 implements unb1 {
    public final String a;

    public tlb1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlb1) && u890.j(this.a, ((tlb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
