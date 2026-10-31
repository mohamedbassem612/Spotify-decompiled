package p;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class btk {
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ttk(false));
    public final fns b = igu.a;
    public final ExecutorService c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ttk(true));
    public final ytw0 d = new ytw0((byte) 20);
    public final ixl1 e;
    public final sun f;
    public final int g;
    public final vhc h;

    public btk(i6b i6bVar) {
        r0t r0tVarM = i6bVar.m();
        this.e = r0tVarM == null ? r0t.a : r0tVarM;
        this.f = new sun();
        this.g = 4;
        this.h = new vhc((byte) 2);
    }
}
