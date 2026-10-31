package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yp21 implements aq21 {
    public final Object a;

    public yp21(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp21) && u890.j(this.a, ((yp21) obj).a);
    }

    @Override // p.aq21
    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
