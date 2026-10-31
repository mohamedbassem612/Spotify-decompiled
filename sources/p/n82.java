package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n82 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n82(long j, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lsl lslVar = (lsl) obj;
                fid fidVarP = lslVar.a1().p();
                n511 n511VarG = anm1.g(0L, lslVar.j());
                lw4 lw4Var = (lw4) this.c;
                long j = this.b;
                try {
                    fidVarP.j(n511VarG, lw4Var);
                    lslVar.s1();
                    fbp1.o(lslVar, true, j);
                    fbp1.o(lslVar, false, j);
                    return rih1.a;
                } finally {
                    fidVarP.i();
                }
            case 1:
                DrawScope.o((DrawScope) obj, (qoz0) this.c, 500.0f, this.b, 0.0f, (phc1) null, 120);
                return rih1.a;
            case 2:
                n511 n511Var = (n511) this.c;
                float f = n511Var.a;
                long j2 = this.b;
                return new qr80((((long) jch0.U(n511Var.b - Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) jch0.U(f - Float.intBitsToFloat((int) (j2 >> 32)))) << 32));
            case 3:
                lsl lslVar2 = (lsl) obj;
                xtb0 xtb0Var = (xtb0) this.c;
                mdt mdtVarA = yv91.a(new ih1(xtb0Var, (byte) 22));
                mdt mdtVarA2 = yv91.a(new ih1(xtb0Var, (byte) 23));
                lslVar2.s1();
                float fFloatValue = ((Number) mdtVarA.getValue()).floatValue();
                long j3 = this.b;
                u7h u7hVar = new u7h(j3);
                long j4 = u7h.j;
                DrawScope.S0(lslVar2, v9c.h(p7h.M(new u7h[]{u7hVar, new u7h(j4)}), 0.0f, fFloatValue, 8), 0L, (((long) Float.floatToRawIntBits(((Number) mdtVarA.getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)))) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 122);
                DrawScope.S0(lslVar2, v9c.h(p7h.M(new u7h[]{new u7h(j4), new u7h(j3)}), Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - ((Number) mdtVarA2.getValue()).floatValue(), Float.intBitsToFloat((int) (lslVar2.j() >> 32)), 8), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - ((Number) mdtVarA2.getValue()).floatValue())) << 32), 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 124);
                return rih1.a;
            case 4:
                j9a j9aVar = (ExoPlayer) obj;
                j9aVar.h1(5, this.b);
                ((r390) this.c).N0 = r390.F0(j9aVar, j9aVar.v());
                return rih1.a;
            case 5:
                int i = hjl.i(this.b);
                q5t0 q5t0Var = (q5t0) this.c;
                ((p5t0) obj).k(q5t0Var, (i - q5t0Var.a) / 2, 0, 0.0f);
                return rih1.a;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(3.7f);
                float fX1 = drawScope.X0(3.3f);
                DrawScope.b0(drawScope, this.b, (Size.e(drawScope.j()) / 2.0f) + fX0, 0L, 0.0f, (DrawStyle) null, 124);
                DrawScope.o(drawScope, new mic0(0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), (List) this.c, (List) null), hrt.f(drawScope, 2.0f) - (fX1 / 2.0f), 0L, 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 108);
                return rih1.a;
            case 7:
                DrawScope drawScope2 = (DrawScope) obj;
                Float f2 = (Float) this.c;
                if (f2 != null) {
                    long j5 = this.b;
                    float fX2 = (drawScope2.X0(8.0f) * 2.0f) + f2.floatValue();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope2.j() >> 32)) - fX2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fX2)) << 32);
                    float fX3 = drawScope2.X0(8.0f);
                    DrawScope.g0(drawScope2, j5, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fX3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fX3))), (DrawStyle) null, 0.0f, 0, 240);
                }
                return rih1.a;
            case 8:
                return new szv0(this.b, 4, ((wto) this.c).f.a);
            case 9:
                ((zyp0) obj).z = z4n1.b("timeout", this.b, (TimeUnit) this.c);
                return rih1.a;
            case 10:
                sp21 sp21Var = (sp21) obj;
                sp21Var.l = Long.valueOf(this.b);
                sp21Var.u = (voe1) this.c;
                return rih1.a;
            case 11:
                sp21 sp21Var2 = (sp21) obj;
                sp21Var2.k = Long.valueOf(((szp0) this.c).b.b());
                Long l = sp21Var2.p;
                sp21Var2.p = Long.valueOf((l != null ? l.longValue() : 0L) + this.b);
                return rih1.a;
            case 12:
                DrawScope drawScope3 = (DrawScope) obj;
                DrawScope.i1(drawScope3, this.b, -90.0f, ((phw0) this.c).g * 360.0f, 0L, 0L, new phc1(drawScope3.X0(2.0f), 0.0f, 1, 0, (uw4) null, 26), 880);
                return rih1.a;
            case 13:
                DrawScope drawScope4 = (DrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope4.j() & 4294967295L));
                es41 es41Var = (es41) this.c;
                float fS = (fIntBitsToFloat / (es41Var.f.s() + fIntBitsToFloat)) * fIntBitsToFloat;
                float fX4 = drawScope4.X0(24.0f);
                if (fS < fX4) {
                    fS = fX4;
                }
                float fS2 = (es41Var.a.s() / es41Var.f.s()) * (fIntBitsToFloat - fS);
                long j6 = this.b;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fS2)) & 4294967295L);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope4.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope4.j() >> 32)) / 2.0f;
                DrawScope.g0(drawScope4, j6, jFloatToRawIntBits3, jFloatToRawIntBits4, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
                return rih1.a;
            default:
                ((frr0) this.c).t((long) (((Number) obj).floatValue() * this.b));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n82(Object obj, long j, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
