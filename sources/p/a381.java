package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a381 implements Consumer {
    public final /* synthetic */ byte a;
    public final c8b b;

    public /* synthetic */ a381(c8b c8bVar, byte b) {
        this.a = b;
        this.b = c8bVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        c8b c8bVar = this.b;
        switch (b) {
            case 0:
                c8bVar.a(((ff7) obj).d, false);
                break;
            default:
                c8bVar.a(((afw) obj).a, false);
                break;
        }
    }
}
