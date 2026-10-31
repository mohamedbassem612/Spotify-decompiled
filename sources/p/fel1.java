package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fel1 extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ vge1 f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fel1(int i, int i2, int i3, int i4, int i5, vge1 vge1Var, List list) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = vge1Var;
        this.g = list;
    }

    public static final float a(int i, int i2, float f) {
        if (i > 0) {
            return (float) Math.rint((i2 / i) * f);
        }
        return 0.0f;
    }

    public final Object invoke(Object obj) {
        tw4 tw4VarA;
        float[] fArr;
        eqc eqcVar = (eqc) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L));
        float f = 0.85f * fIntBitsToFloat2;
        int i = this.a;
        int i2 = this.e;
        float fA = a(i2, i, fIntBitsToFloat);
        int i3 = this.b;
        int i4 = this.c;
        float fA2 = a(i2, i3 + i4, fIntBitsToFloat);
        int i5 = this.d;
        int i6 = 0;
        float fA3 = a(i2, yoi1.p(i5, 0, i2), fIntBitsToFloat);
        float fA4 = a(i2, yoi1.p(i5 + i4, 0, i2), fIntBitsToFloat);
        yvg1 yvg1Var = null;
        vge1 vge1Var = this.f;
        if (vge1Var == null) {
            List list = this.g;
            int size = list.size();
            if (size <= 0 || i2 <= 0) {
                tw4VarA = null;
            } else {
                int i7 = iel1.d;
                float f2 = fIntBitsToFloat / size;
                tw4VarA = ww4.a();
                float fFloatValue = ((Number) o7h.q0(list)).floatValue() * f;
                if (fFloatValue < 0.5f) {
                    fFloatValue = 0.5f;
                }
                float f3 = f2 / 2.0f;
                tw4VarA.k(f3, fIntBitsToFloat2 - fFloatValue);
                for (Object obj2 : list) {
                    int i8 = i6 + 1;
                    if (i6 < 0) {
                        p7h.T();
                        throw null;
                    }
                    float f4 = (i6 * f2) + f3;
                    float fFloatValue2 = ((Number) obj2).floatValue() * f;
                    if (fFloatValue2 < 0.5f) {
                        fFloatValue2 = 0.5f;
                    }
                    tw4VarA.j(f4, fIntBitsToFloat2 - fFloatValue2);
                    i6 = i8;
                }
                tw4VarA.j(((size - 1) * f2) + f3, fIntBitsToFloat2);
                tw4VarA.j(f3, fIntBitsToFloat2);
                tw4VarA.g();
            }
            return eqcVar.a(new sc60(tw4VarA, fIntBitsToFloat2, fA3, fA4, fA, fA2, (byte) 2));
        }
        List list2 = vge1Var.c;
        List list3 = vge1Var.b;
        List list4 = vge1Var.a;
        int size2 = list4.size();
        if (size2 <= 0 || i2 <= 0) {
            fA4 = fA4;
        } else {
            int i9 = iel1.d;
            float f5 = fIntBitsToFloat / size2;
            float[] fArr2 = new float[size2];
            float[] fArr3 = new float[size2];
            float[] fArr4 = new float[size2];
            Float fValueOf = Float.valueOf(0.0f);
            float f6 = 0.0f;
            while (i6 < size2) {
                float f7 = f5;
                float fFloatValue3 = ((Number) ((i6 < 0 || i6 >= list2.size()) ? fValueOf : list2.get(i6))).floatValue() + ((Number) ((i6 < 0 || i6 >= list3.size()) ? fValueOf : list3.get(i6))).floatValue() + ((Number) ((i6 < 0 || i6 >= list4.size()) ? fValueOf : list4.get(i6))).floatValue();
                if (fFloatValue3 > f6) {
                    f6 = fFloatValue3;
                }
                i6++;
                f5 = f7;
            }
            float f8 = f5;
            float f9 = f6 > 0.0f ? f / f6 : 0.0f;
            int i10 = 0;
            while (i10 < size2) {
                fArr2[i10] = ((Number) ((i10 < 0 || i10 >= list4.size()) ? fValueOf : list4.get(i10))).floatValue() * f9;
                fArr3[i10] = ((Number) ((i10 < 0 || i10 >= list3.size()) ? fValueOf : list3.get(i10))).floatValue() * f9;
                fArr4[i10] = ((Number) ((i10 < 0 || i10 >= list2.size()) ? fValueOf : list2.get(i10))).floatValue() * f9;
                i10++;
            }
            tw4 tw4VarA2 = ww4.a();
            float f10 = f8 / 2.0f;
            float f11 = fArr2[0];
            if (f11 < 0.5f) {
                f11 = 0.5f;
            }
            tw4VarA2.k(f10, fIntBitsToFloat2 - f11);
            for (int i11 = 0; i11 < size2; i11++) {
                float f12 = (i11 * f8) + f10;
                float f13 = fArr2[i11];
                if (f13 < 0.5f) {
                    f13 = 0.5f;
                }
                tw4VarA2.j(f12, fIntBitsToFloat2 - f13);
            }
            tw4VarA2.j(((size2 - 1) * f8) + f10, fIntBitsToFloat2);
            tw4VarA2.j(f10, fIntBitsToFloat2);
            tw4VarA2.g();
            tw4 tw4VarA3 = ww4.a();
            float f14 = fArr2[0];
            if (f14 < 0.5f) {
                f14 = 0.5f;
            }
            float f15 = fIntBitsToFloat2 - f14;
            float f16 = fArr3[0];
            if (f16 < 0.5f) {
                f16 = 0.5f;
            }
            tw4VarA3.k(f10, f15 - f16);
            for (int i12 = 0; i12 < size2; i12++) {
                float f17 = fArr2[i12];
                if (f17 < 0.5f) {
                    f17 = 0.5f;
                }
                float f18 = (i12 * f8) + f10;
                float f19 = fIntBitsToFloat2 - f17;
                float f20 = fArr3[i12];
                if (f20 < 0.5f) {
                    f20 = 0.5f;
                }
                tw4VarA3.j(f18, f19 - f20);
            }
            rr80 rr80VarM = yoi1.M(yoi1.Q(0, size2));
            int i13 = rr80VarM.a;
            int i14 = rr80VarM.b;
            int i15 = rr80VarM.c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    float f21 = (i13 * f8) + f10;
                    float f22 = fArr2[i13];
                    if (f22 < 0.5f) {
                        f22 = 0.5f;
                    }
                    fArr = fArr2;
                    tw4VarA3.j(f21, fIntBitsToFloat2 - f22);
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                    fArr2 = fArr;
                }
            } else {
                fArr = fArr2;
            }
            tw4VarA3.g();
            tw4 tw4VarA4 = ww4.a();
            float f23 = fArr[0];
            if (f23 < 0.5f) {
                f23 = 0.5f;
            }
            float f24 = fArr3[0];
            if (f24 < 0.5f) {
                f24 = 0.5f;
            }
            float f25 = fIntBitsToFloat2 - (f23 + f24);
            float f26 = fArr4[0];
            if (f26 < 0.5f) {
                f26 = 0.5f;
            }
            tw4VarA4.k(f10, f25 - f26);
            for (int i16 = 0; i16 < size2; i16++) {
                float f27 = fArr[i16];
                if (f27 < 0.5f) {
                    f27 = 0.5f;
                }
                float f28 = fArr3[i16];
                if (f28 < 0.5f) {
                    f28 = 0.5f;
                }
                float f29 = f27 + f28;
                float f30 = (i16 * f8) + f10;
                float f31 = fIntBitsToFloat2 - f29;
                float f32 = fArr4[i16];
                if (f32 < 0.5f) {
                    f32 = 0.5f;
                }
                tw4VarA4.j(f30, f31 - f32);
            }
            rr80 rr80VarM2 = yoi1.M(yoi1.Q(0, size2));
            int i17 = rr80VarM2.a;
            int i18 = rr80VarM2.b;
            int i19 = rr80VarM2.c;
            if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                while (true) {
                    float f33 = fArr[i17];
                    if (f33 < 0.5f) {
                        f33 = 0.5f;
                    }
                    float f34 = fArr3[i17];
                    if (f34 < 0.5f) {
                        f34 = 0.5f;
                    }
                    tw4VarA4.j((i17 * f8) + f10, fIntBitsToFloat2 - (f33 + f34));
                    if (i17 == i18) {
                        break;
                    }
                    i17 += i19;
                }
            }
            tw4VarA4.g();
            yvg1Var = new yvg1(tw4VarA2, tw4VarA3, tw4VarA4);
        }
        return eqcVar.a(new sc60(yvg1Var, fIntBitsToFloat2, fA3, fA4, fA, fA2, (byte) 1));
    }
}
