package p;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a1o1 extends pwq implements on30 {
    public final int d;

    public a1o1(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        String str;
        if (b() == 1) {
            str = "changed";
        } else {
            str = b() == 2 ? "deleted" : "unknown";
        }
        String string = new z2o1(this.a, this.b, this.d).toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        bb00.j(sb, "DataEventRef{ type=", str, ", dataitem=", string);
        sb.append(" }");
        return sb.toString();
    }
}
