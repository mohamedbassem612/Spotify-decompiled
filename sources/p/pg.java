package p;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pg implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pg(m811 m811Var, bs41 bs41Var, m811 m811Var2, ozr ozrVar) {
        this.a = (byte) 9;
        this.b = m811Var;
        this.c = bs41Var;
        this.d = m811Var2;
    }

    private final Object a(Object obj) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        String str = (String) this.b;
        rpv0 rpv0Var = (rpv0) this.c;
        pwz0 pwz0Var = (pwz0) this.d;
        y341 y341Var = (y341) obj;
        d441 d441VarG1 = y341Var.g1(str);
        try {
            ((waq0) rpv0Var.b).invoke(d441VarG1);
            int iM = d9y0.m(d441VarG1, "id");
            int iM2 = d9y0.m(d441VarG1, "state");
            int iM3 = d9y0.m(d441VarG1, "output");
            int iM4 = d9y0.m(d441VarG1, "initial_delay");
            int iM5 = d9y0.m(d441VarG1, "interval_duration");
            int iM6 = d9y0.m(d441VarG1, "flex_duration");
            int iM7 = d9y0.m(d441VarG1, "run_attempt_count");
            int iM8 = d9y0.m(d441VarG1, "backoff_policy");
            int iM9 = d9y0.m(d441VarG1, "backoff_delay_duration");
            int iM10 = d9y0.m(d441VarG1, "last_enqueue_time");
            int iM11 = d9y0.m(d441VarG1, "period_count");
            int iM12 = d9y0.m(d441VarG1, "generation");
            int iM13 = d9y0.m(d441VarG1, "next_schedule_time_override");
            int iM14 = d9y0.m(d441VarG1, "stop_reason");
            int iM15 = d9y0.m(d441VarG1, "required_network_type");
            int iM16 = d9y0.m(d441VarG1, "required_network_request");
            int iM17 = d9y0.m(d441VarG1, "requires_charging");
            int iM18 = d9y0.m(d441VarG1, "requires_device_idle");
            int iM19 = d9y0.m(d441VarG1, "requires_battery_not_low");
            int iM20 = d9y0.m(d441VarG1, "requires_storage_not_low");
            int iM21 = d9y0.m(d441VarG1, "trigger_content_update_delay");
            int iM22 = d9y0.m(d441VarG1, "trigger_max_content_delay");
            int iM23 = d9y0.m(d441VarG1, "content_uri_triggers");
            int i9 = iM12;
            y36 y36Var = new y36(0);
            int i10 = iM11;
            y36 y36Var2 = new y36(0);
            while (d441VarG1.f1()) {
                String strP0 = d441VarG1.P0(iM);
                if (!y36Var.containsKey(strP0)) {
                    y36Var.put(strP0, new ArrayList());
                }
                String strP1 = d441VarG1.P0(iM);
                if (!y36Var2.containsKey(strP1)) {
                    y36Var2.put(strP1, new ArrayList());
                }
                iM10 = iM10;
            }
            int i11 = iM10;
            d441VarG1.reset();
            pwz0Var.b(y341Var, y36Var);
            pwz0Var.a(y341Var, y36Var2);
            ArrayList arrayList = new ArrayList();
            while (d441VarG1.f1()) {
                if (iM == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String strP2 = d441VarG1.P0(iM);
                if (iM2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                y36 y36Var3 = y36Var2;
                wvl1 wvl1VarM = cwl1.M((int) d441VarG1.getLong(iM2));
                if (iM3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                byte[] blob = d441VarG1.getBlob(iM3);
                ewq ewqVar = ewq.b;
                ewq ewqVarA = o0c.A(blob);
                long j = iM4 == -1 ? 0L : d441VarG1.getLong(iM4);
                long j2 = iM5 == -1 ? 0L : d441VarG1.getLong(iM5);
                long j3 = iM6 == -1 ? 0L : d441VarG1.getLong(iM6);
                int i12 = iM7 == -1 ? 0 : (int) d441VarG1.getLong(iM7);
                if (iM8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                int i13 = iM2;
                h0a h0aVarJ = cwl1.J((int) d441VarG1.getLong(iM8));
                long j4 = iM9 == -1 ? 0L : d441VarG1.getLong(iM9);
                int i14 = i11;
                long j5 = i14 == -1 ? 0L : d441VarG1.getLong(i14);
                i11 = i14;
                int i15 = i10;
                int i16 = i15 == -1 ? 0 : (int) d441VarG1.getLong(i15);
                i9 = i9;
                if (i9 == -1) {
                    i = 0;
                    i2 = -1;
                } else {
                    i = (int) d441VarG1.getLong(i9);
                    i2 = -1;
                }
                int i17 = iM13;
                long j6 = i17 == i2 ? 0L : d441VarG1.getLong(i17);
                iM13 = i17;
                int i18 = iM14;
                if (i18 == i2) {
                    i3 = 0;
                    i4 = i2;
                } else {
                    i3 = (int) d441VarG1.getLong(i18);
                    i4 = -1;
                }
                int i19 = iM15;
                if (i19 == i4) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                int iK = cwl1.K((int) d441VarG1.getLong(i19));
                int i20 = iM16;
                if (i20 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                e8o0 e8o0VarQ0 = cwl1.q0(d441VarG1.getBlob(i20));
                boolean z5 = true;
                int i21 = iM17;
                if (i21 == -1) {
                    z = false;
                    i5 = -1;
                } else {
                    z = ((int) d441VarG1.getLong(i21)) != 0;
                    i5 = -1;
                }
                int i22 = iM18;
                if (i22 == i5) {
                    z2 = false;
                    i6 = i5;
                } else {
                    z2 = ((int) d441VarG1.getLong(i22)) != 0;
                    i6 = -1;
                }
                int i23 = iM19;
                if (i23 == i6) {
                    z3 = false;
                    i7 = i6;
                } else {
                    z3 = ((int) d441VarG1.getLong(i23)) != 0;
                    i7 = -1;
                }
                int i24 = iM20;
                if (i24 == i7) {
                    z4 = false;
                    i8 = i7;
                } else {
                    if (((int) d441VarG1.getLong(i24)) == 0) {
                        z5 = false;
                    }
                    z4 = z5;
                    i8 = -1;
                }
                int i25 = iM21;
                long j7 = i25 == i8 ? 0L : d441VarG1.getLong(i25);
                int i26 = iM22;
                long j8 = i26 == i8 ? 0L : d441VarG1.getLong(i26);
                iM22 = i26;
                int i27 = iM23;
                if (i27 == i8) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                arrayList.add(new uwl1(strP2, wvl1VarM, ewqVarA, j, j2, j3, new gjl(e8o0VarQ0, iK, z, z2, z3, z4, j7, j8, cwl1.k(d441VarG1.getBlob(i27))), i12, h0aVarJ, j4, j5, i16, i, j6, i3, (List) sqg0.G(d441VarG1.P0(iM), y36Var), (List) sqg0.G(d441VarG1.P0(iM), y36Var3)));
                i10 = i15;
                iM14 = i18;
                iM16 = i20;
                iM3 = iM3;
                iM23 = i27;
                iM21 = i25;
                iM7 = iM7;
                iM8 = iM8;
                iM19 = i23;
                iM20 = i24;
                iM5 = iM5;
                iM6 = iM6;
                iM18 = i22;
                iM17 = i21;
                iM4 = iM4;
                iM15 = i19;
                iM2 = i13;
                y36Var2 = y36Var3;
            }
            d441VarG1.close();
            return arrayList;
        } catch (Throwable th) {
            d441VarG1.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ee A[LOOP:0: B:59:0x01ac->B:72:0x01ee, LOOP_END] */
    public final Object invoke(Object obj) throws Throwable {
        float f;
        m7v m7vVar;
        Object objG;
        Object obj2;
        Object obj3;
        ze5 ze5Var;
        byte b = this.a;
        qqq0 qqq0Var = qqq0.b;
        qqq0 qqq0Var2 = qqq0.a;
        byte b2 = 2;
        e4v u7hVar = null;
        final byte b3 = 1;
        z = true;
        boolean z = true;
        boolean zBooleanValue = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                iac0 iac0Var = (iac0) obj6;
                rg rgVar = new rg((iu30) obj5, z3 ? 1 : 0);
                iac0Var.getLifecycle().a(rgVar);
                return new sg(obj4, (Object) iac0Var, (Object) rgVar, (byte) (z2 ? 1 : 0));
            case 1:
                th30 th30Var = (th30) obj6;
                w8c0 w8c0Var = (w8c0) obj4;
                zf30 zf30VarF = th30Var.F(((pg30) obj5).a().getId());
                if (zf30VarF != null && !th30Var.U() && w8c0Var.a(w8c0.c)) {
                    nu9 nu9Var = new nu9(th30Var);
                    nu9Var.r = true;
                    nu9Var.p(zf30VarF, w8c0Var);
                    nu9Var.h();
                }
                return new tj4((byte) 0);
            case 2:
                k75 k75Var = (k75) obj6;
                hmb0 hmb0Var = (hmb0) obj5;
                k75 k75Var2 = (k75) obj4;
                u84 u84VarP = ((DrawScope) obj).a1().p();
                if (k75Var.b.getVisibility() != 8) {
                    k75Var.b1 = true;
                    e4v e4vVar = hmb0Var.O0;
                    u7hVar = e4vVar instanceof ha4 ? (ha4) e4vVar : null;
                    if (u7hVar != null) {
                        Canvas canvas = v84.a;
                        Canvas canvas2 = u84VarP.a;
                        u7hVar.getAndroidViewsHandler$ui().getClass();
                        k75Var2.draw(canvas2);
                    }
                    k75Var.b1 = false;
                }
                return rih1Var;
            case 3:
                m811 m811Var = (m811) obj6;
                b8f1 b8f1Var = (b8f1) obj5;
                de5 de5Var = (de5) obj;
                float fFloatValue = ((Number) de5Var.e.getValue()).floatValue() - m811Var.a;
                float fS = b8f1Var.c.s();
                b8f1Var.b(fS + fFloatValue);
                float fAbs = Math.abs(fS - b8f1Var.c.s());
                m811Var.a = ((Number) de5Var.e.getValue()).floatValue();
                ((m811) obj4).a = ((Number) de5Var.b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    de5Var.a();
                }
                return rih1Var;
            case 4:
                iu30 iu30Var = (iu30) obj5;
                ven0 ven0Var = (ven0) obj4;
                c8e1 c8e1Var = (c8e1) obj;
                ((ven0) obj6).setValue(c8e1Var);
                boolean zJ = u890.j((String) ven0Var.getValue(), c8e1Var.a.b);
                af5 af5Var = c8e1Var.a;
                ven0Var.setValue(af5Var.b);
                if (!zJ) {
                    iu30Var.invoke(af5Var.b);
                }
                return rih1Var;
            case 5:
                b261.i((e261) obj, (String) obj6, new og((c9n) obj5, (w5f1) obj4, (byte) 12));
                return rih1Var;
            case 6:
                jtq0 jtq0Var = (jtq0) obj5;
                Brush brush = (Brush) obj4;
                DrawScope drawScope = (DrawScope) obj;
                Function0 function0 = (Function0) ((ne) obj6).b;
                function0.getClass();
                float f2 = ((p3v) function0.invoke()).a;
                float fMin = Math.min(p3v.c(f2, 0.0f) ? 1.0f : (float) Math.ceil(drawScope.X0(f2)), (float) Math.ceil(hrt.f(drawScope, 2.0f)));
                float f3 = fMin < 0.0f ? 0.0f : fMin;
                float f4 = f3 / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f3)) & 4294967295L);
                b3 = f3 * 2.0f <= Size.e(drawScope.j()) ? (byte) 0 : (byte) 1;
                long j = jtq0Var.c.e;
                phc1 phc1Var = new phc1(f3, 0.0f, 0, 0, null, 30);
                if (b3 != 0) {
                    DrawScope.c0(drawScope, brush, 0L, 0L, j, 0.0f, (DrawStyle) null, 246);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f4) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f3;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f3;
                    cab cabVarA1 = drawScope.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        ((dg8) cabVarA1.b).k(f3, f3, fIntBitsToFloat, fIntBitsToFloat2, 0);
                        DrawScope.c0(drawScope, brush, 0L, 0L, j, 0.0f, (DrawStyle) null, 246);
                    } finally {
                        i3a.n(cabVarA1, jU);
                    }
                } else {
                    DrawScope.c0(drawScope, brush, jFloatToRawIntBits, jFloatToRawIntBits2, w0h1.L(f4, j), 0.0f, phc1Var, 208);
                }
                return rih1Var;
            case 7:
                xtl xtlVar = (xtl) obj6;
                faa0 faa0Var = (faa0) obj5;
                cu41 cu41Var = (cu41) obj4;
                float fFloatValue2 = ((Float) obj).floatValue();
                f = xtlVar.Q0 ? 1.0f : -1.0f;
                du41 du41Var = xtlVar.P0;
                long jF = du41Var.f(du41Var.i(f * fFloatValue2));
                du41 du41Var2 = cu41Var.a;
                float fH = du41Var.h(du41Var.f(du41Var2.d(du41Var2.k, jF, 1))) * f;
                if (Math.abs(fH) < Math.abs(fFloatValue2)) {
                    op71.o(faa0Var, "Scroll animation cancelled because scroll was not consumed (" + fH + " < " + fFloatValue2 + ")");
                }
                return rih1Var;
            case 8:
                r1c0 r1c0Var = (r1c0) obj6;
                c8e1 c8e1Var2 = (c8e1) obj5;
                hyp0 hyp0Var = (hyp0) obj4;
                DrawScope drawScope2 = (DrawScope) obj;
                z9e1 z9e1VarD = r1c0Var.d();
                if (z9e1VarD != null) {
                    fid fidVarP = drawScope2.a1().p();
                    long j2 = ((nbe1) r1c0Var.A.getValue()).a;
                    long j3 = ((nbe1) r1c0Var.B.getValue()).a;
                    y9e1 y9e1Var = z9e1VarD.a;
                    lw4 lw4Var = r1c0Var.y;
                    long j4 = r1c0Var.z;
                    if (!nbe1.d(j2)) {
                        lw4Var.c(j4);
                        int iO = hyp0Var.o(nbe1.g(j2));
                        int iO2 = hyp0Var.o(nbe1.f(j2));
                        if (iO != iO2) {
                            fidVarP.u(y9e1Var.k(iO, iO2), lw4Var);
                        }
                    } else if (!nbe1.d(j3)) {
                        long jC = y9e1Var.a.b.c();
                        u7hVar = jC != 16 ? new u7h(jC) : null;
                        long j5 = u7hVar != null ? ((u7h) u7hVar).a : u7h.b;
                        lw4Var.c(u7h.b(j5, u7h.c(j5) * 0.2f, 0.0f, 0.0f, 0.0f, 14));
                        int iO3 = hyp0Var.o(nbe1.g(j3));
                        int iO4 = hyp0Var.o(nbe1.f(j3));
                        if (iO3 != iO4) {
                            fidVarP.u(y9e1Var.k(iO3, iO4), lw4Var);
                        }
                    } else if (!nbe1.d(c8e1Var2.b)) {
                        lw4Var.c(j4);
                        long j6 = c8e1Var2.b;
                        int iO5 = hyp0Var.o(nbe1.g(j6));
                        int iO6 = hyp0Var.o(nbe1.f(j6));
                        if (iO5 != iO6) {
                            fidVarP.u(y9e1Var.k(iO5, iO6), lw4Var);
                        }
                    }
                    t5p1.p(fidVarP, y9e1Var);
                }
                return rih1Var;
            case 9:
                m811 m811Var2 = (m811) obj6;
                de5 de5Var2 = (de5) obj;
                float fFloatValue3 = ((Number) de5Var2.e.getValue()).floatValue() - m811Var2.a;
                float f5 = ((bs41) obj5).f(fFloatValue3);
                m811Var2.a = ((Number) de5Var2.e.getValue()).floatValue();
                ((m811) obj4).a = ((Number) de5Var2.b()).floatValue();
                if (Math.abs(fFloatValue3 - f5) > 0.5f) {
                    de5Var2.a();
                }
                return rih1Var;
            case 10:
                Context context = (Context) obj5;
                r3e1 r3e1Var = (r3e1) obj4;
                uim uimVar = (uim) obj;
                List list = ((f3e1) obj6).a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    e3e1 e3e1Var = (e3e1) list.get(i);
                    if (e3e1Var instanceof m3e1) {
                        m3e1 m3e1Var = (m3e1) e3e1Var;
                        uim.b(uimVar, new w9(m3e1Var, (byte) 6), m3e1Var.c == 0 ? null : new j2i(-1930700965, new eus(m3e1Var, z4 ? 1 : 0), true), new og(m3e1Var, r3e1Var, (byte) 20), 6);
                    } else if (e3e1Var instanceof s3e1) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            ykb0.j(uimVar, context, (s3e1) e3e1Var);
                        }
                    } else if (e3e1Var instanceof q3e1) {
                        uimVar.a.add(rwq.b);
                    }
                }
                return rih1Var;
            case 11:
                x3v x3vVar = (x3v) obj6;
                d4v d4vVar = (d4v) obj5;
                l811 l811Var = (l811) obj4;
                d4v d4vVar2 = (d4v) obj;
                if (!((pim0) d4vVar2).N0) {
                    return cpg1.b;
                }
                if (d4vVar2.Q0 != null) {
                    qf80.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                iu30 iu30Var2 = d4vVar2.O0;
                u7hVar = iu30Var2 != null ? (e4v) iu30Var2.invoke(x3vVar) : null;
                d4vVar2.Q0 = u7hVar;
                boolean z6 = u7hVar != null;
                if (z6) {
                    oap1.C(d4vVar).getDragAndDropManager().b.add(d4vVar2);
                }
                if (!l811Var.a && !z6) {
                    z = false;
                }
                l811Var.a = z;
                return cpg1.a;
            case 12:
                c6v c6vVar = (c6v) obj5;
                q5t0 q5t0Var = (q5t0) obj4;
                p5t0 p5t0Var = (p5t0) obj;
                boolean zW = ((ifh0) obj6).W();
                s24 s24Var = c6vVar.O0;
                float fD = zW ? s24Var.I().d(((mdt) c6vVar.O0.X).getValue()) : s24Var.V();
                qqq0 qqq0Var3 = c6vVar.Q0;
                float f6 = qqq0Var3 == qqq0Var ? fD : 0.0f;
                if (qqq0Var3 != qqq0Var2) {
                    fD = 0.0f;
                }
                p5t0Var.a = true;
                p5t0.g(jch0.U(f6), jch0.U(fD), p5t0Var, q5t0Var);
                p5t0Var.a = false;
                return rih1Var;
            case 13:
                d6v d6vVar = (d6v) obj5;
                q5t0 q5t0Var2 = (q5t0) obj4;
                p5t0 p5t0Var2 = (p5t0) obj;
                boolean zW2 = ((ifh0) obj6).W();
                t24 t24Var = d6vVar.O0;
                float f7 = zW2 ? t24Var.c().f(d6vVar.O0.i.getValue()) : t24Var.g();
                f = (oap1.B(d6vVar).a1 == flb0.b && d6vVar.Q0 == qqq0Var) ? -1.0f : 1.0f;
                qqq0 qqq0Var4 = d6vVar.Q0;
                float f8 = qqq0Var4 == qqq0Var ? f7 * f : 0.0f;
                if (qqq0Var4 != qqq0Var2) {
                    f7 = 0.0f;
                }
                p5t0Var2.a = true;
                p5t0.g(jch0.U(f8), jch0.U(f7), p5t0Var2, q5t0Var2);
                p5t0Var2.a = false;
                return rih1Var;
            case 14:
                p24 p24Var = (p24) obj6;
                qqq0 qqq0Var5 = (qqq0) obj4;
                long j7 = ((l4v) obj).a;
                long jH = ((l6v) obj5).n1 ? Offset.h(-1.0f, j7) : Offset.h(1.0f, j7);
                bz0 bz0Var = k6v.a;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (qqq0Var5 == qqq0Var2 ? jH & 4294967295L : jH >> 32));
                switch (p24Var.a) {
                    case 0:
                        s24 s24Var2 = (s24) p24Var.b;
                        n24.a((n24) s24Var2.N0, s24Var2.Q(fIntBitsToFloat3));
                        return rih1Var;
                    case 1:
                        r24 r24Var = (r24) p24Var.b;
                        m24 m24Var = (m24) r24Var.k;
                        drr0 drr0Var = (drr0) r24Var.i;
                        float fS2 = (Float.isNaN(drr0Var.s()) ? 0.0f : drr0Var.s()) + fIntBitsToFloat3;
                        Float fH0 = o7h.H0(r24Var.b().a.values());
                        float fFloatValue4 = fH0 != null ? fH0.floatValue() : Float.NaN;
                        Float fE0 = o7h.E0(r24Var.b().a.values());
                        float fO = yoi1.o(fS2, fFloatValue4, fE0 != null ? fE0.floatValue() : Float.NaN);
                        r24 r24Var2 = m24Var.a;
                        ((drr0) r24Var2.i).t(fO);
                        ((drr0) r24Var2.j).t(0.0f);
                        return rih1Var;
                    case 2:
                        ((xvr) p24Var.b).a.invoke(Float.valueOf(fIntBitsToFloat3));
                        return rih1Var;
                    default:
                        ((tb91) p24Var.b).b(fIntBitsToFloat3);
                        return rih1Var;
                }
            case 15:
                dz20 dz20Var = (dz20) obj4;
                iu30 iu30Var3 = (iu30) obj5;
                d030 d030Var = (d030) obj;
                if (!u890.j(d030Var, (d030) obj6)) {
                    if (u890.j(d030Var, dz20Var.c)) {
                        eg.m("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) iu30Var3.invoke(d030Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 16:
                jmb0 jmb0Var = (jmb0) obj6;
                vid vidVar = jmb0Var.a;
                iu30 iu30Var4 = (iu30) obj5;
                DrawScope drawScope3 = (DrawScope) obj;
                m7v m7vVar2 = jmb0Var.b;
                jmb0Var.b = (m7v) obj4;
                try {
                    wat watVarR = drawScope3.a1().r();
                    flb0 flb0VarT = drawScope3.a1().t();
                    fid fidVarP2 = drawScope3.a1().p();
                    long jU2 = drawScope3.a1().u();
                    be50 be50Var = (be50) drawScope3.a1().c;
                    wat watVarR2 = vidVar.b.r();
                    flb0 flb0VarT2 = vidVar.b.t();
                    fid fidVarP3 = vidVar.b.p();
                    long jU3 = vidVar.b.u();
                    cab cabVar = vidVar.b;
                    try {
                        be50 be50Var2 = (be50) cabVar.c;
                        cabVar.A(watVarR);
                        cabVar.C(flb0VarT);
                        cabVar.z(fidVarP2);
                        cabVar.D(jU2);
                        cabVar.c = be50Var;
                        fidVarP2.q();
                        try {
                            iu30Var4.invoke(jmb0Var);
                            fidVarP2.i();
                            cab cabVar2 = vidVar.b;
                            cabVar2.A(watVarR2);
                            cabVar2.C(flb0VarT2);
                            cabVar2.z(fidVarP3);
                            cabVar2.D(jU3);
                            cabVar2.c = be50Var2;
                            jmb0Var.b = m7vVar2;
                            return rih1Var;
                        } catch (Throwable th) {
                            m7vVar = m7vVar2;
                            try {
                                fidVarP2.i();
                                cab cabVar3 = vidVar.b;
                                cabVar3.A(watVarR2);
                                cabVar3.C(flb0VarT2);
                                cabVar3.z(fidVarP3);
                                cabVar3.D(jU3);
                                cabVar3.c = be50Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                jmb0Var.b = m7vVar;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        m7vVar = m7vVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    m7vVar = m7vVar2;
                }
                break;
            case 17:
                iac0 iac0Var2 = (iac0) obj6;
                zzh zzhVar = new zzh((k8c0) obj5, (ven0) obj4, b2);
                iac0Var2.getLifecycle().a(zzhVar);
                return new ht0(iac0Var2, zzhVar, (byte) 28);
            case 18:
                iac0 iac0Var3 = (iac0) obj6;
                final uac0 uac0Var = (uac0) obj4;
                final iu30 iu30Var5 = (iu30) obj5;
                final p811 p811Var = new p811();
                final boolean z7 = z5 ? 1 : 0;
                aac0 aac0Var = new aac0() { // from class: p.y9c0
                    public final void q(iac0 iac0Var4, k8c0 k8c0Var) {
                        byte b4 = z7;
                        iu30 iu30Var6 = iu30Var5;
                        p811 p811Var2 = p811Var;
                        zac0 zac0Var = uac0Var;
                        switch (b4) {
                            case 0:
                                uac0 uac0Var2 = (uac0) zac0Var;
                                int i2 = z9c0.a[k8c0Var.ordinal()];
                                if (i2 == 3) {
                                    p811Var2.a = iu30Var6.invoke(uac0Var2);
                                    break;
                                } else if (i2 == 4) {
                                    pac0 pac0Var = (pac0) p811Var2.a;
                                    if (pac0Var != null) {
                                        pac0Var.a();
                                    }
                                    p811Var2.a = null;
                                    break;
                                }
                                break;
                            default:
                                zac0 zac0Var2 = zac0Var;
                                int i3 = z9c0.a[k8c0Var.ordinal()];
                                if (i3 == 1) {
                                    p811Var2.a = iu30Var6.invoke(zac0Var2);
                                    break;
                                } else if (i3 == 2) {
                                    dbc0 dbc0Var = (dbc0) p811Var2.a;
                                    if (dbc0Var != null) {
                                        dbc0Var.a();
                                    }
                                    p811Var2.a = null;
                                    break;
                                }
                                break;
                        }
                    }
                };
                iac0Var3.getLifecycle().a(aac0Var);
                return new sg(iac0Var3, aac0Var, (Object) p811Var, (byte) 10);
            case 19:
                iac0 iac0Var4 = (iac0) obj6;
                final zac0 zac0Var = (zac0) obj4;
                final iu30 iu30Var6 = (iu30) obj5;
                final p811 p811Var2 = new p811();
                aac0 aac0Var2 = new aac0() { // from class: p.y9c0
                    public final void q(iac0 iac0Var5, k8c0 k8c0Var) {
                        byte b4 = b3;
                        iu30 iu30Var7 = iu30Var6;
                        p811 p811Var3 = p811Var2;
                        zac0 zac0Var2 = zac0Var;
                        switch (b4) {
                            case 0:
                                uac0 uac0Var2 = (uac0) zac0Var2;
                                int i2 = z9c0.a[k8c0Var.ordinal()];
                                if (i2 == 3) {
                                    p811Var3.a = iu30Var7.invoke(uac0Var2);
                                    break;
                                } else if (i2 == 4) {
                                    pac0 pac0Var = (pac0) p811Var3.a;
                                    if (pac0Var != null) {
                                        pac0Var.a();
                                    }
                                    p811Var3.a = null;
                                    break;
                                }
                                break;
                            default:
                                zac0 zac0Var3 = zac0Var2;
                                int i3 = z9c0.a[k8c0Var.ordinal()];
                                if (i3 == 1) {
                                    p811Var3.a = iu30Var7.invoke(zac0Var3);
                                    break;
                                } else if (i3 == 2) {
                                    dbc0 dbc0Var = (dbc0) p811Var3.a;
                                    if (dbc0Var != null) {
                                        dbc0Var.a();
                                    }
                                    p811Var3.a = null;
                                    break;
                                }
                                break;
                        }
                    }
                };
                iac0Var4.getLifecycle().a(aac0Var2);
                return new sg(iac0Var4, aac0Var2, (Object) p811Var2, (byte) 11);
            case 20:
                ymd0 ymd0Var = (ymd0) obj5;
                q1d q1dVar = new q1d((ven0) obj4, (byte) 3);
                ymd0Var.f((iac0) obj6, q1dVar);
                return new w9d0(ymd0Var, q1dVar, (byte) 1);
            case 21:
                vy71 vy71Var = (vy71) obj5;
                fn31.T((c9n) obj6, null, 0, new hyb(vy71Var, ((Float) obj).floatValue(), u7hVar, b3), 3).L(new ydm0(vy71Var, (Function0) obj4, b3));
                return rih1Var;
            case 22:
                l811 l811Var2 = (l811) obj6;
                llm llmVar = (llm) obj5;
                o8n o8nVar = (o8n) obj4;
                if (!l811Var2.a) {
                    l811Var2.a = true;
                    fn31.T(llmVar, o8nVar, 0, new mjm0(l811Var2, null, (byte) 0), 2);
                }
                return rih1Var;
            case 23:
                bvm0 bvm0Var = (bvm0) obj5;
                p811 p811Var3 = (p811) obj4;
                if (((Set) obj6).contains(obj) && (objG = bvm0Var.c.g(obj)) != null) {
                    if (objG instanceof oen0) {
                        oen0 oen0Var = (oen0) objG;
                        Object[] objArr = oen0Var.b;
                        long[] jArr = oen0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j8 = jArr[i2];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j8) < 128) {
                                            r261 r261Var = (r261) objArr[(i2 << 3) + i4];
                                            Object obj7 = p811Var3.a;
                                            if (obj7 == null) {
                                                obj3 = obj7;
                                                ArrayList arrayList = new ArrayList();
                                                p811Var3.a = arrayList;
                                                obj3 = arrayList;
                                            }
                                            obj3 = obj7;
                                            ((List) obj3).add(r261Var);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i3 == 8) {
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        r261 r261Var2 = (r261) objG;
                        Object obj8 = p811Var3.a;
                        if (obj8 == null) {
                            obj2 = obj8;
                            ArrayList arrayList2 = new ArrayList();
                            p811Var3.a = arrayList2;
                            obj2 = arrayList2;
                        }
                        obj2 = obj8;
                        ((List) obj2).add(r261Var2);
                    }
                }
                return rih1Var;
            case 24:
                vzq0 vzq0Var = (vzq0) obj5;
                nl3 nl3Var = (nl3) obj4;
                lsl lslVar = (lsl) obj;
                long j9 = ((Size) ((on5) obj6).get()).a;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 >> 32));
                if (fIntBitsToFloat4 > 0.0f) {
                    float fX0 = lslVar.X0(4.0f);
                    float fX1 = lslVar.X0(vzq0Var.b(lslVar.getLayoutDirection()));
                    float fA = nl3Var.a(jch0.U(fIntBitsToFloat4), jch0.U((Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX1) - lslVar.X0(vzq0Var.c(lslVar.getLayoutDirection()))), lslVar.getLayoutDirection()) + fX1;
                    float f9 = fIntBitsToFloat4 / 2.0f;
                    float f10 = fA + f9;
                    float f11 = (f10 - f9) - fX0;
                    float f12 = f11 < 0.0f ? 0.0f : f11;
                    float f13 = f10 + f9 + fX0;
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                    float f14 = f13 > fIntBitsToFloat5 ? fIntBitsToFloat5 : f13;
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                    float f15 = (-fIntBitsToFloat6) / 2.0f;
                    float f16 = fIntBitsToFloat6 / 2.0f;
                    cab cabVarA2 = lslVar.a1();
                    long jU4 = cabVarA2.u();
                    cabVarA2.p().q();
                    try {
                        ((dg8) cabVarA2.b).k(f12, f15, f14, f16, 0);
                        lslVar.s1();
                    } finally {
                        i3a.n(cabVarA2, jU4);
                    }
                } else {
                    lslVar.s1();
                }
                return rih1Var;
            case 25:
                return a(obj);
            case 26:
                ld41 ld41Var = (ld41) obj6;
                qd41 qd41Var = (qd41) obj4;
                nen0 nen0Var = ld41Var.b;
                if (nen0Var.b(obj5)) {
                    hhg1.f(cy30.m("Key ", obj5, " was used multiple times "));
                    return null;
                }
                ld41Var.a.remove(obj5);
                nen0Var.m(obj5, qd41Var);
                return new sg((Object) ld41Var, obj5, (Object) qd41Var, (byte) 18);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                l811 l811Var3 = (l811) obj4;
                hav0 hav0Var = (hav0) obj;
                if (((qnm0) obj6).f(hav0Var.c, (f341) obj5)) {
                    hav0Var.a();
                    l811Var3.a = true;
                }
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new iad1((jad1) obj, (wat) obj6, (iu30) obj5, (iu30) obj4);
            default:
                l811 l811Var4 = (l811) obj6;
                ze5 ze5Var2 = (ze5) obj5;
                zma1 zma1Var = (zma1) obj4;
                ze5 ze5Var3 = (ze5) obj;
                if (l811Var4.a) {
                    Object obj9 = ze5Var3.a;
                    int i5 = ze5Var3.c;
                    int i6 = ze5Var3.b;
                    if ((obj9 instanceof zma1) && i6 == ze5Var2.b && i5 == ze5Var2.c) {
                        if (zma1Var == null) {
                            zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65535);
                        }
                        ze5Var = new ze5(i6, i5, zma1Var);
                    } else {
                        ze5Var = ze5Var3;
                    }
                } else {
                    ze5Var = ze5Var3;
                }
                l811Var4.a = ze5Var2.equals(ze5Var3);
                return ze5Var;
        }
    }

    public /* synthetic */ pg(Object obj, Object obj2, ven0 ven0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = ven0Var;
    }

    public /* synthetic */ pg(Object obj, iu30 iu30Var, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = iu30Var;
    }

    public /* synthetic */ pg(xtl xtlVar, vnh1 vnh1Var, faa0 faa0Var, cu41 cu41Var) {
        this.a = (byte) 7;
        this.b = xtlVar;
        this.c = faa0Var;
        this.d = cu41Var;
    }

    public /* synthetic */ pg(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
