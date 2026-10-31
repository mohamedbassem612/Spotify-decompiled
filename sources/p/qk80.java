package p;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qk80 extends jme implements Runnable, k1q0, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public hsl1 e;
    public final nen0 f;
    public final err0 g;
    public final wdn0 h;
    public final bw91 i;

    public qk80() {
        super(1);
        nen0 nen0Var = new nen0(9);
        xsl1.a.getClass();
        nen0Var.m(wsl1.b, new mtl1("caption bar"));
        nen0Var.m(wsl1.c, new mtl1("display cutout"));
        nen0Var.m(wsl1.d, new mtl1("ime"));
        nen0Var.m(wsl1.e, new mtl1("mandatory system gestures"));
        nen0Var.m(wsl1.f, new mtl1("navigation bars"));
        nen0Var.m(wsl1.g, new mtl1("status bars"));
        nen0Var.m(wsl1.h, new mtl1("system gestures"));
        nen0Var.m(wsl1.i, new mtl1("tappable element"));
        nen0Var.m(wsl1.j, new mtl1("waterfall"));
        this.f = nen0Var;
        this.g = apo.q(0);
        this.h = new wdn0(4);
        this.i = xto.p();
    }

    public final void V0(hsl1 hsl1Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i;
        fdn0 fdn0Var = zsl1.a;
        int[] iArr2 = fdn0Var.b;
        Object[] objArr2 = fdn0Var.c;
        long[] jArr2 = fdn0Var.a;
        int length = jArr2.length - 2;
        nen0 nen0Var = this.f;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            xsl1 xsl1Var = (xsl1) objArr2[i6];
                            esl1 esl1Var = hsl1Var.a;
                            nk80 nk80VarI = esl1Var.i(i7);
                            long j3 = (((long) nk80VarI.a) << 48) | (((long) nk80VarI.b) << 32) | (((long) nk80VarI.c) << 16) | ((long) nk80VarI.d);
                            Object objG = nen0Var.g(xsl1Var);
                            objG.getClass();
                            mtl1 mtl1Var = (mtl1) objG;
                            if (!zxo1.t(j3, mtl1Var.h)) {
                                mtl1Var.h = j3;
                                z2 = true;
                                if (!zxo1.t(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                nk80 nk80VarJ = esl1Var.j(i7);
                                long j4 = ((long) nk80VarJ.d) | (((long) nk80VarJ.a) << 48) | (((long) nk80VarJ.b) << 32) | (((long) nk80VarJ.c) << 16);
                                if (!zxo1.t(mtl1Var.i, j4)) {
                                    mtl1Var.i = j4;
                                    z2 = true;
                                    if (!zxo1.t(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            }
                            mtl1Var.a.setValue(Boolean.valueOf(esl1Var.u(i7)));
                            i = 8;
                        } else {
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        hju hjuVarH = hsl1Var.a.h();
        if (hjuVarH == null) {
            j = 0;
        } else {
            nk80 nk80VarA = hjuVarH.a();
            j = ((long) nk80VarA.d) | (((long) nk80VarA.a) << c3) | (((long) nk80VarA.b) << c2) | (((long) nk80VarA.c) << c);
        }
        xsl1.a.getClass();
        Object objG2 = nen0Var.g(wsl1.j);
        objG2.getClass();
        mtl1 mtl1Var2 = (mtl1) objG2;
        mtl1Var2.a.setValue(Boolean.valueOf(!zxo1.t(j, 0L)));
        if (!zxo1.t(mtl1Var2.h, j)) {
            mtl1Var2.h = j;
            mtl1Var2.i = j;
            z2 = z;
            if (!zxo1.t(j, 0L)) {
                z3 = z2;
            }
        }
        bw91 bw91Var = this.i;
        wdn0 wdn0Var = this.h;
        if (hjuVarH != null) {
            List listO = Build.VERSION.SDK_INT >= 28 ? ph5.o(hjuVarH.a) : Collections.EMPTY_LIST;
            if (listO.size() < wdn0Var.b) {
                wdn0Var.m(listO.size(), wdn0Var.b);
                bw91Var.b(listO.size(), bw91Var.size());
                z2 = z;
            } else {
                int size = listO.size() - wdn0Var.b;
                int i8 = 0;
                while (i8 < size) {
                    wdn0Var.b(xto.t(listO.get(wdn0Var.b)));
                    bw91Var.add(o0p1.i("display cutout rect " + wdn0Var.b));
                    i8++;
                    z2 = z;
                }
            }
            List list = listO;
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                Rect rect = (Rect) listO.get(i9);
                ven0 ven0Var = (ven0) wdn0Var.g(i9);
                if (!u890.j(ven0Var.getValue(), rect)) {
                    ven0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        } else if (wdn0Var.b > 0) {
            wdn0Var.e();
            bw91Var.clear();
            z2 = z;
        }
        err0 err0Var = this.g;
        if ((z3 || err0Var.s() != 0) && z2) {
            err0Var.t(err0Var.s() + 1);
            ekb.D();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(view, this);
        mrl1.e(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(view, null);
        mrl1.e(view, (jme) null);
    }

    public final void r0(mrl1 mrl1Var) {
        this.c = false;
        int iD = mrl1Var.d();
        this.d &= ~iD;
        this.e = null;
        xsl1 xsl1Var = (xsl1) zsl1.a.b(iD);
        if (xsl1Var != null) {
            Object objG = this.f.g(xsl1Var);
            objG.getClass();
            mtl1 mtl1Var = (mtl1) objG;
            drr0 drr0Var = mtl1Var.c;
            drr0Var.t(0.0f);
            mtl1Var.e.t(1.0f);
            mtl1Var.d.t(0L);
            drr0Var.t(0.0f);
            mtl1Var.b.setValue(Boolean.FALSE);
            mtl1Var.j = -1L;
            mtl1Var.k = -1L;
            err0 err0Var = this.g;
            err0Var.t(err0Var.s() + 1);
            ekb.D();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            hsl1 hsl1Var = this.e;
            if (hsl1Var != null) {
                V0(hsl1Var);
                this.e = null;
            }
        }
    }

    public final void s0(mrl1 mrl1Var) {
        this.c = true;
    }

    public final hsl1 t0(hsl1 hsl1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mrl1 mrl1Var = (mrl1) list.get(i);
            xsl1 xsl1Var = (xsl1) zsl1.a.b(mrl1Var.d());
            if (xsl1Var != null) {
                Object objG = this.f.g(xsl1Var);
                objG.getClass();
                mtl1 mtl1Var = (mtl1) objG;
                if (((Boolean) mtl1Var.b.getValue()).booleanValue()) {
                    mtl1Var.c.t(mrl1Var.c());
                    mtl1Var.e.t(mrl1Var.a());
                    mtl1Var.d.t(mrl1Var.b());
                }
            }
        }
        V0(hsl1Var);
        return hsl1Var;
    }

    public final frl1 u0(mrl1 mrl1Var, frl1 frl1Var) {
        hsl1 hsl1Var = this.e;
        this.c = false;
        this.e = null;
        if (mrl1Var.b() > 0 && hsl1Var != null) {
            int iD = mrl1Var.d();
            this.d |= iD;
            xsl1 xsl1Var = (xsl1) zsl1.a.b(iD);
            if (xsl1Var != null) {
                Object objG = this.f.g(xsl1Var);
                objG.getClass();
                mtl1 mtl1Var = (mtl1) objG;
                nk80 nk80VarI = hsl1Var.a.i(iD);
                long j = ((long) nk80VarI.d) | (((long) nk80VarI.a) << 48) | (((long) nk80VarI.b) << 32) | (((long) nk80VarI.c) << 16);
                long j2 = mtl1Var.h;
                if (!zxo1.t(j, j2)) {
                    mtl1Var.j = j2;
                    mtl1Var.k = j;
                    mtl1Var.b.setValue(Boolean.TRUE);
                    mtl1Var.c.t(mrl1Var.c());
                    mtl1Var.e.t(mrl1Var.a());
                    mtl1Var.d.t(mrl1Var.b());
                    err0 err0Var = this.g;
                    err0Var.t(err0Var.s() + 1);
                    ekb.D();
                }
            }
        }
        return frl1Var;
    }

    @Override // p.k1q0
    public final hsl1 x(View view, hsl1 hsl1Var) {
        if (this.c) {
            this.e = hsl1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return hsl1Var;
            }
        } else if (this.d == 0) {
            V0(hsl1Var);
        }
        return hsl1Var;
    }
}
