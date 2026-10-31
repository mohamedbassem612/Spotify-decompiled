package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ayl {
    static /* synthetic */ void b(ayl aylVar, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        aylVar.d(str, str2);
    }

    static /* synthetic */ void c(ayl aylVar, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        aylVar.a(str, str2);
    }

    void a(String str, String str2);

    void d(String str, String str2);
}
