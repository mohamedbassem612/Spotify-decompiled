package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t041 extends hab0 implements xu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t041(int i, long j) {
        super(3);
        this.a = i;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ifh0 ifh0Var = (ifh0) obj;
        q5t0 q5t0VarH = ((afh0) obj2).H(hjl.b(((hjl) obj3).a, 0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 3));
        int iU = jch0.U(ifh0Var.q0(this.b) * this.a);
        return ifh0Var.S(q5t0VarH.a, iU, b7x.a, new wb5(q5t0VarH, iU, (byte) 19));
    }
}
