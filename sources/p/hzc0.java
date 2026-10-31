package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hzc0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r0x b;

    public /* synthetic */ hzc0(r0x r0xVar, byte b) {
        this.a = b;
        this.b = r0xVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        r0x r0xVar = this.b;
        switch (b) {
            case 0:
                t890.l("children_dataSource", (t45) ((zb91) r0xVar.h).b);
                break;
            default:
                t890.l("children_dataSource", (t45) ((zb91) r0xVar.h).b);
                ((ioc) r0xVar.i).a();
                break;
        }
    }
}
