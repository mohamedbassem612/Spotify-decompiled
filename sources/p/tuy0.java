package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class tuy0 {
    public static final rhc a;

    static {
        rhc rhcVar = new rhc(ryn1.m("xn--"));
        rhcVar.c = "xn--";
        a = rhcVar;
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        bhn0.x(i, "unexpected digit: ");
        return 0;
    }
}
