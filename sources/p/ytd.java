package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ytd implements iud {
    public final Object a;

    public ytd(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytd) && u890.j(this.a, ((ytd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
