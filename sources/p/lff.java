package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lff extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lff(long j, jf01 jf01Var, voe1 voe1Var) {
        super(1);
        this.a = (byte) 7;
        this.b = j;
        this.c = jf01Var;
        this.d = voe1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                eth0 eth0Var = (eth0) obj;
                if (eth0Var != null) {
                    uff uffVar = (uff) obj2;
                    fn31.T(uffVar.k0, (o8n) null, 0, new kff(eth0Var, uffVar, this.b, (ven0) obj3, null), 3);
                }
                return rih1Var;
            case 1:
                eqc eqcVar = (eqc) obj;
                htq0 htq0VarA = ((hw61) obj2).a(eqcVar.a.j(), eqcVar.a.getLayoutDirection(), eqcVar);
                htq0 htq0Var = htq0VarA instanceof htq0 ? htq0VarA : null;
                u8s0 u8s0Var = htq0Var != null ? htq0Var.c : null;
                float f = rck.b;
                return eqcVar.b(new upw(u8s0Var, (tob1) obj3, Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) / 2.0f, this.b, (float) Math.sqrt(us71.e((int) (eqcVar.a.j() & 4294967295L), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)), Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)))), new phc1(eqcVar.h() * 1.0f * 2.0f, 0.0f, 0, 0, (uw4) null, 30)));
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                float fFloatValue = ((Number) ((tob1) obj2).getValue()).floatValue();
                long j2 = this.b;
                tob1 tob1Var = (tob1) obj3;
                long jG1 = drawScope.g1();
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(fFloatValue, fFloatValue, jG1);
                    DrawScope.b0(drawScope, j2, 0.0f, 0L, ((Number) tob1Var.getValue()).floatValue(), (DrawStyle) null, 118);
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
            case 3:
                p5t0 p5t0Var = (p5t0) obj;
                q5t0 q5t0Var = (q5t0) obj2;
                q5t0 q5t0Var2 = (q5t0) obj3;
                int iH = (p5t0Var.i0(6.0f) + q5t0Var.b) + q5t0Var2.b > hjl.h(j) ? hjl.h(j) - ((p5t0Var.i0(6.0f) + q5t0Var.b) + q5t0Var2.b) : 0;
                p5t0Var.k(q5t0Var, (hjl.i(j) - q5t0Var.a) / 2, iH, 0.0f);
                p5t0Var.k(q5t0Var2, (hjl.i(j) - q5t0Var2.a) / 2, p5t0Var.i0(6.0f) + iH + q5t0Var.b, 0.0f);
                return rih1Var;
            case 4:
                DrawScope drawScope2 = (DrawScope) obj;
                u8s0 u8s0Var2 = (tw4) obj2;
                long j3 = this.b;
                qoz0 qoz0Var = (qoz0) obj3;
                cab cabVarA2 = drawScope2.a1();
                long jU2 = cabVarA2.u();
                cabVarA2.p().q();
                try {
                    ((dg8) cabVarA2.b).i(u8s0Var2, 1);
                    DrawScope.d0(drawScope2, j3, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                    DrawScope.S0(drawScope2, qoz0Var, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA2, jU2);
                }
            case 5:
                DrawScope drawScope3 = (DrawScope) obj;
                u8s0 u8s0Var3 = (u8s0) obj2;
                long j4 = this.b;
                if (u8s0Var3 != null) {
                    qoz0 qoz0Var2 = (qoz0) obj3;
                    cab cabVarA3 = drawScope3.a1();
                    long jU3 = cabVarA3.u();
                    cabVarA3.p().q();
                    try {
                        ((dg8) cabVarA3.b).i(u8s0Var3, 1);
                        DrawScope.d0(drawScope3, j4, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                        DrawScope.S0(drawScope3, qoz0Var2, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                    } finally {
                        i3a.n(cabVarA3, jU3);
                    }
                } else {
                    DrawScope.d0(drawScope3, j4, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                }
                return rih1Var;
            case 6:
                u2r u2rVar = (u2r) obj;
                u9c0 u9c0Var = (u9c0) obj3;
                Iterator it = ((t380) obj2).iterator();
                while (it.hasNext()) {
                    u2rVar.d(new js41((l2r) it.next(), j, u9c0Var));
                }
                return rih1Var;
            default:
                gxc gxcVar = (gxc) obj;
                mxc mxcVar = gxcVar.b;
                mxcVar.g = new IOException("Canceled");
                yon1.K5(mxcVar, new uu9(j, (voe1) obj3, (byte) 1));
                return new m4g1(gxcVar.a, this.b, fae1.i(((jf01) obj2).b, 0L), "Request cancelled", 4, fae1.j(gxcVar, true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lff(Object obj, long j, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lff(Object obj, Object obj2, long j, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
