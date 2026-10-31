package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i06 extends o5 {
    public final ArrayList Q() {
        i3x i3xVar = (i3x) this.c;
        if (i3xVar instanceof s3x) {
            return ((s3x) i3xVar).b;
        }
        eg.m("Current node cannot accept children");
        return null;
    }

    public final void b(int i, int i2, int i3) {
        o5.y(i, i2, i3, Q());
    }

    public final void c(int i, int i2) {
        ArrayList arrayListQ = Q();
        if (i2 == 1) {
            arrayListQ.remove(i);
        } else {
            arrayListQ.subList(i, i2 + i).clear();
        }
    }

    public final void e(int i, Object obj) {
        i3x i3xVar = (i3x) obj;
        int i2 = ((s3x) this.c).a;
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((s3x) this.b).a).toString());
        }
        if (i3xVar instanceof s3x) {
            ((s3x) i3xVar).a = i2 - 1;
        }
        Q().add(i, i3xVar);
    }

    public final void g(int i, Object obj) {
    }
}
