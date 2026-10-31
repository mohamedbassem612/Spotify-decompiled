package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tvn implements awn {
    public final Object a;

    public tvn(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvn) && u890.j(this.a, ((tvn) obj).a);
    }

    public final int hashCode() {
        return e331.b(this.a);
    }
}
