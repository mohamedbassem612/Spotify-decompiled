package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class q6m1 {
    public static final void a(l6m1 l6m1Var, WidgetState.WrappedPlaylist wrappedPlaylist, b0k b0kVar, int i) {
        l6m1 l6m1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-838056830);
        int i2 = (x340Var.i(wrappedPlaylist) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            l6m1Var2 = l6m1Var;
            c(l6m1Var2, e(wrappedPlaylist), ((p3v) x340Var.k(s4k.a)).a, x340Var, 6, 0);
        } else {
            l6m1Var2 = l6m1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n6m1(l6m1Var2, wrappedPlaylist, i);
        }
    }

    public static final void b(l6m1 l6m1Var, WidgetState.WrappedStory wrappedStory, b0k b0kVar, int i) {
        int i2;
        l6m1 l6m1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1558035315);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(l6m1Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (x340Var.i(wrappedStory) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            l6m1Var2 = l6m1Var;
            c(l6m1Var2, f(wrappedStory), 0.0f, x340Var, i3 & 14, 4);
        } else {
            l6m1Var2 = l6m1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m6m1(l6m1Var2, wrappedStory, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194 A[Catch: OutOfMemoryError -> 0x0185, Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, OutOfMemoryError -> 0x0185, blocks: (B:88:0x015b, B:90:0x0175, B:92:0x017b, B:99:0x018a, B:100:0x018e, B:102:0x0194, B:104:0x01a0, B:105:0x01b3, B:107:0x01b9, B:112:0x01dc, B:111:0x01ca, B:113:0x01e0, B:114:0x01ea), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01b9 A[Catch: OutOfMemoryError -> 0x0185, Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, OutOfMemoryError -> 0x0185, blocks: (B:88:0x015b, B:90:0x0175, B:92:0x017b, B:99:0x018a, B:100:0x018e, B:102:0x0194, B:104:0x01a0, B:105:0x01b3, B:107:0x01b9, B:112:0x01dc, B:111:0x01ca, B:113:0x01e0, B:114:0x01ea), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ca A[Catch: OutOfMemoryError -> 0x0185, Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, OutOfMemoryError -> 0x0185, blocks: (B:88:0x015b, B:90:0x0175, B:92:0x017b, B:99:0x018a, B:100:0x018e, B:102:0x0194, B:104:0x01a0, B:105:0x01b3, B:107:0x01b9, B:112:0x01dc, B:111:0x01ca, B:113:0x01e0, B:114:0x01ea), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0217  */
    /* JADX WARN: Code duplicated, block: B:125:0x0238  */
    /* JADX WARN: Code duplicated, block: B:128:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[LOOP:0: B:100:0x018e->B:134:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[PHI: r0
      0x0070: PHI (r0v28 int) = (r0v5 int), (r0v5 int), (r0v29 int) binds: [B:37:0x0074, B:33:0x006c, B:34:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175 A[Catch: OutOfMemoryError -> 0x0185, Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, OutOfMemoryError -> 0x0185, blocks: (B:88:0x015b, B:90:0x0175, B:92:0x017b, B:99:0x018a, B:100:0x018e, B:102:0x0194, B:104:0x01a0, B:105:0x01b3, B:107:0x01b9, B:112:0x01dc, B:111:0x01ca, B:113:0x01e0, B:114:0x01ea), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:99:0x018a A[Catch: OutOfMemoryError -> 0x0185, Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, OutOfMemoryError -> 0x0185, blocks: (B:88:0x015b, B:90:0x0175, B:92:0x017b, B:99:0x018a, B:100:0x018e, B:102:0x0194, B:104:0x01a0, B:105:0x01b3, B:107:0x01b9, B:112:0x01dc, B:111:0x01ca, B:113:0x01e0, B:114:0x01ea), top: B:130:0x015b }] */
    public static final void c(l6m1 l6m1Var, Map map, float f, b0k b0kVar, int i, int i2) {
        float f2;
        int i3;
        boolean z;
        float f3;
        h311 h311VarV;
        float f4;
        long j;
        float f5;
        boolean z2;
        boolean z3;
        boolean zG;
        Object objT;
        boolean z4;
        Bitmap bitmapQ;
        ty9 ty9VarC;
        float fA;
        List list;
        Iterator it;
        ArrayList arrayList;
        int iOrdinal;
        Bitmap bitmap;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-729368537);
        int i4 = ((i & 6) == 0 ? i | (x340Var.e(l6m1Var.ordinal()) ? 4 : 2) : i) | (x340Var.g(map) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f2 = f;
            int i5 = x340Var.d(f2) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        f4 = 0.0f;
                    }
                    x340Var.s();
                    Map mapG = g((Map) x340Var.k(vce0.a), map);
                    s3v s3vVar = (s3v) x340Var.k(p4k.a);
                    j = s3vVar.a;
                    Resources resources = ((Context) x340Var.k(p4k.b)).getResources();
                    f5 = resources.getDisplayMetrics().density;
                    if (f5 > 1.5f) {
                        f5 = 1.5f;
                    }
                    if (((Boolean) x340Var.k(wol1.d)).booleanValue() || resources.getConfiguration().getLayoutDirection() != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if ((i3 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zG = ((((i3 & 896) ^ 384) <= 256 && x340Var.d(f4)) || (i3 & 384) == 256) | z3 | x340Var.g(mapG) | x340Var.f(j) | x340Var.d(f5) | x340Var.h(z2);
                    objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        ty9 ty9Var = l6m1Var.a;
                        if (z2 || !l6m1Var.b) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        List list2 = ty9Var.c;
                        if (j != 9205357640488583168L || p3v.b(s3v.b(j), 0.0f) <= 0 || p3v.b(s3v.a(j), 0.0f) <= 0) {
                            bitmapQ = null;
                        } else {
                            List list3 = list2;
                            if ((list3 instanceof Collection) && list3.isEmpty()) {
                                long jB = vy9.b(j, vy9.a);
                                ty9VarC = vy9.c(ty9Var, jB);
                                fA = (s3v.a(jB) / s3v.a(j)) * f4;
                                if (!p3v.c(fA, 0.0f)) {
                                    list = list2;
                                    if (!(list instanceof Collection)) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            if (((pkb0) it.next()).a == nbm1.e) {
                                                List<pkb0> list4 = ty9VarC.c;
                                                arrayList = new ArrayList(q7h.U(list4, 10));
                                                while (r5.hasNext()) {
                                                    iOrdinal = pkb0VarA.a.ordinal();
                                                    if (iOrdinal != 0) {
                                                        pkb0VarA = pkb0.a(pkb0VarA, 0.0f, pkb0VarA.c - fA, 0.0f, 0.0f, 1019);
                                                    } else {
                                                        pkb0VarA = pkb0.a(pkb0VarA, 0.0f, pkb0VarA.c - fA, 0.0f, 0.0f, 1019);
                                                    }
                                                    arrayList.add(pkb0VarA);
                                                }
                                                ty9VarC = new ty9(ty9VarC.a, ty9VarC.b, arrayList);
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            if (((pkb0) it.next()).a == nbm1.e) {
                                                List<pkb0> list5 = ty9VarC.c;
                                                arrayList = new ArrayList(q7h.U(list5, 10));
                                                for (pkb0 pkb0VarA : list5) {
                                                    iOrdinal = pkb0VarA.a.ordinal();
                                                    if (iOrdinal != 0) {
                                                        pkb0VarA = pkb0.a(pkb0VarA, 0.0f, pkb0VarA.c - fA, 0.0f, 0.0f, 1019);
                                                    } else {
                                                        pkb0VarA = pkb0.a(pkb0VarA, 0.0f, pkb0VarA.c - fA, 0.0f, 0.0f, 1019);
                                                    }
                                                    arrayList.add(pkb0VarA);
                                                }
                                                ty9VarC = new ty9(ty9VarC.a, ty9VarC.b, arrayList);
                                                break;
                                            }
                                        }
                                    }
                                }
                                bitmapQ = zgo1.q(ty9VarC, mapG, f5, z4);
                            } else {
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        try {
                                            long jB2 = vy9.b(j, vy9.a);
                                            ty9VarC = vy9.c(ty9Var, jB2);
                                            fA = (s3v.a(jB2) / s3v.a(j)) * f4;
                                            if (!p3v.c(fA, 0.0f)) {
                                                list = list2;
                                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                                    it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (((pkb0) it.next()).a == nbm1.e) {
                                                            List<pkb0> list6 = ty9VarC.c;
                                                            arrayList = new ArrayList(q7h.U(list6, 10));
                                                            while (r5.hasNext()) {
                                                                iOrdinal = pkb0VarA.a.ordinal();
                                                                if (iOrdinal != 0 || iOrdinal == 4) {
                                                                    pkb0VarA = pkb0.a(pkb0VarA, 0.0f, pkb0VarA.c - fA, 0.0f, 0.0f, 1019);
                                                                }
                                                                arrayList.add(pkb0VarA);
                                                            }
                                                            ty9VarC = new ty9(ty9VarC.a, ty9VarC.b, arrayList);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            bitmapQ = zgo1.q(ty9VarC, mapG, f5, z4);
                                        } catch (Exception e) {
                                            Logger.l(e, "[WrappedBackground] Failed to render %s", new Object[]{s3vVar});
                                            bitmapQ = null;
                                        } catch (OutOfMemoryError e2) {
                                            Logger.l(e2, "[WrappedBackground] Out of memory rendering %s", new Object[]{s3vVar});
                                            bitmapQ = null;
                                        }
                                    } else if (!mapG.containsKey(((pkb0) it2.next()).a)) {
                                    }
                                    bitmapQ = null;
                                }
                            }
                        }
                        objT = bitmapQ;
                        x340Var.s0(objT);
                    }
                    bitmap = (Bitmap) objT;
                    if (bitmap == null) {
                        x340Var.i0(-377782684);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-377782683);
                        yoi1.d(new lxa(bitmap), (String) null, dm5.I(et40.a), 0, (u8h) null, x340Var, 48, 16);
                        x340Var.r(false);
                    }
                    f3 = f4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                f4 = f2;
                x340Var.s();
                Map mapG2 = g((Map) x340Var.k(vce0.a), map);
                s3v s3vVar2 = (s3v) x340Var.k(p4k.a);
                j = s3vVar2.a;
                Resources resources2 = ((Context) x340Var.k(p4k.b)).getResources();
                f5 = resources2.getDisplayMetrics().density;
                if (f5 > 1.5f) {
                    f5 = 1.5f;
                }
                if (((Boolean) x340Var.k(wol1.d)).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = ((((i3 & 896) ^ 384) <= 256 && x340Var.d(f4)) || (i3 & 384) == 256) | z3 | x340Var.g(mapG2) | x340Var.f(j) | x340Var.d(f5) | x340Var.h(z2);
                objT = x340Var.T();
                if (zG) {
                    ty9 ty9Var2 = l6m1Var.a;
                    if (z2) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    List list7 = ty9Var2.c;
                    if (j != 9205357640488583168L) {
                        bitmapQ = null;
                    } else {
                        bitmapQ = null;
                    }
                    objT = bitmapQ;
                    x340Var.s0(objT);
                } else {
                    ty9 ty9Var3 = l6m1Var.a;
                    if (z2) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    List list8 = ty9Var3.c;
                    if (j != 9205357640488583168L) {
                        bitmapQ = null;
                    } else {
                        bitmapQ = null;
                    }
                    objT = bitmapQ;
                    x340Var.s0(objT);
                }
                bitmap = (Bitmap) objT;
                if (bitmap == null) {
                    x340Var.i0(-377782684);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-377782683);
                    yoi1.d(new lxa(bitmap), (String) null, dm5.I(et40.a), 0, (u8h) null, x340Var, 48, 16);
                    x340Var.r(false);
                }
                f3 = f4;
            } else {
                x340Var.b0();
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o6m1(l6m1Var, map, f3, i, i2);
            }
        }
        f2 = f;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    f4 = 0.0f;
                } else {
                    f4 = f2;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            x340Var.s();
            Map mapG3 = g((Map) x340Var.k(vce0.a), map);
            s3v s3vVar3 = (s3v) x340Var.k(p4k.a);
            j = s3vVar3.a;
            Resources resources3 = ((Context) x340Var.k(p4k.b)).getResources();
            f5 = resources3.getDisplayMetrics().density;
            if (f5 > 1.5f) {
                f5 = 1.5f;
            }
            if (((Boolean) x340Var.k(wol1.d)).booleanValue()) {
                z2 = false;
            } else {
                z2 = false;
            }
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = ((((i3 & 896) ^ 384) <= 256 && x340Var.d(f4)) || (i3 & 384) == 256) | z3 | x340Var.g(mapG3) | x340Var.f(j) | x340Var.d(f5) | x340Var.h(z2);
            objT = x340Var.T();
            if (zG) {
                ty9 ty9Var4 = l6m1Var.a;
                if (z2) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                List list9 = ty9Var4.c;
                if (j != 9205357640488583168L) {
                    bitmapQ = null;
                } else {
                    bitmapQ = null;
                }
                objT = bitmapQ;
                x340Var.s0(objT);
            } else {
                ty9 ty9Var5 = l6m1Var.a;
                if (z2) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                List list10 = ty9Var5.c;
                if (j != 9205357640488583168L) {
                    bitmapQ = null;
                } else {
                    bitmapQ = null;
                }
                objT = bitmapQ;
                x340Var.s0(objT);
            }
            bitmap = (Bitmap) objT;
            if (bitmap == null) {
                x340Var.i0(-377782684);
                x340Var.r(false);
            } else {
                x340Var.i0(-377782683);
                yoi1.d(new lxa(bitmap), (String) null, dm5.I(et40.a), 0, (u8h) null, x340Var, 48, 16);
                x340Var.r(false);
            }
            f3 = f4;
        } else {
            x340Var.b0();
            f3 = f2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o6m1(l6m1Var, map, f3, i, i2);
        }
    }

    public static final void d(WidgetState.WrappedStory wrappedStory, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-8786067);
        int i2 = (x340Var.i(wrappedStory) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Map map = (Map) x340Var.k(vce0.a);
            String logoImageUrl = wrappedStory.getLogoImageUrl();
            nbm1 nbm1Var = nbm1.d;
            Bitmap bitmap = (Bitmap) g(map, Collections.singletonMap(nbm1Var, logoImageUrl)).get(nbm1Var);
            if (bitmap == null) {
                x340Var.i0(247477585);
                x340Var.r(false);
            } else {
                x340Var.i0(247477586);
                yoi1.d(new lxa(bitmap), (String) null, dm5.Q(dm5.J(et40.a), 100.0f * f), 1, (u8h) null, x340Var, 48, 16);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p6m1(wrappedStory, f, i);
        }
    }

    public static final Map e(WidgetState.WrappedPlaylist wrappedPlaylist) {
        return sqg0.J(new mmr0[]{new mmr0(nbm1.a, wrappedPlaylist.getBackgroundImageUrl()), new mmr0(nbm1.b, wrappedPlaylist.getBackgroundGrainUrl()), new mmr0(nbm1.e, wrappedPlaylist.getPlaylistCoverUrl())});
    }

    public static final Map f(WidgetState.WrappedStory wrappedStory) {
        return sqg0.J(new mmr0[]{new mmr0(nbm1.a, wrappedStory.getBackgroundImageUrl()), new mmr0(nbm1.b, wrappedStory.getBackgroundGrainUrl()), new mmr0(nbm1.c, wrappedStory.getRingsImageUrl()), new mmr0(nbm1.d, wrappedStory.getLogoImageUrl())});
    }

    public static final Map g(Map map, Map map2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map2.entrySet()) {
            nbm1 nbm1Var = (nbm1) entry.getKey();
            String str = (String) entry.getValue();
            Bitmap bitmap = (Bitmap) map.get(vy9.d(nbm1Var) + str.hashCode());
            if (bitmap == null) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!nhc1.Y((String) ((Map.Entry) next).getKey(), vy9.d(nbm1Var), false));
                Map.Entry entry2 = (Map.Entry) next;
                bitmap = entry2 != null ? (Bitmap) entry2.getValue() : null;
            }
            mmr0 mmr0Var = bitmap != null ? new mmr0(nbm1Var, bitmap) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }
}
