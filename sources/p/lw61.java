package p;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lw61 {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public lw61(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        return f4i1.g(sb, this.c, '}');
    }

    public lw61() {
        this.a = new ArrayList();
    }
}
