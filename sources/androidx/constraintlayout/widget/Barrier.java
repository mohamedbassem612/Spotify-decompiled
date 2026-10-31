package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p.c9a;
import p.cjl;
import p.djl;
import p.fil;
import p.fjl;
import p.gil;
import p.inz0;
import p.l660;
import p.ohl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class Barrier extends ohl {
    public int h;
    public c9a i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.i.x0;
    }

    public int getMargin() {
        return this.i.y0;
    }

    public int getType() {
        return this.h;
    }

    @Override // p.ohl
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.i = new c9a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, inz0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.i.x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.i.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.i;
        m();
    }

    @Override // p.ohl
    public final void j(fil filVar, l660 l660Var, fjl fjlVar, SparseArray sparseArray) {
        super.j(filVar, l660Var, fjlVar, sparseArray);
        gil gilVar = filVar.e;
        if (l660Var instanceof c9a) {
            c9a c9aVar = (c9a) l660Var;
            n(c9aVar, gilVar.g0, ((djl) l660Var.V).z0);
            c9aVar.x0 = gilVar.o0;
            c9aVar.y0 = gilVar.h0;
        }
    }

    @Override // p.ohl
    public final void k(cjl cjlVar, boolean z) {
        n(cjlVar, this.h, z);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public final void n(cjl cjlVar, int i, boolean z) {
        int i2 = this.h;
        if (z) {
            if (i2 == 5) {
                i = 1;
            } else if (i2 == 6) {
                i = 0;
            }
        } else if (i2 == 5) {
            i = 0;
        } else if (i2 == 6) {
            i = 1;
        }
        if (cjlVar instanceof c9a) {
            ((c9a) cjlVar).w0 = i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.x0 = z;
    }

    public void setDpMargin(int i) {
        this.i.y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.i.y0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
