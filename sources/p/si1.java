package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Text;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.Alignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import com.spotify.mobius.Next;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class si1 implements vi1 {
    public static final lnm[] a = new lnm[0];
    public static oio1 b;
    public static b180 c;
    public static b180 d;

    public static final void a(Integer num, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, Function0 function2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1432975634);
        int i2 = i | (x340Var.g(num) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576 | (x340Var.i(function2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            String strO0 = cwl1.o0(x340Var, 2131952065);
            if (z) {
                x340Var.i0(2098554505);
                j2iVarR = apo.r(-929697006, new wm(function0, (byte) 8), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(2099059898);
                x340Var.r(false);
                j2iVarR = null;
            }
            c(strO0, apo.r(-360679552, new kf2(num, z, (byte) 0), x340Var), apo.r(-1361735423, new lf2(z, function1, function0, (byte) 0), x340Var), function2, j2iVarR, x340Var, ((i2 >> 6) & 7168) | 25008);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mf2(num, z, function0, function1, qim0Var2, function2, i, (byte) 0);
        }
    }

    public static final void b(Integer num, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, Function0 function2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(359022877);
        int i2 = i | (x340Var.g(num) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576 | (x340Var.i(function2) ? 131072 : 65536);
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            String strO0 = cwl1.o0(x340Var, 2131952068);
            if (z) {
                x340Var.i0(1182804993);
                j2iVarR = apo.r(-1243628771, new wm(function1, (byte) 9), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1183307503);
                x340Var.r(false);
                j2iVarR = null;
            }
            c(strO0, apo.r(1856611979, new mb2(num, b2), x340Var), apo.r(-490624884, new wm(function0, (byte) 10), x340Var), function2, j2iVarR, x340Var, ((i2 >> 6) & 7168) | 25008);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mf2(num, z, function0, function1, qim0Var2, function2, i, (byte) 1);
        }
    }

    public static final void c(String str, j2i j2iVar, j2i j2iVar2, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-140694919);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            wsx wsxVar = wsx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, x340Var, wsx.d | 48, 56);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(str, (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2018);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 3) & 14));
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
            j2iVar2.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
            if (vu30Var != null) {
                x340Var.i0(1136836249);
                op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
                z = false;
                rqo1.g(0, 1, x340Var, (qim0) null);
                op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
                us71.j((i2 >> 15) & 14, vu30Var, x340Var, false);
            } else {
                z = false;
                x340Var.i0(1137014995);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
            boolean z2 = (i2 & 7168) == 2048 ? true : z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                function1 = function0;
                objT = new y1(function1, (byte) 24);
                x340Var.s0(objT);
            } else {
                function1 = function0;
            }
            foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j5i.a, x340Var, 0, 48, 2044);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(str, j2iVar, j2iVar2, function1, vu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void d(Function0 function0, qim0 qim0Var, yf yfVar, b0k b0kVar, int i, int i2) {
        yf idxVar;
        int i3;
        boolean z;
        qim0 qim0Var2;
        h311 h311VarV;
        int i4;
        qim0 qim0Var3;
        boolean z2;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1882455160);
        int i5 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            idxVar = yfVar;
            int i6 = x340Var.i(idxVar) ? 256 : 128;
            i3 = i5 | i6;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    i4 = i2 & 4;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 != 0) {
                        idxVar = new idx(4);
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var;
                }
                x340Var.s();
                z2 = (i3 & 14) == 4;
                objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new y1(function0, (byte) 25);
                    x340Var.s0(objT);
                }
                foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0Var3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j5i.c, x340Var, ((i3 >> 3) & 112) | 384, 48, 2040);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nf2(function0, qim0Var2, idxVar, i, i2, (byte) 0);
            }
        }
        idxVar = yfVar;
        i3 = i5 | i6;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                i4 = i2 & 4;
                qim0 qim0Var5 = nim0.a;
                if (i4 != 0) {
                    idxVar = new idx(4);
                    i3 &= -897;
                }
                qim0Var3 = qim0Var5;
            } else {
                i4 = i2 & 4;
                qim0 qim0Var6 = nim0.a;
                if (i4 != 0) {
                    idxVar = new idx(4);
                    i3 &= -897;
                }
                qim0Var3 = qim0Var6;
            }
            x340Var.s();
            if ((i3 & 14) == 4) {
            }
            objT = x340Var.T();
            if (z2) {
                objT = new y1(function0, (byte) 25);
                x340Var.s0(objT);
            } else {
                objT = new y1(function0, (byte) 25);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0Var3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j5i.c, x340Var, ((i3 >> 3) & 112) | 384, 48, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nf2(function0, qim0Var2, idxVar, i, i2, (byte) 0);
        }
    }

    public static final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(684964514);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.g(13, apo.r(-1548447537, new qgd((byte) 6, cwl1.o0(x340Var, 2131956132), iu30Var, false), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 9, i, iu30Var, false);
        }
    }

    public static final void f(zm30 zm30Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1122065561);
        int i2 = i | (b0kVar3.i(zm30Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
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
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.h(qim0Var2, 16.0f));
            i(b0kVar3, 0);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.h(qim0Var2, 16.0f));
            j(zm30Var, b0kVar3, (i2 & 14) | 8);
            qim0 qim0VarO = ab80.o(qim0Var2, cbx.b(b0kVar3).b.a, b0kVar3, qim0Var2, 1.0f);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            uwo1.e(cwl1.o0(b0kVar3, 2131956135), uyn1.z(16.0f, 0.0f, 2, qim0VarO), lee1.a(cbx.d(b0kVar3).e, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2016);
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            cvx cvxVar6 = ywx0.k(qim0Var2, 8.0f, b0kVar3, b0kVar3).b;
            uwo1.e(cwl1.o0(b0kVar3, 2131956134), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2016);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, u291.h(qim0Var2, cbx.b(b0kVar2).b.a));
            e(iu30Var, b0kVar2, (i2 >> 3) & 14);
            x0d.s(qim0Var2, cbx.b(b0kVar2).b.c, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00((byte) 21, i, zm30Var, qim0Var2, iu30Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void g(Function0 function0, qim0 qim0Var, yf yfVar, b0k b0kVar, int i, int i2) {
        yf idxVar;
        int i3;
        boolean z;
        qim0 qim0Var2;
        h311 h311VarV;
        int i4;
        qim0 qim0Var3;
        boolean z2;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2092599823);
        int i5 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            idxVar = yfVar;
            int i6 = x340Var.i(idxVar) ? 256 : 128;
            i3 = i5 | i6;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    i4 = i2 & 4;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 != 0) {
                        idxVar = new idx(4);
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    qim0Var3 = qim0Var;
                }
                x340Var.s();
                z2 = (i3 & 14) == 4;
                objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new y1(function0, (byte) 26);
                    x340Var.s0(objT);
                }
                foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0Var3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j5i.b, x340Var, ((i3 >> 3) & 112) | 384, 48, 2040);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nf2(function0, qim0Var2, idxVar, i, i2, (byte) 1);
            }
        }
        idxVar = yfVar;
        i3 = i5 | i6;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                i4 = i2 & 4;
                qim0 qim0Var5 = nim0.a;
                if (i4 != 0) {
                    idxVar = new idx(4);
                    i3 &= -897;
                }
                qim0Var3 = qim0Var5;
            } else {
                i4 = i2 & 4;
                qim0 qim0Var6 = nim0.a;
                if (i4 != 0) {
                    idxVar = new idx(4);
                    i3 &= -897;
                }
                qim0Var3 = qim0Var6;
            }
            x340Var.s();
            if ((i3 & 14) == 4) {
            }
            objT = x340Var.T();
            if (z2) {
                objT = new y1(function0, (byte) 26);
                x340Var.s0(objT);
            } else {
                objT = new y1(function0, (byte) 26);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0Var3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j5i.b, x340Var, ((i3 >> 3) & 112) | 384, 48, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nf2(function0, qim0Var2, idxVar, i, i2, (byte) 1);
        }
    }

    public static final void h(boolean z, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-642000585);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
        if ((i2 & 19) == 18 && x340Var.H()) {
            x340Var.b0();
        } else {
            ven0 ven0VarS = v8r.s(vu30Var, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                w4k w4kVar = new w4k(qxd0.M(o6x.a, x340Var));
                x340Var.s0(w4kVar);
                objT = w4kVar;
            }
            c9n c9nVar = ((w4k) objT).a;
            Object objT2 = x340Var.T();
            Object obj = objT2;
            if (objT2 == m4cVar) {
                vu30 vu30Var2 = (vu30) ven0VarS.getValue();
                gnv0 gnv0Var = new gnv0(z);
                gnv0Var.d = c9nVar;
                gnv0Var.e = vu30Var2;
                x340Var.s0(gnv0Var);
                obj = gnv0Var;
            }
            gnv0 gnv0Var2 = (gnv0) obj;
            boolean zG = x340Var.g((vu30) ven0VarS.getValue()) | x340Var.g(c9nVar);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                gnv0Var2.e = (vu30) ven0VarS.getValue();
                gnv0Var2.d = c9nVar;
                x340Var.s0(rih1.a);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 14) == 4) | x340Var.i(gnv0Var2);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new c3u0(gnv0Var2, z, (lnm) null, (byte) 11);
                x340Var.s0(objT4);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT4);
            s1q0 s1q0VarA = vfe0.a(x340Var);
            if (s1q0VarA == null) {
                eg.m("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            r1q0 r1q0VarJ = s1q0VarA.J();
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI2 = x340Var.i(r1q0VarJ) | x340Var.i(iac0Var) | x340Var.i(gnv0Var2);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new ozu0(r1q0VarJ, iac0Var, gnv0Var2, (byte) 4);
                x340Var.s0(objT5);
            }
            qxd0.h(iac0Var, r1q0VarJ, (iu30) objT5, x340Var);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7f(i, vu30Var, z);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2128087422);
        if (x340Var.Y(i & 1, i != 0)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            wsx wsxVar = wsx.c;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(wsxVar, isl.a, qim0VarR, cbx.a(x340Var).b.c, 0L, false, x340Var, wsx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131956133), (qim0) null, ktd.l(nim0Var, 4.0f, x340Var, x340Var).k, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 3);
        }
    }

    public static final void j(zm30 zm30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1018145387);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var2.g(zm30Var) : x340Var2.i(zm30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            c9 c9VarS = mqo1.s(new phx[]{zm30Var.b, zm30Var.a});
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            fc11.a(c9VarS, uyn1.B(nim0Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), hcx.e, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var2, 392, 504);
            qim0 qim0VarR = u291.r(nim0Var, 48.0f);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarE2 = d1u.E(3.0f, cbx.a(x340Var2).a.a.a(), dug.f(qim0VarQ, cbx.a(x340Var2).a.a.c(), d4o1.a), cr31Var);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarE2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            w0h1.a(gsx.c, isl.a, (qim0) null, cbx.a(x340Var2).c.c, 0L, false, x340Var2, gsx.d | 48, 52);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(zm30Var, i, (byte) 27);
        }
    }

    public static final String k(beg begVar, njx0 njx0Var) {
        n9r n9rVarK = begVar.k();
        ajn0 name = begVar.getName();
        ajn0 ajn0Var = moa1.a;
        if (name == null || name.b) {
            name = moa1.c;
        }
        String strC = name.c();
        if (!(n9rVarK instanceof dzq0)) {
            beg begVar2 = n9rVarK instanceof beg ? (beg) n9rVarK : null;
            if (begVar2 != null) {
                return cy30.l(k(begVar2, njx0Var), '$', strC);
            }
            hhg1.i("Unexpected container: ", n9rVarK, " for ", begVar);
            return null;
        }
        kf30 kf30Var = ((ezq0) ((dzq0) n9rVarK)).f;
        if (kf30Var.a.c()) {
            return strC;
        }
        return kf30Var.a.a.replace('.', '/') + '/' + strC;
    }

    public static final u7r0 l(xvj xvjVar) {
        xu30 xu30Var = xvjVar.a;
        s6t0 kbaVar = xu30Var != null ? new kba(xu30Var, (byte) 22) : null;
        vu30 vu30Var = xvjVar.b;
        g4h1 awjVar = vu30Var != null ? new awj(vu30Var, (byte) 0) : null;
        zu30 zu30Var = xvjVar.c;
        return new u7r0(kbaVar, awjVar, zu30Var != null ? new cwj(zu30Var, (byte) 0) : null, xvjVar.d, false, 64);
    }

    public static final q6e0 m(y591 y591Var, y7h0 y7h0Var) {
        if (y591Var instanceof x591) {
            return new h190(((x591) y591Var).a, (byte) 2);
        }
        if (y591Var instanceof w591) {
            return new o6e0(new ob01(y7h0Var, y591Var, (lnm) null, (byte) 16), f46.I(new p6e0[0]));
        }
        eg.o();
        return null;
    }

    public static apk0 n(Integer num, r6h1 r6h1Var) {
        return new apk0(num, r6h1Var);
    }

    public static final Next p(fpi0 fpi0Var, String str) {
        int iOrdinal = fpi0Var.d.ordinal();
        if (iOrdinal == 0) {
            return Next.a(f46.S0(new doi0[]{new coi0(new r521(2131951748)), xni0.a}));
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return Next.i(fpi0.a(fpi0Var, mpi0.a), f46.S0(new doi0[]{new coi0(new q521(str)), new aoi0(nik1.W1.a, true)}));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[LOOP:1: B:97:0x0218->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    public static final Object q(a8b0 a8b0Var, x0h1 x0h1Var, xu30 xu30Var) {
        yv30 yv30VarA;
        tnw0 tnw0VarU;
        tnw0 tnw0VarS;
        boolean z;
        lf30 lf30VarF;
        heg hegVarG;
        Object ika0Var;
        List list;
        Iterator it;
        jka0 jka0Var;
        boolean z2;
        a8b0 a8b0Var2;
        x0h1 x0h1Var2;
        Object objQ;
        dq20 dq20VarQ;
        njx0 njx0Var = njx0.U0;
        jfg jfgVarS = a8b0Var.t0().s();
        yv30 yv30VarA2 = null;
        if (jfgVarS != null && (jfgVarS instanceof beg) && g6b0.K(jfgVarS)) {
            int i = kht.a;
            yv30VarA = kbb.A(iht.f(jfgVarS));
        } else {
            yv30VarA = null;
        }
        xv30 xv30Var = xv30.d;
        if (u890.j(yv30VarA, xv30Var)) {
            tcn0 tcn0Var = z7d1.a;
            jfg jfgVarS2 = a8b0Var.t0().s();
            if (jfgVarS2 != null && (jfgVarS2 instanceof beg) && g6b0.K(jfgVarS2)) {
                int i2 = kht.a;
                yv30VarA2 = kbb.A(iht.f(jfgVarS2));
            }
            u890.j(yv30VarA2, xv30Var);
            g6b0 g6b0VarS = rzn1.s(a8b0Var);
            fg5 annotations = a8b0Var.getAnnotations();
            a8b0 a8b0VarC = kbb.C(a8b0Var);
            List listZ = kbb.z(a8b0Var);
            List listD = kbb.D(a8b0Var);
            ArrayList arrayList = new ArrayList(q7h.U(listD, 10));
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                arrayList.add(((e1h1) it2.next()).b());
            }
            e0h1.b.getClass();
            e0h1 e0h1Var = e0h1.c;
            h0h1 h0h1VarG = z7d1.a.g();
            kbb.H(a8b0Var);
            return q(kbb.r(g6b0VarS, annotations, a8b0VarC, listZ, o7h.O0(y3o1.i0(Collections.singletonList(new f1h1(1, ((e1h1) o7h.A0(a8b0Var.r0())).b())), e0h1Var, h0h1VarG, false), arrayList), rzn1.s(a8b0Var).p(), false).x0(a8b0Var.u0()), x0h1Var, xu30Var);
        }
        qx81 qx81VarR = d0p1.r(a8b0Var);
        if (qx81VarR == null && ((dq20VarQ = d0p1.q(a8b0Var)) == null || (qx81VarR = d0p1.Z(dq20VarQ)) == null)) {
            qx81VarR = d0p1.r(a8b0Var);
            qx81VarR.getClass();
        }
        h0h1 h0h1VarN0 = d0p1.n0(qx81VarR);
        if (d0p1.J(h0h1VarN0)) {
            if (h0h1VarN0 instanceof h0h1) {
                tnw0VarU = g6b0.u((beg) h0h1VarN0.s());
            } else {
                hhg1.f(us71.f(rc11.a, h0h1VarN0.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", h0h1VarN0, ", ")));
                tnw0VarU = null;
            }
            if (tnw0VarU != null) {
                switch (tnw0VarU.ordinal()) {
                    case 0:
                        jka0Var = kka0.a;
                        break;
                    case 1:
                        jka0Var = kka0.b;
                        break;
                    case 2:
                        jka0Var = kka0.c;
                        break;
                    case 3:
                        jka0Var = kka0.d;
                        break;
                    case 4:
                        jka0Var = kka0.e;
                        break;
                    case 5:
                        jka0Var = kka0.f;
                        break;
                    case 6:
                        jka0Var = kka0.g;
                        break;
                    case 7:
                        jka0Var = kka0.h;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                if (d0p1.S(a8b0Var)) {
                    z2 = true;
                } else if (a8b0Var.getAnnotations().d0(eia0.r)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ika0Var = ezn1.j(jka0Var, z2);
            } else {
                if (h0h1VarN0 instanceof h0h1) {
                    tnw0VarS = g6b0.s((beg) h0h1VarN0.s());
                } else {
                    hhg1.f(us71.f(rc11.a, h0h1VarN0.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", h0h1VarN0, ", ")));
                    tnw0VarS = null;
                }
                if (tnw0VarS != null) {
                    nja0 nja0Var = (nja0) nja0.N0.get(tnw0VarS);
                    if (nja0Var == null) {
                        nja0.a(6);
                        throw null;
                    }
                    ika0Var = zi20.b("[".concat(nja0Var.c));
                } else {
                    if (h0h1VarN0 instanceof h0h1) {
                        jfg jfgVarS3 = h0h1VarN0.s();
                        if (jfgVarS3 != null && g6b0.K(jfgVarS3)) {
                            z = true;
                        }
                        if (z) {
                            if (h0h1VarN0 instanceof h0h1) {
                                beg begVar = (beg) h0h1VarN0.s();
                                int i3 = kht.a;
                                lf30VarF = iht.f(begVar);
                            } else {
                                hhg1.f(us71.f(rc11.a, h0h1VarN0.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", h0h1VarN0, ", ")));
                                lf30VarF = null;
                            }
                            String str = j8a0.a;
                            hegVarG = j8a0.g(lf30VarF);
                            if (hegVarG == null) {
                                ika0Var = null;
                            } else {
                                if (!x0h1Var.d) {
                                    list = j8a0.o;
                                    if ((list instanceof Collection) || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((i8a0) it.next()).a.equals(hegVarG)) {
                                                    ika0Var = null;
                                                }
                                            }
                                        }
                                    }
                                }
                                ika0Var = new ika0(tia0.e(hegVarG));
                            }
                        } else {
                            ika0Var = null;
                        }
                    } else {
                        hhg1.f(us71.f(rc11.a, h0h1VarN0.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", h0h1VarN0, ", ")));
                    }
                    z = false;
                    if (z) {
                        ika0Var = null;
                    } else {
                        if (h0h1VarN0 instanceof h0h1) {
                            beg begVar2 = (beg) h0h1VarN0.s();
                            int i4 = kht.a;
                            lf30VarF = iht.f(begVar2);
                        } else {
                            hhg1.f(us71.f(rc11.a, h0h1VarN0.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", h0h1VarN0, ", ")));
                            lf30VarF = null;
                        }
                        String str2 = j8a0.a;
                        hegVarG = j8a0.g(lf30VarF);
                        if (hegVarG == null) {
                            ika0Var = null;
                        } else {
                            if (!x0h1Var.d) {
                                list = j8a0.o;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((i8a0) it.next()).a.equals(hegVarG)) {
                                                ika0Var = null;
                                            }
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((i8a0) it.next()).a.equals(hegVarG)) {
                                                ika0Var = null;
                                            }
                                        }
                                    }
                                }
                            }
                            ika0Var = new ika0(tia0.e(hegVarG));
                        }
                    }
                }
            }
        } else {
            ika0Var = null;
        }
        if (ika0Var != null) {
            Object objJ = ezn1.j(ika0Var, x0h1Var.a);
            xu30Var.invoke(a8b0Var, objJ, x0h1Var);
            return objJ;
        }
        h0h1 h0h1VarT0 = a8b0Var.t0();
        if (h0h1VarT0 instanceof e890) {
            e890 e890Var = (e890) h0h1VarT0;
            a8b0 a8b0Var3 = e890Var.a;
            if (a8b0Var3 != null) {
                return q(rzn1.A(a8b0Var3), x0h1Var, xu30Var);
            }
            eg.f("There should be no intersection type in existing descriptors, but found: ".concat(o7h.y0(e890Var.b, (CharSequence) null, (String) null, (String) null, (iu30) null, 63)));
            return null;
        }
        jfg jfgVarS4 = h0h1VarT0.s();
        if (jfgVarS4 == null) {
            t8e1.o(a8b0Var, "no descriptor for type constructor of ");
            return null;
        }
        if (bkz.e(jfgVarS4)) {
            return new ika0("error/NonExistentClass");
        }
        boolean z3 = jfgVarS4 instanceof beg;
        if (z3 && g6b0.z(a8b0Var)) {
            if (a8b0Var.r0().size() != 1) {
                hhg1.h("arrays must have one type argument");
                return null;
            }
            e1h1 e1h1Var = (e1h1) a8b0Var.r0().get(0);
            a8b0 a8b0VarB = e1h1Var.b();
            if (e1h1Var.a() == 2) {
                objQ = new ika0("java/lang/Object");
            } else {
                int iC = l1d.C(e1h1Var.a());
                if (iC == 0 ? (x0h1Var2 = x0h1Var.f) != null : iC == 1 ? (x0h1Var2 = x0h1Var.e) != null : (x0h1Var2 = x0h1Var.c) != null) {
                    x0h1Var = x0h1Var2;
                }
                objQ = q(a8b0VarB, x0h1Var, xu30Var);
            }
            return zi20.b("[".concat(zi20.e((kka0) objQ)));
        }
        if (!z3) {
            if (jfgVarS4 instanceof y0h1) {
                a8b0 a8b0VarV = rzn1.v((y0h1) jfgVarS4);
                if (a8b0Var.u0()) {
                    a8b0VarV = o1h1.g(a8b0VarV, true);
                }
                return q(a8b0VarV, x0h1Var, k6i.g);
            }
            if ((jfgVarS4 instanceof jit) && x0h1Var.g) {
                return q(((jit) jfgVarS4).x1(), x0h1Var, xu30Var);
            }
            t8e1.o(a8b0Var, "Unknown type ");
            return null;
        }
        if (vf80.a(jfgVarS4) && !x0h1Var.b && (a8b0Var2 = (a8b0) nho1.r(a8b0Var, new HashSet())) != null) {
            return q(a8b0Var2, new x0h1(x0h1Var.a, true, x0h1Var.c, x0h1Var.d, x0h1Var.e, x0h1Var.f, x0h1Var.g, x0h1Var.h), xu30Var);
        }
        beg begVar3 = (beg) jfgVarS4;
        begVar3.w1();
        if (begVar3.e0() == 4) {
            begVar3 = (beg) begVar3.k();
        }
        ika0 ika0Var2 = new ika0(k(begVar3.w1(), njx0Var));
        xu30Var.invoke(a8b0Var, ika0Var2, x0h1Var);
        return ika0Var2;
    }

    public static final MessageTemplate r(MessageTemplate messageTemplate, DynamicTagsMetadata dynamicTagsMetadata, LinkedHashSet linkedHashSet) {
        Header headerCopy$default;
        Header headerCopy$default2;
        Button buttonCopy$default = null;
        if (messageTemplate instanceof BannerTemplate) {
            BannerTemplate.BasicBanner basicBanner = (BannerTemplate) messageTemplate;
            if (basicBanner instanceof BannerTemplate.BasicBanner) {
                BannerTemplate.BasicBanner basicBanner2 = basicBanner;
                MessageText messageTextE = ot21.e(basicBanner2.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                MessageText messageTextE2 = ot21.e(basicBanner2.getBody(), dynamicTagsMetadata, linkedHashSet);
                Button primaryButton = basicBanner2.getPrimaryButton();
                Button buttonC = primaryButton != null ? ot21.c(primaryButton, dynamicTagsMetadata, linkedHashSet) : null;
                Button secondaryButton = basicBanner2.getSecondaryButton();
                Button buttonC2 = secondaryButton != null ? ot21.c(secondaryButton, dynamicTagsMetadata, linkedHashSet) : null;
                Button closeButton = basicBanner2.getCloseButton();
                return BannerTemplate.BasicBanner.copy$default(basicBanner2, (String) null, messageTextE, messageTextE2, buttonC, closeButton != null ? ot21.c(closeButton, dynamicTagsMetadata, linkedHashSet) : null, buttonC2, 1, (Object) null);
            }
            if (basicBanner instanceof BannerTemplate.JitBanner) {
                BannerTemplate.JitBanner jitBanner = (BannerTemplate.JitBanner) basicBanner;
                List buttons = jitBanner.getButtons();
                ArrayList arrayList = new ArrayList(q7h.U(buttons, 10));
                Iterator it = buttons.iterator();
                while (it.hasNext()) {
                    arrayList.add(ot21.c((Button) it.next(), dynamicTagsMetadata, linkedHashSet));
                }
                return BannerTemplate.JitBanner.copy$default(jitBanner, (String) null, arrayList, 1, (Object) null);
            }
            if (basicBanner instanceof BannerTemplate.RichBanner) {
                BannerTemplate.RichBanner richBanner = (BannerTemplate.RichBanner) basicBanner;
                MessageText messageTextE3 = ot21.e(richBanner.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                MessageText messageTextE4 = ot21.e(richBanner.getBody(), dynamicTagsMetadata, linkedHashSet);
                Button primaryButton2 = richBanner.getPrimaryButton();
                Button buttonC3 = primaryButton2 != null ? ot21.c(primaryButton2, dynamicTagsMetadata, linkedHashSet) : null;
                Button secondaryButton2 = richBanner.getSecondaryButton();
                Button buttonC4 = secondaryButton2 != null ? ot21.c(secondaryButton2, dynamicTagsMetadata, linkedHashSet) : null;
                Button closeButton2 = richBanner.getCloseButton();
                return BannerTemplate.RichBanner.copy$default(richBanner, (String) null, messageTextE3, messageTextE4, ot21.b(richBanner.getAccessoryContent(), dynamicTagsMetadata, linkedHashSet), buttonC3, closeButton2 != null ? ot21.c(closeButton2, dynamicTagsMetadata, linkedHashSet) : null, buttonC4, 1, (Object) null);
            }
            if (basicBanner instanceof BannerTemplate.SignifierBanner) {
                BannerTemplate.SignifierBanner signifierBanner = (BannerTemplate.SignifierBanner) basicBanner;
                MessageText messageTextE5 = ot21.e(signifierBanner.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                MessageText messageTextE6 = ot21.e(signifierBanner.getBody(), dynamicTagsMetadata, linkedHashSet);
                Button primaryButton3 = signifierBanner.getPrimaryButton();
                Button buttonC5 = primaryButton3 != null ? ot21.c(primaryButton3, dynamicTagsMetadata, linkedHashSet) : null;
                Button secondaryButton3 = signifierBanner.getSecondaryButton();
                Button buttonC6 = secondaryButton3 != null ? ot21.c(secondaryButton3, dynamicTagsMetadata, linkedHashSet) : null;
                Button closeButton3 = signifierBanner.getCloseButton();
                return BannerTemplate.SignifierBanner.copy$default(signifierBanner, (String) null, messageTextE5, messageTextE6, ot21.f(signifierBanner.getSignifier(), dynamicTagsMetadata, linkedHashSet), buttonC5, closeButton3 != null ? ot21.c(closeButton3, dynamicTagsMetadata, linkedHashSet) : null, buttonC6, 1, (Object) null);
            }
            if (!(basicBanner instanceof BannerTemplate.BaseBanner)) {
                if ((basicBanner instanceof BannerTemplate.CustomBanner) || (basicBanner instanceof BannerTemplate.Undefined)) {
                    return basicBanner;
                }
                eg.o();
                return null;
            }
            BannerTemplate.BaseBanner baseBanner = (BannerTemplate.BaseBanner) basicBanner;
            MessageText messageTextE7 = ot21.e(baseBanner.getHeadline(), dynamicTagsMetadata, linkedHashSet);
            MessageText messageTextE8 = ot21.e(baseBanner.getBody(), dynamicTagsMetadata, linkedHashSet);
            Button primaryButton4 = baseBanner.getPrimaryButton();
            Button buttonC7 = primaryButton4 != null ? ot21.c(primaryButton4, dynamicTagsMetadata, linkedHashSet) : null;
            Button secondaryButton4 = baseBanner.getSecondaryButton();
            Button buttonC8 = secondaryButton4 != null ? ot21.c(secondaryButton4, dynamicTagsMetadata, linkedHashSet) : null;
            Button dismissButton = baseBanner.getDismissButton();
            Button buttonC9 = dismissButton != null ? ot21.c(dismissButton, dynamicTagsMetadata, linkedHashSet) : null;
            HeaderContent headerContent = baseBanner.getHeaderContent();
            return BannerTemplate.BaseBanner.copy$default(baseBanner, (Alignment) null, (BackgroundColor) null, (AccessoryContent) null, messageTextE7, messageTextE8, headerContent != null ? ot21.d(headerContent, dynamicTagsMetadata, linkedHashSet) : null, buttonC7, buttonC8, buttonC9, (Button) null, (Disclaimer) null, 1543, (Object) null);
        }
        if (messageTemplate instanceof BottomSheetTemplate) {
            BottomSheetTemplate.BasicBottomSheet basicBottomSheet = (BottomSheetTemplate) messageTemplate;
            if (basicBottomSheet instanceof BottomSheetTemplate.BasicBottomSheet) {
                BottomSheetTemplate.BasicBottomSheet basicBottomSheet2 = basicBottomSheet;
                String strG = ot21.g(basicBottomSheet2.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                String strG2 = ot21.g(basicBottomSheet2.getBody(), dynamicTagsMetadata, linkedHashSet);
                Button primaryButton5 = basicBottomSheet2.getPrimaryButton();
                Button buttonC10 = primaryButton5 != null ? ot21.c(primaryButton5, dynamicTagsMetadata, linkedHashSet) : null;
                Button secondaryButton5 = basicBottomSheet2.getSecondaryButton();
                return basicBottomSheet2.copy(strG, strG2, buttonC10, secondaryButton5 != null ? ot21.c(secondaryButton5, dynamicTagsMetadata, linkedHashSet) : null);
            }
            if (basicBottomSheet instanceof BottomSheetTemplate.FullBleedBottomSheet) {
                BottomSheetTemplate.FullBleedBottomSheet fullBleedBottomSheet = (BottomSheetTemplate.FullBleedBottomSheet) basicBottomSheet;
                String strG3 = ot21.g(fullBleedBottomSheet.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                String strG4 = ot21.g(fullBleedBottomSheet.getBody(), dynamicTagsMetadata, linkedHashSet);
                String strG5 = ot21.g(fullBleedBottomSheet.getImageUrl(), dynamicTagsMetadata, linkedHashSet);
                Button primaryButton6 = fullBleedBottomSheet.getPrimaryButton();
                Button buttonC11 = primaryButton6 != null ? ot21.c(primaryButton6, dynamicTagsMetadata, linkedHashSet) : null;
                Button secondaryButton6 = fullBleedBottomSheet.getSecondaryButton();
                return fullBleedBottomSheet.copy(strG3, strG4, strG5, buttonC11, secondaryButton6 != null ? ot21.c(secondaryButton6, dynamicTagsMetadata, linkedHashSet) : null);
            }
            if (basicBottomSheet instanceof BottomSheetTemplate.RichBottomSheet) {
                BottomSheetTemplate.RichBottomSheet richBottomSheet = (BottomSheetTemplate.RichBottomSheet) basicBottomSheet;
                String strG6 = ot21.g(richBottomSheet.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                String strG7 = ot21.g(richBottomSheet.getBody(), dynamicTagsMetadata, linkedHashSet);
                Signifier signifier = richBottomSheet.getSignifier();
                Signifier signifierF = signifier != null ? ot21.f(signifier, dynamicTagsMetadata, linkedHashSet) : null;
                String imageUrl = richBottomSheet.getImageUrl();
                String strG8 = imageUrl != null ? ot21.g(imageUrl, dynamicTagsMetadata, linkedHashSet) : null;
                Button primaryButton7 = richBottomSheet.getPrimaryButton();
                Button buttonC12 = primaryButton7 != null ? ot21.c(primaryButton7, dynamicTagsMetadata, linkedHashSet) : null;
                Button secondaryButton7 = richBottomSheet.getSecondaryButton();
                return richBottomSheet.copy(signifierF, strG8, strG6, strG7, buttonC12, secondaryButton7 != null ? ot21.c(secondaryButton7, dynamicTagsMetadata, linkedHashSet) : null);
            }
            if (!(basicBottomSheet instanceof BottomSheetTemplate.BaseBottomSheet)) {
                if ((basicBottomSheet instanceof BottomSheetTemplate.Undefined) || (basicBottomSheet instanceof BottomSheetTemplate.CustomBottomSheet)) {
                    return basicBottomSheet;
                }
                eg.o();
                return null;
            }
            BottomSheetTemplate.BaseBottomSheet baseBottomSheet = (BottomSheetTemplate.BaseBottomSheet) basicBottomSheet;
            HeaderContent headerContent2 = baseBottomSheet.getHeaderContent();
            HeaderContent headerContentD = headerContent2 != null ? ot21.d(headerContent2, dynamicTagsMetadata, linkedHashSet) : null;
            AccessoryContent accessoryContent = baseBottomSheet.getAccessoryContent();
            AccessoryContent accessoryContentB = accessoryContent != null ? ot21.b(accessoryContent, dynamicTagsMetadata, linkedHashSet) : null;
            MessageText messageTextE9 = ot21.e(baseBottomSheet.getHeadline(), dynamicTagsMetadata, linkedHashSet);
            MessageText messageTextE10 = ot21.e(baseBottomSheet.getBody(), dynamicTagsMetadata, linkedHashSet);
            Button primaryButton8 = baseBottomSheet.getPrimaryButton();
            Button buttonC13 = primaryButton8 != null ? ot21.c(primaryButton8, dynamicTagsMetadata, linkedHashSet) : null;
            Button secondaryButton8 = baseBottomSheet.getSecondaryButton();
            Button buttonC14 = secondaryButton8 != null ? ot21.c(secondaryButton8, dynamicTagsMetadata, linkedHashSet) : null;
            Disclaimer disclaimer = baseBottomSheet.getDisclaimer();
            if (disclaimer != null) {
                MessageText text = disclaimer.getText();
                buttonCopy$default = Disclaimer.copy$default(disclaimer, text != null ? ot21.e(text, dynamicTagsMetadata, linkedHashSet) : null, (Button) null, 2, (Object) null);
            }
            return baseBottomSheet.copy(headerContentD, accessoryContentB, messageTextE9, messageTextE10, buttonC13, buttonC14, buttonCopy$default);
        }
        if (messageTemplate instanceof InlineCardTemplate) {
            InlineCardTemplate.CompactInlineCard compactInlineCard = (InlineCardTemplate) messageTemplate;
            if (compactInlineCard instanceof InlineCardTemplate.CompactInlineCard) {
                InlineCardTemplate.CompactInlineCard compactInlineCard2 = compactInlineCard;
                MessageText messageTextE11 = ot21.e(compactInlineCard2.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                MessageText body = compactInlineCard2.getBody();
                MessageText messageTextE12 = body != null ? ot21.e(body, dynamicTagsMetadata, linkedHashSet) : null;
                AccessoryContent accessoryContent2 = compactInlineCard2.getAccessoryContent();
                AccessoryContent accessoryContentB2 = accessoryContent2 != null ? ot21.b(accessoryContent2, dynamicTagsMetadata, linkedHashSet) : null;
                Signifier signifier2 = compactInlineCard2.getSignifier();
                return InlineCardTemplate.CompactInlineCard.copy$default(compactInlineCard2, signifier2 != null ? ot21.f(signifier2, dynamicTagsMetadata, linkedHashSet) : null, messageTextE11, messageTextE12, (BackgroundColor) null, accessoryContentB2, ot21.c(compactInlineCard2.getCardButton(), dynamicTagsMetadata, linkedHashSet), 8, (Object) null);
            }
            if (compactInlineCard instanceof InlineCardTemplate.StandardInlineCard) {
                InlineCardTemplate.StandardInlineCard standardInlineCard = (InlineCardTemplate.StandardInlineCard) compactInlineCard;
                MessageText messageTextE13 = ot21.e(standardInlineCard.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                MessageText messageTextE14 = ot21.e(standardInlineCard.getBody(), dynamicTagsMetadata, linkedHashSet);
                AccessoryContent accessoryContent3 = standardInlineCard.getAccessoryContent();
                AccessoryContent accessoryContentB3 = accessoryContent3 != null ? ot21.b(accessoryContent3, dynamicTagsMetadata, linkedHashSet) : null;
                Signifier signifier3 = standardInlineCard.getSignifier();
                Signifier signifierF2 = signifier3 != null ? ot21.f(signifier3, dynamicTagsMetadata, linkedHashSet) : null;
                Button buttonC15 = ot21.c(standardInlineCard.getPrimaryButton(), dynamicTagsMetadata, linkedHashSet);
                Button closeButton4 = standardInlineCard.getCloseButton();
                return InlineCardTemplate.StandardInlineCard.copy$default(standardInlineCard, signifierF2, messageTextE13, messageTextE14, (BackgroundColor) null, accessoryContentB3, buttonC15, closeButton4 != null ? ot21.c(closeButton4, dynamicTagsMetadata, linkedHashSet) : null, 8, (Object) null);
            }
            if (compactInlineCard instanceof InlineCardTemplate.MicroCompactInlineCard) {
                InlineCardTemplate.MicroCompactInlineCard microCompactInlineCard = (InlineCardTemplate.MicroCompactInlineCard) compactInlineCard;
                MessageText messageTextE15 = ot21.e(microCompactInlineCard.getHeadline(), dynamicTagsMetadata, linkedHashSet);
                AccessoryContent accessoryContent4 = microCompactInlineCard.getAccessoryContent();
                AccessoryContent accessoryContentB4 = accessoryContent4 != null ? ot21.b(accessoryContent4, dynamicTagsMetadata, linkedHashSet) : null;
                Signifier signifier4 = microCompactInlineCard.getSignifier();
                return InlineCardTemplate.MicroCompactInlineCard.copy$default(microCompactInlineCard, signifier4 != null ? ot21.f(signifier4, dynamicTagsMetadata, linkedHashSet) : null, messageTextE15, (BackgroundColor) null, accessoryContentB4, ot21.c(microCompactInlineCard.getCardButton(), dynamicTagsMetadata, linkedHashSet), 4, (Object) null);
            }
            if (!(compactInlineCard instanceof InlineCardTemplate.BaseInlineCard)) {
                if (compactInlineCard instanceof InlineCardTemplate.Undefined) {
                    return compactInlineCard;
                }
                eg.o();
                return null;
            }
            InlineCardTemplate.BaseInlineCard baseInlineCard = (InlineCardTemplate.BaseInlineCard) compactInlineCard;
            MessageText messageTextE16 = ot21.e(baseInlineCard.getHeadline(), dynamicTagsMetadata, linkedHashSet);
            MessageText body2 = baseInlineCard.getBody();
            MessageText messageTextE17 = body2 != null ? ot21.e(body2, dynamicTagsMetadata, linkedHashSet) : null;
            AccessoryContent accessoryContent5 = baseInlineCard.getAccessoryContent();
            AccessoryContent accessoryContentB5 = accessoryContent5 != null ? ot21.b(accessoryContent5, dynamicTagsMetadata, linkedHashSet) : null;
            HeaderContent headerContent3 = baseInlineCard.getHeaderContent();
            HeaderContent headerContentD2 = headerContent3 != null ? ot21.d(headerContent3, dynamicTagsMetadata, linkedHashSet) : null;
            Button primaryButton9 = baseInlineCard.getPrimaryButton();
            Button buttonC16 = primaryButton9 != null ? ot21.c(primaryButton9, dynamicTagsMetadata, linkedHashSet) : null;
            Button secondaryButton9 = baseInlineCard.getSecondaryButton();
            Button buttonC17 = secondaryButton9 != null ? ot21.c(secondaryButton9, dynamicTagsMetadata, linkedHashSet) : null;
            Button dismissButton2 = baseInlineCard.getDismissButton();
            Button buttonC18 = dismissButton2 != null ? ot21.c(dismissButton2, dynamicTagsMetadata, linkedHashSet) : null;
            Button cardButton = baseInlineCard.getCardButton();
            return InlineCardTemplate.BaseInlineCard.copy$default(baseInlineCard, messageTextE16, messageTextE17, headerContentD2, (BackgroundColor) null, accessoryContentB5, buttonC16, buttonC17, cardButton != null ? ot21.c(cardButton, dynamicTagsMetadata, linkedHashSet) : null, buttonC18, 8, (Object) null);
        }
        if (messageTemplate instanceof SnackBarTemplate) {
            SnackBarTemplate.BaseSnackBar baseSnackBar = (SnackBarTemplate) messageTemplate;
            if (baseSnackBar instanceof SnackBarTemplate.BaseSnackBar) {
                SnackBarTemplate.BaseSnackBar baseSnackBar2 = baseSnackBar;
                Header header = baseSnackBar2.getHeader();
                if (header != null) {
                    Text text2 = header.getText();
                    headerCopy$default2 = Header.copy$default(header, Text.copy$default(text2, ot21.g(text2.getText(), dynamicTagsMetadata, linkedHashSet), (String) null, 2, (Object) null), (Icon) null, 2, (Object) null);
                } else {
                    headerCopy$default2 = null;
                }
                MessageText messageTextE18 = ot21.e(baseSnackBar2.getBody(), dynamicTagsMetadata, linkedHashSet);
                AccessoryContent accessoryContent6 = baseSnackBar2.getAccessoryContent();
                AccessoryContent accessoryContentB6 = accessoryContent6 != null ? ot21.b(accessoryContent6, dynamicTagsMetadata, linkedHashSet) : null;
                Button primaryButton10 = baseSnackBar2.getPrimaryButton();
                Button buttonC19 = primaryButton10 != null ? ot21.c(primaryButton10, dynamicTagsMetadata, linkedHashSet) : null;
                Button dismissButton3 = baseSnackBar2.getDismissButton();
                return baseSnackBar2.copy(headerCopy$default2, messageTextE18, accessoryContentB6, buttonC19, dismissButton3 != null ? ot21.c(dismissButton3, dynamicTagsMetadata, linkedHashSet) : null);
            }
            if (!(baseSnackBar instanceof SnackBarTemplate.JitSnackBar)) {
                if ((baseSnackBar instanceof SnackBarTemplate.CustomSnackbar) || (baseSnackBar instanceof SnackBarTemplate.Undefined)) {
                    return baseSnackBar;
                }
                eg.o();
                return null;
            }
            SnackBarTemplate.JitSnackBar jitSnackBar = (SnackBarTemplate.JitSnackBar) baseSnackBar;
            List buttons2 = jitSnackBar.getButtons();
            ArrayList arrayList2 = new ArrayList(q7h.U(buttons2, 10));
            Iterator it2 = buttons2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ot21.c((Button) it2.next(), dynamicTagsMetadata, linkedHashSet));
            }
            return SnackBarTemplate.JitSnackBar.copy$default(jitSnackBar, (String) null, arrayList2, 1, (Object) null);
        }
        if (messageTemplate instanceof TooltipTemplate) {
            TooltipTemplate.BaseTooltip baseTooltip = (TooltipTemplate) messageTemplate;
            if (!(baseTooltip instanceof TooltipTemplate.BaseTooltip)) {
                if ((baseTooltip instanceof TooltipTemplate.Undefined) || (baseTooltip instanceof TooltipTemplate.CustomTooltip)) {
                    return baseTooltip;
                }
                eg.o();
                return null;
            }
            TooltipTemplate.BaseTooltip baseTooltip2 = baseTooltip;
            MessageText messageTextE19 = ot21.e(baseTooltip2.getText(), dynamicTagsMetadata, linkedHashSet);
            AccessoryContent accessoryContent7 = baseTooltip2.getAccessoryContent();
            AccessoryContent accessoryContentB7 = accessoryContent7 != null ? ot21.b(accessoryContent7, dynamicTagsMetadata, linkedHashSet) : null;
            Header header2 = baseTooltip2.getHeader();
            if (header2 != null) {
                Text text3 = header2.getText();
                headerCopy$default = Header.copy$default(header2, Text.copy$default(text3, ot21.g(text3.getText(), dynamicTagsMetadata, linkedHashSet), (String) null, 2, (Object) null), (Icon) null, 2, (Object) null);
            } else {
                headerCopy$default = null;
            }
            Button button = baseTooltip2.getButton();
            return TooltipTemplate.BaseTooltip.copy$default(baseTooltip2, (TooltipAlignment) null, messageTextE19, accessoryContentB7, headerCopy$default, button != null ? ot21.c(button, dynamicTagsMetadata, linkedHashSet) : null, 1, (Object) null);
        }
        if (messageTemplate instanceof FullscreenTemplate) {
            FullscreenTemplate.JitFullscreen jitFullscreen = (FullscreenTemplate) messageTemplate;
            if (jitFullscreen instanceof FullscreenTemplate.JitFullscreen) {
                FullscreenTemplate.JitFullscreen jitFullscreen2 = jitFullscreen;
                List buttons3 = jitFullscreen2.getButtons();
                ArrayList arrayList3 = new ArrayList(q7h.U(buttons3, 10));
                Iterator it3 = buttons3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(ot21.c((Button) it3.next(), dynamicTagsMetadata, linkedHashSet));
                }
                return FullscreenTemplate.JitFullscreen.copy$default(jitFullscreen2, (String) null, arrayList3, 1, (Object) null);
            }
            if (!(jitFullscreen instanceof FullscreenTemplate.BaseFullscreen)) {
                if (jitFullscreen instanceof FullscreenTemplate.Undefined) {
                    return jitFullscreen;
                }
                eg.o();
                return null;
            }
            FullscreenTemplate.BaseFullscreen baseFullscreen = (FullscreenTemplate.BaseFullscreen) jitFullscreen;
            AccessoryContent accessoryContent8 = baseFullscreen.getAccessoryContent();
            AccessoryContent accessoryContentB8 = accessoryContent8 != null ? ot21.b(accessoryContent8, dynamicTagsMetadata, linkedHashSet) : null;
            MessageText messageTextE20 = ot21.e(baseFullscreen.getHeadline(), dynamicTagsMetadata, linkedHashSet);
            MessageText messageTextE21 = ot21.e(baseFullscreen.getBody(), dynamicTagsMetadata, linkedHashSet);
            Button buttonC20 = ot21.c(baseFullscreen.getPrimaryButton(), dynamicTagsMetadata, linkedHashSet);
            Button secondaryButton10 = baseFullscreen.getSecondaryButton();
            Button buttonC21 = secondaryButton10 != null ? ot21.c(secondaryButton10, dynamicTagsMetadata, linkedHashSet) : null;
            Disclaimer disclaimer2 = baseFullscreen.getDisclaimer();
            if (disclaimer2 != null) {
                MessageText text4 = disclaimer2.getText();
                buttonCopy$default = Disclaimer.copy$default(disclaimer2, text4 != null ? ot21.e(text4, dynamicTagsMetadata, linkedHashSet) : null, (Button) null, 2, (Object) null);
            }
            return FullscreenTemplate.BaseFullscreen.copy$default(baseFullscreen, (BackgroundColor) null, accessoryContentB8, messageTextE20, messageTextE21, buttonC20, buttonC21, buttonCopy$default, (AccessoryContentSize) null, (ContentAlignment) null, 385, (Object) null);
        }
        if (!(messageTemplate instanceof ModalTemplate)) {
            if (!(messageTemplate instanceof WebViewTemplate)) {
                return messageTemplate;
            }
            WebViewTemplate webViewTemplate = (WebViewTemplate) messageTemplate;
            if ((webViewTemplate instanceof WebViewTemplate.BasicWebView) || (webViewTemplate instanceof WebViewTemplate.Undefined)) {
                return webViewTemplate;
            }
            eg.o();
            return null;
        }
        ModalTemplate.JitModal jitModal = (ModalTemplate) messageTemplate;
        if (jitModal instanceof ModalTemplate.BasicModal) {
            return jitModal;
        }
        if (jitModal instanceof ModalTemplate.JitModal) {
            ModalTemplate.JitModal jitModal2 = jitModal;
            List buttons4 = jitModal2.getButtons();
            ArrayList arrayList4 = new ArrayList(q7h.U(buttons4, 10));
            Iterator it4 = buttons4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(ot21.c((Button) it4.next(), dynamicTagsMetadata, linkedHashSet));
            }
            return ModalTemplate.JitModal.copy$default(jitModal2, (String) null, arrayList4, 1, (Object) null);
        }
        if (!(jitModal instanceof ModalTemplate.BaseModal)) {
            if (jitModal instanceof ModalTemplate.Undefined) {
                return jitModal;
            }
            eg.o();
            return null;
        }
        ModalTemplate.BaseModal baseModal = (ModalTemplate.BaseModal) jitModal;
        AccessoryContent accessoryContent9 = baseModal.getAccessoryContent();
        AccessoryContent accessoryContentB9 = accessoryContent9 != null ? ot21.b(accessoryContent9, dynamicTagsMetadata, linkedHashSet) : null;
        MessageText messageTextE22 = ot21.e(baseModal.getHeadline(), dynamicTagsMetadata, linkedHashSet);
        MessageText messageTextE23 = ot21.e(baseModal.getBody(), dynamicTagsMetadata, linkedHashSet);
        Button buttonC22 = ot21.c(baseModal.getPrimaryButton(), dynamicTagsMetadata, linkedHashSet);
        Button secondaryButton11 = baseModal.getSecondaryButton();
        Button buttonC23 = secondaryButton11 != null ? ot21.c(secondaryButton11, dynamicTagsMetadata, linkedHashSet) : null;
        Disclaimer disclaimer3 = baseModal.getDisclaimer();
        if (disclaimer3 != null) {
            MessageText text5 = disclaimer3.getText();
            buttonCopy$default = Disclaimer.copy$default(disclaimer3, text5 != null ? ot21.e(text5, dynamicTagsMetadata, linkedHashSet) : null, (Button) null, 2, (Object) null);
        }
        return ModalTemplate.BaseModal.copy$default(baseModal, (BackgroundColor) null, accessoryContentB9, messageTextE22, messageTextE23, buttonC22, buttonC23, buttonCopy$default, (AccessoryContentSize) null, (ContentAlignment) null, 385, (Object) null);
    }

    public static final huq0 s(File file, boolean z) {
        return new huq0(new FileOutputStream(file, z), new gve1());
    }

    public static huq0 t(File file) {
        return s(file, false);
    }

    public static final xj80 u(File file) {
        return new xj80(new FileInputStream(file), gve1.d);
    }

    public static final xj80 v(InputStream inputStream) {
        return new xj80(inputStream, new gve1());
    }

    public static ebu w() {
        return new ebu(new ebu("spotify:internal:iir-qs", (byte) 1), (byte) 2);
    }

    public static final int x(duk1 duk1Var) {
        switch (duk1Var.ordinal()) {
            case 0:
                return 2131958887;
            case 1:
                return 2131958879;
            case 2:
                return 2131958880;
            case 3:
                return 2131958890;
            case 4:
                return 2131958886;
            case 5:
                return 2131958883;
            case 6:
                return 2131958891;
            case 7:
                return 2131958888;
            case 8:
                return 2131958892;
            case 9:
                return 2131958882;
            case 10:
                return 2131958881;
            case 11:
                return 2131958884;
            case 12:
                return 2131958885;
            case 13:
                return 2131958889;
            case 14:
                return 2131958893;
            default:
                eg.o();
                return 0;
        }
    }

    public abstract int o();
}
