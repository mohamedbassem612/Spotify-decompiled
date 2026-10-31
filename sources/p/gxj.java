package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gxj implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ txj c;

    public /* synthetic */ gxj(List list, txj txjVar, byte b) {
        this.a = b;
        this.b = list;
        this.c = txjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        txj txjVar = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                return txjVar.e.b((hwq) list.get(((Number) obj).intValue()));
            default:
                return txjVar.e.b((hwq) list.get(((Number) obj).intValue()));
        }
    }
}
