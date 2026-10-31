package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.highlightsstats.ShareConfiguration;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.remoteconfig.internal.ProductStateProto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cyo1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079 A[PHI: r6
      0x0079: PHI (r6v12 p.qim0) = (r6v3 p.qim0), (r6v1 p.qim0) binds: [B:41:0x0081, B:36:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0065, please report this as an issue */
    public static final void a(boolean z, qim0 qim0Var, float f, float f2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        float f3;
        int i4;
        boolean z2;
        j2i j2iVar2;
        qim0 qim0Var3;
        float f4;
        h311 h311VarV;
        int i5;
        qim0 qim0Var4;
        float f5;
        int i6;
        tob1 tob1VarB;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        boolean zI;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-563972519);
        j06 j06Var = x340Var.a;
        int i7 = i | (x340Var.h(z) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i7 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        int i9 = i3 | (x340Var.d(f) ? 256 : 128);
        if ((i2 & 8) == 0) {
            f3 = f2;
            int i10 = x340Var.d(f3) ? 2048 : 1024;
            i4 = i9 | i10;
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                x340Var.d0();
                i5 = i & 1;
                qim0Var4 = nim0.a;
                if (i5 != 0 || x340Var.E()) {
                    if (i8 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 8) != 0) {
                        qim0Var3 = qim0Var2;
                        f5 = 0.0f;
                    }
                    x340Var.s();
                    if (z) {
                        i6 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER;
                    } else {
                        i6 = 100;
                    }
                    tob1VarB = z95.b(z ? 1.0f : 0.0f, irn1.o0(i6, 0, mlv.a, 2), "checkmark", (iu30) null, x340Var, 3072, 20);
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var3);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z3 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z3) {
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
                    h2c h2cVar = h2c.a;
                    j2iVar2 = j2iVar;
                    j2iVar2.invoke(h2cVar, x340Var, 54);
                    gra graVar = een.h;
                    qim0 qim0VarR = u291.r(eqr0.C(uyn1.x(h2cVar.a(qim0Var4, een.f), f5), 2.0f, -2.0f), 4.0f + f);
                    zI = x340Var.i(tob1VarB);
                    objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new lq2(tob1VarB, (byte) 28);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
                    uwr uwrVar = cbx.a;
                    float f6 = f5;
                    qim0 qim0VarF = dug.f(qim0VarC, cbx.a(x340Var).a.c, er31.a);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
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
                    w0h1.a(klx.c, isl.a, u291.r(qim0Var4, f), cbx.a(x340Var).c.a, 0L, false, x340Var, klx.d | 48, 48);
                    x340Var = x340Var;
                    x340Var.r(true);
                    x340Var.r(true);
                    f4 = f6;
                } else {
                    x340Var.b0();
                }
                qim0Var3 = qim0Var2;
                f5 = f3;
                x340Var.s();
                if (z) {
                    i6 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER;
                } else {
                    i6 = 100;
                }
                tob1VarB = z95.b(z ? 1.0f : 0.0f, irn1.o0(i6, 0, mlv.a, 2), "checkmark", (iu30) null, x340Var, 3072, 20);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z3 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z3) {
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
                h2c h2cVar2 = h2c.a;
                j2iVar2 = j2iVar;
                j2iVar2.invoke(h2cVar2, x340Var, 54);
                gra graVar2 = een.h;
                qim0 qim0VarR2 = u291.r(eqr0.C(uyn1.x(h2cVar2.a(qim0Var4, een.f), f5), 2.0f, -2.0f), 4.0f + f);
                zI = x340Var.i(tob1VarB);
                objT = x340Var.T();
                if (zI) {
                    objT = new lq2(tob1VarB, (byte) 28);
                    x340Var.s0(objT);
                } else {
                    objT = new lq2(tob1VarB, (byte) 28);
                    x340Var.s0(objT);
                }
                qim0 qim0VarC2 = i541.C(qim0VarR2, (iu30) objT);
                uwr uwrVar2 = cbx.a;
                float f7 = f5;
                qim0 qim0VarF2 = dug.f(qim0VarC2, cbx.a(x340Var).a.c, er31.a);
                gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
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
                w0h1.a(klx.c, isl.a, u291.r(qim0Var4, f), cbx.a(x340Var).c.a, 0L, false, x340Var, klx.d | 48, 48);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(true);
                f4 = f7;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                f4 = f3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qvf(z, qim0Var3, f, f4, j2iVar2, i, i2);
            }
        }
        f3 = f2;
        i4 = i9 | i10;
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            x340Var.d0();
            i5 = i & 1;
            qim0Var4 = nim0.a;
            if (i5 != 0) {
                if (i8 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    qim0Var3 = qim0Var2;
                    f5 = 0.0f;
                } else {
                    qim0Var3 = qim0Var2;
                    f5 = f3;
                }
            } else {
                if (i8 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    qim0Var3 = qim0Var2;
                    f5 = 0.0f;
                } else {
                    qim0Var3 = qim0Var2;
                    f5 = f3;
                }
            }
            x340Var.s();
            if (z) {
                i6 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER;
            } else {
                i6 = 100;
            }
            tob1VarB = z95.b(z ? 1.0f : 0.0f, irn1.o0(i6, 0, mlv.a, 2), "checkmark", (iu30) null, x340Var, 3072, 20);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z3 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar9 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar9);
            llj lljVar10 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar10);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            llj lljVar11 = y580.R0;
            nko1.H(numValueOf3, x340Var, lljVar11);
            nko1.F(x340Var);
            llj lljVar12 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar12);
            h2c h2cVar3 = h2c.a;
            j2iVar2 = j2iVar;
            j2iVar2.invoke(h2cVar3, x340Var, 54);
            gra graVar3 = een.h;
            qim0 qim0VarR3 = u291.r(eqr0.C(uyn1.x(h2cVar3.a(qim0Var4, een.f), f5), 2.0f, -2.0f), 4.0f + f);
            zI = x340Var.i(tob1VarB);
            objT = x340Var.T();
            if (zI) {
                objT = new lq2(tob1VarB, (byte) 28);
                x340Var.s0(objT);
            } else {
                objT = new lq2(tob1VarB, (byte) 28);
                x340Var.s0(objT);
            }
            qim0 qim0VarC3 = i541.C(qim0VarR3, (iu30) objT);
            uwr uwrVar3 = cbx.a;
            float f8 = f5;
            qim0 qim0VarF3 = dug.f(qim0VarC3, cbx.a(x340Var).a.c, er31.a);
            gfh0 gfh0VarC4 = t1c.c(graVar3, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar9);
            nko1.H(xos0VarM4, x340Var, lljVar10);
            x0d.q(iHashCode4, x340Var, lljVar11, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar12);
            w0h1.a(klx.c, isl.a, u291.r(qim0Var4, f), cbx.a(x340Var).c.a, 0L, false, x340Var, klx.d | 48, 48);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            f4 = f8;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var3 = qim0Var2;
            f4 = f3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qvf(z, qim0Var3, f, f4, j2iVar2, i, i2);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-385687282);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function2 = function1;
            mqo1.e(function2, null, null, eoi.h, eoi.i, apo.r(1966158736, new vgz(function0, (byte) 11), x340Var), apo.r(1975929297, new vgz(function1, (byte) 12), x340Var), x340Var, ((i2 >> 3) & 14) | 1797120, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, (byte) 23);
        }
    }

    public static final void c(ct10 ct10Var, htr htrVar, Function0 function0, Function0 function1, qim0 qim0Var, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var;
        x340 x340Var2;
        boolean z4;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(345335613);
        j06 j06Var = x340Var3.a;
        int i2 = (x340Var3.g(ct10Var) ? 4 : 2) | i | (x340Var3.i(htrVar) ? 32 : 16);
        if ((i & 384) == 0) {
            function2 = function0;
            i2 |= x340Var3.i(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.i(function1) ? 2048 : 1024;
        }
        int i3 = i2 | (x340Var3.i(qim0Var) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i3 |= x340Var3.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var3.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var3.h(z3) ? 8388608 : 4194304;
        }
        if (x340Var3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            fra fraVar = een.Z;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z5 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarX = bin.x(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), false, cwl1.o0(x340Var3, 2131963082), null, null, function2, 13);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarX);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarZ);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            int i4 = i3;
            uwo1.e(ct10Var.b, null, cbx.d(x340Var3).g, cbx.a(x340Var3).b.a, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2034);
            nim0 nim0Var = nim0.a;
            if (z2 && z3) {
                x340Var3.i0(1846001744);
                String strO0 = cwl1.o0(x340Var3, 2131963072);
                lee1 lee1Var = cbx.d(x340Var3).m;
                long j = cbx.a(x340Var3).b.d;
                cvx cvxVar2 = cbx.b(x340Var3).b;
                uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), lee1Var, j, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2032);
                x340Var2 = x340Var3;
                z4 = false;
                x340Var2.r(false);
            } else {
                x340Var3.i0(1846334405);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                cvx cvxVar4 = cbx.b(x340Var3).b;
                jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var3, 0);
                int iHashCode3 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM3 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarB);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA2, x340Var3, lljVar);
                nko1.H(xos0VarM3, x340Var3, lljVar2);
                x0d.q(iHashCode3, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE3, x340Var3, lljVar4);
                uwo1.e(htrVar.a(ct10Var.c), null, cbx.d(x340Var3).m, cbx.a(x340Var3).b.b, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2034);
                fq7.f(z && ct10Var.d, (qim0) null, xay.e(3, (ni20) null), xay.f(2, new pxg1(150, CtaType.CTA_WAITLISTED_FIELD_NUMBER, new ceo(0.4f, 0.0f, 1.0f, 1.0f))), (String) null, eoi.a, x340Var3, 1572870, 18);
                x340Var2 = x340Var3;
                x340Var2.r(true);
                z4 = false;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            boolean z6 = (i4 & 7168) == 2048 ? true : z4;
            Object objT = x340Var2.T();
            if (z6 || objT == fkj0.X) {
                objT = new in00(function1, (byte) 18);
                x340Var2.s0(objT);
            }
            x340 x340Var4 = x340Var2;
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, null, null, yla.s(x340Var4), null, false, null, null, eoi.b, x340Var4, 0, 6, 988);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u96(ct10Var, htrVar, function0, function1, qim0Var, z, z2, z3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v29 */
    public static final void d(nho0 nho0Var, j5c j5cVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, tob1 tob1Var, boolean z, boolean z2, boolean z3, int i, Function0 function3, b0k b0kVar, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        Function0 function4;
        Function0 function5;
        b0k b0kVar2;
        Object tc1Var;
        m4c m4cVar;
        Integer num;
        char c;
        icr0 icr0Var;
        Throwable th;
        y7e1 y7e1Var;
        Throwable th2;
        ?? r9;
        qim0 qim0Var2;
        int i6;
        hax haxVar;
        nho0 nho0Var2 = nho0Var;
        Function0 function6 = function0;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1021604909);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.g(nho0Var2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.i(j5cVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.i(function6) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.i(function1) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar3.i(function2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar3.i(tob1Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar3.h(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar3.h(z2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar3.h(z3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar3.i(function3) ? 256 : 128;
        }
        int i7 = i5;
        int i8 = i4;
        if (b0kVar3.Y(i8 & 1, ((i4 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            Object objT = b0kVar3.T();
            if (objT == m4cVar2) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            String str = nho0Var2.a;
            y7e1 y7e1VarD = c4p1.D(0, 2, str, b0kVar3);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar2) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            icr0 icr0Var2 = (icr0) b0kVar3.k(cvd1.a);
            boolean zI = b0kVar3.i(lz20Var);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar2) {
                objT4 = new fx1(lz20Var, null, (byte) 6);
                b0kVar3.s0(objT4);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT4);
            Integer numValueOf = Integer.valueOf(i);
            boolean zI2 = ((i7 & 112) == 32) | b0kVar3.i(lz20Var) | b0kVar3.i(k6a1Var) | b0kVar3.i(tob1Var) | b0kVar3.i(j5cVar) | b0kVar3.i(icr0Var2);
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == m4cVar2) {
                m4cVar = m4cVar2;
                b0kVar2 = b0kVar3;
                num = numValueOf;
                c = 4;
                icr0Var = icr0Var2;
                tc1Var = new tc1(i, lz20Var, k6a1Var, tob1Var, j5cVar, icr0Var, (lnm) null, (byte) 19);
                lz20Var = lz20Var;
                b0kVar2.s0(tc1Var);
            } else {
                num = numValueOf;
                b0kVar2 = b0kVar3;
                tc1Var = objT5;
                c = 4;
                icr0Var = icr0Var2;
                m4cVar = m4cVar2;
            }
            qxd0.t(num, b0kVar2, (vu30) tc1Var);
            int i9 = i8 & 14;
            boolean zI3 = b0kVar2.i(y7e1VarD) | (i9 == c);
            Object objT6 = b0kVar2.T();
            if (zI3 || objT6 == m4cVar) {
                th = null;
                objT6 = new h210(y7e1VarD, nho0Var2, (lnm) null, (byte) 5);
                b0kVar2.s0(objT6);
            } else {
                th = null;
            }
            qxd0.t(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0244: INVOKE 
                  (r29v0 ?? I:??[OBJECT, ARRAY])
                  (r12v5 'b0kVar2' p.b0k)
                  (wrap p.vu30:0x0242: CHECK_CAST (p.vu30) (r4v14 'objT6' java.lang.Object))
                 STATIC call: p.qxd0.t(java.lang.Object, p.b0k, p.vu30):void A[MD:(java.lang.Object, p.b0k, p.vu30):void (m)] (LINE:581) in method: p.cyo1.d(p.nho0, p.j5c, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.tob1, boolean, boolean, boolean, int, kotlin.jvm.functions.Function0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1753
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.cyo1.d(p.nho0, p.j5c, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.tob1, boolean, boolean, boolean, int, kotlin.jvm.functions.Function0, p.b0k, int, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:192:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:198:0x04da  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v27, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r10v29 */
        /* JADX WARN: Type inference failed for: r10v36 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r39v2 */
        /* JADX WARN: Type inference failed for: r39v3 */
        public static final void e(ct10 ct10Var, htr htrVar, nho0 nho0Var, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, iu30 iu30Var, Function0 function7, Function0 function8, Function0 function9, qim0 qim0Var, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str, iu30 iu30Var2, Function0 function10, b0k b0kVar, int i2) throws Throwable {
            Function0 function11;
            Function0 function12;
            qim0 qim0Var2;
            Object obj;
            boolean z6;
            float f;
            qim0 qim0VarE;
            long jA;
            boolean z7;
            boolean z8;
            tob1 tob1Var;
            ?? r10;
            m4c m4cVar;
            Object obj2;
            ?? r39;
            int i3;
            Object obj3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-693628283);
            j06 j06Var = x340Var.a;
            int i4 = i2 | (x340Var.g(ct10Var) ? 4 : 2) | (x340Var.i(htrVar) ? 32 : 16) | (x340Var.g(nho0Var) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | (x340Var.i(function2) ? 1048576 : 524288) | (x340Var.i(function3) ? 8388608 : 4194304) | (x340Var.i(function4) ? 67108864 : 33554432) | (x340Var.i(function5) ? 536870912 : 268435456);
            int i5 = (x340Var.i(function6) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function7) ? 256 : 128) | (x340Var.i(function8) ? 2048 : 1024) | (x340Var.i(function9) ? 16384 : 8192) | 196608 | (x340Var.h(z2) ? 1048576 : 524288) | (x340Var.h(z3) ? 8388608 : 4194304) | (x340Var.h(z4) ? 67108864 : 33554432) | (x340Var.h(z5) ? 536870912 : 268435456);
            int i6 = (x340Var.e(i) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | (x340Var.i(function10) ? 2048 : 1024);
            if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
                boolean z9 = nho0Var != null;
                boolean z10 = nho0Var != null && nho0Var.a.length() >= 500;
                Object objT = x340Var.T();
                m4c m4cVar2 = fkj0.X;
                Object obj4 = objT;
                if (objT == m4cVar2) {
                    j5c j5cVar = new j5c();
                    x340Var.s0(j5cVar);
                    obj4 = j5cVar;
                }
                j5c j5cVar2 = (j5c) obj4;
                Object objT2 = x340Var.T();
                Object obj5 = objT2;
                if (objT2 == m4cVar2) {
                    hrr0 hrr0VarQ = v8r.q((Object) null);
                    x340Var.s0(hrr0VarQ);
                    obj5 = hrr0VarQ;
                }
                tob1 tob1Var2 = (ven0) obj5;
                Object objT3 = x340Var.T();
                Object obj6 = objT3;
                if (objT3 == m4cVar2) {
                    hrr0 hrr0VarQ2 = v8r.q((Object) null);
                    x340Var.s0(hrr0VarQ2);
                    obj6 = hrr0VarQ2;
                }
                ven0 ven0Var = (ven0) obj6;
                qim0 qim0Var3 = nim0.a;
                boolean z11 = z10;
                qim0 qim0VarN = aym.n(u291.f(qim0Var3, 1.0f), j5cVar2);
                boolean zI = x340Var.i(ven0Var);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar2) {
                    d7v d7vVar = new d7v(ven0Var, (byte) 25);
                    x340Var.s0(d7vVar);
                    obj = d7vVar;
                } else {
                    obj = objT4;
                }
                qim0 qim0VarX = ern1.x(qim0VarN, (iu30) obj);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z12 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z12) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarF);
                if (z3 || (z9 && z11)) {
                    z6 = false;
                    x340Var.i0(413688103);
                    f = 8.0f;
                    qim0VarE = d1u.E(1.0f, cbx.a(x340Var).b.d, qim0Var3, er31.b(8.0f));
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(413799021);
                    z6 = false;
                    x340Var.r(false);
                    qim0VarE = qim0Var3;
                    f = 8.0f;
                }
                qim0 qim0VarThen = qim0VarZ.then(qim0VarE);
                if (z9) {
                    x340Var.i0(1675921400);
                    jA = cbx.a(x340Var).a.a.c();
                    x340Var.r(z6);
                } else {
                    x340Var.i0(1675923475);
                    jA = cbx.a(x340Var).a.a.a();
                    x340Var.r(z6);
                }
                qim0 qim0VarF2 = dug.f(qim0VarThen, jA, er31.b(f));
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarF2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                if (z9) {
                    x340Var.i0(1144900749);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    int i7 = i5 << 3;
                    x340 x340Var2 = x340Var;
                    d(nho0Var, j5cVar2, iu30Var, function7, function8, function9, new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), ven0Var, z3, z4, z5, i, function10, x340Var2, (458752 & i7) | ((i4 >> 6) & 14) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i5 >> 27) & 14) | ((i6 << 3) & 112) | ((i6 >> 3) & 896));
                    x340Var = x340Var2;
                    z7 = false;
                    x340Var.r(false);
                    z8 = true;
                } else {
                    z7 = false;
                    x340Var.i0(1145498739);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    z8 = true;
                    int i8 = i4 >> 6;
                    int i9 = (i4 & 126) | (i8 & 896) | (i8 & 7168);
                    int i10 = i5 >> 3;
                    c(ct10Var, htrVar, function0, function1, new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), z2, z3, z4, x340Var, (458752 & i10) | i9 | (3670016 & i10) | (29360128 & i10));
                    x340Var.r(false);
                }
                x340Var.r(z8);
                if (z9) {
                    x340Var.i0(415274187);
                    eyo1.c((i6 >> 3) & 126, str, x340Var, iu30Var2);
                    x340Var.r(z7);
                } else {
                    x340Var.i0(415343379);
                    x340Var.r(z7);
                }
                x340Var.r(z8);
                if (z) {
                    x340Var.i0(-789272777);
                    scx scxVarM = pno1.m(x340Var);
                    x340 x340Var3 = x340Var;
                    boolean z13 = z7 ? 1 : 0;
                    tob1Var = tob1Var2;
                    x74.f(function2, scxVarM, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(950117931, new jb1((Object) scxVarM, (Object) function3, (Object) function4, (Object) tob1Var2, (Object) ct10Var, (byte) 15), x340Var), x340Var3, ((i4 >> 18) & 14) | 1572864, 48, 1980);
                    x340Var = x340Var3;
                    r10 = 0;
                    x340Var.r(false);
                } else {
                    tob1Var = tob1Var2;
                    x340Var.i0(-788836483);
                    x340Var.r(z7);
                    r10 = z7;
                }
                if (((ct10) tob1Var.getValue()) == null) {
                    x340Var.i0(-788811839);
                    x340Var.r((boolean) r10);
                    function11 = function5;
                    function12 = function6;
                } else {
                    x340Var.i0(-788811838);
                    tob1 tob1Var3 = tob1Var;
                    int i11 = (x340Var.i(tob1Var3) ? 1 : 0) | ((i4 & 1879048192) == 536870912 ? z8 : r10);
                    Object objT5 = x340Var.T();
                    if (i11 == 0) {
                        m4cVar = m4cVar2;
                        if (objT5 != m4cVar) {
                            function11 = function5;
                            obj2 = objT5;
                        }
                        Function0 function13 = (Function0) obj2;
                        boolean zI2 = x340Var.i(tob1Var3);
                        r39 = z8;
                        if ((i5 & 14) != 4) {
                            r39 = r10;
                        }
                        i3 = (zI2 ? 1 : 0) | r39;
                        Object objT6 = x340Var.T();
                        if (i3 == 0 || objT6 == m4cVar) {
                            function12 = function6;
                            cb cbVar = new cb(function12, tob1Var3, (byte) 16);
                            x340Var.s0(cbVar);
                            obj3 = cbVar;
                        } else {
                            function12 = function6;
                            obj3 = objT6;
                        }
                        b(function13, (Function0) obj3, x340Var, r10);
                        x340Var.r((boolean) r10);
                    } else {
                        m4cVar = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04b0: MOVE (r0v24 'm4cVar' p.m4c) = (r28v3 p.m4c) in method: p.cyo1.e(p.ct10, p.htr, p.nho0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, boolean, boolean, boolean, boolean, int, java.lang.String, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v3 p.m4c
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1346
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.cyo1.e(p.ct10, p.htr, p.nho0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, boolean, boolean, boolean, boolean, int, java.lang.String, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int):void");
                    }

                    public static final void f(boolean z, b0k b0kVar, int i) {
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1052509954);
                        int i2 = (x340Var.h(z) ? 4 : 2) | i;
                        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                            boolean z2 = false;
                            d36 d36Var = new d36(16.0f, true, new um5(false));
                            if ((i2 & 14) == 4) {
                                z2 = true;
                            }
                            Object objT = x340Var.T();
                            if (z2 || objT == fkj0.X) {
                                objT = new mj10((byte) 23, z);
                                x340Var.s0(objT);
                            }
                            s3o1.e(qim0VarF, null, null, d36Var, null, null, null, (iu30) objT, x340Var, 0, 238);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new k750((byte) 27, i, z);
                        }
                    }

                    public static final void g(Function0 function0, Function0 function1, b0k b0kVar, int i) {
                        m4c m4cVar = fkj0.X;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(49818923);
                        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16);
                        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            float f = cbx.b(x340Var).b.e;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            cvx cvxVar3 = cbx.b(x340Var).b;
                            nim0 nim0Var = nim0.a;
                            qim0 qim0VarA = uyn1.A(nim0Var, 8.0f, 16.0f, 8.0f, f);
                            cvx cvxVar4 = cbx.b(x340Var).b;
                            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
                            int iHashCode = Long.hashCode(x340Var.T);
                            xos0 xos0VarM = x340Var.m();
                            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
                            uvx uvxVar = new uvx((pgx) null, 2, (tvx) null, (p3v) null, 26);
                            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                            boolean z = (i2 & 14) == 4;
                            Object objT = x340Var.T();
                            if (z || objT == m4cVar) {
                                objT = new in00(function0, (byte) 21);
                                x340Var.s0(objT);
                            }
                            z50 z50Var = z50.c;
                            jto1.b(qim0VarF, uvxVar, null, false, null, null, new gbx(z50Var, (Function0) objT), null, eoi.d, null, null, null, null, null, null, eoi.e, x340Var, 100663360, 196608, 32444);
                            uvx uvxVar2 = new uvx((pgx) null, 2, (tvx) null, (p3v) null, 26);
                            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                            boolean z2 = (i2 & 112) == 32;
                            Object objT2 = x340Var.T();
                            if (z2 || objT2 == m4cVar) {
                                objT2 = new in00(function1, (byte) 22);
                                x340Var.s0(objT2);
                            }
                            jto1.b(qim0VarF2, uvxVar2, null, false, null, null, new gbx(z50Var, (Function0) objT2), null, eoi.f, null, null, null, null, null, null, eoi.g, x340Var, 100663360, 196608, 32444);
                            x340Var = x340Var;
                            x340Var.r(true);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new n4d(function0, function1, i, (byte) 24);
                        }
                    }

                    public static final void h(Integer num, qim0 qim0Var, b0k b0kVar, int i) {
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1495469382);
                        int i2 = (x340Var.g(num) ? 4 : 2) | i | 48;
                        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                            qim0 qim0Var3 = nim0.a;
                            qim0 qim0VarR = u291.r(qim0Var3, 56.0f);
                            mgx mgxVar = mgx.e;
                            uwr uwrVar = cbx.a;
                            cua cuaVar = cbx.b(x340Var).f;
                            cr31 cr31VarB = er31.b(4.0f);
                            cvx cvxVar = cbx.b(x340Var).b;
                            cwl1.b(qim0VarR, (tl3) null, cr31VarB, mgxVar, new zzq0(12.0f, 12.0f, 12.0f, 12.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1960790819, new hbt0(num, (byte) 0), x340Var), x340Var, 0, 48, 2018);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fbt0(num, qim0Var2, i, (byte) 1);
                        }
                    }

                    public static final void i(String str, if5 if5Var, Integer num, Function0 function0, qim0 qim0Var, max maxVar, b0k b0kVar, int i) {
                        j2i j2iVarB;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(1919810979);
                        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(if5Var) ? 32 : 16) | (x340Var.g(num) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192) | (x340Var.i(maxVar) ? 131072 : 65536);
                        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
                            x340Var.d0();
                            if ((i & 1) != 0 && !x340Var.E()) {
                                x340Var.b0();
                            }
                            x340Var.s();
                            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                            if (if5Var == null) {
                                x340Var.i0(1304707504);
                                x340Var.r(false);
                                j2iVarB = null;
                            } else {
                                x340Var.i0(-1897575311);
                                j2iVarB = if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, 4096 | ((i2 << 6) & 7168), 7);
                                x340Var.r(false);
                            }
                            j2i j2iVar = j2iVarB;
                            boolean z = (i2 & 7168) == 2048;
                            Object objT = x340Var.T();
                            if (z || objT == fkj0.X) {
                                objT = new isr0(function0, (byte) 19);
                                x340Var.s0(objT);
                            }
                            jto1.b(qim0VarF, null, maxVar, false, null, null, new gbx(z50.c, (Function0) objT), null, apo.r(534127533, new hbt0(num, (byte) 1), x340Var), null, null, j2iVar, null, null, null, apo.r(835293671, new qdg0(str, (byte) 26), x340Var), x340Var, ((i2 >> 9) & 896) | 100663296, 196608, 30394);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new uuy(str, (Object) if5Var, (Object) num, (Object) function0, (Object) qim0Var, (Object) maxVar, i, (byte) 28);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v10 */
                    /* JADX WARN: Type inference failed for: r2v2 */
                    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, byte, int] */
                    public static final void j(du01 du01Var, d0r d0rVar, bpb1 bpb1Var, vfp vfpVar, w460 w460Var, b0k b0kVar, int i) {
                        int i2;
                        x340 x340Var;
                        ?? r2;
                        boolean z;
                        Object obj = fkj0.X;
                        boolean z2 = du01Var.e;
                        boolean z3 = du01Var.c;
                        List list = du01Var.b;
                        x340 x340Var2 = (x340) b0kVar;
                        x340Var2.k0(1182580071);
                        if ((i & 6) == 0) {
                            i2 = (x340Var2.i(du01Var) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var2.i(d0rVar) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= x340Var2.i(bpb1Var) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= (i & 4096) == 0 ? x340Var2.g(vfpVar) : x340Var2.i(vfpVar) ? 2048 : 1024;
                        }
                        if ((i & 24576) == 0) {
                            i2 |= (32768 & i) == 0 ? x340Var2.g(w460Var) : x340Var2.i(w460Var) ? 16384 : 8192;
                        }
                        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
                            int i3 = i2;
                            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var2).b;
                            Object objT = x340Var2.T();
                            if (objT == obj) {
                                wgp wgpVar = (wgp) vfpVar.a.c;
                                Activity activityA = wgpVar.a.a();
                                c8o.l(activityA);
                                lo60 lo60VarU = wgpVar.u();
                                vgm vgmVarD = wgpVar.a.d();
                                c8o.l(vgmVarD);
                                agc0 agc0VarL = wgpVar.a.l();
                                c8o.l(agc0VarL);
                                agc0 agc0VarL2 = wgpVar.a.l();
                                c8o.l(agc0VarL2);
                                vyq0 vyq0Var = new vyq0(agc0VarL2, wgpVar.h());
                                qk00 qk00Var = wgpVar.a;
                                xfx xfxVarE = qk00Var.e();
                                c8o.l(xfxVarE);
                                kv01 kv01Var = (kv01) qk00Var.E.get();
                                c8o.l(kv01Var);
                                fgx fgxVarT = tk00.t(xfxVarE, kv01Var, wgpVar.h());
                                zwm1 zwm1Var = (zwm1) wgpVar.a.s0.get();
                                c8o.l(zwm1Var);
                                vh4 vh4VarA = wgpVar.a();
                                agc0 agc0VarL3 = wgpVar.a.l();
                                c8o.l(agc0VarL3);
                                uqv0 uqv0Var = new uqv0(agc0VarL3, wgpVar.a());
                                gw70 gw70VarK = wgpVar.a.k();
                                c8o.l(gw70VarK);
                                r2 = 0;
                                objT = new kt01(d0rVar, bpb1Var, activityA, lo60VarU, vgmVarD, agc0VarL, vyq0Var, fgxVarT, zwm1Var, vh4VarA, uqv0Var, gw70VarK, wgpVar.h(), wgpVar.c());
                                x340Var2.s0(objT);
                            } else {
                                r2 = 0;
                            }
                            kt01 kt01Var = (kt01) objT;
                            boolean zG = x340Var2.g(list);
                            Object objT2 = x340Var2.T();
                            Object obj2 = objT2;
                            if (zG || objT2 == obj) {
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((cr01) it.next()).a);
                                }
                                x340Var2.s0(arrayList);
                                obj2 = arrayList;
                            }
                            qqn1.c((List) obj2, xtb0VarA, x340Var2, (int) r2);
                            boolean zH = x340Var2.h(z3) | x340Var2.h(z2) | x340Var2.g(list);
                            Object objT3 = x340Var2.T();
                            if (zH || objT3 == obj) {
                                if (z2) {
                                    z = 1;
                                } else {
                                    List list3 = list;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator it2 = list3.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                if (((cr01) it2.next()).k) {
                                                    z = 1;
                                                }
                                            }
                                        }
                                    }
                                    z = r2;
                                }
                                objT3 = Integer.valueOf(axo1.l(z3, z));
                                x340Var2.s0(objT3);
                            }
                            int iIntValue = ((Number) objT3).intValue();
                            nim0 nim0Var = nim0.a;
                            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, (int) r2);
                            int iHashCode = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM = x340Var2.m();
                            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                            hzj.A.getClass();
                            if (x340Var2.a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(hmb0.t1);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(mbhVarA, x340Var2, y580.O0);
                            nko1.H(xos0VarM, x340Var2, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                            nko1.F(x340Var2);
                            nko1.H(qim0VarE, x340Var2, y580.Y);
                            k(du01Var.a, w460Var, x340Var2, ((i3 >> 9) & 112) | 64);
                            qim0 qim0VarX = j9k1.x(u291.f(nim0Var, 1.0f), new ac8(3, (byte) 26));
                            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                            d36 d36Var = new d36(16.0f, true, new um5((boolean) r2));
                            boolean zI = x340Var2.i(du01Var) | x340Var2.e(iIntValue) | x340Var2.i(kt01Var);
                            Object objT4 = x340Var2.T();
                            if (zI || objT4 == obj) {
                                objT4 = new ju01(du01Var, iIntValue, kt01Var, (byte) r2);
                                x340Var2.s0(objT4);
                            }
                            s3o1.e(qim0VarX, xtb0VarA, zzq0VarH, d36Var, null, null, null, (iu30) objT4, x340Var2, 0, 232);
                            x340Var = x340Var2;
                            x340Var.r(true);
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new lqf0((byte) 22, i, du01Var, d0rVar, bpb1Var, vfpVar, w460Var);
                        }
                    }

                    public static final void k(x360 x360Var, w460 w460Var, b0k b0kVar, int i) {
                        int i2;
                        w460 w460Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(83350600);
                        if ((i & 6) == 0) {
                            i2 = (x340Var.i(x360Var) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= (i & 64) == 0 ? x340Var.g(w460Var) : x340Var.i(w460Var) ? 32 : 16;
                        }
                        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                            hvl1 hvl1Var = x360Var instanceof hvl1 ? (hvl1) x360Var : null;
                            if (hvl1Var == null) {
                                h311 h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new ku01(x360Var, w460Var, i, (byte) 1);
                                    return;
                                }
                                return;
                            }
                            w460Var2 = w460Var;
                            otw.c(w460Var2, tho1.v(hvl1Var), (qim0) null, (ipb1) null, x340Var, 8 | ((i2 >> 3) & 14), 12);
                        } else {
                            w460Var2 = w460Var;
                            x340Var.b0();
                        }
                        h311 h311VarV2 = x340Var.v();
                        if (h311VarV2 != null) {
                            h311VarV2.d = new ku01(x360Var, w460Var2, i, (byte) 0);
                        }
                    }

                    public static final String l(gvw0 gvw0Var) {
                        evw0 evw0Var = gvw0Var instanceof evw0 ? (evw0) gvw0Var : null;
                        if (evw0Var != null) {
                            String strN = ((ProductStateProto) evw0Var.a.b).n();
                            if (strN.length() > 0) {
                                return strN;
                            }
                        }
                        return null;
                    }

                    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
                    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
                    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
                    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
                    public static gd70 m(w570 w570Var, j670 j670Var, x570 x570Var, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, me70 me70Var, String str, String str2, Map map, List list) {
                        ad70 ad70Var;
                        id70 id70Var;
                        id70 id70Var2;
                        dd70 dd70VarM;
                        od70 od70VarK;
                        ad70 ad70Var2 = ad70.d;
                        if (w570Var != null) {
                            ad70Var = w570Var instanceof ad70 ? (ad70) w570Var : new ad70(w570Var.a(), w570Var.b());
                        } else {
                            ad70Var = ad70.d;
                        }
                        id70 id70Var3 = id70.c;
                        if (j670Var != null) {
                            if (j670Var instanceof id70) {
                                id70Var = (id70) j670Var;
                            } else {
                                hd70 hd70Var = ((id70) j670Var).a;
                                id70Var2 = new id70(hd70Var.a, hd70Var.b, hd70Var.c, hd70Var.d);
                            }
                            dd70 dd70Var = dd70.c;
                            if (x570Var != null) {
                                dd70VarM = dd70.c;
                            } else if (x570Var instanceof dd70) {
                                dd70VarM = (dd70) x570Var;
                            } else {
                                cd70 cd70Var = ((dd70) x570Var).a;
                                dd70VarM = byo1.m(cd70Var.c, cd70Var.d, cd70Var.e, cd70Var.f);
                            }
                            dd70 dd70Var2 = dd70VarM;
                            HubsImmutableComponentBundle hubsImmutableComponentBundle4 = HubsImmutableComponentBundle.b;
                            HubsImmutableComponentBundle hubsImmutableComponentBundleV = lqc.v(hubsImmutableComponentBundle);
                            HubsImmutableComponentBundle hubsImmutableComponentBundleV2 = lqc.v(hubsImmutableComponentBundle2);
                            HubsImmutableComponentBundle hubsImmutableComponentBundleV3 = lqc.v(hubsImmutableComponentBundle3);
                            Parcelable.Creator creator = od70.CREATOR;
                            if (me70Var != null) {
                                od70VarK = null;
                            } else if (me70Var instanceof od70) {
                                od70VarK = (od70) me70Var;
                            } else {
                                md70 md70Var = ((od70) me70Var).a;
                                od70VarK = fyo1.k(md70Var.a, md70Var.b);
                            }
                            od70 od70Var = od70VarK;
                            sc70 sc70Var = sc70.d;
                            return new gd70(ad70Var, id70Var2, dd70Var2, hubsImmutableComponentBundleV, hubsImmutableComponentBundleV2, hubsImmutableComponentBundleV3, od70Var, str, str2, w3p1.s(map, sc70.class, hh60.W0), zxo1.r(list));
                        }
                        id70Var = id70.c;
                        id70Var2 = id70Var;
                        dd70 dd70Var3 = dd70.c;
                        if (x570Var != null) {
                            dd70VarM = dd70.c;
                        } else if (x570Var instanceof dd70) {
                            dd70VarM = (dd70) x570Var;
                        } else {
                            cd70 cd70Var2 = ((dd70) x570Var).a;
                            dd70VarM = byo1.m(cd70Var2.c, cd70Var2.d, cd70Var2.e, cd70Var2.f);
                        }
                        dd70 dd70Var4 = dd70VarM;
                        HubsImmutableComponentBundle hubsImmutableComponentBundle5 = HubsImmutableComponentBundle.b;
                        HubsImmutableComponentBundle hubsImmutableComponentBundleV4 = lqc.v(hubsImmutableComponentBundle);
                        HubsImmutableComponentBundle hubsImmutableComponentBundleV5 = lqc.v(hubsImmutableComponentBundle2);
                        HubsImmutableComponentBundle hubsImmutableComponentBundleV6 = lqc.v(hubsImmutableComponentBundle3);
                        Parcelable.Creator creator2 = od70.CREATOR;
                        if (me70Var != null) {
                            od70VarK = null;
                        } else if (me70Var instanceof od70) {
                            od70VarK = (od70) me70Var;
                        } else {
                            md70 md70Var2 = ((od70) me70Var).a;
                            od70VarK = fyo1.k(md70Var2.a, md70Var2.b);
                        }
                        od70 od70Var2 = od70VarK;
                        sc70 sc70Var2 = sc70.d;
                        return new gd70(ad70Var, id70Var2, dd70Var4, hubsImmutableComponentBundleV4, hubsImmutableComponentBundleV5, hubsImmutableComponentBundleV6, od70Var2, str, str2, w3p1.s(map, sc70.class, hh60.W0), zxo1.r(list));
                    }

                    public static Intent n(Context context, Intent intent) {
                        Intent intent2 = new Intent(context, (Class<?>) AccountSelectionActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("key_source_intent", intent);
                        intent2.putExtras(bundle);
                        return intent2;
                    }

                    public static final ArrayList o(List list, txs0 txs0Var) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            gxs0 gxs0Var = (jxs0) obj;
                            boolean zContains = true;
                            if (txs0Var != null && (gxs0Var instanceof gxs0)) {
                                zContains = gxs0Var.f.contains(txs0Var.b);
                            }
                            if (zContains) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int i = 0;
                        for (Object obj2 : arrayList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                p7h.T();
                                throw null;
                            }
                            jxs0 jxs0Var = (jxs0) obj2;
                            if ((!(jxs0Var instanceof hxs0) || (o7h.t0(i2, arrayList) instanceof gxs0)) && (!(jxs0Var instanceof ixs0) || (o7h.t0(i - 1, arrayList) instanceof gxs0))) {
                                arrayList2.add(obj2);
                            }
                            i = i2;
                        }
                        return arrayList2;
                    }

                    public static gd70 p(y570 y570Var) {
                        return y570Var instanceof gd70 ? (gd70) y570Var : m(y570Var.h(), y570Var.n(), y570Var.k(), y570Var.b(), y570Var.r(), y570Var.g(), y570Var.t(), y570Var.a(), y570Var.group(), y570Var.j(), y570Var.s());
                    }

                    public static final go80 q(klm klmVar, sap0 sap0Var, sbp0 sbp0Var) {
                        return klmVar.a("EventSenderLogoutDaemon", new rap0(sap0Var, sbp0Var, (byte) 16));
                    }

                    /* JADX WARN: Code duplicated, block: B:113:0x02e1 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:114:0x02e3 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:115:0x02e5  */
                    /* JADX WARN: Code duplicated, block: B:116:0x02e8  */
                    /* JADX WARN: Code duplicated, block: B:117:0x02eb  */
                    /* JADX WARN: Code duplicated, block: B:120:0x0345  */
                    /* JADX WARN: Code duplicated, block: B:122:0x034b  */
                    /* JADX WARN: Code duplicated, block: B:123:0x0353  */
                    /* JADX WARN: Code duplicated, block: B:124:0x0361  */
                    /* JADX WARN: Code duplicated, block: B:127:0x0369  */
                    /* JADX WARN: Code duplicated, block: B:129:0x036f  */
                    /* JADX WARN: Code duplicated, block: B:130:0x0377  */
                    /* JADX WARN: Code duplicated, block: B:131:0x0385  */
                    /* JADX WARN: Code duplicated, block: B:133:0x0389  */
                    /* JADX WARN: Code duplicated, block: B:134:0x038c  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0392  */
                    public static final c180 r(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
                        long jE;
                        int i2;
                        int i3;
                        int i4;
                        int i5;
                        int iS;
                        int i6;
                        mgc mgcVarQ;
                        int iS2;
                        Brush n6a1Var;
                        Brush n6a1Var2;
                        int i7;
                        Shader shader;
                        Shader shader2;
                        int i8;
                        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
                        u65 u65Var = new u65(xmlResourceParser2);
                        TypedArray typedArrayF = xzn1.F(resources, theme, attributeSetAsAttributeSet, eth.b);
                        u65Var.b(typedArrayF.getChangingConfigurations());
                        boolean zO = xzn1.o(typedArrayF, xmlResourceParser2, false);
                        u65Var.b(typedArrayF.getChangingConfigurations());
                        float fA = u65Var.a(typedArrayF, "viewportWidth", 7, 0.0f);
                        float fA2 = u65Var.a(typedArrayF, "viewportHeight", 8, 0.0f);
                        if (fA <= 0.0f) {
                            throw new XmlPullParserException(f4i1.e(typedArrayF.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
                        }
                        if (fA2 <= 0.0f) {
                            throw new XmlPullParserException(f4i1.e(typedArrayF.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
                        }
                        float dimension = typedArrayF.getDimension(3, 0.0f);
                        u65Var.b(typedArrayF.getChangingConfigurations());
                        float dimension2 = typedArrayF.getDimension(2, 0.0f);
                        u65Var.b(typedArrayF.getChangingConfigurations());
                        if (typedArrayF.hasValue(1)) {
                            TypedValue typedValue = new TypedValue();
                            typedArrayF.getValue(1, typedValue);
                            if (typedValue.type == 2) {
                                jE = u7h.k;
                            } else {
                                ColorStateList colorStateListP = xzn1.p(typedArrayF, xmlResourceParser2, theme);
                                u65Var.b(typedArrayF.getChangingConfigurations());
                                jE = colorStateListP != null ? z4p1.e(colorStateListP.getDefaultColor()) : u7h.k;
                            }
                        } else {
                            jE = u7h.k;
                        }
                        long j = jE;
                        int i9 = typedArrayF.getInt(6, -1);
                        u65Var.b(typedArrayF.getChangingConfigurations());
                        if (i9 == -1) {
                            i2 = 5;
                        } else if (i9 == 3) {
                            i2 = 3;
                        } else if (i9 == 5) {
                            i2 = 5;
                        } else if (i9 != 9) {
                            switch (i9) {
                                case 14:
                                    i2 = 13;
                                    break;
                                case 15:
                                    i2 = 14;
                                    break;
                                case 16:
                                    i2 = 12;
                                    break;
                                default:
                                    i2 = 5;
                                    break;
                            }
                        } else {
                            i2 = 9;
                        }
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArrayF.recycle();
                        int i10 = 1;
                        a180 a180Var = new a180((String) null, f, f2, fA, fA2, j, i2, zO, 1);
                        int i11 = 0;
                        for (int i12 = 3; xmlResourceParser2.getEventType() != i10 && (xmlResourceParser2.getDepth() >= i10 || xmlResourceParser2.getEventType() != i12); i12 = 3) {
                            XmlPullParser xmlPullParser = u65Var.a;
                            int eventType = xmlPullParser.getEventType();
                            ArrayList arrayList = a180Var.i;
                            if (eventType != 2) {
                                if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                                    int i13 = i11 + 1;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if (a180Var.k) {
                                            qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        z080 z080Var = (z080) t2p1.e(arrayList);
                                        ((z080) t2p1.d(arrayList)).j.add(new aui1(z080Var.a, z080Var.b, z080Var.c, z080Var.d, z080Var.e, z080Var.f, z080Var.g, z080Var.h, z080Var.i, z080Var.j));
                                    }
                                    int[] iArr = u65Var.c;
                                    if (iArr == null || (i8 = u65Var.d) == 0) {
                                        i11 = 0;
                                    } else {
                                        int i15 = i8 - 1;
                                        u65Var.d = i15;
                                        i11 = iArr[i15];
                                    }
                                    i3 = 1;
                                } else {
                                    i3 = i10;
                                }
                                xmlResourceParser.next();
                                xmlResourceParser2 = xmlResourceParser;
                                i10 = i3;
                            } else {
                                String name = xmlPullParser.getName();
                                if (name != null) {
                                    int iHashCode = name.hashCode();
                                    ArrayList arrayListJ = z6x.a;
                                    tym0 tym0Var = u65Var.e;
                                    if (iHashCode != -1649314686) {
                                        if (iHashCode != 3433509) {
                                            if (iHashCode == 98629247 && name.equals("group")) {
                                                TypedArray typedArrayF2 = xzn1.F(resources, theme, attributeSetAsAttributeSet, eth.c);
                                                u65Var.b(typedArrayF2.getChangingConfigurations());
                                                float fA3 = u65Var.a(typedArrayF2, "rotation", 5, 0.0f);
                                                float f3 = typedArrayF2.getFloat(1, 0.0f);
                                                u65Var.b(typedArrayF2.getChangingConfigurations());
                                                float f4 = typedArrayF2.getFloat(2, 0.0f);
                                                u65Var.b(typedArrayF2.getChangingConfigurations());
                                                float fA4 = u65Var.a(typedArrayF2, "scaleX", 3, 1.0f);
                                                float fA5 = u65Var.a(typedArrayF2, "scaleY", 4, 1.0f);
                                                float fA6 = u65Var.a(typedArrayF2, "translateX", 6, 0.0f);
                                                float fA7 = u65Var.a(typedArrayF2, "translateY", 7, 0.0f);
                                                String string = typedArrayF2.getString(0);
                                                u65Var.b(typedArrayF2.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                typedArrayF2.recycle();
                                                int i16 = bui1.a;
                                                if (a180Var.k) {
                                                    qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                t2p1.f(arrayList, new z080(str, fA3, f3, f4, fA4, fA5, fA6, fA7, arrayListJ, 512));
                                                int[] iArrCopyOf = u65Var.c;
                                                if (iArrCopyOf == null) {
                                                    iArrCopyOf = new int[4];
                                                    u65Var.c = iArrCopyOf;
                                                } else if (u65Var.d >= iArrCopyOf.length) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                    u65Var.c = iArrCopyOf;
                                                }
                                                int i17 = u65Var.d;
                                                u65Var.d = i17 + 1;
                                                iArrCopyOf[i17] = i11;
                                                i11 = 0;
                                            }
                                        } else if (name.equals("path")) {
                                            TypedArray typedArrayF3 = xzn1.F(resources, theme, attributeSetAsAttributeSet, eth.d);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                hhg1.n("No path data available");
                                                return null;
                                            }
                                            String string2 = typedArrayF3.getString(0);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            String str2 = string2 == null ? "" : string2;
                                            String string3 = typedArrayF3.getString(2);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            if (string3 == null) {
                                                int i18 = bui1.a;
                                            } else {
                                                arrayListJ = tym0.j(tym0Var, string3);
                                            }
                                            ArrayList arrayList2 = arrayListJ;
                                            mgc mgcVarQ2 = xzn1.q(typedArrayF3, xmlPullParser, theme, "fillColor", 1);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            float fA8 = u65Var.a(typedArrayF3, "fillAlpha", 12, 1.0f);
                                            int iS3 = xzn1.s(typedArrayF3, xmlPullParser, "strokeLineCap", 8, -1);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            if (iS3 != 0) {
                                                if (iS3 != 1) {
                                                    i4 = 2;
                                                    if (iS3 == 2) {
                                                        i5 = 2;
                                                    }
                                                } else {
                                                    i4 = 2;
                                                    i5 = 1;
                                                }
                                                iS = xzn1.s(typedArrayF3, xmlPullParser, "strokeLineJoin", 9, -1);
                                                u65Var.b(typedArrayF3.getChangingConfigurations());
                                                if (iS == 0) {
                                                    i6 = 0;
                                                } else if (iS != 1) {
                                                    i6 = 1;
                                                } else if (iS != i4) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = i4;
                                                }
                                                float fA9 = u65Var.a(typedArrayF3, "strokeMiterLimit", 10, 4.0f);
                                                mgcVarQ = xzn1.q(typedArrayF3, xmlPullParser, theme, "strokeColor", 3);
                                                u65Var.b(typedArrayF3.getChangingConfigurations());
                                                float fA10 = u65Var.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                                float fA11 = u65Var.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                                float fA12 = u65Var.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                                float fA13 = u65Var.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                                float fA14 = u65Var.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                                iS2 = xzn1.s(typedArrayF3, xmlPullParser, "fillType", 13, 0);
                                                u65Var.b(typedArrayF3.getChangingConfigurations());
                                                typedArrayF3.recycle();
                                                if (mgcVarQ2.Y()) {
                                                    shader2 = (Shader) mgcVarQ2.c;
                                                    if (shader2 != null) {
                                                        n6a1Var = new w9c(shader2);
                                                    } else {
                                                        n6a1Var = new n6a1(z4p1.e(mgcVarQ2.b));
                                                    }
                                                } else {
                                                    n6a1Var = null;
                                                }
                                                if (mgcVarQ.Y()) {
                                                    shader = (Shader) mgcVarQ.c;
                                                    if (shader != null) {
                                                        n6a1Var2 = new w9c(shader);
                                                    } else {
                                                        n6a1Var2 = new n6a1(z4p1.e(mgcVarQ.b));
                                                    }
                                                } else {
                                                    n6a1Var2 = null;
                                                }
                                                if (iS2 == 0) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = 1;
                                                }
                                                if (a180Var.k) {
                                                    qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                ((z080) t2p1.d(arrayList)).j.add(new eui1(str2, arrayList2, i7, n6a1Var, fA8, n6a1Var2, fA10, fA11, i5, i6, fA9, fA14, fA12, fA13));
                                            } else {
                                                i4 = 2;
                                            }
                                            i5 = 0;
                                            iS = xzn1.s(typedArrayF3, xmlPullParser, "strokeLineJoin", 9, -1);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            if (iS == 0) {
                                                i6 = 0;
                                            } else if (iS != 1) {
                                                i6 = 1;
                                            } else if (iS != i4) {
                                                i6 = 0;
                                            } else {
                                                i6 = i4;
                                            }
                                            float fA15 = u65Var.a(typedArrayF3, "strokeMiterLimit", 10, 4.0f);
                                            mgcVarQ = xzn1.q(typedArrayF3, xmlPullParser, theme, "strokeColor", 3);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            float fA16 = u65Var.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                            float fA17 = u65Var.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                            float fA18 = u65Var.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                            float fA19 = u65Var.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                            float fA110 = u65Var.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                            iS2 = xzn1.s(typedArrayF3, xmlPullParser, "fillType", 13, 0);
                                            u65Var.b(typedArrayF3.getChangingConfigurations());
                                            typedArrayF3.recycle();
                                            if (mgcVarQ2.Y()) {
                                                shader2 = (Shader) mgcVarQ2.c;
                                                if (shader2 != null) {
                                                    n6a1Var = new w9c(shader2);
                                                } else {
                                                    n6a1Var = new n6a1(z4p1.e(mgcVarQ2.b));
                                                }
                                            } else {
                                                n6a1Var = null;
                                            }
                                            if (mgcVarQ.Y()) {
                                                shader = (Shader) mgcVarQ.c;
                                                if (shader != null) {
                                                    n6a1Var2 = new w9c(shader);
                                                } else {
                                                    n6a1Var2 = new n6a1(z4p1.e(mgcVarQ.b));
                                                }
                                            } else {
                                                n6a1Var2 = null;
                                            }
                                            if (iS2 == 0) {
                                                i7 = 0;
                                            } else {
                                                i7 = 1;
                                            }
                                            if (a180Var.k) {
                                                qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            ((z080) t2p1.d(arrayList)).j.add(new eui1(str2, arrayList2, i7, n6a1Var, fA8, n6a1Var2, fA16, fA17, i5, i6, fA15, fA110, fA18, fA19));
                                        }
                                        i3 = 1;
                                    } else if (name.equals("clip-path")) {
                                        TypedArray typedArrayF4 = xzn1.F(resources, theme, attributeSetAsAttributeSet, eth.e);
                                        u65Var.b(typedArrayF4.getChangingConfigurations());
                                        String string4 = typedArrayF4.getString(0);
                                        u65Var.b(typedArrayF4.getChangingConfigurations());
                                        String str3 = string4 == null ? "" : string4;
                                        i3 = 1;
                                        String string5 = typedArrayF4.getString(1);
                                        u65Var.b(typedArrayF4.getChangingConfigurations());
                                        if (string5 == null) {
                                            int i19 = bui1.a;
                                        } else {
                                            arrayListJ = tym0.j(tym0Var, string5);
                                        }
                                        ArrayList arrayList3 = arrayListJ;
                                        typedArrayF4.recycle();
                                        if (a180Var.k) {
                                            qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        t2p1.f(arrayList, new z080(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, arrayList3, 512));
                                        i11++;
                                    } else {
                                        i3 = 1;
                                    }
                                    xmlResourceParser.next();
                                    xmlResourceParser2 = xmlResourceParser;
                                    i10 = i3;
                                }
                            }
                            i3 = 1;
                            xmlResourceParser.next();
                            xmlResourceParser2 = xmlResourceParser;
                            i10 = i3;
                        }
                        return new c180(a180Var.b(), i | u65Var.b);
                    }

                    public static final f371 s(ShareConfiguration shareConfiguration, String str) {
                        return shareConfiguration.o().isEmpty() ? d371.a : new e371(new cmt(w(shareConfiguration.o()), 2), str);
                    }

                    public static final int t(otl otlVar) {
                        if (otlVar instanceof b5c0) {
                            return 0;
                        }
                        if (!(otlVar instanceof d6c0)) {
                            return 2;
                        }
                        List listA = ((d6c0) otlVar).a();
                        if ((listA instanceof Collection) && listA.isEmpty()) {
                            return 2;
                        }
                        Iterator it = listA.iterator();
                        while (it.hasNext()) {
                            if (((d6c0) it.next()) instanceof q5c0) {
                                return 1;
                            }
                        }
                        return 2;
                    }

                    public static final Object u(elb0 elb0Var, j5c j5cVar, icr0 icr0Var, a8d1 a8d1Var) {
                        d9n d9nVar = d9n.a;
                        if (elb0Var == null || !elb0Var.a() || icr0Var == null) {
                            Object objA = j5cVar.a((n511) null, a8d1Var);
                            if (objA == d9nVar) {
                                return objA;
                            }
                        } else {
                            Object objL = kqn1.l(icr0Var.a, ((Float.intBitsToFloat((int) (elb0Var.p(0L) & 4294967295L)) + ((int) (elb0Var.b() & 4294967295L))) - icr0Var.b.s()) + 10.0f, irn1.l0(0.0f, 0.0f, null, 7), a8d1Var);
                            if (objL == d9nVar) {
                                return objL;
                            }
                        }
                        return rih1.a;
                    }

                    public static final xdd1 v(uvl1 uvl1Var, int i) {
                        return new xdd1(uvl1Var.a, uvl1Var.b, i);
                    }

                    public static final ArrayList w(d290 d290Var) {
                        p471 p471Var;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = d290Var.iterator();
                        while (it.hasNext()) {
                            switch (((l471) it.next()).ordinal()) {
                                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                    p471Var = m471.d;
                                    break;
                                case 1:
                                    p471Var = l571.d;
                                    break;
                                case 2:
                                    p471Var = e571.d;
                                    break;
                                case 3:
                                    p471Var = w471.d;
                                    break;
                                case 4:
                                    p471Var = u471.d;
                                    break;
                                case 5:
                                    p471Var = f571.d;
                                    break;
                                case 6:
                                    p471Var = n571.d;
                                    break;
                                case 7:
                                    p471Var = s471.d;
                                    break;
                                case 8:
                                    p471Var = r471.d;
                                    break;
                                case 9:
                                    p471Var = x471.d;
                                    break;
                                case 10:
                                    p471Var = z471.d;
                                    break;
                                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                                    p471Var = p471.d;
                                    break;
                                default:
                                    p471Var = null;
                                    break;
                            }
                            if (p471Var != null) {
                                arrayList.add(p471Var);
                            }
                        }
                        return arrayList;
                    }

                    public static final b180 x(b0k b0kVar, int i) throws XmlPullParserException, IOException {
                        x340 x340Var = (x340) b0kVar;
                        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                        Resources resources = (Resources) x340Var.k(AndroidCompositionLocals_androidKt.c);
                        Resources.Theme theme = context.getTheme();
                        Configuration configuration = resources.getConfiguration();
                        boolean zG = x340Var.g(configuration) | x340Var.e(i) | x340Var.g(resources) | x340Var.g(theme);
                        Object objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            TypedValue typedValue = new TypedValue();
                            resources.getValue(i, typedValue, true);
                            XmlResourceParser xml = resources.getXml(i);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            objT = r(theme, resources, xml, typedValue.changingConfigurations).a;
                            x340Var.s0(objT);
                        }
                        return (b180) objT;
                    }
                }
