package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yea0 {
    public final Object a;
    public final Object b;

    public yea0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yea0)) {
            return false;
        }
        yea0 yea0Var = (yea0) obj;
        return u890.j(this.a, yea0Var.a) && u890.j(this.b, yea0Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i = iHashCode * 31;
        Object obj2 = this.b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}
