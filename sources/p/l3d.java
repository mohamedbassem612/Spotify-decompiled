package p;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface l3d {
    int a();

    String b();

    void c(d2d d2dVar);

    int d();

    List e(int i);

    g4r f();

    List g(int i);

    void h(Executor executor, a1d a1dVar);

    String i();

    int j(int i);

    default l3d getImplementation() {
        return this;
    }
}
