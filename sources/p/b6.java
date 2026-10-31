package p;

import android.graphics.Typeface;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class b6 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b6(boolean z, String str, String str2, String str3, uku ukuVar, k6a1 k6a1Var) {
        this.a = (byte) 20;
        this.b = ukuVar;
        this.c = k6a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:119:0x02db  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:127:0x0304  */
    /* JADX WARN: Code duplicated, block: B:132:0x031b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0323  */
    /* JADX WARN: Code duplicated, block: B:135:0x0325  */
    /* JADX WARN: Code duplicated, block: B:137:0x032d  */
    /* JADX WARN: Code duplicated, block: B:138:0x032f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0335  */
    /* JADX WARN: Code duplicated, block: B:141:0x0337  */
    /* JADX WARN: Code duplicated, block: B:143:0x033f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0348  */
    /* JADX WARN: Code duplicated, block: B:151:0x035a  */
    /* JADX WARN: Code duplicated, block: B:153:0x036b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0506  */
    /* JADX WARN: Code duplicated, block: B:251:0x0508  */
    /* JADX WARN: Code duplicated, block: B:391:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01db  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0250  */
    /* JADX WARN: Code duplicated, block: B:91:0x0262  */
    /* JADX WARN: Code duplicated, block: B:93:0x0273  */
    public final Object invoke(Object obj) {
        int i;
        mmr0 mmr0Var;
        d2h1 d2h1Var;
        Object objInvoke;
        gj7 gj7Var;
        Object m231Var;
        int size;
        int i2;
        FontWeight fontWeight;
        int size2;
        int i3;
        FontWeight fontWeight2;
        FontWeight fontWeight3;
        int size3;
        int i4;
        Object obj2;
        FontWeight weight;
        int i5;
        Object obj3;
        int size4;
        int i6;
        Object obj4;
        int size5;
        int i7;
        Object obj5;
        Typeface typefaceB;
        e2h1 e2h1Var;
        int i8 = 0;
        switch (this.a) {
            case 0:
                ((idn0) this.b).a((q9w0) this.c);
                return rih1.a;
            case 1:
                b9d0 b9d0Var = (b9d0) this.b;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.c;
                if (((k8c0) obj) == k8c0.ON_RESUME) {
                    b9d0Var.e(accessibilityManager);
                }
                return rih1.a;
            case 2:
                a24 a24Var = (a24) this.b;
                o24 o24Var = (o24) this.c;
                long jH = Offset.h(a24Var.d2() ? -1.0f : 1.0f, ((l4v) obj).a);
                o24Var.a(a24Var.j1.e(Float.intBitsToFloat((int) (((m5v) a24Var).Q0 == qqq0.a ? jH & 4294967295L : jH >> 32))), 0.0f);
                return rih1.a;
            case 3:
                return new pj80((qdt0) this.b, new hx4((jx4) this.c, (byte) 0));
            case 4:
                ifv0 ifv0Var = (ifv0) this.b;
                ifv0Var.setPositionProvider((mfv0) this.c);
                ifv0Var.D();
                return new tj4((byte) 1);
            case 5:
                ((hmb0) this.b).e0(((qim0) obj).then((qim0) this.c));
                return rih1.a;
            case 6:
                pc9 pc9Var = (pc9) this.b;
                qc9 qc9Var = (qc9) this.c;
                rih1 rih1Var = rih1.a;
                bhe1 bhe1Var = pc9Var.O0;
                if (bhe1Var != null) {
                    bhe1Var.b();
                }
                pc9Var.O0 = null;
                ayh ayhVar = qc9Var.b;
                if (ayhVar != null) {
                    ayhVar.m0(rih1Var);
                }
                qc9Var.b = null;
                return rih1Var;
            case 7:
                c8e1 c8e1Var = (c8e1) this.b;
                iu30 iu30Var = (iu30) this.c;
                c8e1 c8e1Var2 = (c8e1) obj;
                if (!u890.j(c8e1Var, c8e1Var2)) {
                    iu30Var.invoke(c8e1Var2);
                }
                return rih1.a;
            case 8:
                fn31.T((c9n) this.b, null, 0, new w7a((wz20) obj, (w5f1) this.c, (lnm) null, (byte) 4), 3);
                return rih1.a;
            case 9:
                p5t0.u((p5t0) obj, (q5t0) this.b, 0, 0, ((n6b) this.c).O0, 4);
                return rih1.a;
            case 10:
                ne neVar = (ne) this.b;
                Brush brush = (Brush) this.c;
                DrawScope drawScope = (DrawScope) obj;
                Function0 function0 = (Function0) neVar.b;
                function0.getClass();
                float f = ((p3v) function0.invoke()).a;
                float fMin = Math.min(p3v.c(f, 0.0f) ? 1.0f : (float) Math.ceil(drawScope.X0(f)), (float) Math.ceil(hrt.f(drawScope, 2.0f)));
                float f2 = fMin < 0.0f ? 0.0f : fMin;
                float f3 = f2 / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f2)));
                boolean z = 2.0f * f2 > Size.e(drawScope.j());
                if (z) {
                    jFloatToRawIntBits = 0;
                }
                long j = jFloatToRawIntBits;
                if (z) {
                    jFloatToRawIntBits2 = drawScope.j();
                }
                DrawScope.S0(drawScope, brush, j, jFloatToRawIntBits2, 0.0f, z ? z520.a : new phc1(f2, 0.0f, 0, 0, null, 30), (ColorFilter) null, 0, 104);
                return rih1.a;
            case 11:
                tw4 tw4Var = (tw4) this.b;
                Brush brush2 = (Brush) this.c;
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.j1(lslVar, tw4Var, brush2, 0.0f, (DrawStyle) null, 60);
                return rih1.a;
            case 12:
                htq0 htq0Var = (htq0) this.b;
                Brush brush3 = (Brush) this.c;
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                DrawScope.j1(lslVar2, htq0Var.c, brush3, 0.0f, (DrawStyle) null, 60);
                return rih1.a;
            case 13:
                fn31.T((c9n) this.b, null, 0, new hyb((vy71) this.c, ((Float) obj).floatValue(), null, (byte) 0), 3);
                return rih1.a;
            case 14:
                ((bfn0) ((ps7) this.b).b).k((wtl) this.c);
                return rih1.a;
            case 15:
                ((wug) this.b).b.D((y341) obj, (nvg) this.c);
                return rih1.a;
            case 16:
                r1c0 r1c0Var = (r1c0) this.b;
                Brush brush4 = (Brush) this.c;
                lsl lslVar3 = (lsl) obj;
                lslVar3.s1();
                if (((Boolean) r1c0Var.s.getValue()).booleanValue() || ((Boolean) r1c0Var.t.getValue()).booleanValue()) {
                    DrawScope.S0(lslVar3, brush4, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                }
                return rih1.a;
            case 17:
                ((yct) this.b).b.D((y341) obj, (vct) this.c);
                return rih1.a;
            case 18:
                w7d1 w7d1Var = (w7d1) this.b;
                f5e1 f5e1Var = (f5e1) this.c;
                if (((Boolean) w7d1Var.invoke((x3v) obj)).booleanValue()) {
                    return f5e1Var;
                }
                return null;
            case 19:
                b5x b5xVar = (b5x) this.b;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) this.c;
                int iIntValue = ((Integer) obj).intValue();
                h46 h46Var = b5xVar.i;
                if (h46Var == null) {
                    u890.C("emojiPickerItems");
                    throw null;
                }
                int iB = h46Var.b(iIntValue);
                h46 h46Var2 = b5xVar.i;
                if (h46Var2 == null) {
                    u890.C("emojiPickerItems");
                    throw null;
                }
                lj90 lj90Var = b5xVar.h;
                if (lj90Var == null) {
                    u890.C("recentItemGroup");
                    throw null;
                }
                if (iB == ((rr80) h46Var2.d(lj90Var)).a) {
                    i = 0;
                    fn31.T(b5xVar.d, null, 0, new y4x(b5xVar, null, (byte) 2), 3);
                } else {
                    i = 0;
                }
                gridLayoutManager.w1(iB, i);
                b5xVar.invalidate();
                return rih1.a;
            case 20:
                uku ukuVar = (uku) this.b;
                k6a1 k6a1Var = (k6a1) this.c;
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 6);
                b261.g(e261Var, (String) null, new hxl1(ukuVar, k6a1Var));
                return rih1.a;
            case 21:
                return new k6r(new qt00((View) this.b, (Function0) this.c), (byte) 11);
            case 22:
                ((idn0) this.b).a((ty20) this.c);
                return rih1.a;
            case 23:
                g930 g930Var = (g930) this.b;
                c2h1 c2h1Var = (c2h1) this.c;
                iu30 iu30Var2 = (iu30) obj;
                j930 j930Var = g930Var.d;
                w741 w741Var = g930Var.a;
                gv20 gv20Var = g930Var.f;
                i930 i930Var = c2h1Var.a;
                if (i930Var instanceof i930) {
                    v62 v62Var = j930.c;
                    List list = i930Var.f;
                    FontWeight fontWeight4 = c2h1Var.b;
                    int i9 = c2h1Var.c;
                    ArrayList arrayList = new ArrayList(list.size());
                    List list2 = list;
                    int size6 = list2.size();
                    while (i8 < size6) {
                        Object obj6 = list.get(i8);
                        a930 a930Var = (a930) obj6;
                        if (u890.j(a930Var.getWeight(), fontWeight4) && a930Var.b() == i9) {
                            arrayList.add(obj6);
                        }
                        i8++;
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size7 = list2.size();
                        for (int i10 = 0; i10 < size7; i10++) {
                            Object obj7 = list.get(i10);
                            if (((a930) obj7).b() == i9) {
                                arrayList2.add(obj7);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        List list3 = list;
                        int iA = fontWeight4.a(FontWeight.b);
                        int i11 = fontWeight4.a;
                        if (iA < 0) {
                            List list4 = list3;
                            int size8 = list4.size();
                            FontWeight fontWeight5 = null;
                            FontWeight fontWeight6 = null;
                            for (int i12 = 0; i12 < size8; i12++) {
                                FontWeight weight2 = ((a930) list3.get(i12)).getWeight();
                                int i13 = weight2.a;
                                if (u890.q(i13, i11) < 0) {
                                    if (fontWeight5 == null || u890.q(i13, fontWeight5.a) > 0) {
                                        fontWeight5 = weight2;
                                    }
                                } else if (u890.q(i13, i11) <= 0) {
                                    fontWeight5 = weight2;
                                    fontWeight6 = fontWeight5;
                                    if (fontWeight5 == null) {
                                        fontWeight5 = fontWeight6;
                                    }
                                    arrayList = new ArrayList(list3.size());
                                    size5 = list4.size();
                                    for (i7 = 0; i7 < size5; i7++) {
                                        obj5 = list3.get(i7);
                                        if (u890.j(((a930) obj5).getWeight(), fontWeight5)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                } else if (fontWeight6 == null || u890.q(i13, fontWeight6.a) < 0) {
                                    fontWeight6 = weight2;
                                }
                            }
                            if (fontWeight5 == null) {
                                fontWeight5 = fontWeight6;
                            }
                            arrayList = new ArrayList(list3.size());
                            size5 = list4.size();
                            while (i7 < size5) {
                                obj5 = list3.get(i7);
                                if (u890.j(((a930) obj5).getWeight(), fontWeight5)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            FontWeight fontWeight7 = FontWeight.c;
                            if (fontWeight4.a(fontWeight7) > 0) {
                                List list5 = list3;
                                int size9 = list5.size();
                                FontWeight fontWeight8 = null;
                                FontWeight fontWeight9 = null;
                                for (int i14 = 0; i14 < size9; i14++) {
                                    FontWeight weight3 = ((a930) list3.get(i14)).getWeight();
                                    int i15 = weight3.a;
                                    if (u890.q(i15, i11) < 0) {
                                        if (fontWeight8 == null || u890.q(i15, fontWeight8.a) > 0) {
                                            fontWeight8 = weight3;
                                        }
                                    } else if (u890.q(i15, i11) <= 0) {
                                        fontWeight8 = weight3;
                                        fontWeight9 = fontWeight8;
                                        if (fontWeight9 != null) {
                                            fontWeight8 = fontWeight9;
                                        }
                                        arrayList = new ArrayList(list3.size());
                                        size4 = list5.size();
                                        for (i6 = 0; i6 < size4; i6++) {
                                            obj4 = list3.get(i6);
                                            if (u890.j(((a930) obj4).getWeight(), fontWeight8)) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    } else if (fontWeight9 == null || u890.q(i15, fontWeight9.a) < 0) {
                                        fontWeight9 = weight3;
                                    }
                                }
                                if (fontWeight9 != null) {
                                    fontWeight8 = fontWeight9;
                                }
                                arrayList = new ArrayList(list3.size());
                                size4 = list5.size();
                                while (i6 < size4) {
                                    obj4 = list3.get(i6);
                                    if (u890.j(((a930) obj4).getWeight(), fontWeight8)) {
                                        arrayList.add(obj4);
                                    }
                                }
                            } else {
                                List list6 = list3;
                                int size10 = list6.size();
                                FontWeight fontWeight10 = null;
                                FontWeight fontWeight11 = null;
                                for (int i16 = 0; i16 < size10; i16++) {
                                    FontWeight weight4 = ((a930) list3.get(i16)).getWeight();
                                    if (u890.q(weight4.a, fontWeight7.a) <= 0) {
                                        int i17 = weight4.a;
                                        if (u890.q(i17, i11) < 0) {
                                            if (fontWeight10 == null || u890.q(i17, fontWeight10.a) > 0) {
                                                fontWeight10 = weight4;
                                            }
                                        } else if (u890.q(i17, i11) <= 0) {
                                            fontWeight10 = weight4;
                                            fontWeight11 = fontWeight10;
                                            if (fontWeight11 != null) {
                                                fontWeight10 = fontWeight11;
                                            }
                                            arrayList = new ArrayList(list3.size());
                                            size = list6.size();
                                            for (i2 = 0; i2 < size; i2++) {
                                                obj3 = list3.get(i2);
                                                if (u890.j(((a930) obj3).getWeight(), fontWeight10)) {
                                                    arrayList.add(obj3);
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                fontWeight = FontWeight.c;
                                                size2 = list6.size();
                                                fontWeight2 = null;
                                                fontWeight3 = null;
                                                for (i3 = 0; i3 < size2; i3++) {
                                                    weight = ((a930) list3.get(i3)).getWeight();
                                                    if (fontWeight != null || u890.q(weight.a, fontWeight.a) >= 0) {
                                                        i5 = weight.a;
                                                        if (u890.q(i5, i11) < 0) {
                                                            if (fontWeight2 != null || u890.q(i5, fontWeight2.a) > 0) {
                                                                fontWeight2 = weight;
                                                            }
                                                        } else if (u890.q(i5, i11) <= 0) {
                                                            fontWeight2 = weight;
                                                            fontWeight3 = fontWeight2;
                                                            if (fontWeight3 != null) {
                                                                fontWeight2 = fontWeight3;
                                                            }
                                                            arrayList = new ArrayList(list3.size());
                                                            size3 = list6.size();
                                                            for (i4 = 0; i4 < size3; i4++) {
                                                                obj2 = list3.get(i4);
                                                                if (u890.j(((a930) obj2).getWeight(), fontWeight2)) {
                                                                    arrayList.add(obj2);
                                                                }
                                                            }
                                                        } else if (fontWeight3 != null || u890.q(i5, fontWeight3.a) < 0) {
                                                            fontWeight3 = weight;
                                                        }
                                                    }
                                                }
                                                if (fontWeight3 != null) {
                                                    fontWeight2 = fontWeight3;
                                                }
                                                arrayList = new ArrayList(list3.size());
                                                size3 = list6.size();
                                                while (i4 < size3) {
                                                    obj2 = list3.get(i4);
                                                    if (u890.j(((a930) obj2).getWeight(), fontWeight2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            }
                                        } else if (fontWeight11 == null || u890.q(i17, fontWeight11.a) < 0) {
                                            fontWeight11 = weight4;
                                        }
                                    }
                                }
                                if (fontWeight11 != null) {
                                    fontWeight10 = fontWeight11;
                                }
                                arrayList = new ArrayList(list3.size());
                                size = list6.size();
                                while (i2 < size) {
                                    obj3 = list3.get(i2);
                                    if (u890.j(((a930) obj3).getWeight(), fontWeight10)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    fontWeight = FontWeight.c;
                                    size2 = list6.size();
                                    fontWeight2 = null;
                                    fontWeight3 = null;
                                    while (i3 < size2) {
                                        weight = ((a930) list3.get(i3)).getWeight();
                                        if (fontWeight != null) {
                                            i5 = weight.a;
                                            if (u890.q(i5, i11) < 0) {
                                                if (fontWeight2 != null) {
                                                    fontWeight2 = weight;
                                                } else {
                                                    fontWeight2 = weight;
                                                }
                                            } else if (u890.q(i5, i11) <= 0) {
                                                fontWeight2 = weight;
                                                fontWeight3 = fontWeight2;
                                                if (fontWeight3 != null) {
                                                    fontWeight2 = fontWeight3;
                                                }
                                                arrayList = new ArrayList(list3.size());
                                                size3 = list6.size();
                                                while (i4 < size3) {
                                                    obj2 = list3.get(i4);
                                                    if (u890.j(((a930) obj2).getWeight(), fontWeight2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (fontWeight3 != null) {
                                                fontWeight3 = weight;
                                            } else {
                                                fontWeight3 = weight;
                                            }
                                        } else {
                                            i5 = weight.a;
                                            if (u890.q(i5, i11) < 0) {
                                                if (fontWeight2 != null) {
                                                    fontWeight2 = weight;
                                                } else {
                                                    fontWeight2 = weight;
                                                }
                                            } else if (u890.q(i5, i11) <= 0) {
                                                fontWeight2 = weight;
                                                fontWeight3 = fontWeight2;
                                                if (fontWeight3 != null) {
                                                    fontWeight2 = fontWeight3;
                                                }
                                                arrayList = new ArrayList(list3.size());
                                                size3 = list6.size();
                                                while (i4 < size3) {
                                                    obj2 = list3.get(i4);
                                                    if (u890.j(((a930) obj2).getWeight(), fontWeight2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (fontWeight3 != null) {
                                                fontWeight3 = weight;
                                            } else {
                                                fontWeight3 = weight;
                                            }
                                        }
                                    }
                                    if (fontWeight3 != null) {
                                        fontWeight2 = fontWeight3;
                                    }
                                    arrayList = new ArrayList(list3.size());
                                    size3 = list6.size();
                                    while (i4 < size3) {
                                        obj2 = list3.get(i4);
                                        if (u890.j(((a930) obj2).getWeight(), fontWeight2)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    g23 g23Var = j930Var.a;
                    int size11 = arrayList.size();
                    int i18 = 0;
                    ArrayList arrayListO = null;
                    while (true) {
                        if (i18 >= size11) {
                            mmr0Var = new mmr0(arrayListO, gv20Var.invoke(c2h1Var));
                        } else {
                            a930 a930Var2 = (a930) arrayList.get(i18);
                            int iA2 = a930Var2.a();
                            if (iA2 == 0) {
                                synchronized (((pvc) g23Var.d)) {
                                    try {
                                        hj7 hj7Var = new hj7(a930Var2);
                                        gj7 gj7Var2 = (gj7) ((ydf0) g23Var.b).c(hj7Var);
                                        if (gj7Var2 == null) {
                                            gj7Var2 = (gj7) ((nen0) g23Var.c).g(hj7Var);
                                        }
                                        if (gj7Var2 != null) {
                                            objInvoke = gj7Var2.a;
                                        } else {
                                            try {
                                                objInvoke = w741Var.c(a930Var2);
                                            } catch (Exception unused) {
                                                objInvoke = gv20Var.invoke(c2h1Var);
                                            }
                                            g23.o(g23Var, a930Var2, w741Var, objInvoke);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                    break;
                                }
                                if (objInvoke == null) {
                                    objInvoke = gv20Var.invoke(c2h1Var);
                                }
                                mmr0Var = new mmr0(arrayListO, t8p1.r(c2h1Var.d, objInvoke, a930Var2, c2h1Var.b, c2h1Var.c));
                            } else {
                                if (iA2 != 1) {
                                    if (iA2 == 2) {
                                        g23Var.getClass();
                                        hj7 hj7Var2 = new hj7(a930Var2);
                                        synchronized (((pvc) g23Var.d)) {
                                            gj7Var = (gj7) ((ydf0) g23Var.b).c(hj7Var2);
                                            if (gj7Var == null) {
                                                gj7Var = (gj7) ((nen0) g23Var.c).g(hj7Var2);
                                            }
                                            break;
                                        }
                                        if (gj7Var != null) {
                                            Object obj8 = gj7Var.a;
                                            if (obj8 != null) {
                                                mmr0Var = new mmr0(arrayListO, t8p1.r(c2h1Var.d, obj8, a930Var2, c2h1Var.b, c2h1Var.c));
                                            }
                                        } else if (arrayListO == null) {
                                            arrayListO = p7h.O(new a930[]{a930Var2});
                                        } else {
                                            arrayListO.add(a930Var2);
                                        }
                                        i18++;
                                    } else {
                                        bhn0.A(a930Var2, "Unknown font type ");
                                    }
                                    return null;
                                }
                                synchronized (((pvc) g23Var.d)) {
                                    try {
                                        hj7 hj7Var3 = new hj7(a930Var2);
                                        gj7 gj7Var3 = (gj7) ((ydf0) g23Var.b).c(hj7Var3);
                                        if (gj7Var3 == null) {
                                            gj7Var3 = (gj7) ((nen0) g23Var.c).g(hj7Var3);
                                        }
                                        if (gj7Var3 != null) {
                                            m231Var = gj7Var3.a;
                                        } else {
                                            try {
                                                m231Var = w741Var.c(a930Var2);
                                            } catch (Throwable th2) {
                                                m231Var = new m231(th2);
                                            }
                                            if (m231Var instanceof m231) {
                                                m231Var = null;
                                            }
                                            g23.o(g23Var, a930Var2, w741Var, m231Var);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                    break;
                                }
                                if (m231Var != null) {
                                    mmr0Var = new mmr0(arrayListO, t8p1.r(c2h1Var.d, m231Var, a930Var2, c2h1Var.b, c2h1Var.c));
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                    List list7 = (List) mmr0Var.a;
                    Object obj9 = mmr0Var.b;
                    if (list7 == null) {
                        d2h1Var = new e2h1(obj9, true);
                    } else {
                        ai7 ai7Var = new ai7(list7, obj9, c2h1Var, j930Var.a, iu30Var2, w741Var);
                        fn31.T(j930Var.b, null, 4, new j020(ai7Var, (lnm) null, (byte) 9), 1);
                        d2h1Var = new d2h1(ai7Var);
                    }
                } else {
                    d2h1Var = null;
                }
                if (d2h1Var != null) {
                    return d2h1Var;
                }
                zdt0 zdt0Var = (zdt0) g930Var.e.b;
                zh40 zh40Var = c2h1Var.a;
                int i19 = c2h1Var.c;
                FontWeight fontWeight12 = c2h1Var.b;
                if (zh40Var == null || (zh40Var instanceof a0s)) {
                    typefaceB = zdt0Var.b(i19, fontWeight12);
                } else {
                    if (!(zh40Var instanceof zh40)) {
                        if (zh40Var instanceof h8e0) {
                            typefaceB = (Typeface) ((h8e0) zh40Var).f.b;
                        } else {
                            e2h1Var = null;
                        }
                        if (e2h1Var != null) {
                            return e2h1Var;
                        }
                        eg.m("Could not load font");
                        return null;
                    }
                    typefaceB = zdt0Var.d(zh40Var, fontWeight12, i19);
                }
                e2h1Var = new e2h1(typefaceB, true);
                if (e2h1Var != null) {
                    return e2h1Var;
                }
                eg.m("Could not load font");
                return null;
            case 24:
                ((bs50) this.b).c.removeCallbacks((ag20) this.c);
                return rih1.a;
            case 25:
                tw4 tw4Var2 = (tw4) this.b;
                ja80 ja80Var = (ja80) this.c;
                lsl lslVar4 = (lsl) obj;
                lslVar4.s1();
                o95 o95Var = ja80Var.Y0;
                o95Var.getClass();
                DrawScope.j1(lslVar4, tw4Var2, new n6a1(((u7h) o95Var.e()).a), 0.0f, (DrawStyle) null, 60);
                return rih1.a;
            case 26:
                db80 db80Var = (db80) this.b;
                cb80 cb80Var = (cb80) this.c;
                db80Var.a.b(cb80Var);
                db80Var.b.setValue(Boolean.TRUE);
                return new ht0(db80Var, cb80Var, (byte) 25);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                rpb0 rpb0Var = (rpb0) this.b;
                tkt tktVar = (tkt) this.c;
                yxs yxsVarB = rpb0Var.b(((Integer) obj).intValue());
                int i20 = yxsVarB.a;
                List list8 = yxsVarB.b;
                ArrayList arrayList3 = new ArrayList(list8.size());
                int size12 = list8.size();
                int i21 = 0;
                while (i8 < size12) {
                    int i22 = (int) ((bg50) list8.get(i8)).a;
                    arrayList3.add(new mmr0(Integer.valueOf(i20), new hjl(tktVar.a(i21, i22))));
                    i20++;
                    i21 += i22;
                    i8++;
                }
                return arrayList3;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                tkt tktVar2 = (tkt) this.b;
                ipb0 ipb0Var = (ipb0) this.c;
                int iIntValue2 = ((Integer) obj).intValue();
                rpb0 rpb0Var2 = (rpb0) tktVar2.e;
                int i23 = rpb0Var2.i;
                int iE = rpb0Var2.e(iIntValue2);
                return ipb0Var.v1(iIntValue2, 0, iE, ipb0Var.e, tktVar2.a(0, iE));
            default:
                hub0 hub0Var = (hub0) this.b;
                Object obj10 = this.c;
                hub0Var.c.i(obj10);
                return new ht0(hub0Var, obj10, (byte) 27);
        }
    }

    public /* synthetic */ b6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
