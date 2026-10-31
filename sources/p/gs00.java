package p;

import com.spotify.home.explicitfeedback.proto.Feedback;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gs00 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs00 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gs00(hs00 hs00Var, String str, byte b) {
        this.a = b;
        this.b = hs00Var;
        this.c = str;
    }

    public final Object get() {
        byte b = this.a;
        String str = this.c;
        hs00 hs00Var = this.b;
        switch (b) {
            case 0:
                t7y t7yVar = hs00Var.f;
                gq10 gq10VarN = Feedback.n();
                gq10VarN.q(str);
                gq10VarN.n(((yqg) t7yVar.b).b());
                ((ConcurrentLinkedQueue) t7yVar.c).add((Feedback) gq10VarN.build());
                List listL1 = o7h.l1((ConcurrentLinkedQueue) t7yVar.c);
                hs00Var.h.onNext(listL1);
                if (!hs00Var.e.get()) {
                    return CompletableEmpty.a;
                }
                bs10 bs10Var = hs00Var.c;
                String str2 = hs00Var.d;
                str2.getClass();
                return bs10Var.b(str2, listL1);
            default:
                t7y t7yVar2 = hs00Var.f;
                t7yVar2.k(new ps00(str, (byte) 4));
                List listL2 = o7h.l1((ConcurrentLinkedQueue) t7yVar2.c);
                hs00Var.h.onNext(listL2);
                if (!hs00Var.e.get()) {
                    return CompletableEmpty.a;
                }
                bs10 bs10Var2 = hs00Var.c;
                String str3 = hs00Var.d;
                str3.getClass();
                return bs10Var2.b(str3, listL2);
        }
    }
}
