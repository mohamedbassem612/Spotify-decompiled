package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ybf {
    public static final xbf Companion = new xbf();
    public final Integer a;
    public final Boolean b;

    public /* synthetic */ ybf(int i, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybf)) {
            return false;
        }
        ybf ybfVar = (ybf) obj;
        return u890.j(this.a, ybfVar.a) && u890.j(this.b, ybfVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public ybf(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }
}
