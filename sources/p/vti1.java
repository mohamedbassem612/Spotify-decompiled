package p;

import android.graphics.Path;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vti1 extends uti1 {
    public u9s0[] a;
    public String b;
    public int c;

    public vti1(vti1 vti1Var) {
        this.a = null;
        this.c = 0;
        this.b = vti1Var.b;
        u9s0[] u9s0VarArr = vti1Var.a;
        u9s0[] u9s0VarArr2 = new u9s0[u9s0VarArr.length];
        for (int i = 0; i < u9s0VarArr.length; i++) {
            u9s0VarArr2[i] = new u9s0(u9s0VarArr[i]);
        }
        this.a = u9s0VarArr2;
    }

    public boolean c() {
        return this instanceof rti1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Path path2 = path;
        path2.reset();
        u9s0[] u9s0VarArr = this.a;
        if (u9s0VarArr != null) {
            float[] fArr = new float[6];
            int length = u9s0VarArr.length;
            int i2 = 0;
            int i3 = 0;
            char c = 'm';
            while (i3 < length) {
                u9s0 u9s0Var = u9s0VarArr[i3];
                char c2 = u9s0Var.a;
                float[] fArr2 = u9s0Var.b;
                float f11 = fArr[i2];
                float f12 = fArr[1];
                float f13 = fArr[2];
                float f14 = fArr[3];
                float f15 = fArr[4];
                int i4 = i2;
                float f16 = fArr[5];
                switch (c2) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case ContentType.LIVE /* 113 */:
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                        path2.close();
                        path2.moveTo(f15, f16);
                        f11 = f15;
                        f13 = f11;
                        f12 = f16;
                        f14 = f12;
                    default:
                        i = 2;
                        break;
                }
                float f17 = f15;
                float f18 = f16;
                float f19 = f11;
                float f20 = f12;
                int i5 = i4;
                while (i5 < fArr2.length) {
                    if (c2 == 'A') {
                        fArr2 = fArr2;
                        i5 = i5;
                        u9s0VarArr = u9s0VarArr;
                        int i6 = i5 + 5;
                        int i7 = i5 + 6;
                        u9s0.a(path, f19, f20, fArr2[i6], fArr2[i7], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                        f13 = fArr2[i6];
                        f = fArr2[i7];
                        f14 = f;
                        f2 = f13;
                    } else if (c2 == 'C') {
                        fArr2 = fArr2;
                        i5 = i5;
                        u9s0VarArr = u9s0VarArr;
                        int i8 = i5 + 2;
                        int i9 = i5 + 3;
                        int i10 = i5 + 4;
                        int i11 = i5 + 5;
                        path2.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                        float f21 = fArr2[i10];
                        float f22 = fArr2[i11];
                        f13 = fArr2[i8];
                        f14 = fArr2[i9];
                        f = f22;
                        f2 = f21;
                    } else if (c2 == 'H') {
                        fArr2 = fArr2;
                        i5 = i5;
                        u9s0VarArr = u9s0VarArr;
                        f = f20;
                        path2.lineTo(fArr2[i5], f);
                        f2 = fArr2[i5];
                    } else if (c2 == 'Q') {
                        fArr2 = fArr2;
                        i5 = i5;
                        u9s0VarArr = u9s0VarArr;
                        int i12 = i5 + 1;
                        int i13 = i5 + 2;
                        int i14 = i5 + 3;
                        path2.quadTo(fArr2[i5], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f23 = fArr2[i5];
                        float f24 = fArr2[i12];
                        float f25 = fArr2[i13];
                        float f26 = fArr2[i14];
                        f13 = f23;
                        f14 = f24;
                        f2 = f25;
                        f = f26;
                    } else if (c2 == 'V') {
                        fArr2 = fArr2;
                        i5 = i5;
                        u9s0VarArr = u9s0VarArr;
                        f2 = f19;
                        path2.lineTo(f2, fArr2[i5]);
                        f = fArr2[i5];
                    } else if (c2 != 'a') {
                        if (c2 == 'c') {
                            fArr2 = fArr2;
                            i5 = i5;
                            int i15 = i5 + 2;
                            int i16 = i5 + 3;
                            int i17 = i5 + 4;
                            int i18 = i5 + 5;
                            path2.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                            float f27 = fArr2[i15] + f19;
                            float f28 = fArr2[i16] + f20;
                            f19 += fArr2[i17];
                            f20 += fArr2[i18];
                            f13 = f27;
                            f14 = f28;
                        } else if (c2 != 'h') {
                            if (c2 != 'q') {
                                if (c2 != 'v') {
                                    if (c2 == 'L') {
                                        fArr2 = fArr2;
                                        i5 = i5;
                                        int i19 = i5 + 1;
                                        path2.lineTo(fArr2[i5], fArr2[i19]);
                                        f2 = fArr2[i5];
                                        f = fArr2[i19];
                                    } else if (c2 == 'M') {
                                        fArr2 = fArr2;
                                        i5 = i5;
                                        f2 = fArr2[i5];
                                        f = fArr2[i5 + 1];
                                        if (i5 > 0) {
                                            path2.lineTo(f2, f);
                                        } else {
                                            path2.moveTo(f2, f);
                                            f17 = f2;
                                            f18 = f;
                                        }
                                    } else if (c2 == 'S') {
                                        fArr2 = fArr2;
                                        i5 = i5;
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        float f29 = f19;
                                        float f30 = f20;
                                        int i20 = i5 + 1;
                                        int i21 = i5 + 2;
                                        int i22 = i5 + 3;
                                        path2.cubicTo(f29, f30, fArr2[i5], fArr2[i20], fArr2[i21], fArr2[i22]);
                                        f13 = fArr2[i5];
                                        f14 = fArr2[i20];
                                        f2 = fArr2[i21];
                                        f = fArr2[i22];
                                    } else if (c2 == 'T') {
                                        fArr2 = fArr2;
                                        i5 = i5;
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i23 = i5 + 1;
                                        path2.quadTo(f19, f20, fArr2[i5], fArr2[i23]);
                                        f2 = fArr2[i5];
                                        f = fArr2[i23];
                                        u9s0VarArr = u9s0VarArr;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c2 == 'l') {
                                        fArr2 = fArr2;
                                        i5 = i5;
                                        int i24 = i5 + 1;
                                        path2.rLineTo(fArr2[i5], fArr2[i24]);
                                        f19 += fArr2[i5];
                                        f6 = fArr2[i24];
                                    } else if (c2 == 'm') {
                                        fArr2 = fArr2;
                                        i5 = i5;
                                        float f31 = fArr2[i5];
                                        f19 += f31;
                                        float f32 = fArr2[i5 + 1];
                                        f20 += f32;
                                        if (i5 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            u9s0VarArr = u9s0VarArr;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c2 == 's') {
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i25 = i5;
                                        int i26 = i25 + 1;
                                        int i27 = i25 + 2;
                                        int i28 = i25 + 3;
                                        fArr2 = fArr2;
                                        i5 = i25;
                                        path2.rCubicTo(f8, f7, fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                        f3 = fArr2[i5] + f19;
                                        f4 = fArr2[i26] + f20;
                                        f19 += fArr2[i27];
                                        f5 = fArr2[i28];
                                    } else if (c2 != 't') {
                                        f2 = f19;
                                        f = f20;
                                    } else {
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i29 = i5 + 1;
                                        path2.rQuadTo(f9, f10, fArr2[i5], fArr2[i29]);
                                        f14 = f10 + f20;
                                        f2 = f19 + fArr2[i5];
                                        f = f20 + fArr2[i29];
                                        f13 = f9 + f19;
                                    }
                                    u9s0VarArr = u9s0VarArr;
                                } else {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    path2.rLineTo(0.0f, fArr2[i5]);
                                    f6 = fArr2[i5];
                                }
                                f20 += f6;
                            } else {
                                fArr2 = fArr2;
                                i5 = i5;
                                int i30 = i5 + 1;
                                int i31 = i5 + 2;
                                int i32 = i5 + 3;
                                path2.rQuadTo(fArr2[i5], fArr2[i30], fArr2[i31], fArr2[i32]);
                                f3 = fArr2[i5] + f19;
                                f4 = fArr2[i30] + f20;
                                f19 += fArr2[i31];
                                f5 = fArr2[i32];
                            }
                            f20 += f5;
                            f13 = f3;
                            f14 = f4;
                        } else {
                            fArr2 = fArr2;
                            i5 = i5;
                            path2.rLineTo(fArr2[i5], 0.0f);
                            f19 += fArr2[i5];
                        }
                        u9s0VarArr = u9s0VarArr;
                        f2 = f19;
                        f = f20;
                    } else {
                        fArr2 = fArr2;
                        i5 = i5;
                        int i33 = i5 + 5;
                        int i34 = i5 + 6;
                        u9s0VarArr = u9s0VarArr;
                        float f33 = f19;
                        float f34 = f20;
                        u9s0.a(path, f33, f34, fArr2[i33] + f19, fArr2[i34] + f20, fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                        f2 = f33 + fArr2[i33];
                        f = f34 + fArr2[i34];
                        f13 = f2;
                        f14 = f;
                    }
                    i5 += i;
                    path2 = path;
                    u9s0Var = u9s0Var;
                    c2 = c2;
                    i3 = i3;
                    u9s0VarArr = u9s0VarArr;
                    f19 = f2;
                    f20 = f;
                    c = c2;
                    fArr2 = fArr2;
                }
                fArr[i4] = f19;
                fArr[1] = f20;
                fArr[2] = f13;
                fArr[3] = f14;
                fArr[4] = f17;
                fArr[5] = f18;
                c = u9s0Var.a;
                i3++;
                path2 = path;
                i2 = i4;
                u9s0VarArr = u9s0VarArr;
            }
        }
    }

    public u9s0[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(u9s0[] u9s0VarArr) {
        u9s0[] u9s0VarArr2 = this.a;
        if (u9s0VarArr2 != null && u9s0VarArr != null && u9s0VarArr2.length == u9s0VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= u9s0VarArr2.length) {
                    u9s0[] u9s0VarArr3 = this.a;
                    for (int i2 = 0; i2 < u9s0VarArr.length; i2++) {
                        u9s0VarArr3[i2].a = u9s0VarArr[i2].a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = u9s0VarArr[i2].b;
                            if (i3 < fArr.length) {
                                u9s0VarArr3[i2].b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                u9s0 u9s0Var = u9s0VarArr2[i];
                char c = u9s0Var.a;
                u9s0 u9s0Var2 = u9s0VarArr[i];
                if (c != u9s0Var2.a || u9s0Var.b.length != u9s0Var2.b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        u9s0[] u9s0VarArr4 = new u9s0[u9s0VarArr.length];
        for (int i4 = 0; i4 < u9s0VarArr.length; i4++) {
            u9s0VarArr4[i4] = new u9s0(u9s0VarArr[i4]);
        }
        this.a = u9s0VarArr4;
    }

    public vti1() {
        this.a = null;
        this.c = 0;
    }
}
