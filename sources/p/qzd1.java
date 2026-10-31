package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qzd1 extends o5 {
    public final AbstractList e;

    public qzd1(dep1 dep1Var, Matrix matrix) {
        super(dep1Var.a, dep1Var.b, dep1Var.c, dep1Var.d, matrix);
        this.e = l6o1.I(dep1Var.e, new dmj1(matrix, (byte) 13));
    }

    public qzd1(String str, Rect rect, List list, String str2, AbstractList abstractList) {
        super(str, rect, list, str2, (Matrix) null);
        this.e = abstractList;
    }
}
