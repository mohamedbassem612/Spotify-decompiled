package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i2v implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ayl b;

    public /* synthetic */ i2v(ayl aylVar, byte b) {
        this.a = b;
        this.b = aylVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ayl aylVar = this.b;
        switch (b) {
            case 0:
                vuu vuuVar = (vuu) obj;
                ayl.c(aylVar, vuuVar.a, vuuVar.b, 4);
                break;
            default:
                Iterator it = ((r421) obj).a.iterator();
                while (it.hasNext()) {
                    ayl.c(aylVar, (String) it.next(), (String) null, 6);
                }
                break;
        }
    }
}
