package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oy8 extends bjg {
    public final dy8 a;

    public oy8(dy8 dy8Var) {
        this.a = dy8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjg)) {
            return false;
        }
        bjg bjgVar = (bjg) obj;
        Object obj2 = zig.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((oy8) bjgVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((zig.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + zig.a + ", androidClientInfo=" + this.a + "}";
    }
}
