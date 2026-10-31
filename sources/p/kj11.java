package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kj11 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bfz b;

    public /* synthetic */ kj11(bfz bfzVar, byte b) {
        this.a = b;
        this.b = bfzVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        bfz bfzVar = this.b;
        switch (b) {
            case 0:
                String str = (String) o7h.q0((List) obj);
                ((xrn0) bfzVar.c).a(str, ((tas) bfzVar.d).c(gof1.b, str));
                break;
            default:
                String str2 = (String) obj;
                ((xrn0) bfzVar.c).a(str2, ((tas) bfzVar.d).c(gof1.a, str2));
                break;
        }
    }
}
