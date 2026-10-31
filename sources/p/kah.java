package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kah {
    public static final float[] a;
    public static final float[] b;
    public static final zeg1 c;
    public static final zeg1 d;
    public static final je31 e;
    public static final je31 f;
    public static final je31 g;
    public static final je31 h;
    public static final je31 i;
    public static final je31 j;
    public static final je31 k;
    public static final je31 l;
    public static final je31 m;
    public static final je31 n;
    public static final je31 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final je31 f63p;
    public static final je31 q;
    public static final je31 r;
    public static final xmm1 s;
    public static final q9b0 t;
    public static final je31 u;
    public static final je31 v;
    public static final je31 w;
    public static final xzp0 x;
    public static final hah[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        zeg1 zeg1Var = new zeg1(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        zeg1 zeg1Var2 = new zeg1(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        zeg1 zeg1Var3 = new zeg1(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = zeg1Var3;
        zeg1 zeg1Var4 = new zeg1(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = zeg1Var4;
        fol1 fol1Var = dm5.e;
        je31 je31Var = new je31("sRGB IEC61966-2.1", fArr, fol1Var, zeg1Var, 0);
        e = je31Var;
        je31 je31Var2 = new je31("sRGB IEC61966-2.1 (Linear)", fArr, fol1Var, 1.0d, 0.0f, 1.0f, 1);
        f = je31Var2;
        je31 je31Var3 = new je31("scRGB-nl IEC 61966-2-2:2003", fArr, fol1Var, null, new jah((byte) 0), new jah((byte) 1), -0.799f, 2.399f, zeg1Var, 2);
        g = je31Var3;
        je31 je31Var4 = new je31("scRGB IEC 61966-2-2:2003", fArr, fol1Var, 1.0d, -0.5f, 7.499f, 3);
        h = je31Var4;
        je31 je31Var5 = new je31("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, fol1Var, new zeg1(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = je31Var5;
        je31 je31Var6 = new je31("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, fol1Var, new zeg1(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = je31Var6;
        je31 je31Var7 = new je31("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new fol1(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = je31Var7;
        je31 je31Var8 = new je31("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, fol1Var, zeg1Var, 7);
        l = je31Var8;
        je31 je31Var9 = new je31("NTSC (1953)", fArr2, dm5.b, new zeg1(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = je31Var9;
        je31 je31Var10 = new je31("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, fol1Var, new zeg1(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = je31Var10;
        je31 je31Var11 = new je31("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, fol1Var, 2.2d, 0.0f, 1.0f, 10);
        o = je31Var11;
        je31 je31Var12 = new je31("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, dm5.c, new zeg1(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f63p = je31Var12;
        fol1 fol1Var2 = dm5.d;
        je31 je31Var13 = new je31("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, fol1Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = je31Var13;
        je31 je31Var14 = new je31("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, fol1Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = je31Var14;
        hah xmm1Var = new xmm1();
        s = xmm1Var;
        q9b0 q9b0Var = new q9b0(12884901890L, 15, "Generic L*a*b*");
        t = q9b0Var;
        je31 je31Var15 = new je31("None", fArr, fol1Var, zeg1Var2, 16);
        u = je31Var15;
        je31 je31Var16 = new je31("Hybrid Log Gamma encoding", fArr3, fol1Var, null, new jah((byte) 2), new jah((byte) 3), 0.0f, 1.0f, zeg1Var3, 17);
        v = je31Var16;
        je31 je31Var17 = new je31("Perceptual Quantizer encoding", fArr3, fol1Var, null, new jah((byte) 4), new jah((byte) 5), 0.0f, 1.0f, zeg1Var4, 18);
        w = je31Var17;
        xzp0 xzp0Var = new xzp0(12884901890L, 19, "Oklab");
        x = xzp0Var;
        y = new hah[]{je31Var, je31Var2, je31Var3, je31Var4, je31Var5, je31Var6, je31Var7, je31Var8, je31Var9, je31Var10, je31Var11, je31Var12, je31Var13, je31Var14, xmm1Var, q9b0Var, je31Var15, je31Var16, je31Var17, xzp0Var};
    }

    public static double a(zeg1 zeg1Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = zeg1Var.b;
        double d6 = zeg1Var.c;
        double d7 = zeg1Var.d;
        double d8 = zeg1Var.e;
        double d9 = zeg1Var.f;
        double d10 = d5 * d4;
        return (zeg1Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(zeg1 zeg1Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / zeg1Var.b;
        double d5 = 1.0d / zeg1Var.c;
        double d6 = 1.0d / zeg1Var.d;
        double d7 = zeg1Var.e;
        double d8 = zeg1Var.f;
        double d9 = (d2 * d3) / (zeg1Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(zeg1 zeg1Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = zeg1Var.b;
        double d6 = zeg1Var.d;
        double dPow = (Math.pow(d4, d6) * zeg1Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * zeg1Var.f) + zeg1Var.e), zeg1Var.g) * d3;
    }

    public static double d(zeg1 zeg1Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -zeg1Var.b;
        double d6 = zeg1Var.e;
        double d7 = 1.0d / zeg1Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-zeg1Var.f)) + zeg1Var.c), 1.0d / zeg1Var.d) * d3;
    }
}
