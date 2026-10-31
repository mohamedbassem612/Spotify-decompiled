package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eq80 extends x2s {
    public final auw b;

    public eq80(auw auwVar) {
        super(o810.g);
        this.b = auwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq80) && u890.j(this.b, ((eq80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
