package p;

import android.view.ViewGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lq80 extends w511 {
    public List d = new ArrayList();
    public boolean e;
    public final n4b f;
    public final gja1 g;
    public List h;
    public String i;

    public lq80(n4b n4bVar) {
        this.e = true;
        n0d n0dVar = new n0d(this);
        gja1 gja1Var = new gja1();
        gja1Var.a = (Object[]) Array.newInstance((Class<?>) m0d.class, 10);
        gja1Var.f = n0dVar;
        gja1Var.h = 0;
        this.g = gja1Var;
        this.h = z6x.a;
        this.i = "";
        this.e = false;
        this.f = n4bVar;
    }

    public final void B() {
        ArrayList arrayList;
        int i;
        int i2 = 0;
        if (this.i.length() == 0) {
            arrayList = new ArrayList(this.h);
        } else {
            List list = this.h;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (ihc1.h0(((m0d) obj).c.toLowerCase(new Locale(upn1.m())), this.i, false)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        this.d = arrayList;
        if (this.e) {
            h();
        }
        gja1 gja1Var = this.g;
        if (gja1Var.b != null) {
            eg.m("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
            return;
        }
        fja1 fja1Var = gja1Var.f;
        if (!(fja1Var instanceof eja1)) {
            eja1 eja1Var = gja1Var.g;
            if (eja1Var == null) {
                eja1Var = new eja1(fja1Var);
                gja1Var.g = eja1Var;
            }
            gja1Var.f = eja1Var;
        }
        if (gja1Var.b != null) {
            eg.m("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
            return;
        }
        int i3 = gja1Var.h;
        if (i3 != 0) {
            Arrays.fill(gja1Var.a, 0, i3, (Object) null);
            gja1Var.h = 0;
            gja1Var.f.c(0, i3);
        }
        Object[] array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) m0d.class, arrayList.size()));
        if (gja1Var.b != null) {
            eg.m("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
            return;
        }
        if (array.length != 0 && array.length >= 1) {
            if (array.length == 0) {
                i = 0;
            } else {
                Arrays.sort(array, gja1Var.f);
                int i4 = 0;
                i = 1;
                for (int i5 = 1; i5 < array.length; i5++) {
                    Object obj2 = array[i5];
                    if (gja1Var.f.compare(array[i4], obj2) == 0) {
                        int i6 = i4;
                        while (true) {
                            if (i6 >= i) {
                                i6 = -1;
                                break;
                            } else if (gja1Var.f.f(array[i6], obj2)) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 != -1) {
                            array[i6] = obj2;
                        } else {
                            if (i != i5) {
                                array[i] = obj2;
                            }
                            i++;
                        }
                    } else {
                        if (i != i5) {
                            array[i] = obj2;
                        }
                        i4 = i;
                        i++;
                    }
                }
            }
            if (gja1Var.h == 0) {
                gja1Var.a = array;
                gja1Var.h = i;
                gja1Var.f.b(0, i);
            } else {
                fja1 fja1Var2 = gja1Var.f;
                boolean z = fja1Var2 instanceof eja1;
                if (!z) {
                    if (gja1Var.b != null) {
                        eg.m("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
                        return;
                    } else if (!z) {
                        eja1 eja1Var2 = gja1Var.g;
                        if (eja1Var2 == null) {
                            eja1Var2 = new eja1(fja1Var2);
                            gja1Var.g = eja1Var2;
                        }
                        gja1Var.f = eja1Var2;
                    }
                }
                gja1Var.b = gja1Var.a;
                gja1Var.c = 0;
                int i7 = gja1Var.h;
                gja1Var.d = i7;
                gja1Var.a = (Object[]) Array.newInstance((Class<?>) m0d.class, i7 + i + 10);
                gja1Var.e = 0;
                while (true) {
                    int i8 = gja1Var.c;
                    int i9 = gja1Var.d;
                    if (i8 >= i9 && i2 >= i) {
                        break;
                    }
                    if (i8 == i9) {
                        int i10 = i - i2;
                        System.arraycopy(array, i2, gja1Var.a, gja1Var.e, i10);
                        int i11 = gja1Var.e + i10;
                        gja1Var.e = i11;
                        gja1Var.h += i10;
                        gja1Var.f.b(i11 - i10, i10);
                        break;
                    }
                    Object[] objArr = gja1Var.b;
                    if (i2 == i) {
                        int i12 = i9 - i8;
                        System.arraycopy(objArr, i8, gja1Var.a, gja1Var.e, i12);
                        gja1Var.e += i12;
                        break;
                    }
                    Object obj3 = objArr[i8];
                    Object obj4 = array[i2];
                    int iCompare = gja1Var.f.compare(obj3, obj4);
                    if (iCompare > 0) {
                        Object[] objArr2 = gja1Var.a;
                        int i13 = gja1Var.e;
                        gja1Var.e = i13 + 1;
                        objArr2[i13] = obj4;
                        gja1Var.h++;
                        i2++;
                        gja1Var.f.b(i13, 1);
                    } else if (iCompare == 0 && gja1Var.f.f(obj3, obj4)) {
                        Object[] objArr3 = gja1Var.a;
                        int i14 = gja1Var.e;
                        gja1Var.e = i14 + 1;
                        objArr3[i14] = obj4;
                        i2++;
                        gja1Var.c++;
                        if (!gja1Var.f.a(obj3, obj4)) {
                            fja1 fja1Var3 = gja1Var.f;
                            fja1Var3.d(gja1Var.e - 1, 1, fja1Var3.g(obj3, obj4));
                        }
                    } else {
                        Object[] objArr4 = gja1Var.a;
                        int i15 = gja1Var.e;
                        gja1Var.e = i15 + 1;
                        objArr4[i15] = obj3;
                        gja1Var.c++;
                    }
                }
                gja1Var.b = null;
                if (!z) {
                    gja1Var.a();
                }
            }
        }
        gja1Var.a();
    }

    public final int e() {
        return this.d.size();
    }

    public final void n(int i, w611 w611Var) {
        ((e711) w611Var).E(i, this.d.get(i));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return new mq80(viewGroup, this.f);
    }
}
