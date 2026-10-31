package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l6y0 implements m6y0 {
    public final String a;

    public l6y0(String str) {
        this.a = str;
    }

    @Override // p.m6y0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6y0) && this.a.equals(((l6y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
