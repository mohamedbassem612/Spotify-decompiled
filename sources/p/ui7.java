package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ui7 implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ wi7 e;

    public ui7(wi7 wi7Var, List list, List list2, int i, Runnable runnable) {
        this.e = wi7Var;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.c.execute(new xwn1(this, w0h1.p(new ti7(this)), false, (byte) 4));
    }
}
