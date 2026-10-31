package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zyj {
    public final int a;
    public final Integer b;

    public zyj(int i, j541 j541Var, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyj)) {
            return false;
        }
        zyj zyjVar = (zyj) obj;
        return this.a == zyjVar.a && u890.j((Object) null, (Object) null) && u890.j(this.b, zyjVar.b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ")";
    }
}
