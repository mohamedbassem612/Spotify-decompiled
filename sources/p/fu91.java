package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fu91 extends hab0 implements iu30 {
    public final /* synthetic */ dw91 N0;
    public final /* synthetic */ float O0;
    public final /* synthetic */ u8s0 P0;
    public final /* synthetic */ tob1 Q0;
    public final /* synthetic */ o95 X;
    public final /* synthetic */ u8s0 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ o95 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ adn d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu91(o95 o95Var, boolean z, float f, adn adnVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6, o95 o95Var2, u8s0 u8s0Var, long j, dw91 dw91Var, float f2, u8s0 u8s0Var2, cb80 cb80Var) {
        super(1);
        this.a = o95Var;
        this.b = z;
        this.c = f;
        this.d = adnVar;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = ven0Var3;
        this.h = ven0Var4;
        this.i = ven0Var5;
        this.t = ven0Var6;
        this.X = o95Var2;
        this.Y = u8s0Var;
        this.Z = j;
        this.N0 = dw91Var;
        this.O0 = f2;
        this.P0 = u8s0Var2;
        this.Q0 = cb80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [float] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [long] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [long] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r46v10 */
    /* JADX WARN: Type inference failed for: r46v21 */
    /* JADX WARN: Type inference failed for: r46v4 */
    /* JADX WARN: Type inference failed for: r46v5 */
    /* JADX WARN: Type inference failed for: r46v6 */
    /* JADX WARN: Type inference failed for: r46v7 */
    /* JADX WARN: Type inference failed for: r46v8 */
    /* JADX WARN: Type inference failed for: r46v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [float] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object invoke(Object obj) throws Throwable {
        u8s0 u8s0Var;
        float f;
        float f2;
        ?? r4;
        ?? r13;
        cab cabVar;
        ?? r14;
        ?? r5;
        ?? r29;
        ?? r46;
        ?? r30;
        ?? r210;
        ?? r15;
        String str;
        DrawScope drawScope;
        long j;
        u8s0 u8s0Var2;
        long j2;
        int i;
        tob1 tob1Var;
        o95 o95Var;
        dw91 dw91Var;
        float f3;
        float f4;
        float f5;
        float f6;
        cab cabVar2;
        long j3;
        float f7;
        cab cabVar3;
        float f8;
        float f9;
        float f10;
        cab cabVar4;
        cab cabVar5;
        float f11;
        String str2;
        DrawScope drawScope2;
        float f12;
        cab cabVar6;
        fu91 fu91Var = this;
        DrawScope drawScope3 = (DrawScope) obj;
        List list = (List) fu91Var.e.getValue();
        List list2 = (List) fu91Var.f.getValue();
        float fFloatValue = ((Number) fu91Var.a.e()).floatValue();
        List list3 = (List) fu91Var.g.getValue();
        boolean z = fu91Var.b;
        tob1 tob1Var2 = fu91Var.Q0;
        o95 o95Var2 = fu91Var.X;
        dw91 dw91Var2 = fu91Var.N0;
        float f13 = fu91Var.c;
        if (z && !list3.isEmpty()) {
            List list4 = (List) fu91Var.h.getValue();
            zhd zhdVar = (zhd) fu91Var.i.getValue();
            int iIntValue = ((Number) fu91Var.t.getValue()).intValue();
            float f14 = f13 - 2.0f;
            float f15 = f14 / 2.0f;
            List list5 = list3;
            u8s0 u8s0Var3 = fu91Var.Y;
            int i2 = 0;
            long j4 = fu91Var.Z;
            Iterator it = list5.iterator();
            while (true) {
                int i3 = i2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                i2 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                avs0 avs0Var = (avs0) next;
                DrawScope drawScope4 = drawScope3;
                float f16 = fu91Var.O0;
                float f17 = f14;
                u8s0 u8s0Var4 = fu91Var.P0;
                if (i3 >= iIntValue) {
                    u8s0Var2 = u8s0Var3;
                    j2 = j4;
                    i = iIntValue;
                    tob1Var = tob1Var2;
                    o95Var = o95Var2;
                    dw91Var = dw91Var2;
                    f3 = f13;
                    f4 = f15;
                    zhdVar = zhdVar;
                    drawScope3 = drawScope4;
                    list4 = list4;
                    if (zhdVar != null) {
                        float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue() * f3;
                        zhdVar = zhdVar;
                        String str3 = zhdVar.c;
                        yk4 yk4Var = str3 != null ? (yk4) dw91Var.get(str3) : null;
                        float f18 = avs0Var.a;
                        float f19 = avs0Var.b;
                        ((dg8) drawScope3.a1().b).z(f18, f19);
                        try {
                            float f20 = avs0Var.e;
                            cab cabVarA1 = drawScope3.a1();
                            long jU = cabVarA1.u();
                            cabVarA1.p().q();
                            try {
                                ((dg8) cabVarA1.b).s(f20, 0L);
                                if (yk4Var != null) {
                                    float f21 = (-fFloatValue2) / 2.0f;
                                    bin.A(drawScope3, yk4Var, f21, f21, fFloatValue2, f16, u8s0Var4);
                                    f7 = f19;
                                    cabVar3 = cabVarA1;
                                    f8 = f18;
                                    j3 = jU;
                                } else {
                                    long jE = z4p1.e(zhdVar.e);
                                    float f22 = (-fFloatValue2) / 2.0f;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f22)) & 4294967295L) | (((long) Float.floatToRawIntBits(f22)) << 32);
                                    try {
                                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L);
                                        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f16);
                                        long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(f16)) & 4294967295L;
                                        f7 = f19;
                                        cabVar3 = cabVarA1;
                                        f8 = f18;
                                        j3 = jU;
                                        drawScope3 = drawScope3;
                                        try {
                                            DrawScope.g0(drawScope3, jE, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32), (DrawStyle) null, 0.0f, 0, 240);
                                        } catch (Throwable th) {
                                            th = th;
                                            cabVar2 = cabVar3;
                                            f6 = f8;
                                            f5 = f7;
                                            try {
                                                cabVar2.p().i();
                                                cabVar2.D(j3);
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                ((dg8) drawScope3.a1().b).z(-f6, -f5);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        drawScope3 = drawScope3;
                                        f5 = f19;
                                        cabVar2 = cabVarA1;
                                        f6 = f18;
                                        j3 = jU;
                                        cabVar2.p().i();
                                        cabVar2.D(j3);
                                        throw th;
                                    }
                                }
                                try {
                                    cabVar3.p().i();
                                    cabVar3.D(j3);
                                    ((dg8) drawScope3.a1().b).z(-f8, -f7);
                                } catch (Throwable th4) {
                                    th = th4;
                                    f6 = f8;
                                    f5 = f7;
                                    ((dg8) drawScope3.a1().b).z(-f6, -f5);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            f5 = f19;
                            f6 = f18;
                        }
                    } else {
                        continue;
                    }
                } else if (i3 == 0) {
                    float f23 = avs0Var.a;
                    float f24 = avs0Var.b;
                    ((dg8) drawScope4.a1().b).z(f23, f24);
                    try {
                        float fFloatValue3 = ((Number) o95Var2.e()).floatValue() + avs0Var.e;
                        cab cabVarA2 = drawScope4.a1();
                        i = iIntValue;
                        tob1 tob1Var3 = tob1Var2;
                        long jU2 = cabVarA2.u();
                        cabVarA2.p().q();
                        try {
                            u8s0Var2 = u8s0Var3;
                            j2 = j4;
                            ((dg8) cabVarA2.b).s(fFloatValue3, 0L);
                            o95 o95Var3 = o95Var2;
                            float f25 = f13;
                            f12 = f24;
                            float f26 = f15;
                            try {
                                DrawScope.w0(drawScope4, u8s0Var2, j2, (DrawStyle) null, 60);
                                drawScope2 = drawScope4;
                                try {
                                    cabVarA2.p().i();
                                    cabVarA2.D(jU2);
                                    ((dg8) drawScope2.a1().b).z(-f23, -f12);
                                    drawScope3 = drawScope2;
                                    dw91Var = dw91Var2;
                                    list4 = list4;
                                    o95Var = o95Var3;
                                    f3 = f25;
                                    tob1Var = tob1Var3;
                                    f4 = f26;
                                    zhdVar = zhdVar;
                                } catch (Throwable th7) {
                                    th = th7;
                                    ((dg8) drawScope2.a1().b).z(-f23, -f12);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                drawScope2 = drawScope4;
                                cabVar6 = cabVarA2;
                                cabVar6.p().i();
                                cabVar6.D(jU2);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            drawScope2 = drawScope4;
                            cabVar6 = cabVarA2;
                            f12 = f24;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        drawScope2 = drawScope4;
                        f12 = f24;
                    }
                } else {
                    u8s0Var2 = u8s0Var3;
                    j2 = j4;
                    i = iIntValue;
                    tob1Var = tob1Var2;
                    o95Var = o95Var2;
                    f3 = f13;
                    float f27 = f15;
                    int i4 = i3 - 1;
                    plv plvVar = (plv) o7h.t0(i4, list4);
                    yk4 yk4Var2 = (plvVar == null || (str2 = plvVar.b) == null) ? null : (yk4) dw91Var2.get(str2);
                    float f28 = avs0Var.a;
                    float f29 = avs0Var.b;
                    ((dg8) drawScope4.a1().b).z(f28, f29);
                    try {
                        float f30 = avs0Var.e;
                        cab cabVarA3 = drawScope4.a1();
                        dw91Var = dw91Var2;
                        long jU3 = cabVarA3.u();
                        cabVarA3.p().q();
                        try {
                            try {
                                ((dg8) cabVarA3.b).s(f30, 0L);
                                if (yk4Var2 != null) {
                                    drawScope3 = drawScope4;
                                    yk4 yk4Var3 = yk4Var2;
                                    float f31 = -f27;
                                    try {
                                        bin.A(drawScope3, yk4Var3, f31, f31, f17, f16, u8s0Var4);
                                        cabVar5 = cabVarA3;
                                        f4 = f27;
                                        f11 = f28;
                                        jU3 = jU3;
                                        try {
                                            cabVar5.p().i();
                                            cabVar5.D(jU3);
                                            ((dg8) drawScope3.a1().b).z(-f11, -f29);
                                        } catch (Throwable th11) {
                                            th = th11;
                                            f9 = f11;
                                            f10 = f29;
                                            ((dg8) drawScope3.a1().b).z(-f9, -f10);
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        f9 = f28;
                                        f10 = f29;
                                        cabVar4 = cabVarA3;
                                        cabVar4.p().i();
                                        cabVar4.D(jU3);
                                        throw th;
                                    }
                                } else {
                                    plv plvVar2 = (plv) o7h.t0(i4, list4);
                                    long jE2 = plvVar2 != null ? z4p1.e(plvVar2.a) : sbn.a;
                                    float f32 = -f27;
                                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f32)) & 4294967295L) | (((long) Float.floatToRawIntBits(f32)) << 32);
                                    try {
                                        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                        long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                                        cabVar5 = cabVarA3;
                                        f11 = f28;
                                        f4 = f27;
                                        drawScope3 = drawScope4;
                                        jU3 = jU3;
                                        try {
                                            DrawScope.g0(drawScope3, jE2, jFloatToRawIntBits5, jFloatToRawIntBits6, jFloatToRawIntBits7, (DrawStyle) null, 0.0f, 0, 240);
                                            cabVar5.p().i();
                                            cabVar5.D(jU3);
                                            ((dg8) drawScope3.a1().b).z(-f11, -f29);
                                        } catch (Throwable th13) {
                                            th = th13;
                                            f9 = f11;
                                            cabVar4 = cabVar5;
                                            f10 = f29;
                                            cabVar4.p().i();
                                            cabVar4.D(jU3);
                                            throw th;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        drawScope3 = drawScope4;
                                        f9 = f28;
                                        f10 = f29;
                                        cabVar4 = cabVarA3;
                                    }
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                drawScope3 = drawScope4;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            drawScope3 = drawScope4;
                            f9 = f28;
                            f10 = f29;
                        }
                        try {
                            cabVar4.p().i();
                            cabVar4.D(jU3);
                            throw th;
                        } catch (Throwable th17) {
                            th = th17;
                            ((dg8) drawScope3.a1().b).z(-f9, -f10);
                            throw th;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        drawScope3 = drawScope4;
                        f9 = f28;
                        f10 = f29;
                    }
                }
                list4 = list4;
                dw91Var2 = dw91Var;
                f15 = f4;
                zhdVar = zhdVar;
                f14 = f17;
                iIntValue = i;
                u8s0Var3 = u8s0Var2;
                j4 = j2;
                tob1Var2 = tob1Var;
                o95Var2 = o95Var;
                f13 = f3;
                fu91Var = this;
            }
        } else {
            int i5 = 0;
            fu91 fu91Var2 = this;
            u8s0 u8s0Var5 = fu91Var2.Y;
            long j5 = fu91Var2.Z;
            u8s0 u8s0Var6 = fu91Var2.P0;
            Iterator it2 = list2.iterator();
            ?? r16 = list2;
            while (true) {
                int i6 = i5;
                boolean zHasNext = it2.hasNext();
                adn adnVar = fu91Var2.d;
                if (!zHasNext) {
                    zhd zhdVar2 = adnVar.g;
                    if (zhdVar2 == null) {
                        break;
                    }
                    float fFloatValue4 = ((Number) tob1Var2.getValue()).floatValue() * f13;
                    float f33 = (f13 - fFloatValue4) / 2.0f;
                    hg50 hg50Var = zhdVar2.a;
                    long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits((hg50Var.b * f13) + f33)) & 4294967295L) | (((long) Float.floatToRawIntBits((hg50Var.a * f13) + f33)) << 32);
                    String str4 = zhdVar2.c;
                    yk4 yk4Var4 = str4 != null ? (yk4) dw91Var2.get(str4) : null;
                    float f34 = this.O0;
                    if (yk4Var4 == null) {
                        DrawScope.g0(drawScope3, z4p1.e(zhdVar2.e), jFloatToRawIntBits8, (((long) Float.floatToRawIntBits(fFloatValue4)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue4)) & 4294967295L), (((long) Float.floatToRawIntBits(f34)) & 4294967295L) | (((long) Float.floatToRawIntBits(f34)) << 32), (DrawStyle) null, 0.0f, 0, 240);
                        break;
                    }
                    bin.A(drawScope3, yk4Var4, Float.intBitsToFloat((int) (jFloatToRawIntBits8 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits8 & 4294967295L)), fFloatValue4, f34, this.P0);
                    break;
                }
                Object next2 = it2.next();
                i5 = i6 + 1;
                if (i6 < 0) {
                    p7h.T();
                    throw null;
                }
                mmr0 mmr0Var = (mmr0) next2;
                float fFloatValue5 = ((Number) mmr0Var.a).floatValue();
                float fFloatValue6 = ((Number) mmr0Var.b).floatValue();
                mmr0 mmr0Var2 = (mmr0) ((i6 < 0 || i6 >= list.size()) ? new mmr0(Float.valueOf(fFloatValue5), Float.valueOf(fFloatValue6)) : list.get(i6));
                float fFloatValue7 = ((Number) mmr0Var2.a).floatValue();
                float fFloatValue8 = ((Number) mmr0Var2.b).floatValue();
                float fE = l1d.e(fFloatValue5, fFloatValue7, fFloatValue, fFloatValue7);
                float fE2 = l1d.e(fFloatValue6, fFloatValue8, fFloatValue, fFloatValue8);
                if (i6 != 0) {
                    u8s0Var = u8s0Var6;
                    f = fFloatValue;
                    drawScope3 = drawScope3;
                    int i7 = i6 - 1;
                    float f35 = f13 - 2.0f;
                    float f36 = f35 / 2.0f;
                    float f37 = f13 / 2.0f;
                    float f38 = (fE * f13) + f37;
                    float f39 = (fE2 * f13) + f37;
                    mmr0 mmr0Var3 = (mmr0) r16.get(i7);
                    float fFloatValue9 = ((Number) mmr0Var3.a).floatValue() - fFloatValue5;
                    float fFloatValue10 = ((Number) mmr0Var3.b).floatValue() - fFloatValue6;
                    float f40 = 0.0f;
                    if (fFloatValue9 > 0.0f) {
                        f2 = 0.0f;
                    } else if (fFloatValue10 > 0.0f) {
                        f2 = 90.0f;
                    } else {
                        f2 = fFloatValue9 < 0.0f ? 180.0f : 270.0f;
                    }
                    if (fFloatValue7 == fFloatValue5 && fFloatValue8 == fFloatValue6) {
                        f40 = f2;
                    } else {
                        mmr0 mmr0Var4 = (mmr0) list.get(i7);
                        float fFloatValue11 = ((Number) mmr0Var4.a).floatValue() - fFloatValue7;
                        float fFloatValue12 = ((Number) mmr0Var4.b).floatValue() - fFloatValue8;
                        if (fFloatValue11 <= 0.0f) {
                            if (fFloatValue12 > 0.0f) {
                                f40 = 90.0f;
                            } else {
                                f40 = fFloatValue11 < 0.0f ? 180.0f : 270.0f;
                            }
                        }
                    }
                    float f41 = f2 - f40;
                    if (f41 > 180.0f) {
                        f41 -= 360.0f;
                    }
                    if (f41 < -180.0f) {
                        f41 += 360.0f;
                    }
                    float f42 = (f41 * f) + f40;
                    plv plvVar3 = (plv) o7h.t0(i7, adnVar.N0);
                    yk4 yk4Var5 = (plvVar3 == null || (str = plvVar3.b) == null) ? null : (yk4) dw91Var2.get(str);
                    ((dg8) drawScope3.a1().b).z(f38, f39);
                    try {
                        cab cabVarA4 = drawScope3.a1();
                        ?? r47 = f39;
                        try {
                            long jU4 = cabVarA4.u();
                            cabVarA4.p().q();
                            try {
                                ?? r211 = jU4;
                                try {
                                    ((dg8) cabVarA4.b).s(f42, 0L);
                                    drawScope3 = drawScope3;
                                    yk4 yk4Var6 = yk4Var5;
                                    float f43 = fu91Var2.O0;
                                    if (yk4Var6 != null) {
                                        float f44 = -f36;
                                        try {
                                            bin.A(drawScope3, yk4Var6, f44, f44, f35, f43, u8s0Var);
                                            r30 = r47;
                                            r211 = f38;
                                            r47 = r16;
                                            r15 = r211;
                                            r210 = r211;
                                            r46 = r47;
                                            try {
                                                cabVarA4.p().i();
                                                cabVarA4.D((long) r15);
                                                ((dg8) drawScope3.a1().b).z(-(r210 == true ? 1.0f : 0.0f), -(r30 == true ? 1.0f : 0.0f));
                                            } catch (Throwable th19) {
                                                th = th19;
                                                r13 = r210;
                                                r4 = r30;
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            r5 = r47;
                                            r29 = r211;
                                            r13 = f38;
                                            cabVar = cabVarA4;
                                            r14 = r29;
                                            r4 = r5;
                                            try {
                                                cabVar.p().i();
                                                cabVar.D((long) r14);
                                                throw th;
                                            } catch (Throwable th21) {
                                                th = th21;
                                            }
                                        }
                                    } else {
                                        plv plvVar4 = (plv) o7h.t0(i7, adnVar.N0);
                                        float f45 = -f36;
                                        try {
                                            ?? r31 = r47;
                                            float f46 = f38;
                                            r46 = r16;
                                            ?? r17 = r211;
                                            drawScope3 = drawScope3;
                                            try {
                                                DrawScope.g0(drawScope3, plvVar4 != null ? z4p1.e(plvVar4.a) : sbn.a, (((long) Float.floatToRawIntBits(f45)) & 4294967295L) | (((long) Float.floatToRawIntBits(f45)) << 32), (((long) Float.floatToRawIntBits(f35)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L), (((long) Float.floatToRawIntBits(f43)) & 4294967295L) | (((long) Float.floatToRawIntBits(f43)) << 32), (DrawStyle) null, 0.0f, 0, 240);
                                                r15 = r17;
                                                r210 = f46;
                                                r30 = r31;
                                                cabVarA4.p().i();
                                                cabVarA4.D((long) r15);
                                                ((dg8) drawScope3.a1().b).z(-(r210 == true ? 1.0f : 0.0f), -(r30 == true ? 1.0f : 0.0f));
                                            } catch (Throwable th22) {
                                                th = th22;
                                                cabVar = cabVarA4;
                                                r13 = f46 == true ? 1 : 0;
                                                r4 = r31 == true ? 1 : 0;
                                                r14 = r17;
                                                cabVar.p().i();
                                                cabVar.D((long) r14);
                                                throw th;
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            r5 = r47;
                                            drawScope3 = drawScope3;
                                            r29 = r211;
                                            r13 = f38;
                                            cabVar = cabVarA4;
                                            r14 = r29;
                                            r4 = r5;
                                            cabVar.p().i();
                                            cabVar.D((long) r14);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                    r5 = r47;
                                    drawScope3 = drawScope3;
                                    r29 = r211;
                                }
                            } catch (Throwable th25) {
                                th = th25;
                                r4 = r47;
                                drawScope3 = drawScope3;
                                cabVar = cabVarA4;
                                r14 = jU4;
                                r13 = f38;
                            }
                        } catch (Throwable th26) {
                            th = th26;
                            r4 = r47;
                            r13 = f38;
                        }
                    } catch (Throwable th27) {
                        th = th27;
                        r4 = f39;
                    }
                    ((dg8) drawScope3.a1().b).z(-r13, -r4);
                    throw th;
                }
                float f47 = fE * f13;
                float f48 = f13 / 2.0f;
                float f49 = f47 + f48;
                float f50 = (fE2 * f13) + f48;
                ((dg8) drawScope3.a1().b).z(f49, f50);
                try {
                    float fFloatValue13 = ((Number) o95Var2.e()).floatValue();
                    cab cabVarA5 = drawScope3.a1();
                    long jU5 = cabVarA5.u();
                    cabVarA5.p().q();
                    try {
                        try {
                            ((dg8) cabVarA5.b).s(fFloatValue13, 0L);
                            DrawScope drawScope5 = drawScope3;
                            u8s0Var = u8s0Var6;
                            f = fFloatValue;
                            j = jU5;
                            try {
                                DrawScope.w0(drawScope5, u8s0Var5, j5, (DrawStyle) null, 60);
                                drawScope = drawScope5;
                                try {
                                    cabVarA5.p().i();
                                    cabVarA5.D(j);
                                    ((dg8) drawScope.a1().b).z(-f49, -f50);
                                    drawScope3 = drawScope;
                                    list = list;
                                    r46 = r16;
                                } catch (Throwable th28) {
                                    th = th28;
                                    ((dg8) drawScope.a1().b).z(-f49, -f50);
                                    throw th;
                                }
                            } catch (Throwable th29) {
                                th = th29;
                                drawScope = drawScope5;
                                cabVarA5.p().i();
                                cabVarA5.D(j);
                                throw th;
                            }
                        } catch (Throwable th30) {
                            th = th30;
                            drawScope = drawScope3;
                            j = jU5;
                        }
                    } catch (Throwable th31) {
                        th = th31;
                        drawScope = drawScope3;
                        j = jU5;
                    }
                } catch (Throwable th32) {
                    th = th32;
                    drawScope = drawScope3;
                }
                fu91Var2 = this;
                r16 = r46;
                u8s0Var5 = u8s0Var5;
                fFloatValue = f;
                u8s0Var6 = u8s0Var;
                j5 = j5;
                list = list;
            }
        }
        return rih1.a;
    }
}
