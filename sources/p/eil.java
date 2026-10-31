package p;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eil {
    public int[] a = new int[10];
    public int[] b = new int[10];
    public int c = 0;
    public int[] d = new int[10];
    public float[] e = new float[10];
    public int f = 0;
    public int[] g = new int[5];
    public String[] h = new String[5];
    public int i = 0;
    public int[] j = new int[4];
    public boolean[] k = new boolean[4];
    public int l = 0;

    public final void a(float f, int i) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public final void e(fil filVar) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.a[i];
            int i3 = this.b[i];
            if (i2 == 6) {
                filVar.e.D = i3;
            } else if (i2 == 7) {
                filVar.e.E = i3;
            } else if (i2 == 8) {
                filVar.e.K = i3;
            } else if (i2 == 27) {
                filVar.e.F = i3;
            } else if (i2 == 28) {
                filVar.e.H = i3;
            } else if (i2 == 41) {
                filVar.e.W = i3;
            } else if (i2 == 42) {
                filVar.e.X = i3;
            } else if (i2 == 61) {
                filVar.e.A = i3;
            } else if (i2 == 62) {
                filVar.e.B = i3;
            } else if (i2 == 72) {
                filVar.e.g0 = i3;
            } else if (i2 == 73) {
                filVar.e.h0 = i3;
            } else if (i2 == 88) {
                filVar.d.l = i3;
            } else if (i2 == 89) {
                filVar.d.m = i3;
            } else if (i2 == 2) {
                filVar.e.J = i3;
            } else if (i2 == 31) {
                filVar.e.L = i3;
            } else if (i2 == 34) {
                filVar.e.I = i3;
            } else if (i2 == 38) {
                filVar.a = i3;
            } else if (i2 == 64) {
                filVar.d.b = i3;
            } else if (i2 == 66) {
                filVar.d.f = i3;
            } else if (i2 == 76) {
                filVar.d.e = i3;
            } else if (i2 == 78) {
                filVar.c.c = i3;
            } else if (i2 == 97) {
                filVar.e.p0 = i3;
            } else if (i2 == 93) {
                filVar.e.M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        filVar.e.Q = i3;
                        break;
                    case 12:
                        filVar.e.R = i3;
                        break;
                    case 13:
                        filVar.e.N = i3;
                        break;
                    case 14:
                        filVar.e.P = i3;
                        break;
                    case 15:
                        filVar.e.S = i3;
                        break;
                    case 16:
                        filVar.e.O = i3;
                        break;
                    case 17:
                        filVar.e.e = i3;
                        break;
                    case 18:
                        filVar.e.f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                filVar.e.d = i3;
                                break;
                            case 22:
                                filVar.c.b = i3;
                                break;
                            case 23:
                                filVar.e.c = i3;
                                break;
                            case 24:
                                filVar.e.G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        filVar.e.Y = i3;
                                        break;
                                    case 55:
                                        filVar.e.Z = i3;
                                        break;
                                    case 56:
                                        filVar.e.a0 = i3;
                                        break;
                                    case 57:
                                        filVar.e.b0 = i3;
                                        break;
                                    case 58:
                                        filVar.e.c0 = i3;
                                        break;
                                    case 59:
                                        filVar.e.d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                filVar.d.c = i3;
                                                break;
                                            case 83:
                                                filVar.f.i = i3;
                                                break;
                                            case 84:
                                                filVar.d.j = i3;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                filVar.e.T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            int i5 = this.d[i4];
            float f = this.e[i4];
            if (i5 == 19) {
                filVar.e.g = f;
            } else if (i5 == 20) {
                filVar.e.x = f;
            } else if (i5 == 37) {
                filVar.e.y = f;
            } else if (i5 == 60) {
                filVar.f.b = f;
            } else if (i5 == 63) {
                filVar.e.C = f;
            } else if (i5 == 79) {
                filVar.d.g = f;
            } else if (i5 == 85) {
                filVar.d.i = f;
            } else if (i5 == 39) {
                filVar.e.V = f;
            } else if (i5 != 40) {
                switch (i5) {
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        filVar.c.d = f;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        jil jilVar = filVar.f;
                        jilVar.n = f;
                        jilVar.m = true;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        filVar.f.c = f;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        filVar.f.d = f;
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        filVar.f.e = f;
                        break;
                    case 48:
                        filVar.f.f = f;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        filVar.f.g = f;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        filVar.f.h = f;
                        break;
                    case 51:
                        filVar.f.j = f;
                        break;
                    case 52:
                        filVar.f.k = f;
                        break;
                    case 53:
                        filVar.f.l = f;
                        break;
                    default:
                        switch (i5) {
                            case 67:
                                filVar.d.h = f;
                                break;
                            case 68:
                                filVar.c.e = f;
                                break;
                            case 69:
                                filVar.e.e0 = f;
                                break;
                            case 70:
                                filVar.e.f0 = f;
                                break;
                        }
                        break;
                }
            } else {
                filVar.e.U = f;
            }
        }
        for (int i6 = 0; i6 < this.i; i6++) {
            int i7 = this.g[i6];
            String str = this.h[i6];
            if (i7 == 5) {
                filVar.e.z = str;
            } else if (i7 == 65) {
                filVar.d.d = str;
            } else if (i7 == 74) {
                gil gilVar = filVar.e;
                gilVar.k0 = str;
                gilVar.j0 = null;
            } else if (i7 == 77) {
                filVar.e.l0 = str;
            } else if (i7 == 90) {
                filVar.d.k = str;
            }
        }
        for (int i8 = 0; i8 < this.l; i8++) {
            int i9 = this.j[i8];
            boolean z = this.k[i8];
            if (i9 == 44) {
                filVar.f.m = z;
            } else if (i9 == 75) {
                filVar.e.o0 = z;
            } else if (i9 == 80) {
                filVar.e.m0 = z;
            } else if (i9 == 81) {
                filVar.e.n0 = z;
            }
        }
    }
}
