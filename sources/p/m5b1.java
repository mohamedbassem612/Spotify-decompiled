package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m5b1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vsr0 b;
    public final /* synthetic */ n5b1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5b1(vsr0 vsr0Var, n5b1 n5b1Var, byte b) {
        super(1);
        this.a = b;
        this.b = vsr0Var;
        this.c = n5b1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n5b1 n5b1Var = this.c;
        vsr0 vsr0Var = this.b;
        switch (b) {
            case 0:
                b74 b74Var = (vih0) obj;
                LinkedHashMap linkedHashMap = n5b1Var.H;
                String str = vsr0Var.a;
                b74Var.j(vsr0Var);
                if (b74Var instanceof b74) {
                    Disposable disposableSubscribe = b74Var.v.toFlowable(BackpressureStrategy.d).x(new nl51(vsr0Var, (byte) 20)).subscribe(new h5b1(n5b1Var, (byte) 2));
                    Disposable disposable = (Disposable) linkedHashMap.remove(str);
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    linkedHashMap.put(str, disposableSubscribe);
                }
                break;
            default:
                ((vih0) obj).i(vsr0Var);
                Disposable disposable2 = (Disposable) n5b1Var.H.remove(vsr0Var.a);
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                break;
        }
        return rih1Var;
    }
}
