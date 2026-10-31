package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zce1 extends hab0 implements iu30 {
    public final /* synthetic */ y9e1 a;
    public final /* synthetic */ cde1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ List e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zce1(y9e1 y9e1Var, cde1 cde1Var, long j, float f, List list, int i) {
        super(1);
        this.a = y9e1Var;
        this.b = cde1Var;
        this.c = j;
        this.d = f;
        this.e = list;
        this.f = i;
    }

    public final Object invoke(Object obj) {
        int length;
        int iP;
        int iP2;
        lsl lslVar = (lsl) obj;
        cde1 cde1Var = this.b;
        err0 err0Var = cde1Var.b;
        err0 err0Var2 = cde1Var.a;
        y9e1 y9e1Var = this.a;
        if (y9e1Var != null) {
            int length2 = y9e1Var.a.a.b.length();
            for (r8e1 r8e1Var : this.e) {
                int i = r8e1Var.a;
                int i2 = this.f;
                int iP3 = yoi1.p(i - i2, 0, length2);
                int iP4 = yoi1.p(r8e1Var.b - i2, 0, length2);
                if (iP3 < iP4) {
                    DrawScope.w0(lslVar, y9e1Var.k(iP3, iP4), r8e1Var.c.a, (DrawStyle) null, 60);
                }
            }
        }
        if (cde1Var.b() && y9e1Var != null && (iP = yoi1.p(err0Var2.s(), 0, (length = y9e1Var.a.a.b.length()))) < (iP2 = yoi1.p(err0Var.s(), 0, length))) {
            DrawScope.w0(lslVar, y9e1Var.k(iP, iP2), this.c, (DrawStyle) null, 60);
        }
        lslVar.s1();
        if (cde1Var.b() && y9e1Var != null) {
            int length3 = y9e1Var.a.a.b.length() - 1;
            n511 n511VarB = y9e1Var.b(yoi1.p(err0Var2.s(), 0, length3));
            n511 n511VarB2 = y9e1Var.b(yoi1.p(err0Var.s() - 1, 0, length3));
            float f = n511VarB.a;
            float f2 = n511VarB.b;
            float f3 = this.d;
            DrawScope.b0(lslVar, this.c, f3, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2 - f3)) & 4294967295L), 0.0f, (DrawStyle) null, 120);
            float f4 = n511VarB2.c;
            float f5 = n511VarB2.d;
            float f6 = this.d;
            DrawScope.b0(lslVar, this.c, f6, (((long) Float.floatToRawIntBits(f5 + f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), 0.0f, (DrawStyle) null, 120);
        }
        return rih1.a;
    }
}
