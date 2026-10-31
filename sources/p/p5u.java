package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p5u implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ayh b;

    public /* synthetic */ p5u(ayh ayhVar, byte b) {
        this.a = b;
        this.b = ayhVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ayh ayhVar = this.b;
        switch (b) {
            case 0:
                ayhVar.m0((q1a1) obj);
                break;
            default:
                ayhVar.m0((Object) null);
                break;
        }
    }
}
