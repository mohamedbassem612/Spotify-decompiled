package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jnr implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knr b;

    public /* synthetic */ jnr(knr knrVar, byte b) {
        this.a = b;
        this.b = knrVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        knr knrVar = this.b;
        switch (b) {
            case 0:
                knrVar.d();
                break;
            case 1:
                knrVar.d();
                break;
            case 2:
                ((rs31) knrVar.e.get()).f();
                break;
            default:
                ((rs31) knrVar.e.get()).d();
                break;
        }
    }
}
