package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ylj0 extends zlj0 {
    public final Object a;

    public ylj0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ylj0) && u890.j(this.a, ((ylj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
