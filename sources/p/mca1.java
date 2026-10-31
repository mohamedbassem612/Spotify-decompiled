package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mca1 implements qca1 {
    public final String a;

    public mca1(String str) {
        this.a = str;
    }

    @Override // p.qca1
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mca1) && u890.j(this.a, ((mca1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
