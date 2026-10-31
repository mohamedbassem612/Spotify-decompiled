package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n8e0 extends h4p1 {
    public final Object c;

    public n8e0(Object obj) {
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8e0) && u890.j(this.c, ((n8e0) obj).c);
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
