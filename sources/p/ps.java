package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import j$.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ps extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(r390 r390Var, long j) {
        super(1);
        this.a = (byte) 11;
        this.b = j;
    }

    public final Object invoke(Object obj) throws Exception {
        float f;
        Boolean boolValueOf;
        byte b = this.a;
        boolean z = false;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.b0(drawScope, this.b, drawScope.X0(1.0f) + hrt.f(drawScope, 2.0f), 0L, 0.0f, (DrawStyle) null, 124);
                return rih1Var;
            case 1:
                DrawScope drawScope2 = (DrawScope) obj;
                int i = 0;
                while (i < 3) {
                    int i2 = 0;
                    while (i2 < 3) {
                        boolean z2 = i == 1;
                        boolean z3 = i2 == 1;
                        if (z2 && z3) {
                            f = 4.5f;
                        } else {
                            f = (z2 || z3) ? 2.75f : 2.0f;
                        }
                        float fE = (Size.e(drawScope2.j()) * (f / 13.4167f)) / 2.0f;
                        float[] fArr = jm5.a;
                        DrawScope.b0(drawScope2, this.b, fE, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() >> 32)) * fArr[i2])) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) * fArr[i])) & 4294967295L), 0.0f, (DrawStyle) null, 120);
                        i2++;
                    }
                    i++;
                }
                return rih1Var;
            case 2:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / 2.0f;
                DrawScope.g0(lslVar, this.b, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (DrawStyle) null, 0.0f, 7, 118);
                return rih1Var;
            case 3:
                return new w9n(j);
            case 4:
                eqc eqcVar = (eqc) obj;
                float fH = eqcVar.h() * 4.0f;
                return eqcVar.b(new ivb(v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(u7h.j)}), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - fH, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)), 8), fH, (byte) 1));
            case 5:
                DrawScope drawScope3 = (DrawScope) obj;
                DrawScope.b0(drawScope3, this.b, hrt.f(drawScope3, 2.0f), 0L, 0.0f, z520.a, 108);
                return rih1Var;
            case 6:
                eqc eqcVar2 = (eqc) obj;
                Paint paint = new Paint();
                paint.setColor(z4p1.G(j));
                paint.setMaskFilter(new BlurMaskFilter(eqcVar2.h() * 16.0f, BlurMaskFilter.Blur.NORMAL));
                return eqcVar2.a(new ath(Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) / 2.0f, Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) / 2.0f, eqcVar2.h() * 12.0f, paint));
            case 7:
                long j2 = ((xma1) obj).f.d;
                if (j2 > 0 && j2 < j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                return new qr80(j);
            case 9:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM Events WHERE id > ? AND CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = 0 ORDER BY id ASC LIMIT ?");
                try {
                    d441VarG1.r(1, j);
                    d441VarG1.r(2, 40L);
                    int iW = y7y0.w(d441VarG1, "id");
                    int iW2 = y7y0.w(d441VarG1, "authenticated");
                    int iW3 = y7y0.w(d441VarG1, "eventName");
                    int iW4 = y7y0.w(d441VarG1, "sequenceId");
                    int iW5 = y7y0.w(d441VarG1, "sequenceNumber");
                    int iW6 = y7y0.w(d441VarG1, "fragments");
                    int iW7 = y7y0.w(d441VarG1, "owner");
                    int iW8 = y7y0.w(d441VarG1, "deviceId");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        ba00 ba00Var = new ba00();
                        ba00Var.a = d441VarG1.getLong(iW);
                        Integer numValueOf = d441VarG1.isNull(iW2) ? null : Integer.valueOf((int) d441VarG1.getLong(iW2));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        ba00Var.b = boolValueOf;
                        if (d441VarG1.isNull(iW3)) {
                            ba00Var.c = null;
                        } else {
                            ba00Var.c = d441VarG1.P0(iW3);
                        }
                        if (d441VarG1.isNull(iW4)) {
                            ba00Var.d = null;
                        } else {
                            ba00Var.d = d441VarG1.getBlob(iW4);
                        }
                        ba00Var.e = d441VarG1.getLong(iW5);
                        if (d441VarG1.isNull(iW6)) {
                            ba00Var.f = null;
                        } else {
                            ba00Var.f = d441VarG1.getBlob(iW6);
                        }
                        if (d441VarG1.isNull(iW7)) {
                            ba00Var.g = null;
                        } else {
                            ba00Var.g = d441VarG1.P0(iW7);
                        }
                        if (d441VarG1.isNull(iW8)) {
                            ba00Var.h = null;
                        } else {
                            ba00Var.h = d441VarG1.P0(iW8);
                        }
                        arrayList.add(ba00Var);
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            case 10:
                float f2 = (int) (j & 4294967295L);
                DrawScope.S0((DrawScope) obj, v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), 0.25f * f2, f2 * 1.0f, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Long.valueOf(r390.F0((ExoPlayer) obj, j));
            case grn1.d /* 12 */:
                rtb0.b((rtb0) obj, Integer.MAX_VALUE, (iu30) null, new j2i(-154953258, new zof0(j), true), 6);
                return rih1Var;
            case 13:
                return ((eqc) obj).a(new gjd(v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(this.b, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.3f), new u7h(u7h.b(this.b, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.65f), new u7h(u7h.b(this.b, u7h.c(j) * 0.3f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(j))}, 0.0f, Float.POSITIVE_INFINITY, 8), (byte) 3));
            case 14:
                d441 d441VarG2 = ((y341) obj).g1("DELETE FROM messages WHERE messageId = ?");
                try {
                    d441VarG2.r(1, j);
                    d441VarG2.f1();
                    return rih1Var;
                } finally {
                    d441VarG2.close();
                }
            case 15:
                lsl lslVar2 = (lsl) obj;
                float fX0 = lslVar2.X0(112.0f);
                lslVar2.s1();
                DrawScope.S0(lslVar2, v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(j)}), Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) - fX0, Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)), 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)) - fX0)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120);
                return rih1Var;
            case 16:
                lsl lslVar3 = (lsl) obj;
                float fX1 = lslVar3.X0(6.0f) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar3.j() >> 32)) - fX1)) << 32) | (((long) Float.floatToRawIntBits(fX1)) & 4294967295L);
                float fX2 = lslVar3.X0(2.0f) + fX1;
                tw4 tw4VarA = ww4.a();
                u8s0.b(tw4VarA, anm1.f(fX2, jFloatToRawIntBits));
                cab cabVarA1 = lslVar3.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).i(tw4VarA, 0);
                    lslVar3.s1();
                    i3a.n(cabVarA1, jU);
                    DrawScope.b0(lslVar3, this.b, fX1, jFloatToRawIntBits, 0.0f, (DrawStyle) null, 120);
                    return rih1Var;
                } catch (Throwable th) {
                    i3a.n(cabVarA1, jU);
                    throw th;
                }
            case 17:
                DrawScope.b0((DrawScope) obj, this.b, 0.0f, 0L, 0.0f, (DrawStyle) null, 126);
                return rih1Var;
            case 18:
                sp21 sp21Var = (sp21) obj;
                sp21Var.m = Long.valueOf(j);
                sp21Var.u = gtv0.k();
                return rih1Var;
            case 19:
                sp21 sp21Var2 = (sp21) obj;
                sp21Var2.l = Long.valueOf(j);
                sp21Var2.u = gtv0.k();
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return k5u0.b((k5u0) obj, 0L, null, Long.valueOf(j), false, 0.0f, false, null, null, null, null, 0, false, false, 32759);
            case 21:
                DrawScope.b0((DrawScope) obj, this.b, 0.0f, 0L, 0.0f, (DrawStyle) null, 126);
                return rih1Var;
            case 22:
                DrawScope.S0((DrawScope) obj, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(this.b, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(this.b, 0.9f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 23:
                xa5 xa5Var = (xa5) obj;
                pxg1 pxg1VarO0 = irn1.o0((int) j, 0, null, 6);
                if (!(((aj81) xa5Var.b()).e.a instanceof ii81)) {
                    return new p9m(bby.b, xay.f(2, pxg1VarO0), -1.0f, (c391) null, 8);
                }
                bby bbyVarE = xay.e(2, pxg1VarO0);
                ln00 ln00Var = ln00.b;
                return new p9m(bbyVarE, xa5Var.d(), 1.0f, (c391) null, 8);
            case 24:
                DrawScope.b0((DrawScope) obj, this.b, 0.0f, 0L, 0.0f, (DrawStyle) null, 126);
                return rih1Var;
            case 25:
                DrawScope.b0((DrawScope) obj, this.b, 0.0f, 0L, 0.0f, (DrawStyle) null, 126);
                return rih1Var;
            case 26:
                DrawScope drawScope4 = (DrawScope) obj;
                DrawScope.b0(drawScope4, this.b, hrt.f(drawScope4, 2.0f), 0L, 0.0f, z520.a, 108);
                return rih1Var;
            case 27:
                return Boolean.valueOf(((Instant) ((mmr0) obj).b).toEpochMilli() > j);
            case 28:
                bfo bfoVar = (bfo) obj;
                if (bfoVar.c > 0) {
                    long j3 = bfoVar.b;
                    if (j < bfoVar.d && j3 <= j) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                DrawScope.d0((DrawScope) obj, this.b, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps(long j, vzp0 vzp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps(byte b, long j) {
        super(1);
        this.a = b;
        this.b = j;
    }
}
