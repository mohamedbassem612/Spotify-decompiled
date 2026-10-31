package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ofv0 implements k8n {
    public final float a;
    public final float b;

    public ofv0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a(long j, wat watVar) {
        float fX0 = watVar.X0(this.b);
        float fE = Size.e(j) * this.a;
        return fE < fX0 ? fX0 : fE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofv0)) {
            return false;
        }
        ofv0 ofv0Var = (ofv0) obj;
        return Float.compare(this.a, ofv0Var.a) == 0 && p3v.c(this.b, ofv0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
