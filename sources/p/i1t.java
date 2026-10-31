package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i1t implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzr b;

    public /* synthetic */ i1t(vzr vzrVar, byte b) {
        this.a = b;
        this.b = vzrVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vzr vzrVar = this.b;
        switch (b) {
            case 0:
                vzrVar.b.b((List) obj);
                break;
            default:
                mml mmlVar = (mml) obj;
                vzrVar.b.c(mmlVar instanceof lml ? (lml) mmlVar : null);
                break;
        }
    }
}
