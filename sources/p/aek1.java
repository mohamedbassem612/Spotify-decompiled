package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aek1 {
    public final int a;
    public final int b;
    public Integer c;
    public int d;

    public aek1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(int i) {
        this.d = Math.max(0, i - (this.b / 2));
    }

    public final boolean b(int i) {
        int iIntValue;
        Integer num = this.c;
        if (num == null) {
            return true;
        }
        if ((num != null ? num.intValue() : 0) > 0) {
            int i2 = this.d;
            int i3 = this.a;
            if (i < (i2 == 0 ? i2 : i2 + i3)) {
                return true;
            }
            int i4 = i2 + this.b;
            Integer num2 = this.c;
            if (i4 >= (num2 != null ? num2.intValue() : 0)) {
                Integer num3 = this.c;
                iIntValue = num3 != null ? num3.intValue() : 0;
            } else {
                iIntValue = i4 - i3;
            }
            if (i > iIntValue) {
                return true;
            }
        }
        return false;
    }
}
