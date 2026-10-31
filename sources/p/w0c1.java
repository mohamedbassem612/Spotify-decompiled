package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w0c1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0c1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                long j = ((cj4) ((ne) obj).d).c().a.b;
                return j == -1 ? e3c1.a : new d3c1(j);
            default:
                esn1.a((esn1) obj);
                return null;
        }
    }
}
