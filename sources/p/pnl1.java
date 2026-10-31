package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pnl1 extends hab0 implements iu30 {
    public final /* synthetic */ yae1 N0;
    public final /* synthetic */ lee1 O0;
    public final /* synthetic */ long P0;
    public final /* synthetic */ long X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ iu30 Z;
    public final /* synthetic */ o95 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ tr80 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Set i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnl1(o95 o95Var, ven0 ven0Var, tr80 tr80Var, int i, int i2, float f, float f2, int i3, Set set, long j, long j2, float f3, iu30 iu30Var, yae1 yae1Var, lee1 lee1Var, long j3) {
        super(1);
        this.a = o95Var;
        this.b = ven0Var;
        this.c = tr80Var;
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = f2;
        this.h = i3;
        this.i = set;
        this.t = j;
        this.X = j2;
        this.Y = f3;
        this.Z = iu30Var;
        this.N0 = yae1Var;
        this.O0 = lee1Var;
        this.P0 = j3;
    }

    public final Object invoke(Object obj) {
        float f;
        int i;
        float f2;
        float f3;
        int i2;
        char c;
        float f4;
        int i3;
        int i4;
        int i5;
        DrawScope drawScope = (DrawScope) obj;
        int i6 = ((rr80) this.c).a;
        char c2 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 12.0f;
        float fFloatValue = ((Number) this.a.e()).floatValue();
        boolean zBooleanValue = ((Boolean) this.b.getValue()).booleanValue();
        int i7 = this.d;
        int iU = zBooleanValue ? (jch0.U(fFloatValue) * i7) + i6 : this.e;
        float f5 = this.f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float f6 = this.g;
        float f7 = (((fIntBitsToFloat3 - f6) - f5) - (f5 * 2.0f)) / 2.0f;
        int i8 = this.h;
        if (i8 >= 0) {
            int i9 = 0;
            while (true) {
                int i10 = (i9 * i7) + i6;
                float fE = l1d.e(i9, fFloatValue, fIntBitsToFloat2, fIntBitsToFloat);
                if (fE < (-fIntBitsToFloat2) || fE > Float.intBitsToFloat((int) (drawScope.j() >> c2)) + fIntBitsToFloat2) {
                    f = fFloatValue;
                    i = i7;
                    f2 = f5;
                    f3 = f6;
                    i2 = i6;
                    c = c2;
                    f4 = fIntBitsToFloat;
                    i3 = i8;
                    i4 = iU;
                    i5 = i9;
                } else {
                    boolean z = i10 == iU;
                    boolean zContains = this.i.contains(Integer.valueOf(i10));
                    long j = this.t;
                    c = c2;
                    f4 = fIntBitsToFloat;
                    DrawScope drawScope2 = drawScope;
                    f = fFloatValue;
                    float f8 = f7 + f6;
                    f3 = f6;
                    int i11 = i6;
                    i3 = i8;
                    i4 = iU;
                    i5 = i9;
                    i = i7;
                    f2 = f5;
                    drawScope = drawScope2;
                    i2 = i11;
                    DrawScope.p0(drawScope, z ? j : this.X, (((long) Float.floatToRawIntBits(fE)) << c) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(fE)) << c) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), this.Y, 1, (uw4) null, 480);
                    if (zContains) {
                        String str = (String) this.Z.invoke(Integer.valueOf(i10));
                        if (str.length() > 0) {
                            y9e1 y9e1VarA = yae1.a(this.N0, str, this.O0, 0, false, 0, 0L, (flb0) null, (xat) null, 1020);
                            w5p1.i(drawScope, y9e1VarA, z ? j : this.P0, (((long) Float.floatToRawIntBits(fE - (((int) (y9e1VarA.c >> c)) / 2))) << c) | (((long) Float.floatToRawIntBits(f8 + f2)) & 4294967295L), 0.0f, 248);
                        }
                    }
                }
                if (i5 == i3) {
                    break;
                }
                i9 = i5 + 1;
                i8 = i3;
                iU = i4;
                fIntBitsToFloat = f4;
                i6 = i2;
                fFloatValue = f;
                i7 = i;
                f5 = f2;
                f6 = f3;
                c2 = c;
            }
        }
        return rih1.a;
    }
}
