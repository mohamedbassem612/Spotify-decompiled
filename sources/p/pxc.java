package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface pxc {
    static /* synthetic */ void a(pxc pxcVar, ki0 ki0Var, Long l, String str, String str2, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        pxcVar.b(ki0Var, l, str, str2);
    }

    void b(ki0 ki0Var, Long l, String str, String str2);
}
