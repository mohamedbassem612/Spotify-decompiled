package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface tif1 {
    static /* synthetic */ void a(tif1 tif1Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "cst";
        }
        tif1Var.e((i & 4) != 0 ? 2 : 1, str, str2);
    }

    void c(String str, String str2);

    void e(int i, String str, String str2);

    void f(String str, String str2);
}
