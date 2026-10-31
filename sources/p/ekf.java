package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ekf {
    public final int a;
    public final String b;
    public final goe c;
    public final d0r d;
    public final idd1 e = new idd1(new lwe(this, (byte) 6));

    public ekf(int i, String str, goe goeVar, d0r d0rVar) {
        this.a = i;
        this.b = str;
        this.c = goeVar;
        this.d = d0rVar;
    }

    public final String a() {
        return (String) this.e.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekf)) {
            return false;
        }
        ekf ekfVar = (ekf) obj;
        return this.a == ekfVar.a && u890.j(this.b, ekfVar.b) && u890.j(this.c, ekfVar.c) && u890.j(this.d, ekfVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        d0r d0rVar = this.d;
        return iHashCode + (d0rVar == null ? 0 : d0rVar.hashCode());
    }
}
