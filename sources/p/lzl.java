package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lzl implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nzl b;
    public final /* synthetic */ com.spotify.mobius.functions.Consumer c;

    public /* synthetic */ lzl(nzl nzlVar, com.spotify.mobius.functions.Consumer consumer, byte b) {
        this.a = b;
        this.b = nzlVar;
        this.c = consumer;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        com.spotify.mobius.functions.Consumer consumer = this.c;
        nzl nzlVar = this.b;
        switch (b) {
            case 0:
                hzl hzlVar = (hzl) obj;
                if (!nzlVar.e) {
                    nzlVar.c.d(hzlVar.b, hzlVar.a, hzlVar.c);
                }
                consumer.accept(new w3m(hzlVar.b));
                break;
            default:
                gzl gzlVar = (gzl) obj;
                if (!nzlVar.e) {
                    nzlVar.c.e(gzlVar.a);
                }
                consumer.accept(new v3m(gzlVar.b));
                break;
        }
    }
}
