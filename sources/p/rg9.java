package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rg9 implements tg9 {
    public final Object a;

    public rg9(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg9) && this.a.equals(((rg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
