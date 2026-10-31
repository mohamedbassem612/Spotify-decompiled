package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qdl1 extends hab0 implements iu30 {
    public final /* synthetic */ drr0 X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ lel1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xge1 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ res0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdl1(lel1 lel1Var, int i, float f, xge1 xge1Var, List list, float f2, int i2, res0 res0Var, float f3, iu30 iu30Var, drr0 drr0Var, tob1 tob1Var, tob1 tob1Var2) {
        super(1);
        this.a = lel1Var;
        this.b = i;
        this.c = f;
        this.d = xge1Var;
        this.e = list;
        this.f = f2;
        this.g = i2;
        this.h = res0Var;
        this.i = f3;
        this.t = iu30Var;
        this.X = drr0Var;
        this.Y = tob1Var;
        this.Z = tob1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    public final Object invoke(Object obj) {
        float f;
        qkk1 qkk1Var;
        float f2;
        tob1 tob1Var;
        List list;
        byte b;
        ArrayList arrayList;
        Object next;
        List list2;
        int i;
        int i2;
        float fX0;
        float fIntBitsToFloat;
        float f3;
        DrawScope drawScope = (DrawScope) obj;
        float fS = this.X.s();
        lel1 lel1Var = this.a;
        boolean zA = lel1Var.a();
        float f4 = lel1Var.i;
        float f5 = lel1Var.g;
        if (zA) {
            f = (fS / lel1Var.b) * f5;
            if (Math.abs(f) > Float.MAX_VALUE) {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        float f6 = f + lel1Var.e;
        int i3 = (int) (f6 / f5);
        if (f6 >= 0.0f) {
            f6 %= f5;
        }
        float f7 = -f6;
        float f8 = lel1Var.a;
        int i4 = i3 < 0 ? 0 : i3;
        int i5 = this.b;
        if (f5 <= 0.0f || f8 <= 0.0f) {
            qkk1Var = new qkk1(i4 > i5 ? i5 : i4, i4 > i5 ? i5 : i4, i4, i4, f7);
        } else {
            float f9 = this.c;
            int iFloor = ((int) Math.floor((f9 - f7) / f5)) - 1;
            if (iFloor < 0) {
                iFloor = 0;
            }
            int i6 = i4 + iFloor;
            float f10 = (iFloor * f5) + f7;
            int iCeil = ((int) Math.ceil(((f9 + f8) - f10) / f5)) + 1;
            if (iCeil < 0) {
                iCeil = 0;
            }
            int i7 = iCeil + i6;
            qkk1Var = new qkk1(yoi1.p(i6, 0, i5), yoi1.p(i7, 0, i5), i6, i7, f10);
        }
        float f11 = this.f;
        tob1 tob1Var2 = this.Y;
        List listSubList = z6x.a;
        int i8 = qkk1Var.b;
        int i9 = qkk1Var.a;
        float f12 = qkk1Var.e;
        xge1 xge1Var = this.d;
        if (xge1Var == null) {
            int i10 = 0;
            res0 res0Var = this.h;
            List list3 = res0Var != null ? res0Var.a : null;
            if (list3 == null) {
                list3 = listSubList;
            }
            if (i9 < i8) {
                listSubList = list3.subList(i9, i8);
            }
            List list4 = listSubList;
            long j = ((u7h) tob1Var2.getValue()).a;
            float fX1 = drawScope.X0(this.i);
            int i11 = sdl1.b;
            if (f11 > 0.0f) {
                int i12 = 0;
                for (Object obj2 : list4) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        p7h.T();
                        throw null;
                    }
                    if (((qes0) obj2).c) {
                        DrawScope.d0(drawScope, j, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f4) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((i12 * (i12 == 0 ? 0.0f : f5)) + f12) - (fX1 / 2.0f))) << 32), (((long) Float.floatToRawIntBits(fX1)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
                    }
                    i12 = i13;
                }
            }
            Iterator it = list4.iterator();
            while (true) {
                int i14 = i10;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                i10 = i14 + 1;
                if (i14 < 0) {
                    p7h.T();
                    throw null;
                }
                if (((qes0) next2).b > 0.0f) {
                    float f13 = ((i14 * (i14 == 0 ? 0.0f : f5)) + f12) - (fX1 / 2.0f);
                    float fX2 = drawScope.X0(4.0f);
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX2) / 2.0f;
                    float fX3 = drawScope.X0(3.0f);
                    DrawScope.g0(drawScope, z4p1.g(4290427578L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32), (((long) Float.floatToRawIntBits(drawScope.X0(3.0f))) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L), (((long) Float.floatToRawIntBits(fX3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fX3)) << 32), (DrawStyle) null, 0.0f, 0, 240);
                }
            }
        } else {
            ArrayList arrayList2 = xge1Var.a;
            if (i9 < i8) {
                listSubList = arrayList2.subList(i9, i8);
            }
            List list5 = listSubList;
            List list6 = this.e;
            int i15 = 0;
            qkk1 qkk1Var2 = qkk1Var;
            if (list6.isEmpty()) {
                int i16 = sdl1.b;
                int size = list5.size();
                if (size == 0 || Math.abs(f4) > Float.MAX_VALUE || f4 < 1.0f) {
                    f2 = f11;
                    tob1Var = tob1Var2;
                    list = list5;
                    b = 1;
                } else {
                    float[] fArr = new float[size];
                    long j2 = tdl1.a;
                    int i17 = 0;
                    while (i17 < size) {
                        fArr[i17] = yoi1.o(((float) Math.pow(((wge1) list5.get(i17)).a, 0.550000011920929d)) * f4, 1.0f, f4);
                        i17++;
                        list5 = list5;
                    }
                    List list7 = list5;
                    tw4 tw4VarA = ww4.a();
                    float f14 = (0.0f * f5) + f12;
                    tw4VarA.k(f14, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr[0]) / 2.0f);
                    for (int i18 = 1; i18 < size; i18++) {
                        tw4VarA.j((i18 * f5) + f12, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr[i18]) / 2.0f);
                    }
                    int i19 = size - 1;
                    int i20 = i19;
                    for (int i21 = -1; i21 < i20; i21 = -1) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                        float f15 = fArr[i20];
                        tw4VarA.j((i20 * f5) + f12, ((fIntBitsToFloat3 - f15) / 2.0f) + f15);
                        i20--;
                    }
                    tw4VarA.g();
                    int i22 = size;
                    byte b2 = 1;
                    DrawScope.w0(drawScope, tw4VarA, j2, (DrawStyle) null, 60);
                    long j3 = tdl1.b;
                    int i23 = 0;
                    while (i23 < i22) {
                        fArr[i23] = yoi1.o(((float) Math.pow(((wge1) list7.get(i23)).b, 0.800000011920929d)) * f4, 1.0f, f4);
                        i23++;
                        b2 = b2;
                        i22 = i22;
                    }
                    b = b2;
                    int i24 = i22;
                    tw4 tw4VarA2 = ww4.a();
                    tw4VarA2.k(f14, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr[0]) / 2.0f);
                    int i25 = b;
                    while (i25 < i24) {
                        tw4VarA2.j((i25 * f5) + f12, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr[i25]) / 2.0f);
                        i25++;
                        j3 = j3;
                    }
                    long j4 = j3;
                    for (int i26 = i19; -1 < i26; i26--) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                        float f16 = fArr[i26];
                        tw4VarA2.j((i26 * f5) + f12, ((fIntBitsToFloat4 - f16) / 2.0f) + f16);
                    }
                    tw4VarA2.g();
                    f2 = f11;
                    tob1Var = tob1Var2;
                    list = list7;
                    DrawScope.w0(drawScope, tw4VarA2, j4, (DrawStyle) null, 60);
                    long j5 = sdl1.a;
                    int i27 = 0;
                    while (i27 < i24) {
                        int i28 = i27;
                        fArr[i28] = yoi1.o(Math.min((float) Math.pow(((wge1) list.get(i27)).a, 0.550000011920929d), (float) Math.pow(((wge1) list.get(i27)).b, 0.800000011920929d)) * f4, 1.0f, f4);
                        i27 = i28 + 1;
                        drawScope = drawScope;
                    }
                    DrawScope drawScope2 = drawScope;
                    tw4 tw4VarA3 = ww4.a();
                    tw4VarA3.k(f14, (Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) - fArr[0]) / 2.0f);
                    for (int i29 = b; i29 < i24; i29++) {
                        tw4VarA3.j((i29 * f5) + f12, (Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) - fArr[i29]) / 2.0f);
                    }
                    for (int i30 = i19; -1 < i30; i30--) {
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L));
                        float f17 = fArr[i30];
                        tw4VarA3.j((i30 * f5) + f12, ((fIntBitsToFloat5 - f17) / 2.0f) + f17);
                    }
                    tw4VarA3.g();
                    drawScope = drawScope2;
                    DrawScope.w0(drawScope, tw4VarA3, j5, (DrawStyle) null, 60);
                    long j6 = tdl1.c;
                    for (int i31 = 0; i31 < i24; i31++) {
                        fArr[i31] = yoi1.o(((float) Math.pow(((wge1) list.get(i31)).c, 1.7999999523162842d)) * f4, 1.0f, f4);
                    }
                    tw4 tw4VarA4 = ww4.a();
                    tw4VarA4.k(f14, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr[0]) / 2.0f);
                    for (int i32 = b; i32 < i24; i32++) {
                        tw4VarA4.j((i32 * f5) + f12, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr[i32]) / 2.0f);
                    }
                    while (-1 < i19) {
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                        float f18 = fArr[i19];
                        tw4VarA4.j((i19 * f5) + f12, ((fIntBitsToFloat6 - f18) / 2.0f) + f18);
                        i19--;
                    }
                    tw4VarA4.g();
                    DrawScope.w0(drawScope, tw4VarA4, j6, (DrawStyle) null, 60);
                }
            } else {
                f2 = f11;
                tob1Var = tob1Var2;
                list = list5;
                b = 1;
                if (list6.isEmpty()) {
                    List list8 = list;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list8, 10));
                    int i33 = 0;
                    for (Object obj3 : list8) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            p7h.T();
                            throw null;
                        }
                        wge1 wge1Var = (wge1) obj3;
                        arrayList3.add(new kel1((i33 * f5) + f12, wge1Var.a, wge1Var.b, wge1Var.c));
                        i33 = i34;
                    }
                    arrayList = arrayList3;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = list.size();
                    int i35 = qkk1Var2.c;
                    int i36 = (size2 + i35) - 1;
                    List list9 = list6;
                    Iterator it2 = list9.iterator();
                    if (!it2.hasNext()) {
                        hhg1.k();
                        return null;
                    }
                    int i37 = ((rr80) ((i7f0) it2.next()).a).b;
                    while (it2.hasNext()) {
                        int i38 = ((rr80) ((i7f0) it2.next()).a).b;
                        if (i37 < i38) {
                            i37 = i38;
                        }
                    }
                    int iMin = Math.min(Math.max(i36, i37), qkk1Var2.d - 1);
                    int i39 = 0;
                    while (true) {
                        int i40 = i35 + i39;
                        if (i40 > iMin) {
                            break;
                        }
                        Iterator it3 = list9.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            tr80 tr80Var = ((i7f0) next).a;
                            int i41 = ((rr80) tr80Var).a;
                            if (i40 <= ((rr80) tr80Var).b && i41 <= i40) {
                                break;
                            }
                        }
                        i7f0 i7f0Var = (i7f0) next;
                        if (i7f0Var != null) {
                            tr80 tr80Var2 = i7f0Var.a;
                            h7f0 h7f0Var = i7f0Var.b;
                            float f19 = h7f0Var.e;
                            float[] fArr2 = h7f0Var.c;
                            float[] fArr3 = h7f0Var.b;
                            float[] fArr4 = h7f0Var.a;
                            int i42 = ((rr80) tr80Var2).b;
                            int i43 = ((rr80) tr80Var2).a;
                            int iMin2 = Math.min(i42, iMin);
                            float f20 = i43 - i35;
                            float f21 = iMin2 - i43;
                            float f22 = i40 - i43;
                            while (f22 <= f21) {
                                int iA = h7f0Var.a(f22);
                                arrayList4.add(new kel1(((f20 + f22) * f5) + f12, fArr4[iA], fArr3[iA], fArr2[iA]));
                                f22 += f19;
                                list9 = list9;
                                iMin = iMin;
                                i35 = i35;
                            }
                            list2 = list9;
                            i = iMin;
                            i2 = i35;
                            int i44 = iMin2 - i2;
                            float f23 = i44;
                            if (f23 - ((f20 + f22) - f19) > 0.5f) {
                                int iA2 = h7f0Var.a(f21);
                                arrayList4.add(new kel1((f23 * f5) + f12, fArr4[iA2], fArr3[iA2], fArr2[iA2]));
                            }
                            i39 = i44 + 1;
                        } else {
                            list2 = list9;
                            i = iMin;
                            i2 = i35;
                            if (i39 < list.size()) {
                                wge1 wge1Var2 = (wge1) list.get(i39);
                                arrayList4.add(new kel1((i39 * f5) + f12, wge1Var2.a, wge1Var2.b, wge1Var2.c));
                            }
                            i39++;
                        }
                        drawScope = drawScope;
                        list9 = list2;
                        iMin = i;
                        i35 = i2;
                    }
                    arrayList = arrayList4;
                }
                DrawScope drawScope3 = drawScope;
                int i45 = sdl1.b;
                int size3 = arrayList.size();
                if (size3 == 0 || Math.abs(f4) > Float.MAX_VALUE || f4 < 1.0f) {
                    drawScope = drawScope3;
                } else {
                    float[] fArr5 = new float[size3];
                    long j7 = tdl1.a;
                    for (int i46 = 0; i46 < size3; i46++) {
                        fArr5[i46] = yoi1.o(((float) Math.pow(((kel1) arrayList.get(i46)).b, 0.550000011920929d)) * f4, 1.0f, f4);
                    }
                    tw4 tw4VarA5 = ww4.a();
                    tw4VarA5.k(((kel1) arrayList.get(0)).a, (Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) - fArr5[0]) / 2.0f);
                    for (int i47 = 1; i47 < size3; i47++) {
                        tw4VarA5.j(((kel1) arrayList.get(i47)).a, (Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) - fArr5[i47]) / 2.0f);
                    }
                    int i48 = size3 - 1;
                    for (int i49 = i48; -1 < i49; i49--) {
                        tw4VarA5.j(((kel1) arrayList.get(i49)).a, ((Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) - fArr5[i49]) / 2.0f) + fArr5[i49]);
                    }
                    tw4VarA5.g();
                    DrawScope drawScope4 = drawScope3;
                    DrawScope.w0(drawScope4, tw4VarA5, j7, (DrawStyle) null, 60);
                    long j8 = tdl1.b;
                    for (int i50 = 0; i50 < size3; i50++) {
                        fArr5[i50] = yoi1.o(((float) Math.pow(((kel1) arrayList.get(i50)).c, 0.800000011920929d)) * f4, 1.0f, f4);
                    }
                    tw4 tw4VarA6 = ww4.a();
                    tw4VarA6.k(((kel1) arrayList.get(0)).a, (Float.intBitsToFloat((int) (drawScope4.j() & 4294967295L)) - fArr5[0]) / 2.0f);
                    for (int i51 = 1; i51 < size3; i51++) {
                        tw4VarA6.j(((kel1) arrayList.get(i51)).a, (Float.intBitsToFloat((int) (drawScope4.j() & 4294967295L)) - fArr5[i51]) / 2.0f);
                    }
                    for (int i52 = i48; -1 < i52; i52--) {
                        tw4VarA6.j(((kel1) arrayList.get(i52)).a, ((Float.intBitsToFloat((int) (drawScope4.j() & 4294967295L)) - fArr5[i52]) / 2.0f) + fArr5[i52]);
                    }
                    tw4VarA6.g();
                    DrawScope.w0(drawScope4, tw4VarA6, j8, (DrawStyle) null, 60);
                    long j9 = sdl1.a;
                    int i53 = 0;
                    while (i53 < size3) {
                        int i54 = i53;
                        fArr5[i54] = yoi1.o(Math.min((float) Math.pow(((kel1) arrayList.get(i53)).b, 0.550000011920929d), (float) Math.pow(((kel1) arrayList.get(i53)).c, 0.800000011920929d)) * f4, 1.0f, f4);
                        i53 = i54 + 1;
                        drawScope4 = drawScope4;
                    }
                    DrawScope drawScope5 = drawScope4;
                    tw4 tw4VarA7 = ww4.a();
                    tw4VarA7.k(((kel1) arrayList.get(0)).a, (Float.intBitsToFloat((int) (drawScope5.j() & 4294967295L)) - fArr5[0]) / 2.0f);
                    for (int i55 = 1; i55 < size3; i55++) {
                        tw4VarA7.j(((kel1) arrayList.get(i55)).a, (Float.intBitsToFloat((int) (drawScope5.j() & 4294967295L)) - fArr5[i55]) / 2.0f);
                    }
                    for (int i56 = i48; -1 < i56; i56--) {
                        tw4VarA7.j(((kel1) arrayList.get(i56)).a, ((Float.intBitsToFloat((int) (drawScope5.j() & 4294967295L)) - fArr5[i56]) / 2.0f) + fArr5[i56]);
                    }
                    tw4VarA7.g();
                    drawScope = drawScope5;
                    DrawScope.w0(drawScope, tw4VarA7, j9, (DrawStyle) null, 60);
                    long j10 = tdl1.c;
                    for (int i57 = 0; i57 < size3; i57++) {
                        fArr5[i57] = yoi1.o(((float) Math.pow(((kel1) arrayList.get(i57)).d, 1.7999999523162842d)) * f4, 1.0f, f4);
                    }
                    tw4 tw4VarA8 = ww4.a();
                    i15 = 0;
                    tw4VarA8.k(((kel1) arrayList.get(0)).a, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr5[0]) / 2.0f);
                    for (int i58 = 1; i58 < size3; i58++) {
                        tw4VarA8.j(((kel1) arrayList.get(i58)).a, (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr5[i58]) / 2.0f);
                    }
                    while (-1 < i48) {
                        tw4VarA8.j(((kel1) arrayList.get(i48)).a, ((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fArr5[i48]) / 2.0f) + fArr5[i48]);
                        i48--;
                    }
                    tw4VarA8.g();
                    DrawScope.w0(drawScope, tw4VarA8, j10, (DrawStyle) null, 60);
                }
            }
            long j11 = ((u7h) tob1Var.getValue()).a;
            long j12 = ((u7h) this.Z.getValue()).a;
            int i59 = sdl1.b;
            int size4 = list.size();
            uiv uivVar = new uiv(list, b);
            bic1 bic1Var = new bic1(list, (byte) 10);
            if (f2 > 0.0f) {
                float fX4 = drawScope.X0(1.0f);
                float fX5 = drawScope.X0(2.0f);
                int i60 = this.g;
                int iC = l1d.C(i60);
                if (iC == 0 || iC == 1) {
                    fX0 = drawScope.X0(8.0f);
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    fX0 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                }
                float f24 = fX0;
                int iC2 = l1d.C(i60);
                if (iC2 == 0) {
                    fIntBitsToFloat = 0.0f;
                } else if (iC2 != 1) {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    fIntBitsToFloat = 0.0f;
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f24;
                }
                int i61 = i15;
                while (i61 < size4) {
                    float f25 = i61 == 0 ? 0.0f : f5;
                    if (((Boolean) uivVar.invoke(Integer.valueOf(i61))).booleanValue()) {
                        boolean zBooleanValue = ((Boolean) bic1Var.invoke(Integer.valueOf(i61))).booleanValue();
                        float f26 = zBooleanValue ? fX5 : fX4;
                        float f27 = ((i61 * f25) + f12) - (f26 / 2.0f);
                        if (zBooleanValue) {
                            j12 = j11;
                        }
                        f3 = f12;
                        drawScope = drawScope;
                        DrawScope.d0(drawScope, j12, (((long) Float.floatToRawIntBits(f27)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(f24)) & 4294967295L) | (((long) Float.floatToRawIntBits(f26)) << 32), 0.0f, (phc1) null, (ColorFilter) null, 120);
                    } else {
                        f3 = f12;
                    }
                    i61++;
                    uivVar = uivVar;
                    bic1Var = bic1Var;
                    f12 = f3;
                    j12 = j12;
                }
            }
        }
        iu30 iu30Var = this.t;
        if (iu30Var != null) {
            iu30Var.invoke(drawScope);
        }
        return rih1.a;
    }
}
