package p;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PlayerOptionOverrides$Builder;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rit0 implements tyq, cvl1 {
    public final js20 O0;
    public final psw Q0;
    public final PreparePlayOptions R0;
    public final b7r0 X;
    public final boolean Y;
    public final yqg a;
    public final muz b;
    public final lik1 c;
    public final d0r d;
    public final f1n0 e;
    public final a690 f;
    public final gn10 g;
    public final vb2 h;
    public final l78 i;
    public final kge t;
    public final o3r Z = w3p1.o(new l4r(pwc0.r, 2, iet0.X0, new j4r(iet0.T0), iet0.Y0), iet0.U0);
    public final iik0 N0 = new iik0(this, (byte) 9);
    public final hy00 P0 = c680.C(iet0.W0, e9t0.O0, e9t0.P0);

    public rit0(yzc0 yzc0Var, yqg yqgVar, muz muzVar, lik1 lik1Var, d0r d0rVar, f1n0 f1n0Var, a690 a690Var, gn10 gn10Var, vb2 vb2Var, l78 l78Var, i1r0 i1r0Var, kge kgeVar, b7r0 b7r0Var, y5v0 y5v0Var, boolean z) {
        this.a = yqgVar;
        this.b = muzVar;
        this.c = lik1Var;
        this.d = d0rVar;
        this.e = f1n0Var;
        this.f = a690Var;
        this.g = gn10Var;
        this.h = vb2Var;
        this.i = l78Var;
        this.t = kgeVar;
        this.X = b7r0Var;
        this.Y = z;
        this.O0 = x3p1.n(new aft0(yzc0Var, this, (byte) 3), iet0.V0, cps0.e1, (o8n) null, new ntf0(this, yzc0Var, y5v0Var, i1r0Var, (byte) 26), 8);
        j2i j2iVar = new j2i(115630500, new t9r0(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.Q0 = new psw(j2iVar, (byte) 0);
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().suppressions(Suppressions.create(Collections.singleton("mft")));
        PlayerOptionOverrides$Builder playerOptionOverrides$BuilderBuilder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        this.R0 = builderSuppressions.playerOptionsOverride(playerOptionOverrides$BuilderBuilder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build();
    }

    public static boolean g(p0d0 p0d0Var, git0 git0Var) {
        fh90 fh90Var = git0Var.c;
        l0d0 l0d0Var = p0d0Var.c;
        if ((l0d0Var instanceof l0d0) && u890.j(l0d0Var.a, git0Var.a)) {
            return true;
        }
        if ((l0d0Var instanceof n0d0) && ((n0d0) l0d0Var).a.equals(fh90Var.c())) {
            return true;
        }
        bmm bmmVar = p0d0Var.b;
        if (!(fh90Var instanceof fh90)) {
            return false;
        }
        String str = fh90Var.d;
        y6b1 y6b1Var = bmmVar.a;
        return u890.j(str, y6b1Var != null ? y6b1Var.toString() : null);
    }

    public static cet0 h(lit0 lit0Var) {
        git0 git0Var = lit0Var.d;
        String title = git0Var.c.getTitle();
        boolean z = lit0Var.c == kit0.a;
        int i = git0Var.d;
        return new cet0(z, new uft0(i == 1 || i == 3), title);
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.Q0;
    }

    public final d0r e() {
        return this.d;
    }

    public final void f(lit0 lit0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        dit0 yht0Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1539797915);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(lit0Var) : x340Var.i(lit0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            git0 git0Var = lit0Var.d;
            int i3 = git0Var.d;
            jit0 jit0Var = lit0Var.e;
            boolean z = lit0Var.a;
            kit0 kit0Var = lit0Var.c;
            int i4 = git0Var.d;
            boolean zE = x340Var.e(i4 == 0 ? -1 : l1d.C(i4)) | x340Var.e(kit0Var.ordinal()) | x340Var.h(z) | x340Var.g(jit0Var);
            Object objT = x340Var.T();
            if (zE || objT == obj) {
                if (kit0Var == kit0.a) {
                    yht0Var = cit0.a;
                } else {
                    if (i3 == 3) {
                        objT = null;
                    } else if (i3 == 1) {
                        yht0Var = bit0.a;
                    } else if (z) {
                        yht0Var = zht0.a;
                    } else if (i3 == 2) {
                        yht0Var = ait0.a;
                    } else {
                        yht0Var = jit0Var instanceof hit0 ? new yht0(((hit0) jit0Var).a) : dit0.a;
                    }
                    x340Var.s0(objT);
                }
                objT = yht0Var;
                x340Var.s0(objT);
            }
            eit0 eit0Var = (eit0) objT;
            Resources resources = (Resources) x340Var.k(AndroidCompositionLocals_androidKt.c);
            boolean zG = x340Var.g(git0Var.c.getTitle()) | x340Var.e(i3 != 0 ? l1d.C(i3) : -1) | x340Var.e(kit0Var.ordinal());
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                cet0 cet0VarH = h(lit0Var);
                objT2 = lnn1.j(resources, cet0VarH, cet0VarH.c);
                x340Var.s0(objT2);
            }
            String str = (String) objT2;
            vq60 vq60Var = jw80.a;
            tsj0 tsj0Var = tsj0.a;
            boolean z2 = eit0Var != null;
            pm31 pm31Var = new pm31(0);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(eit0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new shq0(eit0Var, iu30Var, (byte) 26);
                x340Var.s0(objT3);
            }
            qim0 qim0VarX = bin.x(tsj0Var, z2, (String) null, pm31Var, (idn0) null, (Function0) objT3, 10);
            boolean zG2 = x340Var.g(str);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                objT4 = new atp0(str, (byte) 22);
                x340Var.s0(objT4);
            }
            qim0 qim0VarN = anm1.N("standard_play_element_button", s161.b(qim0VarX, true, (iu30) objT4));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = iet0.R0;
                x340Var.s0(objT5);
            }
            iu30 iu30Var2 = (iu30) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = iet0.S0;
                x340Var.s0(objT6);
            }
            iu30 iu30Var3 = (iu30) objT6;
            boolean zI2 = x340Var.i(this) | x340Var.i(lit0Var);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == obj) {
                objT7 = new aft0(this, lit0Var, (byte) 2);
                x340Var.s0(objT7);
            }
            dm5.b(iu30Var2, (qim0) null, iu30Var3, (iu30) null, (iu30) objT7, x340Var, 390, 10);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, lit0Var, iu30Var, i, (byte) 23);
        }
    }

    public final mqw getBehavior() {
        return this.O0;
    }

    public final f4r getData() {
        return this.N0;
    }
}
