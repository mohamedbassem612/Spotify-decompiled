package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uw61 extends ax61 {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Matrix c;

    public uw61(ArrayList arrayList, Matrix matrix) {
        this.b = arrayList;
        this.c = matrix;
    }

    @Override // p.ax61
    public final void a(Matrix matrix, dw61 dw61Var, int i, Canvas canvas) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ax61) it.next()).a(this.c, dw61Var, i, canvas);
        }
    }
}
