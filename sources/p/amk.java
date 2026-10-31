package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@o661
public final class amk {
    public static final zlk Companion = new zlk();
    public final String a;
    public final dmk b;

    public /* synthetic */ amk(int i, String str, dmk dmkVar) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ylk.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = dmkVar;
    }

    public final dmk a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amk)) {
            return false;
        }
        amk amkVar = (amk) obj;
        return u890.j(this.a, amkVar.a) && u890.j(this.b, amkVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
