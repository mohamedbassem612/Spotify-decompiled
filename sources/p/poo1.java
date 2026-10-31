package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.PathInterpolator;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class poo1 {
    public static final mn20 a = new mn20(0, 0, 0, 0);
    public static b180 b;

    public static final String A(PlayerState playerState) {
        String str = (String) playerState.contextMetadata().get("context_description");
        return str == null ? "" : str;
    }

    public static PathInterpolator B(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static final boolean C(String str, String str2) {
        return str.equals(str2);
    }

    public static final fd61 D(List list, Map map) {
        fd61 fd61Var;
        ArrayList arrayListE = foo1.E(map);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((ll81) obj).a;
            if (ihc1.h0(str, "session_control_display", false) && gc61.a.contains(ihc1.X0(str, "$"))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            fd61Var = null;
            if (!it.hasNext()) {
                break;
            }
            ll81 ll81Var = (ll81) it.next();
            String str2 = (String) map.get("session_control_display.displayName.".concat(ihc1.X0(ll81Var.a, "$")));
            if (str2 != null) {
                String str3 = ll81Var.a;
                fd61Var = new fd61(str3, str2, arrayListE.contains(str3));
            }
        } while (fd61Var == null);
        return fd61Var;
    }

    public static int E(String str) {
        return str.hashCode();
    }

    public static final bgc0 F(erl1 erl1Var, int i) {
        return new bgc0(erl1Var, i);
    }

    public static String G(String str) {
        return f4i1.f("SubFeedType(value=", str, ")");
    }

    public static final String H(PlayerState playerState, String str) {
        return (String) playerState.track().i(new n110(str, (byte) 0)).e("");
    }

    public static final mih1 I(erl1 erl1Var, erl1 erl1Var2) {
        return new mih1(erl1Var, erl1Var2);
    }

    public static final String J(PlayerState playerState) {
        return playerState.playOrigin().viewUri();
    }

    public static boolean K(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[PHI: r0 r5 r8
      0x00a8: PHI (r0v17 int) = (r0v11 int), (r0v11 int), (r0v18 int) binds: [B:61:0x00b4, B:52:0x00a5, B:53:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r5v8 p.q10) = (r5v4 p.q10), (r5v1 p.q10), (r5v1 p.q10) binds: [B:61:0x00b4, B:52:0x00a5, B:53:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r8v10 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:61:0x00b4, B:52:0x00a5, B:53:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, gt40 gt40Var, boolean z, q10 q10Var, String str2, int i, b0k b0kVar, int i2, int i3) {
        q10 q10Var2;
        int i4;
        String str3;
        int i5;
        int i6;
        boolean z2;
        q10 q10Var3;
        String str4;
        int i7;
        h311 h311VarV;
        String str5;
        int i8;
        gt40 gt40VarL;
        Map map;
        Bitmap bitmap;
        p05 p05Var;
        yx70 lxaVar;
        yx70 yx70Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2115730537);
        int i9 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.i(gt40Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128);
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 = i9 | 3072;
            q10Var2 = q10Var;
        } else {
            q10Var2 = q10Var;
            i4 = i9 | (x340Var.i(q10Var2) ? 2048 : 1024);
        }
        int i11 = i3 & 16;
        if (i11 == 0) {
            if ((i2 & 24576) == 0) {
                str3 = str2;
                i4 |= x340Var.g(str3) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 = i;
                int i12 = x340Var.e(i5) ? 131072 : 65536;
                i6 = i4 | i12;
                if ((74899 & i6) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i6 & 1, z2)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0 || x340Var.E()) {
                        if (i10 != 0) {
                            q10Var2 = null;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if ((i3 & 32) != 0) {
                            i6 &= -458753;
                            str5 = str3;
                            i8 = 1;
                        }
                        x340Var.s();
                        if (q10Var2 != null) {
                            gt40VarL = d9y0.l(gt40Var, q10Var2);
                        } else {
                            gt40VarL = gt40Var;
                        }
                        map = (Map) x340Var.k(vce0.a);
                        if (str.length() == 0) {
                            p05Var = new p05(2131230995);
                        } else {
                            if (z) {
                                bitmap = (Bitmap) map.get(txa.a(str));
                                if (bitmap != null) {
                                    lxaVar = new lxa(bitmap);
                                } else {
                                    p05Var = new p05(2131230995);
                                }
                            } else {
                                lxaVar = new o2i1(Uri.parse(str));
                            }
                            yx70Var = lxaVar;
                            yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                            q10Var3 = q10Var2;
                            str4 = str5;
                            i7 = i8;
                        }
                        yx70Var = p05Var;
                        yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                        q10Var3 = q10Var2;
                        str4 = str5;
                        i7 = i8;
                    } else {
                        x340Var.b0();
                        if ((i3 & 32) != 0) {
                            i6 &= -458753;
                        }
                    }
                    i8 = i5;
                    str5 = str3;
                    x340Var.s();
                    if (q10Var2 != null) {
                        gt40VarL = d9y0.l(gt40Var, q10Var2);
                    } else {
                        gt40VarL = gt40Var;
                    }
                    map = (Map) x340Var.k(vce0.a);
                    if (str.length() == 0) {
                        p05Var = new p05(2131230995);
                    } else {
                        if (z) {
                            lxaVar = new o2i1(Uri.parse(str));
                        } else {
                            bitmap = (Bitmap) map.get(txa.a(str));
                            if (bitmap != null) {
                                lxaVar = new lxa(bitmap);
                            } else {
                                p05Var = new p05(2131230995);
                            }
                        }
                        yx70Var = lxaVar;
                        yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                        q10Var3 = q10Var2;
                        str4 = str5;
                        i7 = i8;
                    }
                    yx70Var = p05Var;
                    yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                    q10Var3 = q10Var2;
                    str4 = str5;
                    i7 = i8;
                } else {
                    x340Var.b0();
                    q10Var3 = q10Var2;
                    str4 = str3;
                    i7 = i5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tl(str, gt40Var, z, q10Var3, str4, i7, i2, i3);
                }
            }
            i5 = i;
            i6 = i4 | i12;
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i6 & 1, z2)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        q10Var2 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i6 &= -458753;
                        str5 = str3;
                        i8 = 1;
                    } else {
                        i8 = i5;
                        str5 = str3;
                    }
                } else {
                    if (i10 != 0) {
                        q10Var2 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i6 &= -458753;
                        str5 = str3;
                        i8 = 1;
                    } else {
                        i8 = i5;
                        str5 = str3;
                    }
                }
                x340Var.s();
                if (q10Var2 != null) {
                    gt40VarL = d9y0.l(gt40Var, q10Var2);
                } else {
                    gt40VarL = gt40Var;
                }
                map = (Map) x340Var.k(vce0.a);
                if (str.length() == 0) {
                    p05Var = new p05(2131230995);
                } else {
                    if (z) {
                        lxaVar = new o2i1(Uri.parse(str));
                    } else {
                        bitmap = (Bitmap) map.get(txa.a(str));
                        if (bitmap != null) {
                            lxaVar = new lxa(bitmap);
                        } else {
                            p05Var = new p05(2131230995);
                        }
                    }
                    yx70Var = lxaVar;
                    yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                    q10Var3 = q10Var2;
                    str4 = str5;
                    i7 = i8;
                }
                yx70Var = p05Var;
                yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                q10Var3 = q10Var2;
                str4 = str5;
                i7 = i8;
            } else {
                x340Var.b0();
                q10Var3 = q10Var2;
                str4 = str3;
                i7 = i5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tl(str, gt40Var, z, q10Var3, str4, i7, i2, i3);
            }
        }
        i4 |= 24576;
        str3 = str2;
        if ((i3 & 32) == 0) {
            i5 = i;
            if (x340Var.e(i5)) {
            }
            i6 = i4 | i12;
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i6 & 1, z2)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        q10Var2 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i6 &= -458753;
                        str5 = str3;
                        i8 = 1;
                    } else {
                        i8 = i5;
                        str5 = str3;
                    }
                } else {
                    if (i10 != 0) {
                        q10Var2 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i6 &= -458753;
                        str5 = str3;
                        i8 = 1;
                    } else {
                        i8 = i5;
                        str5 = str3;
                    }
                }
                x340Var.s();
                if (q10Var2 != null) {
                    gt40VarL = d9y0.l(gt40Var, q10Var2);
                } else {
                    gt40VarL = gt40Var;
                }
                map = (Map) x340Var.k(vce0.a);
                if (str.length() == 0) {
                    p05Var = new p05(2131230995);
                } else {
                    if (z) {
                        lxaVar = new o2i1(Uri.parse(str));
                    } else {
                        bitmap = (Bitmap) map.get(txa.a(str));
                        if (bitmap != null) {
                            lxaVar = new lxa(bitmap);
                        } else {
                            p05Var = new p05(2131230995);
                        }
                    }
                    yx70Var = lxaVar;
                    yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                    q10Var3 = q10Var2;
                    str4 = str5;
                    i7 = i8;
                }
                yx70Var = p05Var;
                yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                q10Var3 = q10Var2;
                str4 = str5;
                i7 = i8;
            } else {
                x340Var.b0();
                q10Var3 = q10Var2;
                str4 = str3;
                i7 = i5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tl(str, gt40Var, z, q10Var3, str4, i7, i2, i3);
            }
        }
        i5 = i;
        i6 = i4 | i12;
        if ((74899 & i6) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i6 & 1, z2)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    q10Var2 = null;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if ((i3 & 32) != 0) {
                    i6 &= -458753;
                    str5 = str3;
                    i8 = 1;
                } else {
                    i8 = i5;
                    str5 = str3;
                }
            } else {
                if (i10 != 0) {
                    q10Var2 = null;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if ((i3 & 32) != 0) {
                    i6 &= -458753;
                    str5 = str3;
                    i8 = 1;
                } else {
                    i8 = i5;
                    str5 = str3;
                }
            }
            x340Var.s();
            if (q10Var2 != null) {
                gt40VarL = d9y0.l(gt40Var, q10Var2);
            } else {
                gt40VarL = gt40Var;
            }
            map = (Map) x340Var.k(vce0.a);
            if (str.length() == 0) {
                p05Var = new p05(2131230995);
            } else {
                if (z) {
                    lxaVar = new o2i1(Uri.parse(str));
                } else {
                    bitmap = (Bitmap) map.get(txa.a(str));
                    if (bitmap != null) {
                        lxaVar = new lxa(bitmap);
                    } else {
                        p05Var = new p05(2131230995);
                    }
                }
                yx70Var = lxaVar;
                yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
                q10Var3 = q10Var2;
                str4 = str5;
                i7 = i8;
            }
            yx70Var = p05Var;
            yoi1.d(yx70Var, str5, gt40VarL, i8, (u8h) null, x340Var, ((i6 >> 9) & 112) | ((i6 >> 6) & 7168), 16);
            q10Var3 = q10Var2;
            str4 = str5;
            i7 = i8;
        } else {
            x340Var.b0();
            q10Var3 = q10Var2;
            str4 = str3;
            i7 = i5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tl(str, gt40Var, z, q10Var3, str4, i7, i2, i3);
        }
    }

    public static final void b(jre jreVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-860135368);
        int i2 = i | (x340Var.i(jreVar) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.h(z3) ? 2048 : 1024) | (x340Var.h(z4) ? 16384 : 8192) | (x340Var.h(z5) ? 131072 : 65536) | (x340Var.i(vu30Var) ? 1048576 : 524288);
        byte b2 = 1;
        byte b3 = 0;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            lnm lnmVar = null;
            if (!(jreVar instanceof hre) || z4 || z3 || z || z2 || z5) {
                x340Var.i0(-517315542);
                x340Var.r(false);
            } else {
                x340Var.i0(-517438550);
                boolean zI = x340Var.i(vu30Var);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new tqe(vu30Var, lnmVar, b3);
                    x340Var.s0(objT);
                }
                qxd0.t(jreVar, x340Var, (vu30) objT);
                x340Var.r(false);
            }
            if (!(jreVar instanceof ire) || z2) {
                x340Var.i0(-517120118);
                x340Var.r(false);
            } else {
                x340Var.i0(-517245048);
                boolean zI2 = x340Var.i(vu30Var);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new tqe(vu30Var, lnmVar, b2);
                    x340Var.s0(objT2);
                }
                qxd0.t(jreVar, x340Var, (vu30) objT2);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uqe(jreVar, z, z2, z3, z4, z5, vu30Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v46 */
    public static final void c(ppe ppeVar, g9m g9mVar, lz71 lz71Var, nu nuVar, iu30 iu30Var, String str, iu30 iu30Var2, boolean z, kvp kvpVar, w9u0 w9u0Var, mpa1 mpa1Var, g38 g38Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, zg61 zg61Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        tob1 tob1Var;
        float fN;
        jre jreVar;
        ven0 ven0Var;
        jre jreVar2;
        boolean z7;
        iu30 iu30Var3;
        boolean z8;
        boolean z9;
        ?? r12;
        float f;
        float f2;
        jre jreVar3 = ppeVar.a;
        boolean z10 = ppeVar.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1582348774);
        int i2 = i | (b0kVar3.i(ppeVar) ? 4 : 2) | (b0kVar3.i(g9mVar) ? 32 : 16) | (b0kVar3.i(lz71Var) ? 256 : 128) | (b0kVar3.i(nuVar) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192) | (b0kVar3.g(str) ? 131072 : 65536) | (b0kVar3.i(iu30Var2) ? 1048576 : 524288) | (b0kVar3.h(z) ? 8388608 : 4194304) | (b0kVar3.i(kvpVar) ? 67108864 : 33554432) | (b0kVar3.i(w9u0Var) ? 536870912 : 268435456);
        int i3 = (b0kVar3.i(mpa1Var) ? 4 : 2) | (b0kVar3.i(g38Var) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : 128) | (b0kVar3.h(z3) ? 2048 : 1024) | (b0kVar3.h(z4) ? 16384 : 8192) | (b0kVar3.h(z5) ? 131072 : 65536) | (b0kVar3.h(z6) ? 1048576 : 524288) | (b0kVar3.i(zg61Var) ? 8388608 : 4194304) | (b0kVar3.h(false) ? 67108864 : 33554432);
        if (!b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 38347923) == 38347922) ? false : true)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else if (jreVar3 instanceof fre) {
            b0kVar2 = b0kVar3;
            b0kVar2.i0(-1795229412);
            b0kVar2.r(false);
        } else {
            b0kVar3.i0(-1807469669);
            boolean z11 = str.length() > 0;
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            boolean z12 = z11;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(krm0.a);
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var2 = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var4 = (ven0) objT4;
            hre hreVar = jreVar3 instanceof hre ? (hre) jreVar3 : null;
            boolean z13 = (hreVar == null || ppeVar.d || (!z && !hreVar.d)) ? false : true;
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            boolean zI = b0kVar3.i(ppeVar) | b0kVar3.i(k6a1Var);
            boolean z14 = z13;
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new pid(ppeVar, k6a1Var, (lnm) null, (byte) 3);
                b0kVar3.s0(objT5);
            }
            qxd0.t(jreVar3, b0kVar3, (vu30) objT5);
            ven0 ven0VarS = v8r.s(false, b0kVar3);
            ven0 ven0VarS2 = v8r.s(Boolean.valueOf(z14), b0kVar3);
            ven0 ven0VarS3 = v8r.s(str, b0kVar3);
            ven0 ven0VarS4 = v8r.s(iu30Var, b0kVar3);
            ven0 ven0VarS5 = v8r.s(iu30Var2, b0kVar3);
            ven0 ven0VarS6 = v8r.s(ppeVar, b0kVar3);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.b.a();
            mta mtaVar = cbx.b(b0kVar3).d;
            enk1 enk1Var = new enk1(jA, smk1.a, z6, 10);
            boolean zG = b0kVar3.g(mpa1Var) | b0kVar3.g(g38Var);
            Object objT6 = b0kVar3.T();
            if (zG || objT6 == m4cVar) {
                objT6 = mpa1Var.a(g38Var);
                b0kVar3.s0(objT6);
            }
            ty60 ty60Var = (ty60) objT6;
            boolean zG2 = b0kVar3.g(enk1Var) | b0kVar3.g(w9u0Var) | b0kVar3.g(ty60Var);
            Object objT7 = b0kVar3.T();
            nim0 nim0Var = nim0.a;
            if (zG2 || objT7 == m4cVar) {
                tob1Var = tob1Var2;
                objT7 = kvp.b(kvpVar, w9u0Var, ty60Var, new ip31(ven0VarS4, ven0VarS6, ven0Var3, k6a1Var, ven0VarS3, ven0VarS5, ven0VarS, ven0VarS2, (byte) 6), new xs3(ven0Var4, ven0VarS4, (byte) 3), new db(tob1Var2, ven0Var3, ven0Var4, ven0VarS4, (byte) 27), (gqa0) null, enk1Var, u291.h(u291.f(nim0Var, 1.0f), 40.0f), new bp9(ven0Var3, (byte) 19), new bp9(ven0VarS4, (byte) 20), CtaType.CTA_SHARE_FIELD_NUMBER);
                b0kVar3.s0(objT7);
            } else {
                tob1Var = tob1Var2;
            }
            orm0 orm0Var = (orm0) objT7;
            wat watVar = (wat) b0kVar3.k(t4k.h);
            flb0 flb0Var = (flb0) b0kVar3.k(t4k.n);
            int iA = (int) (((crl1) b0kVar3.k(t4k.u)).a() & 4294967295L);
            WeakHashMap weakHashMap = osl1.x;
            int i4 = lhc.g(b0kVar3).c.e().d;
            boolean z15 = i4 > 0;
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                objT8 = bb00.h(0, b0kVar3);
            }
            err0 err0Var = (hdn0) objT8;
            int iS = i4 - err0Var.s();
            if (iS < 0) {
                iS = 0;
            }
            float fM0 = watVar.M0(iS);
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar) {
                objT9 = c97.b(r4);
                b0kVar3.s0(objT9);
            }
            o95 o95Var = (o95) objT9;
            jre jreVar4 = ppeVar.a;
            Boolean boolValueOf = Boolean.valueOf(z12);
            Boolean bool = (Boolean) ven0Var2.getValue();
            bool.getClass();
            Boolean boolValueOf2 = Boolean.valueOf(z15);
            Boolean boolValueOf3 = Boolean.valueOf(z14);
            krm0 krm0Var = (krm0) tob1Var.getValue();
            Boolean bool2 = (Boolean) ven0Var3.getValue();
            bool2.getClass();
            Object[] objArr = {jreVar4, boolValueOf, bool, boolValueOf2, boolValueOf3, krm0Var, bool2};
            boolean zI2 = b0kVar3.i(o95Var);
            Object objT10 = b0kVar3.T();
            if (zI2 || objT10 == m4cVar) {
                objT10 = new b(o95Var, (lnm) null, (byte) 2);
                b0kVar3.s0(objT10);
            }
            qxd0.u(objArr, (vu30) objT10, b0kVar3);
            jre jreVar5 = ppeVar.a;
            boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
            boolean z16 = ((Boolean) ven0Var3.getValue()).booleanValue() || ((krm0) tob1Var.getValue()) == krm0.b;
            int i5 = i2 & 57344;
            boolean zI3 = b0kVar3.i(o95Var) | (i5 == 16384);
            Object objT11 = b0kVar3.T();
            if (zI3 || objT11 == m4cVar) {
                objT11 = new sxa(o95Var, iu30Var, (lnm) null, (byte) 25);
                b0kVar3.s0(objT11);
            }
            b(jreVar5, z12, zBooleanValue, z15, z14, z16, (vu30) objT11, b0kVar3, 0);
            jre jreVar6 = ppeVar.a;
            boolean z17 = jreVar6 instanceof ire;
            if (z17 || (jreVar6 instanceof dre) || (jreVar6 instanceof gre)) {
                b0kVar3.i0(-1802059704);
                fN = cbx.b(b0kVar3).b.e;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1802001393);
                b0kVar3.r(false);
                fN = uyn1.n(ppeVar.b, flb0Var);
            }
            boolean z18 = z17 || (jreVar6 instanceof dre) || (jreVar6 instanceof gre);
            boolean z19 = (jreVar6 instanceof hre) || (jreVar6 instanceof ere);
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar) {
                jreVar = null;
                objT12 = v8r.q((Object) null);
                b0kVar3.s0(objT12);
            } else {
                jreVar = null;
            }
            ven0 ven0Var5 = (ven0) objT12;
            Object objT13 = b0kVar3.T();
            if (objT13 == m4cVar) {
                objT13 = v8r.q(jreVar);
                b0kVar3.s0(objT13);
            }
            ven0 ven0Var6 = (ven0) objT13;
            boolean zI4 = b0kVar3.i(jreVar6) | b0kVar3.i(ven0Var5) | b0kVar3.i(ven0Var6);
            Object objT14 = b0kVar3.T();
            if (zI4 || objT14 == m4cVar) {
                jre jreVar7 = jreVar;
                objT14 = new gke(jreVar6, ven0Var5, ven0Var6, jreVar7, (byte) 2);
                ven0Var = ven0Var5;
                jreVar2 = jreVar7;
                b0kVar3.s0(objT14);
            } else {
                ven0Var = ven0Var5;
                jreVar2 = jreVar;
            }
            qxd0.t(jreVar6, b0kVar3, (vu30) objT14);
            jre jreVar8 = (z17 || (jreVar6 instanceof dre) || (jreVar6 instanceof gre)) ? jreVar6 : jreVar2;
            boolean z20 = z5 && z10;
            if (z20) {
                b0kVar3.i0(-1800649514);
                Object objT15 = b0kVar3.T();
                if (objT15 == m4cVar) {
                    objT15 = mle.a1;
                    b0kVar3.s0(objT15);
                }
                iu30Var3 = (iu30) objT15;
                z7 = false;
            } else {
                z7 = false;
                b0kVar3.i0(-1800635595);
                Object objT16 = b0kVar3.T();
                if (objT16 == m4cVar) {
                    objT16 = mle.b1;
                    b0kVar3.s0(objT16);
                }
                iu30Var3 = (iu30) objT16;
            }
            b0kVar3.r(z7);
            b0kVar3.i0(219017320);
            boolean zI5 = b0kVar3.i(o95Var);
            jre jreVar9 = jreVar8;
            Object objT17 = b0kVar3.T();
            if (zI5 || objT17 == m4cVar) {
                objT17 = new wqe(o95Var, (byte) 0);
                b0kVar3.s0(objT17);
            }
            qim0 qim0VarC = i541.C(nim0Var, (iu30) objT17);
            if (z10) {
                qim0VarC = qim0VarC.then(u291.d(nim0Var, 1.0f));
            }
            if (!z10) {
                qim0VarC = qim0VarC.then(u291.f(nim0Var, 1.0f));
            }
            if (i4 > 0) {
                boolean zI6 = b0kVar3.i(err0Var) | b0kVar3.e(iA);
                Object objT18 = b0kVar3.T();
                if (zI6 || objT18 == m4cVar) {
                    objT18 = new ym(iA, (Object) err0Var, (byte) 8);
                    b0kVar3.s0(objT18);
                }
                qim0VarC = qim0VarC.then(ern1.x(nim0Var, (iu30) objT18));
            }
            b0kVar3.r(false);
            qim0 qim0VarB = uyn1.B(uyn1.z(fN, 0.0f, 2, qim0VarC), 0.0f, 0.0f, 0.0f, fM0, 7);
            gfh0 gfh0VarC = t1c.c(z10 ? een.d : een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (z10) {
                b0kVar3.i0(-1082928976);
                tl3 tl3Var = een.X;
                h2c h2cVar = h2c.a;
                qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 15 | 32, h2cVar.a(nim0Var, tl3Var));
                cvx cvxVar = cbx.b(b0kVar3).b;
                qim0 qim0VarB2 = uyn1.B(qim0VarP, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6);
                Object objT19 = b0kVar3.T();
                if (objT19 == m4cVar) {
                    objT19 = mle.Y0;
                    b0kVar3.s0(objT19);
                }
                bby bbyVarA = xay.o(pxg1VarO0, (iu30) objT19).a(xay.e(3, (ni20) null));
                pxg1 pxg1VarO1 = irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6);
                Object objT20 = b0kVar3.T();
                if (objT20 == m4cVar) {
                    objT20 = mle.Z0;
                    b0kVar3.s0(objT20);
                }
                iu30 iu30Var4 = iu30Var3;
                fq7.g(z18, qim0VarB2, bbyVarA, xay.s(pxg1VarO1, (iu30) objT20).a(xay.f(3, (ni20) null)), (String) null, apo.r(-1476400558, new xqe(jreVar9, g9mVar, lz71Var, nuVar, iu30Var, ven0Var2, orm0Var, z2, z3, z4, zg61Var, ven0Var6), b0kVar3), b0kVar3, 196608, 16);
                qim0 qim0VarY = too1.y(h2cVar.a(nim0Var, z20 ? tl3Var : een.e), lhc.g(b0kVar3).g);
                if (z20) {
                    b0kVar3.i0(-1281788217);
                    r12 = 0;
                    b0kVar3.r(false);
                    f = 0.0f;
                } else {
                    r12 = 0;
                    b0kVar3.i0(-1281787315);
                    float f3 = cbx.b(b0kVar3).b.d;
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    b0kVar3.r(false);
                    f = f3 + 8.0f;
                }
                if (z20) {
                    b0kVar3.i0(-1281782643);
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    b0kVar3.r((boolean) r12);
                    f2 = 8.0f;
                } else {
                    b0kVar3.i0(-1281782137);
                    b0kVar3.r((boolean) r12);
                    f2 = 0.0f;
                }
                b0kVar2 = b0kVar3;
                fq7.g(z19, uyn1.B(qim0VarY, 0.0f, f, 0.0f, f2, 5), xay.o(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, r12, null, 6), iu30Var4).a(xay.e(3, (ni20) null)), xay.s(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, r12, null, 6), iu30Var4).a(xay.f(3, (ni20) null)), (String) null, apo.r(-1239347077, new yqe(ven0Var, g9mVar, lz71Var, nuVar, iu30Var, z20, ven0Var2, z14, orm0Var, z2, z3, z4, zg61Var), b0kVar3), b0kVar2, 196608, 16);
                z9 = false;
                b0kVar3.r(false);
                z8 = true;
            } else {
                b0kVar3.i0(-1079312516);
                boolean zI7 = b0kVar3.i(ven0Var2);
                Object objT21 = b0kVar3.T();
                if (zI7 || objT21 == m4cVar) {
                    objT21 = new cy7(ven0Var2, (byte) 20);
                    b0kVar3.s0(objT21);
                }
                iu30 iu30Var5 = (iu30) objT21;
                qim0 qim0VarX = u291.x(0.0f, dsa0.m(b0kVar3, 2131166901), 1, nim0Var);
                if (jreVar6 instanceof gre) {
                    qim0VarX = qim0VarX.then(uyn1.z(0.0f, 32.0f, 1, nim0Var));
                }
                z8 = true;
                p(jreVar6, g9mVar, lz71Var, nuVar, iu30Var, false, iu30Var5, z14, orm0Var, z2, z3, z4, zg61Var, qim0VarX, b0kVar3, (i2 & 112) | 196608 | (i2 & 896) | (i2 & 7168) | i5 | ((i3 << 21) & 1879048192), ((i3 >> 9) & 126) | ((i3 >> 15) & 896));
                b0kVar2 = b0kVar3;
                z9 = false;
                b0kVar2.r(false);
            }
            b0kVar2.r(z8);
            b0kVar2.r(z9);
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vqe(ppeVar, g9mVar, lz71Var, nuVar, iu30Var, str, iu30Var2, z, kvpVar, w9u0Var, mpa1Var, g38Var, z2, z3, z4, z5, z6, zg61Var, i);
        }
    }

    public static final void d(lex lexVar, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1110151021);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lexVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarR = u291.r(uyn1.z(4.0f, 0.0f, 2, nim0.a), lexVar.c);
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
            us71.j((i2 >> 3) & 14, vu30Var, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(lexVar, vu30Var, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:124:0x0160  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:129:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0178  */
    /* JADX WARN: Code duplicated, block: B:136:0x017f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0185  */
    /* JADX WARN: Code duplicated, block: B:139:0x018b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0193  */
    /* JADX WARN: Code duplicated, block: B:143:0x019a  */
    /* JADX WARN: Code duplicated, block: B:146:0x01af  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x0201  */
    /* JADX WARN: Code duplicated, block: B:174:0x0206  */
    /* JADX WARN: Code duplicated, block: B:176:0x020a  */
    /* JADX WARN: Code duplicated, block: B:178:0x020d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x0214  */
    /* JADX WARN: Code duplicated, block: B:183:0x0216  */
    /* JADX WARN: Code duplicated, block: B:186:0x021c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0222  */
    /* JADX WARN: Code duplicated, block: B:190:0x0228  */
    /* JADX WARN: Code duplicated, block: B:191:0x0231  */
    /* JADX WARN: Code duplicated, block: B:194:0x0236  */
    /* JADX WARN: Code duplicated, block: B:197:0x023c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0241  */
    /* JADX WARN: Code duplicated, block: B:200:0x0245  */
    /* JADX WARN: Code duplicated, block: B:201:0x024c  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void e(gbx gbxVar, qex qexVar, lex lexVar, qim0 qim0Var, int i, String str, max maxVar, vu30 vu30Var, vu30 vu30Var2, idn0 idn0Var, ga80 ga80Var, boolean z, vzq0 vzq0Var, vu30 vu30Var3, b0k b0kVar, int i2, int i3, int i4) {
        int i5;
        qex qexVar2;
        int i6;
        int iC;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        max maxVar2;
        int i11;
        int i12;
        vu30 vu30Var4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        x340 x340Var;
        qim0 qim0Var2;
        int i22;
        ga80 ga80Var2;
        boolean z3;
        vu30 vu30Var5;
        String str3;
        max maxVar3;
        vu30 vu30Var6;
        vu30 vu30Var7;
        idn0 idn0Var2;
        vzq0 vzq0Var2;
        h311 h311VarV;
        int i23;
        vu30 vu30Var8;
        idn0 idn0VarY;
        ga80 ga80VarO;
        boolean z4;
        vzq0 vzq0Var3;
        int i24;
        int i25;
        int i26;
        vu30 vu30Var9;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(461120496);
        if ((i2 & 6) == 0) {
            i5 = (x340Var2.g(gbxVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            qexVar2 = qexVar;
            i5 |= x340Var2.g(qexVar2) ? 32 : 16;
        } else {
            qexVar2 = qexVar;
        }
        if ((i2 & 384) == 0) {
            i5 |= x340Var2.g(lexVar) ? 256 : 128;
        }
        int i27 = i4 & 8;
        if (i27 == 0) {
            if ((i2 & 3072) == 0) {
                i5 |= x340Var2.g(qim0Var) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var2.e(iC)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                i5 |= 196608;
                str2 = str;
            } else {
                str2 = str;
                if ((i2 & 196608) == 0) {
                    if (x340Var2.g(str2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & 64;
            if (i10 != 0) {
                i5 |= 1572864;
                maxVar2 = maxVar;
            } else {
                maxVar2 = maxVar;
                if ((i2 & 1572864) == 0) {
                    if (x340Var2.g(maxVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 128;
            if (i12 != 0) {
                i5 |= 12582912;
                vu30Var4 = vu30Var;
            } else {
                vu30Var4 = vu30Var;
                if ((i2 & 12582912) == 0) {
                    if (x340Var2.i(vu30Var4)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & 256;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var2.i(vu30Var2)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & 512) == 0 || !x340Var2.g(idn0Var)) ? 268435456 : 536870912;
            }
            if ((i3 & 6) == 0) {
                i16 = i3 | (((i4 & 1024) == 0 || !x340Var2.g(ga80Var)) ? 2 : 4);
            } else {
                i16 = i3;
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
                if ((i3 & 48) == 0) {
                    if (x340Var2.h(z)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i3 & 384) != 0) {
                    i16 |= ((i4 & 4096) == 0 || !x340Var2.g(vzq0Var)) ? 128 : 256;
                }
                i19 = i16;
                i20 = i4 & 8192;
                if (i20 != 0) {
                    i21 = i19 | 3072;
                } else if ((i3 & 3072) == 0) {
                    i21 = i19 | (x340Var2.i(vu30Var3) ? 2048 : 1024);
                } else {
                    i21 = i19;
                }
                if ((i5 & 306783379) == 306783378 || (i21 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var2.Y(i5 & 1, z2)) {
                    x340Var2.d0();
                    if ((i2 & 1) != 0 || x340Var2.E()) {
                        if (i27 != 0) {
                            qim0Var2 = nim0.a;
                        } else {
                            qim0Var2 = qim0Var;
                        }
                        i23 = i6 == 0 ? i : 1;
                        if (i8 != 0) {
                            str2 = null;
                        }
                        if (i10 != 0) {
                            maxVar2 = jax.a;
                        }
                        if (i12 != 0) {
                            vu30Var4 = null;
                        }
                        if (i14 != 0) {
                            vu30Var8 = null;
                        } else {
                            vu30Var8 = vu30Var2;
                        }
                        if ((i4 & 512) != 0) {
                            idn0VarY = zso1.Y(x340Var2);
                            i5 &= -1879048193;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if ((i4 & 1024) != 0) {
                            ga80VarO = vno1.o(er31.a, x340Var2, 0);
                            i21 &= -15;
                        } else {
                            ga80VarO = ga80Var;
                        }
                        z4 = i17 == 0 ? z : false;
                        if ((i4 & 4096) != 0) {
                            vzq0Var3 = lexVar.a;
                            i21 &= -897;
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        if (i20 != 0) {
                            i24 = i21;
                            i25 = i5;
                            i26 = i23;
                            vu30Var9 = null;
                        } else {
                            i24 = i21;
                            i25 = i5;
                            i26 = i23;
                        }
                        x340Var2.s();
                        vu30 vu30Var10 = vu30Var9;
                        int i28 = i26;
                        i1k0.c(gbxVar, qexVar2, lexVar, voo1.x(x340Var2, i26), maxVar2, z4, idn0VarY, ga80VarO, qim0Var2, apo.r(1338797495, new eex(vzq0Var3, str2, lexVar, vu30Var4, vu30Var10, vu30Var8), x340Var2), x340Var2, (i25 & 896) | (i25 & 14) | 805306368 | (i25 & 112) | ((i25 >> 6) & 57344) | ((i24 << 12) & 458752) | ((i25 >> 9) & 3670016) | ((i24 << 21) & 29360128) | ((i25 << 15) & 234881024));
                        x340Var = x340Var2;
                        vu30 vu30Var11 = vu30Var8;
                        z3 = z4;
                        str3 = str2;
                        vu30Var7 = vu30Var11;
                        maxVar3 = maxVar2;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0VarY;
                        vu30Var5 = vu30Var10;
                        vzq0Var2 = vzq0Var3;
                        ga80Var2 = ga80VarO;
                        i22 = i28;
                    } else {
                        x340Var2.b0();
                        if ((i4 & 512) != 0) {
                            i5 &= -1879048193;
                        }
                        if ((i4 & 1024) != 0) {
                            i21 &= -15;
                        }
                        if ((i4 & 4096) != 0) {
                            i21 &= -897;
                        }
                        qim0Var2 = qim0Var;
                        vu30Var8 = vu30Var2;
                        idn0VarY = idn0Var;
                        ga80VarO = ga80Var;
                        z4 = z;
                        vzq0Var3 = vzq0Var;
                        i24 = i21;
                        i25 = i5;
                        i26 = i;
                    }
                    vu30Var9 = vu30Var3;
                    x340Var2.s();
                    vu30 vu30Var12 = vu30Var9;
                    int i29 = i26;
                    i1k0.c(gbxVar, qexVar2, lexVar, voo1.x(x340Var2, i26), maxVar2, z4, idn0VarY, ga80VarO, qim0Var2, apo.r(1338797495, new eex(vzq0Var3, str2, lexVar, vu30Var4, vu30Var12, vu30Var8), x340Var2), x340Var2, (i25 & 896) | (i25 & 14) | 805306368 | (i25 & 112) | ((i25 >> 6) & 57344) | ((i24 << 12) & 458752) | ((i25 >> 9) & 3670016) | ((i24 << 21) & 29360128) | ((i25 << 15) & 234881024));
                    x340Var = x340Var2;
                    vu30 vu30Var13 = vu30Var8;
                    z3 = z4;
                    str3 = str2;
                    vu30Var7 = vu30Var13;
                    maxVar3 = maxVar2;
                    vu30Var6 = vu30Var4;
                    idn0Var2 = idn0VarY;
                    vu30Var5 = vu30Var12;
                    vzq0Var2 = vzq0Var3;
                    ga80Var2 = ga80VarO;
                    i22 = i29;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    i22 = i;
                    ga80Var2 = ga80Var;
                    z3 = z;
                    vu30Var5 = vu30Var3;
                    str3 = str2;
                    maxVar3 = maxVar2;
                    vu30Var6 = vu30Var4;
                    vu30Var7 = vu30Var2;
                    idn0Var2 = idn0Var;
                    vzq0Var2 = vzq0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fex(gbxVar, qexVar, lexVar, qim0Var2, i22, str3, maxVar3, vu30Var6, vu30Var7, idn0Var2, ga80Var2, z3, vzq0Var2, vu30Var5, i2, i3, i4);
                }
            }
            i16 |= 48;
            if ((i3 & 384) != 0) {
                i16 |= ((i4 & 4096) == 0 || !x340Var2.g(vzq0Var)) ? 128 : 256;
            }
            i19 = i16;
            i20 = i4 & 8192;
            if (i20 != 0) {
                i21 = i19 | 3072;
            } else if ((i3 & 3072) == 0) {
                i21 = i19 | (x340Var2.i(vu30Var3) ? 2048 : 1024);
            } else {
                i21 = i19;
            }
            if ((i5 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i5 & 1, z2)) {
                x340Var2.d0();
                if ((i2 & 1) != 0) {
                    if (i27 != 0) {
                        qim0Var2 = nim0.a;
                    } else {
                        qim0Var2 = qim0Var;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if (i10 != 0) {
                        maxVar2 = jax.a;
                    }
                    if (i12 != 0) {
                        vu30Var4 = null;
                    }
                    if (i14 != 0) {
                        vu30Var8 = null;
                    } else {
                        vu30Var8 = vu30Var2;
                    }
                    if ((i4 & 512) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -1879048193;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i4 & 1024) != 0) {
                        ga80VarO = vno1.o(er31.a, x340Var2, 0);
                        i21 &= -15;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    if (i17 == 0) {
                    }
                    if ((i4 & 4096) != 0) {
                        vzq0Var3 = lexVar.a;
                        i21 &= -897;
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    if (i20 != 0) {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = null;
                    } else {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = vu30Var3;
                    }
                } else {
                    if (i27 != 0) {
                        qim0Var2 = nim0.a;
                    } else {
                        qim0Var2 = qim0Var;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if (i10 != 0) {
                        maxVar2 = jax.a;
                    }
                    if (i12 != 0) {
                        vu30Var4 = null;
                    }
                    if (i14 != 0) {
                        vu30Var8 = null;
                    } else {
                        vu30Var8 = vu30Var2;
                    }
                    if ((i4 & 512) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -1879048193;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i4 & 1024) != 0) {
                        ga80VarO = vno1.o(er31.a, x340Var2, 0);
                        i21 &= -15;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    if (i17 == 0) {
                    }
                    if ((i4 & 4096) != 0) {
                        vzq0Var3 = lexVar.a;
                        i21 &= -897;
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    if (i20 != 0) {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = null;
                    } else {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = vu30Var3;
                    }
                }
                x340Var2.s();
                vu30 vu30Var14 = vu30Var9;
                int i210 = i26;
                i1k0.c(gbxVar, qexVar2, lexVar, voo1.x(x340Var2, i26), maxVar2, z4, idn0VarY, ga80VarO, qim0Var2, apo.r(1338797495, new eex(vzq0Var3, str2, lexVar, vu30Var4, vu30Var14, vu30Var8), x340Var2), x340Var2, (i25 & 896) | (i25 & 14) | 805306368 | (i25 & 112) | ((i25 >> 6) & 57344) | ((i24 << 12) & 458752) | ((i25 >> 9) & 3670016) | ((i24 << 21) & 29360128) | ((i25 << 15) & 234881024));
                x340Var = x340Var2;
                vu30 vu30Var15 = vu30Var8;
                z3 = z4;
                str3 = str2;
                vu30Var7 = vu30Var15;
                maxVar3 = maxVar2;
                vu30Var6 = vu30Var4;
                idn0Var2 = idn0VarY;
                vu30Var5 = vu30Var14;
                vzq0Var2 = vzq0Var3;
                ga80Var2 = ga80VarO;
                i22 = i210;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                i22 = i;
                ga80Var2 = ga80Var;
                z3 = z;
                vu30Var5 = vu30Var3;
                str3 = str2;
                maxVar3 = maxVar2;
                vu30Var6 = vu30Var4;
                vu30Var7 = vu30Var2;
                idn0Var2 = idn0Var;
                vzq0Var2 = vzq0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fex(gbxVar, qexVar, lexVar, qim0Var2, i22, str3, maxVar3, vu30Var6, vu30Var7, idn0Var2, ga80Var2, z3, vzq0Var2, vu30Var5, i2, i3, i4);
            }
        }
        i5 |= 3072;
        i6 = i4 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (i == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i);
            }
            if (x340Var2.e(iC)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i5 |= i7;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            i5 |= 196608;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 196608) == 0) {
                if (x340Var2.g(str2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i5 |= i9;
            }
        }
        i10 = i4 & 64;
        if (i10 != 0) {
            i5 |= 1572864;
            maxVar2 = maxVar;
        } else {
            maxVar2 = maxVar;
            if ((i2 & 1572864) == 0) {
                if (x340Var2.g(maxVar2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
        }
        i12 = i4 & 128;
        if (i12 != 0) {
            i5 |= 12582912;
            vu30Var4 = vu30Var;
        } else {
            vu30Var4 = vu30Var;
            if ((i2 & 12582912) == 0) {
                if (x340Var2.i(vu30Var4)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i5 |= i13;
            }
        }
        i14 = i4 & 256;
        if (i14 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (x340Var2.i(vu30Var2)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i5 |= i15;
        }
        if ((i2 & 805306368) != 0) {
            i5 |= ((i4 & 512) == 0 || !x340Var2.g(idn0Var)) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i16 = i3 | (((i4 & 1024) == 0 || !x340Var2.g(ga80Var)) ? 2 : 4);
        } else {
            i16 = i3;
        }
        i17 = i4 & 2048;
        if (i17 != 0) {
            if ((i3 & 48) == 0) {
                if (x340Var2.h(z)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
                i16 |= i18;
            }
            if ((i3 & 384) != 0) {
                i16 |= ((i4 & 4096) == 0 || !x340Var2.g(vzq0Var)) ? 128 : 256;
            }
            i19 = i16;
            i20 = i4 & 8192;
            if (i20 != 0) {
                i21 = i19 | 3072;
            } else if ((i3 & 3072) == 0) {
                i21 = i19 | (x340Var2.i(vu30Var3) ? 2048 : 1024);
            } else {
                i21 = i19;
            }
            if ((i5 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i5 & 1, z2)) {
                x340Var2.d0();
                if ((i2 & 1) != 0) {
                    if (i27 != 0) {
                        qim0Var2 = nim0.a;
                    } else {
                        qim0Var2 = qim0Var;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if (i10 != 0) {
                        maxVar2 = jax.a;
                    }
                    if (i12 != 0) {
                        vu30Var4 = null;
                    }
                    if (i14 != 0) {
                        vu30Var8 = null;
                    } else {
                        vu30Var8 = vu30Var2;
                    }
                    if ((i4 & 512) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -1879048193;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i4 & 1024) != 0) {
                        ga80VarO = vno1.o(er31.a, x340Var2, 0);
                        i21 &= -15;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    if (i17 == 0) {
                    }
                    if ((i4 & 4096) != 0) {
                        vzq0Var3 = lexVar.a;
                        i21 &= -897;
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    if (i20 != 0) {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = null;
                    } else {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = vu30Var3;
                    }
                } else {
                    if (i27 != 0) {
                        qim0Var2 = nim0.a;
                    } else {
                        qim0Var2 = qim0Var;
                    }
                    if (i6 == 0) {
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if (i10 != 0) {
                        maxVar2 = jax.a;
                    }
                    if (i12 != 0) {
                        vu30Var4 = null;
                    }
                    if (i14 != 0) {
                        vu30Var8 = null;
                    } else {
                        vu30Var8 = vu30Var2;
                    }
                    if ((i4 & 512) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i5 &= -1879048193;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i4 & 1024) != 0) {
                        ga80VarO = vno1.o(er31.a, x340Var2, 0);
                        i21 &= -15;
                    } else {
                        ga80VarO = ga80Var;
                    }
                    if (i17 == 0) {
                    }
                    if ((i4 & 4096) != 0) {
                        vzq0Var3 = lexVar.a;
                        i21 &= -897;
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    if (i20 != 0) {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = null;
                    } else {
                        i24 = i21;
                        i25 = i5;
                        i26 = i23;
                        vu30Var9 = vu30Var3;
                    }
                }
                x340Var2.s();
                vu30 vu30Var16 = vu30Var9;
                int i211 = i26;
                i1k0.c(gbxVar, qexVar2, lexVar, voo1.x(x340Var2, i26), maxVar2, z4, idn0VarY, ga80VarO, qim0Var2, apo.r(1338797495, new eex(vzq0Var3, str2, lexVar, vu30Var4, vu30Var16, vu30Var8), x340Var2), x340Var2, (i25 & 896) | (i25 & 14) | 805306368 | (i25 & 112) | ((i25 >> 6) & 57344) | ((i24 << 12) & 458752) | ((i25 >> 9) & 3670016) | ((i24 << 21) & 29360128) | ((i25 << 15) & 234881024));
                x340Var = x340Var2;
                vu30 vu30Var17 = vu30Var8;
                z3 = z4;
                str3 = str2;
                vu30Var7 = vu30Var17;
                maxVar3 = maxVar2;
                vu30Var6 = vu30Var4;
                idn0Var2 = idn0VarY;
                vu30Var5 = vu30Var16;
                vzq0Var2 = vzq0Var3;
                ga80Var2 = ga80VarO;
                i22 = i211;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                i22 = i;
                ga80Var2 = ga80Var;
                z3 = z;
                vu30Var5 = vu30Var3;
                str3 = str2;
                maxVar3 = maxVar2;
                vu30Var6 = vu30Var4;
                vu30Var7 = vu30Var2;
                idn0Var2 = idn0Var;
                vzq0Var2 = vzq0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fex(gbxVar, qexVar, lexVar, qim0Var2, i22, str3, maxVar3, vu30Var6, vu30Var7, idn0Var2, ga80Var2, z3, vzq0Var2, vu30Var5, i2, i3, i4);
            }
        }
        i16 |= 48;
        if ((i3 & 384) != 0) {
            i16 |= ((i4 & 4096) == 0 || !x340Var2.g(vzq0Var)) ? 128 : 256;
        }
        i19 = i16;
        i20 = i4 & 8192;
        if (i20 != 0) {
            i21 = i19 | 3072;
        } else if ((i3 & 3072) == 0) {
            i21 = i19 | (x340Var2.i(vu30Var3) ? 2048 : 1024);
        } else {
            i21 = i19;
        }
        if ((i5 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var2.Y(i5 & 1, z2)) {
            x340Var2.d0();
            if ((i2 & 1) != 0) {
                if (i27 != 0) {
                    qim0Var2 = nim0.a;
                } else {
                    qim0Var2 = qim0Var;
                }
                if (i6 == 0) {
                }
                if (i8 != 0) {
                    str2 = null;
                }
                if (i10 != 0) {
                    maxVar2 = jax.a;
                }
                if (i12 != 0) {
                    vu30Var4 = null;
                }
                if (i14 != 0) {
                    vu30Var8 = null;
                } else {
                    vu30Var8 = vu30Var2;
                }
                if ((i4 & 512) != 0) {
                    idn0VarY = zso1.Y(x340Var2);
                    i5 &= -1879048193;
                } else {
                    idn0VarY = idn0Var;
                }
                if ((i4 & 1024) != 0) {
                    ga80VarO = vno1.o(er31.a, x340Var2, 0);
                    i21 &= -15;
                } else {
                    ga80VarO = ga80Var;
                }
                if (i17 == 0) {
                }
                if ((i4 & 4096) != 0) {
                    vzq0Var3 = lexVar.a;
                    i21 &= -897;
                } else {
                    vzq0Var3 = vzq0Var;
                }
                if (i20 != 0) {
                    i24 = i21;
                    i25 = i5;
                    i26 = i23;
                    vu30Var9 = null;
                } else {
                    i24 = i21;
                    i25 = i5;
                    i26 = i23;
                    vu30Var9 = vu30Var3;
                }
            } else {
                if (i27 != 0) {
                    qim0Var2 = nim0.a;
                } else {
                    qim0Var2 = qim0Var;
                }
                if (i6 == 0) {
                }
                if (i8 != 0) {
                    str2 = null;
                }
                if (i10 != 0) {
                    maxVar2 = jax.a;
                }
                if (i12 != 0) {
                    vu30Var4 = null;
                }
                if (i14 != 0) {
                    vu30Var8 = null;
                } else {
                    vu30Var8 = vu30Var2;
                }
                if ((i4 & 512) != 0) {
                    idn0VarY = zso1.Y(x340Var2);
                    i5 &= -1879048193;
                } else {
                    idn0VarY = idn0Var;
                }
                if ((i4 & 1024) != 0) {
                    ga80VarO = vno1.o(er31.a, x340Var2, 0);
                    i21 &= -15;
                } else {
                    ga80VarO = ga80Var;
                }
                if (i17 == 0) {
                }
                if ((i4 & 4096) != 0) {
                    vzq0Var3 = lexVar.a;
                    i21 &= -897;
                } else {
                    vzq0Var3 = vzq0Var;
                }
                if (i20 != 0) {
                    i24 = i21;
                    i25 = i5;
                    i26 = i23;
                    vu30Var9 = null;
                } else {
                    i24 = i21;
                    i25 = i5;
                    i26 = i23;
                    vu30Var9 = vu30Var3;
                }
            }
            x340Var2.s();
            vu30 vu30Var18 = vu30Var9;
            int i212 = i26;
            i1k0.c(gbxVar, qexVar2, lexVar, voo1.x(x340Var2, i26), maxVar2, z4, idn0VarY, ga80VarO, qim0Var2, apo.r(1338797495, new eex(vzq0Var3, str2, lexVar, vu30Var4, vu30Var18, vu30Var8), x340Var2), x340Var2, (i25 & 896) | (i25 & 14) | 805306368 | (i25 & 112) | ((i25 >> 6) & 57344) | ((i24 << 12) & 458752) | ((i25 >> 9) & 3670016) | ((i24 << 21) & 29360128) | ((i25 << 15) & 234881024));
            x340Var = x340Var2;
            vu30 vu30Var19 = vu30Var8;
            z3 = z4;
            str3 = str2;
            vu30Var7 = vu30Var19;
            maxVar3 = maxVar2;
            vu30Var6 = vu30Var4;
            idn0Var2 = idn0VarY;
            vu30Var5 = vu30Var18;
            vzq0Var2 = vzq0Var3;
            ga80Var2 = ga80VarO;
            i22 = i212;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            i22 = i;
            ga80Var2 = ga80Var;
            z3 = z;
            vu30Var5 = vu30Var3;
            str3 = str2;
            maxVar3 = maxVar2;
            vu30Var6 = vu30Var4;
            vu30Var7 = vu30Var2;
            idn0Var2 = idn0Var;
            vzq0Var2 = vzq0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fex(gbxVar, qexVar, lexVar, qim0Var2, i22, str3, maxVar3, vu30Var6, vu30Var7, idn0Var2, ga80Var2, z3, vzq0Var2, vu30Var5, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0144  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:105:0x015b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0166  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x0136  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:96:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x013f  */
    public static final void f(gbx gbxVar, qex qexVar, lex lexVar, qim0 qim0Var, String str, vu30 vu30Var, vu30 vu30Var2, idn0 idn0Var, ga80 ga80Var, vzq0 vzq0Var, vu30 vu30Var3, b0k b0kVar, int i, int i2, int i3) {
        String str2;
        int i4;
        vu30 vu30Var4;
        int i5;
        vu30 vu30Var5;
        int i6;
        idn0 idn0Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        vu30 vu30Var6;
        vu30 vu30Var7;
        idn0 idn0Var3;
        vu30 vu30Var8;
        ga80 ga80Var2;
        vzq0 vzq0Var2;
        h311 h311VarV;
        idn0 idn0VarY;
        int i13;
        ga80 ga80VarO;
        vzq0 vzq0Var3;
        int i14;
        vzq0 vzq0Var4;
        vu30 vu30Var9;
        vu30 vu30Var10;
        int i15;
        vu30 vu30Var11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1998789893);
        int i16 = (x340Var.g(gbxVar) ? 4 : 2) | i | (x340Var.g(qexVar) ? 32 : 16) | (x340Var.g(lexVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i16 |= x340Var.h(true) ? 2048 : 1024;
        }
        int i17 = i16 | (x340Var.g(qim0Var) ? 16384 : 8192);
        int i18 = i3 & 32;
        if (i18 != 0) {
            i4 = i17 | 196608;
            str2 = str;
        } else {
            str2 = str;
            i4 = i17 | (x340Var.g(str2) ? 131072 : 65536);
        }
        int i19 = i3 & 64;
        if (i19 == 0) {
            if ((1572864 & i) == 0) {
                vu30Var4 = vu30Var;
                i4 |= x340Var.i(vu30Var4) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                i4 |= 12582912;
                vu30Var5 = vu30Var2;
            } else {
                vu30Var5 = vu30Var2;
                if ((i & 12582912) == 0) {
                    if (x340Var.i(vu30Var5)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
            }
            if ((i3 & 256) == 0) {
                idn0Var2 = idn0Var;
                int i20 = x340Var.g(idn0Var2) ? 67108864 : 33554432;
                i7 = i4 | i20 | 268435456;
                i8 = i2 | 22;
                i9 = i3 & 4096;
                if (i9 != 0) {
                    i8 = 406;
                    i10 = i9;
                } else {
                    i10 = i9;
                    if ((i2 & 384) != 0) {
                        if (x340Var.i(vu30Var3)) {
                            i11 = 256;
                        } else {
                            i11 = 128;
                        }
                        i8 |= i11;
                    }
                }
                i12 = i8;
                if ((i7 & 306783379) == 306783378 || (i12 & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i7 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i19 != 0) {
                            vu30Var4 = null;
                        }
                        if (i5 != 0) {
                            vu30Var5 = null;
                        }
                        if ((i3 & 256) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i13 = i7 & (-234881025);
                        } else {
                            idn0VarY = idn0Var2;
                            i13 = i7;
                        }
                        ga80VarO = vno1.o(er31.a, x340Var, 0);
                        int i21 = (-1879048193) & i13;
                        vzq0Var3 = lexVar.a;
                        i14 = i12 & (-113);
                        if (i10 != 0) {
                            vzq0Var4 = vzq0Var3;
                            vu30Var9 = vu30Var5;
                            vu30Var10 = null;
                        } else {
                            vzq0Var4 = vzq0Var3;
                            vu30Var9 = vu30Var5;
                            vu30Var10 = vu30Var3;
                        }
                        i15 = i21;
                        vu30Var11 = vu30Var4;
                    } else {
                        x340Var.b0();
                        i15 = ((i3 & 256) != 0 ? i7 & (-234881025) : i7) & (-1879048193);
                        i14 = i12 & (-113);
                        vu30Var10 = vu30Var3;
                        vu30Var9 = vu30Var5;
                        idn0VarY = idn0Var2;
                        str2 = str2;
                        vu30Var11 = vu30Var4;
                        ga80VarO = ga80Var;
                        vzq0Var4 = vzq0Var;
                    }
                    x340Var.s();
                    int i22 = (i15 & 1022) | ((i15 >> 3) & 7168) | (458752 & i15);
                    int i23 = i15 << 3;
                    e(gbxVar, qexVar, lexVar, qim0Var, 0, str2, jax.a, vu30Var11, vu30Var9, idn0VarY, ga80VarO, false, vzq0Var4, vu30Var10, x340Var, i22 | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), 48 | ((i14 << 3) & 7168), 16);
                    vu30Var8 = vu30Var11;
                    vu30Var7 = vu30Var9;
                    idn0Var3 = idn0VarY;
                    ga80Var2 = ga80VarO;
                    vzq0Var2 = vzq0Var4;
                    vu30Var6 = vu30Var10;
                } else {
                    x340Var.b0();
                    vu30Var6 = vu30Var3;
                    vu30Var7 = vu30Var5;
                    idn0Var3 = idn0Var2;
                    str2 = str2;
                    vu30Var8 = vu30Var4;
                    ga80Var2 = ga80Var;
                    vzq0Var2 = vzq0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new iex(gbxVar, qexVar, lexVar, qim0Var, str2, vu30Var8, vu30Var7, idn0Var3, ga80Var2, vzq0Var2, vu30Var6, i, i2, i3);
                }
            }
            idn0Var2 = idn0Var;
            i7 = i4 | i20 | 268435456;
            i8 = i2 | 22;
            i9 = i3 & 4096;
            if (i9 != 0) {
                i8 = 406;
                i10 = i9;
            } else {
                i10 = i9;
                if ((i2 & 384) != 0) {
                    if (x340Var.i(vu30Var3)) {
                        i11 = 256;
                    } else {
                        i11 = 128;
                    }
                    i8 |= i11;
                }
            }
            i12 = i8;
            if ((i7 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        vu30Var4 = null;
                    }
                    if (i5 != 0) {
                        vu30Var5 = null;
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i13 = i7 & (-234881025);
                    } else {
                        idn0VarY = idn0Var2;
                        i13 = i7;
                    }
                    ga80VarO = vno1.o(er31.a, x340Var, 0);
                    int i24 = (-1879048193) & i13;
                    vzq0Var3 = lexVar.a;
                    i14 = i12 & (-113);
                    if (i10 != 0) {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = null;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var3;
                    }
                    i15 = i24;
                    vu30Var11 = vu30Var4;
                } else {
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        vu30Var4 = null;
                    }
                    if (i5 != 0) {
                        vu30Var5 = null;
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i13 = i7 & (-234881025);
                    } else {
                        idn0VarY = idn0Var2;
                        i13 = i7;
                    }
                    ga80VarO = vno1.o(er31.a, x340Var, 0);
                    int i25 = (-1879048193) & i13;
                    vzq0Var3 = lexVar.a;
                    i14 = i12 & (-113);
                    if (i10 != 0) {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = null;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var3;
                    }
                    i15 = i25;
                    vu30Var11 = vu30Var4;
                }
                x340Var.s();
                int i26 = (i15 & 1022) | ((i15 >> 3) & 7168) | (458752 & i15);
                int i27 = i15 << 3;
                e(gbxVar, qexVar, lexVar, qim0Var, 0, str2, jax.a, vu30Var11, vu30Var9, idn0VarY, ga80VarO, false, vzq0Var4, vu30Var10, x340Var, i26 | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), 48 | ((i14 << 3) & 7168), 16);
                vu30Var8 = vu30Var11;
                vu30Var7 = vu30Var9;
                idn0Var3 = idn0VarY;
                ga80Var2 = ga80VarO;
                vzq0Var2 = vzq0Var4;
                vu30Var6 = vu30Var10;
            } else {
                x340Var.b0();
                vu30Var6 = vu30Var3;
                vu30Var7 = vu30Var5;
                idn0Var3 = idn0Var2;
                str2 = str2;
                vu30Var8 = vu30Var4;
                ga80Var2 = ga80Var;
                vzq0Var2 = vzq0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new iex(gbxVar, qexVar, lexVar, qim0Var, str2, vu30Var8, vu30Var7, idn0Var3, ga80Var2, vzq0Var2, vu30Var6, i, i2, i3);
            }
        }
        i4 |= 1572864;
        vu30Var4 = vu30Var;
        i5 = i3 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            vu30Var5 = vu30Var2;
        } else {
            vu30Var5 = vu30Var2;
            if ((i & 12582912) == 0) {
                if (x340Var.i(vu30Var5)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
        }
        if ((i3 & 256) == 0) {
            idn0Var2 = idn0Var;
            if (x340Var.g(idn0Var2)) {
            }
            i7 = i4 | i20 | 268435456;
            i8 = i2 | 22;
            i9 = i3 & 4096;
            if (i9 != 0) {
                i8 = 406;
                i10 = i9;
            } else {
                i10 = i9;
                if ((i2 & 384) != 0) {
                    if (x340Var.i(vu30Var3)) {
                        i11 = 256;
                    } else {
                        i11 = 128;
                    }
                    i8 |= i11;
                }
            }
            i12 = i8;
            if ((i7 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        vu30Var4 = null;
                    }
                    if (i5 != 0) {
                        vu30Var5 = null;
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i13 = i7 & (-234881025);
                    } else {
                        idn0VarY = idn0Var2;
                        i13 = i7;
                    }
                    ga80VarO = vno1.o(er31.a, x340Var, 0);
                    int i28 = (-1879048193) & i13;
                    vzq0Var3 = lexVar.a;
                    i14 = i12 & (-113);
                    if (i10 != 0) {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = null;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var3;
                    }
                    i15 = i28;
                    vu30Var11 = vu30Var4;
                } else {
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if (i19 != 0) {
                        vu30Var4 = null;
                    }
                    if (i5 != 0) {
                        vu30Var5 = null;
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i13 = i7 & (-234881025);
                    } else {
                        idn0VarY = idn0Var2;
                        i13 = i7;
                    }
                    ga80VarO = vno1.o(er31.a, x340Var, 0);
                    int i29 = (-1879048193) & i13;
                    vzq0Var3 = lexVar.a;
                    i14 = i12 & (-113);
                    if (i10 != 0) {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = null;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var3;
                    }
                    i15 = i29;
                    vu30Var11 = vu30Var4;
                }
                x340Var.s();
                int i210 = (i15 & 1022) | ((i15 >> 3) & 7168) | (458752 & i15);
                int i211 = i15 << 3;
                e(gbxVar, qexVar, lexVar, qim0Var, 0, str2, jax.a, vu30Var11, vu30Var9, idn0VarY, ga80VarO, false, vzq0Var4, vu30Var10, x340Var, i210 | (29360128 & i211) | (234881024 & i211) | (i211 & 1879048192), 48 | ((i14 << 3) & 7168), 16);
                vu30Var8 = vu30Var11;
                vu30Var7 = vu30Var9;
                idn0Var3 = idn0VarY;
                ga80Var2 = ga80VarO;
                vzq0Var2 = vzq0Var4;
                vu30Var6 = vu30Var10;
            } else {
                x340Var.b0();
                vu30Var6 = vu30Var3;
                vu30Var7 = vu30Var5;
                idn0Var3 = idn0Var2;
                str2 = str2;
                vu30Var8 = vu30Var4;
                ga80Var2 = ga80Var;
                vzq0Var2 = vzq0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new iex(gbxVar, qexVar, lexVar, qim0Var, str2, vu30Var8, vu30Var7, idn0Var3, ga80Var2, vzq0Var2, vu30Var6, i, i2, i3);
            }
        }
        idn0Var2 = idn0Var;
        i7 = i4 | i20 | 268435456;
        i8 = i2 | 22;
        i9 = i3 & 4096;
        if (i9 != 0) {
            i8 = 406;
            i10 = i9;
        } else {
            i10 = i9;
            if ((i2 & 384) != 0) {
                if (x340Var.i(vu30Var3)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i8 |= i11;
            }
        }
        i12 = i8;
        if ((i7 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (x340Var.Y(i7 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    str2 = null;
                }
                if (i19 != 0) {
                    vu30Var4 = null;
                }
                if (i5 != 0) {
                    vu30Var5 = null;
                }
                if ((i3 & 256) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i13 = i7 & (-234881025);
                } else {
                    idn0VarY = idn0Var2;
                    i13 = i7;
                }
                ga80VarO = vno1.o(er31.a, x340Var, 0);
                int i212 = (-1879048193) & i13;
                vzq0Var3 = lexVar.a;
                i14 = i12 & (-113);
                if (i10 != 0) {
                    vzq0Var4 = vzq0Var3;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = null;
                } else {
                    vzq0Var4 = vzq0Var3;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var3;
                }
                i15 = i212;
                vu30Var11 = vu30Var4;
            } else {
                if (i18 != 0) {
                    str2 = null;
                }
                if (i19 != 0) {
                    vu30Var4 = null;
                }
                if (i5 != 0) {
                    vu30Var5 = null;
                }
                if ((i3 & 256) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i13 = i7 & (-234881025);
                } else {
                    idn0VarY = idn0Var2;
                    i13 = i7;
                }
                ga80VarO = vno1.o(er31.a, x340Var, 0);
                int i213 = (-1879048193) & i13;
                vzq0Var3 = lexVar.a;
                i14 = i12 & (-113);
                if (i10 != 0) {
                    vzq0Var4 = vzq0Var3;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = null;
                } else {
                    vzq0Var4 = vzq0Var3;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var3;
                }
                i15 = i213;
                vu30Var11 = vu30Var4;
            }
            x340Var.s();
            int i214 = (i15 & 1022) | ((i15 >> 3) & 7168) | (458752 & i15);
            int i215 = i15 << 3;
            e(gbxVar, qexVar, lexVar, qim0Var, 0, str2, jax.a, vu30Var11, vu30Var9, idn0VarY, ga80VarO, false, vzq0Var4, vu30Var10, x340Var, i214 | (29360128 & i215) | (234881024 & i215) | (i215 & 1879048192), 48 | ((i14 << 3) & 7168), 16);
            vu30Var8 = vu30Var11;
            vu30Var7 = vu30Var9;
            idn0Var3 = idn0VarY;
            ga80Var2 = ga80VarO;
            vzq0Var2 = vzq0Var4;
            vu30Var6 = vu30Var10;
        } else {
            x340Var.b0();
            vu30Var6 = vu30Var3;
            vu30Var7 = vu30Var5;
            idn0Var3 = idn0Var2;
            str2 = str2;
            vu30Var8 = vu30Var4;
            ga80Var2 = ga80Var;
            vzq0Var2 = vzq0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iex(gbxVar, qexVar, lexVar, qim0Var, str2, vu30Var8, vu30Var7, idn0Var3, ga80Var2, vzq0Var2, vu30Var6, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0164  */
    /* JADX WARN: Code duplicated, block: B:125:0x016c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x0175  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01da  */
    /* JADX WARN: Code duplicated, block: B:152:0x01de  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:168:0x020b  */
    /* JADX WARN: Code duplicated, block: B:169:0x020e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0216  */
    /* JADX WARN: Code duplicated, block: B:173:0x021b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0239  */
    /* JADX WARN: Code duplicated, block: B:178:0x023c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0242  */
    /* JADX WARN: Code duplicated, block: B:184:0x0249  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:189:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc A[PHI: r24
      0x00dc: PHI (r24v9 int) = (r24v0 int), (r24v3 int), (r24v4 int) binds: [B:75:0x00da, B:83:0x00f0, B:82:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    public static final void g(boolean z, iu30 iu30Var, qex qexVar, lex lexVar, qim0 qim0Var, int i, qex qexVar2, String str, max maxVar, vu30 vu30Var, vu30 vu30Var2, idn0 idn0Var, ga80 ga80Var, boolean z2, vzq0 vzq0Var, vu30 vu30Var3, b0k b0kVar, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        max maxVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z3;
        qim0 qim0Var2;
        int i24;
        qex qexVar3;
        idn0 idn0Var2;
        ga80 ga80Var2;
        boolean z4;
        vzq0 vzq0Var2;
        max maxVar3;
        vu30 vu30Var4;
        vu30 vu30Var5;
        h311 h311VarV;
        int i25;
        qim0 qim0Var3;
        qim0 qim0Var4;
        qex qexVar4;
        max maxVar4;
        vu30 vu30Var6;
        vu30 vu30Var7;
        int i26;
        boolean z5;
        vzq0 vzq0Var3;
        qex qexVar5;
        idn0 idn0Var3;
        boolean z6;
        vzq0 vzq0Var4;
        int i27;
        vu30 vu30Var8;
        qim0 qim0Var5;
        ga80 ga80Var3;
        int i28;
        qex qexVar6;
        boolean z7;
        int i29;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-38591148);
        if ((i2 & 6) == 0) {
            i5 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= x340Var.g(qexVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= x340Var.g(lexVar) ? 2048 : 1024;
        }
        int i30 = i4 & 16;
        if (i30 == 0) {
            if ((i2 & 24576) == 0) {
                i5 |= x340Var.g(qim0Var) ? 16384 : 8192;
            }
            i6 = i5 | 196608;
            i7 = i4 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    if (x340Var.g(qexVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i2 & 12582912) == 0) {
                        if (x340Var.g(str2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i6 |= i10;
                    }
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i6 |= 100663296;
                    maxVar2 = maxVar;
                } else {
                    maxVar2 = maxVar;
                    if ((i2 & 100663296) == 0) {
                        if (x340Var.g(maxVar2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i4 & 512;
                i14 = 805306368;
                if (i13 == 0) {
                    i6 |= i14;
                } else if ((i2 & 805306368) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i6 |= i14;
                }
                i15 = i6;
                i16 = i4 & 1024;
                if (i16 != 0) {
                    i17 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (x340Var.i(vu30Var2)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i3 | i18;
                } else {
                    i17 = i3;
                }
                if ((i3 & 48) == 0) {
                    i17 |= 16;
                }
                i19 = i17;
                if ((i3 & 384) == 0) {
                    i19 |= 128;
                }
                i20 = i4 & 8192;
                if (i20 != 0) {
                    i21 = i19;
                    if ((i3 & 3072) == 0) {
                        if (x340Var.h(z2)) {
                            i22 = 2048;
                        } else {
                            i22 = 1024;
                        }
                        i21 |= i22;
                    }
                    if ((i3 & 24576) != 0) {
                        i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
                    }
                    if ((i3 & 196608) == 0) {
                        if (x340Var.i(vu30Var3)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i21 |= i29;
                    }
                    i23 = i21;
                    if ((i15 & 306783379) == 306783378 || (74899 & i23) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i15 & 1, z3)) {
                        x340Var.d0();
                        i25 = i2 & 1;
                        qim0Var3 = nim0.a;
                        if (i25 != 0 || x340Var.E()) {
                            if (i30 != 0) {
                                qim0Var4 = qim0Var3;
                            } else {
                                qim0Var4 = qim0Var;
                            }
                            if (i7 != 0) {
                                qexVar4 = pex.b;
                            } else {
                                qexVar4 = qexVar2;
                            }
                            if (i9 != 0) {
                                str2 = null;
                            }
                            if (i11 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if (i13 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var;
                            }
                            vu30Var7 = i16 == 0 ? vu30Var2 : null;
                            idn0 idn0VarY = zso1.Y(x340Var);
                            qim0 qim0Var6 = qim0Var4;
                            ga80 ga80VarO = vno1.o(er31.a, x340Var, 0);
                            i26 = i23 & (-1009);
                            if (i20 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i4 & 16384) != 0) {
                                vzq0Var3 = lexVar.a;
                                i26 = i23 & (-58353);
                            } else {
                                vzq0Var3 = vzq0Var;
                            }
                            boolean z8 = z5;
                            qexVar5 = qexVar4;
                            idn0Var3 = idn0VarY;
                            z6 = z8;
                            vzq0Var4 = vzq0Var3;
                            i27 = i26;
                            vu30Var8 = vu30Var6;
                            qim0Var5 = qim0Var6;
                            maxVar2 = maxVar4;
                            ga80Var3 = ga80VarO;
                            i28 = 1;
                        } else {
                            x340Var.b0();
                            int i31 = i23 & (-1009);
                            if ((i4 & 16384) != 0) {
                                i31 = i23 & (-58353);
                            }
                            qim0Var5 = qim0Var;
                            qexVar5 = qexVar2;
                            vu30Var8 = vu30Var;
                            vu30Var7 = vu30Var2;
                            idn0Var3 = idn0Var;
                            ga80Var3 = ga80Var;
                            z6 = z2;
                            vzq0Var4 = vzq0Var;
                            i27 = i31;
                            i28 = i;
                        }
                        x340Var.s();
                        int i32 = i28;
                        cr31 cr31VarX = voo1.x(x340Var, i32);
                        if (z) {
                            qexVar6 = qexVar;
                        } else {
                            qexVar6 = qexVar5;
                        }
                        if (z || !(qexVar instanceof nex)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        uwr uwrVar = cbx.a;
                        avw0 avw0Var = cbx.b(x340Var).c;
                        vu30 vu30Var9 = vu30Var8;
                        idn0 idn0Var4 = idn0Var3;
                        String str3 = str2;
                        vu30 vu30Var10 = vu30Var7;
                        vzq0 vzq0Var5 = vzq0Var4;
                        ga80 ga80Var4 = ga80Var3;
                        max maxVar5 = maxVar2;
                        boolean z9 = z6;
                        i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX, maxVar5, z9, idn0Var4, ga80Var4, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX)), apo.r(-1805881474, new gex(vzq0Var5, str3, lexVar, vu30Var9, vu30Var3, vu30Var10), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                        maxVar3 = maxVar5;
                        z4 = z9;
                        idn0Var2 = idn0Var4;
                        ga80Var2 = ga80Var4;
                        qim0Var2 = qim0Var5;
                        qexVar3 = qexVar5;
                        str2 = str3;
                        vu30Var4 = vu30Var9;
                        vu30Var5 = vu30Var10;
                        i24 = i32;
                        vzq0Var2 = vzq0Var5;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        i24 = i;
                        qexVar3 = qexVar2;
                        idn0Var2 = idn0Var;
                        ga80Var2 = ga80Var;
                        z4 = z2;
                        vzq0Var2 = vzq0Var;
                        maxVar3 = maxVar2;
                        vu30Var4 = vu30Var;
                        vu30Var5 = vu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
                    }
                }
                i21 = i19 | 3072;
                if ((i3 & 24576) != 0) {
                    i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
                }
                if ((i3 & 196608) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i21 |= i29;
                }
                i23 = i21;
                if ((i15 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i15 & 1, z3)) {
                    x340Var.d0();
                    i25 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i25 != 0) {
                        if (i30 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i7 != 0) {
                            qexVar4 = pex.b;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        if (i11 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i13 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var;
                        }
                        if (i16 == 0) {
                        }
                        idn0 idn0VarY2 = zso1.Y(x340Var);
                        qim0 qim0Var7 = qim0Var4;
                        ga80 ga80VarO2 = vno1.o(er31.a, x340Var, 0);
                        i26 = i23 & (-1009);
                        if (i20 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 16384) != 0) {
                            vzq0Var3 = lexVar.a;
                            i26 = i23 & (-58353);
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        boolean z10 = z5;
                        qexVar5 = qexVar4;
                        idn0Var3 = idn0VarY2;
                        z6 = z10;
                        vzq0Var4 = vzq0Var3;
                        i27 = i26;
                        vu30Var8 = vu30Var6;
                        qim0Var5 = qim0Var7;
                        maxVar2 = maxVar4;
                        ga80Var3 = ga80VarO2;
                        i28 = 1;
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i7 != 0) {
                            qexVar4 = pex.b;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        if (i11 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i13 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var;
                        }
                        if (i16 == 0) {
                        }
                        idn0 idn0VarY3 = zso1.Y(x340Var);
                        qim0 qim0Var8 = qim0Var4;
                        ga80 ga80VarO3 = vno1.o(er31.a, x340Var, 0);
                        i26 = i23 & (-1009);
                        if (i20 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 16384) != 0) {
                            vzq0Var3 = lexVar.a;
                            i26 = i23 & (-58353);
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        boolean z11 = z5;
                        qexVar5 = qexVar4;
                        idn0Var3 = idn0VarY3;
                        z6 = z11;
                        vzq0Var4 = vzq0Var3;
                        i27 = i26;
                        vu30Var8 = vu30Var6;
                        qim0Var5 = qim0Var8;
                        maxVar2 = maxVar4;
                        ga80Var3 = ga80VarO3;
                        i28 = 1;
                    }
                    x340Var.s();
                    int i33 = i28;
                    cr31 cr31VarX2 = voo1.x(x340Var, i33);
                    if (z) {
                        qexVar6 = qexVar;
                    } else {
                        qexVar6 = qexVar5;
                    }
                    if (z) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    uwr uwrVar2 = cbx.a;
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    vu30 vu30Var11 = vu30Var8;
                    idn0 idn0Var5 = idn0Var3;
                    String str4 = str2;
                    vu30 vu30Var12 = vu30Var7;
                    vzq0 vzq0Var6 = vzq0Var4;
                    ga80 ga80Var5 = ga80Var3;
                    max maxVar6 = maxVar2;
                    boolean z12 = z6;
                    i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX2, maxVar6, z12, idn0Var5, ga80Var5, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX2)), apo.r(-1805881474, new gex(vzq0Var6, str4, lexVar, vu30Var11, vu30Var3, vu30Var12), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                    maxVar3 = maxVar6;
                    z4 = z12;
                    idn0Var2 = idn0Var5;
                    ga80Var2 = ga80Var5;
                    qim0Var2 = qim0Var5;
                    qexVar3 = qexVar5;
                    str2 = str4;
                    vu30Var4 = vu30Var11;
                    vu30Var5 = vu30Var12;
                    i24 = i33;
                    vzq0Var2 = vzq0Var6;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    i24 = i;
                    qexVar3 = qexVar2;
                    idn0Var2 = idn0Var;
                    ga80Var2 = ga80Var;
                    z4 = z2;
                    vzq0Var2 = vzq0Var;
                    maxVar3 = maxVar2;
                    vu30Var4 = vu30Var;
                    vu30Var5 = vu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
                }
            }
            i6 = i5 | 1769472;
            i9 = i4 & 128;
            if (i9 != 0) {
                i6 |= 12582912;
                str2 = str;
            } else {
                str2 = str;
                if ((i2 & 12582912) == 0) {
                    if (x340Var.g(str2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i6 |= i10;
                }
            }
            i11 = i4 & 256;
            if (i11 != 0) {
                i6 |= 100663296;
                maxVar2 = maxVar;
            } else {
                maxVar2 = maxVar;
                if ((i2 & 100663296) == 0) {
                    if (x340Var.g(maxVar2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i6 |= i12;
                }
            }
            i13 = i4 & 512;
            i14 = 805306368;
            if (i13 == 0) {
                i6 |= i14;
            } else if ((i2 & 805306368) == 0) {
                if (x340Var.i(vu30Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i6 |= i14;
            }
            i15 = i6;
            i16 = i4 & 1024;
            if (i16 != 0) {
                i17 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i3 | i18;
            } else {
                i17 = i3;
            }
            if ((i3 & 48) == 0) {
                i17 |= 16;
            }
            i19 = i17;
            if ((i3 & 384) == 0) {
                i19 |= 128;
            }
            i20 = i4 & 8192;
            if (i20 != 0) {
                i21 = i19;
                if ((i3 & 3072) == 0) {
                    if (x340Var.h(z2)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i21 |= i22;
                }
                if ((i3 & 24576) != 0) {
                    i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
                }
                if ((i3 & 196608) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i21 |= i29;
                }
                i23 = i21;
                if ((i15 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i15 & 1, z3)) {
                    x340Var.d0();
                    i25 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i25 != 0) {
                        if (i30 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i7 != 0) {
                            qexVar4 = pex.b;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        if (i11 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i13 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var;
                        }
                        if (i16 == 0) {
                        }
                        idn0 idn0VarY4 = zso1.Y(x340Var);
                        qim0 qim0Var9 = qim0Var4;
                        ga80 ga80VarO4 = vno1.o(er31.a, x340Var, 0);
                        i26 = i23 & (-1009);
                        if (i20 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 16384) != 0) {
                            vzq0Var3 = lexVar.a;
                            i26 = i23 & (-58353);
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        boolean z13 = z5;
                        qexVar5 = qexVar4;
                        idn0Var3 = idn0VarY4;
                        z6 = z13;
                        vzq0Var4 = vzq0Var3;
                        i27 = i26;
                        vu30Var8 = vu30Var6;
                        qim0Var5 = qim0Var9;
                        maxVar2 = maxVar4;
                        ga80Var3 = ga80VarO4;
                        i28 = 1;
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i7 != 0) {
                            qexVar4 = pex.b;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        if (i11 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i13 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var;
                        }
                        if (i16 == 0) {
                        }
                        idn0 idn0VarY5 = zso1.Y(x340Var);
                        qim0 qim0Var10 = qim0Var4;
                        ga80 ga80VarO5 = vno1.o(er31.a, x340Var, 0);
                        i26 = i23 & (-1009);
                        if (i20 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 16384) != 0) {
                            vzq0Var3 = lexVar.a;
                            i26 = i23 & (-58353);
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        boolean z14 = z5;
                        qexVar5 = qexVar4;
                        idn0Var3 = idn0VarY5;
                        z6 = z14;
                        vzq0Var4 = vzq0Var3;
                        i27 = i26;
                        vu30Var8 = vu30Var6;
                        qim0Var5 = qim0Var10;
                        maxVar2 = maxVar4;
                        ga80Var3 = ga80VarO5;
                        i28 = 1;
                    }
                    x340Var.s();
                    int i34 = i28;
                    cr31 cr31VarX3 = voo1.x(x340Var, i34);
                    if (z) {
                        qexVar6 = qexVar;
                    } else {
                        qexVar6 = qexVar5;
                    }
                    if (z) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    uwr uwrVar3 = cbx.a;
                    avw0 avw0Var3 = cbx.b(x340Var).c;
                    vu30 vu30Var13 = vu30Var8;
                    idn0 idn0Var6 = idn0Var3;
                    String str5 = str2;
                    vu30 vu30Var14 = vu30Var7;
                    vzq0 vzq0Var7 = vzq0Var4;
                    ga80 ga80Var6 = ga80Var3;
                    max maxVar7 = maxVar2;
                    boolean z15 = z6;
                    i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX3, maxVar7, z15, idn0Var6, ga80Var6, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX3)), apo.r(-1805881474, new gex(vzq0Var7, str5, lexVar, vu30Var13, vu30Var3, vu30Var14), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                    maxVar3 = maxVar7;
                    z4 = z15;
                    idn0Var2 = idn0Var6;
                    ga80Var2 = ga80Var6;
                    qim0Var2 = qim0Var5;
                    qexVar3 = qexVar5;
                    str2 = str5;
                    vu30Var4 = vu30Var13;
                    vu30Var5 = vu30Var14;
                    i24 = i34;
                    vzq0Var2 = vzq0Var7;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    i24 = i;
                    qexVar3 = qexVar2;
                    idn0Var2 = idn0Var;
                    ga80Var2 = ga80Var;
                    z4 = z2;
                    vzq0Var2 = vzq0Var;
                    maxVar3 = maxVar2;
                    vu30Var4 = vu30Var;
                    vu30Var5 = vu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
                }
            }
            i21 = i19 | 3072;
            if ((i3 & 24576) != 0) {
                i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
            }
            if ((i3 & 196608) == 0) {
                if (x340Var.i(vu30Var3)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i21 |= i29;
            }
            i23 = i21;
            if ((i15 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i15 & 1, z3)) {
                x340Var.d0();
                i25 = i2 & 1;
                qim0Var3 = nim0.a;
                if (i25 != 0) {
                    if (i30 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i7 != 0) {
                        qexVar4 = pex.b;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    if (i11 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i13 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var;
                    }
                    if (i16 == 0) {
                    }
                    idn0 idn0VarY6 = zso1.Y(x340Var);
                    qim0 qim0Var11 = qim0Var4;
                    ga80 ga80VarO6 = vno1.o(er31.a, x340Var, 0);
                    i26 = i23 & (-1009);
                    if (i20 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 16384) != 0) {
                        vzq0Var3 = lexVar.a;
                        i26 = i23 & (-58353);
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    boolean z16 = z5;
                    qexVar5 = qexVar4;
                    idn0Var3 = idn0VarY6;
                    z6 = z16;
                    vzq0Var4 = vzq0Var3;
                    i27 = i26;
                    vu30Var8 = vu30Var6;
                    qim0Var5 = qim0Var11;
                    maxVar2 = maxVar4;
                    ga80Var3 = ga80VarO6;
                    i28 = 1;
                } else {
                    if (i30 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i7 != 0) {
                        qexVar4 = pex.b;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    if (i11 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i13 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var;
                    }
                    if (i16 == 0) {
                    }
                    idn0 idn0VarY7 = zso1.Y(x340Var);
                    qim0 qim0Var12 = qim0Var4;
                    ga80 ga80VarO7 = vno1.o(er31.a, x340Var, 0);
                    i26 = i23 & (-1009);
                    if (i20 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 16384) != 0) {
                        vzq0Var3 = lexVar.a;
                        i26 = i23 & (-58353);
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    boolean z17 = z5;
                    qexVar5 = qexVar4;
                    idn0Var3 = idn0VarY7;
                    z6 = z17;
                    vzq0Var4 = vzq0Var3;
                    i27 = i26;
                    vu30Var8 = vu30Var6;
                    qim0Var5 = qim0Var12;
                    maxVar2 = maxVar4;
                    ga80Var3 = ga80VarO7;
                    i28 = 1;
                }
                x340Var.s();
                int i35 = i28;
                cr31 cr31VarX4 = voo1.x(x340Var, i35);
                if (z) {
                    qexVar6 = qexVar;
                } else {
                    qexVar6 = qexVar5;
                }
                if (z) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                uwr uwrVar4 = cbx.a;
                avw0 avw0Var4 = cbx.b(x340Var).c;
                vu30 vu30Var15 = vu30Var8;
                idn0 idn0Var7 = idn0Var3;
                String str6 = str2;
                vu30 vu30Var16 = vu30Var7;
                vzq0 vzq0Var8 = vzq0Var4;
                ga80 ga80Var7 = ga80Var3;
                max maxVar8 = maxVar2;
                boolean z18 = z6;
                i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX4, maxVar8, z18, idn0Var7, ga80Var7, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX4)), apo.r(-1805881474, new gex(vzq0Var8, str6, lexVar, vu30Var15, vu30Var3, vu30Var16), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                maxVar3 = maxVar8;
                z4 = z18;
                idn0Var2 = idn0Var7;
                ga80Var2 = ga80Var7;
                qim0Var2 = qim0Var5;
                qexVar3 = qexVar5;
                str2 = str6;
                vu30Var4 = vu30Var15;
                vu30Var5 = vu30Var16;
                i24 = i35;
                vzq0Var2 = vzq0Var8;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                i24 = i;
                qexVar3 = qexVar2;
                idn0Var2 = idn0Var;
                ga80Var2 = ga80Var;
                z4 = z2;
                vzq0Var2 = vzq0Var;
                maxVar3 = maxVar2;
                vu30Var4 = vu30Var;
                vu30Var5 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
            }
        }
        i5 |= 24576;
        i6 = i5 | 196608;
        i7 = i4 & 64;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                if (x340Var.g(qexVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            }
            i9 = i4 & 128;
            if (i9 != 0) {
                i6 |= 12582912;
                str2 = str;
            } else {
                str2 = str;
                if ((i2 & 12582912) == 0) {
                    if (x340Var.g(str2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i6 |= i10;
                }
            }
            i11 = i4 & 256;
            if (i11 != 0) {
                i6 |= 100663296;
                maxVar2 = maxVar;
            } else {
                maxVar2 = maxVar;
                if ((i2 & 100663296) == 0) {
                    if (x340Var.g(maxVar2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i6 |= i12;
                }
            }
            i13 = i4 & 512;
            i14 = 805306368;
            if (i13 == 0) {
                i6 |= i14;
            } else if ((i2 & 805306368) == 0) {
                if (x340Var.i(vu30Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i6 |= i14;
            }
            i15 = i6;
            i16 = i4 & 1024;
            if (i16 != 0) {
                i17 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i3 | i18;
            } else {
                i17 = i3;
            }
            if ((i3 & 48) == 0) {
                i17 |= 16;
            }
            i19 = i17;
            if ((i3 & 384) == 0) {
                i19 |= 128;
            }
            i20 = i4 & 8192;
            if (i20 != 0) {
                i21 = i19;
                if ((i3 & 3072) == 0) {
                    if (x340Var.h(z2)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i21 |= i22;
                }
                if ((i3 & 24576) != 0) {
                    i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
                }
                if ((i3 & 196608) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i21 |= i29;
                }
                i23 = i21;
                if ((i15 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i15 & 1, z3)) {
                    x340Var.d0();
                    i25 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i25 != 0) {
                        if (i30 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i7 != 0) {
                            qexVar4 = pex.b;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        if (i11 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i13 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var;
                        }
                        if (i16 == 0) {
                        }
                        idn0 idn0VarY8 = zso1.Y(x340Var);
                        qim0 qim0Var13 = qim0Var4;
                        ga80 ga80VarO8 = vno1.o(er31.a, x340Var, 0);
                        i26 = i23 & (-1009);
                        if (i20 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 16384) != 0) {
                            vzq0Var3 = lexVar.a;
                            i26 = i23 & (-58353);
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        boolean z19 = z5;
                        qexVar5 = qexVar4;
                        idn0Var3 = idn0VarY8;
                        z6 = z19;
                        vzq0Var4 = vzq0Var3;
                        i27 = i26;
                        vu30Var8 = vu30Var6;
                        qim0Var5 = qim0Var13;
                        maxVar2 = maxVar4;
                        ga80Var3 = ga80VarO8;
                        i28 = 1;
                    } else {
                        if (i30 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i7 != 0) {
                            qexVar4 = pex.b;
                        } else {
                            qexVar4 = qexVar2;
                        }
                        if (i9 != 0) {
                            str2 = null;
                        }
                        if (i11 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i13 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var;
                        }
                        if (i16 == 0) {
                        }
                        idn0 idn0VarY9 = zso1.Y(x340Var);
                        qim0 qim0Var14 = qim0Var4;
                        ga80 ga80VarO9 = vno1.o(er31.a, x340Var, 0);
                        i26 = i23 & (-1009);
                        if (i20 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 16384) != 0) {
                            vzq0Var3 = lexVar.a;
                            i26 = i23 & (-58353);
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        boolean z110 = z5;
                        qexVar5 = qexVar4;
                        idn0Var3 = idn0VarY9;
                        z6 = z110;
                        vzq0Var4 = vzq0Var3;
                        i27 = i26;
                        vu30Var8 = vu30Var6;
                        qim0Var5 = qim0Var14;
                        maxVar2 = maxVar4;
                        ga80Var3 = ga80VarO9;
                        i28 = 1;
                    }
                    x340Var.s();
                    int i36 = i28;
                    cr31 cr31VarX5 = voo1.x(x340Var, i36);
                    if (z) {
                        qexVar6 = qexVar;
                    } else {
                        qexVar6 = qexVar5;
                    }
                    if (z) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    uwr uwrVar5 = cbx.a;
                    avw0 avw0Var5 = cbx.b(x340Var).c;
                    vu30 vu30Var17 = vu30Var8;
                    idn0 idn0Var8 = idn0Var3;
                    String str7 = str2;
                    vu30 vu30Var18 = vu30Var7;
                    vzq0 vzq0Var9 = vzq0Var4;
                    ga80 ga80Var8 = ga80Var3;
                    max maxVar9 = maxVar2;
                    boolean z111 = z6;
                    i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX5, maxVar9, z111, idn0Var8, ga80Var8, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX5)), apo.r(-1805881474, new gex(vzq0Var9, str7, lexVar, vu30Var17, vu30Var3, vu30Var18), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                    maxVar3 = maxVar9;
                    z4 = z111;
                    idn0Var2 = idn0Var8;
                    ga80Var2 = ga80Var8;
                    qim0Var2 = qim0Var5;
                    qexVar3 = qexVar5;
                    str2 = str7;
                    vu30Var4 = vu30Var17;
                    vu30Var5 = vu30Var18;
                    i24 = i36;
                    vzq0Var2 = vzq0Var9;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    i24 = i;
                    qexVar3 = qexVar2;
                    idn0Var2 = idn0Var;
                    ga80Var2 = ga80Var;
                    z4 = z2;
                    vzq0Var2 = vzq0Var;
                    maxVar3 = maxVar2;
                    vu30Var4 = vu30Var;
                    vu30Var5 = vu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
                }
            }
            i21 = i19 | 3072;
            if ((i3 & 24576) != 0) {
                i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
            }
            if ((i3 & 196608) == 0) {
                if (x340Var.i(vu30Var3)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i21 |= i29;
            }
            i23 = i21;
            if ((i15 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i15 & 1, z3)) {
                x340Var.d0();
                i25 = i2 & 1;
                qim0Var3 = nim0.a;
                if (i25 != 0) {
                    if (i30 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i7 != 0) {
                        qexVar4 = pex.b;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    if (i11 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i13 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var;
                    }
                    if (i16 == 0) {
                    }
                    idn0 idn0VarY10 = zso1.Y(x340Var);
                    qim0 qim0Var15 = qim0Var4;
                    ga80 ga80VarO10 = vno1.o(er31.a, x340Var, 0);
                    i26 = i23 & (-1009);
                    if (i20 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 16384) != 0) {
                        vzq0Var3 = lexVar.a;
                        i26 = i23 & (-58353);
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    boolean z112 = z5;
                    qexVar5 = qexVar4;
                    idn0Var3 = idn0VarY10;
                    z6 = z112;
                    vzq0Var4 = vzq0Var3;
                    i27 = i26;
                    vu30Var8 = vu30Var6;
                    qim0Var5 = qim0Var15;
                    maxVar2 = maxVar4;
                    ga80Var3 = ga80VarO10;
                    i28 = 1;
                } else {
                    if (i30 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i7 != 0) {
                        qexVar4 = pex.b;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    if (i11 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i13 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var;
                    }
                    if (i16 == 0) {
                    }
                    idn0 idn0VarY11 = zso1.Y(x340Var);
                    qim0 qim0Var16 = qim0Var4;
                    ga80 ga80VarO11 = vno1.o(er31.a, x340Var, 0);
                    i26 = i23 & (-1009);
                    if (i20 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 16384) != 0) {
                        vzq0Var3 = lexVar.a;
                        i26 = i23 & (-58353);
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    boolean z113 = z5;
                    qexVar5 = qexVar4;
                    idn0Var3 = idn0VarY11;
                    z6 = z113;
                    vzq0Var4 = vzq0Var3;
                    i27 = i26;
                    vu30Var8 = vu30Var6;
                    qim0Var5 = qim0Var16;
                    maxVar2 = maxVar4;
                    ga80Var3 = ga80VarO11;
                    i28 = 1;
                }
                x340Var.s();
                int i37 = i28;
                cr31 cr31VarX6 = voo1.x(x340Var, i37);
                if (z) {
                    qexVar6 = qexVar;
                } else {
                    qexVar6 = qexVar5;
                }
                if (z) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                uwr uwrVar6 = cbx.a;
                avw0 avw0Var6 = cbx.b(x340Var).c;
                vu30 vu30Var19 = vu30Var8;
                idn0 idn0Var9 = idn0Var3;
                String str8 = str2;
                vu30 vu30Var110 = vu30Var7;
                vzq0 vzq0Var10 = vzq0Var4;
                ga80 ga80Var9 = ga80Var3;
                max maxVar10 = maxVar2;
                boolean z114 = z6;
                i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX6, maxVar10, z114, idn0Var9, ga80Var9, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX6)), apo.r(-1805881474, new gex(vzq0Var10, str8, lexVar, vu30Var19, vu30Var3, vu30Var110), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                maxVar3 = maxVar10;
                z4 = z114;
                idn0Var2 = idn0Var9;
                ga80Var2 = ga80Var9;
                qim0Var2 = qim0Var5;
                qexVar3 = qexVar5;
                str2 = str8;
                vu30Var4 = vu30Var19;
                vu30Var5 = vu30Var110;
                i24 = i37;
                vzq0Var2 = vzq0Var10;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                i24 = i;
                qexVar3 = qexVar2;
                idn0Var2 = idn0Var;
                ga80Var2 = ga80Var;
                z4 = z2;
                vzq0Var2 = vzq0Var;
                maxVar3 = maxVar2;
                vu30Var4 = vu30Var;
                vu30Var5 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
            }
        }
        i6 = i5 | 1769472;
        i9 = i4 & 128;
        if (i9 != 0) {
            i6 |= 12582912;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 12582912) == 0) {
                if (x340Var.g(str2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i6 |= i10;
            }
        }
        i11 = i4 & 256;
        if (i11 != 0) {
            i6 |= 100663296;
            maxVar2 = maxVar;
        } else {
            maxVar2 = maxVar;
            if ((i2 & 100663296) == 0) {
                if (x340Var.g(maxVar2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i6 |= i12;
            }
        }
        i13 = i4 & 512;
        i14 = 805306368;
        if (i13 == 0) {
            i6 |= i14;
        } else if ((i2 & 805306368) == 0) {
            if (x340Var.i(vu30Var)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i6 |= i14;
        }
        i15 = i6;
        i16 = i4 & 1024;
        if (i16 != 0) {
            i17 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (x340Var.i(vu30Var2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i3 | i18;
        } else {
            i17 = i3;
        }
        if ((i3 & 48) == 0) {
            i17 |= 16;
        }
        i19 = i17;
        if ((i3 & 384) == 0) {
            i19 |= 128;
        }
        i20 = i4 & 8192;
        if (i20 != 0) {
            i21 = i19;
            if ((i3 & 3072) == 0) {
                if (x340Var.h(z2)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i21 |= i22;
            }
            if ((i3 & 24576) != 0) {
                i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
            }
            if ((i3 & 196608) == 0) {
                if (x340Var.i(vu30Var3)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i21 |= i29;
            }
            i23 = i21;
            if ((i15 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i15 & 1, z3)) {
                x340Var.d0();
                i25 = i2 & 1;
                qim0Var3 = nim0.a;
                if (i25 != 0) {
                    if (i30 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i7 != 0) {
                        qexVar4 = pex.b;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    if (i11 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i13 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var;
                    }
                    if (i16 == 0) {
                    }
                    idn0 idn0VarY12 = zso1.Y(x340Var);
                    qim0 qim0Var17 = qim0Var4;
                    ga80 ga80VarO12 = vno1.o(er31.a, x340Var, 0);
                    i26 = i23 & (-1009);
                    if (i20 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 16384) != 0) {
                        vzq0Var3 = lexVar.a;
                        i26 = i23 & (-58353);
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    boolean z115 = z5;
                    qexVar5 = qexVar4;
                    idn0Var3 = idn0VarY12;
                    z6 = z115;
                    vzq0Var4 = vzq0Var3;
                    i27 = i26;
                    vu30Var8 = vu30Var6;
                    qim0Var5 = qim0Var17;
                    maxVar2 = maxVar4;
                    ga80Var3 = ga80VarO12;
                    i28 = 1;
                } else {
                    if (i30 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i7 != 0) {
                        qexVar4 = pex.b;
                    } else {
                        qexVar4 = qexVar2;
                    }
                    if (i9 != 0) {
                        str2 = null;
                    }
                    if (i11 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i13 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var;
                    }
                    if (i16 == 0) {
                    }
                    idn0 idn0VarY13 = zso1.Y(x340Var);
                    qim0 qim0Var18 = qim0Var4;
                    ga80 ga80VarO13 = vno1.o(er31.a, x340Var, 0);
                    i26 = i23 & (-1009);
                    if (i20 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 16384) != 0) {
                        vzq0Var3 = lexVar.a;
                        i26 = i23 & (-58353);
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    boolean z116 = z5;
                    qexVar5 = qexVar4;
                    idn0Var3 = idn0VarY13;
                    z6 = z116;
                    vzq0Var4 = vzq0Var3;
                    i27 = i26;
                    vu30Var8 = vu30Var6;
                    qim0Var5 = qim0Var18;
                    maxVar2 = maxVar4;
                    ga80Var3 = ga80VarO13;
                    i28 = 1;
                }
                x340Var.s();
                int i38 = i28;
                cr31 cr31VarX7 = voo1.x(x340Var, i38);
                if (z) {
                    qexVar6 = qexVar;
                } else {
                    qexVar6 = qexVar5;
                }
                if (z) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                uwr uwrVar7 = cbx.a;
                avw0 avw0Var7 = cbx.b(x340Var).c;
                vu30 vu30Var111 = vu30Var8;
                idn0 idn0Var10 = idn0Var3;
                String str9 = str2;
                vu30 vu30Var112 = vu30Var7;
                vzq0 vzq0Var11 = vzq0Var4;
                ga80 ga80Var10 = ga80Var3;
                max maxVar11 = maxVar2;
                boolean z117 = z6;
                i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX7, maxVar11, z117, idn0Var10, ga80Var10, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX7)), apo.r(-1805881474, new gex(vzq0Var11, str9, lexVar, vu30Var111, vu30Var3, vu30Var112), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
                maxVar3 = maxVar11;
                z4 = z117;
                idn0Var2 = idn0Var10;
                ga80Var2 = ga80Var10;
                qim0Var2 = qim0Var5;
                qexVar3 = qexVar5;
                str2 = str9;
                vu30Var4 = vu30Var111;
                vu30Var5 = vu30Var112;
                i24 = i38;
                vzq0Var2 = vzq0Var11;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                i24 = i;
                qexVar3 = qexVar2;
                idn0Var2 = idn0Var;
                ga80Var2 = ga80Var;
                z4 = z2;
                vzq0Var2 = vzq0Var;
                maxVar3 = maxVar2;
                vu30Var4 = vu30Var;
                vu30Var5 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
            }
        }
        i21 = i19 | 3072;
        if ((i3 & 24576) != 0) {
            i21 |= ((i4 & 16384) == 0 || !x340Var.g(vzq0Var)) ? 8192 : 16384;
        }
        if ((i3 & 196608) == 0) {
            if (x340Var.i(vu30Var3)) {
                i29 = 131072;
            } else {
                i29 = 65536;
            }
            i21 |= i29;
        }
        i23 = i21;
        if ((i15 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (x340Var.Y(i15 & 1, z3)) {
            x340Var.d0();
            i25 = i2 & 1;
            qim0Var3 = nim0.a;
            if (i25 != 0) {
                if (i30 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i7 != 0) {
                    qexVar4 = pex.b;
                } else {
                    qexVar4 = qexVar2;
                }
                if (i9 != 0) {
                    str2 = null;
                }
                if (i11 != 0) {
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i13 != 0) {
                    vu30Var6 = null;
                } else {
                    vu30Var6 = vu30Var;
                }
                if (i16 == 0) {
                }
                idn0 idn0VarY14 = zso1.Y(x340Var);
                qim0 qim0Var19 = qim0Var4;
                ga80 ga80VarO14 = vno1.o(er31.a, x340Var, 0);
                i26 = i23 & (-1009);
                if (i20 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 16384) != 0) {
                    vzq0Var3 = lexVar.a;
                    i26 = i23 & (-58353);
                } else {
                    vzq0Var3 = vzq0Var;
                }
                boolean z118 = z5;
                qexVar5 = qexVar4;
                idn0Var3 = idn0VarY14;
                z6 = z118;
                vzq0Var4 = vzq0Var3;
                i27 = i26;
                vu30Var8 = vu30Var6;
                qim0Var5 = qim0Var19;
                maxVar2 = maxVar4;
                ga80Var3 = ga80VarO14;
                i28 = 1;
            } else {
                if (i30 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i7 != 0) {
                    qexVar4 = pex.b;
                } else {
                    qexVar4 = qexVar2;
                }
                if (i9 != 0) {
                    str2 = null;
                }
                if (i11 != 0) {
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i13 != 0) {
                    vu30Var6 = null;
                } else {
                    vu30Var6 = vu30Var;
                }
                if (i16 == 0) {
                }
                idn0 idn0VarY15 = zso1.Y(x340Var);
                qim0 qim0Var110 = qim0Var4;
                ga80 ga80VarO15 = vno1.o(er31.a, x340Var, 0);
                i26 = i23 & (-1009);
                if (i20 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 16384) != 0) {
                    vzq0Var3 = lexVar.a;
                    i26 = i23 & (-58353);
                } else {
                    vzq0Var3 = vzq0Var;
                }
                boolean z119 = z5;
                qexVar5 = qexVar4;
                idn0Var3 = idn0VarY15;
                z6 = z119;
                vzq0Var4 = vzq0Var3;
                i27 = i26;
                vu30Var8 = vu30Var6;
                qim0Var5 = qim0Var110;
                maxVar2 = maxVar4;
                ga80Var3 = ga80VarO15;
                i28 = 1;
            }
            x340Var.s();
            int i39 = i28;
            cr31 cr31VarX8 = voo1.x(x340Var, i39);
            if (z) {
                qexVar6 = qexVar;
            } else {
                qexVar6 = qexVar5;
            }
            if (z) {
                z7 = false;
            } else {
                z7 = false;
            }
            uwr uwrVar8 = cbx.a;
            avw0 avw0Var8 = cbx.b(x340Var).c;
            vu30 vu30Var113 = vu30Var8;
            idn0 idn0Var11 = idn0Var3;
            String str10 = str2;
            vu30 vu30Var114 = vu30Var7;
            vzq0 vzq0Var12 = vzq0Var4;
            ga80 ga80Var11 = ga80Var3;
            max maxVar12 = maxVar2;
            boolean z1110 = z6;
            i1k0.d(z, iu30Var, qexVar6, lexVar, cr31VarX8, maxVar12, z1110, idn0Var11, ga80Var11, k8p1.q(qim0Var5, z7, d1u.E(1.0f, cbx.a(x340Var).a.c, qim0Var3, cr31VarX8)), apo.r(-1805881474, new gex(vzq0Var12, str10, lexVar, vu30Var113, vu30Var3, vu30Var114), x340Var), x340Var, ((i15 >> 6) & 3670016) | (i15 & 14) | 196608 | (i15 & 112) | (i15 & 7168) | ((i27 << 12) & 29360128));
            maxVar3 = maxVar12;
            z4 = z1110;
            idn0Var2 = idn0Var11;
            ga80Var2 = ga80Var11;
            qim0Var2 = qim0Var5;
            qexVar3 = qexVar5;
            str2 = str10;
            vu30Var4 = vu30Var113;
            vu30Var5 = vu30Var114;
            i24 = i39;
            vzq0Var2 = vzq0Var12;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            i24 = i;
            qexVar3 = qexVar2;
            idn0Var2 = idn0Var;
            ga80Var2 = ga80Var;
            z4 = z2;
            vzq0Var2 = vzq0Var;
            maxVar3 = maxVar2;
            vu30Var4 = vu30Var;
            vu30Var5 = vu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hex(z, iu30Var, qexVar, lexVar, qim0Var2, i24, qexVar3, str2, maxVar3, vu30Var4, vu30Var5, idn0Var2, ga80Var2, z4, vzq0Var2, vu30Var3, i2, i3, i4);
        }
    }

    public static final void h(vzq0 vzq0Var, String str, lex lexVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, b0k b0kVar, int i) {
        lex lexVar2 = lexVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-619436263);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(vzq0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(lexVar2) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024) | (x340Var.i(vu30Var2) ? 16384 : 8192) | (x340Var.i(vu30Var3) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = uyn1.w(nim0Var, vzq0Var);
            boolean z = str != null;
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new kov(str, (byte) 7);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = k8p1.q(qim0VarW, z, s161.a(nim0Var, (iu30) objT));
            jw31 jw31VarA = ew31.a(new o3g(vu30Var != null, vu30Var2 != null, vu30Var3 != null), een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (vu30Var != null) {
                x340Var.i0(676537454);
                d(lexVar2, vu30Var, x340Var, (i2 >> 6) & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(676597997);
                x340Var.r(false);
            }
            if (vu30Var2 != null) {
                x340Var.i0(676627819);
                qim0 qim0VarZ = uyn1.z(lexVar2.d, 0.0f, 2, nim0Var);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                us71.k((i2 >> 12) & 14, vu30Var2, x340Var, true, false);
            } else {
                x340Var.i0(676721997);
                x340Var.r(false);
            }
            if (vu30Var3 != null) {
                x340Var.i0(676755725);
                lexVar2 = lexVar;
                d(lexVar2, vu30Var3, x340Var, ((i2 >> 6) & 14) | ((i2 >> 12) & 112));
                x340Var.r(false);
            } else {
                lexVar2 = lexVar;
                x340Var.i0(676817229);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gex(vzq0Var, str, lexVar2, vu30Var, vu30Var2, vu30Var3, i);
        }
    }

    public static final void i(ta60 ta60Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ta60 ta60Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1801906436);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ta60Var) : x340Var.i(ta60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ta60Var2 = ta60Var;
            ulo1.b(ta60Var2, "HighlightStacked1Card", null, apo.r(615552001, new nc60(ta60Var, b2), x340Var), x340Var, (i3 & 14) | 24624 | ((i3 << 3) & 896), 8);
            qim0Var = nim0.a;
        } else {
            ta60Var2 = ta60Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oc60(ta60Var2, qim0Var, i, b2);
        }
    }

    public static final void j(gbx gbxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-821668773);
        int i2 = i | (b0kVar3.h(true) ? 4 : 2) | (b0kVar3.h(false) ? 32 : 16) | (b0kVar3.i(gbxVar) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar3.i0(650297469);
            hax haxVar = new hax(cwl1.o0(b0kVar3, 2131952496));
            b0kVar3.r(false);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new nrj0(1, (byte) 21);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(qim0VarF, true, (iu30) objT), null, haxVar, false, null, null, gbxVar, null, null, null, null, h4j.a, apo.r(-674364908, new qsn0(haxVar, (byte) 11), b0kVar3), null, null, h4j.b, b0kVar2, (i2 << 12) & 3670016, 197040, 26554);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mmg0(gbxVar, i);
        }
    }

    public static final void k(qim0 qim0Var, Function0 function0, vy71 vy71Var, long j, h8n h8nVar, int i, float f, vu30 vu30Var, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        long j2;
        h8n h8nVar2;
        int i4;
        float f2;
        vu30 vu30Var2;
        long j3;
        h8n h8nVar3;
        float f3;
        int i5;
        int i6;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1654723231);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.i(qim0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(vy71Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        int i7 = 196608 | i3;
        if ((1572864 & i2) == 0) {
            i7 = 720896 | i3;
        }
        int i8 = 12582912 | i7;
        if ((100663296 & i2) == 0) {
            i8 |= b0kVar3.i(j2iVar) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i8 & 1, (38347923 & i8) != 38347922)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                uwr uwrVar = cbx.a;
                j3 = cbx.a(b0kVar3).a.d;
                cua cuaVar = cbx.b(b0kVar3).f;
                cua cuaVar2 = cbx.b(b0kVar3).f;
                h8n h8nVarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
                vu30Var2 = cvi.a;
                h8nVar3 = h8nVarD;
                f3 = 1.0f;
                i5 = i8 & (-3734529);
                i6 = 3;
            } else {
                b0kVar3.b0();
                j3 = j;
                h8nVar3 = h8nVar;
                f3 = f;
                vu30Var2 = vu30Var;
                i5 = i8 & (-3734529);
                i6 = i;
            }
            b0kVar3.s();
            long j4 = u7h.j;
            boolean z = (i5 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new aba0(function0, (byte) 4);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            dem0.a((Function0) objT, qim0Var, vy71Var, 0.0f, false, h8nVar3, j4, 0L, f3, 0L, apo.r(1954048214, new nk7(j3, vu30Var2, b2), b0kVar3), (vu30) null, (eem0) null, apo.r(527630019, new yvb0(i6, j3, j2iVar), b0kVar3), b0kVar2, ((i5 << 3) & 112) | (i5 & 896), 3078, 6808);
            j2 = j3;
            h8nVar2 = h8nVar3;
            f2 = f3;
            i4 = i6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            j2 = j;
            h8nVar2 = h8nVar;
            i4 = i;
            f2 = f;
            vu30Var2 = vu30Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zvb0(qim0Var, function0, vy71Var, j2, h8nVar2, i4, f2, vu30Var2, j2iVar, i2);
        }
    }

    public static final void l(l6p0 l6p0Var, umf0 umf0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-540794953);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(l6p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(umf0Var) ? 32 : 16;
        }
        byte b2 = 18;
        byte b3 = 0;
        byte b4 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = l6p0Var.e != zkt0.c;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(null, new uvx(0, (pgx) null, 0, uyn1.h(2, 12.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503), null, false, null, null, null, null, null, apo.r(-1041921362, new n6p0(l6p0Var, b3), b0kVar3), null, apo.r(-536293137, new n6p0(l6p0Var, b4), b0kVar3), apo.r(-944316752, new ukm0(umf0Var, l6p0Var, (byte) 10), b0kVar3), null, null, apo.r(2126579699, new zw2(z, l6p0Var, b2), b0kVar3), b0kVar2, 805306432, 197040, 26109);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(l6p0Var, umf0Var, i, (byte) 23);
        }
    }

    public static final void m(int i, String str, Function0 function0, b0k b0kVar) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2024385856);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            idx idxVar = new idx();
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 15);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, anm1.N("RatingsPageFooter", nim0Var), null, yla.p(x340Var), null, null, null, null, null, apo.r(-1095037755, new p9y0(str, (byte) 4), x340Var), x340Var, 0, 48, 2008);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vsh((byte) 1, i, str, function0, false);
        }
    }

    public static final void n(int i, Function0 function0, Function0 function1, b0k b0kVar, boolean z, boolean z2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1170864542);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-1796007384);
            if (z2) {
                x340Var.i0(-1795983483);
                m((i2 >> 3) & 112, cwl1.o0(x340Var, 2131960854), function0, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1795834528);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            x340Var.i0(-1795820237);
            m((i2 >> 6) & 112, cwl1.o0(x340Var, 2131960853), function1, x340Var);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xoe(z, z2, function0, function1, i, (byte) 4);
        }
    }

    public static final void o(ia60 ia60Var, long j, xd60 xd60Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1590389074);
        int i2 = i | (b0kVar2.g(ia60Var) ? 4 : 2) | (b0kVar2.f(j) ? 32 : 16) | (b0kVar2.i(xd60Var) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, xd60Var.b, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.g, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
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
            hb60.a(ia60Var.a, j, xd60Var.g, uyn1.w(u291.f(nim0Var, 1.0f), xd60Var.c), xd60Var.a, 0, b0kVar2, i2 & 112, 32);
            b0kVar2 = b0kVar2;
            zko1.f(ia60Var.c, uyn1.z(cvxVar.b, 0.0f, 2, u291.f(nim0Var, 1.0f)).then(ulo1.p(b0kVar2, 1)), null, 0L, b0kVar2, 0, 12);
            wd60.a(ia60Var.b, (qim0) null, (u7h) null, (djc0) null, xd60Var.e, b0kVar2, 8, 14);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6((Object) ia60Var, j, (Object) xd60Var, i, (byte) 8);
        }
    }

    public static final void p(jre jreVar, g9m g9mVar, lz71 lz71Var, nu nuVar, iu30 iu30Var, boolean z, iu30 iu30Var2, boolean z2, orm0 orm0Var, boolean z3, boolean z4, boolean z5, zg61 zg61Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2143504422);
        int i5 = i | (x340Var.i(jreVar) ? 4 : 2) | (x340Var.i(g9mVar) ? 32 : 16) | (x340Var.i(lz71Var) ? 256 : 128) | (x340Var.i(nuVar) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i5 |= x340Var.h(z) ? 131072 : 65536;
        }
        int i6 = i5 | (x340Var.i(iu30Var2) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i6 |= x340Var.h(z2) ? 8388608 : 4194304;
        }
        int i7 = i6 | (x340Var.i(orm0Var) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i7 |= x340Var.h(z3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.h(z4) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(zg61Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i8 = i3;
        if (x340Var.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(32.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            int i9 = i7 & 458752;
            boolean zI = x340Var.i(drr0Var) | (i9 == 131072) | x340Var.d(fX0);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cre((byte) 0, fX0, drr0Var, z);
                x340Var.s0(objT2);
            }
            r6v r6vVarC = k6v.c((iu30) objT2, x340Var);
            String strQ = too1.q(jreVar);
            x340Var.i0(1676622189);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zI2 = x340Var.i(drr0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new qg6(drr0Var, (byte) 7);
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = eqr0.B(qim0VarF, (iu30) objT3);
            if (jreVar instanceof gre) {
                i4 = 57344;
            } else {
                i4 = 57344;
                boolean z6 = (3670016 & i7) == 1048576;
                Object objT4 = x340Var.T();
                if (z6 || objT4 == m4cVar) {
                    objT4 = new ni6(iu30Var2, (byte) 2);
                    x340Var.s0(objT4);
                }
                qim0 qim0VarB2 = f8d1.b(nim0.a, rih1.a, (PointerInputEventHandler) objT4);
                boolean zI3 = (i9 == 131072) | x340Var.i(drr0Var) | ((i7 & 57344) == 16384);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar) {
                    objT5 = new h42(z, iu30Var, drr0Var, null);
                    x340Var.s0(objT5);
                }
                qim0VarB = qim0VarB.then(k6v.b(qim0VarB2, r6vVarC, qqq0.a, false, (idn0) null, false, (xu30) null, (xu30) objT5, false, 188));
            }
            x340Var.r(false);
            j2i j2iVarR = apo.r(-1601685862, new a7e(jreVar, orm0Var, (byte) 6), x340Var);
            j2i j2iVarR2 = apo.r(456920408, new qza(zg61Var, (byte) 8), x340Var);
            int i10 = i7 & i4;
            boolean zG = (i10 == 16384) | x340Var.g(strQ);
            Object objT6 = x340Var.T();
            if (zG || objT6 == m4cVar) {
                objT6 = new are(iu30Var, strQ, (byte) 0);
                x340Var.s0(objT6);
            }
            Function0 function0 = (Function0) objT6;
            boolean z7 = i10 == 16384;
            Object objT7 = x340Var.T();
            if (z7 || objT7 == m4cVar) {
                objT7 = new gob(iu30Var, (byte) 13);
                x340Var.s0(objT7);
            }
            Function0 function1 = (Function0) objT7;
            boolean zG2 = (i10 == 16384) | x340Var.g(strQ) | x340Var.i(jreVar);
            Object objT8 = x340Var.T();
            if (zG2 || objT8 == m4cVar) {
                objT8 = new d1c(iu30Var, strQ, jreVar, (byte) 11);
                x340Var.s0(objT8);
            }
            int i11 = i8 << 6;
            loo1.a(jreVar, g9mVar, lz71Var, nuVar, j2iVarR, qim0VarB, j2iVarR2, function0, function1, (Function0) objT8, z2, z3, z4, z5, x340Var, (i7 & 14) | 1597440 | (i7 & 112) | (i7 & 896) | (i7 & 7168), ((i7 >> 24) & 112) | ((i7 >> 21) & 14) | (i11 & 896) | (i11 & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bre(jreVar, g9mVar, lz71Var, nuVar, iu30Var, z, iu30Var2, z2, orm0Var, z3, z4, z5, zg61Var, qim0Var, i, i2);
        }
    }

    public static final mn20 q() {
        return new mn20(0, 0, 0, 0);
    }

    public static mn20 r(int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return new mn20(0, i, 0, 0);
    }

    public static in20 s(float f, int i) {
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        return new in20(0.0f, f);
    }

    public static final g6h1 u(cwn0 cwn0Var) {
        if (cwn0Var instanceof bwn0) {
            return ((bwn0) cwn0Var).a.g;
        }
        g6h1.Companion.getClass();
        return g6h1.e;
    }

    public static void v(Context context, Throwable th) {
        try {
            zod.s(context);
        } catch (Exception unused) {
        }
    }

    public static final String w(PlayerState playerState) {
        return H(playerState, "album_title");
    }

    public static final vk80 x(erl1 erl1Var, b0k b0kVar) {
        return new vk80(erl1Var, (wat) ((x340) b0kVar).k(t4k.h));
    }

    public static final ia00 y(maa maaVar, l0x0 l0x0Var, kko kkoVar, klv0 klv0Var) {
        return n3o1.q(maaVar).a(ytg0.S0, new gk0(l0x0Var, kkoVar, klv0Var, (byte) 19));
    }

    public static final String z(PlayerState playerState) {
        if (((Boolean) playerState.track().i(bx8.m).e(Boolean.FALSE)).booleanValue()) {
            return "";
        }
        Set set = s4b1.f;
        return !uic.u(playerState.contextUri()) ? "" : playerState.contextUri();
    }
}
