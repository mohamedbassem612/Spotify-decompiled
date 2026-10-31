package p;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y0e1 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public y0e1(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0e1)) {
            return false;
        }
        y0e1 y0e1Var = (y0e1) obj;
        return u890.j(this.a, y0e1Var.a) && nbe1.c(this.b, y0e1Var.b) && u890.j(this.c, y0e1Var.c) && this.d.equals(y0e1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = nbe1.c;
        return this.d.hashCode() + ((this.c.hashCode() + cy30.f(iHashCode, this.b, 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + nbe1.i(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
