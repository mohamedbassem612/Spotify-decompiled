package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewSpinner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy(byte b, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                CircularVideoPreviewSpinner circularVideoPreviewSpinner = (CircularVideoPreviewSpinner) obj;
                boolean z2 = circularVideoPreviewSpinner.e;
                if (z) {
                    if (!z2) {
                        circularVideoPreviewSpinner.e = true;
                        circularVideoPreviewSpinner.d = circularVideoPreviewSpinner.a.b();
                        circularVideoPreviewSpinner.invalidate();
                    }
                } else if (z2) {
                    circularVideoPreviewSpinner.e = false;
                    circularVideoPreviewSpinner.d = 0L;
                    circularVideoPreviewSpinner.invalidate();
                }
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 3);
                b261.y(e261Var, z);
                return rih1Var;
            case 2:
                String str = ((uv11) obj).a;
                if (z) {
                    return str;
                }
                return null;
            case 3:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                if (z) {
                    float fX0 = lslVar.X0(120.0f) / 2.0f;
                    float fX1 = lslVar.X0(8.0f) + fX0;
                    float fX2 = lslVar.X0(16.0f) - fX0;
                    if (lslVar.getLayoutDirection() == flb0.b) {
                        fX2 = Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX2;
                    }
                    DrawScope.b0(lslVar, u7h.j, fX1, (((long) Float.floatToRawIntBits(fX2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / 2.0f))), 0.0f, (DrawStyle) null, 56);
                }
                return rih1Var;
            case 4:
                ((kd31) obj).p(z ? 90.0f : -90.0f);
                return rih1Var;
            case 5:
                b261.y((e261) obj, z);
                return rih1Var;
            case 6:
                b261.y((e261) obj, z);
                return rih1Var;
            case 7:
                e261 e261Var2 = (e261) obj;
                if (!z) {
                    b261.a(e261Var2);
                }
                return rih1Var;
            case 8:
                return ((dnl0) obj).e(z ? 2 : 1, z ? 1 : 2);
            case 9:
                b261.y((e261) obj, z);
                return rih1Var;
            case 10:
                rtb0.b((rtb0) obj, 10, (iu30) null, new j2i(1200860780, new spf((byte) 0, z), true), 6);
                return rih1Var;
            case 11:
                e261 e261Var3 = (e261) obj;
                b261.c(e261Var3);
                if (z) {
                    b261.t(e261Var3, 0);
                }
                return rih1Var;
            case 12:
                e261 e261Var4 = (e261) obj;
                b261.x(e261Var4, 1);
                b261.E(e261Var4, z ? rze1.a : rze1.b);
                return rih1Var;
            case 13:
                xa5 xa5Var = (xa5) obj;
                if (z) {
                    return ((Boolean) xa5Var.b()).booleanValue() ? xa5Var.a(hm5.P(xay.e(2, irn1.j0()), xay.f(2, irn1.j0())), hm5.h(1, eqe.P0)) : xa5Var.a(hm5.P(xay.e(2, new zu91(400)), xay.f(2, irn1.o0(150, 0, h4g.c, 2))), hm5.h(1, eqe.Q0));
                }
                return xa5Var.a(hm5.P(xay.e(2, irn1.j0()), xay.f(2, irn1.j0())), hm5.h(1, eqe.O0));
            case 14:
                return new isk(obj, z);
            case 15:
                f1l0 f1l0Var = (f1l0) obj;
                return z ? f1l0Var.e(2, 1) : f1l0Var.e(1, 2);
            case 16:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar2.j() >> 32)) / 2.0f;
                float fX3 = lslVar2.X0(fxm.d) + fIntBitsToFloat;
                float fX4 = lslVar2.X0(12.0f) - fIntBitsToFloat;
                if (z) {
                    fX4 = Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - fX4;
                }
                DrawScope.b0(lslVar2, u7h.j, fX3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fX4)) << 32), 0.0f, (DrawStyle) null, 56);
                return rih1Var;
            case 17:
                ((kd31) obj).b(z ? 1.0f : 0.0f);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.y((e261) obj, z);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                b261.y((e261) obj, z);
                return rih1Var;
            case 20:
                e261 e261Var5 = (e261) obj;
                b261.x(e261Var5, 3);
                b261.y(e261Var5, z);
                return rih1Var;
            case 21:
                List list = (List) obj;
                if (z) {
                    return o7h.N0(new ArrayList(list), Collections.singletonList(new n04()));
                }
                return list;
            case 22:
                b261.y((e261) obj, z);
                return rih1Var;
            case 23:
                b261.y((e261) obj, z);
                return rih1Var;
            case 24:
                b261.y((e261) obj, z);
                return rih1Var;
            case 25:
                String str2 = (String) obj;
                if (z) {
                    return str2;
                }
                return null;
            case 26:
                String str3 = (String) obj;
                if (z) {
                    return str3;
                }
                return null;
            case 27:
                String uri = ((vhc1) obj).getUri();
                if (eqn1.O(uri, z)) {
                    return uri;
                }
                return null;
            case 28:
                String uri2 = ((vhc1) obj).getUri();
                if (eqn1.O(uri2, z)) {
                    return uri2;
                }
                return null;
            default:
                kd31 kd31Var = (kd31) obj;
                kd31Var.p(z ? -25.0f : 25.0f);
                wat watVar = kd31Var.T0;
                kd31Var.C(z ? -(watVar.h() * 20.0f) : watVar.h() * 20.0f);
                kd31Var.E(kd31Var.T0.h() * 20.0f);
                kd31Var.u(kd31Var.T0.h() * 20.0f);
                kd31Var.w(d4o1.a);
                return rih1Var;
        }
    }
}
