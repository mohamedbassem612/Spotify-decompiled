package p;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yzd1 {
    public final ArrayList a;

    public yzd1(gep1 gep1Var, Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        String str = gep1Var.a;
        arrayList.addAll(l6o1.I(gep1Var.b, new utw0(matrix)));
    }

    public yzd1(vtn1 vtn1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(vtn1Var);
    }
}
