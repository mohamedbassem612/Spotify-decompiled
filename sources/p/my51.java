package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class my51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my51(by51 by51Var, dx0 dx0Var, byte b) {
        super(2);
        this.a = b;
        this.b = by51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        by51 by51Var = this.b;
        switch (b) {
            case 0:
                yx51 yx51Var = (yx51) obj;
                by51Var.e = yx51Var.f;
                return Next.h(ly51.a((ly51) obj2, yx51Var.a, yx51Var.d, yx51Var.e, yx51Var.c, null, null, 0, 112));
            default:
                yx51 yx51Var2 = (yx51) obj;
                by51Var.e = yx51Var2.f;
                ly51 ly51VarA = ly51.a(ly51.a((ly51) obj2, yx51Var2.a, yx51Var2.d, yx51Var2.e, yx51Var2.c, null, null, 0, 112), null, 0, 0, null, yx51Var2.g, null, 0, 495);
                Set setW0 = dm61.w0(new hy51[]{new ey51(ly51VarA.a)});
                if (ly51VarA.e.isEmpty()) {
                    return First.c(ly51VarA, setW0);
                }
                Set setU = ijo1.u(ly51VarA);
                ly51 ly51VarA2 = ly51.a(ly51VarA, null, 0, 0, null, null, setU, 0, 479);
                List list = ly51VarA2.e;
                boolean zV = ijo1.v(ly51VarA2);
                setW0.add(new gy51(o7h.p1(list), setU));
                setW0.add(new fy51(list, zV));
                return First.c(ly51VarA2, setW0);
        }
    }
}
