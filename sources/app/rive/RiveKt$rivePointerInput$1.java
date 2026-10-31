package app.rive;

import app.rive.core.CommandQueue;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.iu30;
import p.kav0;
import p.lav0;
import p.qim0;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"app/rive/RiveKt$rivePointerInput$1", "Lp/lav0;", "Lp/kav0;", "pointerInputFilter", "Lp/kav0;", "getPointerInputFilter", "()Lp/kav0;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class RiveKt$rivePointerInput$1 implements lav0 {
    private final kav0 pointerInputFilter;

    public RiveKt$rivePointerInput$1(RivePointerInputMode rivePointerInputMode, StateMachine stateMachine, CommandQueue commandQueue, Function0 function0, long j, Fit fit, int i, int i2) {
        this.pointerInputFilter = new pointerInputFilter.1(rivePointerInputMode, stateMachine, commandQueue, function0, j, fit, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ boolean all(iu30 iu30Var) {
        return super/*p.oim0*/.all(iu30Var);
    }

    public boolean any(iu30 iu30Var) {
        return ((Boolean) iu30Var.invoke(this)).booleanValue();
    }

    public Object foldIn(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }

    public Object foldOut(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(this, obj);
    }

    public kav0 getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ qim0 then(qim0 qim0Var) {
        return super/*p.qim0*/.then(qim0Var);
    }
}
