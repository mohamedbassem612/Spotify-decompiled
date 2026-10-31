package p;

import android.text.Layout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yll1 {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public boolean f = true;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = os00.INVALID_ID;
    public float j = 1.0f;
    public int k = os00.INVALID_ID;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    public final eeo a() {
        Layout.Alignment alignment;
        float f = this.h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        eeo eeoVar = new eeo();
        int i4 = this.d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            td6.p(i4, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        eeoVar.c = alignment;
        float f3 = this.e;
        boolean z = this.f;
        if (f3 != -3.4028235E38f && !z && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (!z) {
            f2 = 1.0f;
        }
        eeoVar.e = f2;
        eeoVar.f = z ? 1 : 0;
        eeoVar.g = this.g;
        eeoVar.h = f;
        eeoVar.i = i2;
        float f4 = this.j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            eg.m(String.valueOf(i2));
            return null;
        }
        eeoVar.l = Math.min(f4, f);
        eeoVar.f44p = this.k;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            eeoVar.c(charSequence);
        }
        return eeoVar;
    }
}
