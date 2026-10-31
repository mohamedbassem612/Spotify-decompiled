package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ark1 {
    static /* synthetic */ void d(ark1 ark1Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ark1Var.e(str, str2, null);
    }

    static /* synthetic */ void f(ark1 ark1Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ark1Var.h(str, str2, null);
    }

    static /* synthetic */ void g(ark1 ark1Var, double d, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        ark1Var.b(str, str2, d);
    }

    Observable a();

    void b(String str, String str2, double d);

    double c();

    void e(String str, String str2, jor jorVar);

    void h(String str, String str2, jor jorVar);
}
