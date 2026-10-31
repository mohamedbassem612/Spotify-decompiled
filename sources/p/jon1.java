package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jon1 {
    public static final a2g a = new a2g((byte) 4);
    public static b180 b;

    public static boolean A(se4 se4Var) {
        return se4Var.b();
    }

    public static final drr0 B(ven0 ven0Var, boolean z, boolean z2, b0k b0kVar) {
        ven0 ven0VarS = v8r.s(ven0Var, b0kVar);
        ven0 ven0VarS2 = v8r.s(Boolean.valueOf(z2), b0kVar);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = us71.i(0.0f, x340Var);
        }
        drr0 drr0Var = (drr0) objT;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zH = x340Var.h(z) | x340Var.g(ven0VarS2) | x340Var.g(ven0VarS);
        Object objT2 = x340Var.T();
        if (zH || objT2 == m4cVar) {
            on1 on1Var = new on1(z, drr0Var, ven0VarS2, ven0VarS, (lnm) null);
            x340Var.s0(on1Var);
            objT2 = on1Var;
        }
        qxd0.t(boolValueOf, x340Var, (vu30) objT2);
        return drr0Var;
    }

    public static final c380 C(Context context, String str, String str2) {
        List listSingletonList = u890.j(str2, str) ? Collections.singletonList(a3z.a) : z6x.a;
        ArrayList arrayList = new ArrayList(q7h.U(listSingletonList, 10));
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            if (hhe0.a[((a3z) it.next()).ordinal()] != 1) {
                eg.o();
                return null;
            }
            arrayList.add(context.getString(2131955573));
        }
        return mqo1.A(arrayList);
    }

    public static final AnimatorSet D(View view, float f, float f2, long j, long j2, PathInterpolator pathInterpolator) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", f, f2);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f, f2);
        objectAnimatorOfFloat2.setStartDelay(j2);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static final void F(View view, lnn0 lnn0Var, int i, String str) {
        view.setTag(2131430112, lnn0Var.a(onr0.a, i, str));
    }

    public static final wcm H(he81 he81Var) {
        return new wcm(he81Var.d, (String) null, (String) null, he81Var.H == 1 ? rcm.a : tcm.a, (Function0) null, new z6v0(he81Var, (byte) 23), false, (String) null, (String) null, 982);
    }

    public static final yh10 I(he81 he81Var) {
        String str;
        String str2 = he81Var.b;
        String str3 = he81Var.d;
        String str4 = he81Var.j;
        int i = he81Var.H;
        if (i == 1) {
            str = "home-promotion";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "browse-promotion";
        }
        return new yh10(str2, he81Var.e, (String) null, new ugo0(false, str3, str4, false, false, str, (mgo0) null, 333), 20);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x0214  */
    /* JADX WARN: Code duplicated, block: B:153:0x0224  */
    /* JADX WARN: Code duplicated, block: B:154:0x0229  */
    /* JADX WARN: Code duplicated, block: B:156:0x022d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0234  */
    /* JADX WARN: Code duplicated, block: B:160:0x0240  */
    /* JADX WARN: Code duplicated, block: B:162:0x0245  */
    /* JADX WARN: Code duplicated, block: B:165:0x024c  */
    /* JADX WARN: Code duplicated, block: B:166:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0253  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:172:0x026a  */
    /* JADX WARN: Code duplicated, block: B:174:0x026e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0275  */
    /* JADX WARN: Code duplicated, block: B:177:0x0279  */
    /* JADX WARN: Code duplicated, block: B:179:0x027f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0281  */
    /* JADX WARN: Code duplicated, block: B:181:0x0284  */
    /* JADX WARN: Code duplicated, block: B:184:0x028a  */
    /* JADX WARN: Code duplicated, block: B:185:0x028d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0293  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:198:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x037f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0382  */
    /* JADX WARN: Code duplicated, block: B:220:0x0388  */
    /* JADX WARN: Code duplicated, block: B:221:0x038b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0393  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:233:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:235:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:236:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    public static final he81 J(id81 id81Var, t910 t910Var, y441 y441Var, hvp0 hvp0Var, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        u7h u7hVar;
        boolean z4;
        String str;
        String str2;
        String str3;
        ijo ijoVar;
        boolean z5;
        String str4;
        int i2;
        zau0 zau0Var;
        Boolean bool;
        String strO;
        boolean z6;
        boolean z7;
        boolean z8;
        String str5;
        njw0 njw0Var;
        mjw0 mjw0Var;
        String str6;
        String strK;
        njw0 njw0Var2;
        String str7;
        pjw0 pjw0Var;
        njw0 njw0Var3;
        boolean z9;
        String str8;
        zau0 zau0Var2;
        boolean z10;
        String str9;
        sbw0 sbw0Var;
        njw0 njw0Var4;
        njw0 njw0Var5;
        long jH;
        nbw0 nbw0Var;
        njw0 njw0VarE;
        long jP;
        ojw0 ojw0Var;
        long j;
        String str10;
        njw0 njw0Var6;
        mjw0 mjw0Var2;
        String str11;
        up70 up70VarA;
        w6j1 w6j1Var;
        String strConcat;
        Set set;
        u7h u7hVar2;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        String str12 = id81Var.b;
        String str13 = id81Var.d;
        int i3 = id81Var.h;
        String str14 = id81Var.i;
        ioj0 ioj0Var = t910Var.a;
        hwt hwtVar = t910Var.j;
        int i4 = t910Var.g;
        pjw0 pjw0Var2 = t910Var.h;
        boolean z11 = (pjw0Var2 != null ? pjw0Var2.b : null) instanceof mjw0;
        if (hwtVar != null) {
            z2 = hwtVar.c || !hwtVar.b;
        } else {
            z2 = false;
        }
        if (hwtVar != null) {
            z3 = (!hwtVar.d || hwtVar.e || z2) ? false : true;
        } else {
            z3 = true;
        }
        if (i3 == 5) {
            i = 2;
        } else if (i3 == 4) {
            i = 1;
        } else if (z && i3 == 2 && i4 == 1) {
            i = 2;
        } else {
            i = 3;
        }
        boolean zD = us71.d(i);
        boolean z12 = i4 == 2 || zD;
        hoj0 hoj0VarC = ioj0Var.c(pnx0.class, str13);
        ez00 ez00Var = (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA2.a;
        if (ez00Var == null) {
            hhg1.f(f4i1.f(pnx0.class.getSimpleName(), " not found for uri: ", str13));
            return null;
        }
        pnx0 pnx0Var = (pnx0) ez00Var;
        String str15 = pnx0Var.c;
        List list = pnx0Var.i;
        Long l = pnx0Var.g;
        rc81 rc81Var = t910Var.b;
        hoj0 hoj0VarC2 = ioj0Var.c(xkk1.class, str13);
        xkk1 xkk1Var = (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null) ? null : (xkk1) goj0VarA.a;
        if (xkk1Var == null) {
            u7hVar = null;
        } else {
            xkk1 xkk1Var2 = z12 ? xkk1Var : null;
            if (xkk1Var2 != null) {
                pp70 pp70Var = xkk1Var2.d;
                if (pp70Var != null) {
                    u7hVar2 = new u7h(pp70Var.a.a.c);
                } else {
                    pp70 pp70Var2 = xkk1Var2.a.b;
                    u7hVar2 = pp70Var2 != null ? new u7h(pp70Var2.a.a.c) : null;
                }
                u7hVar = u7hVar2;
            } else {
                u7hVar = null;
            }
        }
        List listI0 = f46.i0(new String[]{pnx0Var.j, str14});
        if (listI0.isEmpty()) {
            z4 = false;
        } else {
            Iterator it = listI0.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str16 = (String) it.next();
                    if (!u890.j(str16, rc81Var != null ? rc81Var.a : null)) {
                        if (u890.j(str16, rc81Var != null ? rc81Var.b : null)) {
                        }
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
        }
        boolean z13 = z4 && rc81Var != null && rc81Var.c;
        String str17 = pnx0Var.a;
        String strF = pnx0Var.e;
        String strO2 = l != null ? y441Var.o(l.longValue()) : null;
        if (i3 != 4) {
            if (zD) {
                strF = o7h.y0(list, ", ", (String) null, (String) null, ilx0.Y0, 30);
                if (strO2 != null) {
                    strF = f4i1.f(strF, " • ", strO2);
                }
            } else {
                Set set2 = s4b1.f;
                String str18 = pnx0Var.k;
                s4b1 s4b1VarX = uic.x(str15);
                v5b1 v5b1Var = s4b1VarX.d;
                str = str17;
                if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    if (onx0.a[s4b1VarX.c.ordinal()] != 1) {
                        str18 = pnx0Var.b;
                    }
                }
                if (str18.length() != 0) {
                    strF = f4i1.f(strF, " • ", str18);
                }
            }
            String str19 = strF;
            str2 = pnx0Var.c;
            String str20 = pnx0Var.d;
            str3 = pnx0Var.j;
            ijoVar = t910Var.c;
            if (ijoVar != null || (set = ijoVar.a) == null) {
                z5 = false;
            } else {
                if (set.contains(str14 == null ? str2 : str14)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            String str21 = id81Var.d;
            ud81 ud81Var = id81Var.a;
            if (!ihc1.y0(str15)) {
                str4 = str2;
                boolean z14 = u890.j(t910Var.d, Boolean.FALSE);
                String str22 = str;
                i2 = id81Var.h;
                boolean z15 = z14;
                mxh mxhVar = id81Var.f;
                zau0Var = t910Var.f;
                if (i2 == 3) {
                    bool = t910Var.e;
                } else {
                    bool = null;
                }
                if (l != null) {
                    strO = y441Var.o(l.longValue());
                } else {
                    strO = null;
                }
                boolean z16 = pnx0Var.l;
                int i5 = pnx0Var.m;
                String str23 = pnx0Var.n;
                z6 = pnx0Var.o;
                if (hwtVar != null) {
                    z7 = hwtVar.e;
                } else {
                    z7 = false;
                }
                if (hwtVar != null) {
                    z8 = hwtVar.d;
                } else {
                    z8 = true;
                }
                boolean z17 = t910Var.k;
                str5 = id81Var.i;
                if (pjw0Var2 != null) {
                    njw0Var = pjw0Var2.b;
                } else {
                    njw0Var = null;
                }
                if (njw0Var instanceof mjw0) {
                    mjw0Var = (mjw0) njw0Var;
                } else {
                    mjw0Var = null;
                }
                if (mjw0Var != null) {
                    w6j1Var = mjw0Var.a.a;
                    if (w6j1Var instanceof x6j1) {
                        strConcat = "spotify-video://".concat(((x6j1) w6j1Var).a);
                    } else {
                        if (w6j1Var instanceof w6j1) {
                            eg.o();
                            return null;
                        }
                        strConcat = w6j1Var.a.a;
                    }
                    str6 = strConcat;
                } else {
                    str6 = null;
                }
                if (z11) {
                    if (pjw0Var2 != null) {
                        njw0Var6 = pjw0Var2.b;
                    } else {
                        njw0Var6 = null;
                    }
                    if (njw0Var6 instanceof mjw0) {
                        mjw0Var2 = (mjw0) njw0Var6;
                    } else {
                        mjw0Var2 = null;
                    }
                    vp70 vp70Var = vp70.d;
                    if (mjw0Var2 != null || (up70VarA = mjw0Var2.a.b.a(vp70Var)) == null) {
                        str11 = null;
                    } else {
                        str11 = up70VarA.a.a;
                    }
                    if (str11 == null) {
                        str11 = "";
                    }
                    strK = o2p1.k(xkk1Var, vp70Var, str11);
                } else {
                    strK = null;
                }
                String str24 = id81Var.c;
                hwt hwtVar2 = t910Var.j;
                if (pjw0Var2 != null) {
                    njw0Var2 = pjw0Var2.b;
                } else {
                    njw0Var2 = null;
                }
                if ((njw0Var2 instanceof mjw0) || str14 == null) {
                    str7 = str3;
                    pjw0Var = pjw0Var2;
                    njw0Var3 = null;
                    z9 = z3;
                    str8 = str5;
                    zau0Var2 = zau0Var;
                    z10 = z6;
                    str9 = str12;
                    sbw0Var = null;
                } else {
                    int iC = l1d.C(i4);
                    if (iC == 0) {
                        str10 = "showcase-music-video-card-home";
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        str10 = "showcase-music-video-card-browse";
                    }
                    String str25 = str10;
                    zau0Var2 = zau0Var;
                    str8 = str5;
                    lsm0 lsm0VarO = acq0.O(pjw0Var2, str14, str14, false, hwtVar2, (nrl) null);
                    ksm0 ksm0Var = lsm0VarO.b;
                    str7 = str3;
                    z10 = z6;
                    njw0Var3 = null;
                    pjw0Var = pjw0Var2;
                    z9 = z3;
                    str9 = str12;
                    sbw0Var = new sbw0(str24, str9, lsm0.a(lsm0VarO, new ksm0(ksm0Var.a, ksm0Var.b, ksm0Var.c, str25, ksm0Var.e, ksm0Var.f, ksm0Var.g, ksm0Var.h, ksm0Var.i), (jsm0) null, 2045), 0L, false, false, z9, (Long) null, 1760);
                }
                if (pjw0Var != null) {
                    njw0Var4 = pjw0Var.b;
                } else {
                    njw0Var4 = njw0Var3;
                }
                if (njw0Var4 instanceof mjw0) {
                    njw0Var5 = (mjw0) njw0Var4;
                } else {
                    njw0Var5 = njw0Var3;
                }
                jH = -1;
                if (njw0Var5 != null && (ojw0Var = ((mjw0) njw0Var5).b) != null) {
                    j = ojw0Var.b;
                    if (jfv.h(j) != 0) {
                        jH = jfv.h(jfv.p(j, ojw0Var.a));
                    }
                }
                nbw0Var = t910Var.i;
                if (nbw0Var != null) {
                    jP = nbw0Var.h.p();
                    if (jP <= 0) {
                        njw0VarE = njw0Var3;
                    } else {
                        njw0VarE = hvp0Var.e(jP);
                    }
                } else {
                    njw0VarE = njw0Var3;
                }
                return new he81(str9, str22, str19, str4, str20, str7, z13, z4, z5, str21, ud81Var, z15, i2, mxhVar, bool, zau0Var2, u7hVar, strO, i4, z16, i5, str23, i, z10, z7, z8, z2, z9, str8, str6, strK, sbw0Var, jH, njw0VarE, z17);
            }
            str4 = str2;
            String str26 = str;
            i2 = id81Var.h;
            boolean z18 = z14;
            mxh mxhVar2 = id81Var.f;
            zau0Var = t910Var.f;
            if (i2 == 3) {
                bool = t910Var.e;
            } else {
                bool = null;
            }
            if (l != null) {
                strO = y441Var.o(l.longValue());
            } else {
                strO = null;
            }
            boolean z19 = pnx0Var.l;
            int i6 = pnx0Var.m;
            String str27 = pnx0Var.n;
            z6 = pnx0Var.o;
            if (hwtVar != null) {
                z7 = hwtVar.e;
            } else {
                z7 = false;
            }
            if (hwtVar != null) {
                z8 = hwtVar.d;
            } else {
                z8 = true;
            }
            boolean z110 = t910Var.k;
            str5 = id81Var.i;
            if (pjw0Var2 != null) {
                njw0Var = pjw0Var2.b;
            } else {
                njw0Var = null;
            }
            if (njw0Var instanceof mjw0) {
                mjw0Var = (mjw0) njw0Var;
            } else {
                mjw0Var = null;
            }
            if (mjw0Var != null) {
                w6j1Var = mjw0Var.a.a;
                if (w6j1Var instanceof x6j1) {
                    strConcat = "spotify-video://".concat(((x6j1) w6j1Var).a);
                } else {
                    if (w6j1Var instanceof w6j1) {
                        eg.o();
                        return null;
                    }
                    strConcat = w6j1Var.a.a;
                }
                str6 = strConcat;
            } else {
                str6 = null;
            }
            if (z11) {
                if (pjw0Var2 != null) {
                    njw0Var6 = pjw0Var2.b;
                } else {
                    njw0Var6 = null;
                }
                if (njw0Var6 instanceof mjw0) {
                    mjw0Var2 = (mjw0) njw0Var6;
                } else {
                    mjw0Var2 = null;
                }
                vp70 vp70Var2 = vp70.d;
                if (mjw0Var2 != null) {
                    str11 = null;
                } else {
                    str11 = null;
                }
                if (str11 == null) {
                    str11 = "";
                }
                strK = o2p1.k(xkk1Var, vp70Var2, str11);
            } else {
                strK = null;
            }
            String str28 = id81Var.c;
            hwt hwtVar3 = t910Var.j;
            if (pjw0Var2 != null) {
                njw0Var2 = pjw0Var2.b;
            } else {
                njw0Var2 = null;
            }
            if (njw0Var2 instanceof mjw0) {
                str7 = str3;
                pjw0Var = pjw0Var2;
                njw0Var3 = null;
                z9 = z3;
                str8 = str5;
                zau0Var2 = zau0Var;
                z10 = z6;
                str9 = str12;
                sbw0Var = null;
            } else {
                str7 = str3;
                pjw0Var = pjw0Var2;
                njw0Var3 = null;
                z9 = z3;
                str8 = str5;
                zau0Var2 = zau0Var;
                z10 = z6;
                str9 = str12;
                sbw0Var = null;
            }
            if (pjw0Var != null) {
                njw0Var4 = pjw0Var.b;
            } else {
                njw0Var4 = njw0Var3;
            }
            if (njw0Var4 instanceof mjw0) {
                njw0Var5 = (mjw0) njw0Var4;
            } else {
                njw0Var5 = njw0Var3;
            }
            jH = -1;
            if (njw0Var5 != null) {
                j = ojw0Var.b;
                if (jfv.h(j) != 0) {
                    jH = jfv.h(jfv.p(j, ojw0Var.a));
                }
            }
            nbw0Var = t910Var.i;
            if (nbw0Var != null) {
                jP = nbw0Var.h.p();
                if (jP <= 0) {
                    njw0VarE = njw0Var3;
                } else {
                    njw0VarE = hvp0Var.e(jP);
                }
            } else {
                njw0VarE = njw0Var3;
            }
            return new he81(str9, str26, str19, str4, str20, str7, z13, z4, z5, str21, ud81Var, z18, i2, mxhVar2, bool, zau0Var2, u7hVar, strO, i4, z19, i6, str27, i, z10, z7, z8, z2, z9, str8, str6, strK, sbw0Var, jH, njw0VarE, z110);
        }
        strF = o7h.y0(list, ", ", (String) null, (String) null, ilx0.X0, 30);
        str = str17;
        String str110 = strF;
        str2 = pnx0Var.c;
        String str29 = pnx0Var.d;
        str3 = pnx0Var.j;
        ijoVar = t910Var.c;
        if (ijoVar != null) {
            z5 = false;
        } else {
            z5 = false;
        }
        String str210 = id81Var.d;
        ud81 ud81Var2 = id81Var.a;
        if (!ihc1.y0(str15)) {
            str4 = str2;
            if (u890.j(t910Var.d, Boolean.FALSE)) {
            }
            String str211 = str;
            i2 = id81Var.h;
            boolean z111 = z14;
            mxh mxhVar3 = id81Var.f;
            zau0Var = t910Var.f;
            if (i2 == 3) {
                bool = t910Var.e;
            } else {
                bool = null;
            }
            if (l != null) {
                strO = y441Var.o(l.longValue());
            } else {
                strO = null;
            }
            boolean z112 = pnx0Var.l;
            int i7 = pnx0Var.m;
            String str212 = pnx0Var.n;
            z6 = pnx0Var.o;
            if (hwtVar != null) {
                z7 = hwtVar.e;
            } else {
                z7 = false;
            }
            if (hwtVar != null) {
                z8 = hwtVar.d;
            } else {
                z8 = true;
            }
            boolean z113 = t910Var.k;
            str5 = id81Var.i;
            if (pjw0Var2 != null) {
                njw0Var = pjw0Var2.b;
            } else {
                njw0Var = null;
            }
            if (njw0Var instanceof mjw0) {
                mjw0Var = (mjw0) njw0Var;
            } else {
                mjw0Var = null;
            }
            if (mjw0Var != null) {
                w6j1Var = mjw0Var.a.a;
                if (w6j1Var instanceof x6j1) {
                    strConcat = "spotify-video://".concat(((x6j1) w6j1Var).a);
                } else {
                    if (w6j1Var instanceof w6j1) {
                        eg.o();
                        return null;
                    }
                    strConcat = w6j1Var.a.a;
                }
                str6 = strConcat;
            } else {
                str6 = null;
            }
            if (z11) {
                if (pjw0Var2 != null) {
                    njw0Var6 = pjw0Var2.b;
                } else {
                    njw0Var6 = null;
                }
                if (njw0Var6 instanceof mjw0) {
                    mjw0Var2 = (mjw0) njw0Var6;
                } else {
                    mjw0Var2 = null;
                }
                vp70 vp70Var3 = vp70.d;
                if (mjw0Var2 != null) {
                    str11 = null;
                } else {
                    str11 = null;
                }
                if (str11 == null) {
                    str11 = "";
                }
                strK = o2p1.k(xkk1Var, vp70Var3, str11);
            } else {
                strK = null;
            }
            String str213 = id81Var.c;
            hwt hwtVar4 = t910Var.j;
            if (pjw0Var2 != null) {
                njw0Var2 = pjw0Var2.b;
            } else {
                njw0Var2 = null;
            }
            if (njw0Var2 instanceof mjw0) {
                str7 = str3;
                pjw0Var = pjw0Var2;
                njw0Var3 = null;
                z9 = z3;
                str8 = str5;
                zau0Var2 = zau0Var;
                z10 = z6;
                str9 = str12;
                sbw0Var = null;
            } else {
                str7 = str3;
                pjw0Var = pjw0Var2;
                njw0Var3 = null;
                z9 = z3;
                str8 = str5;
                zau0Var2 = zau0Var;
                z10 = z6;
                str9 = str12;
                sbw0Var = null;
            }
            if (pjw0Var != null) {
                njw0Var4 = pjw0Var.b;
            } else {
                njw0Var4 = njw0Var3;
            }
            if (njw0Var4 instanceof mjw0) {
                njw0Var5 = (mjw0) njw0Var4;
            } else {
                njw0Var5 = njw0Var3;
            }
            jH = -1;
            if (njw0Var5 != null) {
                j = ojw0Var.b;
                if (jfv.h(j) != 0) {
                    jH = jfv.h(jfv.p(j, ojw0Var.a));
                }
            }
            nbw0Var = t910Var.i;
            if (nbw0Var != null) {
                jP = nbw0Var.h.p();
                if (jP <= 0) {
                    njw0VarE = njw0Var3;
                } else {
                    njw0VarE = hvp0Var.e(jP);
                }
            } else {
                njw0VarE = njw0Var3;
            }
            return new he81(str9, str211, str110, str4, str29, str7, z13, z4, z5, str210, ud81Var2, z111, i2, mxhVar3, bool, zau0Var2, u7hVar, strO, i4, z112, i7, str212, i, z10, z7, z8, z2, z9, str8, str6, strK, sbw0Var, jH, njw0VarE, z113);
        }
        str4 = str2;
        String str214 = str;
        i2 = id81Var.h;
        boolean z114 = z14;
        mxh mxhVar4 = id81Var.f;
        zau0Var = t910Var.f;
        if (i2 == 3) {
            bool = t910Var.e;
        } else {
            bool = null;
        }
        if (l != null) {
            strO = y441Var.o(l.longValue());
        } else {
            strO = null;
        }
        boolean z115 = pnx0Var.l;
        int i8 = pnx0Var.m;
        String str215 = pnx0Var.n;
        z6 = pnx0Var.o;
        if (hwtVar != null) {
            z7 = hwtVar.e;
        } else {
            z7 = false;
        }
        if (hwtVar != null) {
            z8 = hwtVar.d;
        } else {
            z8 = true;
        }
        boolean z116 = t910Var.k;
        str5 = id81Var.i;
        if (pjw0Var2 != null) {
            njw0Var = pjw0Var2.b;
        } else {
            njw0Var = null;
        }
        if (njw0Var instanceof mjw0) {
            mjw0Var = (mjw0) njw0Var;
        } else {
            mjw0Var = null;
        }
        if (mjw0Var != null) {
            w6j1Var = mjw0Var.a.a;
            if (w6j1Var instanceof x6j1) {
                strConcat = "spotify-video://".concat(((x6j1) w6j1Var).a);
            } else {
                if (w6j1Var instanceof w6j1) {
                    eg.o();
                    return null;
                }
                strConcat = w6j1Var.a.a;
            }
            str6 = strConcat;
        } else {
            str6 = null;
        }
        if (z11) {
            if (pjw0Var2 != null) {
                njw0Var6 = pjw0Var2.b;
            } else {
                njw0Var6 = null;
            }
            if (njw0Var6 instanceof mjw0) {
                mjw0Var2 = (mjw0) njw0Var6;
            } else {
                mjw0Var2 = null;
            }
            vp70 vp70Var4 = vp70.d;
            if (mjw0Var2 != null) {
                str11 = null;
            } else {
                str11 = null;
            }
            if (str11 == null) {
                str11 = "";
            }
            strK = o2p1.k(xkk1Var, vp70Var4, str11);
        } else {
            strK = null;
        }
        String str216 = id81Var.c;
        hwt hwtVar5 = t910Var.j;
        if (pjw0Var2 != null) {
            njw0Var2 = pjw0Var2.b;
        } else {
            njw0Var2 = null;
        }
        if (njw0Var2 instanceof mjw0) {
            str7 = str3;
            pjw0Var = pjw0Var2;
            njw0Var3 = null;
            z9 = z3;
            str8 = str5;
            zau0Var2 = zau0Var;
            z10 = z6;
            str9 = str12;
            sbw0Var = null;
        } else {
            str7 = str3;
            pjw0Var = pjw0Var2;
            njw0Var3 = null;
            z9 = z3;
            str8 = str5;
            zau0Var2 = zau0Var;
            z10 = z6;
            str9 = str12;
            sbw0Var = null;
        }
        if (pjw0Var != null) {
            njw0Var4 = pjw0Var.b;
        } else {
            njw0Var4 = njw0Var3;
        }
        if (njw0Var4 instanceof mjw0) {
            njw0Var5 = (mjw0) njw0Var4;
        } else {
            njw0Var5 = njw0Var3;
        }
        jH = -1;
        if (njw0Var5 != null) {
            j = ojw0Var.b;
            if (jfv.h(j) != 0) {
                jH = jfv.h(jfv.p(j, ojw0Var.a));
            }
        }
        nbw0Var = t910Var.i;
        if (nbw0Var != null) {
            jP = nbw0Var.h.p();
            if (jP <= 0) {
                njw0VarE = njw0Var3;
            } else {
                njw0VarE = hvp0Var.e(jP);
            }
        } else {
            njw0VarE = njw0Var3;
        }
        return new he81(str9, str214, str110, str4, str29, str7, z13, z4, z5, str210, ud81Var2, z114, i2, mxhVar4, bool, zau0Var2, u7hVar, strO, i4, z115, i8, str215, i, z10, z7, z8, z2, z9, str8, str6, strK, sbw0Var, jH, njw0VarE, z116);
    }

    public static void K(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            K((View) parent, fArr, fArr2, iArr);
            xa4.y(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            xa4.y(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            xa4.y(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            xa4.y(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        y9g1.w(matrix, fArr2);
        xa4.x(fArr, fArr2);
    }

    public static final ObjectAnimator L(View view, float f, float f2, long j, long j2, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static final AnimatorSet M(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m(view, 0.0f, 667L, 0L, new PathInterpolator(0.0f, 0.0f, 0.7f, 1.0f), 11), L(view, j(30, view), 0.0f, 667L, 0L, new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f)));
        return animatorSet;
    }

    public static final AnimatorSet N(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(n(view, 0.0f, 333L, 333L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), 3), L(view, 0.0f, j(-30, view), 667L, 0L, new PathInterpolator(1.0f, 0.0f, 1.0f, 1.0f)));
        animatorSet.addListener(new nly(view, (byte) 2));
        return animatorSet;
    }

    public static final Bitmap O(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapCopy;
        if (bitmap2 == null) {
            return bitmap;
        }
        try {
            bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        } catch (OutOfMemoryError unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            return bitmap;
        }
        k(new Canvas(bitmapCopy), bitmap2, bitmapCopy.getWidth(), bitmapCopy.getHeight());
        return bitmapCopy;
    }

    public static final ega0 P(nfa0 nfa0Var, Object obj, nma0 nma0Var) {
        p811 p811Var = new p811();
        new cha0(nfa0Var, new q94(p811Var, (byte) 5), (byte) 1).i(nma0Var, obj);
        Object obj2 = p811Var.a;
        if (obj2 != null) {
            return (ega0) obj2;
        }
        u890.C("result");
        throw null;
    }

    public static final void a(ffs0 ffs0Var, a9g0 a9g0Var, d0r d0rVar, sjq0 sjq0Var, xx21 xx21Var, b0k b0kVar, int i) {
        vxr0 uxr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1167754743);
        int i2 = i | (x340Var.i(ffs0Var) ? 4 : 2) | (x340Var.g(a9g0Var) ? 32 : 16) | (x340Var.i(d0rVar) ? 256 : 128) | (x340Var.i(sjq0Var) ? 2048 : 1024) | (x340Var.i(xx21Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(a9g0Var, x340Var);
            ven0 ven0VarS2 = v8r.s(ffs0Var, x340Var);
            boolean zG = x340Var.g(d0rVar) | x340Var.g(sjq0Var) | x340Var.g(xx21Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = sjq0Var.r0(d0rVar, new j2i(-585327489, new iwf0(xx21Var, ven0VarS2, ven0VarS, (byte) 3), true));
                x340Var.s0(objT);
            }
            eyr0 eyr0Var = (eyr0) objT;
            if (ffs0Var instanceof efs0) {
                uxr0Var = new vxr0(28, ((efs0) ffs0Var).b, (String) null, false, false);
            } else {
                if (!(ffs0Var instanceof dfs0)) {
                    eg.o();
                    return;
                }
                uxr0Var = new uxr0(((dfs0) ffs0Var).b);
            }
            vxr0 vxr0Var = uxr0Var;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c(eyr0Var, vxr0Var, uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14), (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 0, i, ffs0Var, a9g0Var, d0rVar, sjq0Var, xx21Var);
        }
    }

    public static final void b(b9g0 b9g0Var, iu30 iu30Var, vzq0 vzq0Var, bjx bjxVar, d0r d0rVar, v8l0 v8l0Var, iu30 iu30Var2, b0k b0kVar, int i) {
        iu30 iu30Var3;
        h311 h311VarV;
        f9g0 f9g0Var;
        boolean z;
        tqp tqpVar = (tqp) bjxVar.d;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-664669985);
        int i2 = (i & 6) == 0 ? (x340Var.i(b9g0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(bjxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(d0rVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(v8l0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            ven0 ven0VarS = v8r.s(iu30Var2, x340Var);
            List list = b9g0Var.c;
            boolean z2 = b9g0Var.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ifs0 ifs0Var = (ifs0) obj;
                if (!ifs0Var.l0().isEmpty()) {
                    if (ifs0Var instanceof hfs0) {
                        z = true;
                    } else {
                        if (!(ifs0Var instanceof gfs0)) {
                            eg.o();
                            return;
                        }
                        z = z2;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            nim0 nim0Var = nim0.a;
            if (zIsEmpty) {
                x340Var.i0(-1383601024);
                otw.c((cx0) bjxVar.c, new m8x(z2), uyn1.w(nim0Var, vzq0Var), (ipb1) null, x340Var, 0, 8);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    f9g0Var = new f9g0(b9g0Var, iu30Var, vzq0Var, bjxVar, d0rVar, v8l0Var, iu30Var2, i, (byte) 0);
                }
            } else {
                iu30Var3 = iu30Var;
                x340Var.i0(-1383382877);
                x340Var.r(false);
                uqp uqpVar = (uqp) bjxVar.g;
                boolean zG = x340Var.g(d0rVar) | x340Var.g(tqpVar);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    sqa0 sqa0Var = new sqa0(ven0VarS, (byte) 19);
                    tqpVar.getClass();
                    objT = new ep6(d0rVar, sqa0Var);
                    x340Var.s0(objT);
                }
                ep6 ep6Var = (ep6) objT;
                ven0 ven0VarS2 = v8r.s(iu30Var3, x340Var);
                boolean zG2 = x340Var.g(uqpVar);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    xd2 xd2Var = new xd2(ven0VarS2, (byte) 13);
                    uqpVar.getClass();
                    objT2 = new xx21(xd2Var);
                    x340Var.s0(objT2);
                }
                xx21 xx21Var = (xx21) objT2;
                boolean zI = x340Var.i(v8l0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new g9g0(v8l0Var, (byte) 0);
                    x340Var.s0(objT3);
                }
                h3h1 h3h1Var = new h3h1((iu30) objT3);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                hdh hdhVarN = lnn1.n(vzq0Var, uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7));
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean zI2 = x340Var.i(bjxVar) | x340Var.i(b9g0Var) | x340Var.i(arrayList) | x340Var.g(ep6Var) | x340Var.i(d0rVar) | x340Var.i(xx21Var);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    j96 j96Var = new j96(arrayList, bjxVar, b9g0Var, ep6Var, d0rVar, xx21Var, (byte) 18);
                    x340Var.s0(j96Var);
                    objT4 = j96Var;
                }
                s3o1.d(qim0VarD, null, hdhVarN, null, null, null, false, h3h1Var, (iu30) objT4, x340Var, 6, 250);
                x340Var = x340Var;
            }
            h311VarV.d = f9g0Var;
        }
        iu30Var3 = iu30Var;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            f9g0Var = new f9g0(b9g0Var, iu30Var3, vzq0Var, bjxVar, d0rVar, v8l0Var, iu30Var2, i, (byte) 1);
            h311VarV.d = f9g0Var;
        }
    }

    public static final void c(b9g0 b9g0Var, iu30 iu30Var, bjx bjxVar, d0r d0rVar, b0k b0kVar, int i) {
        int i2;
        kcx0 kcx0Var = (kcx0) bjxVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1028882);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(b9g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(bjxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(d0rVar) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            v8l0 v8l0Var = new v8l0();
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = lxf0.f;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            ven0 ven0VarS2 = v8r.s((String) ven0Var.getValue(), x340Var);
            boolean zG = x340Var.g(kcx0Var) | x340Var.g(d0rVar);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new u16(d0rVar, new aix(ven0VarS2, ven0VarS, ven0Var, (byte) 2), new c470(ven0Var, (byte) 17));
                x340Var.s0(objT2);
            }
            u16 u16Var = (u16) objT2;
            irn1.u(null, apo.r(-1978773697, new h9g0(b9g0Var, b2), x340Var), null, null, apo.r(-690881991, new mse(b9g0Var, iu30Var, bjxVar, d0rVar, v8l0Var, ven0Var, (byte) 5), x340Var), x340Var, 24624, 13);
            String str = (String) ven0Var.getValue();
            if (str == null) {
                x340Var.i0(588598027);
                x340Var.r(false);
            } else {
                x340Var.i0(588598028);
                boolean zI = x340Var.i(v8l0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new g9g0(v8l0Var, (byte) 2);
                    x340Var.s0(objT3);
                }
                dgo1.c("artistApprovalConfirmationDialog", (iu30) objT3, apo.r(1389483916, new lb1(u16Var, str, (byte) 1), x340Var), x340Var, 390);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, b9g0Var, iu30Var, bjxVar, d0rVar, (byte) 25);
        }
    }

    public static final AnimatorSet d(List list, long j, TimeInterpolator timeInterpolator, Long l, boolean z) {
        if (!z) {
            return new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        animatorSet.playTogether(o7h.l1(list));
        animatorSet.setInterpolator(timeInterpolator);
        if (l != null) {
            animatorSet.setDuration(l.longValue());
        }
        return animatorSet;
    }

    public static /* synthetic */ AnimatorSet e(List list, long j, TimeInterpolator timeInterpolator, Long l, boolean z, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        TimeInterpolator timeInterpolator2 = (i & 4) != 0 ? null : timeInterpolator;
        Long l2 = (i & 8) != 0 ? null : l;
        if ((i & 16) != 0) {
            z = true;
        }
        return d(list, j2, timeInterpolator2, l2, z);
    }

    public static void g(ha4 ha4Var, float[] fArr, float[] fArr2, int[] iArr) {
        kch0.e(fArr);
        K(ha4Var, fArr, fArr2, iArr);
    }

    public static final ValueAnimator h(long j, long j2, Interpolator interpolator, List list) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addListener(new lk41(list, (byte) 1));
        valueAnimatorOfFloat.addUpdateListener(new kk41(list, (byte) 1));
        return valueAnimatorOfFloat;
    }

    public static final jtl i(kl20 kl20Var, di4 di4Var) {
        return new jtl(kl20Var == kl20.U0 && di4Var.Q());
    }

    public static final float j(Number number, View view) {
        return TypedValue.applyDimension(1, number.floatValue(), view.getContext().getResources().getDisplayMetrics());
    }

    public static final void k(Canvas canvas, Bitmap bitmap, int i, int i2) {
        float f = i2;
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        canvas.drawRect(0.0f, 0.0f, i, f, paint);
    }

    public static ValueAnimator l(View view, long j, long j2, Interpolator interpolator, Function0 function0, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return h(j, j2, interpolator, Collections.singletonList(new i5k(new mws0(view, function0, (byte) 1), oa41.d, new xy2(view, (byte) 11))));
    }

    public static ObjectAnimator m(View view, float f, long j, long j2, PathInterpolator pathInterpolator, int i) {
        float f2 = (i & 1) != 0 ? 0.0f : 0.2f;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f2, f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static ObjectAnimator n(View view, float f, long j, long j2, PathInterpolator pathInterpolator, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f, 0.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static final knn0 o(View view) {
        Object tag = view.getTag(2131430112);
        if (tag != null) {
            knn0 knn0Var = tag instanceof knn0 ? (knn0) tag : null;
            if (knn0Var != null) {
                return knn0Var;
            }
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            return o(viewGroup);
        }
        return null;
    }

    public static final int p(int i, Activity activity) {
        if (w(activity)) {
            return i;
        }
        if (i == 2132018009) {
            return 2132018010;
        }
        if (i == 2132018010) {
            return 2132018022;
        }
        if (i == 2132018022) {
            return 2132018023;
        }
        if (i == 2132018023) {
            return 2132018024;
        }
        if (i == 2132018024) {
            return 2132018004;
        }
        if (i == 2132018003) {
            return 2132018006;
        }
        if (i == 2132018004) {
            return 2132018007;
        }
        return (i != 2132018006 && (i == 2132018007 || (i != 2132018011 && i == 2132018013))) ? 2132018013 : 2132018011;
    }

    public static final b180 q() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.Home16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(6.625f, 0.988f);
        cwh0VarG.c(2.75f, 2.75f, false, true, 2.75f, 0.0f);
        cwh0VarG.k(5.25f, 3.03f);
        cwh0VarG.g(0.541f, 0.314f, 0.875f, 0.891f, 0.875f, 1.516f);
        cwh0VarG.v(9.724f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
        cwh0VarG.i(-5.0f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
        cwh0VarG.j(9.0f, 10.5f);
        cwh0VarG.j(7.0f, 10.5f);
        cwh0VarG.v(4.758f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
        cwh0VarG.i(-5.0f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
        cwh0VarG.j(0.5f, 5.534f);
        cwh0VarG.g(0.0f, -0.625f, 0.334f, -1.202f, 0.875f, -1.515f);
        cwh0VarG.e();
        cwh0VarG.l(8.625f, 2.287f);
        cwh0VarG.c(1.25f, 1.25f, false, false, -1.25f, 0.0f);
        cwh0VarG.k(-5.25f, 3.031f);
        cwh0VarG.b(0.25f, 0.25f, false, false, 2.0f, 5.534f);
        cwh0VarG.v(8.974f);
        cwh0VarG.i(3.5f);
        cwh0VarG.j(5.5f, 9.75f);
        cwh0VarG.b(0.75f, 0.75f, false, true, 6.25f, 9.0f);
        cwh0VarG.i(3.5f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
        cwh0VarG.v(4.758f);
        cwh0VarG.j(14.0f, 14.508f);
        cwh0VarG.j(14.0f, 5.534f);
        cwh0VarG.c(0.25f, 0.25f, false, false, -0.125f, -0.216f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static void r(m2b1 m2b1Var, caq caqVar) {
        m2b1Var.f = caqVar;
    }

    public static void s(m2b1 m2b1Var, ynb0 ynb0Var) {
        m2b1Var.b = ynb0Var;
    }

    public static void t(m2b1 m2b1Var, ynb0 ynb0Var) {
        m2b1Var.c = ynb0Var;
    }

    public static void u(m2b1 m2b1Var, ynb0 ynb0Var) {
        m2b1Var.e = ynb0Var;
    }

    public static void v(m2b1 m2b1Var, kly0 kly0Var) {
        m2b1Var.d = kly0Var;
    }

    public static final boolean w(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return ((float) displayMetrics.heightPixels) > 740.0f * displayMetrics.density;
    }

    public static final f0r0 x(qq81 qq81Var) {
        char c;
        boolean z = qq81Var.Y;
        if (qq81Var.h != null) {
            c = z ? (char) 2 : (char) 3;
        } else {
            c = 1;
        }
        boolean z2 = c == 1;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(f0r0.b);
        }
        if (z2) {
            arrayList.add(f0r0.e);
        }
        arrayList.add(f0r0.a);
        arrayList.add(f0r0.c);
        arrayList.add(f0r0.d);
        return (f0r0) arrayList.get(qq81Var.t);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final void y(jx4 jx4Var, ggg1 ggg1Var, aae1 aae1Var, x180 x180Var, kmy kmyVar, s4e1 s4e1Var, sen0 sen0Var, e8k1 e8k1Var, t4e1 t4e1Var, onm onmVar) {
        i45 i45Var;
        if (onmVar instanceof i45) {
            i45Var = (i45) onmVar;
            int i = i45Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                i45Var.b = i - Integer.MIN_VALUE;
            } else {
                i45Var = new i45(onmVar);
            }
        } else {
            i45Var = new i45(onmVar);
        }
        i45 i45Var2 = i45Var;
        Object obj = i45Var2.a;
        int i2 = i45Var2.b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
        } else {
            hm5.M(obj);
            View view = jx4Var.a;
            muj mujVar = Build.VERSION.SDK_INT >= 34 ? new muj(view) : new xid(view);
            i45Var2.b = 1;
            z(jx4Var, ggg1Var, aae1Var, x180Var, kmyVar, s4e1Var, mujVar, sen0Var, e8k1Var, t4e1Var, i45Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final void z(jx4 jx4Var, ggg1 ggg1Var, aae1 aae1Var, x180 x180Var, iu30 iu30Var, Function0 function0, xid xidVar, sen0 sen0Var, e8k1 e8k1Var, iu30 iu30Var2, onm onmVar) {
        j45 j45Var;
        if (onmVar instanceof j45) {
            j45Var = (j45) onmVar;
            int i = j45Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j45Var.b = i - Integer.MIN_VALUE;
            } else {
                j45Var = new j45(onmVar);
            }
        } else {
            j45Var = new j45(onmVar);
        }
        Object obj = j45Var.a;
        int i2 = j45Var.b;
        if (i2 == 0) {
            hm5.M(obj);
            m45 m45Var = new m45(sen0Var, ggg1Var, aae1Var, xidVar, jx4Var, x180Var, iu30Var, function0, e8k1Var, iu30Var2, (lnm) null);
            j45Var.b = 1;
            if (smo1.s(m45Var, j45Var) == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }

    public abstract String f();
}
