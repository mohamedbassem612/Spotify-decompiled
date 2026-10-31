package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.ExtractedText;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zno1 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] b = new byte[0];
    public static b180 c;

    public static final c380 A(tnh1 tnh1Var, int i) {
        Object next;
        Iterator it = tnh1Var.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ji51 ji51Var = (ki51) next;
            if ((ji51Var instanceof ji51) && ji51Var.a() == i) {
                break;
            }
        }
        ji51 ji51Var2 = (ji51) next;
        if (ji51Var2 == null) {
            return null;
        }
        List listB = ji51Var2.b();
        ArrayList arrayList = new ArrayList(q7h.U(listB, 10));
        int i2 = 0;
        for (Object obj : listB) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            s2w0 s2w0Var = (s2w0) obj;
            String strD = s2w0Var.d();
            String strC = s2w0Var.c();
            String strH = s2w0Var.h();
            long jG = s2w0Var.g();
            List<rs6> listB2 = s2w0Var.b();
            ArrayList arrayList2 = new ArrayList(q7h.U(listB2, 10));
            for (rs6 rs6Var : listB2) {
                arrayList2.add(new hb6(rs6Var.b(), rs6Var.c(), rs6Var.a()));
            }
            arrayList.add(new ezv0(strD, strC, jG, strH, arrayList2, s2w0Var.f(), s2w0Var.f() == null ? null : Integer.valueOf(i3), s2w0Var.e(), i2, nik1.K5.a, s2w0Var.a(), ji51Var2.c()));
            i2 = i3;
        }
        return mqo1.A(arrayList);
    }

    public static final u4h1 B(String str) {
        int i;
        eth.h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (u890.q(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iM = eth.m(str.charAt(i), 10);
            if (iM < 0) {
                return null;
            }
            if (xcg1.f(i2, i3) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = 429496729;
                if (xcg1.f(i2, 429496729) > 0) {
                    return null;
                }
            }
            int i4 = i2 * 10;
            int i5 = iM + i4;
            if (xcg1.f(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return u4h1.a(i2);
    }

    public static final z4h1 C(String str) {
        eth.h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (u890.q(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jH = 512409557603043100L;
        while (i < length) {
            int iM = eth.m(str.charAt(i), 10);
            if (iM < 0) {
                return null;
            }
            if (cfm0.e(j, jH) > 0) {
                if (jH != 512409557603043100L) {
                    return null;
                }
                jH = xcg1.h(10L);
                if (cfm0.e(j, jH) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iM) & 4294967295L) + j2;
            if (cfm0.e(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return z4h1.a(j);
    }

    public static ObjectAnimator D(View view, float f, float f2, long j, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setStartDelay(0L);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static Map E(LinkedHashMap linkedHashMap) {
        return new rdn0(linkedHashMap);
    }

    public static void F(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i(str);
    }

    public static final void a(Function0 function0, qim0 qim0Var, boolean z, int i, hw61 hw61Var, long j, long j2, qqb qqbVar, vzq0 vzq0Var, j2i j2iVar, b0k b0kVar, int i2) {
        Function0 function1;
        int i3;
        boolean z2;
        int i4;
        hw61 hw61Var2;
        long j3;
        long j4;
        qqb qqbVar2;
        vzq0 vzq0Var2;
        hw61 hw61Var3;
        long j5;
        long jN;
        qqb qqbVarK;
        vzq0 vzq0VarG;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1266485519);
        if ((i2 & 6) == 0) {
            function1 = function0;
            i3 = (x340Var.i(function1) ? 4 : 2) | i2;
        } else {
            function1 = function0;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= x340Var.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        int i5 = 224256 | i3;
        if ((1572864 & i2) == 0) {
            i5 = 748544 | i3;
        }
        if ((12582912 & i2) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= 268435456;
        }
        int i6 = 1;
        if (x340Var.Y(i5 & 1, (306783379 & i5) != 306783378)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                nx61 nx61Var = vu40.h;
                hw61 hw61VarA = poz0.v(x340Var).a();
                long jA = poz0.r(x340Var).a();
                hw61Var3 = hw61VarA;
                j5 = jA;
                jN = t4n1.n(jA);
                qqbVarK = ouo1.K(x340Var);
                vzq0VarG = w6d1.g(x340Var);
            } else {
                x340Var.b0();
                i6 = i;
                hw61Var3 = hw61Var;
                j5 = j;
                jN = j2;
                qqbVarK = qqbVar;
                vzq0VarG = vzq0Var;
            }
            x340Var.s();
            w6d1.l(x340Var);
            w6d1.m(x340Var);
            float fR = w6d1.r(i6);
            nx61 nx61Var2 = vu40.h;
            i3d1 i3d1Var = new i3d1(poz0.t(x340Var).a());
            x340Var.i0(1418603946);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zr7.d();
                x340Var.s0(objT);
            }
            x340Var.r(false);
            mod.b(r9e1.b().a(poz0.y(x340Var).a()), apo.r(-1764361679, new afc(qim0Var, z2, hw61Var3, j5, jN, i3d1Var, qqbVarK, (idn0) objT, function1, fR, vzq0VarG, 6.0f, j2iVar, 32.0f), x340Var), x340Var, 56);
            i4 = i6;
            hw61Var2 = hw61Var3;
            j3 = j5;
            j4 = jN;
            qqbVar2 = qqbVarK;
            vzq0Var2 = vzq0VarG;
        } else {
            x340Var.b0();
            i4 = i;
            hw61Var2 = hw61Var;
            j3 = j;
            j4 = j2;
            qqbVar2 = qqbVar;
            vzq0Var2 = vzq0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bfc(function0, qim0Var, z, i4, hw61Var2, j3, j4, qqbVar2, vzq0Var2, j2iVar, i2);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1700715475);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                x340Var.i0(1994972593);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
            } else {
                x340Var.i0(1994973588);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.b;
            }
            x340Var.r(false);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            uwo1.e(str, uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), lee1.a(cbx.d(x340Var).j, 0L, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 3, 0, 0L, null, null, null, 0, 16744447), j, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, (i2 & 14) | 1572864, 0, 1712);
            qim0Var2 = nim0Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(str, qim0Var2, z, i);
        }
    }

    public static final void c(m0t m0tVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1456274893);
        int i2 = (x340Var.i(m0tVar) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(m0tVar) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new zwm0(m0tVar, ven0Var, (lnm) null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            qim0Var = nim0Var;
            fq7.g(((Boolean) ven0Var.getValue()).booleanValue(), (qim0) null, xay.e(2, irn1.l0(0.0f, 10000.0f, (Object) null, 5)).a(xay.g(0.5f, 4, 0L, irn1.l0(0.0f, 1500.0f, (Object) null, 5))), xay.f(2, irn1.l0(0.0f, 10000.0f, (Object) null, 5)).a(xay.h(irn1.l0(0.0f, 1500.0f, (Object) null, 5), 0L, 4)), (String) null, apo.r(1524062229, new n1r0(m0tVar, (byte) 29), x340Var), x340Var, 196608, 18);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(m0tVar, qim0Var2, i, (byte) 7);
        }
    }

    public static final ValueAnimator d(long j, PathInterpolator pathInterpolator, List list) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addListener(new lk41(list, (byte) 0));
        valueAnimatorOfFloat.addUpdateListener(new kk41(list, (byte) 0));
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (p.fc11.u(r0.getWidth(), r0.getHeight(), p.cbp1.m(r1), p.cbp1.n(r1), r8) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap e(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, p.k291 r7, p.dg41 r8, boolean r9) {
        /*
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L4a
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            if (r6 == 0) goto L1a
            boolean r2 = p.fpi1.x(r6)
            if (r2 == 0) goto L18
            goto L1a
        L18:
            r2 = r6
            goto L1c
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L1c:
            if (r1 != r2) goto L4a
            if (r9 == 0) goto L21
            goto L49
        L21:
            int r9 = r0.getWidth()
            int r1 = r0.getHeight()
            p.k291 r2 = p.k291.c
            long r1 = p.fc11.t(r9, r1, r7, r8, r2)
            int r9 = p.cbp1.m(r1)
            int r1 = p.cbp1.n(r1)
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            double r1 = p.fc11.u(r2, r3, r9, r1, r8)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L4a
        L49:
            return r0
        L4a:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            int r9 = p.aqi1.b(r5)
            r0 = 512(0x200, float:7.17E-43)
            if (r9 <= 0) goto L57
            goto L58
        L57:
            r9 = r0
        L58:
            int r1 = p.aqi1.a(r5)
            if (r1 <= 0) goto L5f
            r0 = r1
        L5f:
            p.k291 r1 = p.k291.c
            long r1 = p.fc11.t(r9, r0, r7, r8, r1)
            int r7 = p.cbp1.m(r1)
            int r1 = p.cbp1.n(r1)
            double r7 = p.fc11.u(r9, r0, r7, r1, r8)
            double r1 = (double) r9
            double r1 = r1 * r7
            int r9 = p.jch0.S(r1)
            double r0 = (double) r0
            double r7 = r7 * r0
            int r7 = p.jch0.S(r7)
            if (r6 == 0) goto L85
            boolean r8 = p.fpi1.x(r6)
            if (r8 == 0) goto L87
        L85:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L87:
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r7, r6)
            android.graphics.Rect r8 = r5.getBounds()
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r3 = 0
            r5.setBounds(r3, r3, r9, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            r5.draw(r7)
            r5.setBounds(r0, r1, r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zno1.e(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, p.k291, p.dg41, boolean):android.graphics.Bitmap");
    }

    public static final void f(int i, int i2) {
        if (i <= i2) {
            return;
        }
        eg.g(l1d.j(i, i2, "toIndex (", ") is greater than size (", ")."));
    }

    public static Handler g(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ph5.g(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            eg.j(cause);
            return null;
        }
    }

    public static final mw20 h(en31 en31Var, boolean z, String[] strArr, iu30 iu30Var) {
        ec90 ec90VarH = en31Var.h();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        bvg1 bvg1Var = ec90VarH.b;
        mmr0 mmr0VarG = bvg1Var.g(strArr2);
        return new mw20(o4p1.m(h4p1.l(new l3g1(bvg1Var, (int[]) mmr0VarG.b, (String[]) mmr0VarG.a, false, (lnm) null, (byte) 6))), en31Var, z, iu30Var);
    }

    public static final float i(Integer num, View view) {
        return TypedValue.applyDimension(1, num.floatValue(), view.getContext().getResources().getDisplayMetrics());
    }

    public static final Bitmap j(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!view.isLaidOut()) {
            eg.m("View needs to be laid out before calling drawToBitmap()");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static ObjectAnimator l(View view, long j, PathInterpolator pathInterpolator, int i) {
        long j2 = (i & 8) != 0 ? 0L : 333L;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static ObjectAnimator m(View view, long j, long j2, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static int n(char c2, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final long o(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final Drawable p(Context context, int i) {
        Drawable drawableJ = f0o1.j(context, i);
        if (drawableJ != null) {
            return drawableJ;
        }
        bhn0.f(f4i1.c(i, "Invalid resource ID: "));
        return null;
    }

    public static boolean q(int i) {
        switch (Character.getType(i)) {
            default:
                if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                    switch (i) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    public static boolean r(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    public static int s(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map t(mmr0 mmr0Var) {
        return Collections.singletonMap(mmr0Var.a, mmr0Var.b);
    }

    public static v0d1 u(v0d1 v0d1Var) {
        if ((v0d1Var instanceof x0d1) || (v0d1Var instanceof w0d1)) {
            return v0d1Var;
        }
        return v0d1Var instanceof Serializable ? new w0d1(v0d1Var) : new x0d1(v0d1Var);
    }

    public static final AnimatorSet v(View view, float f, float f2, long j, long j2, PathInterpolator pathInterpolator) {
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

    public static int w(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int x(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    public static final ExtractedText y(c8e1 c8e1Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c8e1Var.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c8e1Var.b;
        extractedText.selectionStart = nbe1.g(j);
        extractedText.selectionEnd = nbe1.f(j);
        extractedText.flags = !ihc1.i0(c8e1Var.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static String z(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
