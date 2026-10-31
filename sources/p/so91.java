package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class so91 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dxy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so91(dxy dxyVar, byte b) {
        super(0);
        this.a = b;
        this.b = dxyVar;
    }

    public final Object invoke() {
        byte b = this.a;
        dxy dxyVar = this.b;
        switch (b) {
            case 0:
                vf0 vf0Var = (vf0) dxyVar.d;
                d781 d781Var = new d781(dxyVar, (byte) 28);
                fe91 fe91Var = fe91.U0;
                jd11 jd11Var = rc11.a;
                return vf0Var.a(d781Var, fe91Var, jd11Var.b(String.class), jd11Var.b(List.class));
            default:
                return ((o241) dxyVar.c).a.map(m9x0.O0).distinctUntilChanged().toFlowable(BackpressureStrategy.d);
        }
    }
}
