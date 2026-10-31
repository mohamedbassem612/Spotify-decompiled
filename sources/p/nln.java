package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class nln {
    public static final int[] b = {2131101366, 2131101362, 2131101360, 2131101364, 2131101365, 2131101361};
    public static b180 c;
    public static b180 d;
    public final /* synthetic */ byte a;

    public /* synthetic */ nln(byte b2) {
        this.a = b2;
    }

    public static final w7l1 A(u6l1 u6l1Var, String str) {
        kjj1 jjj1Var;
        String str2 = u6l1Var.d;
        String str3 = u6l1Var.e;
        String str4 = u6l1Var.c;
        String str5 = u6l1Var.i;
        String str6 = u6l1Var.f.a;
        kjj1 kjj1Var = null;
        if (str6.length() <= 0) {
            str6 = null;
        }
        if (str6 == null) {
            str6 = u6l1Var.j.a;
        }
        h8l1 h8l1Var = new h8l1(str2, str3, str4, str5, str6, k4m.d, u6l1Var.l, (String) null, 512);
        blj1 blj1Var = u6l1Var.g;
        String str7 = blj1Var.a;
        int iC = l1d.C(blj1Var.b);
        if (iC != 0) {
            if (iC == 1) {
                jjj1Var = new kjj1(blj1Var.c, blj1Var.d, str7);
            }
            return new w7l1(new t7l1(h8l1Var, new s7l1(kjj1Var, "watch-feed-entrypoint-card-home-client-native", true)), u6l1Var.h, u6l1Var.k, u6l1Var.b, u6l1Var.a, str, u6l1Var.m);
        }
        jjj1Var = new jjj1(blj1Var.c, blj1Var.d, str7);
        kjj1Var = jjj1Var;
        return new w7l1(new t7l1(h8l1Var, new s7l1(kjj1Var, "watch-feed-entrypoint-card-home-client-native", true)), u6l1Var.h, u6l1Var.k, u6l1Var.b, u6l1Var.a, str, u6l1Var.m);
    }

    public static Next B(kak0 kak0Var) {
        return Next.h(kak0.a(kak0Var, ndm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0.a, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048574));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01af  */
    /* JADX WARN: Code duplicated, block: B:55:0x020d A[LOOP:0: B:53:0x0207->B:55:0x020d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0221  */
    /* JADX WARN: Code duplicated, block: B:59:0x0225  */
    /* JADX WARN: Code duplicated, block: B:61:0x0229  */
    /* JADX WARN: Code duplicated, block: B:64:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00af, please report this as an issue */
    public static final void a(rin0 rin0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        int i4;
        String str;
        exl exlVar;
        String str2;
        r4g r4gVar;
        String strY0;
        List listM;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Iterator it;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2135034029);
        if ((i & 6) == 0) {
            i3 = i | (x340Var.i(rin0Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (rin0Var instanceof rin0) {
                    eg.o();
                    return;
                }
                i4 = rin0Var.a;
                if (i4 != 1) {
                    str = "PortraitOnly";
                } else {
                    if (i4 == 2) {
                        throw null;
                    }
                    str = "Rotatable";
                }
                eic1 eic1Var = new eic1("Orientation policy", str);
                eic1 eic1Var2 = new eic1("Chrome", "hiding=AutoHide, scrim=true");
                eic1 eic1Var3 = new eic1("Header", "expandCollapse=None, close=" + jdb1.a + ", contextHeader=" + kdb1.a + ", contextMenu=" + ldb1.a);
                exlVar = rin0Var.d.a;
                if (exlVar.equals(dxl.a)) {
                    str2 = "placement=Fill";
                } else {
                    str2 = "placement=Stacked, aspectRatio=" + exlVar.a;
                }
                eic1 eic1Var4 = new eic1("Content layer", str2);
                r4gVar = rin0Var.e;
                if (r4gVar != null) {
                    strY0 = o7h.y0(r4gVar.a, (CharSequence) null, (String) null, (String) null, fw2.W0, 31);
                } else {
                    strY0 = "None";
                }
                eic1 eic1Var5 = new eic1("Chips", strY0);
                eic1 eic1Var6 = new eic1("Track info", "artworkThumbnail=" + gpf1.a + ", addTo=" + fpf1.a + ", negativeAction=None");
                eic1 eic1Var7 = new eic1("Progress", "chapterMarkers=false");
                StringBuilder sb = new StringBuilder("leftSecondary=SkipPrevious, playPause=");
                sb.append(lxt0.a);
                sb.append(", rightSecondary=SkipNext, tertiary=left=Shuffle, right=Repeat");
                listM = p7h.M(new eic1[]{eic1Var, eic1Var2, eic1Var3, eic1Var4, eic1Var5, eic1Var6, eic1Var7, new eic1("Playback controls", sb.toString()), new eic1("Footer", "connect=" + ib30.a + ", center=SharedBy, primaryAccessory=Queue, secondaryAccessory=Share, tertiaryAccessory=None")});
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0Var4, 16.0f);
                cvx cvxVar2 = cbx.b(x340Var).b;
                mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                qim0 qim0Var5 = qim0Var4;
                uwo1.e("Standard", (qim0) null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var.i0(1809190921);
                it = listM.iterator();
                while (it.hasNext()) {
                    e((eic1) it.next(), x340Var, 0);
                }
                x340Var.r(false);
                x340Var.r(true);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ux1(rin0Var, qim0Var3, i, i2, (byte) 1);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (rin0Var instanceof rin0) {
                eg.o();
                return;
            }
            i4 = rin0Var.a;
            if (i4 != 1) {
                str = "PortraitOnly";
            } else {
                if (i4 == 2) {
                    throw null;
                }
                str = "Rotatable";
            }
            eic1 eic1Var8 = new eic1("Orientation policy", str);
            eic1 eic1Var9 = new eic1("Chrome", "hiding=AutoHide, scrim=true");
            eic1 eic1Var10 = new eic1("Header", "expandCollapse=None, close=" + jdb1.a + ", contextHeader=" + kdb1.a + ", contextMenu=" + ldb1.a);
            exlVar = rin0Var.d.a;
            if (exlVar.equals(dxl.a)) {
                str2 = "placement=Fill";
            } else {
                str2 = "placement=Stacked, aspectRatio=" + exlVar.a;
            }
            eic1 eic1Var11 = new eic1("Content layer", str2);
            r4gVar = rin0Var.e;
            if (r4gVar != null) {
                strY0 = o7h.y0(r4gVar.a, (CharSequence) null, (String) null, (String) null, fw2.W0, 31);
            } else {
                strY0 = "None";
            }
            eic1 eic1Var12 = new eic1("Chips", strY0);
            eic1 eic1Var13 = new eic1("Track info", "artworkThumbnail=" + gpf1.a + ", addTo=" + fpf1.a + ", negativeAction=None");
            eic1 eic1Var14 = new eic1("Progress", "chapterMarkers=false");
            StringBuilder sb2 = new StringBuilder("leftSecondary=SkipPrevious, playPause=");
            sb2.append(lxt0.a);
            sb2.append(", rightSecondary=SkipNext, tertiary=left=Shuffle, right=Repeat");
            listM = p7h.M(new eic1[]{eic1Var8, eic1Var9, eic1Var10, eic1Var11, eic1Var12, eic1Var13, eic1Var14, new eic1("Playback controls", sb2.toString()), new eic1("Footer", "connect=" + ib30.a + ", center=SharedBy, primaryAccessory=Queue, secondaryAccessory=Share, tertiaryAccessory=None")});
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0Var4, 16.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX2);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0Var6 = qim0Var4;
            uwo1.e("Standard", (qim0) null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.i0(1809190921);
            it = listM.iterator();
            while (it.hasNext()) {
                e((eic1) it.next(), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ux1(rin0Var, qim0Var3, i, i2, (byte) 1);
        }
    }

    public static final void b(mq20 mq20Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        b0k b0kVar2;
        pxg1 pxg1VarJ0;
        pxg1 pxg1VarJ1;
        ArrayList arrayList = mq20Var.b;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-62641430);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(mq20Var) : b0kVar3.i(mq20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= b0kVar3.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z2) ? 256 : 128;
        }
        int i3 = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z2) {
                ilv.a.getClass();
                pxg1VarJ0 = new pxg1(700, 200, flv.g);
            } else {
                pxg1VarJ0 = irn1.j0();
            }
            pxg1 pxg1Var = pxg1VarJ0;
            if (z2) {
                ilv.a.getClass();
                pxg1VarJ1 = new pxg1(700, 300, flv.g);
            } else {
                pxg1VarJ1 = irn1.j0();
            }
            pxg1 pxg1Var2 = pxg1VarJ1;
            Float fValueOf3 = Float.valueOf(z2 ? 0.0f : 1.0f);
            tzg1 tzg1Var = rno1.a;
            int i4 = 8 | (i2 & 112);
            ven0 ven0VarR = zod.R(new hsi1("dateEnterAlpha", fValueOf3, fValueOf, pxg1Var, tzg1Var), z3, (Function0) null, b0kVar3, i4, 4);
            ven0 ven0VarR2 = zod.R(new hsi1("dateEnterOffset", Float.valueOf(z2 ? 1.0f : 0.0f), fValueOf2, pxg1Var, tzg1Var), z, (Function0) null, b0kVar3, i4, 4);
            ven0 ven0VarR3 = zod.R(new hsi1("hourEnterAlpha", Float.valueOf(z2 ? 0.0f : 1.0f), fValueOf, pxg1Var2, tzg1Var), z, (Function0) null, b0kVar3, i4, 4);
            ven0 ven0VarR4 = zod.R(new hsi1("hourEnterOffset", Float.valueOf(z2 ? 1.0f : 0.0f), fValueOf2, pxg1Var2, tzg1Var), z, (Function0) null, b0kVar3, i4, 4);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, nim0.a);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int i5 = i2 << 12;
            int i6 = i5 & 458752;
            int i7 = i5 & 3670016;
            k(arrayList, "date", 1200, ((Number) ven0VarR.getValue()).floatValue(), ((Number) ven0VarR2.getValue()).floatValue(), z, z2, b0kVar3, i6 | 432 | i7);
            ArrayList arrayList2 = mq20Var.c;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if ((((pq20) it.next()) instanceof oq20) && (i3 = i3 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            b0kVar2 = b0kVar3;
            k(arrayList2, "time", (i3 * 100) + 1200, ((Number) ven0VarR3.getValue()).floatValue(), ((Number) ven0VarR4.getValue()).floatValue(), z, z2, b0kVar2, i6 | 48 | i7);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kb90(mq20Var, z, z2, i, (byte) 0);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-858893218);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(zmx.c, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, true, x340Var, zmx.d | 197040, 24);
            op71.g(x340Var, u291.v(nim0Var, 6.0f));
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2042);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new psr0(str, i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void d(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-143858313);
        int i3 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                gt4.b(apo.r(942492583, new psr0(str, (byte) 20), x340Var), function0, qim0Var4, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var, (i3 & 112) | 6 | (i3 & 896), 504);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6((byte) 5, i, i2, str, function0, qim0Var3);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            gt4.b(apo.r(942492583, new psr0(str, (byte) 20), x340Var), function0, qim0Var4, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var, (i3 & 112) | 6 | (i3 & 896), 504);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6((byte) 5, i, i2, str, function0, qim0Var3);
        }
    }

    public static final void e(eic1 eic1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-959814447);
        int i2 = i | (x340Var.g(eic1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(eic1Var.a, (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            uwo1.e(eic1Var.b, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xb2(eic1Var, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(Paragraph paragraph, Paragraph paragraph2, tob1 tob1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2081647328);
        int i2 = i | (x340Var.g(paragraph) ? 4 : 2) | (x340Var.g(paragraph2) ? 32 : 16) | (x340Var.g(tob1Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT2;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = i1p1.r(nim0Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            vnr0 vnr0VarA = shy0.a(paragraph, x340Var);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new qg6(drr0Var, (byte) 17);
                x340Var.s0(objT3);
            }
            qim0 qim0VarX = ern1.x(nim0Var, (iu30) objT3);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objT4 = x340Var.T();
            if (z || objT4 == m4cVar) {
                objT4 = new lb90(tob1Var, drr0Var, (byte) 0);
                x340Var.s0(objT4);
            }
            qgo1.f(vnr0VarA, i541.C(qim0VarX, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            vnr0 vnr0VarA2 = shy0.a(paragraph2, x340Var);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = new qg6(drr0Var2, (byte) 18);
                x340Var.s0(objT5);
            }
            qim0 qim0VarX2 = ern1.x(nim0Var, (iu30) objT5);
            boolean z2 = i3 == 256;
            Object objT6 = x340Var.T();
            if (z2 || objT6 == m4cVar) {
                objT6 = new lb90(tob1Var, drr0Var2, (byte) 1);
                x340Var.s0(objT6);
            }
            qgo1.f(vnr0VarA2, i541.C(qim0VarX2, (iu30) objT6), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(paragraph, paragraph2, tob1Var, i, (byte) 0);
        }
    }

    public static final void g(i2c i2cVar, mq20 mq20Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        mq20 mq20Var2 = mq20Var;
        boolean z3 = z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(948011710);
        j06 j06Var = x340Var.a;
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(mq20Var2) : x340Var.i(mq20Var2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1169) != 1168)) {
            kjd kjdVarI = b0o1.i(x340Var);
            b0o1.a(kjdVarI, (qim0) null, 0, 0, 0.0f, 0.0f, 0L, x340Var, 0, 126);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.75f);
            uwr uwrVar = cbx.a;
            int i3 = i2;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.c, 0.0f, 2, qim0VarC);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.d, eraVar, x340Var, 54);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
            qim0 qim0VarX = ern1.x(nim0Var, new m4d(kjdVarI, (byte) 2));
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 48);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            int i4 = (i3 >> 3) & 1022;
            mq20Var2 = mq20Var;
            z3 = z;
            m(mq20Var2, z3, z2, x340Var, i4);
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            b(mq20Var2, z3, z2, x340Var, i4);
            us71.m(x340Var, true, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(i2cVar, mq20Var2, z3, z2, i);
        }
    }

    public static final void h(q8f1 q8f1Var, Integer num, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(813672336);
        int i2 = i | (x340Var.i(q8f1Var) ? 4 : 2) | (x340Var.g(num) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xxh xxhVar = q8f1Var.c;
            boolean z = xxhVar instanceof wxh;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarU = u291.u(qim0Var3, 24.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            vxh vxhVar = vxh.a;
            if (!z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(723843004);
                x340Var.r(false);
            } else {
                x340Var.i0(723781500);
                lap1.a(xxhVar, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            String str = q8f1Var.b;
            u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
            if (u7hVar == null) {
                x340Var.i0(-253741238);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(-253742943);
                x340Var.r(false);
                j = u7hVar.a;
            }
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).h, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            if (z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(724145564);
                x340Var.r(false);
            } else {
                x340Var.i0(724084060);
                lap1.a(xxhVar, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(q8f1Var, num, qim0Var2, i, (byte) 13);
        }
    }

    public static final void i(xtb0 xtb0Var, c380 c380Var, m8w0 m8w0Var, iu30 iu30Var, boolean z, boolean z2, List list, boolean z3, boolean z4, iu30 iu30Var2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2063939678);
        int i2 = i | (b0kVar3.g(xtb0Var) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.g(m8w0Var) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024) | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.h(z2) ? 131072 : 65536) | (b0kVar3.i(list) ? 1048576 : 524288) | (b0kVar3.h(z3) ? 8388608 : 4194304) | (b0kVar3.h(z4) ? 67108864 : 33554432) | (b0kVar3.i(iu30Var2) ? 536870912 : 268435456);
        char c2 = b0kVar3.i(function0) ? (char) 4 : (char) 2;
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.e, een.Z, b0kVar3, 6);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarN = anm1.N("mixing_preset_chips_row", nim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 0.0f, 16.0f, 0.0f);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((29360128 & i2) == 8388608) | ((c2 & 14) == 4) | b0kVar3.i(list) | ((234881024 & i2) == 67108864) | ((1879048192 & i2) == 536870912) | ((458752 & i2) == 131072);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                a7w0 a7w0Var = new a7w0(c380Var, m8w0Var, z, iu30Var, ven0Var, function0, z3, list, z4, iu30Var2, z2);
                b0kVar3.s0(a7w0Var);
                objT2 = a7w0Var;
            }
            b0kVar2 = b0kVar3;
            too1.b(qim0VarN, xtb0Var, zzq0Var, (iu30) objT2, b0kVar2, ((i2 << 3) & 112) | 6, 0);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dgf(xtb0Var, c380Var, m8w0Var, iu30Var, z, z2, list, z3, z4, iu30Var2, function0, i);
        }
    }

    public static final void j(ven0 ven0Var, boolean z) {
        ven0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(ArrayList arrayList, String str, int i, float f, float f2, boolean z, boolean z2, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        boolean z3;
        float f3;
        pxg1 pxg1VarJ0;
        String str2 = str;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-710860110);
        int i3 = (i2 & 6) == 0 ? ((i2 & 8) == 0 ? x340Var.g(arrayList) : x340Var.i(arrayList) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z3 = z;
            i3 |= x340Var.h(z3) ? 131072 : 65536;
        } else {
            z3 = z;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.h(z2) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            fra fraVar = een.N0;
            boolean z4 = (i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(arrayList));
            Object objT = x340Var.T();
            if (z4 || objT == m4cVar) {
                objT = new ib5(arrayList, (byte) 20);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
            boolean z5 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objT2 = x340Var.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new e8(f, f2, (byte) 7);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarA, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(1507080871);
            int i4 = 0;
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                pq20 pq20Var = (pq20) it.next();
                if (pq20Var instanceof oq20) {
                    x340Var.i0(-525049770);
                    int i5 = (i4 * 100) + i;
                    String strK = l1d.k(i4, str2, "_");
                    oq20 oq20Var = (oq20) pq20Var;
                    Paragraph paragraph = oq20Var.b;
                    Paragraph paragraph2 = oq20Var.a;
                    boolean z6 = z2 && !paragraph2.equals(paragraph);
                    int i6 = (i3 >> 9) & 896;
                    String strConcat = "flip_".concat(strK);
                    float f4 = z6 ? 0.0f : 1.0f;
                    if (z6) {
                        ilv.a.getClass();
                        f3 = 1.0f;
                        pxg1VarJ0 = new pxg1(500, i5, flv.i);
                    } else {
                        f3 = 1.0f;
                        pxg1VarJ0 = irn1.j0();
                    }
                    f(paragraph2, paragraph, zod.R(new hsi1(strConcat, Float.valueOf(f4), Float.valueOf(f3), pxg1VarJ0, rno1.a), z3, (Function0) null, x340Var, 8 | ((i6 >> 3) & 112), 4), x340Var, 0);
                    i4++;
                    x340Var.r(false);
                } else {
                    if (!(pq20Var instanceof nq20)) {
                        throw p3d1.k(x340Var, 1507081919, false);
                    }
                    x340Var.i0(-524574385);
                    l(((nq20) pq20Var).a, x340Var, 0);
                    x340Var.r(false);
                }
                str2 = str;
                z3 = z;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nb90(arrayList, str, i, f, f2, z, z2, i2);
        }
    }

    public static final void l(Paragraph paragraph, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-234252559);
        int i2 = (x340Var.g(paragraph) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qgo1.f(shy0.a(paragraph, x340Var), (qim0) null, new a0e1(3), 0, false, (iu30) null, x340Var, 8, 58);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x990(paragraph, i, (byte) 1);
        }
    }

    public static final void m(mq20 mq20Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        pxg1 pxg1VarJ0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1772713111);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(mq20Var) : x340Var.i(mq20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarY = h7w.y(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                x340Var.i0(21843984);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean z3 = (i2 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new iwd(z, lz20Var, null, (byte) 2);
                    x340Var.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(22006393);
                x340Var.r(false);
            }
            if (z2) {
                ilv.a.getClass();
                pxg1VarJ0 = new pxg1(700, 100, flv.g);
            } else {
                pxg1VarJ0 = irn1.j0();
            }
            pxg1 pxg1Var = pxg1VarJ0;
            Float fValueOf = Float.valueOf(z2 ? 0.0f : 1.0f);
            Float fValueOf2 = Float.valueOf(1.0f);
            tzg1 tzg1Var = rno1.a;
            int i3 = 8 | (i2 & 112);
            ven0 ven0VarR = zod.R(new hsi1("flipCalendarTitleAlpha", fValueOf, fValueOf2, pxg1Var, tzg1Var), z, (Function0) null, x340Var, i3, 4);
            ven0 ven0VarR2 = zod.R(new hsi1("flipCalendarTitleOffset", Float.valueOf(z2 ? 1.0f : 0.0f), Float.valueOf(0.0f), pxg1Var, tzg1Var), z, (Function0) null, x340Var, i3, 4);
            vnr0 vnr0Var = (vnr0) mq20Var.a.invoke(x340Var, 0);
            uwr uwrVar = cbx.a;
            vnr0 vnr0VarQ = omo1.q(vnr0Var, cbx.d(x340Var).j, cbx.d(x340Var).g, x340Var);
            qim0 qim0VarThen = vby0.p(nim0.a, lz20Var).then(c030.a);
            boolean zG = x340Var.g(ven0VarR) | x340Var.g(ven0VarR2);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new dy(ven0VarR, ven0VarR2, (byte) 4);
                x340Var.s0(objT3);
            }
            qgo1.f(vnr0VarQ, i541.C(qim0VarThen, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kb90(mq20Var, z, z2, i, (byte) 1);
        }
    }

    public static final void n(n8f1 n8f1Var, q8f1 q8f1Var, int i, Integer num, boolean z, vu30 vu30Var, vu30 vu30Var2, iu30 iu30Var, boolean z2, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        vu30 vu30Var3;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z3 = z;
        String str = q8f1Var.b;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1362695035);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? b0kVar3.g(n8f1Var) : b0kVar3.i(n8f1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar3.g(q8f1Var) : b0kVar3.i(q8f1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.g(num) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            vu30Var3 = vu30Var2;
            i3 |= b0kVar3.i(vu30Var3) ? 1048576 : 524288;
        } else {
            vu30Var3 = vu30Var2;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= b0kVar3.h(z2) ? 67108864 : 33554432;
        }
        int i4 = i3 | 805306368;
        if (b0kVar3.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            String str2 = String.format(cwl1.o0(b0kVar3, 2131963299), Arrays.copyOf(new Object[]{str}, 1));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            String str3 = String.format("top-artist-row-%s", Arrays.copyOf(new Object[]{str}, 1));
            int i5 = i4 & 112;
            boolean z4 = ((458752 & i4) == 131072) | ((i4 & 896) == 256) | (i5 == 32 || ((i4 & 64) != 0 && b0kVar3.i(q8f1Var)));
            Object objT = b0kVar3.T();
            if (z4 || objT == m4cVar) {
                objT = new c8f1(vu30Var, i, q8f1Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarI = zr7.i(qim0VarF, new pa5(!z3, cwl1.o0(b0kVar3, q8f1Var.e), (Function0) objT, str3, (byte) 0));
            boolean zG = (i5 == 32 || ((i4 & 64) != 0 && b0kVar3.i(q8f1Var))) | ((i4 & 57344) == 16384) | b0kVar3.g(str2);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new wq01(z3, (Object) str2, (Object) q8f1Var, (byte) 5);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarI, (iu30) objT2);
            uvx uvxVar = new uvx((pgx) null, 5, (tvx) null, new p3v(88.0f), 10);
            j2i j2iVarR = apo.r(1829490821, new xw91(q8f1Var, num, (byte) 17), b0kVar3);
            j2i j2iVarR2 = apo.r(-1171057628, new d8f1(q8f1Var, z3, (byte) 0), b0kVar3);
            j2i j2iVarR3 = apo.r(1728499523, new d8f1(q8f1Var, z3, (byte) 1), b0kVar3);
            jjd0 jjd0Var = new jjd0(n8f1Var, q8f1Var, z3, i, vu30Var3, iu30Var, z2);
            z3 = z3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarA, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, j2iVarR, j2iVarR2, (xu30) null, j2iVarR3, apo.r(-1272048926, jjd0Var, b0kVar3), (xu30) null, (xu30) null, apo.r(-1683759681, new d8f1(q8f1Var, z3, (byte) 2), b0kVar3), b0kVar2, 907542592, 197040, 25788);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e8f1(n8f1Var, q8f1Var, i, num, z3, vu30Var, vu30Var2, iu30Var, z2, qim0Var2, i2);
        }
    }

    public static final void o(p8f1 p8f1Var, vu30 vu30Var, qim0 qim0Var, vu30 vu30Var2, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        n8f1 n8f1Var = p8f1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1866991740);
        int i2 = 2;
        vu30 vu30Var3 = vu30Var;
        vu30 vu30Var4 = vu30Var2;
        iu30 iu30Var2 = iu30Var;
        boolean z2 = z;
        int i3 = i | (x340Var.g(p8f1Var) ? 4 : 2) | (x340Var.i(vu30Var3) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(vu30Var4) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarN = anm1.N("top-artists-container", u291.f(qim0Var, 1.0f));
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(906696705);
            int i4 = 0;
            for (Object obj : n8f1Var.getItems()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                q8f1 q8f1Var = (q8f1) obj;
                Integer numO = n8f1Var.o();
                int i6 = q8f1Var.i;
                int i7 = i3 << 9;
                n(n8f1Var, q8f1Var, i4, numO, i6 != 0 && (i6 == i2 || !p8f1Var.b), vu30Var3, vu30Var4, iu30Var2, z2, null, x340Var, 64 | ((i3 << 12) & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024));
                vu30Var3 = vu30Var;
                vu30Var4 = vu30Var2;
                iu30Var2 = iu30Var;
                z2 = z;
                i4 = i5;
                i2 = 2;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(p8f1Var, vu30Var, qim0Var, vu30Var2, iu30Var, z, i, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void p(n8f1 n8f1Var, q8f1 q8f1Var, boolean z, int i, vu30 vu30Var, iu30 iu30Var, boolean z2, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        String str = q8f1Var.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(605129083);
        int i5 = i2 | (x340Var2.g(n8f1Var) ? 4 : 2) | (x340Var2.i(q8f1Var) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.e(i) ? 2048 : 1024) | (x340Var2.i(vu30Var) ? 16384 : 8192) | (x340Var2.i(iu30Var) ? 131072 : 65536) | (x340Var2.h(z2) ? 1048576 : 524288);
        if (x340Var2.Y(i5 & 1, (599187 & i5) != 599186)) {
            boolean z5 = n8f1Var instanceof s8f1;
            nim0 nim0Var = nim0.a;
            if (z5) {
                x340Var2.i0(1423191261);
                String strO0 = cwl1.o0(x340Var2, 2131963600);
                boolean z6 = ((i5 & 112) == 32 || x340Var2.i(q8f1Var)) | ((i5 & 57344) == 16384) | ((i5 & 7168) == 2048);
                Object objT = x340Var2.T();
                if (z6 || objT == m4cVar) {
                    objT = new c8f1(vu30Var, i, q8f1Var, (byte) 1);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strO0), function0);
                ldx ldxVar = ldx.c;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                wro1.h(gbxVar, ldxVar, x9p1.j(anm1.N(String.format("top-artist-context-menu-%s", Arrays.copyOf(new Object[]{str}, 1)), nim0Var), z), (max) null, (gdx) null, uyn1.j(12.0f, 0.0f, 4.0f, 0.0f, 10), false, (idn0) null, (ga80) null, onj.a, x340Var2, 0, 6, 952);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                if (!(n8f1Var instanceof o8f1)) {
                    throw p3d1.k(x340Var, 1708476018, false);
                }
                x340Var.i0(1424085859);
                int i6 = q8f1Var.i;
                List list = q8f1Var.t;
                if (i6 == 2) {
                    x340Var.i0(1424116115);
                    fc11.a(mqo1.s(new phx[]{new phx(14, 0L, "", null, null)}), anm1.N(String.format("top-artist-face-pile-%s", Arrays.copyOf(new Object[]{str}, 1)), nim0Var), (hcx) null, ttx.c, false, 2, (gbx) null, (String) null, (idn0) null, x340Var, 196616 | (ttx.d << 9), 468);
                    x340Var = x340Var;
                    x340Var.r(false);
                    z3 = false;
                } else if (list.isEmpty()) {
                    z3 = false;
                    x340Var.i0(1425406087);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1424478722);
                    if (list.size() != 1 || (!((m8f1) o7h.q0(list)).e && z2)) {
                        z4 = false;
                        i3 = 1424734937;
                        i4 = 2131963613;
                    } else {
                        i3 = 1424622748;
                        i4 = 2131963620;
                        z4 = false;
                    }
                    String strK = x0d.k(x340Var, i3, i4, x340Var, z4);
                    List<m8f1> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (m8f1 m8f1Var : list2) {
                        arrayList.add(new phx(10, 0L, m8f1Var.a, null, m8f1Var.b));
                    }
                    c380 c380VarA = mqo1.A(arrayList);
                    qim0 qim0VarN = anm1.N(String.format("top-artist-face-pile-%s", Arrays.copyOf(new Object[]{str}, 1)), nim0Var);
                    gbx gbxVar2 = null;
                    iu30 iu30Var2 = (iu30Var == null || z) ? null : iu30Var;
                    if (iu30Var2 == null) {
                        x340Var.i0(1425267113);
                        x340Var.r(false);
                        z3 = false;
                    } else {
                        x340Var.i0(1425267114);
                        boolean zG = x340Var.g(iu30Var2) | ((i5 & 7168) == 2048);
                        Object objT2 = x340Var.T();
                        if (zG || objT2 == m4cVar) {
                            z3 = false;
                            objT2 = new f8f1(iu30Var2, i, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            z3 = false;
                        }
                        Function0 function1 = (Function0) objT2;
                        if (ihc1.y0(strK)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        } else {
                            gbxVar2 = new gbx(new y50(strK), function1);
                            x340Var.r(z3);
                        }
                    }
                    fc11.a(c380VarA, qim0VarN, (hcx) null, (hux) null, false, 2, gbxVar2, (String) null, (idn0) null, x340Var, 196616, 412);
                    x340Var = x340Var;
                    x340Var.r(z3);
                }
                x340Var.r(z3);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(n8f1Var, q8f1Var, z, i, vu30Var, iu30Var, z2, i2, (byte) 9);
        }
    }

    public static final boolean r(String str, String str2) {
        return u890.j(str, str2);
    }

    public static final umb s(w281 w281Var) {
        o281 o281Var = w281Var.a;
        if (w281Var.c || (o281Var instanceof l281)) {
            return tmb.a;
        }
        return o281Var instanceof o281 ? new rmb(o281Var.c) : smb.a;
    }

    public static final z5f0 t(z5f0 z5f0Var) {
        hmb0 hmb0VarV = z5f0Var.U0.U0;
        while (true) {
            hmb0 hmb0VarV2 = hmb0VarV.v();
            if ((hmb0VarV2 != null ? hmb0VarV2.i : null) == null) {
                z5f0 z5f0VarC1 = ((ndo0) hmb0VarV.e1.e).c1();
                z5f0VarC1.getClass();
                return z5f0VarC1;
            }
            hmb0 hmb0VarV3 = hmb0VarV.v();
            hmb0 hmb0Var = hmb0VarV3 != null ? hmb0VarV3.i : null;
            hmb0Var.getClass();
            if (hmb0Var.h) {
                hmb0VarV = hmb0VarV.v();
                hmb0VarV.getClass();
            } else {
                hmb0 hmb0VarV4 = hmb0VarV.v();
                hmb0VarV4.getClass();
                hmb0VarV = hmb0VarV4.i;
                hmb0VarV.getClass();
            }
        }
    }

    public static int u(String str) {
        return str.hashCode();
    }

    public static final q4u v(iu30 iu30Var) {
        return new q4u(iu30Var, qlt.X);
    }

    public static final q4u w(q4u... q4uVarArr) {
        List listM = p7h.M(Arrays.copyOf(q4uVarArr, q4uVarArr.length));
        return new q4u(new s4u(listM, (byte) 0), v30.P0);
    }

    public static final q4u x(iu30 iu30Var, q4u q4uVar) {
        return new q4u(new d(q4uVar, iu30Var, (byte) 6));
    }

    public static Map y(List list) {
        Integer m231Var;
        String strSubstring;
        int iIntValue;
        if (list.isEmpty()) {
            Logger.k("RiveFontResolver: expected_fonts is empty — text will not render", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = dj31.a;
            try {
                int iA0 = ihc1.A0(str, '-', 0, 6);
                if (iA0 >= 0) {
                    String strSubstring2 = str.substring(iA0 + 1);
                    int i = 0;
                    while (true) {
                        if (i >= strSubstring2.length()) {
                            strSubstring = str.substring(0, iA0);
                            break;
                        }
                        if (!Character.isDigit(strSubstring2.charAt(i))) {
                            strSubstring = str;
                            break;
                        }
                        i++;
                    }
                } else {
                    strSubstring = str;
                    break;
                }
                Integer num = (Integer) dj31.a.get(strSubstring);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    k220.f("Unrecognized Rive font: ".concat(str));
                    iIntValue = 0;
                }
                m231Var = Integer.valueOf(iIntValue);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (e331.a(m231Var) != null) {
                Logger.k(f4i1.f("RiveFontResolver: skipping unresolved font '", str, "'"), new Object[0]);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            Integer num2 = m231Var;
            mmr0 mmr0Var = num2 != null ? new mmr0(str, Integer.valueOf(num2.intValue())) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public static final boolean z(Object obj, Object obj2) {
        return !u890.j(obj2, obj);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                if (this instanceof y9m0) {
                    return "InitializeComponent";
                }
                if (this instanceof aam0) {
                    return "RunShutdownHooks";
                }
                if (this instanceof bam0) {
                    return "Shutdown";
                }
                if (this instanceof z9m0) {
                    return "NotifySubscriber";
                }
                if (this instanceof x9m0) {
                    return "EmitLeftScopeAndShutdown";
                }
                eg.o();
                return null;
            default:
                return super.toString();
        }
    }

    public void q() {
    }
}
