package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b4c1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c4c1 b;
    public final /* synthetic */ ObservableEmitter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4c1(c4c1 c4c1Var, ObservableEmitter observableEmitter, byte b) {
        super(1);
        this.a = b;
        this.b = c4c1Var;
        this.c = observableEmitter;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ObservableEmitter observableEmitter = this.c;
        c4c1 c4c1Var = this.b;
        switch (b) {
            case 0:
                w3c1 w3c1Var = c4c1Var.f;
                int iOrdinal = ((m7c1) obj).ordinal();
                if (iOrdinal == 0) {
                    obj2 = vfi1.a;
                } else if (iOrdinal != 1) {
                    Object obj3 = xfi1.a;
                    ufi1 ufi1Var = ufi1.a;
                    if (iOrdinal == 2) {
                        WeakHashMap weakHashMap = b8k1.a;
                        if (w3c1Var.getLayoutDirection() == 1) {
                            obj3 = ufi1Var;
                        }
                        obj2 = obj3;
                    } else if (iOrdinal == 3) {
                        WeakHashMap weakHashMap2 = b8k1.a;
                        if (w3c1Var.getLayoutDirection() != 1) {
                            obj3 = ufi1Var;
                        }
                        obj2 = obj3;
                    } else {
                        if (iOrdinal != 4) {
                            eg.o();
                            return null;
                        }
                        obj2 = rfi1.a;
                    }
                } else {
                    obj2 = zfi1.a;
                }
                observableEmitter.onNext(obj2);
                return rih1Var;
            default:
                ((Number) obj).intValue();
                if (c4c1Var.a.b) {
                    observableEmitter.onNext(qfi1.a);
                }
                return rih1Var;
        }
    }
}
