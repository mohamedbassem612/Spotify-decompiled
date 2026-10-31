package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class j471 {
    public o571 a() {
        return e571.d;
    }

    public abstract c9 b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j471) {
            return u890.j(a(), ((j471) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
