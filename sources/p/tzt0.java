package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tzt0 implements Runnable {
    public final /* synthetic */ c0u0 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ long i;

    public tzt0(c0u0 c0u0Var, List list, List list2, List list3, List list4, int i, Long l, Long l2, long j) {
        this.a = c0u0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = i;
        this.g = l;
        this.h = l2;
        this.i = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v(new yhg0(this.b, this.c, this.d, this.e, this.f, this.g, this.h), this.i);
    }
}
