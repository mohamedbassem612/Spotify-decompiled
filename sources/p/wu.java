package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wu {
    public static final kiv a = new kiv(p4.f, (byte) 0);

    public static final void a(float f, int i, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(448136324);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hrx hrxVar = hrx.c;
            uwr uwrVar = cbx.a;
            fwx fwxVarG = hso1.G(hrxVar, cbx.a(x340Var).b.b, cbx.a(x340Var).a.b.a(), x340Var, hrx.d, 20);
            Uri uri = Uri.EMPTY;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            cr31 cr31Var = er31.a;
            qim0 qim0Var3 = nim0.a;
            eso1.e(uri, isl.a, i1p1.q(qim0Var3, cr31Var), new p3v(f), (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, ((i2 << 9) & 7168) | 1073766448, 0, 3520);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(f, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(String str, qim0 qim0Var, qim0 qim0Var2, boolean z, gbx gbxVar, boolean z2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var3;
        int i4;
        qim0 qim0Var4;
        int i5;
        boolean z3;
        int i6;
        gbx gbxVar2;
        int i7;
        boolean z4;
        int i8;
        qim0 qim0Var5;
        boolean z5;
        boolean z6;
        hax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1666146757);
        if ((i & 6) == 0) {
            i3 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i4 = i3 | 48;
            qim0Var3 = qim0Var;
        } else {
            qim0Var3 = qim0Var;
            i4 = i3 | (x340Var.i(qim0Var3) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i5 = i4 | 384;
            qim0Var4 = qim0Var2;
        } else {
            qim0Var4 = qim0Var2;
            i5 = i4 | (x340Var.i(qim0Var4) ? 256 : 128);
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i6 = i5 | 3072;
            z3 = z;
        } else {
            z3 = z;
            i6 = i5 | (x340Var.h(z3) ? 2048 : 1024);
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i7 = i6 | 24576;
            gbxVar2 = gbxVar;
        } else {
            gbxVar2 = gbxVar;
            i7 = i6 | (x340Var.i(gbxVar2) ? 16384 : 8192);
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i8 = i7 | 196608;
            z4 = z2;
        } else {
            z4 = z2;
            i8 = i7 | (x340Var.h(z4) ? 131072 : 65536);
        }
        if (x340Var.Y(i8 & 1, (599187 & i8) != 599186)) {
            qim0 qim0Var6 = nim0.a;
            int i14 = i8;
            qim0 qim0Var7 = i9 != 0 ? qim0Var6 : qim0Var3;
            qim0 qim0Var8 = i10 != 0 ? qim0Var6 : qim0Var4;
            boolean z7 = i11 != 0 ? false : z3;
            if (i12 != 0) {
                gbxVar2 = null;
            }
            boolean z8 = i13 != 0 ? false : z4;
            if (z8) {
                x340Var.i0(855779461);
                haxVar = new hax(cwl1.o0(x340Var, 2131951763));
                x340Var.r(false);
            } else {
                x340Var.i0(855783151);
                x340Var.r(false);
                haxVar = jax.a;
            }
            hax haxVar2 = haxVar;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cwl1.b(qim0Var7, (tl3) null, (hw61) null, (pgx) null, new zzq0(4.0f, 8.0f, 4.0f, 8.0f), haxVar2, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, apo.r(463272754, new tf(z7, (Object) str, (Object) qim0Var8, (Object) j2iVar, (byte) 1), x340Var), x340Var, ((i14 >> 3) & 14) | ((i14 << 15) & 1879048192), 48, 1486);
            qim0Var3 = qim0Var7;
            z6 = z8;
            qim0Var5 = qim0Var8;
            z5 = z7;
        } else {
            x340Var.b0();
            qim0Var5 = qim0Var4;
            z5 = z3;
            z6 = z4;
        }
        gbx gbxVar3 = gbxVar2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu(str, qim0Var3, qim0Var5, z5, gbxVar3, z6, j2iVar, i, i2);
        }
    }

    public static final void c(ev evVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        long jB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(618425086);
        int i4 = i | (x340Var.i(evVar) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                qim0Var2 = nim0.a;
            }
            String str = evVar.c;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            hcx hcxVar = (hcx) x340Var.k(a);
            String str2 = evVar.a;
            String str3 = evVar.b;
            if (str3 == null) {
                str3 = "";
            }
            Integer num = evVar.d;
            if (num != null) {
                jB = u7h.b(z4p1.e(num.intValue()), 1.0f, 0.0f, 0.0f, 0.0f, 14);
            } else {
                uwr uwrVar = cbx.a;
                jB = ((yex) zex.a.d).c;
            }
            bmq0.a(uri, qim0Var2, hcxVar, str2, str3, jB, 0L, false, x340Var, i3 & 112, 192);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(evVar, qim0Var3, i, i2, (byte) 1);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-338933213);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0Var, cbx.d(x340Var).m, cbx.a(x340Var).b.a, new a0e1(3), null, 2, false, new zic0(1), 1, null, x340Var, (i2 & 14) | 805306368 | (i2 & 112), 0, 1184);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 2);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1979453159);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            pox poxVar = pox.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131951764));
            qim0 qim0VarA = uyn1.A(dug.f(i1p1.q(qim0Var, er31.a), cbx.a(x340Var).a.a.c(), d4o1.a), 4.0f, 3.0f, 4.0f, 5.0f);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(poxVar, jslVar, u291.r(qim0VarA, 12.0f), cbx.a(x340Var).b.b, 0L, true, x340Var, pox.d | 196608, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 1);
        }
    }
}
