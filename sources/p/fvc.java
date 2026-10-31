package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fvc implements hvc {
    public final Integer a;
    public final String b;
    public final mmr0 c;
    public final Integer d;

    public /* synthetic */ fvc(Integer num, String str, mmr0 mmr0Var, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mmr0Var, (i & 8) != 0 ? null : 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvc)) {
            return false;
        }
        fvc fvcVar = (fvc) obj;
        return u890.j(this.a, fvcVar.a) && u890.j(this.b, fvcVar.b) && u890.j(this.c, fvcVar.c) && u890.j(this.d, fvcVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        mmr0 mmr0Var = this.c;
        int iHashCode3 = (iHashCode2 + (mmr0Var == null ? 0 : mmr0Var.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public fvc(Integer num, String str, mmr0 mmr0Var, Integer num2) {
        this.a = num;
        this.b = str;
        this.c = mmr0Var;
        this.d = num2;
        if (num == null && str == null) {
            hhg1.n("Either resourceId or resourceUri must be provided");
            throw null;
        }
    }
}
