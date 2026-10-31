package p;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yf8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf8(AtomicReference atomicReference, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = atomicReference;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        AtomicReference atomicReference = this.b;
        switch (b) {
            case 0:
                atomicReference.set(Boolean.TRUE);
                function0.invoke();
                break;
            case 1:
                atomicReference.set(Boolean.TRUE);
                function0.invoke();
                break;
            default:
                atomicReference.set(Boolean.TRUE);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
