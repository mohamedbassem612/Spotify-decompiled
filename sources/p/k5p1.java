package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.Timestamp;
import com.spotify.playlistediting.history.apiimpl.proto.AttributeChanged;
import com.spotify.playlistediting.history.apiimpl.proto.CustomTransitionChanged;
import com.spotify.playlistediting.history.apiimpl.proto.HistoryEntry;
import com.spotify.playlistediting.history.apiimpl.proto.Item;
import com.spotify.playlistediting.history.apiimpl.proto.ItemsChanged;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class k5p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1346762713);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("add-different-account-row", nim0.a), uvx.b((uvx) b0kVar3.k(vvx.a), 0, (tvx) null, new p3v(64.0f), 15), null, false, null, null, new gbx(z50.c, function0), null, null, e4i.a, null, null, null, null, null, e4i.b, b0kVar2, 805306438, 196608, 32188);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 2);
        }
    }

    public static final void b(o8d1 o8d1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1641969950);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(o8d1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(nim0.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            tho1.l(o8d1Var.b, o8d1Var.c, function1, apo.r(-162327007, new qff(o8d1Var, (byte) 16), x340Var), x340Var, (i2 & 896) | 24576 | ((i2 << 6) & 7168));
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(o8d1Var, function1, i);
        }
    }

    public static final void c(c380 c380Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-717469369);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            if (c380Var.contains(ell.d)) {
                i3 = 1;
            } else if (!c380Var.contains(ell.b)) {
                i3 = 0;
            }
            if (i3 != 0) {
                x340Var.i0(1922439154);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                kqn1.d(i3, 0, 0, x340Var, uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                x340Var.r(false);
            } else {
                x340Var.i0(1922663067);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) c380Var, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void d(qim0 qim0Var, c36 c36Var, g36 g36Var, pl3 pl3Var, int i, int i2, final j2i j2iVar, b0k b0kVar, final int i3, final int i4) {
        final qim0 qim0Var2;
        int i5;
        c36 c36Var2;
        int i6;
        g36 g36Var2;
        int i7;
        int i8;
        pl3 pl3Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        j2i j2iVar2;
        boolean z;
        final c36 c36Var3;
        final g36 g36Var3;
        final pl3 pl3Var3;
        final int i14;
        final int i15;
        h311 h311VarV;
        qim0 qim0Var3;
        c36 c36Var4;
        pl3 pl3Var4;
        int i16;
        int i17;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1303174015);
        int i18 = i4 & 1;
        if (i18 != 0) {
            i5 = i3 | 6;
            qim0Var2 = qim0Var;
        } else if ((i3 & 6) == 0) {
            qim0Var2 = qim0Var;
            i5 = (x340Var.g(qim0Var2) ? 4 : 2) | i3;
        } else {
            qim0Var2 = qim0Var;
            i5 = i3;
        }
        int i19 = i4 & 2;
        if (i19 == 0) {
            if ((i3 & 48) == 0) {
                c36Var2 = c36Var;
                i5 |= x340Var.g(c36Var2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    g36Var2 = g36Var;
                    if (x340Var.g(g36Var2)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        pl3Var2 = pl3Var;
                        if (x340Var.g(pl3Var2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((i3 & 24576) == 0) {
                            i11 = i;
                            if (x340Var.e(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        i13 = i5 | 196608;
                        if ((i3 & 1572864) == 0) {
                            j2iVar2 = j2iVar;
                            if (x340Var.i(j2iVar2)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i13 |= i17;
                        } else {
                            j2iVar2 = j2iVar;
                        }
                        if ((599187 & i13) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i13 & 1, z)) {
                            if (i18 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i19 != 0) {
                                c36Var4 = h36.a;
                            } else {
                                c36Var4 = c36Var2;
                            }
                            if (i6 != 0) {
                                g36Var2 = h36.c;
                            }
                            if (i8 != 0) {
                                pl3Var4 = een.Z;
                            } else {
                                pl3Var4 = pl3Var2;
                            }
                            if (i10 != 0) {
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i16 = i11;
                            }
                            g36 g36Var4 = g36Var2;
                            e(qim0Var3, c36Var4, g36Var4, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                            i14 = i16;
                            pl3Var3 = pl3Var4;
                            g36Var3 = g36Var4;
                            c36Var3 = c36Var4;
                            qim0Var2 = qim0Var3;
                            i15 = Integer.MAX_VALUE;
                        } else {
                            x340Var.b0();
                            c36Var3 = c36Var2;
                            g36Var3 = g36Var2;
                            pl3Var3 = pl3Var2;
                            i14 = i11;
                            i15 = i2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu30() { // from class: p.ev20
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                                    return rih1.a;
                                }
                            };
                        }
                    }
                    i5 |= 24576;
                    i11 = i;
                    i13 = i5 | 196608;
                    if ((i3 & 1572864) == 0) {
                        j2iVar2 = j2iVar;
                        if (x340Var.i(j2iVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i13 |= i17;
                    } else {
                        j2iVar2 = j2iVar;
                    }
                    if ((599187 & i13) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i13 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i19 != 0) {
                            c36Var4 = h36.a;
                        } else {
                            c36Var4 = c36Var2;
                        }
                        if (i6 != 0) {
                            g36Var2 = h36.c;
                        }
                        if (i8 != 0) {
                            pl3Var4 = een.Z;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if (i10 != 0) {
                            i16 = Integer.MAX_VALUE;
                        } else {
                            i16 = i11;
                        }
                        g36 g36Var5 = g36Var2;
                        e(qim0Var3, c36Var4, g36Var5, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                        i14 = i16;
                        pl3Var3 = pl3Var4;
                        g36Var3 = g36Var5;
                        c36Var3 = c36Var4;
                        qim0Var2 = qim0Var3;
                        i15 = Integer.MAX_VALUE;
                    } else {
                        x340Var.b0();
                        c36Var3 = c36Var2;
                        g36Var3 = g36Var2;
                        pl3Var3 = pl3Var2;
                        i14 = i11;
                        i15 = i2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ev20
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                                return rih1.a;
                            }
                        };
                    }
                }
                i5 |= 3072;
                pl3Var2 = pl3Var;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (x340Var.e(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i5 | 196608;
                    if ((i3 & 1572864) == 0) {
                        j2iVar2 = j2iVar;
                        if (x340Var.i(j2iVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i13 |= i17;
                    } else {
                        j2iVar2 = j2iVar;
                    }
                    if ((599187 & i13) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i13 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i19 != 0) {
                            c36Var4 = h36.a;
                        } else {
                            c36Var4 = c36Var2;
                        }
                        if (i6 != 0) {
                            g36Var2 = h36.c;
                        }
                        if (i8 != 0) {
                            pl3Var4 = een.Z;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if (i10 != 0) {
                            i16 = Integer.MAX_VALUE;
                        } else {
                            i16 = i11;
                        }
                        g36 g36Var6 = g36Var2;
                        e(qim0Var3, c36Var4, g36Var6, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                        i14 = i16;
                        pl3Var3 = pl3Var4;
                        g36Var3 = g36Var6;
                        c36Var3 = c36Var4;
                        qim0Var2 = qim0Var3;
                        i15 = Integer.MAX_VALUE;
                    } else {
                        x340Var.b0();
                        c36Var3 = c36Var2;
                        g36Var3 = g36Var2;
                        pl3Var3 = pl3Var2;
                        i14 = i11;
                        i15 = i2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ev20
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                                return rih1.a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i5 | 196608;
                if ((i3 & 1572864) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i13) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i13 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i19 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if (i6 != 0) {
                        g36Var2 = h36.c;
                    }
                    if (i8 != 0) {
                        pl3Var4 = een.Z;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if (i10 != 0) {
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i11;
                    }
                    g36 g36Var7 = g36Var2;
                    e(qim0Var3, c36Var4, g36Var7, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                    i14 = i16;
                    pl3Var3 = pl3Var4;
                    g36Var3 = g36Var7;
                    c36Var3 = c36Var4;
                    qim0Var2 = qim0Var3;
                    i15 = Integer.MAX_VALUE;
                } else {
                    x340Var.b0();
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                    pl3Var3 = pl3Var2;
                    i14 = i11;
                    i15 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ev20
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 384;
            g36Var2 = g36Var;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    pl3Var2 = pl3Var;
                    if (x340Var.g(pl3Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (x340Var.e(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i5 | 196608;
                    if ((i3 & 1572864) == 0) {
                        j2iVar2 = j2iVar;
                        if (x340Var.i(j2iVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i13 |= i17;
                    } else {
                        j2iVar2 = j2iVar;
                    }
                    if ((599187 & i13) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i13 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i19 != 0) {
                            c36Var4 = h36.a;
                        } else {
                            c36Var4 = c36Var2;
                        }
                        if (i6 != 0) {
                            g36Var2 = h36.c;
                        }
                        if (i8 != 0) {
                            pl3Var4 = een.Z;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if (i10 != 0) {
                            i16 = Integer.MAX_VALUE;
                        } else {
                            i16 = i11;
                        }
                        g36 g36Var8 = g36Var2;
                        e(qim0Var3, c36Var4, g36Var8, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                        i14 = i16;
                        pl3Var3 = pl3Var4;
                        g36Var3 = g36Var8;
                        c36Var3 = c36Var4;
                        qim0Var2 = qim0Var3;
                        i15 = Integer.MAX_VALUE;
                    } else {
                        x340Var.b0();
                        c36Var3 = c36Var2;
                        g36Var3 = g36Var2;
                        pl3Var3 = pl3Var2;
                        i14 = i11;
                        i15 = i2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ev20
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                                return rih1.a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i5 | 196608;
                if ((i3 & 1572864) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i13) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i13 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i19 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if (i6 != 0) {
                        g36Var2 = h36.c;
                    }
                    if (i8 != 0) {
                        pl3Var4 = een.Z;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if (i10 != 0) {
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i11;
                    }
                    g36 g36Var9 = g36Var2;
                    e(qim0Var3, c36Var4, g36Var9, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                    i14 = i16;
                    pl3Var3 = pl3Var4;
                    g36Var3 = g36Var9;
                    c36Var3 = c36Var4;
                    qim0Var2 = qim0Var3;
                    i15 = Integer.MAX_VALUE;
                } else {
                    x340Var.b0();
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                    pl3Var3 = pl3Var2;
                    i14 = i11;
                    i15 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ev20
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 3072;
            pl3Var2 = pl3Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (x340Var.e(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i5 | 196608;
                if ((i3 & 1572864) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i13) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i13 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i19 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if (i6 != 0) {
                        g36Var2 = h36.c;
                    }
                    if (i8 != 0) {
                        pl3Var4 = een.Z;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if (i10 != 0) {
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i11;
                    }
                    g36 g36Var10 = g36Var2;
                    e(qim0Var3, c36Var4, g36Var10, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                    i14 = i16;
                    pl3Var3 = pl3Var4;
                    g36Var3 = g36Var10;
                    c36Var3 = c36Var4;
                    qim0Var2 = qim0Var3;
                    i15 = Integer.MAX_VALUE;
                } else {
                    x340Var.b0();
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                    pl3Var3 = pl3Var2;
                    i14 = i11;
                    i15 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ev20
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i5 | 196608;
            if ((i3 & 1572864) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((599187 & i13) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i13 & 1, z)) {
                if (i18 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i19 != 0) {
                    c36Var4 = h36.a;
                } else {
                    c36Var4 = c36Var2;
                }
                if (i6 != 0) {
                    g36Var2 = h36.c;
                }
                if (i8 != 0) {
                    pl3Var4 = een.Z;
                } else {
                    pl3Var4 = pl3Var2;
                }
                if (i10 != 0) {
                    i16 = Integer.MAX_VALUE;
                } else {
                    i16 = i11;
                }
                g36 g36Var11 = g36Var2;
                e(qim0Var3, c36Var4, g36Var11, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                i14 = i16;
                pl3Var3 = pl3Var4;
                g36Var3 = g36Var11;
                c36Var3 = c36Var4;
                qim0Var2 = qim0Var3;
                i15 = Integer.MAX_VALUE;
            } else {
                x340Var.b0();
                c36Var3 = c36Var2;
                g36Var3 = g36Var2;
                pl3Var3 = pl3Var2;
                i14 = i11;
                i15 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ev20
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                        return rih1.a;
                    }
                };
            }
        }
        i5 |= 48;
        c36Var2 = c36Var;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                g36Var2 = g36Var;
                if (x340Var.g(g36Var2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    pl3Var2 = pl3Var;
                    if (x340Var.g(pl3Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        i11 = i;
                        if (x340Var.e(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i5 | 196608;
                    if ((i3 & 1572864) == 0) {
                        j2iVar2 = j2iVar;
                        if (x340Var.i(j2iVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i13 |= i17;
                    } else {
                        j2iVar2 = j2iVar;
                    }
                    if ((599187 & i13) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i13 & 1, z)) {
                        if (i18 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i19 != 0) {
                            c36Var4 = h36.a;
                        } else {
                            c36Var4 = c36Var2;
                        }
                        if (i6 != 0) {
                            g36Var2 = h36.c;
                        }
                        if (i8 != 0) {
                            pl3Var4 = een.Z;
                        } else {
                            pl3Var4 = pl3Var2;
                        }
                        if (i10 != 0) {
                            i16 = Integer.MAX_VALUE;
                        } else {
                            i16 = i11;
                        }
                        g36 g36Var12 = g36Var2;
                        e(qim0Var3, c36Var4, g36Var12, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                        i14 = i16;
                        pl3Var3 = pl3Var4;
                        g36Var3 = g36Var12;
                        c36Var3 = c36Var4;
                        qim0Var2 = qim0Var3;
                        i15 = Integer.MAX_VALUE;
                    } else {
                        x340Var.b0();
                        c36Var3 = c36Var2;
                        g36Var3 = g36Var2;
                        pl3Var3 = pl3Var2;
                        i14 = i11;
                        i15 = i2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ev20
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                                return rih1.a;
                            }
                        };
                    }
                }
                i5 |= 24576;
                i11 = i;
                i13 = i5 | 196608;
                if ((i3 & 1572864) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i13) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i13 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i19 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if (i6 != 0) {
                        g36Var2 = h36.c;
                    }
                    if (i8 != 0) {
                        pl3Var4 = een.Z;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if (i10 != 0) {
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i11;
                    }
                    g36 g36Var13 = g36Var2;
                    e(qim0Var3, c36Var4, g36Var13, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                    i14 = i16;
                    pl3Var3 = pl3Var4;
                    g36Var3 = g36Var13;
                    c36Var3 = c36Var4;
                    qim0Var2 = qim0Var3;
                    i15 = Integer.MAX_VALUE;
                } else {
                    x340Var.b0();
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                    pl3Var3 = pl3Var2;
                    i14 = i11;
                    i15 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ev20
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 3072;
            pl3Var2 = pl3Var;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (x340Var.e(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i5 | 196608;
                if ((i3 & 1572864) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i13) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i13 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i19 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if (i6 != 0) {
                        g36Var2 = h36.c;
                    }
                    if (i8 != 0) {
                        pl3Var4 = een.Z;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if (i10 != 0) {
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i11;
                    }
                    g36 g36Var14 = g36Var2;
                    e(qim0Var3, c36Var4, g36Var14, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                    i14 = i16;
                    pl3Var3 = pl3Var4;
                    g36Var3 = g36Var14;
                    c36Var3 = c36Var4;
                    qim0Var2 = qim0Var3;
                    i15 = Integer.MAX_VALUE;
                } else {
                    x340Var.b0();
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                    pl3Var3 = pl3Var2;
                    i14 = i11;
                    i15 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ev20
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i5 | 196608;
            if ((i3 & 1572864) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((599187 & i13) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i13 & 1, z)) {
                if (i18 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i19 != 0) {
                    c36Var4 = h36.a;
                } else {
                    c36Var4 = c36Var2;
                }
                if (i6 != 0) {
                    g36Var2 = h36.c;
                }
                if (i8 != 0) {
                    pl3Var4 = een.Z;
                } else {
                    pl3Var4 = pl3Var2;
                }
                if (i10 != 0) {
                    i16 = Integer.MAX_VALUE;
                } else {
                    i16 = i11;
                }
                g36 g36Var15 = g36Var2;
                e(qim0Var3, c36Var4, g36Var15, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                i14 = i16;
                pl3Var3 = pl3Var4;
                g36Var3 = g36Var15;
                c36Var3 = c36Var4;
                qim0Var2 = qim0Var3;
                i15 = Integer.MAX_VALUE;
            } else {
                x340Var.b0();
                c36Var3 = c36Var2;
                g36Var3 = g36Var2;
                pl3Var3 = pl3Var2;
                i14 = i11;
                i15 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ev20
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                        return rih1.a;
                    }
                };
            }
        }
        i5 |= 384;
        g36Var2 = g36Var;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                pl3Var2 = pl3Var;
                if (x340Var.g(pl3Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    i11 = i;
                    if (x340Var.e(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i5 | 196608;
                if ((i3 & 1572864) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i13) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i13 & 1, z)) {
                    if (i18 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i19 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if (i6 != 0) {
                        g36Var2 = h36.c;
                    }
                    if (i8 != 0) {
                        pl3Var4 = een.Z;
                    } else {
                        pl3Var4 = pl3Var2;
                    }
                    if (i10 != 0) {
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i11;
                    }
                    g36 g36Var16 = g36Var2;
                    e(qim0Var3, c36Var4, g36Var16, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                    i14 = i16;
                    pl3Var3 = pl3Var4;
                    g36Var3 = g36Var16;
                    c36Var3 = c36Var4;
                    qim0Var2 = qim0Var3;
                    i15 = Integer.MAX_VALUE;
                } else {
                    x340Var.b0();
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                    pl3Var3 = pl3Var2;
                    i14 = i11;
                    i15 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ev20
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                            return rih1.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            i11 = i;
            i13 = i5 | 196608;
            if ((i3 & 1572864) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((599187 & i13) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i13 & 1, z)) {
                if (i18 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i19 != 0) {
                    c36Var4 = h36.a;
                } else {
                    c36Var4 = c36Var2;
                }
                if (i6 != 0) {
                    g36Var2 = h36.c;
                }
                if (i8 != 0) {
                    pl3Var4 = een.Z;
                } else {
                    pl3Var4 = pl3Var2;
                }
                if (i10 != 0) {
                    i16 = Integer.MAX_VALUE;
                } else {
                    i16 = i11;
                }
                g36 g36Var17 = g36Var2;
                e(qim0Var3, c36Var4, g36Var17, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                i14 = i16;
                pl3Var3 = pl3Var4;
                g36Var3 = g36Var17;
                c36Var3 = c36Var4;
                qim0Var2 = qim0Var3;
                i15 = Integer.MAX_VALUE;
            } else {
                x340Var.b0();
                c36Var3 = c36Var2;
                g36Var3 = g36Var2;
                pl3Var3 = pl3Var2;
                i14 = i11;
                i15 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ev20
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                        return rih1.a;
                    }
                };
            }
        }
        i5 |= 3072;
        pl3Var2 = pl3Var;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                i11 = i;
                if (x340Var.e(i11)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            i13 = i5 | 196608;
            if ((i3 & 1572864) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((599187 & i13) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i13 & 1, z)) {
                if (i18 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i19 != 0) {
                    c36Var4 = h36.a;
                } else {
                    c36Var4 = c36Var2;
                }
                if (i6 != 0) {
                    g36Var2 = h36.c;
                }
                if (i8 != 0) {
                    pl3Var4 = een.Z;
                } else {
                    pl3Var4 = pl3Var2;
                }
                if (i10 != 0) {
                    i16 = Integer.MAX_VALUE;
                } else {
                    i16 = i11;
                }
                g36 g36Var18 = g36Var2;
                e(qim0Var3, c36Var4, g36Var18, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
                i14 = i16;
                pl3Var3 = pl3Var4;
                g36Var3 = g36Var18;
                c36Var3 = c36Var4;
                qim0Var2 = qim0Var3;
                i15 = Integer.MAX_VALUE;
            } else {
                x340Var.b0();
                c36Var3 = c36Var2;
                g36Var3 = g36Var2;
                pl3Var3 = pl3Var2;
                i14 = i11;
                i15 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ev20
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                        return rih1.a;
                    }
                };
            }
        }
        i5 |= 24576;
        i11 = i;
        i13 = i5 | 196608;
        if ((i3 & 1572864) == 0) {
            j2iVar2 = j2iVar;
            if (x340Var.i(j2iVar2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i13 |= i17;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i13 & 1, z)) {
            if (i18 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            if (i19 != 0) {
                c36Var4 = h36.a;
            } else {
                c36Var4 = c36Var2;
            }
            if (i6 != 0) {
                g36Var2 = h36.c;
            }
            if (i8 != 0) {
                pl3Var4 = een.Z;
            } else {
                pl3Var4 = pl3Var2;
            }
            if (i10 != 0) {
                i16 = Integer.MAX_VALUE;
            } else {
                i16 = i11;
            }
            g36 g36Var19 = g36Var2;
            e(qim0Var3, c36Var4, g36Var19, pl3Var4, i16, j2iVar2, x340Var, ((i13 << 3) & 29360128) | (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13));
            i14 = i16;
            pl3Var3 = pl3Var4;
            g36Var3 = g36Var19;
            c36Var3 = c36Var4;
            qim0Var2 = qim0Var3;
            i15 = Integer.MAX_VALUE;
        } else {
            x340Var.b0();
            c36Var3 = c36Var2;
            g36Var3 = g36Var2;
            pl3Var3 = pl3Var2;
            i14 = i11;
            i15 = i2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ev20
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k5p1.d(qim0Var2, c36Var3, g36Var3, pl3Var3, i14, i15, j2iVar, (b0k) obj, czo1.p(i3 | 1), i4);
                    return rih1.a;
                }
            };
        }
    }

    public static final void e(final qim0 qim0Var, final c36 c36Var, final g36 g36Var, final pl3 pl3Var, final int i, final j2i j2iVar, b0k b0kVar, final int i2) {
        int i3;
        dj10 dj10Var = dj10.c;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(c36Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(g36Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.g(pl3Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.g(dj10Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= x340Var.i(j2iVar) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = new iv20();
                x340Var.s0(objT);
            }
            iv20 iv20Var = (iv20) objT;
            int i6 = i4 >> 3;
            boolean zG = ((((57344 & i6) ^ 24576) > 16384 && x340Var.e(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | ((((i6 & 14) ^ 6) > 4 && x340Var.g(c36Var)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && x340Var.g(g36Var)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && x340Var.g(pl3Var)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && x340Var.e(i)) || (i6 & 3072) == 2048) | x340Var.g(iv20Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                kv20 kv20Var = new kv20(c36Var, g36Var, c36Var.a(), new n8o(pl3Var), g36Var.a(), i, iv20Var);
                x340Var.s0(kv20Var);
                objT2 = kv20Var;
            }
            kv20 kv20Var2 = (kv20) objT2;
            boolean z2 = (i5 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object objT3 = x340Var.T();
            Object obj2 = objT3;
            if (z2 || objT3 == obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new j2i(-1192950673, new ai3(j2iVar), true));
                l1d.C(2);
                x340Var.s0(arrayList);
                obj2 = arrayList;
            }
            j2i j2iVarQ = who1.q((List) obj2);
            boolean zG2 = x340Var.g(kv20Var2);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                objT4 = new mqm0(kv20Var2);
                x340Var.s0(objT4);
            }
            gfh0 gfh0Var = (gfh0) objT4;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(0, j2iVarQ, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.fv20
                {
                    dj10 dj10Var2 = dj10.c;
                }

                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    k5p1.e(qim0Var, c36Var, g36Var, pl3Var, i, j2iVar, (b0k) obj3, czo1.p(i2 | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1340173492);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            float fM = dsa0.m(x340Var, 2131165563);
            if (f > fM) {
                f = fM;
            }
            uwr uwrVar = cbx.a;
            float f2 = f - cbx.b(x340Var).b.c;
            dz61 dz61Var = dz61.d;
            float f3 = ((ez61) dz61Var).a;
            float f4 = e130.d * f3;
            if (f4 <= f2) {
                f2 = f4;
            }
            float f5 = (f - f2) / 2.0f;
            qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), f2 / f3);
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            zzq0 zzq0VarJ = uyn1.j(f5, 0.0f, f5, 0.0f, 10);
            boolean zI = x340Var.i(dz61Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new l6d0(dz61Var, (byte) 20);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarH, null, zzq0VarJ, d36Var, null, null, false, null, (iu30) objT, x340Var, 12582912, 362);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 25);
        }
    }

    public static final void g(int i, b0k b0kVar, int i2) {
        h311 h311VarV;
        vx1 vx1Var;
        x340 x340Var = (x340) b0kVar;
        byte b2 = 4;
        int i3 = (kk0.t(-442141663, i, x340Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i == 1) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    vx1Var = new vx1((byte) 3, i, i2);
                }
            } else {
                y1a1.e(true, anm1.N("standard_badges_video_badge", nim0.a), apo.r(-1224283474, new vx1(i, b2), x340Var), x340Var, 390, 0);
            }
            h311VarV.d = vx1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            vx1Var = new vx1((byte) 5, i, i2);
            h311VarV.d = vx1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0061  */
    /* JADX WARN: Code duplicated, block: B:44:0x0065  */
    /* JADX WARN: Code duplicated, block: B:56:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x007c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0080  */
    /* JADX WARN: Code duplicated, block: B:60:0x0082  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    public static final void h(fbp1 fbp1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2126502759);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fbp1Var) : x340Var.i(fbp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = fbp1Var instanceof mwp0;
            if (z) {
                x340Var.i0(124038666);
                if (!z) {
                    if (!(fbp1Var instanceof uwp0)) {
                        i3 = 1;
                    } else if (fbp1Var instanceof kwp0) {
                        i3 = 2;
                    } else if (fbp1Var instanceof iwp0) {
                        i3 = 3;
                    } else {
                        if (!(fbp1Var instanceof swp0)) {
                            eg.o();
                            return;
                        }
                        i3 = 1;
                    }
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                acq0.e(i3, 0, x340Var, uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                x340Var.r(false);
            } else {
                if (!(fbp1Var instanceof uwp0)) {
                    if (!(fbp1Var instanceof wwp0)) {
                        if (!(fbp1Var instanceof qwp0) && !(fbp1Var instanceof owp0)) {
                            if (!(fbp1Var instanceof kwp0) && !(fbp1Var instanceof iwp0)) {
                                if (!(fbp1Var instanceof swp0)) {
                                    eg.o();
                                    return;
                                }
                            }
                        }
                    }
                    x340Var.i0(124038666);
                    if (!z) {
                        if (!(fbp1Var instanceof uwp0) || (fbp1Var instanceof qwp0) || (fbp1Var instanceof wwp0) || (fbp1Var instanceof owp0)) {
                            i3 = 1;
                        } else if (fbp1Var instanceof kwp0) {
                            i3 = 2;
                        } else if (fbp1Var instanceof iwp0) {
                            i3 = 3;
                        } else {
                            if (!(fbp1Var instanceof swp0)) {
                                eg.o();
                                return;
                            }
                            i3 = 1;
                        }
                    }
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    acq0.e(i3, 0, x340Var, uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                    x340Var.r(false);
                }
                x340Var.i0(124714249);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) fbp1Var, i, (byte) 6);
        }
    }

    public static final void i(boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-447933177);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(86170761);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            xap1.f(0, 0, x340Var, uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11));
            x340Var.r(false);
        } else {
            x340Var.i0(86249563);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m3a(i, z);
        }
    }

    public static final void j(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1275005755);
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | (b0kVar2.i(qim0Var) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
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
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            op71.g(b0kVar2, u291.v(nim0Var, 16.0f));
            uwo1.e(cwl1.o0(b0kVar2, 2131963787), new wnb0(1.0f, true), cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1720);
            b0kVar2 = b0kVar2;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 16.0f));
            String strO0 = cwl1.o0(b0kVar2, z ? 2131963785 : 2131963791);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strO0);
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar2.T();
            if (z2 || objT == fkj0.X) {
                objT = new tpj1(function0, (byte) 5);
                b0kVar2.s0(objT);
            }
            foo1.h(new gbx(y50Var, (Function0) objT), null, null, yla.s(b0kVar2), null, null, apo.r(451513345, new ov51((byte) 7, z), b0kVar2), b0kVar2, 12582912, 118);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 22);
        }
    }

    public static final void k(nd41 nd41Var, Object obj) {
        String strM;
        if (obj == null || nd41Var.d(obj)) {
            return;
        }
        if (obj instanceof uv91) {
            uv91 uv91Var = (uv91) obj;
            strM = (uv91Var.g() == f331.X0 || uv91Var.g() == kcx0.R0 || uv91Var.g() == c4x0.f) ? cy30.m("MutableState containing ", uv91Var.getValue(), " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().") : "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
        } else {
            strM = m(obj);
        }
        throw new IllegalArgumentException(strM);
    }

    public static final float l(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static final String m(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ArrayList o(ItemsChanged itemsChanged) {
        List itemsList = itemsChanged.getItemsList();
        ArrayList arrayList = new ArrayList();
        Iterator it = itemsList.iterator();
        while (it.hasNext()) {
            String uri = ((Item) it.next()).n().getUri();
            if (uri.length() == 0) {
                uri = null;
            }
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public static final io80 p(klm klmVar, ldp0 ldp0Var) {
        return klmVar.b("VideoFileProviderService", new mcp0(ldp0Var, (byte) 24));
    }

    public static final long q(afh0 afh0Var, kv20 kv20Var, long j, iu30 iu30Var) {
        cv20 cv20Var;
        if (x760.v(x760.t(afh0Var)) == 0.0f) {
            it31 it31VarT = x760.t(afh0Var);
            if (((it31VarT == null || (cv20Var = it31VarT.d) == null) ? null : Float.valueOf(cv20Var.a)) == null) {
                q5t0 q5t0VarH = afh0Var.H(j);
                iu30Var.invoke(q5t0VarH);
                return jr80.a(q5t0VarH.Y(), q5t0VarH.X());
            }
        }
        int iW = afh0Var.w(Integer.MAX_VALUE);
        return jr80.a(iW, afh0Var.n(iW));
    }

    public static dsk0 r() {
        return new dsk0((byte) 3);
    }

    public static final Object s(Object[] objArr, Function0 function0, b0k b0kVar, int i) {
        return t(Arrays.copyOf(objArr, objArr.length), j2h1.b, null, function0, b0kVar, ((i << 6) & 7168) | 384, 0);
    }

    public static final Object t(Object[] objArr, cf41 cf41Var, String str, Function0 function0, b0k b0kVar, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object objF;
        if ((i2 & 2) != 0) {
            cf41Var = j2h1.b;
        }
        cf41 cf41Var2 = cf41Var;
        if ((i2 & 4) != 0) {
            str = null;
        }
        x340 x340Var = (x340) b0kVar;
        long j = x340Var.T;
        if (str == null || str.length() == 0) {
            eth.h(36);
            str = Long.toString(j, 36);
        }
        String str2 = str;
        nd41 nd41Var = (nd41) x340Var.k(pd41.a);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            Object objA = (nd41Var == null || (objF = nd41Var.f(str2)) == null) ? null : cf41Var2.a(objF);
            if (objA == null) {
                objA = function0.invoke();
            }
            objArr2 = objArr;
            id41 id41Var = new id41(cf41Var2, nd41Var, str2, objA, objArr2);
            x340Var.s0(id41Var);
            objT = id41Var;
        } else {
            objArr2 = objArr;
        }
        id41 id41Var2 = (id41) objT;
        Object objInvoke = Arrays.equals(objArr2, id41Var2.e) ? id41Var2.d : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zI = x340Var.i(id41Var2) | ((((i & 112) ^ 48) > 32 && x340Var.i(cf41Var2)) || (i & 48) == 32) | x340Var.i(nd41Var) | x340Var.g(str2) | x340Var.i(objInvoke) | x340Var.i(objArr2);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            ly11 ly11Var = new ly11(id41Var2, cf41Var2, nd41Var, str2, obj, objArr3);
            x340Var.s0(ly11Var);
            objT2 = ly11Var;
        } else {
            obj = objInvoke;
        }
        qxd0.S((Function0) objT2, x340Var);
        return obj;
    }

    public static final Object u(Object[] objArr, cf41 cf41Var, Function0 function0, b0k b0kVar, int i) {
        return t(Arrays.copyOf(objArr, objArr.length), cf41Var, null, function0, b0kVar, (i & 112) | 384 | ((i << 3) & 7168), 0);
    }

    public static final ven0 v(Object[] objArr, cf41 cf41Var, Function0 function0, b0k b0kVar, int i) {
        return (ven0) t(Arrays.copyOf(objArr, objArr.length), new df41(new waq0(cf41Var, (byte) 7), new w9(cf41Var, (byte) 19)), null, function0, b0kVar, ((i << 3) & 7168) | 384, 0);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x028a  */
    /* JADX WARN: Code duplicated, block: B:143:0x029d  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    public static final sj60 w(HistoryEntry historyEntry, boolean z) {
        xi60 ui60Var;
        xi60 yi60Var;
        xi60 wi60Var;
        String uri;
        String strN;
        bh60 ah60Var;
        int i;
        int i2;
        Long lValueOf;
        if (historyEntry.hasKey() && !historyEntry.p().isEmpty() && (z || !historyEntry.n().isEmpty())) {
            if (historyEntry.q().t()) {
                if (historyEntry.q().q().p()) {
                    Timestamp timestampO = historyEntry.q().q().o();
                    lValueOf = Long.valueOf((timestampO.q() * 1000) + ((long) (timestampO.p() / 1000000)));
                } else {
                    lValueOf = null;
                }
                wi60Var = new xi60(lValueOf);
            } else {
                boolean zHasCreationInfo = historyEntry.q().hasCreationInfo();
                ti90 ti90Var = ti90.c;
                if (zHasCreationInfo) {
                    String originUri = (historyEntry.q().o().o() != gsn.d || historyEntry.q().o().getOriginUri().length() <= 0) ? null : historyEntry.q().o().getOriginUri();
                    ItemsChanged itemsChangedQ = historyEntry.o().q();
                    if (!historyEntry.o().u() || itemsChangedQ.p() != ti90Var) {
                        itemsChangedQ = null;
                    }
                    int iN = itemsChangedQ != null ? itemsChangedQ.n() : 0;
                    ArrayList arrayListO = itemsChangedQ != null ? o(itemsChangedQ) : null;
                    if (arrayListO == null) {
                        arrayListO = z6x.a;
                    }
                    ui60Var = new ui60(originUri, arrayListO, iN);
                } else {
                    ui60Var = null;
                }
                if (ui60Var == null) {
                    if (historyEntry.o().u()) {
                        ItemsChanged itemsChangedQ2 = historyEntry.o().q();
                        yi60Var = new yi60(itemsChangedQ2.p() == ti90Var ? itemsChangedQ2.n() : 0, itemsChangedQ2.p() == ti90.d ? itemsChangedQ2.n() : 0, itemsChangedQ2.p() == ti90.e ? itemsChangedQ2.n() : 0, o(itemsChangedQ2));
                    } else {
                        boolean zT = historyEntry.o().t();
                        int i3 = 3;
                        yi60Var = ti60.a;
                        if (zT) {
                            CustomTransitionChanged customTransitionChangedO = historyEntry.o().o();
                            int i4 = vmu0.a[customTransitionChangedO.q().ordinal()];
                            if (i4 == 1) {
                                i3 = 1;
                            } else if (i4 == 2) {
                                i3 = 2;
                            } else if (i4 != 3) {
                            }
                            String uri2 = customTransitionChangedO.o().n().getUri();
                            if (uri2.length() == 0) {
                                uri2 = null;
                            }
                            if (uri2 == null) {
                                ui60Var = null;
                            } else {
                                if (customTransitionChangedO.r()) {
                                    uri = customTransitionChangedO.p().n().getUri();
                                    if (uri.length() == 0) {
                                        uri = null;
                                    }
                                } else {
                                    uri = null;
                                }
                                ui60Var = new vi60(i3, uri2, uri);
                            }
                        } else if (historyEntry.o().v()) {
                            int i5 = vmu0.b[historyEntry.o().r().o().ordinal()];
                            if (i5 == 1) {
                                wi60Var = new wi60(true);
                            } else if (i5 == 2) {
                                wi60Var = new wi60(false);
                            }
                        } else if (historyEntry.o().s()) {
                            AttributeChanged attributeChangedN = historyEntry.o().n();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            boolean zQ = attributeChangedN.q();
                            dm7 dm7Var = dm7.f;
                            dm7 dm7Var2 = dm7.e;
                            dm7 dm7Var3 = dm7.d;
                            dm7 dm7Var4 = dm7.c;
                            if (zQ) {
                                if (attributeChangedN.p().hasName()) {
                                    linkedHashSet.add(dm7Var4);
                                }
                                if (attributeChangedN.p().hasDescription()) {
                                    linkedHashSet.add(dm7Var3);
                                }
                                if (attributeChangedN.p().p()) {
                                    linkedHashSet.add(dm7Var2);
                                }
                                if (!attributeChangedN.p().o().isEmpty()) {
                                    linkedHashSet.add(dm7Var);
                                }
                            }
                            linkedHashSet.addAll(attributeChangedN.n());
                            if (!linkedHashSet.isEmpty()) {
                                Set setS0 = f46.S0(new dm7[]{dm7Var2, dm7Var});
                                if (!linkedHashSet.isEmpty()) {
                                    Iterator it = linkedHashSet.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i3 = 1;
                                            break;
                                        }
                                        if (((dm7) it.next()) != dm7Var4) {
                                            if (!linkedHashSet.isEmpty()) {
                                                Iterator it2 = linkedHashSet.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        i3 = 2;
                                                        break;
                                                    }
                                                    if (((dm7) it2.next()) != dm7Var3) {
                                                        if (!linkedHashSet.isEmpty()) {
                                                            Iterator it3 = linkedHashSet.iterator();
                                                            while (it3.hasNext()) {
                                                                if (!setS0.contains((dm7) it3.next())) {
                                                                    i3 = 4;
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i3 = 2;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    i3 = 1;
                                    break;
                                }
                            } else {
                                i3 = 4;
                                break;
                            }
                            ui60Var = new si60(i3);
                        }
                    }
                    ui60Var = yi60Var;
                }
                if (ui60Var != null) {
                    strN = historyEntry.q().n();
                    strN.getClass();
                    if (strN.length() == 0) {
                        ah60Var = zg60.a;
                    } else {
                        ah60Var = new ah60(strN);
                    }
                    i = vmu0.c[historyEntry.q().r().ordinal()];
                    if (i != 1) {
                        i2 = 1;
                    } else if (i != 2) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                    Timestamp timestampS = historyEntry.q().s();
                    return new sj60(ui60Var, ah60Var, i2, (timestampS.q() * 1000) + ((long) (timestampS.p() / 1000000)), Base64.getUrlEncoder().withoutPadding().encodeToString(historyEntry.p().t()), historyEntry.n(), z);
                }
            }
            ui60Var = wi60Var;
            if (ui60Var != null) {
                strN = historyEntry.q().n();
                strN.getClass();
                if (strN.length() == 0) {
                    ah60Var = zg60.a;
                } else {
                    ah60Var = new ah60(strN);
                }
                i = vmu0.c[historyEntry.q().r().ordinal()];
                if (i != 1) {
                    i2 = 1;
                } else if (i != 2) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                Timestamp timestampS2 = historyEntry.q().s();
                return new sj60(ui60Var, ah60Var, i2, (timestampS2.q() * 1000) + ((long) (timestampS2.p() / 1000000)), Base64.getUrlEncoder().withoutPadding().encodeToString(historyEntry.p().t()), historyEntry.n(), z);
            }
        }
        return null;
    }

    public static final Object x(iu30 iu30Var, lnm lnmVar) {
        ya80 ya80VarA = lnmVar.getContext().A(f610.g);
        if (ya80VarA == null) {
            return s110.h(lnmVar.getContext()).D(iu30Var, lnmVar);
        }
        new za80(iu30Var, (lnm) null, (byte) 0);
        return ya80VarA.I();
    }

    public abstract String n();
}
