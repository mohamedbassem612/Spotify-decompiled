package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rpb0 {
    public final epb0 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public rpb0(epb0 epb0Var) {
        this.a = epb0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ppb0(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = z6x.a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    public final yxs b(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        List list;
        if (!this.a.e) {
            int i5 = this.i;
            int i6 = i * i5;
            int iD = d() - i6;
            if (i5 > iD) {
                i5 = iD;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.h.size()) {
                list = this.h;
            } else {
                ArrayList arrayList = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList.add(new bg50(blo1.c(1)));
                }
                this.h = arrayList;
                list = arrayList;
            }
            return new yxs(i6, list);
        }
        int iA = i / a();
        ArrayList arrayList2 = this.b;
        int iMin = Math.min(iA, arrayList2.size() - 1);
        int iA2 = a() * iMin;
        int iIntValue = ((ppb0) arrayList2.get(iMin)).a;
        int iE = ((ppb0) arrayList2.get(iMin)).b;
        int i8 = this.c;
        ArrayList arrayList3 = this.g;
        if (iA2 <= i8 && i8 <= i) {
            iIntValue = this.d;
            iE = this.e;
            iA2 = i8;
        } else if (iMin == this.f && (i2 = i - iA2) < arrayList3.size()) {
            iIntValue = ((Number) arrayList3.get(i2)).intValue();
            iA2 = i;
            iE = 0;
        }
        if (iA2 % a() == 0) {
            int i9 = i - iA2;
            z = 2 <= i9 && i9 < a();
        }
        if (z) {
            this.f = iMin;
            arrayList3.clear();
        }
        if (iA2 > i) {
            tf80.c("currentLine (" + iA2 + ") > lineIndex (" + i + ")");
        }
        while (iA2 < i && iIntValue < d()) {
            if (z) {
                arrayList3.add(Integer.valueOf(iIntValue));
            }
            int i10 = 0;
            while (i10 < this.i && iIntValue < d()) {
                if (iE == 0) {
                    i4 = iE;
                    iE = e(iIntValue);
                } else {
                    i4 = 0;
                }
                i10 += iE;
                if (i10 > this.i) {
                    break;
                }
                iIntValue++;
                iE = i4;
            }
            iA2++;
            if (iA2 % a() == 0 && iIntValue < d()) {
                if (arrayList2.size() != iA2 / a()) {
                    tf80.c("invalid starting point");
                }
                arrayList2.add(new ppb0(iIntValue, iE));
            }
        }
        this.c = i;
        this.d = iIntValue;
        this.e = iE;
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        int i12 = iIntValue;
        while (i11 < this.i && i12 < d()) {
            if (iE == 0) {
                int i13 = iE;
                iE = e(i12);
                i3 = i13;
            } else {
                i3 = 0;
            }
            i11 += iE;
            if (i11 > this.i) {
                break;
            }
            i12++;
            arrayList4.add(new bg50(blo1.c(iE)));
            iE = i3;
        }
        return new yxs(iIntValue, arrayList4);
    }

    public final int c(int i) {
        int i2;
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            tf80.a("ItemIndex > total count");
        }
        if (!this.a.e) {
            return i / this.i;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        p7h.Q(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = ((ppb0) arrayList.get(i2)).a - i;
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int iA = a() * i2;
        int i6 = ((ppb0) arrayList.get(i2)).a;
        if (i6 > i) {
            tf80.a("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int iE = e(i6);
            i7 += iE;
            int i9 = this.i;
            if (i7 >= i9) {
                if (i7 == i9) {
                    iA++;
                    i7 = 0;
                } else {
                    iA++;
                    i7 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new ppb0(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return e(i) + i7 > this.i ? iA + 1 : iA;
    }

    public final int d() {
        return this.a.d.b;
    }

    public final int e(int i) {
        qpb0.b = this.i;
        g890 g890VarQ = this.a.d.q(i);
        int i2 = i - g890VarQ.a;
        return (int) ((bg50) ((bpb0) g890VarQ.c).b.invoke(qpb0.a, Integer.valueOf(i2))).a;
    }
}
