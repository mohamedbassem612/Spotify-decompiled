package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p.cjl;
import p.fil;
import p.fjl;
import p.inz0;
import p.kjk1;
import p.l660;
import p.ljk1;
import p.nr20;
import p.ohl;
import p.qhl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class Flow extends kjk1 {
    public nr20 t;

    public Flow(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.t = new nr20();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, inz0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.t.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    nr20 nr20Var = this.t;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ((ljk1) nr20Var).w0 = dimensionPixelSize;
                    ((ljk1) nr20Var).x0 = dimensionPixelSize;
                    ((ljk1) nr20Var).y0 = dimensionPixelSize;
                    ((ljk1) nr20Var).z0 = dimensionPixelSize;
                } else if (index == 18) {
                    nr20 nr20Var2 = this.t;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ((ljk1) nr20Var2).y0 = dimensionPixelSize2;
                    ((ljk1) nr20Var2).A0 = dimensionPixelSize2;
                    ((ljk1) nr20Var2).B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    ((ljk1) this.t).z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    ((ljk1) this.t).A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    ((ljk1) this.t).w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    ((ljk1) this.t).B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    ((ljk1) this.t).x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.t.X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.t.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.t.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.t.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.t.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.t.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.t.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.t.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.t.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.t.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.t.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.t.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.t.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.t.V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.t.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.t.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.t.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.t.Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ((ohl) this).d = this.t;
        m();
    }

    public final void j(fil filVar, l660 l660Var, fjl fjlVar, SparseArray sparseArray) {
        super/*p.ohl*/.j(filVar, l660Var, fjlVar, sparseArray);
        if (l660Var instanceof nr20) {
            nr20 nr20Var = (nr20) l660Var;
            int i = ((qhl) fjlVar).V;
            if (i != -1) {
                nr20Var.Z0 = i;
            }
        }
    }

    public final void k(cjl cjlVar, boolean z) {
        nr20 nr20Var = this.t;
        int i = ((ljk1) nr20Var).y0;
        if (i > 0 || ((ljk1) nr20Var).z0 > 0) {
            if (z) {
                ((ljk1) nr20Var).A0 = ((ljk1) nr20Var).z0;
                ((ljk1) nr20Var).B0 = i;
            } else {
                ((ljk1) nr20Var).A0 = i;
                ((ljk1) nr20Var).B0 = ((ljk1) nr20Var).z0;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        n(this.t, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFirstHorizontalBias(float f) {
        this.t.P0 = f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFirstHorizontalStyle(int i) {
        this.t.J0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFirstVerticalBias(float f) {
        this.t.Q0 = f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFirstVerticalStyle(int i) {
        this.t.K0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalAlign(int i) {
        this.t.V0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalBias(float f) {
        this.t.N0 = f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalGap(int i) {
        this.t.T0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalStyle(int i) {
        this.t.H0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLastHorizontalBias(float f) {
        this.t.R0 = f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLastHorizontalStyle(int i) {
        this.t.L0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLastVerticalBias(float f) {
        this.t.S0 = f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLastVerticalStyle(int i) {
        this.t.M0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxElementsWrap(int i) {
        this.t.Y0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOrientation(int i) {
        this.t.Z0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPadding(int i) {
        nr20 nr20Var = this.t;
        ((ljk1) nr20Var).w0 = i;
        ((ljk1) nr20Var).x0 = i;
        ((ljk1) nr20Var).y0 = i;
        ((ljk1) nr20Var).z0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingBottom(int i) {
        ((ljk1) this.t).x0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingLeft(int i) {
        ((ljk1) this.t).A0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingRight(int i) {
        ((ljk1) this.t).B0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingTop(int i) {
        ((ljk1) this.t).w0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVerticalAlign(int i) {
        this.t.W0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVerticalBias(float f) {
        this.t.O0 = f;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVerticalGap(int i) {
        this.t.U0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVerticalStyle(int i) {
        this.t.I0 = i;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWrapMode(int i) {
        this.t.X0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
