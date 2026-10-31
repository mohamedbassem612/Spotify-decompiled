package p;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x3u extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y3u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3u(y3u y3uVar, byte b) {
        super(0);
        this.a = b;
        this.b = y3uVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y3u y3uVar = this.b;
        switch (b) {
            case 0:
                t8h1 t8h1Var = y3uVar.d;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(t8h1Var, yon1.l5());
                break;
            case 1:
                y3uVar.f.onNext(np81.a);
                break;
            case 2:
                t8h1 t8h1Var2 = y3uVar.d;
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                t8h1.n(t8h1Var2, yon1.G1("SIGNUP_BIRTHDAY", "signup/birthday", 1886, "signup"));
                y3uVar.f.onNext(qp81.a);
                break;
            default:
                t8h1 t8h1Var3 = y3uVar.d;
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                t8h1.n(t8h1Var3, yon1.G1("SIGNUP_AGECONFIRMATION", "signup/ageconfirmation", 1884, "signup"));
                y3uVar.f.onNext(jp81.a);
                break;
        }
        return rih1Var;
    }
}
