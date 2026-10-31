package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qvc {
    public final String a;
    public final boolean b;

    public qvc(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvc)) {
            return false;
        }
        qvc qvcVar = (qvc) obj;
        return u890.j(this.a, qvcVar.a) && this.b == qvcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
