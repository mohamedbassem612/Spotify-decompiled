package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class szd1 extends o5 {
    public final AbstractList e;

    public szd1(rdp1 rdp1Var, Matrix matrix) {
        super(rdp1Var.a, rdp1Var.b, rdp1Var.c, rdp1Var.d, matrix);
        this.e = l6o1.I(rdp1Var.e, new ezb1(matrix, (byte) 27));
    }

    public szd1(String str, Rect rect, List list, String str2, AbstractList abstractList) {
        super(str, rect, list, str2, (Matrix) null);
        this.e = abstractList;
    }
}
