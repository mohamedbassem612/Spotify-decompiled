package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class vfn1 implements Callable {
    public final /* synthetic */ gsa a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ vfn1(gsa gsaVar, String str, String str2) {
        this.a = gsaVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return gsa.Y(this.a, this.b, this.c);
    }
}
