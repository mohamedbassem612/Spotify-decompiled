package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xrc1 implements zrc1 {
    public final String a;

    public xrc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrc1) && u890.j(this.a, ((xrc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
