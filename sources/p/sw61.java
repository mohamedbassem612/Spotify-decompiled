package p;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sw61 extends fba {
    public final lw61 i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public sw61(List list) {
        super(list);
        this.i = new lw61();
        this.j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x017a  */
    @Override // p.fba
    public final Object f(sua0 sua0Var, float f) {
        lw61 lw61Var;
        lw61 lw61Var2;
        int i;
        int i2;
        lw61 lw61Var3;
        lw61 lw61Var4 = (lw61) sua0Var.b;
        lw61 lw61Var5 = (lw61) sua0Var.c;
        lw61 lw61Var6 = lw61Var5 == null ? lw61Var4 : lw61Var5;
        lw61 lw61Var7 = this.i;
        ArrayList arrayList = lw61Var7.a;
        if (lw61Var7.b == null) {
            lw61Var7.b = new PointF();
        }
        boolean z = lw61Var4.c;
        ArrayList arrayList2 = lw61Var4.a;
        boolean z2 = true;
        lw61Var7.c = z || lw61Var6.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = lw61Var6.a;
        if (size != arrayList3.size()) {
            nue0.c("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new deo());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = lw61Var4.b;
        PointF pointF2 = lw61Var6.b;
        float fE = itj0.e(pointF.x, pointF2.x, f);
        float fE2 = itj0.e(pointF.y, pointF2.y, f);
        PointF pointF3 = lw61Var7.b;
        if (pointF3 == null) {
            pointF3 = new PointF();
            lw61Var7.b = pointF3;
        }
        pointF3.set(fE, fE2);
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            deo deoVar = (deo) arrayList2.get(size4);
            deo deoVar2 = (deo) arrayList3.get(size4);
            PointF pointF4 = deoVar.a;
            PointF pointF5 = deoVar.b;
            PointF pointF6 = deoVar.c;
            boolean z3 = z2;
            PointF pointF7 = deoVar2.a;
            PointF pointF8 = deoVar2.b;
            PointF pointF9 = deoVar2.c;
            ((deo) arrayList.get(size4)).a.set(itj0.e(pointF4.x, pointF7.x, f), itj0.e(pointF4.y, pointF7.y, f));
            ((deo) arrayList.get(size4)).b.set(itj0.e(pointF5.x, pointF8.x, f), itj0.e(pointF5.y, pointF8.y, f));
            ((deo) arrayList.get(size4)).c.set(itj0.e(pointF6.x, pointF9.x, f), itj0.e(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            lw61Var7 = lw61Var7;
            arrayList3 = arrayList3;
        }
        lw61 lw61Var8 = lw61Var7;
        boolean z4 = z2;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            lw61Var = lw61Var8;
            while (true) {
                ArrayList arrayList5 = lw61Var.a;
                if (size5 < 0) {
                    break;
                }
                kr31 kr31Var = (kr31) this.m.get(size5);
                kr31Var.getClass();
                if (arrayList5.size() <= 2) {
                    i = size5;
                } else {
                    float fFloatValue = ((Float) kr31Var.b.e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        i = size5;
                    } else {
                        boolean z5 = lw61Var.c;
                        int size6 = arrayList5.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            deo deoVar3 = (deo) arrayList5.get(size6);
                            deo deoVar4 = (deo) arrayList5.get(kr31.d(size6 - 1, arrayList5.size()));
                            PointF pointF10 = (size6 != 0 || z5) ? deoVar4.c : lw61Var.b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? deoVar4.b : pointF10).equals(pointF10) && deoVar3.a.equals(pointF10) && !((lw61Var.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        lw61 lw61Var9 = kr31Var.c;
                        if (lw61Var9 == null || lw61Var9.a.size() != i3) {
                            ArrayList arrayList6 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList6.add(new deo());
                            }
                            i2 = 0;
                            kr31Var.c = new lw61(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i2 = 0;
                        }
                        lw61 lw61Var10 = kr31Var.c;
                        lw61Var10.c = z5;
                        PointF pointF11 = lw61Var.b;
                        float f2 = pointF11.x;
                        float f3 = pointF11.y;
                        PointF pointF12 = lw61Var10.b;
                        if (pointF12 == null) {
                            pointF12 = new PointF();
                            lw61Var10.b = pointF12;
                        }
                        pointF12.set(f2, f3);
                        ArrayList arrayList7 = lw61Var10.a;
                        boolean z6 = lw61Var.c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList5.size()) {
                            deo deoVar5 = (deo) arrayList5.get(i6);
                            deo deoVar6 = (deo) arrayList5.get(kr31.d(i6 - 1, arrayList5.size()));
                            deo deoVar7 = (deo) arrayList5.get(kr31.d(i6 - 2, arrayList5.size()));
                            PointF pointF13 = (i6 != 0 || z6) ? deoVar6.c : lw61Var.b;
                            PointF pointF14 = (i6 != 0 || z6) ? deoVar6.b : pointF13;
                            float f4 = fFloatValue;
                            PointF pointF15 = deoVar5.a;
                            PointF pointF16 = deoVar7.c;
                            boolean z7 = z6;
                            PointF pointF17 = deoVar5.c;
                            boolean z8 = (lw61Var.c || !(i6 == 0 || i6 == arrayList5.size() + (-1))) ? false : z4;
                            if (pointF14.equals(pointF13) && pointF15.equals(pointF13) && !z8) {
                                float f5 = pointF13.x;
                                float f6 = f5 - pointF16.x;
                                float f7 = pointF13.y;
                                float f8 = f7 - pointF16.y;
                                float f9 = pointF17.x - f5;
                                float f10 = pointF17.y - f7;
                                lw61 lw61Var11 = lw61Var;
                                float fHypot = (float) Math.hypot(f6, f8);
                                float fHypot2 = (float) Math.hypot(f9, f10);
                                float fMin = Math.min(f4 / fHypot, 0.5f);
                                float fMin2 = Math.min(f4 / fHypot2, 0.5f);
                                float f11 = pointF13.x;
                                float fE3 = l1d.e(pointF16.x, f11, fMin, f11);
                                float f12 = pointF13.y;
                                float fE4 = l1d.e(pointF16.y, f12, fMin, f12);
                                float fE5 = l1d.e(pointF17.x, f11, fMin2, f11);
                                float fE6 = l1d.e(pointF17.y, f12, fMin2, f12);
                                float f13 = fE3 - ((fE3 - f11) * 0.5519f);
                                float f14 = fE4 - ((fE4 - f12) * 0.5519f);
                                float f15 = fE5 - ((fE5 - f11) * 0.5519f);
                                float f16 = fE6 - ((fE6 - f12) * 0.5519f);
                                deo deoVar8 = (deo) arrayList7.get(kr31.d(i7 - 1, arrayList7.size()));
                                deo deoVar9 = (deo) arrayList7.get(i7);
                                lw61Var3 = lw61Var11;
                                deoVar8.b.set(fE3, fE4);
                                deoVar8.c.set(fE3, fE4);
                                if (i6 == 0) {
                                    PointF pointF18 = lw61Var10.b;
                                    if (pointF18 == null) {
                                        pointF18 = new PointF();
                                        lw61Var10.b = pointF18;
                                    }
                                    pointF18.set(fE3, fE4);
                                }
                                deoVar9.a.set(f13, f14);
                                deo deoVar10 = (deo) arrayList7.get(i7 + 1);
                                deoVar9.b.set(f15, f16);
                                deoVar9.c.set(fE5, fE6);
                                deoVar10.a.set(fE5, fE6);
                                i7 += 2;
                            } else {
                                lw61Var3 = lw61Var;
                                deo deoVar11 = (deo) arrayList7.get(kr31.d(i7 - 1, arrayList7.size()));
                                deo deoVar12 = (deo) arrayList7.get(i7);
                                PointF pointF19 = deoVar6.b;
                                deoVar11.b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = deoVar6.c;
                                deoVar11.c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = deoVar5.a;
                                deoVar12.a.set(pointF21.x, pointF21.y);
                                i7++;
                            }
                            i6++;
                            arrayList5 = arrayList5;
                            fFloatValue = f4;
                            z6 = z7;
                            lw61Var4 = lw61Var4;
                            lw61Var5 = lw61Var5;
                            lw61Var = lw61Var3;
                        }
                        lw61Var = lw61Var10;
                    }
                }
                size5 = i - 1;
                lw61Var4 = lw61Var4;
                lw61Var5 = lw61Var5;
            }
        } else {
            lw61Var = lw61Var8;
        }
        lw61 lw61Var12 = lw61Var4;
        lw61 lw61Var13 = lw61Var5;
        Path path = this.j;
        itj0.d(lw61Var, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        itj0.d(lw61Var12, this.k);
        if (lw61Var13 != null) {
            lw61Var2 = lw61Var13;
            itj0.d(lw61Var2, this.l);
        } else {
            lw61Var2 = lw61Var13;
        }
        j2e0 j2e0Var = this.e;
        float f17 = sua0Var.g;
        float fFloatValue2 = sua0Var.h.floatValue();
        lw61 lw61Var14 = lw61Var2;
        Path path2 = this.k;
        return (Path) j2e0Var.j(f17, fFloatValue2, path2, lw61Var14 == null ? path2 : this.l, f, d(), this.d);
    }
}
