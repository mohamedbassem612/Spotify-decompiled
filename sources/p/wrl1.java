package p;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class wrl1 extends esl1 {
    public static boolean n = false;
    public static Method o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Class f135p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public nk80[] d;
    public nk80 e;
    public hsl1 f;
    public nk80 g;
    public int h;
    public dku i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public wrl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private dku D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return dku.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        br31 br31VarS = mb4.s(display, 0);
        br31 br31VarS2 = mb4.s(display, 1);
        br31 br31VarS3 = mb4.s(display, 2);
        br31 br31VarS4 = mb4.s(display, 3);
        return dku.a(point.x, point.y, false, br31VarS != null ? br31VarS.a() : 0, br31VarS2 != null ? br31VarS2.a() : 0, br31VarS3 != null ? br31VarS3.a() : 0, br31VarS4 != null ? br31VarS4.a() : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[fc11.K(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(nk80 nk80Var) {
        ArrayList arrayList = new ArrayList();
        int i = nk80Var.a;
        int i2 = nk80Var.d;
        int i3 = nk80Var.c;
        int i4 = nk80Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, nk80Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private nk80 G(int i, boolean z) {
        nk80 nk80VarA = nk80.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                nk80VarA = nk80.a(nk80VarA, H(i2, z));
            }
        }
        return nk80VarA;
    }

    private nk80 I() {
        hsl1 hsl1Var = this.f;
        return hsl1Var != null ? hsl1Var.a.l() : nk80.e;
    }

    private nk80 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            hhg1.h("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && f135p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) q.get(r.get(objInvoke));
                    if (rect != null) {
                        return nk80.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f135p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p.esl1
    public void A(int i) {
        this.h = i;
    }

    @Override // p.esl1
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // p.esl1
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public nk80 H(int i, boolean z) {
        nk80 nk80VarL;
        int i2;
        nk80 nk80Var = nk80.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    nk80[] nk80VarArr = this.d;
                    nk80VarL = nk80VarArr != null ? nk80VarArr[fc11.K(8)] : null;
                    if (nk80VarL != null) {
                        return nk80VarL;
                    }
                    nk80 nk80VarN = n();
                    nk80 nk80VarI = I();
                    int i3 = nk80VarN.d;
                    if (i3 > nk80VarI.d) {
                        return nk80.c(0, 0, 0, i3);
                    }
                    nk80 nk80Var2 = this.g;
                    if (nk80Var2 != null && !nk80Var2.equals(nk80Var) && (i2 = this.g.d) > nk80VarI.d) {
                        return nk80.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        hsl1 hsl1Var = this.f;
                        hju hjuVarH = hsl1Var != null ? hsl1Var.a.h() : h();
                        if (hjuVarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return nk80.c(i4 >= 28 ? ph5.x(hjuVarH.a) : 0, i4 >= 28 ? ph5.z(hjuVarH.a) : 0, i4 >= 28 ? ph5.y(hjuVarH.a) : 0, i4 >= 28 ? ph5.w(hjuVarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    nk80 nk80VarI2 = I();
                    nk80 nk80VarL2 = l();
                    return nk80.c(Math.max(nk80VarI2.a, nk80VarL2.a), 0, Math.max(nk80VarI2.c, nk80VarL2.c), Math.max(nk80VarI2.d, nk80VarL2.d));
                }
                if ((this.h & 2) == 0) {
                    nk80 nk80VarN2 = n();
                    hsl1 hsl1Var2 = this.f;
                    nk80VarL = hsl1Var2 != null ? hsl1Var2.a.l() : null;
                    int iMin = nk80VarN2.d;
                    if (nk80VarL != null) {
                        iMin = Math.min(iMin, nk80VarL.d);
                    }
                    return nk80.c(nk80VarN2.a, 0, nk80VarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return nk80.c(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return nk80.c(0, n().b, 0, 0);
            }
        }
        return nk80Var;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(nk80.e);
    }

    @Override // p.esl1
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        nk80 nk80VarJ = J(view);
        if (nk80VarJ == null) {
            nk80VarJ = nk80.e;
        }
        x(nk80VarJ);
    }

    @Override // p.esl1
    public void e(hsl1 hsl1Var) {
        hsl1Var.a.y(this.f);
        nk80 nk80Var = this.g;
        esl1 esl1Var = hsl1Var.a;
        esl1Var.x(nk80Var);
        esl1Var.A(this.h);
        esl1Var.v(this.i);
        esl1Var.B(this.l);
        esl1Var.C(this.m);
    }

    @Override // p.esl1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        wrl1 wrl1Var = (wrl1) obj;
        return Objects.equals(this.g, wrl1Var.g) && M(this.h, wrl1Var.h);
    }

    @Override // p.esl1
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // p.esl1
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // p.esl1
    public nk80 i(int i) {
        return G(i, false);
    }

    @Override // p.esl1
    public nk80 j(int i) {
        return G(i, true);
    }

    @Override // p.esl1
    public final nk80 n() {
        nk80 nk80Var = this.e;
        if (nk80Var != null) {
            return nk80Var;
        }
        WindowInsets windowInsets = this.c;
        nk80 nk80VarC = nk80.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = nk80VarC;
        return nk80VarC;
    }

    @Override // p.esl1
    public void p(View view) {
        this.i = D(view);
    }

    @Override // p.esl1
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iK = fc11.K(i);
            this.l[iK] = F(i(i));
            if (i != 8) {
                this.m[iK] = F(j(i));
            }
        }
    }

    @Override // p.esl1
    public hsl1 r(int i, int i2, int i3, int i4) {
        dmj1 dmj1Var = new dmj1(hsl1.g(null, this.c));
        dmj1Var.f(hsl1.e(n(), i, i2, i3, i4));
        dmj1Var.e(hsl1.e(l(), i, i2, i3, i4));
        return dmj1Var.b();
    }

    @Override // p.esl1
    public boolean t() {
        return this.c.isRound();
    }

    @Override // p.esl1
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p.esl1
    public void v(dku dkuVar) {
        this.i = dkuVar;
    }

    @Override // p.esl1
    public void w(nk80[] nk80VarArr) {
        this.d = nk80VarArr;
    }

    @Override // p.esl1
    public void x(nk80 nk80Var) {
        this.g = nk80Var;
    }

    @Override // p.esl1
    public void y(hsl1 hsl1Var) {
        this.f = hsl1Var;
    }

    public wrl1(hsl1 hsl1Var, wrl1 wrl1Var) {
        this(hsl1Var, new WindowInsets(wrl1Var.c));
    }
}
