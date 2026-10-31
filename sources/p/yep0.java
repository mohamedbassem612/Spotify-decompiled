package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yep0 extends hab0 implements iu30 {
    public final /* synthetic */ iu30 N0;
    public final /* synthetic */ yae1 O0;
    public final /* synthetic */ lee1 P0;
    public final /* synthetic */ long X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ Set Z;
    public final /* synthetic */ o95 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ tr80 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yep0(o95 o95Var, int i, ven0 ven0Var, tr80 tr80Var, int i2, int i3, float f, float f2, int i4, long j, long j2, float f3, Set set, iu30 iu30Var, yae1 yae1Var, lee1 lee1Var) {
        super(1);
        this.a = o95Var;
        this.b = i;
        this.c = ven0Var;
        this.d = tr80Var;
        this.e = i2;
        this.f = i3;
        this.g = f;
        this.h = f2;
        this.i = i4;
        this.t = j;
        this.X = j2;
        this.Y = f3;
        this.Z = set;
        this.N0 = iu30Var;
        this.O0 = yae1Var;
        this.P0 = lee1Var;
    }

    public final Object invoke(Object obj) {
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        int i4;
        char c;
        float f4;
        int i5;
        int i6;
        DrawScope drawScope = (DrawScope) obj;
        int i7 = ((rr80) this.d).a;
        char c2 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 12.0f;
        o95 o95Var = this.a;
        float fFloatValue = ((Number) o95Var.e()).floatValue();
        int i8 = this.b;
        float f5 = fFloatValue * i8;
        boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
        int i9 = this.e;
        int iU = zBooleanValue ? (jch0.U(((Number) o95Var.e()).floatValue()) * i9) + i7 : this.f;
        float f6 = this.g;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float f7 = this.h;
        float f8 = (((fIntBitsToFloat3 - f7) - f6) - (f6 * 2.0f)) / 2.0f;
        int i10 = this.i * i8;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                float fE = l1d.e(i11, f5, fIntBitsToFloat2, fIntBitsToFloat);
                if (fE >= (-fIntBitsToFloat2)) {
                    c = c2;
                    f4 = fIntBitsToFloat;
                    if (fE > Float.intBitsToFloat((int) (drawScope.j() >> c)) + fIntBitsToFloat2) {
                        i = iU;
                        f = f5;
                        i2 = i8;
                        f2 = f6;
                        i3 = i9;
                        i6 = i11;
                        f3 = f7;
                        i4 = i7;
                        i5 = i10;
                    } else {
                        boolean z = i11 % i8 == 0;
                        int iX = cy30.x(i11, i8, i9, i7);
                        boolean z2 = z && iX == iU;
                        float f9 = f7;
                        long j = this.X;
                        long j2 = this.t;
                        float f10 = f8 + f9;
                        f3 = f9;
                        f2 = f6;
                        f = f5;
                        i2 = i8;
                        i3 = i9;
                        boolean z3 = z;
                        drawScope = drawScope;
                        i6 = i11;
                        i4 = i7;
                        i5 = i10;
                        i = iU;
                        DrawScope.p0(drawScope, z2 ? j2 : j, (((long) Float.floatToRawIntBits(fE)) << c) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(fE)) << c) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), this.Y, 1, (uw4) null, 480);
                        if (z3 && this.Z.contains(Integer.valueOf(iX))) {
                            String str = (String) this.N0.invoke(Integer.valueOf(iX));
                            if (str.length() > 0) {
                                y9e1 y9e1VarA = yae1.a(this.O0, str, this.P0, 0, false, 0, 0L, (flb0) null, (xat) null, 1020);
                                w5p1.i(drawScope, y9e1VarA, z2 ? j2 : j, (((long) Float.floatToRawIntBits(fE - (((int) (y9e1VarA.c >> c)) / 2))) << c) | (((long) Float.floatToRawIntBits(f10 + f2)) & 4294967295L), 0.0f, 248);
                            }
                        }
                    }
                } else {
                    i = iU;
                    f = f5;
                    i2 = i8;
                    f2 = f6;
                    i3 = i9;
                    f3 = f7;
                    i4 = i7;
                    c = c2;
                    f4 = fIntBitsToFloat;
                    i5 = i10;
                    i6 = i11;
                }
                if (i6 == i5) {
                    break;
                }
                i11 = i6 + 1;
                c2 = c;
                i10 = i5;
                f5 = f;
                fIntBitsToFloat = f4;
                iU = i;
                i7 = i4;
                i9 = i3;
                f7 = f3;
                f6 = f2;
                i8 = i2;
            }
        }
        return rih1.a;
    }
}
