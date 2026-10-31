package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wg60 implements jfc1 {
    public final List a;
    public int[] b;
    public double c;
    public int d;
    public boolean e;

    public wg60(List list) {
        this.a = list;
        this.b = new int[list.size() + 1];
    }

    public final mpj0 h() {
        if (!this.e) {
            return null;
        }
        List listO0 = f46.O0(this.b);
        int i = this.d;
        double d = this.c;
        List list = this.a;
        kpj0 kpj0Var = new kpj0(new xg60(list, listO0, i, d));
        this.b = new int[list.size() + 1];
        this.c = 0.0d;
        this.d = 0;
        this.e = false;
        return kpj0Var;
    }

    public final mpj0 peek() {
        if (!this.e) {
            return null;
        }
        return new kpj0(new xg60(this.a, f46.O0(this.b), this.d, this.c));
    }

    public final void record(double d) {
        this.e = true;
        List list = this.a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = (i + size) / 2;
            if (d <= ((Number) list.get(i2)).doubleValue()) {
                size = i2;
            } else {
                i = i2 + 1;
            }
        }
        int[] iArr = this.b;
        iArr[i] = iArr[i] + 1;
        this.c += d;
        this.d++;
    }
}
