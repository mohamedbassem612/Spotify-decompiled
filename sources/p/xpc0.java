package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xpc0 implements aqc0 {
    public final nsn a;

    public xpc0(nsn nsnVar) {
        this.a = nsnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpc0) && this.a.equals(((xpc0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
