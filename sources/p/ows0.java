package p;

import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ows0 {
    public static final long a = z4p1.e(436207616);
    public static final long b = z4p1.g(4283650899L);
    public static final float c = 12.0f;
    public static final float d = 8.0f;
    public static final float e = 8.0f;
    public static final nux f;
    public static final pux g;
    public static final pux h;

    static {
        nkx nkxVar = nkx.c;
        f = new nux(nkxVar, nkxVar);
        y9c y9cVar = new y9c(v9c.s(p7h.M(new u7h[]{new u7h(z4p1.g(4283650899L)), new u7h(z4p1.e(1300990859))}), 0.0f, 0.0f, 14));
        g = new pux(y9cVar, y9cVar);
        i9h i9hVar = new i9h(z4p1.g(4286545791L));
        h = new pux(i9hVar, i9hVar);
    }

    public static final void a(gxs0 gxs0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2103440835);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gxs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qpl qplVar = gxs0Var.c;
            int i3 = i2 << 6;
            e("allboarding_picker_artist_item", gxs0Var.d, qplVar.b, function0, qim0Var, null, apo.r(180563864, new jws0(gxs0Var, qplVar, b2), x340Var), x340Var, (i3 & 7168) | 1572870 | (i3 & 57344), 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kws0(gxs0Var, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(gxs0 gxs0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(798996722);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gxs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ckm0 ckm0Var = gxs0Var.c;
            String str = ckm0Var.g;
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new u7h(j(str));
                x340Var.s0(objT);
            }
            int i3 = i2 << 6;
            e("allboarding_picker_more_item", false, ckm0Var.b, function0, qim0Var, cwl1.n0(2131952266, new Object[]{ckm0Var.b}, x340Var), apo.r(-55920435, new nk7(((u7h) objT).a, (Object) ckm0Var, (byte) 7), x340Var), x340Var, (i3 & 7168) | 1572918 | (i3 & 57344), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kws0(gxs0Var, function0, qim0Var, i, (byte) 1);
        }
    }

    public static final void c(gxs0 gxs0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1027375074);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gxs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w4a w4aVar = gxs0Var.c;
            int i3 = i2 << 6;
            e("allboarding_picker_banner_item", gxs0Var.d, w4aVar.b, function0, qim0Var, null, apo.r(-983587523, new hws0(gxs0Var, w4aVar, b2), x340Var), x340Var, (i3 & 7168) | 1572870 | (i3 & 57344), 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kws0(gxs0Var, function0, qim0Var, i, (byte) 2);
        }
    }

    public static final void d(String str, hw61 hw61Var, qux quxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-821701062);
        int i2 = (x340Var.i(qim0Var) ? 2048 : 1024) | i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(hw61Var) ? 32 : 16) | (x340Var.i(quxVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Uri uri = null;
            if (str.length() != 0) {
                try {
                    uri = Uri.parse(str);
                } catch (RuntimeException e2) {
                    n57.g("Malformed image url in picker grid: ".concat(str), e2);
                }
            }
            if (uri != null) {
                x340Var.i0(2017478839);
                eso1.e(uri, isl.a, i1p1.q(qim0Var, hw61Var), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, quxVar, false, false, x340Var, ((i2 << 21) & 1879048192) | 224304, 0, 3520);
                x340Var.r(false);
            } else {
                x340Var.i0(2017723367);
                qim0 qim0VarQ = i1p1.q(qim0Var, hw61Var);
                uwr uwrVar = cbx.a;
                t1c.a(dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), d4o1.a), x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, str, hw61Var, quxVar, qim0Var, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:113:0x021e  */
    /* JADX WARN: Code duplicated, block: B:116:0x024a  */
    /* JADX WARN: Code duplicated, block: B:117:0x024e  */
    /* JADX WARN: Code duplicated, block: B:119:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x026e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0108  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    /* JADX WARN: Code duplicated, block: B:95:0x017f  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    public static final void e(String str, boolean z, String str2, Function0 function0, qim0 qim0Var, String str3, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        String str4;
        boolean z2;
        String str5;
        h311 h311VarV;
        String str6;
        View view;
        Object objT;
        m4c m4cVar;
        idn0 idn0Var;
        float f2;
        tob1 tob1VarB;
        String str7;
        boolean zI;
        Object objT2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objT3;
        boolean z6;
        boolean z7;
        Object objT4;
        String str8;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z8;
        n4k n4kVar;
        boolean zG;
        Object objT5;
        String strN0;
        int i4;
        j2i j2iVar2 = j2iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1542814775);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                str4 = str3;
                i3 |= x340Var.g(str4) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0Var = (idn0) objT;
                if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                    f2 = 0.98f;
                } else {
                    f2 = 1.0f;
                }
                tob1VarB = z95.b(f2, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6), "pressScale", (iu30) null, x340Var, 3072, 20);
                if (str6 == null) {
                    if (z) {
                        x340Var.i0(-1549244938);
                        strN0 = cwl1.n0(2131952267, new Object[]{str2}, x340Var);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1549140716);
                        strN0 = cwl1.n0(2131952268, new Object[]{str2}, x340Var);
                        x340Var.r(false);
                    }
                    str7 = strN0;
                } else {
                    str7 = str6;
                }
                zI = x340Var.i(tob1VarB);
                objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new lws0(tob1VarB, (byte) 0);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarB = py20.b(i541.C(qim0Var, (iu30) objT2), idn0Var, 0L, (hw61) null, (p3v) null, x340Var, 0, 30);
                x340Var = x340Var;
                qim0 qim0VarN = anm1.N(str, qim0VarB);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | z3;
                objT3 = x340Var.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new cl1(z, str2, (byte) 24);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarB2 = s161.b(qim0VarN, false, (iu30) objT3);
                pm31 pm31Var = new pm31(0);
                boolean zI2 = x340Var.i(view);
                if ((i3 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zI2 | z6;
                objT4 = x340Var.T();
                if (z7 || objT4 == m4cVar) {
                    objT4 = new mws0(view, function0, (byte) 0);
                    x340Var.s0(objT4);
                }
                qim0 qim0VarV = bin.v(qim0VarB2, idn0Var, null, false, str7, pm31Var, (Function0) objT4, 4);
                str8 = str7;
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarV);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z8 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z8) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                zG = x340Var.g(str8);
                objT5 = x340Var.T();
                if (zG || objT5 == m4cVar) {
                    objT5 = new atp0(str8, (byte) 20);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarA = s161.a(nim0.a, (iu30) objT5);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                j2iVar2 = j2iVar;
                k4s0.i((i3 >> 18) & 14, j2iVar2, x340Var, true, true);
                str5 = str6;
            } else {
                x340Var.b0();
                str5 = str4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, z, str2, function0, qim0Var, str5, j2iVar2, i, i2);
            }
        }
        i3 |= 196608;
        str4 = str3;
        if ((1572864 & i) == 0) {
            if (x340Var.i(j2iVar2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0Var = (idn0) objT;
            if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                f2 = 0.98f;
            } else {
                f2 = 1.0f;
            }
            tob1VarB = z95.b(f2, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6), "pressScale", (iu30) null, x340Var, 3072, 20);
            if (str6 == null) {
                if (z) {
                    x340Var.i0(-1549244938);
                    strN0 = cwl1.n0(2131952267, new Object[]{str2}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1549140716);
                    strN0 = cwl1.n0(2131952268, new Object[]{str2}, x340Var);
                    x340Var.r(false);
                }
                str7 = strN0;
            } else {
                str7 = str6;
            }
            zI = x340Var.i(tob1VarB);
            objT2 = x340Var.T();
            if (zI) {
                objT2 = new lws0(tob1VarB, (byte) 0);
                x340Var.s0(objT2);
            } else {
                objT2 = new lws0(tob1VarB, (byte) 0);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB3 = py20.b(i541.C(qim0Var, (iu30) objT2), idn0Var, 0L, (hw61) null, (p3v) null, x340Var, 0, 30);
            x340Var = x340Var;
            qim0 qim0VarN2 = anm1.N(str, qim0VarB3);
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | z3;
            objT3 = x340Var.T();
            if (z5) {
                objT3 = new cl1(z, str2, (byte) 24);
                x340Var.s0(objT3);
            } else {
                objT3 = new cl1(z, str2, (byte) 24);
                x340Var.s0(objT3);
            }
            qim0 qim0VarB4 = s161.b(qim0VarN2, false, (iu30) objT3);
            pm31 pm31Var2 = new pm31(0);
            boolean zI3 = x340Var.i(view);
            if ((i3 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zI3 | z6;
            objT4 = x340Var.T();
            if (z7) {
                objT4 = new mws0(view, function0, (byte) 0);
                x340Var.s0(objT4);
            } else {
                objT4 = new mws0(view, function0, (byte) 0);
                x340Var.s0(objT4);
            }
            qim0 qim0VarV2 = bin.v(qim0VarB4, idn0Var, null, false, str7, pm31Var2, (Function0) objT4, 4);
            str8 = str7;
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarV2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z8 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z8) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            zG = x340Var.g(str8);
            objT5 = x340Var.T();
            if (zG) {
                objT5 = new atp0(str8, (byte) 20);
                x340Var.s0(objT5);
            } else {
                objT5 = new atp0(str8, (byte) 20);
                x340Var.s0(objT5);
            }
            qim0 qim0VarA2 = s161.a(nim0.a, (iu30) objT5);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            j2iVar2 = j2iVar;
            k4s0.i((i3 >> 18) & 14, j2iVar2, x340Var, true, true);
            str5 = str6;
        } else {
            x340Var.b0();
            str5 = str4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zc5(str, z, str2, function0, qim0Var, str5, j2iVar2, i, i2);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2050154194);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0VarX = uyn1.x(u291.f(qim0Var, 1.0f), 8.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = egs0.P0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarX, false, (iu30) objT), lee1Var, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var, i2 & 14, 0, 1720);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 14);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2062776137);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            op71.g(x340Var, u291.h(qim0Var, 0.0f));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 0);
        }
    }

    public static final void h(gxs0 gxs0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(458870259);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gxs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qpl qplVar = gxs0Var.c;
            int i3 = i2 << 6;
            e("allboarding_picker_show_item", gxs0Var.d, qplVar.b, function0, qim0Var, null, apo.r(-852718066, new jws0(gxs0Var, qplVar, b2), x340Var), x340Var, (i3 & 7168) | 1572870 | (i3 & 57344), 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kws0(gxs0Var, function0, qim0Var, i, (byte) 3);
        }
    }

    public static final void i(gxs0 gxs0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1983598168);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(gxs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ckm0 ckm0Var = gxs0Var.c;
            String str = ckm0Var.g;
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new u7h(j(str));
                x340Var.s0(objT);
            }
            long j = ((u7h) objT).a;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v9c.s(p7h.M(new u7h[]{new u7h(z4p1.e(1291845632)), new u7h(u7h.j)}), 0.0f, 0.0f, 14);
                x340Var.s0(objT2);
            }
            int i3 = i2 << 6;
            e("allboarding_picker_more_item", false, ckm0Var.b, function0, qim0Var2, cwl1.n0(2131952266, new Object[]{ckm0Var.b}, x340Var), apo.r(-1783370685, new qi6(j, objT2, (Object) ckm0Var, (byte) 13), x340Var), x340Var, (i3 & 7168) | 1572918 | (i3 & 57344), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kws0(gxs0Var, function0, qim0Var, i, (byte) 4);
        }
    }

    public static final long j(String str) {
        try {
            return z4p1.e(Color.parseColor(str));
        } catch (IllegalArgumentException e2) {
            n57.g("Malformed color string in picker grid: " + str, e2);
            return b;
        }
    }
}
