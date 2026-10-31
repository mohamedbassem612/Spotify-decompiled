package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iou {
    public final String a;
    public final String b;
    public final ArrayList c;

    public iou(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iou)) {
            return false;
        }
        iou iouVar = (iou) obj;
        return this.a.equals(iouVar.a) && this.b.equals(iouVar.b) && this.c.equals(iouVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
