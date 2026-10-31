package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gfa0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n041 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gfa0(n041 n041Var, byte b) {
        super(1);
        this.a = b;
        this.b = n041Var;
    }

    public final Object invoke(Object obj) {
        cab cabVar;
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n041 n041Var = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fH = drawScope.h();
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(fH, fH, 0L);
                    Iterator it = efa0.a.iterator();
                    while (it.hasNext()) {
                        ffa0 ffa0Var = (ffa0) it.next();
                        float f = ffa0Var.a;
                        float f2 = ffa0Var.d;
                        float f3 = ffa0Var.c / 2.0f;
                        float f4 = f - f3;
                        float f5 = f2 / 2.0f;
                        float f6 = ffa0Var.b - f5;
                        ((dg8) drawScope.a1().b).z(f4, f6);
                        try {
                            float f7 = ffa0Var.e;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32);
                            cab cabVarA2 = drawScope.a1();
                            long jU2 = cabVarA2.u();
                            cabVarA2.p().q();
                            Iterator it2 = it;
                            try {
                                ((dg8) cabVarA2.b).s(f7, jFloatToRawIntBits);
                                tw4 tw4VarA = efa0.a(ffa0Var);
                                boolean z = n041Var.b;
                                vex vexVar = n041Var.c;
                                long j2 = z ? vexVar.k : vexVar.d;
                                cabVar = cabVarA2;
                                long j3 = j2;
                                j = jU2;
                                try {
                                    DrawScope.w0(drawScope, tw4VarA, j3, new phc1(1.0f, 0.0f, 0, 0, cgj1.t(0.0f, efa0.b), 14), 52);
                                    cabVar.p().i();
                                    cabVar.D(j);
                                    ((dg8) drawScope.a1().b).z(-f4, -f6);
                                    it = it2;
                                } catch (Throwable th) {
                                    th = th;
                                    cabVar.p().i();
                                    cabVar.D(j);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cabVar = cabVarA2;
                                j = jU2;
                            }
                        } catch (Throwable th3) {
                            ((dg8) drawScope.a1().b).z(-f4, -f6);
                            throw th3;
                        }
                    }
                    i3a.n(cabVarA1, jU);
                    return rih1Var;
                } catch (Throwable th4) {
                    i3a.n(cabVarA1, jU);
                    throw th4;
                }
            default:
                DrawScope.v((DrawScope) obj, n041Var.a(), 0L, 0L, 126);
                return rih1Var;
        }
    }
}
