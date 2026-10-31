package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jc5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc5(byte b, float f) {
        super(1);
        this.a = b;
        this.b = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(f);
                kd31Var.E(kd31Var.T0.h() * 3.0f);
                return rih1Var;
            case 1:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(f);
                kd31Var2.i(2);
                kd31Var2.E(kd31Var2.T0.h() * 50.0f * (1.0f - f));
                return rih1Var;
            case 2:
                kd31 kd31Var3 = (kd31) obj;
                kd31Var3.b(f);
                kd31Var3.i(2);
                return rih1Var;
            case 3:
                kd31 kd31Var4 = (kd31) obj;
                float fO = 1.0f - yoi1.o(f, 0.0f, 1.0f);
                float f2 = (0.19999999f * fO) + 0.8f;
                kd31Var4.q(f2);
                kd31Var4.r(f2);
                kd31Var4.b((fO * 0.6f) + 0.4f);
                return rih1Var;
            case 4:
                ((kd31) obj).p(f);
                return rih1Var;
            case 5:
                lsl lslVar = (lsl) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + f;
                cab cabVarA1 = lslVar.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    lslVar.s1();
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
            case 6:
                ((kd31) obj).b(f);
                return rih1Var;
            case 7:
                return z590.a((z590) obj, (lsm0) null, false, (o091) null, false, 0L, 0L, this.b, 0L, (y1k1) null, 447);
            case 8:
                kd31 kd31Var5 = (kd31) obj;
                kd31Var5.q(f);
                kd31Var5.r(f);
                kd31Var5.A(sgc1.u(0.0f, 0.0f));
                return rih1Var;
            case 9:
                ((kd31) obj).b(f);
                return rih1Var;
            case 10:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, f);
                return rih1Var;
            case 11:
                ((kd31) obj).b(f);
                return rih1Var;
            case 12:
                ((kd31) obj).p(f);
                return rih1Var;
            case 13:
                ((kd31) obj).p(f);
                return rih1Var;
            case 14:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) * f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) * 0.33f;
                long j = u7h.f;
                DrawScope.S0(lslVar2, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), fIntBitsToFloat3 - fIntBitsToFloat4, fIntBitsToFloat3, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                return rih1Var;
            case 15:
                return new qr80(((long) jch0.U(f)) & 4294967295L);
            case 16:
                z5v z5vVar = (z5v) obj;
                z5vVar.a(-f, tnn.a);
                z5vVar.a(0.0f, tnn.b);
                z5vVar.a(f, tnn.c);
                return rih1Var;
            case 17:
                return new qr80(((long) ((int) f)) << 32);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((kd31) obj).b(f);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((kd31) obj).b(f);
                return rih1Var;
            case 20:
                ((kd31) obj).b(f);
                return rih1Var;
            case 21:
                ((kd31) obj).b(f);
                return rih1Var;
            case 22:
                return new qr80(((long) jch0.U(f)) << 32);
            case 23:
                ((kd31) obj).b(f);
                return rih1Var;
            case 24:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.b(f);
                kd31Var6.i(2);
                return rih1Var;
            case 25:
                ((ExoPlayer) obj).m(new k2u0(f));
                return rih1Var;
            case 26:
                ((kd31) obj).E(f);
                return rih1Var;
            case 27:
                ((kd31) obj).b(f);
                return rih1Var;
            case 28:
                ((kd31) obj).b(f);
                return rih1Var;
            default:
                ((kd31) obj).b(f);
                return rih1Var;
        }
    }
}
