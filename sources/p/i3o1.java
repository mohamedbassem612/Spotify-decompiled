package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import com.spotify.player.model.ContextTrack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i3o1 implements wax {
    public static final uiy0 a = new uiy0((byte) 1);
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:101:0x0189  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0149  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    public static final void a(long j, long j2, qim0 qim0Var, u7h u7hVar, float f, boolean z, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        u7h u7hVar2;
        int i4;
        float f2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        boolean z3;
        u7h u7hVar3;
        boolean z4;
        float f3;
        h311 h311VarV;
        n6a1 n6a1VarS;
        qim0 qim0VarE;
        gfh0 gfh0VarC;
        boolean z5;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE2;
        float f4;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-358340271);
        if ((i & 6) == 0) {
            i3 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                u7hVar2 = u7hVar;
                i3 |= x340Var.g(u7hVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (x340Var.h(z2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if (x340Var.i(j2iVar)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i8 = i3;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i8 & 1, z3)) {
                        if (i10 != 0) {
                            u7hVar2 = null;
                        }
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        qqb qqbVarD = k1u.d(1.0f, j2);
                        qim0 qim0VarQ = i1p1.q(d1u.F(qim0Var, qqbVarD.a, qqbVarD.b, er31.b(16.0f)), er31.b(16.0f));
                        if (u7hVar2 == null) {
                            n6a1VarS = new n6a1(j);
                        } else {
                            n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                        }
                        qim0VarE = dug.e(qim0VarQ, n6a1VarS, null, 0.0f, 6);
                        if (f2 != 0.0f) {
                            if (f2 == 1.0f || !z2) {
                                f4 = 192.0f;
                            } else {
                                f4 = 220.0f;
                            }
                            qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                        }
                        qim0 qim0VarX = uyn1.x(qim0VarE, 8.0f);
                        gfh0VarC = t1c.c(een.d, false);
                        z5 = z2;
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE2, x340Var, y580.Y);
                        ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                        u7hVar3 = u7hVar2;
                        z4 = z5;
                    } else {
                        x340Var.b0();
                        u7hVar3 = u7hVar2;
                        z4 = z2;
                    }
                    f3 = f2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i8 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i8 & 1, z3)) {
                    if (i10 != 0) {
                        u7hVar2 = null;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    qqb qqbVarD2 = k1u.d(1.0f, j2);
                    qim0 qim0VarQ2 = i1p1.q(d1u.F(qim0Var, qqbVarD2.a, qqbVarD2.b, er31.b(16.0f)), er31.b(16.0f));
                    if (u7hVar2 == null) {
                        n6a1VarS = new n6a1(j);
                    } else {
                        n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                    }
                    qim0VarE = dug.e(qim0VarQ2, n6a1VarS, null, 0.0f, 6);
                    if (f2 != 0.0f) {
                        if (f2 == 1.0f) {
                            f4 = 192.0f;
                        } else {
                            f4 = 192.0f;
                        }
                        qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                    }
                    qim0 qim0VarX2 = uyn1.x(qim0VarE, 8.0f);
                    gfh0VarC = t1c.c(een.d, false);
                    z5 = z2;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE2 = zr7.E(x340Var, qim0VarX2);
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE2, x340Var, y580.Y);
                    ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                    u7hVar3 = u7hVar2;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                f3 = f2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
                }
            }
            i3 |= 24576;
            f2 = f;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i8 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i8 & 1, z3)) {
                    if (i10 != 0) {
                        u7hVar2 = null;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    qqb qqbVarD3 = k1u.d(1.0f, j2);
                    qim0 qim0VarQ3 = i1p1.q(d1u.F(qim0Var, qqbVarD3.a, qqbVarD3.b, er31.b(16.0f)), er31.b(16.0f));
                    if (u7hVar2 == null) {
                        n6a1VarS = new n6a1(j);
                    } else {
                        n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                    }
                    qim0VarE = dug.e(qim0VarQ3, n6a1VarS, null, 0.0f, 6);
                    if (f2 != 0.0f) {
                        if (f2 == 1.0f) {
                            f4 = 192.0f;
                        } else {
                            f4 = 192.0f;
                        }
                        qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                    }
                    qim0 qim0VarX3 = uyn1.x(qim0VarE, 8.0f);
                    gfh0VarC = t1c.c(een.d, false);
                    z5 = z2;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE2 = zr7.E(x340Var, qim0VarX3);
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE2, x340Var, y580.Y);
                    ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                    u7hVar3 = u7hVar2;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                f3 = f2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i8 & 1, z3)) {
                if (i10 != 0) {
                    u7hVar2 = null;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                qqb qqbVarD4 = k1u.d(1.0f, j2);
                qim0 qim0VarQ4 = i1p1.q(d1u.F(qim0Var, qqbVarD4.a, qqbVarD4.b, er31.b(16.0f)), er31.b(16.0f));
                if (u7hVar2 == null) {
                    n6a1VarS = new n6a1(j);
                } else {
                    n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                }
                qim0VarE = dug.e(qim0VarQ4, n6a1VarS, null, 0.0f, 6);
                if (f2 != 0.0f) {
                    if (f2 == 1.0f) {
                        f4 = 192.0f;
                    } else {
                        f4 = 192.0f;
                    }
                    qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                }
                qim0 qim0VarX4 = uyn1.x(qim0VarE, 8.0f);
                gfh0VarC = t1c.c(een.d, false);
                z5 = z2;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE2 = zr7.E(x340Var, qim0VarX4);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                u7hVar3 = u7hVar2;
                z4 = z5;
            } else {
                x340Var.b0();
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            f3 = f2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
            }
        }
        i3 |= 3072;
        u7hVar2 = u7hVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i8 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i8 & 1, z3)) {
                    if (i10 != 0) {
                        u7hVar2 = null;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    qqb qqbVarD5 = k1u.d(1.0f, j2);
                    qim0 qim0VarQ5 = i1p1.q(d1u.F(qim0Var, qqbVarD5.a, qqbVarD5.b, er31.b(16.0f)), er31.b(16.0f));
                    if (u7hVar2 == null) {
                        n6a1VarS = new n6a1(j);
                    } else {
                        n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                    }
                    qim0VarE = dug.e(qim0VarQ5, n6a1VarS, null, 0.0f, 6);
                    if (f2 != 0.0f) {
                        if (f2 == 1.0f) {
                            f4 = 192.0f;
                        } else {
                            f4 = 192.0f;
                        }
                        qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                    }
                    qim0 qim0VarX5 = uyn1.x(qim0VarE, 8.0f);
                    gfh0VarC = t1c.c(een.d, false);
                    z5 = z2;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE2 = zr7.E(x340Var, qim0VarX5);
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE2, x340Var, y580.Y);
                    ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                    u7hVar3 = u7hVar2;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                f3 = f2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i8 & 1, z3)) {
                if (i10 != 0) {
                    u7hVar2 = null;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                qqb qqbVarD6 = k1u.d(1.0f, j2);
                qim0 qim0VarQ6 = i1p1.q(d1u.F(qim0Var, qqbVarD6.a, qqbVarD6.b, er31.b(16.0f)), er31.b(16.0f));
                if (u7hVar2 == null) {
                    n6a1VarS = new n6a1(j);
                } else {
                    n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                }
                qim0VarE = dug.e(qim0VarQ6, n6a1VarS, null, 0.0f, 6);
                if (f2 != 0.0f) {
                    if (f2 == 1.0f) {
                        f4 = 192.0f;
                    } else {
                        f4 = 192.0f;
                    }
                    qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                }
                qim0 qim0VarX6 = uyn1.x(qim0VarE, 8.0f);
                gfh0VarC = t1c.c(een.d, false);
                z5 = z2;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE2 = zr7.E(x340Var, qim0VarX6);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                u7hVar3 = u7hVar2;
                z4 = z5;
            } else {
                x340Var.b0();
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            f3 = f2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
            }
        }
        i3 |= 24576;
        f2 = f;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i8 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i8 & 1, z3)) {
                if (i10 != 0) {
                    u7hVar2 = null;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                qqb qqbVarD7 = k1u.d(1.0f, j2);
                qim0 qim0VarQ7 = i1p1.q(d1u.F(qim0Var, qqbVarD7.a, qqbVarD7.b, er31.b(16.0f)), er31.b(16.0f));
                if (u7hVar2 == null) {
                    n6a1VarS = new n6a1(j);
                } else {
                    n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
                }
                qim0VarE = dug.e(qim0VarQ7, n6a1VarS, null, 0.0f, 6);
                if (f2 != 0.0f) {
                    if (f2 == 1.0f) {
                        f4 = 192.0f;
                    } else {
                        f4 = 192.0f;
                    }
                    qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
                }
                qim0 qim0VarX7 = uyn1.x(qim0VarE, 8.0f);
                gfh0VarC = t1c.c(een.d, false);
                z5 = z2;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE2 = zr7.E(x340Var, qim0VarX7);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
                u7hVar3 = u7hVar2;
                z4 = z5;
            } else {
                x340Var.b0();
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            f3 = f2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
            if (x340Var.i(j2iVar)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i8 = i3;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i8 & 1, z3)) {
            if (i10 != 0) {
                u7hVar2 = null;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            if (i6 != 0) {
                z2 = false;
            }
            qqb qqbVarD8 = k1u.d(1.0f, j2);
            qim0 qim0VarQ8 = i1p1.q(d1u.F(qim0Var, qqbVarD8.a, qqbVarD8.b, er31.b(16.0f)), er31.b(16.0f));
            if (u7hVar2 == null) {
                n6a1VarS = new n6a1(j);
            } else {
                n6a1VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), u7hVar2}), 0.0f, 0.0f, 14);
            }
            qim0VarE = dug.e(qim0VarQ8, n6a1VarS, null, 0.0f, 6);
            if (f2 != 0.0f) {
                if (f2 == 1.0f) {
                    f4 = 192.0f;
                } else {
                    f4 = 192.0f;
                }
                qim0VarE = qim0VarE.then(u291.v(nim0.a, f4));
            }
            qim0 qim0VarX8 = uyn1.x(qim0VarE, 8.0f);
            gfh0VarC = t1c.c(een.d, false);
            z5 = z2;
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE2 = zr7.E(x340Var, qim0VarX8);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, y580.Y);
            ywx0.l(6 | ((i8 >> 15) & 112), j2iVar, h2c.a, x340Var, true);
            u7hVar3 = u7hVar2;
            z4 = z5;
        } else {
            x340Var.b0();
            u7hVar3 = u7hVar2;
            z4 = z2;
        }
        f3 = f2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new psd(j, j2, qim0Var, u7hVar3, f3, z4, j2iVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:216:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:219:0x0401  */
    /* JADX WARN: Code duplicated, block: B:220:0x0408  */
    /* JADX WARN: Code duplicated, block: B:223:0x0414 A[PHI: r2 r18 r20
      0x0414: PHI (r2v64 kotlin.jvm.functions.Function0) = (r2v28 kotlin.jvm.functions.Function0), (r2v65 kotlin.jvm.functions.Function0) binds: [B:222:0x0412, B:219:0x0401] A[DONT_GENERATE, DONT_INLINE]
      0x0414: PHI (r18v26 boolean) = (r18v17 boolean), (r18v28 boolean) binds: [B:222:0x0412, B:219:0x0401] A[DONT_GENERATE, DONT_INLINE]
      0x0414: PHI (r20v8 p.ven0) = (r20v4 p.ven0), (r20v9 p.ven0) binds: [B:222:0x0412, B:219:0x0401] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x0416  */
    /* JADX WARN: Code duplicated, block: B:227:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x043f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0489  */
    /* JADX WARN: Code duplicated, block: B:237:0x0493  */
    /* JADX WARN: Code duplicated, block: B:239:0x0499 A[PHI: r15
      0x0499: PHI (r15v21 int) = (r15v8 int), (r15v22 int) binds: [B:238:0x0497, B:236:0x0490] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:240:0x049b  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:245:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:251:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:253:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:259:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:261:0x04db  */
    /* JADX WARN: Code duplicated, block: B:262:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:263:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:267:0x0508  */
    /* JADX WARN: Code duplicated, block: B:285:0x059d A[PHI: r10
      0x059d: PHI (r10v21 boolean) = (r10v16 boolean), (r10v22 boolean) binds: [B:284:0x059b, B:280:0x0594] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:294:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:297:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:298:0x0602  */
    /* JADX WARN: Code duplicated, block: B:301:0x063f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0648  */
    /* JADX WARN: Code duplicated, block: B:304:0x064c  */
    /* JADX WARN: Code duplicated, block: B:307:0x066c  */
    /* JADX WARN: Code duplicated, block: B:309:0x0682  */
    /* JADX WARN: Code duplicated, block: B:311:0x068c  */
    /* JADX WARN: Code duplicated, block: B:313:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:315:0x06ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:320:0x070f  */
    /* JADX WARN: Code duplicated, block: B:323:0x072b  */
    /* JADX WARN: Code duplicated, block: B:326:0x073b  */
    /* JADX WARN: Code duplicated, block: B:327:0x0746  */
    /* JADX WARN: Code duplicated, block: B:330:0x0769  */
    /* JADX WARN: Code duplicated, block: B:331:0x076d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0782  */
    /* JADX WARN: Code duplicated, block: B:337:0x0794  */
    /* JADX WARN: Code duplicated, block: B:340:0x07da  */
    /* JADX WARN: Code duplicated, block: B:343:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:345:0x0857  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    public static final void b(String str, boolean z, boolean z2, boolean z3, boolean z4, zh80 zh80Var, boolean z5, iu30 iu30Var, Function0 function0, boolean z6, boolean z7, String str2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Uri uri, boolean z13, lg01 lg01Var, boolean z14, Function0 function1, boolean z15, Function0 function2, boolean z16, Function0 function3, n7h0 n7h0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        ven0 ven0Var;
        boolean z17;
        ven0 ven0Var2;
        boolean z18;
        boolean zI;
        int i2;
        Function0 function4;
        ven0 ven0Var3;
        boolean z19;
        boolean z20;
        boolean z21;
        Object objT;
        m4c m4cVar;
        int i3;
        b0k b0kVar3;
        boolean z22;
        Function0 function5;
        Function0 function6;
        ven0 ven0Var4;
        int i4;
        int i5;
        boolean z23;
        ven0 ven0Var5;
        boolean zI2;
        Object objT2;
        m4c m4cVar2;
        m4c m4cVar3;
        boolean z24;
        boolean z25;
        Object h7h0Var;
        Function0 function7;
        Function0 function8;
        ven0 ven0Var6;
        Function0 function9;
        int i6;
        wnb0 wnb0Var;
        qim0 qim0VarF;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z26;
        n4k n4kVar;
        llj lljVar;
        n7h0 n7h0Var2;
        b0k b0kVar4;
        llj lljVar2;
        iu30 iu30Var2;
        b0k b0kVar5;
        Object objT3;
        Object objT4;
        wnb0 wnb0Var2;
        Object objT5;
        Object objT6;
        b0k b0kVar6;
        m4c m4cVar4;
        Object objT7;
        Object objT8;
        Integer num;
        boolean z27;
        boolean z28;
        boolean zG;
        Object f7h0Var;
        boolean z29;
        m4c m4cVar5;
        b0k b0kVar7 = (x340) b0kVar;
        b0kVar7.k0(-2036316168);
        int i7 = i | (b0kVar7.g(str) ? 4 : 2) | (b0kVar7.h(z) ? 32 : 16) | (b0kVar7.h(z2) ? 256 : 128) | (b0kVar7.h(z3) ? 2048 : 1024) | (b0kVar7.h(z4) ? 16384 : 8192) | (b0kVar7.e(zh80Var.ordinal()) ? 131072 : 65536) | (b0kVar7.h(z5) ? 1048576 : 524288) | (b0kVar7.i(iu30Var) ? 8388608 : 4194304) | (b0kVar7.i(function0) ? 67108864 : 33554432);
        int i8 = (b0kVar7.h(z6) ? (char) 4 : (char) 2) | (b0kVar7.h(z7) ? ' ' : (char) 16) | (b0kVar7.g(str2) ? 256 : 128) | (b0kVar7.h(z8) ? 2048 : 1024) | (b0kVar7.h(z9) ? 16384 : 8192) | (b0kVar7.h(z10) ? 131072 : 65536) | (b0kVar7.h(z11) ? 1048576 : 524288) | (b0kVar7.h(z12) ? 8388608 : 4194304) | (b0kVar7.g(uri) ? 67108864 : 33554432) | (b0kVar7.h(z13) ? 536870912 : 268435456);
        int i9 = (b0kVar7.i(lg01Var) ? (char) 4 : (char) 2) | (b0kVar7.h(z14) ? ' ' : (char) 16) | (b0kVar7.g((Object) null) ? (char) 256 : (char) 128) | (b0kVar7.i(function1) ? (char) 2048 : (char) 1024) | (b0kVar7.h(z15) ? (char) 16384 : (char) 8192) | (b0kVar7.i(function2) ? (char) 0 : (char) 0) | (b0kVar7.h(z16) ? (char) 0 : (char) 0) | (b0kVar7.i(function3) ? (char) 0 : (char) 0) | (b0kVar7.g(n7h0Var) ? (char) 0 : (char) 0);
        if (b0kVar7.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (38347923 & i9) == 38347922) ? false : true)) {
            b0kVar7.d0();
            if ((i & 1) != 0 && !b0kVar7.E()) {
                b0kVar7.b0();
            }
            b0kVar7.s();
            boolean z30 = n7h0Var.n;
            boolean z31 = n7h0Var.o;
            b0kVar7.i0(-1579953324);
            j06 j06Var = ((x340) b0kVar7).a;
            Boolean bool = Boolean.FALSE;
            Object[] objArr = new Object[0];
            Object objT9 = b0kVar7.T();
            m4c m4cVar6 = fkj0.X;
            if (objT9 == m4cVar6) {
                objT9 = lxf0.W0;
                b0kVar7.s0(objT9);
            }
            ven0 ven0Var7 = (ven0) k5p1.s(objArr, (Function0) objT9, b0kVar7, 48);
            boolean zI3 = ((((3670016 & i9) ^ 1572864) > 1048576 && b0kVar7.h(z16)) || (i9 & 1572864) == 1048576) | b0kVar7.i(ven0Var7) | ((((29360128 & i9) ^ 12582912) > 8388608 && b0kVar7.g(function3)) || (i9 & 12582912) == 8388608);
            Object objT10 = b0kVar7.T();
            if (zI3 || objT10 == m4cVar6) {
                objT10 = new hrn(z16, function3, ven0Var7, (byte) 3);
                b0kVar7.s0(objT10);
            }
            Function0 function10 = (Function0) objT10;
            Object objT11 = b0kVar7.T();
            if (objT11 == m4cVar6) {
                objT11 = v8r.q(lg01Var);
                b0kVar7.s0(objT11);
            }
            tob1 tob1Var = (ven0) objT11;
            boolean zI4 = b0kVar7.i(lg01Var) | b0kVar7.i(tob1Var);
            Object objT12 = b0kVar7.T();
            if (zI4 || objT12 == m4cVar6) {
                objT12 = new vk1(lg01Var, tob1Var, (lnm) null);
                b0kVar7.s0(objT12);
            }
            qxd0.t(lg01Var, b0kVar7, (vu30) objT12);
            b0kVar7.i0(158719600);
            b0kVar7.r(false);
            Object objT13 = b0kVar7.T();
            if (objT13 == m4cVar6) {
                objT13 = v8r.q(bool);
                b0kVar7.s0(objT13);
            }
            ven0 ven0Var8 = (ven0) objT13;
            Object objT14 = b0kVar7.T();
            if (objT14 == m4cVar6) {
                objT14 = v8r.q(bool);
                b0kVar7.s0(objT14);
            }
            ven0 ven0Var9 = (ven0) objT14;
            Object objT15 = b0kVar7.T();
            if (objT15 == m4cVar6) {
                objT15 = v8r.q(bool);
                b0kVar7.s0(objT15);
            }
            ven0 ven0Var10 = (ven0) objT15;
            Object objT16 = b0kVar7.T();
            if (objT16 == m4cVar6) {
                objT16 = v8r.q(bool);
                b0kVar7.s0(objT16);
            }
            ven0 ven0Var11 = (ven0) objT16;
            Object objT17 = b0kVar7.T();
            if (objT17 == m4cVar6) {
                objT17 = v8r.q(str2);
                b0kVar7.s0(objT17);
            }
            ven0 ven0Var12 = (ven0) objT17;
            boolean zI5 = b0kVar7.i(ven0Var8) | b0kVar7.i(ven0Var9) | b0kVar7.i(tob1Var);
            Object objT18 = b0kVar7.T();
            if (zI5 || objT18 == m4cVar6) {
                objT18 = new aix(ven0Var8, ven0Var9, tob1Var, (byte) 3);
                b0kVar7.s0(objT18);
            }
            Function0 function11 = (Function0) objT18;
            Boolean boolValueOf = Boolean.valueOf(z14);
            boolean zH = b0kVar7.h(false) | b0kVar7.i(ven0Var9) | b0kVar7.i(ven0Var10) | ((((i9 & 112) ^ 48) > 32 && b0kVar7.h(z14)) || (i9 & 48) == 32) | b0kVar7.i(ven0Var8);
            Object objT19 = b0kVar7.T();
            if (zH || objT19 == m4cVar6) {
                ven0Var = ven0Var9;
                z17 = false;
                objT19 = new du2(false, z14, ven0Var, ven0Var10, ven0Var8, (lnm) null);
                b0kVar7.s0(objT19);
            } else {
                ven0Var = ven0Var9;
                z17 = false;
            }
            qxd0.s(bool, boolValueOf, (vu30) objT19, b0kVar7);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            tob1 tob1Var2 = tob1Var;
            boolean zH2 = b0kVar7.h(z) | b0kVar7.i(ven0Var8) | b0kVar7.i(ven0Var11) | b0kVar7.g(function11) | b0kVar7.i(ven0Var12) | (((((i8 & 896) ^ 384) <= 256 || !b0kVar7.g(str2)) && (i8 & 384) != 256) ? z17 : true) | (((((i9 & 896) ^ 384) <= 256 || !b0kVar7.g((Object) null)) && (i9 & 384) != 256) ? z17 : true) | b0kVar7.i(tob1Var2);
            int i10 = (458752 & i9) ^ 196608;
            if (i10 <= 131072 || !b0kVar7.g(function2)) {
                ven0Var2 = ven0Var8;
                if ((i9 & 196608) != 131072) {
                    z18 = z17;
                }
                zI = z18 | zH2 | b0kVar7.i(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03ef: ARITH (r1v11 'zI' boolean) = (wrap boolean:0x03ea: ARITH (r1v9 'z18' boolean) | (r6v11 'zH2' boolean) A[DONT_WRAP, WRAPPED]) | (wrap boolean:0x03eb: INVOKE (r10v1 'b0kVar7' p.b0k), (r20v3 p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) in method: p.i3o1.b(java.lang.String, boolean, boolean, boolean, boolean, p.zh80, boolean, p.iu30, kotlin.jvm.functions.Function0, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, android.net.Uri, boolean, p.lg01, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, p.n7h0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v3 p.ven0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2220
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.i3o1.b(java.lang.String, boolean, boolean, boolean, boolean, p.zh80, boolean, p.iu30, kotlin.jvm.functions.Function0, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, android.net.Uri, boolean, p.lg01, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, p.n7h0, p.b0k, int):void");
            }

            public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1454421389);
                int i2 = i | 6;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long jC = cbx.a(x340Var).a.b.c();
                    qim0 qim0Var2 = nim0.a;
                    dsa0.b(qim0Var2, jC, 1.0f, x340Var, 6);
                    qim0Var = qim0Var2;
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ns30(qim0Var, i, (byte) 7);
                }
            }

            public static final void e(int i, int i2, b0k b0kVar, qim0 qim0Var) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-168242844);
                int i3 = (((i2 & 1) == 0 && x340Var.i(qim0Var)) ? 4 : 2) | i;
                if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 && !x340Var.E()) {
                        x340Var.b0();
                        int i4 = i2 & 1;
                    } else if ((i2 & 1) != 0) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        qim0Var = uyn1.A(nim0.a, 16.0f, 16.0f, 16.0f, 16.0f);
                    }
                    x340Var.s();
                    nyx.a(2, (wux) null, apo.r(-187911561, new nws0(qim0Var), x340Var), x340Var, 3078, 6);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new z3z0((byte) 3, i, i2, qim0Var);
                }
            }

            /* JADX WARN: Code duplicated, block: B:102:0x0206  */
            /* JADX WARN: Code duplicated, block: B:106:0x0235  */
            /* JADX WARN: Code duplicated, block: B:113:0x0269  */
            /* JADX WARN: Code duplicated, block: B:115:0x026c  */
            /* JADX WARN: Code duplicated, block: B:117:0x026f  */
            /* JADX WARN: Code duplicated, block: B:119:0x0274  */
            /* JADX WARN: Code duplicated, block: B:121:0x0278  */
            /* JADX WARN: Code duplicated, block: B:124:0x027f  */
            /* JADX WARN: Code duplicated, block: B:78:0x0177  */
            /* JADX WARN: Code duplicated, block: B:80:0x017d  */
            /* JADX WARN: Code duplicated, block: B:81:0x0182  */
            /* JADX WARN: Code duplicated, block: B:84:0x0187 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:82:0x0183, B:84:0x0187, B:85:0x0191), top: B:133:0x0183 }] */
            /* JADX WARN: Code duplicated, block: B:85:0x0191 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #0 {all -> 0x019b, blocks: (B:82:0x0183, B:84:0x0187, B:85:0x0191), top: B:133:0x0183 }] */
            /* JADX WARN: Code duplicated, block: B:95:0x01b5  */
            /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:98:0x0201  */
            public static final void f(cng1 cng1Var, RemoteViews remoteViews, gt40 gt40Var, lk80 lk80Var) {
                int i;
                Context context;
                p811 p811Var;
                p811 p811Var2;
                p811 p811Var3;
                p811 p811Var4;
                q60 q60Var;
                b5u b5uVar;
                rzq0 rzq0Var;
                q161 q161Var;
                int iOrdinal;
                List list;
                float fP;
                float fP2;
                boolean z;
                float f;
                q10 q10Var;
                Integer num;
                int iIntValue;
                Context context2 = cng1Var.a;
                p811 p811Var5 = new p811();
                p811 p811Var6 = new p811();
                p811 p811Var7 = new p811();
                p811 p811Var8 = new p811();
                p811 p811Var9 = new p811();
                p811Var9.a = sjk1.a;
                p811 p811Var10 = new p811();
                p811 p811Var11 = new p811();
                p811 p811Var12 = new p811();
                p811 p811Var13 = new p811();
                gt40Var.foldIn(rih1.a, new o06(p811Var10, p811Var5, p811Var6, context2, remoteViews, lk80Var, p811Var7, p811Var9, p811Var8, cng1Var, p811Var12, p811Var11, p811Var13));
                iql1 iql1Var = (iql1) p811Var5.a;
                f660 f660Var = (f660) p811Var6.a;
                Map map = qnb0.a;
                int i2 = lk80Var.b;
                int i3 = lk80Var.a;
                int i4 = 0;
                if (i2 != -1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        eg.m("There is currently no valid use case where a complex view is used on Android S");
                        return;
                    }
                    b5u b5uVar2 = iql1Var != null ? iql1Var.a : null;
                    b5u b5uVar3 = f660Var != null ? f660Var.a : null;
                    if (m(b5uVar2) || m(b5uVar3)) {
                        boolean z2 = (b5uVar2 instanceof v4u) || (b5uVar2 instanceof u4u);
                        boolean z3 = (b5uVar3 instanceof v4u) || (b5uVar3 instanceof u4u);
                        if (z2 && z3) {
                            i = 2131626144;
                        } else if (z2) {
                            i = 2131626145;
                        } else {
                            i = z3 ? 2131626146 : 2131626147;
                        }
                        context = context2;
                        int iQ = puo1.q(remoteViews, cng1Var, 2131430987, i, null);
                        boolean z4 = b5uVar2 instanceof t4u;
                        z4u z4uVar = z4u.a;
                        p811Var = p811Var9;
                        v4u v4uVar = v4u.a;
                        p811Var2 = p811Var13;
                        u4u u4uVar = u4u.a;
                        if (z4) {
                            p811Var4 = p811Var11;
                            p811Var3 = p811Var12;
                            remoteViews.setInt(iQ, "setWidth", (int) TypedValue.applyDimension(1, ((t4u) b5uVar2).a, context.getResources().getDisplayMetrics()));
                        } else {
                            p811Var3 = p811Var12;
                            p811Var4 = p811Var11;
                            if (b5uVar2 instanceof x4u) {
                                remoteViews.setInt(iQ, "setWidth", context.getResources().getDimensionPixelSize(2131167210));
                            } else {
                                if (!(u890.j(b5uVar2, u4uVar) ? true : u890.j(b5uVar2, v4uVar) ? true : u890.j(b5uVar2, z4uVar)) && b5uVar2 != null) {
                                    eg.o();
                                    return;
                                }
                            }
                        }
                        if (b5uVar3 instanceof t4u) {
                            remoteViews.setInt(iQ, "setHeight", (int) TypedValue.applyDimension(1, ((t4u) b5uVar3).a, context.getResources().getDisplayMetrics()));
                        } else if (b5uVar3 instanceof x4u) {
                            remoteViews.setInt(iQ, "setHeight", context.getResources().getDimensionPixelSize(2131167210));
                        } else {
                            if (!(u890.j(b5uVar3, u4uVar) ? true : u890.j(b5uVar3, v4uVar) ? true : u890.j(b5uVar3, z4uVar)) && b5uVar3 != null) {
                                eg.o();
                                return;
                            }
                        }
                    }
                    q60Var = (q60) p811Var10.a;
                    if (q60Var != null) {
                        q10Var = q60Var.a;
                        num = cng1Var.m;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = i3;
                        }
                        try {
                            if (cng1Var.f) {
                                remoteViews.setOnClickFillInIntent(iIntValue, f3o1.m(q10Var, cng1Var, iIntValue, k74.Z0));
                            } else {
                                remoteViews.setOnClickPendingIntent(iIntValue, f3o1.n(q10Var, cng1Var, iIntValue, k74.a1));
                            }
                        } catch (Throwable unused) {
                            Objects.toString(q10Var);
                        }
                    }
                    b5uVar = (b5u) p811Var8.a;
                    if (b5uVar != null && Build.VERSION.SDK_INT >= 31) {
                        n06.a.a(remoteViews, i3, b5uVar);
                    }
                    rzq0Var = (rzq0) p811Var7.a;
                    if (rzq0Var != null) {
                        Resources resources = context.getResources();
                        pzq0 pzq0Var = rzq0Var.a;
                        float fP3 = eqr0.P(resources, pzq0Var.b) + pzq0Var.a;
                        pzq0 pzq0Var2 = rzq0Var.b;
                        fP = eqr0.P(resources, pzq0Var2.b) + pzq0Var2.a;
                        pzq0 pzq0Var3 = rzq0Var.c;
                        float fP4 = eqr0.P(resources, pzq0Var3.b) + pzq0Var3.a;
                        pzq0 pzq0Var4 = rzq0Var.d;
                        float fP5 = eqr0.P(resources, pzq0Var4.b) + pzq0Var4.a;
                        pzq0 pzq0Var5 = rzq0Var.e;
                        fP2 = eqr0.P(resources, pzq0Var5.b) + pzq0Var5.a;
                        pzq0 pzq0Var6 = rzq0Var.f;
                        float fP6 = eqr0.P(resources, pzq0Var6.b) + pzq0Var6.a;
                        z = cng1Var.c;
                        if (z) {
                            f = fP2;
                        } else {
                            f = fP;
                        }
                        float f2 = fP3 + f;
                        if (!z) {
                            fP = fP2;
                        }
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        remoteViews.setViewPadding(lk80Var.a, (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, fP4, displayMetrics), (int) TypedValue.applyDimension(1, fP5 + fP, displayMetrics), (int) TypedValue.applyDimension(1, fP6, displayMetrics));
                    }
                    if (p811Var3.a == null) {
                        bhn0.d();
                        return;
                    }
                    q161Var = (q161) p811Var2.a;
                    if (q161Var != null && (list = (List) q161Var.a.a()) != null) {
                        remoteViews.setContentDescription(i3, o7h.y0(list, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                    }
                    iOrdinal = ((sjk1) p811Var.a).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            i4 = 4;
                        } else {
                            if (iOrdinal == 2) {
                                eg.o();
                                return;
                            }
                            i4 = 8;
                        }
                    }
                    remoteViews.setViewVisibility(i3, i4);
                }
                if (iql1Var != null) {
                    h(context2, remoteViews, iql1Var, i3);
                }
                if (f660Var != null) {
                    g(context2, remoteViews, f660Var, i3);
                }
                context = context2;
                p811Var = p811Var9;
                p811Var3 = p811Var12;
                p811Var4 = p811Var11;
                p811Var2 = p811Var13;
                q60Var = (q60) p811Var10.a;
                if (q60Var != null) {
                    q10Var = q60Var.a;
                    num = cng1Var.m;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i3;
                    }
                    if (cng1Var.f) {
                        remoteViews.setOnClickFillInIntent(iIntValue, f3o1.m(q10Var, cng1Var, iIntValue, k74.Z0));
                    } else {
                        remoteViews.setOnClickPendingIntent(iIntValue, f3o1.n(q10Var, cng1Var, iIntValue, k74.a1));
                    }
                }
                b5uVar = (b5u) p811Var8.a;
                if (b5uVar != null) {
                    n06.a.a(remoteViews, i3, b5uVar);
                }
                rzq0Var = (rzq0) p811Var7.a;
                if (rzq0Var != null) {
                    Resources resources2 = context.getResources();
                    pzq0 pzq0Var7 = rzq0Var.a;
                    float fP7 = eqr0.P(resources2, pzq0Var7.b) + pzq0Var7.a;
                    pzq0 pzq0Var8 = rzq0Var.b;
                    fP = eqr0.P(resources2, pzq0Var8.b) + pzq0Var8.a;
                    pzq0 pzq0Var9 = rzq0Var.c;
                    float fP8 = eqr0.P(resources2, pzq0Var9.b) + pzq0Var9.a;
                    pzq0 pzq0Var10 = rzq0Var.d;
                    float fP9 = eqr0.P(resources2, pzq0Var10.b) + pzq0Var10.a;
                    pzq0 pzq0Var11 = rzq0Var.e;
                    fP2 = eqr0.P(resources2, pzq0Var11.b) + pzq0Var11.a;
                    pzq0 pzq0Var12 = rzq0Var.f;
                    float fP10 = eqr0.P(resources2, pzq0Var12.b) + pzq0Var12.a;
                    z = cng1Var.c;
                    if (z) {
                        f = fP2;
                    } else {
                        f = fP;
                    }
                    float f3 = fP7 + f;
                    if (!z) {
                        fP = fP2;
                    }
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    remoteViews.setViewPadding(lk80Var.a, (int) TypedValue.applyDimension(1, f3, displayMetrics2), (int) TypedValue.applyDimension(1, fP8, displayMetrics2), (int) TypedValue.applyDimension(1, fP9 + fP, displayMetrics2), (int) TypedValue.applyDimension(1, fP10, displayMetrics2));
                }
                if (p811Var3.a == null) {
                    bhn0.d();
                    return;
                }
                q161Var = (q161) p811Var2.a;
                if (q161Var != null) {
                    remoteViews.setContentDescription(i3, o7h.y0(list, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                }
                iOrdinal = ((sjk1) p811Var.a).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i4 = 4;
                    } else {
                        if (iOrdinal == 2) {
                            eg.o();
                            return;
                        }
                        i4 = 8;
                    }
                }
                remoteViews.setViewVisibility(i3, i4);
            }

            public static final void g(Context context, RemoteViews remoteViews, f660 f660Var, int i) {
                b5u b5uVar = f660Var.a;
                int i2 = Build.VERSION.SDK_INT;
                b5u b5uVar2 = u4u.a;
                b5u b5uVar3 = z4u.a;
                if (i2 < 31) {
                    if (p7h.M(new b5u[]{b5uVar3, v4u.a, b5uVar2}).contains(qnb0.f(b5uVar, context))) {
                        return;
                    }
                    eg.n("Using a height of ", b5uVar, " requires a complex layout before API 31");
                } else if (i2 >= 33 || !p7h.M(new b5u[]{b5uVar3, b5uVar2}).contains(b5uVar)) {
                    n06.a.b(remoteViews, i, b5uVar);
                }
            }

            public static final void h(Context context, RemoteViews remoteViews, iql1 iql1Var, int i) {
                b5u b5uVar = iql1Var.a;
                int i2 = Build.VERSION.SDK_INT;
                b5u b5uVar2 = u4u.a;
                b5u b5uVar3 = z4u.a;
                if (i2 < 31) {
                    if (p7h.M(new b5u[]{b5uVar3, v4u.a, b5uVar2}).contains(qnb0.f(b5uVar, context))) {
                        return;
                    }
                    eg.n("Using a width of ", b5uVar, " requires a complex layout before API 31");
                } else if (i2 >= 33 || !p7h.M(new b5u[]{b5uVar3, b5uVar2}).contains(b5uVar)) {
                    n06.a.c(remoteViews, i, b5uVar);
                }
            }

            public static x6h1 i() {
                x6h1 x6h1Var = new x6h1();
                x6h1Var.f = "";
                x6h1Var.g = "";
                x6h1Var.i = new ArrayList();
                x6h1Var.k = "";
                x6h1Var.l = "";
                return x6h1Var;
            }

            public static final smc0 j(v6b0 v6b0Var, List list, y3b0 y3b0Var, List list2, c1h1 c1h1Var, boolean z) {
                smc0 smc0VarN = k4p1.n();
                if (z) {
                    wdg wdgVarA = v6b0Var.a();
                    if (wdgVarA instanceof bla0) {
                        if (fc11.P(v6b0Var)) {
                            if (((bla0) wdgVarA).j()) {
                                smc0VarN.add(new ko80(v6b0Var, rc11.a.b(((tka0) wdgVarA).n().getDeclaringClass())));
                            }
                        } else if (!(v6b0Var instanceof u7b0) || !u1p1.z((ic11) v6b0Var)) {
                            bhn0.s(v6b0Var, "Only top-level callables are supported for now: ");
                            return null;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        smc0VarN.add(new h7b0(v6b0Var, (c4b0) it.next(), smc0VarN.b(), 2, c1h1Var));
                    }
                    if (y3b0Var != null) {
                        c4b0 c4b0Var = new c4b0(0, moa1.d.b());
                        c4b0Var.c = y3b0Var;
                        smc0VarN.add(new h7b0(v6b0Var, c4b0Var, smc0VarN.b(), 3, c1h1Var));
                    }
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    smc0VarN.add(new h7b0(v6b0Var, (c4b0) it2.next(), smc0VarN.b(), 4, c1h1Var));
                }
                return k4p1.k(smc0VarN);
            }

            public static tqw k(tka0 tka0Var, tv80 tv80Var) {
                return new tqw(tka0Var, tv80Var);
            }

            public static oc00 l(String str) {
                Object next;
                d7 d7Var = new d7(oc00.N0, (byte) 0);
                while (d7Var.hasNext()) {
                    next = d7Var.next();
                    if (((oc00) next).a.equals(str)) {
                        return (oc00) next;
                    }
                }
                next = null;
                return (oc00) next;
            }

            public static final boolean m(b5u b5uVar) {
                if (b5uVar instanceof t4u ? true : b5uVar instanceof x4u) {
                    return true;
                }
                if ((u890.j(b5uVar, u4u.a) ? true : u890.j(b5uVar, v4u.a) ? true : u890.j(b5uVar, z4u.a)) || b5uVar == null) {
                    return false;
                }
                eg.o();
                return false;
            }

            public static final jmr0 n(int i, b0k b0kVar, int i2) {
                TypedValue typedValue;
                boolean z;
                x340 x340Var = (x340) b0kVar;
                Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                Resources resources = (Resources) x340Var.k(AndroidCompositionLocals_androidKt.c);
                ax21 ax21Var = (ax21) x340Var.k(AndroidCompositionLocals_androidKt.e);
                synchronized (ax21Var) {
                    typedValue = (TypedValue) ax21Var.a.b(i);
                    z = true;
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        resources.getValue(i, typedValue, true);
                        fdn0 fdn0Var = ax21Var.a;
                        int iD = fdn0Var.d(i);
                        Object[] objArr = ((or80) fdn0Var).c;
                        Object obj = objArr[iD];
                        ((or80) fdn0Var).b[iD] = i;
                        objArr[iD] = typedValue;
                    }
                }
                CharSequence charSequence = typedValue.string;
                if (charSequence == null || !ihc1.o0(".xml", charSequence)) {
                    x340Var.i0(-1771643000);
                    Resources.Theme theme = context.getTheme();
                    boolean zG = x340Var.g(charSequence);
                    if ((((i2 & 14) ^ 6) <= 4 || !x340Var.e(i)) && (i2 & 6) != 4) {
                        z = false;
                    }
                    boolean zG2 = zG | z | x340Var.g(theme);
                    Object objT = x340Var.T();
                    if (zG2 || objT == fkj0.X) {
                        try {
                            objT = new yk4(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
                            x340Var.s0(objT);
                        } catch (Exception e) {
                            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
                        }
                    }
                    pxa pxaVar = new pxa((yk4) objT);
                    x340Var.r(false);
                    return pxaVar;
                }
                x340Var.i0(-1771798434);
                Resources.Theme theme2 = context.getTheme();
                int i3 = typedValue.changingConfigurations;
                e180 e180Var = (e180) x340Var.k(AndroidCompositionLocals_androidKt.d);
                d180 d180Var = new d180(theme2, i);
                WeakReference weakReference = (WeakReference) e180Var.a.get(d180Var);
                c180 c180VarR = weakReference != null ? (c180) weakReference.get() : null;
                if (c180VarR == null) {
                    XmlResourceParser xml = resources.getXml(i);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!u890.j(xml.getName(), "vector")) {
                        hhg1.n("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return null;
                    }
                    c180VarR = cyo1.r(theme2, resources, xml, i3);
                    e180Var.a.put(d180Var, new WeakReference(c180VarR));
                }
                dui1 dui1VarS = byo1.s(c180VarR.a, x340Var);
                x340Var.r(false);
                return dui1VarS;
            }

            public static final dam o(ContextTrack contextTrack) {
                if (contextTrack != null) {
                    if (l4o1.Y(contextTrack)) {
                        return y9m.a;
                    }
                    if (l4o1.P(contextTrack) && l4o1.F(contextTrack)) {
                        return q9m.a;
                    }
                    if (l4o1.G(contextTrack)) {
                        return r9m.a;
                    }
                    Set set = s4b1.f;
                    if (uic.x(contextTrack.uri()).c == blc0.ti) {
                        return w9m.a;
                    }
                    if (l4o1.O(contextTrack)) {
                        return v9m.a;
                    }
                }
                return x9m.a;
            }

            public static final ily0 p(kwh0 kwh0Var, String str) {
                boolean zY = nhc1.Y(((ComponentName) kwh0Var.d.b).getPackageName(), str, false);
                owh0.b();
                List<lwh0> listUnmodifiableList = Collections.unmodifiableList(kwh0Var.b);
                ArrayList arrayList = new ArrayList(q7h.U(listUnmodifiableList, 10));
                for (lwh0 lwh0Var : listUnmodifiableList) {
                    lwh0Var.getClass();
                    arrayList.add(e130.v(lwh0Var, str));
                }
                return new ily0(arrayList, kwh0Var, zY);
            }

            public static boolean q(byte b2) {
                return b2 > -65;
            }
        }
