package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ljj1 {
    public abstract long a();

    public abstract long b();

    public final boolean c() {
        if (this instanceof jjj1) {
            return ((jjj1) this).d().length() > 0;
        }
        if (this instanceof kjj1) {
            return ((kjj1) this).a.length() > 0;
        }
        eg.o();
        return false;
    }
}
