package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class lqb implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lqb(n511 n511Var, htq0 htq0Var, Brush brush, float f, u8s0 u8s0Var) {
        this.c = n511Var;
        this.d = htq0Var;
        this.e = brush;
        this.b = f;
        this.f = u8s0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                n511 n511Var = (n511) obj5;
                htq0 htq0Var = (htq0) obj4;
                Brush brush = (Brush) obj3;
                float f = this.b;
                u8s0 u8s0Var = (u8s0) obj2;
                DrawScope drawScope = (DrawScope) obj;
                float f2 = -n511Var.a;
                float f3 = -n511Var.b;
                ((dg8) drawScope.a1().b).z(f2, f3);
                try {
                    DrawScope.j1(drawScope, htq0Var.c, brush, 0.0f, new phc1(f * 2.0f, 0.0f, 0, 0, null, 30), 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.j() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (drawScope.j() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                    long jG1 = drawScope.g1();
                    cab cabVarA1 = drawScope.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        ((dg8) cabVarA1.b).t(fIntBitsToFloat, fIntBitsToFloat2, jG1);
                        DrawScope.j1(drawScope, u8s0Var, brush, 0.0f, (DrawStyle) null, 28);
                        cabVarA1.p().i();
                        cabVarA1.D(jU);
                        ((dg8) drawScope.a1().b).z(-f2, -f3);
                        return rih1Var;
                    } catch (Throwable th) {
                        cabVarA1.p().i();
                        cabVarA1.D(jU);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((dg8) drawScope.a1().b).z(-f2, -f3);
                    throw th2;
                }
            default:
                long jLongValue = ((Long) obj).longValue();
                Object obj6 = ((p811) obj5).a;
                obj6.getClass();
                wwo1.A((de5) obj6, jLongValue, this.b, (id5) obj4, (ie5) obj3, (iu30) obj2);
                return rih1Var;
        }
    }

    public /* synthetic */ lqb(p811 p811Var, float f, id5 id5Var, ie5 ie5Var, iu30 iu30Var) {
        this.c = p811Var;
        this.b = f;
        this.d = id5Var;
        this.e = ie5Var;
        this.f = iu30Var;
    }
}
