package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p.bjl;
import p.cjl;
import p.djl;
import p.ijl;
import p.inz0;
import p.kil;
import p.l660;
import p.le;
import p.ohl;
import p.qhl;
import p.rhl;
import p.tq50;
import p.yic0;
import p.yv71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static yv71 S0;
    public le N0;
    public int O0;
    public HashMap P0;
    public final SparseArray Q0;
    public final rhl R0;
    public final SparseArray a;
    public final ArrayList b;
    public final djl c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public kil t;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new djl();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.t = null;
        this.N0 = null;
        this.O0 = -1;
        this.P0 = new HashMap();
        this.Q0 = new SparseArray();
        this.R0 = new rhl(this, this);
        s(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static yv71 getSharedValues() {
        yv71 yv71Var = S0;
        if (yv71Var != null) {
            return yv71Var;
        }
        yv71 yv71Var2 = new yv71();
        S0 = yv71Var2;
        return yv71Var2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    public final void a(boolean z, View view, cjl cjlVar, qhl qhlVar, SparseArray sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        cjl cjlVar2;
        int i2;
        int i3;
        int i4;
        cjl cjlVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        cjl cjlVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        cjl cjlVar5;
        int i14;
        int i15;
        qhl qhlVar2;
        int i16;
        int i17;
        cjl cjlVar6;
        int i18;
        float f;
        cjl cjlVar7;
        cjl cjlVar8;
        cjl cjlVar9;
        int i19;
        cjl cjlVar10 = cjlVar;
        qhlVar.a();
        cjlVar10.i0 = view.getVisibility();
        cjlVar10.h0 = view;
        if (view instanceof ohl) {
            constraintLayout = this;
            ((ohl) view).k(cjlVar10, constraintLayout.c.z0);
        } else {
            constraintLayout = this;
        }
        if (qhlVar.d0) {
            tq50 tq50Var = (tq50) cjlVar10;
            int i20 = qhlVar.m0;
            int i21 = qhlVar.n0;
            float f2 = qhlVar.o0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    tq50Var.u0 = f2;
                    tq50Var.v0 = -1;
                    tq50Var.w0 = -1;
                    return;
                }
                return;
            }
            if (i20 != -1) {
                if (i20 > -1) {
                    tq50Var.u0 = -1.0f;
                    tq50Var.v0 = i20;
                    tq50Var.w0 = -1;
                    return;
                }
                return;
            }
            if (i21 == -1 || i21 <= -1) {
                return;
            }
            tq50Var.u0 = -1.0f;
            tq50Var.v0 = -1;
            tq50Var.w0 = i21;
            return;
        }
        int i22 = qhlVar.f0;
        int i23 = qhlVar.g0;
        int i24 = qhlVar.h0;
        int i25 = qhlVar.i0;
        int i26 = qhlVar.j0;
        int i27 = qhlVar.k0;
        float f3 = qhlVar.l0;
        int i28 = qhlVar.f100p;
        if (i28 != -1) {
            cjl cjlVar11 = (cjl) sparseArray.get(i28);
            if (cjlVar11 != null) {
                float f4 = qhlVar.r;
                cjlVar.x(7, 7, qhlVar.q, 0, cjlVar11);
                cjlVar10 = cjlVar;
                cjlVar10.E = f4;
            }
            cjlVar6 = cjlVar10;
            qhlVar2 = qhlVar;
            i5 = 4;
            i4 = 2;
            i18 = 5;
            i12 = 3;
        } else {
            if (i22 != -1) {
                cjl cjlVar12 = (cjl) sparseArray.get(i22);
                if (cjlVar12 != null) {
                    i = 2;
                    cjlVar10.x(2, 2, ((ViewGroup.MarginLayoutParams) qhlVar).leftMargin, i26, cjlVar12);
                } else {
                    i = 2;
                }
            } else {
                i = 2;
                if (i23 != -1 && (cjlVar2 = (cjl) sparseArray.get(i23)) != null) {
                    cjlVar.x(2, 4, ((ViewGroup.MarginLayoutParams) qhlVar).leftMargin, i26, cjlVar2);
                    i2 = 2;
                    i3 = 4;
                }
                if (i24 != -1) {
                    cjlVar9 = (cjl) sparseArray.get(i24);
                    if (cjlVar9 != null) {
                        cjlVar.x(i3, i2, ((ViewGroup.MarginLayoutParams) qhlVar).rightMargin, i27, cjlVar9);
                    }
                    i4 = i2;
                } else {
                    i4 = i2;
                    if (i25 != -1 && (cjlVar3 = (cjl) sparseArray.get(i25)) != null) {
                        cjlVar.x(i3, i3, ((ViewGroup.MarginLayoutParams) qhlVar).rightMargin, i27, cjlVar3);
                    }
                }
                i5 = i3;
                i6 = qhlVar.i;
                if (i6 != -1) {
                    cjlVar8 = (cjl) sparseArray.get(i6);
                    if (cjlVar8 != null) {
                        i7 = 3;
                        cjlVar.x(3, 3, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, qhlVar.x, cjlVar8);
                    } else {
                        i7 = 3;
                    }
                } else {
                    i7 = 3;
                    i8 = qhlVar.j;
                    if (i8 == -1 && (cjlVar4 = (cjl) sparseArray.get(i8)) != null) {
                        cjlVar.x(3, 5, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, qhlVar.x, cjlVar4);
                        i9 = 3;
                        i10 = 5;
                    }
                    i11 = qhlVar.k;
                    if (i11 != -1) {
                        cjlVar7 = (cjl) sparseArray.get(i11);
                        if (cjlVar7 != null) {
                            cjlVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar7);
                        }
                        i12 = i9;
                    } else {
                        i12 = i9;
                        i13 = qhlVar.l;
                        if (i13 != -1 && (cjlVar5 = (cjl) sparseArray.get(i13)) != null) {
                            cjlVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar5);
                        }
                    }
                    i14 = i10;
                    i15 = qhlVar.m;
                    if (i15 != -1) {
                        qhlVar2 = qhlVar;
                        constraintLayout.x(cjlVar, qhlVar2, sparseArray, i15, 6);
                    } else {
                        qhlVar2 = qhlVar;
                        i16 = qhlVar2.n;
                        if (i16 != -1) {
                            x(cjlVar, qhlVar2, sparseArray, i16, i12);
                        } else {
                            i17 = qhlVar2.o;
                            if (i17 != -1) {
                                x(cjlVar, qhlVar2, sparseArray, i17, i14);
                                cjlVar6 = cjlVar;
                                i18 = i14;
                            }
                            if (f3 >= 0.0f) {
                                cjlVar6.f0 = f3;
                            }
                            f = qhlVar2.F;
                            if (f >= 0.0f) {
                                cjlVar6.g0 = f;
                            }
                        }
                    }
                    cjlVar6 = cjlVar;
                    i18 = i14;
                    if (f3 >= 0.0f) {
                        cjlVar6.f0 = f3;
                    }
                    f = qhlVar2.F;
                    if (f >= 0.0f) {
                        cjlVar6.g0 = f;
                    }
                }
                i9 = i7;
                i10 = 5;
                i11 = qhlVar.k;
                if (i11 != -1) {
                    cjlVar7 = (cjl) sparseArray.get(i11);
                    if (cjlVar7 != null) {
                        cjlVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar7);
                    }
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = qhlVar.l;
                    if (i13 != -1) {
                        cjlVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar5);
                    }
                }
                i14 = i10;
                i15 = qhlVar.m;
                if (i15 != -1) {
                    qhlVar2 = qhlVar;
                    constraintLayout.x(cjlVar, qhlVar2, sparseArray, i15, 6);
                } else {
                    qhlVar2 = qhlVar;
                    i16 = qhlVar2.n;
                    if (i16 != -1) {
                        x(cjlVar, qhlVar2, sparseArray, i16, i12);
                    } else {
                        i17 = qhlVar2.o;
                        if (i17 != -1) {
                            x(cjlVar, qhlVar2, sparseArray, i17, i14);
                            cjlVar6 = cjlVar;
                            i18 = i14;
                        }
                        if (f3 >= 0.0f) {
                            cjlVar6.f0 = f3;
                        }
                        f = qhlVar2.F;
                        if (f >= 0.0f) {
                            cjlVar6.g0 = f;
                        }
                    }
                }
                cjlVar6 = cjlVar;
                i18 = i14;
                if (f3 >= 0.0f) {
                    cjlVar6.f0 = f3;
                }
                f = qhlVar2.F;
                if (f >= 0.0f) {
                    cjlVar6.g0 = f;
                }
            }
            i2 = i;
            i3 = 4;
            if (i24 != -1) {
                cjlVar9 = (cjl) sparseArray.get(i24);
                if (cjlVar9 != null) {
                    cjlVar.x(i3, i2, ((ViewGroup.MarginLayoutParams) qhlVar).rightMargin, i27, cjlVar9);
                }
                i4 = i2;
            } else {
                i4 = i2;
                if (i25 != -1) {
                    cjlVar.x(i3, i3, ((ViewGroup.MarginLayoutParams) qhlVar).rightMargin, i27, cjlVar3);
                }
            }
            i5 = i3;
            i6 = qhlVar.i;
            if (i6 != -1) {
                cjlVar8 = (cjl) sparseArray.get(i6);
                if (cjlVar8 != null) {
                    i7 = 3;
                    cjlVar.x(3, 3, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, qhlVar.x, cjlVar8);
                } else {
                    i7 = 3;
                }
            } else {
                i7 = 3;
                i8 = qhlVar.j;
                if (i8 == -1) {
                }
                i11 = qhlVar.k;
                if (i11 != -1) {
                    cjlVar7 = (cjl) sparseArray.get(i11);
                    if (cjlVar7 != null) {
                        cjlVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar7);
                    }
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = qhlVar.l;
                    if (i13 != -1) {
                        cjlVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar5);
                    }
                }
                i14 = i10;
                i15 = qhlVar.m;
                if (i15 != -1) {
                    qhlVar2 = qhlVar;
                    constraintLayout.x(cjlVar, qhlVar2, sparseArray, i15, 6);
                } else {
                    qhlVar2 = qhlVar;
                    i16 = qhlVar2.n;
                    if (i16 != -1) {
                        x(cjlVar, qhlVar2, sparseArray, i16, i12);
                    } else {
                        i17 = qhlVar2.o;
                        if (i17 != -1) {
                            x(cjlVar, qhlVar2, sparseArray, i17, i14);
                            cjlVar6 = cjlVar;
                            i18 = i14;
                        }
                        if (f3 >= 0.0f) {
                            cjlVar6.f0 = f3;
                        }
                        f = qhlVar2.F;
                        if (f >= 0.0f) {
                            cjlVar6.g0 = f;
                        }
                    }
                }
                cjlVar6 = cjlVar;
                i18 = i14;
                if (f3 >= 0.0f) {
                    cjlVar6.f0 = f3;
                }
                f = qhlVar2.F;
                if (f >= 0.0f) {
                    cjlVar6.g0 = f;
                }
            }
            i9 = i7;
            i10 = 5;
            i11 = qhlVar.k;
            if (i11 != -1) {
                cjlVar7 = (cjl) sparseArray.get(i11);
                if (cjlVar7 != null) {
                    cjlVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar7);
                }
                i12 = i9;
            } else {
                i12 = i9;
                i13 = qhlVar.l;
                if (i13 != -1) {
                    cjlVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin, qhlVar.z, cjlVar5);
                }
            }
            i14 = i10;
            i15 = qhlVar.m;
            if (i15 != -1) {
                qhlVar2 = qhlVar;
                constraintLayout.x(cjlVar, qhlVar2, sparseArray, i15, 6);
            } else {
                qhlVar2 = qhlVar;
                i16 = qhlVar2.n;
                if (i16 != -1) {
                    x(cjlVar, qhlVar2, sparseArray, i16, i12);
                } else {
                    i17 = qhlVar2.o;
                    if (i17 != -1) {
                        x(cjlVar, qhlVar2, sparseArray, i17, i14);
                        cjlVar6 = cjlVar;
                        i18 = i14;
                    }
                    if (f3 >= 0.0f) {
                        cjlVar6.f0 = f3;
                    }
                    f = qhlVar2.F;
                    if (f >= 0.0f) {
                        cjlVar6.g0 = f;
                    }
                }
            }
            cjlVar6 = cjlVar;
            i18 = i14;
            if (f3 >= 0.0f) {
                cjlVar6.f0 = f3;
            }
            f = qhlVar2.F;
            if (f >= 0.0f) {
                cjlVar6.g0 = f;
            }
        }
        if (z && ((i19 = qhlVar2.T) != -1 || qhlVar2.U != -1)) {
            int i29 = qhlVar2.U;
            cjlVar6.a0 = i19;
            cjlVar6.b0 = i29;
        }
        boolean z2 = qhlVar2.a0;
        bjl bjlVar = bjl.b;
        bjl bjlVar2 = bjl.a;
        bjl bjlVar3 = bjl.d;
        bjl bjlVar4 = bjl.c;
        if (z2) {
            cjlVar6.P(bjlVar2);
            cjlVar6.T(((ViewGroup.MarginLayoutParams) qhlVar2).width);
            if (((ViewGroup.MarginLayoutParams) qhlVar2).width == -2) {
                cjlVar6.P(bjlVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) qhlVar2).width == -1) {
            if (qhlVar2.W) {
                cjlVar6.P(bjlVar4);
            } else {
                cjlVar6.P(bjlVar3);
            }
            cjlVar6.k(i4).g = ((ViewGroup.MarginLayoutParams) qhlVar2).leftMargin;
            cjlVar6.k(i5).g = ((ViewGroup.MarginLayoutParams) qhlVar2).rightMargin;
        } else {
            cjlVar6.P(bjlVar4);
            cjlVar6.T(0);
        }
        if (qhlVar2.b0) {
            cjlVar6.R(bjlVar2);
            cjlVar6.O(((ViewGroup.MarginLayoutParams) qhlVar2).height);
            if (((ViewGroup.MarginLayoutParams) qhlVar2).height == -2) {
                cjlVar6.R(bjlVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) qhlVar2).height == -1) {
            if (qhlVar2.X) {
                cjlVar6.R(bjlVar4);
            } else {
                cjlVar6.R(bjlVar3);
            }
            cjlVar6.k(i12).g = ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin;
            cjlVar6.k(i18).g = ((ViewGroup.MarginLayoutParams) qhlVar2).bottomMargin;
        } else {
            cjlVar6.R(bjlVar4);
            cjlVar6.O(0);
        }
        cjlVar6.L(qhlVar2.G);
        float f5 = qhlVar2.H;
        float[] fArr = cjlVar6.n0;
        fArr[0] = f5;
        fArr[1] = qhlVar2.I;
        cjlVar6.l0 = qhlVar2.J;
        cjlVar6.m0 = qhlVar2.K;
        int i30 = qhlVar2.Z;
        if (i30 >= 0 && i30 <= 3) {
            cjlVar6.r = i30;
        }
        cjlVar6.Q(qhlVar2.R, qhlVar2.L, qhlVar2.N, qhlVar2.P);
        cjlVar6.S(qhlVar2.S, qhlVar2.M, qhlVar2.O, qhlVar2.Q);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qhl generateDefaultLayoutParams() {
        return new qhl(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qhl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ohl) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qhl(layoutParams);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        djl djlVar = this.c;
        if (djlVar.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                djlVar.k = getContext().getResources().getResourceEntryName(id2);
            } else {
                djlVar.k = "parent";
            }
        }
        if (djlVar.k0 == null) {
            djlVar.k0 = djlVar.k;
            String str = djlVar.k0;
        }
        for (cjl cjlVar : djlVar.u0) {
            View view = (View) cjlVar.h0;
            if (view != null) {
                if (cjlVar.k == null && (id = view.getId()) != -1) {
                    cjlVar.k = getContext().getResources().getResourceEntryName(id);
                }
                if (cjlVar.k0 == null) {
                    cjlVar.k0 = cjlVar.k;
                }
            }
        }
        djlVar.p(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            qhl qhlVar = (qhl) childAt.getLayoutParams();
            cjl cjlVar = qhlVar.p0;
            if (childAt.getVisibility() != 8 || qhlVar.d0 || qhlVar.e0 || zIsInEditMode) {
                int iT = cjlVar.t();
                int iU = cjlVar.u();
                childAt.layout(iT, iU, cjlVar.s() + iT, cjlVar.m() + iU);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ohl) arrayList.get(i6)).l();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int iG;
        cjl cjlVar;
        boolean z2 = this.h;
        this.h = z2;
        if (!z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
            }
        }
        boolean zT = t();
        djl djlVar = this.c;
        djlVar.z0 = zT;
        if (this.h) {
            this.h = false;
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i4).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    cjl cjlVarR = r(getChildAt(i5));
                    if (cjlVarR != null) {
                        cjlVarR.E();
                    }
                }
                Object obj = null;
                SparseArray sparseArray = this.a;
                if (zIsInEditMode) {
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        View childAt = getChildAt(i6);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.P0 == null) {
                                    this.P0 = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.P0.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                cjlVar = viewFindViewById == this ? djlVar : viewFindViewById == null ? null : ((qhl) viewFindViewById.getLayoutParams()).p0;
                            }
                            cjlVar.k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.O0 != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                kil kilVar = this.t;
                if (kilVar != null) {
                    kilVar.c(this);
                }
                djlVar.u0.clear();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                if (size > 0) {
                    int i8 = 0;
                    while (i8 < size) {
                        ohl ohlVar = (ohl) arrayList.get(i8);
                        HashMap map = ohlVar.g;
                        if (ohlVar.isInEditMode()) {
                            ohlVar.setIds(ohlVar.e);
                        }
                        l660 l660Var = ohlVar.d;
                        if (l660Var != null) {
                            l660Var.v0 = 0;
                            Arrays.fill(l660Var.u0, obj);
                            for (int i9 = 0; i9 < ohlVar.b; i9++) {
                                int i10 = ohlVar.a[i9];
                                View view = (View) sparseArray.get(i10);
                                if (view == null && (iG = ohlVar.g(this, (str = (String) map.get(Integer.valueOf(i10))))) != 0) {
                                    ohlVar.a[i9] = iG;
                                    map.put(Integer.valueOf(iG), str);
                                    view = (View) sparseArray.get(iG);
                                }
                                if (view != null) {
                                    ohlVar.d.W(r(view));
                                }
                            }
                            ohlVar.d.Y();
                        }
                        i8++;
                        obj = null;
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                SparseArray sparseArray2 = this.Q0;
                sparseArray2.clear();
                sparseArray2.put(0, djlVar);
                sparseArray2.put(getId(), djlVar);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    sparseArray2.put(childAt2.getId(), r(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    cjl cjlVarR2 = r(childAt3);
                    if (cjlVarR2 != null) {
                        qhl qhlVar = (qhl) childAt3.getLayoutParams();
                        djlVar.W(cjlVarR2);
                        a(zIsInEditMode, childAt3, cjlVarR2, qhlVar, sparseArray2);
                    }
                }
            }
            if (z) {
                djlVar.v0.E(djlVar);
            }
        }
        djlVar.A0.getClass();
        w(djlVar, this.i, i, i2);
        v(i, i2, djlVar.s(), djlVar.m(), djlVar.I0, djlVar.J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        cjl cjlVarR = r(view);
        if ((view instanceof Guideline) && !(cjlVarR instanceof tq50)) {
            qhl qhlVar = (qhl) view.getLayoutParams();
            tq50 tq50Var = new tq50();
            qhlVar.p0 = tq50Var;
            qhlVar.d0 = true;
            tq50Var.X(qhlVar.V);
        }
        if (view instanceof ohl) {
            ohl ohlVar = (ohl) view;
            ohlVar.m();
            ((qhl) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(ohlVar)) {
                arrayList.add(ohlVar);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        cjl cjlVarR = r(view);
        this.c.u0.remove(cjlVarR);
        cjlVarR.E();
        this.b.remove(view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public qhl generateLayoutParams(AttributeSet attributeSet) {
        return new qhl(getContext(), attributeSet);
    }

    public final cjl r(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof qhl) {
            return ((qhl) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof qhl) {
            return ((qhl) view.getLayoutParams()).p0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final void s(AttributeSet attributeSet, int i, int i2) {
        djl djlVar = this.c;
        djlVar.h0 = this;
        rhl rhlVar = this.R0;
        djlVar.y0 = rhlVar;
        djlVar.w0.C(rhlVar);
        this.a.put(getId(), this);
        this.t = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, inz0.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            u(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.N0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        kil kilVar = new kil();
                        this.t = kilVar;
                        kilVar.n(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.t = null;
                    }
                    this.O0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        djlVar.H0 = this.i;
        yic0.f148p = djlVar.b0(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS);
    }

    public void setConstraintSet(kil kilVar) {
        this.t = kilVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ijl ijlVar) {
        le leVar = this.N0;
        if (leVar != null) {
            leVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        djl djlVar = this.c;
        djlVar.H0 = i;
        yic0.f148p = djlVar.b0(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void u(int i) {
        this.N0 = new le(getContext(), this, i);
    }

    public final void v(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        rhl rhlVar = this.R0;
        int i5 = rhlVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + rhlVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    public final void w(djl djlVar, int i, int i2, int i3) {
        int iMax;
        bjl bjlVar;
        int iMax2;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i6 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        rhl rhlVar = this.R0;
        rhlVar.b = iMax3;
        rhlVar.c = iMax4;
        rhlVar.d = paddingWidth;
        rhlVar.e = i6;
        rhlVar.f = i2;
        rhlVar.g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (t()) {
            iMax5 = iMax6;
        }
        int i7 = size - paddingWidth;
        int i8 = size2 - i6;
        int i9 = rhlVar.e;
        int i10 = rhlVar.d;
        int childCount = getChildCount();
        bjl bjlVar2 = bjl.b;
        bjl bjlVar3 = bjl.a;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                iMax = mode != 1073741824 ? 0 : Math.min(this.f - i10, i7);
                bjlVar = bjlVar3;
            } else {
                iMax = childCount == 0 ? Math.max(0, this.d) : 0;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.g - i9, i8);
                    }
                    bjlVar2 = bjlVar3;
                } else if (childCount == 0) {
                    iMax2 = Math.max(0, this.e);
                } else {
                    iMax2 = 0;
                }
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = i8;
            }
            if (iMax == djlVar.s() || iMax2 != djlVar.m()) {
                djlVar.w0.v();
            }
            djlVar.a0 = 0;
            djlVar.b0 = 0;
            int i11 = this.f - i10;
            int[] iArr = djlVar.D;
            iArr[0] = i11;
            iArr[1] = this.g - i9;
            djlVar.d0 = 0;
            djlVar.e0 = 0;
            djlVar.P(bjlVar);
            djlVar.T(iMax);
            djlVar.R(bjlVar2);
            djlVar.O(iMax2);
            i4 = this.d - i10;
            if (i4 < 0) {
                djlVar.d0 = 0;
            } else {
                djlVar.d0 = i4;
            }
            i5 = this.e - i9;
            if (i5 < 0) {
                djlVar.e0 = 0;
            } else {
                djlVar.e0 = i5;
            }
            djlVar.B0 = iMax5;
            djlVar.C0 = iMax3;
            djlVar.v0.D(djlVar, i, mode, i7, mode2, i8);
        }
        iMax = childCount == 0 ? Math.max(0, this.d) : i7;
        bjlVar = bjlVar2;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.g - i9, i8);
                }
                bjlVar2 = bjlVar3;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = 0;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.e);
        } else {
            iMax2 = i8;
        }
        if (iMax == djlVar.s()) {
            djlVar.w0.v();
        } else {
            djlVar.w0.v();
        }
        djlVar.a0 = 0;
        djlVar.b0 = 0;
        int i12 = this.f - i10;
        int[] iArr2 = djlVar.D;
        iArr2[0] = i12;
        iArr2[1] = this.g - i9;
        djlVar.d0 = 0;
        djlVar.e0 = 0;
        djlVar.P(bjlVar);
        djlVar.T(iMax);
        djlVar.R(bjlVar2);
        djlVar.O(iMax2);
        i4 = this.d - i10;
        if (i4 < 0) {
            djlVar.d0 = 0;
        } else {
            djlVar.d0 = i4;
        }
        i5 = this.e - i9;
        if (i5 < 0) {
            djlVar.e0 = 0;
        } else {
            djlVar.e0 = i5;
        }
        djlVar.B0 = iMax5;
        djlVar.C0 = iMax3;
        djlVar.v0.D(djlVar, i, mode, i7, mode2, i8);
    }

    public final void x(cjl cjlVar, qhl qhlVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        cjl cjlVar2 = (cjl) sparseArray.get(i);
        if (cjlVar2 == null || view == null || !(view.getLayoutParams() instanceof qhl)) {
            return;
        }
        qhlVar.c0 = true;
        if (i2 == 6) {
            qhl qhlVar2 = (qhl) view.getLayoutParams();
            qhlVar2.c0 = true;
            qhlVar2.p0.F = true;
        }
        cjlVar.k(6).b(cjlVar2.k(i2), qhlVar.D, qhlVar.C, true);
        cjlVar.F = true;
        cjlVar.k(3).j();
        cjlVar.k(5).j();
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new djl();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.t = null;
        this.N0 = null;
        this.O0 = -1;
        this.P0 = new HashMap();
        this.Q0 = new SparseArray();
        this.R0 = new rhl(this, this);
        s(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new djl();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.t = null;
        this.N0 = null;
        this.O0 = -1;
        this.P0 = new HashMap();
        this.Q0 = new SparseArray();
        this.R0 = new rhl(this, this);
        s(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new djl();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.t = null;
        this.N0 = null;
        this.O0 = -1;
        this.P0 = new HashMap();
        this.Q0 = new SparseArray();
        this.R0 = new rhl(this, this);
        s(attributeSet, i, i2);
    }
}
