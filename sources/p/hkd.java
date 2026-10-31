package p;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hkd extends View implements mrc1 {
    public final ArrayList a;
    public List b;
    public float c;
    public bnd d;
    public float e;

    public hkd(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = bnd.g;
        this.e = 0.08f;
    }

    @Override // p.mrc1
    public final void a(List list, bnd bndVar, float f, float f2) {
        this.b = list;
        this.d = bndVar;
        this.c = f;
        this.e = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new iqc1(getContext()));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fW = mno1.w(this.c, 0, height, i);
        if (fW <= 0.0f) {
            return;
        }
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            feo feoVarA = (feo) list.get(i2);
            if (feoVarA.f47p != Integer.MIN_VALUE) {
                eeo eeoVarA = feoVarA.a();
                eeoVarA.h = -3.4028235E38f;
                eeoVarA.i = os00.INVALID_ID;
                eeoVarA.c = null;
                int i3 = feoVarA.f;
                float f = feoVarA.e;
                if (i3 == 0) {
                    eeoVarA.e = 1.0f - f;
                    eeoVarA.f = 0;
                } else {
                    eeoVarA.e = (-f) - 1.0f;
                    eeoVarA.f = 1;
                }
                int i4 = feoVarA.g;
                if (i4 == 0) {
                    eeoVarA.g = 2;
                } else if (i4 == 2) {
                    eeoVarA.g = 0;
                }
                feoVarA = eeoVarA.a();
            }
            ((iqc1) this.a.get(i2)).a(feoVarA, this.d, fW, mno1.w(feoVarA.o, feoVarA.n, height, i), this.e, canvas, paddingLeft, paddingTop, width, paddingBottom);
            i2++;
        }
    }
}
