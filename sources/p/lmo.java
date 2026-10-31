package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lmo {
    public final String a;

    public lmo(String str) {
        this.a = str;
    }

    public final qkg a() {
        Object next;
        d7 d7Var = new d7(qkg.Y, (byte) 0);
        while (d7Var.hasNext()) {
            next = d7Var.next();
            if (((qkg) next).b.equals(this.a)) {
                return (qkg) next;
            }
        }
        next = null;
        return (qkg) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmo) && u890.j(this.a, ((lmo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
