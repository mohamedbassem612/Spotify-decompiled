package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qmb1 implements gob1 {
    public final String a;

    public qmb1(String str) {
        this.a = str;
    }

    @Override // p.gob1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmb1) && this.a.equals(((qmb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
