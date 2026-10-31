package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivu0 implements kvu0 {
    public final String a;

    public ivu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivu0) && u890.j(this.a, ((ivu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
