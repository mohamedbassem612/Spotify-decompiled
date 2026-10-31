package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pzd1 extends o5 {
    public final float e;

    public pzd1(bep1 bep1Var, Matrix matrix) {
        super(bep1Var.a, bep1Var.b, bep1Var.c, bep1Var.d, matrix);
        this.e = bep1Var.e;
        List list = bep1Var.g;
        l6o1.I(list == null ? new ArrayList() : list, new h0n1(matrix));
    }

    public pzd1(String str, Rect rect, List list, String str2, float f, vtn1 vtn1Var) {
        super(str, rect, list, str2, (Matrix) null);
        this.e = f;
    }
}
