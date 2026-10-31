package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.messages.ZeroFrictionAuthentication;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x3p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:95:0x01ef  */
    public static final void a(float f, hnk0 hnk0Var, String str, String str2, b0k b0kVar, int i) {
        Enum r4;
        Enum r16;
        lnm lnmVar;
        Object obj;
        Object imk0Var;
        String str3;
        m4c m4cVar;
        Object imk0Var2;
        String str4;
        tob1 tob1Var;
        lnm lnmVar2;
        b0k b0kVar2;
        ncf0 ncf0Var;
        Bitmap bitmapCreateBitmap;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1357105772);
        int i2 = i | (b0kVar3.d(f) ? 4 : 2) | (b0kVar3.g(hnk0Var) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.g(str2) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ncf0 ncf0VarG = h5p1.G(new ocf0(2131886160), null, null, b0kVar3, 0, 62);
            kbf0 kbf0VarS = m5n1.S(b0kVar3);
            if ((hnk0Var instanceof fnk0) || (hnk0Var instanceof gnk0)) {
                r16 = null;
            } else {
                if (hnk0Var instanceof dnk0) {
                    r4 = w17.b;
                } else if (hnk0Var instanceof cnk0) {
                    r4 = w17.c;
                } else {
                    if (!(hnk0Var instanceof bnk0)) {
                        eg.o();
                        return;
                    }
                    r4 = w17.d;
                }
                r16 = r4;
            }
            gw70 gw70Var = (gw70) b0kVar3.k(oi7.a);
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                Drawable drawable = context.getDrawable(2131233988);
                if (drawable == null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    lnmVar = null;
                } else {
                    lnmVar = null;
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmapCreateBitmap = bitmapCreateBitmap2;
                }
                b0kVar3.s0(bitmapCreateBitmap);
                obj = bitmapCreateBitmap;
            } else {
                lnmVar = null;
                obj = objT;
            }
            Bitmap bitmap = (Bitmap) obj;
            fcf0 fcf0VarC = ncf0VarG.c();
            lnm lnmVar3 = rih1.a;
            if (fcf0VarC == null) {
                b0kVar3.i0(-1010167841);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1010167840);
                boolean zG = b0kVar3.g(fcf0VarC);
                Object objT2 = b0kVar3.T();
                if (zG || objT2 == m4cVar2) {
                    u(bitmap, fcf0VarC, "6");
                    u(bitmap, fcf0VarC, "4");
                    b0kVar3.s0(lnmVar3);
                }
                b0kVar3.r(false);
            }
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar2) {
                objT3 = v8r.q(lnmVar);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar2) {
                objT4 = v8r.q(lnmVar);
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var2 = (ven0) objT4;
            boolean zI = ((i2 & 896) == 256) | b0kVar3.i(ven0Var) | b0kVar3.i(gw70Var);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar2) {
                str3 = str;
                m4cVar = m4cVar2;
                imk0Var = new imk0(str3, gw70Var, ven0Var, lnmVar, (byte) 0);
                b0kVar3.s0(imk0Var);
            } else {
                str3 = str;
                imk0Var = objT5;
                m4cVar = m4cVar2;
            }
            qxd0.t(str3, b0kVar3, (vu30) imk0Var);
            boolean zI2 = b0kVar3.i(tob1Var2) | ((i2 & 7168) == 2048) | b0kVar3.i(gw70Var);
            Object objT6 = b0kVar3.T();
            if (zI2 || objT6 == m4cVar) {
                str4 = str2;
                tob1Var = tob1Var2;
                imk0Var2 = new imk0(str4, gw70Var, tob1Var, lnmVar, (byte) 1);
                b0kVar3.s0(imk0Var2);
            } else {
                str4 = str2;
                imk0Var2 = objT6;
                tob1Var = tob1Var2;
            }
            qxd0.t(str4, b0kVar3, (vu30) imk0Var2);
            boolean zG2 = b0kVar3.g(ncf0VarG.c()) | b0kVar3.g((Bitmap) ven0Var.getValue()) | b0kVar3.g((Bitmap) tob1Var.getValue());
            Object objT7 = b0kVar3.T();
            if (zG2 || objT7 == m4cVar) {
                fcf0 fcf0VarC2 = ncf0VarG.c();
                if (fcf0VarC2 == null) {
                    lnmVar2 = lnmVar;
                } else {
                    Bitmap bitmap2 = (Bitmap) ven0Var.getValue();
                    if (bitmap2 != null) {
                        u(bitmap2, fcf0VarC2, "6");
                    }
                    Bitmap bitmap3 = (Bitmap) tob1Var.getValue();
                    if (bitmap3 != null) {
                        u(bitmap3, fcf0VarC2, "4");
                        lnmVar2 = lnmVar3;
                    } else {
                        lnmVar2 = lnmVar;
                    }
                }
                b0kVar3.s0(lnmVar2);
            }
            fcf0 fcf0VarC3 = ncf0VarG.c();
            boolean zI3 = b0kVar3.i(ncf0VarG) | b0kVar3.e(r16 == null ? -1 : r16.ordinal()) | b0kVar3.i(kbf0VarS);
            Object objT8 = b0kVar3.T();
            if (zI3 || objT8 == m4cVar) {
                b0kVar2 = b0kVar3;
                ncf0Var = ncf0VarG;
                wkk0 wkk0Var = new wkk0(r16, kbf0VarS, ncf0Var, lnmVar, (byte) 1);
                b0kVar2.s0(wkk0Var);
                objT8 = wkk0Var;
            } else {
                ncf0Var = ncf0VarG;
                b0kVar2 = b0kVar3;
            }
            qxd0.s(r16, fcf0VarC3, (vu30) objT8, b0kVar2);
            b0kVar2.f0(1491465772, b0kVar2.K((Bitmap) ven0Var.getValue(), (Bitmap) tob1Var.getValue()));
            fcf0 fcf0VarC4 = ncf0Var.c();
            boolean zI4 = b0kVar2.i(kbf0VarS);
            Object objT9 = b0kVar2.T();
            if (zI4 || objT9 == m4cVar) {
                objT9 = new uk1(kbf0VarS, (byte) 13);
                b0kVar2.s0(objT9);
            }
            b0k b0kVar4 = b0kVar2;
            mp10.e(fcf0VarC4, (Function0) objT9, u291.h(u291.f(nim0.a, 1.0f), f), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, mif1.R0, false, false, (Map) null, (jj7) null, false, b0kVar4, 0, 0, 64504);
            b0kVar3 = b0kVar4;
            b0kVar3.r(false);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(f, (Object) hnk0Var, (Object) str, (Object) str2, i, (byte) 9);
        }
    }

    public static final void b(r1q0 r1q0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-287601557);
        int i2 = i | 2 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                s1q0 s1q0VarA = vfe0.a(x340Var);
                r1q0Var = s1q0VarA != null ? s1q0VarA.J() : null;
            } else {
                x340Var.b0();
            }
            x340Var.s();
            ven0 ven0VarS = v8r.s(function0, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new eu9(ven0VarS);
                x340Var.s0(objT);
            }
            eu9 eu9Var = (eu9) objT;
            boolean zI = x340Var.i(r1q0Var) | x340Var.i(eu9Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new kd8(r1q0Var, eu9Var, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.i(r1q0Var, (iu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(r1q0Var, function0, i, (byte) 7);
        }
    }

    public static final void c(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1632687860);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarE = dug.e(dug.f(u291.d(qim0Var, 1.0f), z4p1.e(i), d4o1.a), v9c.s(p7h.M(new u7h[]{new u7h(f5p1.k(x340Var, 2131100238)), new u7h(f5p1.k(x340Var, 2131100237))}), 0.0f, 0.0f, 14), null, 0.0f, 6);
            Float fValueOf = Float.valueOf(0.0f);
            long j = u7h.j;
            t1c.a(dug.e(qim0VarE, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(j)), new mmr0(Float.valueOf(0.65f), new u7h(j)), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b))}, 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 22, i, i2, qim0Var);
        }
    }

    public static final void d(fcf0 fcf0Var, kbf0 kbf0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        b0k b0kVar2;
        kbf0 kbf0Var2 = kbf0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-25174867);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(fcf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(kbf0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= b0kVar3.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zI = b0kVar3.i(fcf0Var) | ((i3 & 896) == 256) | b0kVar3.i(kbf0Var2) | ((i3 & 7168) == 2048);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                f1d0 f1d0Var = new f1d0(fcf0Var, z2, kbf0Var2, iu30Var, (lnm) null);
                kbf0Var2 = kbf0Var2;
                b0kVar3.s0(f1d0Var);
                objT = f1d0Var;
            }
            int i4 = i3 & 14;
            qxd0.t(fcf0Var, b0kVar3, (vu30) objT);
            boolean zI2 = b0kVar3.i(kbf0Var2);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new uk1(kbf0Var2, (byte) 14);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            mp10.e(fcf0Var, (Function0) objT2, fc11.n(u291.d(nim0.a, 1.0f), 16.0f, 16.0f, d4o1.a), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, mif1.V0, false, false, (Map) null, (jj7) null, false, b0kVar2, i4, 0, 64504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(fcf0Var, kbf0Var, z, iu30Var, i, (byte) 3);
        }
    }

    public static final void e(hnk0 hnk0Var, String str, String str2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(602154534);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(hnk0Var) : x340Var.i(hnk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(u291.d(nim0.a, 1.0f), (tl3) null, apo.r(641054352, new iwf0(hnk0Var, str, str2, (byte) 25), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(hnk0Var, str, str2, i, (byte) 0);
        }
    }

    public static final void f(int i, hnk0 hnk0Var, String str, String str2, fcf0 fcf0Var, kbf0 kbf0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(742707799);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.g(hnk0Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.i(fcf0Var) ? 16384 : 8192) | (x340Var.i(kbf0Var) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.i(iu30Var) ? 8388608 : 4194304);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = z7i0.V0;
                x340Var.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarD, idn0Var, null, false, null, null, (Function0) objT2, 28);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            d(fcf0Var, kbf0Var, z, iu30Var, x340Var, (i3 >> 12) & 8190);
            c(i, i3 & 14, x340Var, d9y0.k(nim0Var, 0.8f));
            e(hnk0Var, str, str2, x340Var, (i3 >> 3) & 1022);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1(i, hnk0Var, str, str2, fcf0Var, kbf0Var, z, iu30Var, i2);
        }
    }

    public static final void g(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1108881486);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).k, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9y0(str, i, (byte) 12);
        }
    }

    public static final void h(adj1 adj1Var, b0k b0kVar, int i) {
        h311 h311VarV;
        vij1 vij1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1646976246);
        byte b2 = 2;
        int i2 = (x340Var.g(adj1Var) ? 4 : 2) | i | (x340Var.e(0) ? 32 : 16);
        byte b3 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            czs czsVar = (czs) x340Var.k(abj1.a);
            av0 av0Var = (av0) x340Var.k(ibj1.c);
            taj1 taj1VarA = adj1Var.a();
            boolean zC = adj1Var.c();
            uoa uoaVarA = czsVar.a();
            if (uoaVarA == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    vij1Var = new vij1(adj1Var, i, b2);
                }
            } else {
                fq0 fq0Var = taj1VarA.a;
                List list = taj1VarA.e;
                boolean zG = x340Var.g(fq0Var.h());
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = c13.l(uoaVarA.e() != null, x340Var);
                }
                ven0 ven0Var = (ven0) objT;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.valueOf(adj1Var instanceof bdj1));
                }
                boolean zG2 = x340Var.g(taj1VarA.a.h());
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = av0Var.b(taj1VarA, list);
                    if (objT2 == null) {
                        hhg1.n("Required value was null.");
                        return;
                    }
                    x340Var.s0(objT2);
                }
                o2u0 o2u0Var = (o2u0) objT2;
                if (uoaVarA.e() == null && adj1Var.isVisible() && (adj1Var instanceof xcj1)) {
                    uoaVarA.g(o2u0Var);
                }
                if (adj1Var instanceof cdj1) {
                    o2u0 o2u0VarB = av0Var.b(taj1VarA, list);
                    if (o2u0VarB == null) {
                        hhg1.n("Required value was null.");
                        return;
                    }
                    uoaVarA.g(o2u0VarB);
                }
                boolean zI = ((i2 & 14) == 4) | x340Var.i(uoaVarA);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new mah1(uoaVarA, adj1Var, (byte) 25);
                    x340Var.s0(objT3);
                }
                qxd0.C(rih1.a, (Function0) objT3, x340Var);
                if (!zC) {
                    uoaVarA.p(adj1Var.e() ? 3 : 1);
                }
                gfx.b(1, apo.r(418875327, new ofi0(adj1Var, ven0Var, uoaVarA, taj1VarA, zC, czsVar), x340Var), x340Var, 54);
            }
            h311VarV.d = vij1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            vij1Var = new vij1(adj1Var, i, b3);
            h311VarV.d = vij1Var;
        }
    }

    public static final void i(uoa uoaVar, b3k1 b3k1Var, a7j1 a7j1Var, boolean z, czs czsVar, qim0 qim0Var, b0k b0kVar, int i) {
        b3k1 b3k1Var2;
        b0k b0kVar2;
        int i2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2045082533);
        int i3 = i | (b0kVar3.i(uoaVar) ? 4 : 2) | (b0kVar3.e(b3k1Var.ordinal()) ? 32 : 16) | (b0kVar3.i(a7j1Var) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(czsVar) ? 16384 : 8192) | (b0kVar3.i(qim0Var) ? 131072 : 65536);
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean zI = b0kVar3.i(uoaVar);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                i2 = i3;
                hcf1 hcf1Var = new hcf1(1, uoaVar, uoa.class, "removeSurface", "removeSurface(Lcom/spotify/betamax/player/VideoSurfaceView;)V", 0, (byte) 21);
                b0kVar3.s0(hcf1Var);
                objT = hcf1Var;
            } else {
                i2 = i3;
            }
            iu30 iu30Var = (nla0) objT;
            boolean zI2 = b0kVar3.i(a7j1Var) | ((i2 & 112) == 32) | b0kVar3.i(czsVar);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                b3k1Var2 = b3k1Var;
                objT2 = new jyi1(a7j1Var, b3k1Var2, czsVar, (byte) 4);
                b0kVar3.s0(objT2);
            } else {
                b3k1Var2 = b3k1Var;
            }
            iu30 iu30Var2 = (iu30) objT2;
            iu30 iu30Var3 = iu30Var;
            boolean zI3 = ((i2 & 7168) == 2048) | b0kVar3.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e5: ARITH (r2v11 'zI3' boolean) = (wrap boolean:?: TERNARY null = ((wrap int:0x00d9: ARITH (r15v1 'i2' int) & (7168 int) A[WRAPPED] (LINE:218)) == (2048 int)) ? true : false) | (wrap boolean:0x00e1: INVOKE (r12v1 'b0kVar3' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r2v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:226)) A[DECLARE_VAR] (LINE:230) in method: p.x3p1.i(p.uoa, p.b3k1, p.a7j1, boolean, p.czs, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.x3p1.i(p.uoa, p.b3k1, p.a7j1, boolean, p.czs, p.qim0, p.b0k, int):void");
        }

        public static final azf j(l4h1 l4h1Var, Object obj) {
            return new azf(l4h1Var, obj, (byte) 1);
        }

        public static List k(String str) {
            try {
                List listP0 = ihc1.P0(str, new char[]{';'}, 6);
                ArrayList arrayList = new ArrayList(q7h.U(listP0, 10));
                Iterator it = listP0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Base64.decode((String) it.next(), 0));
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ZeroFrictionAuthentication.o((byte[]) it2.next()));
                }
                return arrayList2;
            } catch (Exception unused) {
                return z6x.a;
            }
        }

        public static final js20 l(xy50 xy50Var, bs50 bs50Var, xkm0 xkm0Var) {
            return a4p1.h(xy50Var, k8b0.U0, ibi0.f, bs50Var, xkm0Var);
        }

        public static js20 m(mr20 mr20Var, iu30 iu30Var, vu30 vu30Var, o8n o8nVar, iu30 iu30Var2, int i) {
            if ((i & 8) != 0) {
                o8nVar = igu.b;
            }
            o8n o8nVar2 = o8nVar;
            if ((i & 16) != 0) {
                iu30Var2 = ll20.a1;
            }
            qtr qtrVar = new qtr();
            iu30Var2.invoke(qtrVar);
            return new js20(new hdo(mr20Var, (byte) 1), iu30Var, vu30Var, qtrVar, false, o8nVar2, false);
        }

        public static js20 n(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, o8n o8nVar, iu30 iu30Var3, int i) {
            if ((i & 8) != 0) {
                o8nVar = igu.b;
            }
            if ((i & 16) != 0) {
                iu30Var3 = a9o.R0;
            }
            return a4p1.h(iu30Var, iu30Var2, vu30Var, o8nVar, iu30Var3);
        }

        public static final o3r o() {
            return w3p1.n(new l4r(pwc0.r, 2, y3r.c, new j4r(z3r.b), y3r.O0), new l4r(new xv00(rc11.a.b(l1z.class)), 2, y3r.S0, new j4r(z3r.f), y3r.V0), ido.O0);
        }

        public static String p(List list) {
            if (list.isEmpty()) {
                return null;
            }
            return o7h.y0(list, ";", (String) null, (String) null, fft0.c1, 30);
        }

        public static final ViewGroup q(View view) {
            if (u890.j(view.getTag(), 2131430188)) {
                if (view instanceof ViewGroup) {
                    return (ViewGroup) view;
                }
                return null;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return q(view2);
            }
            return null;
        }

        public static final u380 r(hll hllVar) {
            List list = hllVar.d;
            return mqo1.C(dm61.B0(new lyl[]{list.contains(fll.c) ? kyl.a : null, list.contains(fll.b) ? jyl.a : null}));
        }

        public static final n511 s(p5t0 p5t0Var, int i, cgg1 cgg1Var, y9e1 y9e1Var, boolean z, int i2) {
            n511 n511VarC = y9e1Var != null ? y9e1Var.c(cgg1Var.b.o(i)) : n511.e;
            int iI0 = p5t0Var.i0(2.0f);
            float f = n511VarC.a;
            return n511.b(n511VarC, z ? (i2 - f) - iI0 : f, 0.0f, z ? i2 - f : iI0 + f, 10);
        }

        public static final b180 t() {
            b180 b180Var = b;
            if (b180Var != null) {
                return b180Var;
            }
            a180 a180Var = new a180("Encore.Vector.Search16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(7.0f, 1.75f);
            cwh0VarG.c(5.25f, 5.25f, true, false, 0.0f, 10.5f);
            cwh0VarG.c(5.25f, 5.25f, false, false, 0.0f, -10.5f);
            cwh0VarG.l(0.25f, 7.0f);
            cwh0VarG.c(6.75f, 6.75f, true, true, 12.096f, 4.12f);
            cwh0VarG.k(3.184f, 3.185f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG.j(11.304f, 12.2f);
            cwh0VarG.b(6.75f, 6.75f, false, true, 0.25f, 7.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180 b180VarB = a180Var.b();
            b = b180VarB;
            return b180VarB;
        }

        public static final void u(Bitmap bitmap, fcf0 fcf0Var, String str) {
            hdf0 hdf0Var = (hdf0) ((HashMap) fcf0Var.c()).get(str);
            if (hdf0Var != null) {
                int i = hdf0Var.b;
                int i2 = hdf0Var.a;
                if (bitmap.getWidth() != i2 || bitmap.getHeight() != i) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, i2, i, true);
                }
                hdf0Var.f = bitmap;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object v(String str, onm onmVar, gw70 gw70Var) {
            kmk0 kmk0Var;
            if (onmVar instanceof kmk0) {
                kmk0Var = (kmk0) onmVar;
                int i = kmk0Var.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    kmk0Var.b = i - Integer.MIN_VALUE;
                } else {
                    kmk0Var = new kmk0(onmVar);
                }
            } else {
                kmk0Var = new kmk0(onmVar);
            }
            Object objJ = kmk0Var.a;
            int i2 = kmk0Var.b;
            try {
                if (i2 == 0) {
                    hm5.M(objJ);
                    ixg ixgVarF = gw70Var.f(str);
                    ixgVarF.g = false;
                    Single singleI = ixgVarF.i();
                    kmk0Var.b = 1;
                    objJ = fc11.j(singleI, kmk0Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ);
                }
                return (Bitmap) objJ;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                return null;
            }
        }

        public static final m9r0 w(mr20 mr20Var, yqg yqgVar) {
            return new m9r0(mr20Var, yqgVar, (byte) 14);
        }
    }
