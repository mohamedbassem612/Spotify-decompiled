package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sem {
    public final String a;
    public final boolean b;
    public final Integer c;

    public sem(Integer num, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sem)) {
            return false;
        }
        sem semVar = (sem) obj;
        return this.a.equals(semVar.a) && this.b == semVar.b && u890.j(this.c, semVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
