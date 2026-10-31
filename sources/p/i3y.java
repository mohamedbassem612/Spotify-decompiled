package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i3y extends hab0 implements vu30 {
    public final /* synthetic */ x2y a;
    public final /* synthetic */ j3y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3y(x2y x2yVar, j3y j3yVar) {
        super(2);
        this.a = x2yVar;
        this.b = j3yVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x2y x2yVar = this.a;
            kdn0 kdn0Var = (kdn0) x2yVar.c;
            j3y j3yVar = this.b;
            nyx.a(2, (wux) null, apo.r(-1330278726, new g6w(x2yVar, j3yVar, b2p1.B(kdn0Var, hqq0.m0((u3y) ((MobiusLoop.Controller) j3yVar.X1.getValue()).a()), x340Var2, 0), (byte) 18), x340Var2), x340Var2, 3078, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
