package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hub0 implements nd41, kd41 {
    public final od41 a;
    public final kd41 b;
    public final oen0 c;

    public hub0(nd41 nd41Var, Map map, kd41 kd41Var) {
        gv20 gv20Var = new gv20(nd41Var, (byte) 18);
        kiv kivVar = pd41.a;
        this.a = new od41(map, gv20Var);
        this.b = kd41Var;
        oen0 oen0Var = ij41.a;
        this.c = new oen0();
    }

    @Override // p.nd41
    public final md41 a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // p.kd41
    public final void b(Object obj) {
        this.b.b(obj);
    }

    @Override // p.kd41
    public final void c(Object obj, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-858296452);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            this.b.c(obj, j2iVar, x340Var, i2 & 126);
            boolean zI = x340Var.i(this) | x340Var.i(obj);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new b6(this, obj, (byte) 29);
                x340Var.s0(objT);
            }
            qxd0.i(obj, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(this, obj, j2iVar, i, (byte) 7);
        }
    }

    @Override // p.nd41
    public final boolean d(Object obj) {
        return this.a.d(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // p.nd41
    public final Map e() {
        oen0 oen0Var = this.c;
        Object[] objArr = oen0Var.b;
        long[] jArr = oen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.b(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.a.e();
    }

    @Override // p.nd41
    public final Object f(String str) {
        return this.a.f(str);
    }
}
