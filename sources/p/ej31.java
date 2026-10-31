package p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ej31 implements qj41 {
    public final wj31 a;
    public final qk41 b;
    public final List c;
    public final Map d;
    public final zu30 e;

    public /* synthetic */ ej31(wj31 wj31Var, List list, Map map, zu30 zu30Var, int i) {
        this(wj31Var, nk41.a, list, (i & 8) != 0 ? b7x.a : map, (i & 16) != 0 ? ve21.a1 : zu30Var);
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(141918204);
        if ((i2 & 48) == 0) {
            i3 = (x340Var.e(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9361) != 9360)) {
            jfe jfeVar = (jfe) this.e.J(Integer.valueOf(i), Boolean.valueOf(rk41Var.a), x340Var, Integer.valueOf((i3 >> 3) & 14));
            boolean z = rk41Var.a;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            x340Var.i0(-1055540673);
            xkg0 xkg0Var = new xkg0();
            xkg0Var.putAll(this.d);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new e2x(function0, (lnm) null, (byte) 1);
                x340Var.s0(objT);
            }
            xkg0Var.put("onAnimationDidComplete", objT);
            xkg0 xkg0VarB = xkg0Var.b();
            x340Var.r(false);
            this.a.b(new jj31(z, i, qim0VarD, 0, jfeVar, this.c, xkg0VarB, false, false, (Function0) null, (iu30) null, 3912), x340Var, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(this, i2cVar, i, rk41Var, function0, i2, (byte) 18);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.b;
    }

    public ej31(wj31 wj31Var, qk41 qk41Var, List list, Map map, zu30 zu30Var) {
        this.a = wj31Var;
        this.b = qk41Var;
        this.c = list;
        this.d = map;
        this.e = zu30Var;
    }
}
