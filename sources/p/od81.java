package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class od81 implements jsw {
    public final Context a;
    public final gw70 b;
    public final idd1 c;
    public final idd1 d;
    public final idd1 e;
    public final idd1 f;
    public final idd1 g;
    public final idd1 h;
    public final Function0 i;
    public final Function0 j;
    public final v6a k;
    public final tbw0 l;
    public final yqg m;
    public final int n;

    public od81(Context context, gw70 gw70Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4, idd1 idd1Var5, idd1 idd1Var6, Function0 function0, Function0 function1, v6a v6aVar, tbw0 tbw0Var, yqg yqgVar, cua cuaVar, int i) {
        this.a = context;
        this.b = gw70Var;
        this.c = idd1Var;
        this.d = idd1Var2;
        this.e = idd1Var3;
        this.f = idd1Var4;
        this.g = idd1Var5;
        this.h = idd1Var6;
        this.i = function0;
        this.j = function1;
        this.k = v6aVar;
        this.l = tbw0Var;
        this.m = yqgVar;
        this.n = i;
    }

    public static lfi0 g(he81 he81Var) {
        String str = he81Var.d;
        int i = he81Var.G;
        String str2 = (i == 5 && k8p1.l(he81Var)) ? he81Var.e : null;
        return new lfi0(str, he81Var.b, he81Var.c, (String) null, (String) null, (d2k1) null, (i == 5 && k8p1.l(he81Var)) ? he81Var.E : null, str2, (String) null, he81Var.r ? k4m.b : k4m.d, he81Var.l ? jon1.H(he81Var) : null, true, false, false, false, false, false, false, (String) null, (Float) null, 33546936);
    }

    public static set0 h(he81 he81Var, boolean z) {
        String str = he81Var.z;
        boolean z2 = str != null;
        if (str == null) {
            str = he81Var.d;
        }
        return new set0(str, z, "preview-card", "preview-card", (Function0) null, z2, z2, (Function0) null, (String) null, (String) null, false, 1936);
    }

    public final void c(he81 he81Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1416322246);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(he81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = he81Var.a;
            String str2 = he81Var.d;
            String str3 = he81Var.f;
            String str4 = str3 == null ? str2 : str3;
            boolean z = he81Var.g;
            boolean z2 = he81Var.h;
            er00 er00VarG = k8p1.g(he81Var);
            boolean z3 = he81Var.i;
            lfi0 lfi0VarG = g(he81Var);
            String str5 = he81Var.q;
            if (str5 == null) {
                str5 = "";
            }
            v9n v9nVar = new v9n(str5);
            set0 set0VarH = h(he81Var, false);
            wcm wcmVarH = jon1.H(he81Var);
            String str6 = he81Var.d;
            mod.b(oi7.a.a(this.b), apo.r(-300732026, new wnx0(this, he81Var, new hob1(str, str2, str4, str2, "", z, z2, er00VarG, z3, null, lfi0VarG, null, null, set0VarH, wcmVarH, null, new wiv0((Long) null, str6, str6), null, null, null, null, v9nVar, null, null, null, 0L, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, null, -2221568, 2046), new kd81((byte) 0), iu30Var2, (byte) 17), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, he81Var, iu30Var, i, (byte) 27);
        }
    }

    public final void d(int i, b0k b0kVar, ksw kswVar, iu30 iu30Var, he81 he81Var) {
        int i2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-368426725);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(he81Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(this) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            tl7 tl7Var = (tl7) this.i.invoke();
            String str = he81Var.a;
            boolean zI = b0kVar2.i(he81Var) | b0kVar2.i(this);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                objT = new ld81(he81Var, this, (byte) 0);
                b0kVar2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = b0kVar2.i(he81Var) | b0kVar2.i(this);
            Object objT2 = b0kVar2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new ld81(he81Var, this, (byte) 1);
                b0kVar2.s0(objT2);
            }
            i1o1.b(kswVar, tl7Var, str, function0, (Function0) objT2, b0kVar2, i2 & 14, 0);
            b0kVar2 = b0kVar2;
            VideoSurfaceView videoSurfaceView = he81Var.G == 3 ? (VideoSurfaceView) this.k.invoke(this.a) : null;
            qim0 qim0VarZ = uyn1.z(i(b0kVar2), 0.0f, 2, nim0.a);
            boolean zI3 = b0kVar2.i(he81Var) | ((i2 & 896) == 256);
            Object objT3 = b0kVar2.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new jd81(iu30Var, he81Var, (byte) 1);
                b0kVar2.s0(objT3);
            }
            i8p1.h(he81Var, videoSurfaceView, this.b, this.c, this.d, this.e, iu30Var, jzn1.w(qim0VarZ, (iu30) objT3, b0kVar2), b0kVar2, ((i2 >> 3) & 14) | ((i2 << 12) & 3670016));
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new md81(this, kswVar, he81Var, iu30Var, i, (byte) 0);
        }
    }

    public final void e(int i, b0k b0kVar, ksw kswVar, iu30 iu30Var, he81 he81Var) {
        int i2;
        ubw0 ubw0Var;
        tob1 tob1VarI;
        tob1 tob1VarI2;
        tob1 tob1VarI3;
        znb0 znb0Var;
        boolean z;
        mmr0 mmr0VarN;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(8898896);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(he81Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            sbw0 sbw0Var = he81Var.C;
            String str = he81Var.a;
            if (sbw0Var != null) {
                x340Var.i0(-1180706546);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == obj) {
                    objT = this.l.b((abu0) this.j.invoke(), (p731) null, (tl7) this.i.invoke());
                    x340Var.s0(objT);
                }
                ubw0Var = (ubw0) objT;
                x340Var.r(false);
            } else {
                x340Var.i0(-1180450052);
                x340Var.r(false);
                ubw0Var = null;
            }
            if (sbw0Var == null) {
                x340Var.i0(-1180388828);
                x340Var.r(false);
            } else {
                x340Var.i0(-1180388827);
                if (ubw0Var == null) {
                    x340Var.i0(1732635271);
                } else {
                    x340Var.i0(1857006778);
                    ubw0Var.e(kswVar, sbw0Var, x340Var, (i2 & 14) | 64);
                }
                x340Var.r(false);
                x340Var.r(false);
            }
            bpb1 bpb1VarJ = ubw0Var != null ? ubw0Var.j() : null;
            if (bpb1VarJ == null) {
                x340Var.i0(-1180209710);
                x340Var.r(false);
                tob1VarI = null;
            } else {
                x340Var.i0(-38071281);
                tob1VarI = xto.i(bpb1VarJ, Boolean.FALSE, x340Var, 48);
                x340Var.r(false);
            }
            boolean zBooleanValue = tob1VarI != null ? ((Boolean) tob1VarI.getValue()).booleanValue() : false;
            bpb1 bpb1VarC = ubw0Var != null ? ubw0Var.c() : null;
            if (bpb1VarC == null) {
                x340Var.i0(-1180095630);
                x340Var.r(false);
                tob1VarI2 = null;
            } else {
                x340Var.i0(-38067601);
                tob1VarI2 = xto.i(bpb1VarC, Boolean.FALSE, x340Var, 48);
                x340Var.r(false);
            }
            boolean zBooleanValue2 = tob1VarI2 != null ? ((Boolean) tob1VarI2.getValue()).booleanValue() : false;
            x010 x010VarI = ubw0Var != null ? ubw0Var.i() : null;
            if (x010VarI == null) {
                x340Var.i0(-1179972653);
                x340Var.r(false);
                tob1VarI3 = null;
            } else {
                x340Var.i0(-38063634);
                tob1VarI3 = xto.i(x010VarI, (Object) null, x340Var, 48);
                x340Var.r(false);
            }
            i091 i091Var = tob1VarI3 != null ? (i091) tob1VarI3.getValue() : null;
            if (ubw0Var != null) {
                x340Var.i0(-1179824007);
                boolean zG2 = x340Var.g(str);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == obj) {
                    objT2 = new idd1(new vbi0(this, ubw0Var, (byte) 2));
                    x340Var.s0(objT2);
                }
                znb0Var = (znb0) objT2;
                x340Var.r(false);
            } else {
                x340Var.i0(-1179516580);
                x340Var.r(false);
                znb0Var = null;
            }
            boolean zL = k8p1.l(he81Var);
            String str2 = he81Var.d;
            String str3 = he81Var.f;
            if (str3 == null) {
                str3 = str2;
            }
            boolean z2 = he81Var.g;
            boolean z3 = he81Var.h;
            er00 er00VarG = k8p1.g(he81Var);
            boolean z4 = he81Var.i;
            lfi0 lfi0VarG = g(he81Var);
            yaw0 yaw0Var = new yaw0(8080, str, he81Var.d, "", "", (String) null, (k4m) null, false, false, false, false);
            set0 set0VarH = h(he81Var, true);
            wcm wcmVarH = jon1.H(he81Var);
            String str4 = he81Var.z;
            if (str4 == null) {
                str4 = he81Var.d;
            }
            hob1 hob1Var = new hob1(str, str2, str3, str2, "", z2, z3, er00VarG, z4, null, lfi0VarG, yaw0Var, new xfn0(new pc81(iu30Var, (byte) 1)), set0VarH, wcmVarH, new uho(str4, he81Var.d, qho.a, (nho) null, he81Var.b, (Function0) null, 232), null, null, null, null, null, null, null, null, zL ? sbw0Var : null, zL ? he81Var.D : -1L, false, false, zL ? 2131959807 : null, false, false, false, null, null, null, false, null, null, null, false, false, null, null, -318832128, 2046);
            if (k8p1.l(he81Var)) {
                x340Var.i0(-38041209);
                mmr0VarN = oqn1.n(new p3v(i(x340Var)), new p3v(0.0f));
                z = false;
            } else {
                z = false;
                x340Var.i0(-38040281);
                mmr0VarN = oqn1.n(new p3v(0.0f), new p3v(i(x340Var)));
            }
            x340Var.r(z);
            mod.b(oi7.a.a(this.b), apo.r(1181486224, new nd81(this, ((p3v) mmr0VarN.b).a, iu30Var, he81Var, hob1Var, ((p3v) mmr0VarN.a).a, new kd81((byte) 1), zBooleanValue, zBooleanValue2, znb0Var, i091Var, ubw0Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new md81(this, kswVar, he81Var, iu30Var, i, (byte) 1);
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void a(int i, b0k b0kVar, ksw kswVar, iu30 iu30Var, he81 he81Var) {
        int i2;
        od81 od81Var;
        ksw kswVar2;
        iu30 iu30Var2;
        he81 he81Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(288420687);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(he81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(kswVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int iC = l1d.C(he81Var.I);
            if (iC == 0) {
                od81Var = this;
                kswVar2 = kswVar;
                iu30Var2 = iu30Var;
                he81Var2 = he81Var;
                x340Var.i0(-2000588078);
                od81Var.c(he81Var2, iu30Var2, x340Var, (i2 & 126) | ((i2 >> 3) & 896));
                x340Var.r(false);
            } else if (iC == 1) {
                od81Var = this;
                kswVar2 = kswVar;
                iu30Var2 = iu30Var;
                he81Var2 = he81Var;
                x340Var.i0(-2000585893);
                int i3 = i2 << 3;
                od81Var.e(((i2 >> 6) & 14) | (i3 & 112) | (i3 & 896) | (i2 & 7168), x340Var, kswVar2, iu30Var2, he81Var2);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -2000589708, false);
                }
                x340Var.i0(-2000583297);
                int i4 = i2 << 3;
                od81Var = this;
                kswVar2 = kswVar;
                iu30Var2 = iu30Var;
                he81Var2 = he81Var;
                od81Var.d(((i2 >> 6) & 14) | (i4 & 112) | (i4 & 896) | (i2 & 7168), x340Var, kswVar2, iu30Var2, he81Var2);
                x340Var.r(false);
            }
        } else {
            od81Var = this;
            kswVar2 = kswVar;
            iu30Var2 = iu30Var;
            he81Var2 = he81Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new md81(od81Var, he81Var2, iu30Var2, kswVar2, i);
        }
    }

    public final float i(b0k b0kVar) {
        return ((wat) ((x340) b0kVar).k(t4k.h)).M0(this.n);
    }
}
