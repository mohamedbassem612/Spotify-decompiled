package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sw11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vw11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw11(vw11 vw11Var, byte b) {
        super(1);
        this.a = b;
        this.b = vw11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vw11 vw11Var = this.b;
        switch (b) {
            case 0:
                xw11 xw11Var = vw11Var.d;
                xw11Var.getClass();
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                subtypeEffectHandlerBuilderC.g(zv11.class, new bk1(xw11Var.a, (byte) 29));
                vw11Var.O0 = Mobius.a(Mobius.d(ww11.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())), rx11.a, new n0v0(vw11Var, (byte) 23));
                return new h5y0(rqt0.u(yoi1.g(vw11Var.P0)), (byte) 20);
            default:
                ji50 ji50Var = (ji50) obj;
                s880 s880Var = vw11Var.g;
                p1f0 p1f0Var = vw11Var.Q0;
                if (p1f0Var == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                s880Var.getClass();
                cx11 cx11Var = new cx11(s880Var, p1f0Var, (byte) 3);
                ou11 ou11Var = ou11.W0;
                rs11 rs11Var = rs11.t;
                LinkedHashMap linkedHashMap = ji50Var.b;
                w7x w7xVar = w7x.a;
                linkedHashMap.put(wx11.class, r4o1.Q(ou11Var, w7xVar, cx11Var, rs11Var));
                f54 f54Var = (f54) s880Var.f;
                kdy0 kdy0Var = (kdy0) s880Var.c;
                if (((kx11) s880Var.g).b instanceof ywn) {
                    linkedHashMap.put(tx11.class, new r3r(new xzq(((e821) s880Var.a).l((d0r) s880Var.h), new zw11(s880Var, (byte) 1)), rs11.f, 4));
                } else if (f54Var.d()) {
                    cx11 cx11Var2 = new cx11(s880Var, p1f0Var, (byte) 0);
                    linkedHashMap.put(tx11.class, r4o1.Q(ou11.U0, kdy0Var.h(), cx11Var2, rs11.g));
                } else if (f54Var.b()) {
                    cx11 cx11Var3 = new cx11(s880Var, p1f0Var, (byte) 1);
                    Map mapJ = sqg0.J(new mmr0[]{new mmr0(bx11.a, dm61.x0(new yp21(gh3.class), jt11.t)), new mmr0(bx11.b, kdy0Var.h())});
                    linkedHashMap.put(tx11.class, new vw21(ou11.T0, mapJ, new fc3(cx11Var3, (byte) 5), rs11.h, (vu30) null));
                } else {
                    cx11 cx11Var4 = new cx11(s880Var, p1f0Var, (byte) 2);
                    linkedHashMap.put(tx11.class, r4o1.Q(ou11.V0, kdy0Var.h(), cx11Var4, rs11.i));
                }
                cx11 cx11Var5 = new cx11(s880Var, p1f0Var, (byte) 4);
                linkedHashMap.put(ux11.class, r4o1.Q(ou11.X0, (Set) ((a680) s880Var.d).f, cx11Var5, rs11.X));
                linkedHashMap.put(vx11.class, r4o1.Q(ou11.Y0, w7xVar, new cx11(s880Var, p1f0Var, (byte) 5), rs11.Y));
                return rih1.a;
        }
    }
}
