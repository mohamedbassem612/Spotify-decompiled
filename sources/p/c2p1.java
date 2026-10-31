package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class c2p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (p.kqn1.l(r4, -r10, r2, r0) == r7) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(p.xtb0 r10, p.onm r11) {
        /*
            boolean r0 = r11 instanceof p.al71
            if (r0 == 0) goto L13
            r0 = r11
            p.al71 r0 = (p.al71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.al71 r0 = new p.al71
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.e
            r2 = 150(0x96, float:2.1E-43)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L47
            if (r1 == r5) goto L41
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            p.hm5.M(r11)
            goto La5
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r6
        L37:
            float r10 = r0.c
            int r1 = r0.b
            p.xtb0 r4 = r0.a
            p.hm5.M(r11)
            goto L8f
        L41:
            p.xtb0 r10 = r0.a
            p.hm5.M(r11)
            goto L66
        L47:
            p.hm5.M(r11)
            p.wt41 r11 = new p.wt41
            r1 = 7
            r11.<init>(r10, r1)
            p.m441 r11 = p.rwq.q(r11)
            p.yc2 r1 = new p.yc2
            r8 = 21
            r1.<init>(r11, r8)
            r0.a = r10
            r0.e = r5
            java.lang.Object r11 = p.b5p1.i(r1, r0)
            if (r11 != r7) goto L66
            goto La4
        L66:
            p.ptb0 r11 = r10.h()
            long r8 = r11.g()
            r11 = 32
            long r8 = r8 >> r11
            int r1 = (int) r8
            float r11 = (float) r1
            r5 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r11 * r5
            r5 = 500(0x1f4, float:7.0E-43)
            r8 = 4
            p.pxg1 r5 = p.irn1.o0(r2, r5, r6, r8)
            r0.a = r10
            r0.b = r1
            r0.c = r11
            r0.e = r4
            java.lang.Object r4 = p.kqn1.l(r10, r11, r5, r0)
            if (r4 != r7) goto L8d
            goto La4
        L8d:
            r4 = r10
            r10 = r11
        L8f:
            float r11 = -r10
            r5 = 0
            r8 = 6
            p.pxg1 r2 = p.irn1.o0(r2, r5, r6, r8)
            r0.a = r6
            r0.b = r1
            r0.c = r10
            r0.e = r3
            java.lang.Object r10 = p.kqn1.l(r4, r11, r2, r0)
            if (r10 != r7) goto La5
        La4:
            return r7
        La5:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c2p1.A(p.xtb0, p.onm):java.lang.Object");
    }

    public static final String B(int i) {
        return f4i1.c(i, "tools_");
    }

    public static final void a(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        byte b2;
        m4c m4cVar = fkj0.X;
        diu diuVar = ziuVar.f;
        List list = diuVar.e;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(2016229086);
        int i2 = i | (b0kVar2.i(ziuVar) ? 4 : 2) | (b0kVar2.i(qim0Var) ? 32 : 16) | (b0kVar2.i(iu30Var) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2.i0(565907158);
            String strO0 = diuVar.c.a;
            if (ihc1.y0(strO0)) {
                strO0 = cwl1.o0(b0kVar2, 2131951993);
            }
            b0kVar2.r(false);
            String str = strO0;
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, b0kVar2, box.d, 30);
            Float fS = aym.s(list);
            float fFloatValue = fS != null ? fS.floatValue() : 1.0f;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            cua cuaVar2 = cbx.b(b0kVar2).f;
            qim0 qim0VarThen = i1p1.q(qim0VarD2, er31.d(8.0f, 8.0f, 0.0f, 0.0f, 12)).then(fFloatValue > 1.0f ? u291.f(nim0Var, 1.0f) : u291.c(nim0Var, 1.0f));
            boolean zB = diuVar.d.b.b();
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objT = b0kVar2.T();
            if (z || objT == m4cVar) {
                objT = new p1(iu30Var, (byte) 22);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarThen, zB, null, null, null, (Function0) objT, 14);
            String strR = ila0.r(list);
            if (strR == null) {
                strR = "";
            }
            Uri uri = Uri.parse(strR);
            boolean z2 = i3 == 256;
            Object objT2 = b0kVar2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new qj(iu30Var, (byte) 9);
                b0kVar2.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI = b0kVar2.i(ziuVar) | (i3 == 256);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                b2 = 0;
                objT3 = new hq0(ziuVar, iu30Var, (byte) 0);
                b0kVar2.s0(objT3);
            } else {
                b2 = 0;
            }
            iu30 iu30Var3 = (iu30) objT3;
            byte b3 = i3 == 256 ? (byte) 1 : b2;
            Object objT4 = b0kVar2.T();
            if (b3 != 0 || objT4 == m4cVar) {
                objT4 = new qj(iu30Var, (byte) 10);
                b0kVar2.s0(objT4);
            }
            float f = fFloatValue;
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, iu30Var2, iu30Var3, (iu30) objT4, 0L, b0kVar2, 2359296, 0, 102302);
            cbx.a.getClass();
            eso1.h(ni7VarA, new jsl(str), qim0VarX, (p3v) null, (zvx) null, new ecx(f), mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 24576, 392);
            b0kVar2 = b0kVar2;
            gfx.b(18, apo.r(-879530813, new iq0(ziuVar, iu30Var, b2), b0kVar2), b0kVar2, 54);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void b(wk9 wk9Var, Function0 function0, Function0 function1, xho xhoVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2084563294);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(wk9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(xhoVar) : b0kVar3.i(xhoVar) ? 2048 : 1024;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uvx uvxVar = new uvx(0, (pgx) null, 2, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 379);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 1);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(null, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(1975802123, new bl9(wk9Var, b2), b0kVar3), null, apo.r(-180338582, new bl9(wk9Var, b3), b0kVar3), apo.r(-573337527, new n891(wk9Var, function1, xhoVar, (byte) 25), b0kVar3), null, null, apo.r(-1752334362, new bl9(wk9Var, (byte) 3), b0kVar3), b0kVar2, 805306432, 197040, 26045);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, wk9Var, function0, function1, xhoVar, (byte) 24);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-787237324);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 19);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            j2i j2iVar = ddi.a;
            qim0Var2 = nim0.a;
            wro1.h(gbxVar, ldxVar, qim0Var2, null, null, null, false, null, null, j2iVar, x340Var, 384, 6, 1016);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function0, i, (byte) 13);
        }
    }

    public static final void d(xtb0 xtb0Var, dl71 dl71Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        xtb0 xtb0Var2;
        dl71 dl71Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1345399556);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(dl71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                xtb0Var2 = xtb0Var;
                dl71Var2 = dl71Var;
                iu30Var2 = iu30Var;
                uk71 uk71Var = new uk71(xtb0Var2, iu30Var2, dl71Var2, (lnm) null, (byte) 0);
                x340Var.s0(uk71Var);
                objT = uk71Var;
            } else {
                xtb0Var2 = xtb0Var;
                dl71Var2 = dl71Var;
                iu30Var2 = iu30Var;
            }
            qxd0.t(xtb0Var2, x340Var, (vu30) objT);
        } else {
            xtb0Var2 = xtb0Var;
            dl71Var2 = dl71Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(xtb0Var2, dl71Var2, iu30Var2, i, (byte) 21);
        }
    }

    public static final void e(tx70 tx70Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        x340 x340Var;
        h2c h2cVar;
        qim0 qim0Var2;
        boolean z;
        rih1 rih1Var;
        tx70 tx70Var2 = tx70Var;
        gra graVar = een.h;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2048701660);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(tx70Var2) ? 4 : 2) | (x340Var2.g(qim0Var) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = dug.f(anm1.N("image_picker_screen", qim0Var), u7h.b, d4o1.a);
            gra graVar2 = een.d;
            gfh0 gfh0VarC = t1c.c(graVar2, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            h2c h2cVar2 = h2c.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = h2cVar2.a(qim0Var3, graVar2);
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new u460(iu30Var, (byte) 22);
                x340Var2.s0(objT);
            }
            cgj1.b(0, (Function0) objT, x340Var2, qim0VarA);
            Bitmap bitmap = tx70Var2.a;
            if (bitmap == null) {
                x340Var2.i0(537448899);
                x340Var2.r(false);
                h2cVar = h2cVar2;
                x340Var = x340Var2;
                qim0Var2 = qim0Var3;
                z = false;
                rih1Var = null;
                iu30Var2 = iu30Var;
            } else {
                x340Var2.i0(537448900);
                p811 p811Var = new p811();
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = new RectF();
                    x340Var2.s0(objT2);
                }
                p811Var.a = objT2;
                boolean z4 = i3 == 256;
                Object objT3 = x340Var2.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new u460(iu30Var, (byte) 23);
                    x340Var2.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean z5 = i3 == 256;
                Object objT4 = x340Var2.T();
                if (z5 || objT4 == m4cVar) {
                    objT4 = new u460(iu30Var, (byte) 24);
                    x340Var2.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                boolean z6 = i3 == 256;
                Object objT5 = x340Var2.T();
                if (z6 || objT5 == m4cVar) {
                    objT5 = new u460(iu30Var, (byte) 25);
                    x340Var2.s0(objT5);
                }
                x340Var = x340Var2;
                h2cVar = h2cVar2;
                k1p1.d(bitmap, function0, function1, (Function0) objT5, tx70Var2.c, h2cVar2.a(qim0Var3, graVar), new i3(p811Var, (byte) 9), x340Var, 0);
                qim0 qim0VarA2 = h2cVar.a(qim0Var3, een.X);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                iu30Var2 = iu30Var;
                cgj1.r(uyn1.x(qim0Var3, 16.0f), new hs20(iu30Var2, p811Var, (byte) 28), x340Var, 6);
                tx70Var2 = tx70Var;
                if (tx70Var2.b) {
                    x340Var.i0(-1523481007);
                    qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    qim0Var2 = qim0Var3;
                    boolean z7 = i3 == 256;
                    Object objT6 = x340Var.T();
                    if (z7 || objT6 == m4cVar) {
                        objT6 = new u460(iu30Var2, (byte) 26);
                        x340Var.s0(objT6);
                    }
                    cgj1.m(6, (Function0) objT6, x340Var, qim0VarB);
                    z = false;
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var3;
                    z = false;
                    x340Var.i0(-1523302261);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(538455687);
                x340 x340Var3 = x340Var;
                xto1.e(anm1.N("animated_loading_indicator", h2cVar.a(qim0Var2, graVar)), 4, 0L, 0L, x340Var3, 48, 12);
                x340Var = x340Var3;
                x340Var.r(z);
            } else {
                x340Var.i0(848620795);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((byte) 19, i, (Object) tx70Var2, iu30Var2, qim0Var);
        }
    }

    public static final void f(c380 c380Var, float f, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(346974066);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f2 = cbx.b(x340Var).b.c;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            int iX0 = (int) watVar.X0(368.0f);
            p3v p3vVar = new p3v(f);
            if (p3v.b(f, 0.0f) <= 0) {
                p3vVar = null;
            }
            qim0 qim0VarJ = u291.j(p3vVar != null ? p3vVar.a : e130.d, 0.0f, 2, u291.f(nim0.a, 1.0f));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new myg0(err0Var, (byte) 25);
                x340Var.s0(objT2);
            }
            t1c.a(lrn1.u(qim0VarJ, (iu30) objT2), x340Var, 0);
            Integer numValueOf = Integer.valueOf(err0Var.s());
            boolean zG = x340Var.g(watVar) | ((i2 & 14) == 4) | x340Var.d(f2) | x340Var.e(iX0) | x340Var.d(16.0f);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                vk71 vk71Var = new vk71(watVar, err0Var, c380Var, f2, iu30Var, iX0, (lnm) null);
                x340Var.s0(vk71Var);
                objT3 = vk71Var;
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf(c380Var, f, iu30Var, i, (byte) 11);
        }
    }

    public static final void g(max maxVar, adj1 adj1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1175023876);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(maxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            String str = s(adj1Var, x340Var).b;
            boolean z = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y0j1(iu30Var, (byte) 23);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.k(new gbx(new y50(str), function0), qim0Var, maxVar, null, null, apo.r(-1207863567, new vij1(adj1Var), x340Var), x340Var, (i3 & 112) | 196608 | ((i2 << 6) & 896), 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, maxVar, adj1Var, qim0Var, iu30Var, (byte) 24);
        }
    }

    public static final void h(int i, xtb0 xtb0Var, btd btdVar, wat watVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1808816918);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (x340Var.e(i3) ? 4 : 2) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.g(xtb0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.g(btdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.g(watVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            iu30Var2 = iu30Var;
            i4 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4 & 14;
            ven0 ven0VarS = v8r.s(Integer.valueOf(i3), x340Var);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zG = (i5 == 4) | ((i4 & 896) == 256) | ((57344 & i4) == 16384) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | x340Var.g(ven0VarS);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                tc1 tc1Var = new tc1(i3, btdVar, iu30Var2, xtb0Var, watVar, ven0VarS, (lnm) null, (byte) 25);
                x340Var.s0(tc1Var);
                objT = tc1Var;
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(i, xtb0Var, btdVar, watVar, iu30Var, i2, (byte) 19);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(118658641);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            yla.r(x340Var);
            qim0 qim0VarR = u291.r(qim0Var, 48.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, cbx.a(x340Var).a.c, er31.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            xto1.e(h2c.a.a(nim0.a, een.h), 2, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b271(qim0Var, i, (byte) 2);
        }
    }

    public static final void j(nk71 nk71Var, bb71 bb71Var, cfd cfdVar, b0k b0kVar, int i) {
        int i2;
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1163975019);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(nk71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(bb71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(cfdVar) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            i3 = i;
            x340Var.b0();
        } else {
            if (!(nk71Var instanceof lk71)) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yk71(nk71Var, bb71Var, cfdVar, i, (byte) 0);
                    return;
                }
                return;
            }
            i3 = i;
            ya71 ya71Var = (ya71) x340Var.k(nge0.a);
            int i4 = bb71Var.b;
            boolean zE = x340Var.e(i4);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = new oud((flw0) cfdVar.b, (wh71) cfdVar.c, i4);
                x340Var.s0(objT);
            }
            oud oudVar = (oud) objT;
            lk71 lk71Var = (lk71) nk71Var;
            rn71 rn71Var = lk71Var.b;
            boolean zG = x340Var.g(rn71Var) | x340Var.g(oudVar);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = ((qn71) i0p1.y(ya71Var, rn71Var.a.n())).a(oudVar);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            n271 n271Var = new n271(bb71Var.a.a.b, i4, lk71Var.c);
            boolean zG2 = x340Var.g(rn71Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                Object objInvoke = iu30Var.invoke(n271Var);
                objT3 = objInvoke instanceof xpw ? (xpw) objInvoke : null;
                x340Var.s0(objT3);
            }
            xpw xpwVar = (xpw) objT3;
            if (xpwVar != null) {
                x340Var.i0(1587243179);
                otw.c(xpwVar, n271Var, (qim0) null, wpb1.C(lk71Var.a, xpwVar, n271Var, x340Var, 0, 8), x340Var, 0, 4);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1587429613);
                x340Var.r(false);
            }
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new yk71(nk71Var, bb71Var, cfdVar, i3, (byte) 1);
        }
    }

    public static final void k(ok71 ok71Var, dl71 dl71Var, y441 y441Var, flw0 flw0Var, cfd cfdVar, xtb0 xtb0Var, q1d0 q1d0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        xtb0 xtb0Var2;
        Object obj;
        boolean z;
        Object tv1Var;
        List list;
        int i2;
        boolean z2;
        fra fraVar;
        Object obj2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-123189456);
        int i3 = i | (b0kVar2.g(ok71Var) ? 4 : 2) | (b0kVar2.g(dl71Var) ? 32 : 16) | (b0kVar2.i(y441Var) ? 256 : 128) | (b0kVar2.g(flw0Var) ? 2048 : 1024) | (b0kVar2.i(cfdVar) ? 16384 : 8192) | (b0kVar2.g(xtb0Var) ? 131072 : 65536) | (b0kVar2.i(q1d0Var) ? 1048576 : 524288) | (b0kVar2.i(iu30Var) ? 8388608 : 4194304);
        if (b0kVar2.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            List listA = mqo1.A(ok71Var.c.a());
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q(btd.f);
                b0kVar2.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT;
            ven0 ven0Var = (ven0) obj;
            if (listA != null && listA.isEmpty()) {
                z = false;
                break;
            }
            Iterator it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((bb71) it.next()).a.b.d) {
                    z = true;
                    break;
                }
            }
            int i4 = (i3 >> 15) & 14;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                ru91 ru91Var = new ru91(new stb0(xtb0Var, bjx0.X), new e9r(new bhv(2.0f, 0.1f, (byte) 1)), irn1.l0(0.0f, 0.0f, null, 7));
                b0kVar2.s0(ru91Var);
                objT2 = ru91Var;
            }
            ru91 ru91Var2 = (ru91) objT2;
            Object objT3 = b0kVar2.T();
            Object obj3 = objT3;
            if (objT3 == m4cVar) {
                hrr0 hrr0VarQ2 = v8r.q(Boolean.FALSE);
                b0kVar2.s0(hrr0VarQ2);
                obj3 = hrr0VarQ2;
            }
            ven0 ven0Var2 = (ven0) obj3;
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            Object objT4 = b0kVar2.T();
            Object obj4 = objT4;
            if (z3 || objT4 == m4cVar) {
                c861 c861Var = new c861(dl71Var, ven0Var2, (byte) 11);
                b0kVar2.s0(c861Var);
                obj4 = c861Var;
            }
            d(xtb0Var, dl71Var, (iu30) obj4, b0kVar2, i4 | i5);
            float f = ((btd) ven0Var.getValue()).b;
            Object objT5 = b0kVar2.T();
            Object obj5 = objT5;
            if (objT5 == m4cVar) {
                r9y0 r9y0Var = new r9y0(ven0Var, (byte) 24);
                b0kVar2.s0(r9y0Var);
                obj5 = r9y0Var;
            }
            f(listA, f, (iu30) obj5, b0kVar2, 384);
            if (u890.j((btd) ven0Var.getValue(), btd.f)) {
                xtb0Var2 = xtb0Var;
                b0kVar2.i0(-2030742350);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-2033812745);
                qim0 qim0VarF = u291.f(u291.z(qim0Var, (fra) null, 3), 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                Iterator it2 = listA.iterator();
                int i6 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (((bb71) it2.next()).a()) {
                        break;
                    } else {
                        i6++;
                    }
                }
                int i7 = i6;
                btd btdVar = (btd) ven0Var.getValue();
                wat watVar = (wat) b0kVar2.k(t4k.h);
                Object objT6 = b0kVar2.T();
                Object obj6 = objT6;
                if (objT6 == m4cVar) {
                    r9y0 r9y0Var2 = new r9y0(ven0Var2, (byte) 25);
                    b0kVar2.s0(r9y0Var2);
                    obj6 = r9y0Var2;
                }
                int i8 = (i3 >> 12) & 112;
                h(i7, xtb0Var, btdVar, watVar, (iu30) obj6, b0kVar2, i8 | 24576);
                float f2 = ((btd) ven0Var.getValue()).b;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF2 = u291.f(anm1.N("share.sheet.share.preview.sections.pager", u291.h(nim0Var, f2)), 1.0f);
                zzq0 zzq0VarJ = uyn1.j(((btd) ven0Var.getValue()).d, 0.0f, ((btd) ven0Var.getValue()).e, 0.0f, 10);
                boolean z4 = ok71Var.e && !((Boolean) ven0Var2.getValue()).booleanValue();
                d36 d36Var = new d36(((btd) ven0Var.getValue()).c, true, new um5(false));
                fra fraVar2 = een.O0;
                boolean z5 = (i3 & 3670016) == 1048576 || b0kVar2.i(q1d0Var);
                Object objT7 = b0kVar2.T();
                Object obj7 = objT7;
                if (z5 || objT7 == m4cVar) {
                    c861 c861Var2 = new c861(q1d0Var, ven0Var, (byte) 12);
                    b0kVar2.s0(c861Var2);
                    obj7 = c861Var2;
                }
                ujo1.e(qim0VarF2, xtb0Var, zzq0VarJ, d36Var, fraVar2, ru91Var2, z4, null, (iu30) obj7, b0kVar2, i8 | 196608, 264);
                b0kVar2 = b0kVar2;
                Boolean bool = ok71Var.f;
                boolean zG = ((i3 & 14) == 4) | b0kVar2.g(listA) | b0kVar2.e(i7) | ((i3 & 458752) == 131072) | ((i3 & 29360128) == 8388608);
                Object objT8 = b0kVar2.T();
                if (zG || objT8 == m4cVar) {
                    list = listA;
                    i2 = 1;
                    tv1Var = new tv1((Object) ok71Var, (Object) list, i7, (Object) xtb0Var, (Object) iu30Var, (lnm) null, (byte) 11);
                    xtb0Var2 = xtb0Var;
                    b0kVar2.s0(tv1Var);
                } else {
                    xtb0Var2 = xtb0Var;
                    list = listA;
                    tv1Var = objT8;
                    i2 = 1;
                }
                qxd0.t(bool, b0kVar2, (vu30) tv1Var);
                Object objT9 = b0kVar2.T();
                Object obj8 = objT9;
                if (objT9 == m4cVar) {
                    mdt mdtVarA = yv91.a(new wt41(xtb0Var2, (byte) 6));
                    b0kVar2.s0(mdtVarA);
                    obj8 = mdtVarA;
                }
                tob1 tob1Var = (tob1) obj8;
                if (list.size() <= i2) {
                    z2 = false;
                    b0kVar2.i0(851024065);
                    b0kVar2.r(false);
                } else {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                String str = ((bb71) it3.next()).a.c.c;
                                if (str == null || str.length() == 0) {
                                    z2 = false;
                                    b0kVar2.i0(851024065);
                                    b0kVar2.r(false);
                                }
                            }
                        }
                    }
                    b0kVar2.i0(850084207);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
                    Object objT10 = b0kVar2.T();
                    if (objT10 == m4cVar) {
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(((bb71) it4.next()).a.a.b);
                        }
                        jm71 jm71Var = new jm71(mqo1.A(arrayList));
                        b0kVar2.s0(jm71Var);
                        objT10 = jm71Var;
                    }
                    jm71 jm71Var2 = (jm71) objT10;
                    int i9 = (b0kVar2.g(tob1Var) ? 1 : 0) | ((i3 & 7168) == 2048 ? i2 : 0);
                    Object objT11 = b0kVar2.T();
                    if (i9 != 0 || objT11 == m4cVar) {
                        fraVar = null;
                        lm61 lm61Var = new lm61(tob1Var, flw0Var, (lnm) null, (byte) 12);
                        b0kVar2.s0(lm61Var);
                        obj2 = lm61Var;
                    } else {
                        fraVar = null;
                        obj2 = objT11;
                    }
                    qxd0.t(rih1.a, b0kVar2, (vu30) obj2);
                    Object objT12 = b0kVar2.T();
                    if (objT12 == m4cVar) {
                        objT12 = new mm71((nn61) y441Var.a, list, (wh71) y441Var.b, (hyl0) y441Var.c, (flw0) y441Var.d);
                        b0kVar2.s0(objT12);
                    }
                    mm71 mm71Var = (mm71) objT12;
                    ipb1 ipb1VarC = wpb1.C("share.sheet.tabs", mm71Var, jm71Var2, b0kVar2, 6, 8);
                    b0kVar2 = b0kVar2;
                    otw.c(mm71Var, jm71Var2, anm1.N("share.sheet.tabs", u291.z(u291.f(nim0Var, 1.0f), fraVar, 3)), ipb1VarC, b0kVar2, 384, 0);
                    z2 = false;
                    b0kVar2.r(false);
                }
                if (z) {
                    b0kVar2.i0(851081632);
                    l(((Number) tob1Var.getValue()).floatValue(), ok71Var.a, list, cfdVar, b0kVar2, (i3 >> 3) & 7168);
                    b0kVar2.r(z2);
                } else {
                    b0kVar2.i0(851390113);
                    b0kVar2.r(z2);
                }
                b0kVar2.r(i2);
                b0kVar2.r(z2);
            }
        } else {
            xtb0Var2 = xtb0Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(ok71Var, dl71Var, y441Var, flw0Var, cfdVar, xtb0Var2, q1d0Var, iu30Var, qim0Var, i, (byte) 9);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r20v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v17 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r25v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void l(float r25, p.c380 r26, p.c380 r27, p.cfd r28, p.b0k r29, int r30) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c2p1.l(float, p.c380, p.c380, p.cfd, p.b0k, int):void");
    }

    public static final void m(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, adj1 adj1Var) {
        hax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2087746506);
        int i2 = (x340Var.g(adj1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if ((adj1Var instanceof xcj1) || (adj1Var instanceof zcj1)) {
            x340Var.i0(634951286);
            i(qim0Var, x340Var, (i2 >> 3) & 14);
            x340Var.r(false);
        } else {
            x340Var.i0(634998592);
            if (adj1Var instanceof ycj1) {
                x340Var.i0(574676206);
                haxVar = new hax(cwl1.o0(x340Var, 2131952019));
                x340Var.r(false);
            } else {
                x340Var.i0(574678878);
                x340Var.r(false);
                haxVar = jax.a;
            }
            g(haxVar, adj1Var, qim0Var, iu30Var, x340Var, (i2 << 3) & 8176);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pej1(adj1Var, qim0Var, iu30Var, i, (byte) 3);
        }
    }

    public static poy0 n(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, iu30 iu30Var3, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 16) != 0) {
            iu30Var3 = k8b0.f;
        }
        qtr qtrVar = new qtr();
        iu30Var3.invoke(qtrVar);
        return new poy0(new jwa0(iu30Var, (byte) 17), iu30Var2, vu30Var, qtrVar, true, bhh1Var);
    }

    public static poy0 o(iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 8) != 0) {
            iu30Var2 = ecd0.b1;
        }
        qtr qtrVar = new qtr();
        iu30Var2.invoke(qtrVar);
        return new poy0(new jwa0(iu30Var, (byte) 18), new zmd0(vu30Var, iu30Var, (byte) 0), vu30Var, qtrVar, true, bhh1Var);
    }

    public static final nla0 p(Object obj, String str) {
        Object next;
        Collection collectionA = ((yka0) rc11.a.b(obj.getClass()).c.getValue()).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionA) {
            lft lftVar = (lft) obj2;
            if (!(lftVar.t().L() != null) && (lftVar instanceof nla0)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((nla0) next).getName(), str));
        nla0 nla0Var = (nla0) next;
        if (nla0Var == null) {
            return null;
        }
        yoi1.N(nla0Var);
        return nla0Var;
    }

    public static final kma0 q(Object obj, String str) {
        Object next;
        Collection collectionA = ((yka0) rc11.a.b(obj.getClass()).c.getValue()).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionA) {
            lft lftVar = (lft) obj2;
            if (!(lftVar.t().L() != null) && (lftVar instanceof kma0)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((kma0) next).getName(), str));
        kma0 kma0Var = (kma0) next;
        if (kma0Var != null) {
            yoi1.N(kma0Var);
        } else {
            kma0Var = null;
        }
        if (kma0Var != null) {
            return kma0Var;
        }
        return null;
    }

    public static final String r(m0u0 m0u0Var) {
        String str = (String) m0u0Var.a.d.get("endvideo_track_uri");
        if (str != null) {
            return str;
        }
        hhg1.n("Required value was null.");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final dl70 s(adj1 adj1Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        dl70 dl70Var;
        dl70 dl70Var2;
        dl70 dl70Var3;
        if (adj1Var instanceof bdj1) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1988851198);
            if (((bdj1) adj1Var).b) {
                x340Var.i0(97328408);
                dl70Var3 = new dl70(cwl1.o0(x340Var, 2131952018), cwl1.o0(x340Var, 2131952017), aux.c);
                x340Var.r(false);
            } else {
                x340Var.i0(97335281);
                dl70Var3 = new dl70(cwl1.o0(x340Var, 2131952016), cwl1.o0(x340Var, 2131952015), ztx.c);
                x340Var.r(false);
            }
            x340Var.r(false);
            return dl70Var3;
        }
        if (adj1Var instanceof ycj1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1988852926);
            if (((ycj1) adj1Var).b) {
                x340Var2.i0(97328408);
                dl70Var2 = new dl70(cwl1.o0(x340Var2, 2131952018), cwl1.o0(x340Var2, 2131952017), aux.c);
                x340Var2.r(false);
            } else {
                x340Var2.i0(97335281);
                dl70Var2 = new dl70(cwl1.o0(x340Var2, 2131952016), cwl1.o0(x340Var2, 2131952015), ztx.c);
                x340Var2.r(false);
            }
            x340Var2.r(false);
            return dl70Var2;
        }
        if (!(adj1Var instanceof cdj1)) {
            if (!(adj1Var instanceof xcj1) && !(adj1Var instanceof zcj1)) {
                throw p3d1.k((x340) b0kVar, 1988849810, false);
            }
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(1988857277);
            x340Var3.r(false);
            n9v.f(adj1Var, " state does not use icons for UI");
            return null;
        }
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.i0(1988854814);
        if (((cdj1) adj1Var).b) {
            x340Var4.i0(97328408);
            dl70Var = new dl70(cwl1.o0(x340Var4, 2131952018), cwl1.o0(x340Var4, 2131952017), aux.c);
            x340Var4.r(false);
        } else {
            x340Var4.i0(97335281);
            dl70Var = new dl70(cwl1.o0(x340Var4, 2131952016), cwl1.o0(x340Var4, 2131952015), ztx.c);
            x340Var4.r(false);
        }
        x340Var4.r(false);
        return dl70Var;
    }

    public static boolean t(m0u0 m0u0Var) {
        return Boolean.parseBoolean((String) m0u0Var.a.d.get("is_advertisement"));
    }

    public static boolean u(o2u0 o2u0Var) {
        return Boolean.parseBoolean((String) o2u0Var.d.get("is_advertisement"));
    }

    public static boolean v(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_backgroundable")) || l4o1.F(contextTrack) || l4o1.E(contextTrack);
    }

    public static boolean w() {
        return hzd1.a;
    }

    public static boolean x() {
        return izd1.a;
    }

    public static final boolean y(b0k b0kVar) {
        return (((Configuration) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
    }

    public static final bt31 z(a8k0 a8k0Var) {
        Double dA0;
        String str = a8k0Var.b;
        String str2 = a8k0Var.a;
        String str3 = (String) a8k0Var.d.get("item.speed");
        return new bt31(str2, str, (str3 == null || (dA0 = nhc1.a0(str3)) == null) ? 0.0d : dA0.doubleValue());
    }
}
