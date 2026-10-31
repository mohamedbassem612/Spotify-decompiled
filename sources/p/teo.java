package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class teo {
    public final int a;
    public final Integer b;

    public teo(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof teo)) {
            return false;
        }
        teo teoVar = (teo) obj;
        return this.a == teoVar.a && u890.j(this.b, teoVar.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        Integer num = this.b;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
