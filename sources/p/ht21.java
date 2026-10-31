package p;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ht21 {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final lvc1 e;
    public final l3d f;
    public final HashMap g;

    public ht21(n3d n3dVar, HashSet hashSet) {
        Size sizeD = pfg1.d(n3dVar.c().a());
        l3d l3dVarG = n3dVar.g();
        lvc1 lvc1Var = new lvc1(l3dVarG, sizeD);
        this.g = new HashMap();
        this.a = sizeD;
        Rational rational = ((double) sizeD.getWidth()) / ((double) sizeD.getHeight()) > h ? g57.c : g57.a;
        sizeD.toString();
        Objects.toString(rational);
        j2h1.o("ResolutionsMerger");
        this.b = rational;
        Rational rational2 = g57.a;
        if (rational.equals(rational2)) {
            rational2 = g57.c;
        } else if (!rational.equals(g57.c)) {
            hhg1.g(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.c = rational2;
        this.f = l3dVarG;
        this.d = hashSet;
        this.e = lvc1Var;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalG = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalG2 = g(size);
        if (rationalG.floatValue() == rationalG2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalG.floatValue() > rationalG2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalG.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalG.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(i4i1 i4i1Var) {
        Rational rationalG;
        if (!this.d.contains(i4i1Var)) {
            hhg1.g(i4i1Var, "Invalid child config: ");
            return null;
        }
        HashMap map = this.g;
        if (map.containsKey(i4i1Var)) {
            List list = (List) map.get(i4i1Var);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList<Size> arrayListR = this.e.r(i4i1Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : arrayListR) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalG = null;
                    break;
                }
                rationalG = (Rational) it.next();
            } while (!g57.a(rationalG, size));
            if (rationalG != null) {
                Size size2 = (Size) map2.get(rationalG);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalG = g(size);
            }
            arrayList.add(size);
            map2.put(rationalG, size);
        }
        map.put(i4i1Var, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational) || g57.a(rational, size)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalG = g57.a;
        if (!g57.a(rationalG, size)) {
            rationalG = g57.c;
            if (!g57.a(rationalG, size)) {
                rationalG = g(size);
            }
        }
        float fFloatValue3 = rationalG.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }

    public final ArrayList e(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = g57.a;
        map.put(rational, new ArrayList());
        Rational rational2 = g57.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (g57.a(rational3, size)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalG = g(size);
                    arrayList2.add(rationalG);
                    map.put(rationalG, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new xvd(g(this.a), (byte) 22));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(g57.c) && !rational4.equals(g57.a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(f(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (g57.a(rational, size)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new oxh((byte) 0, true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            List<Size> listB = b((i4i1) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listB) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listB = arrayList3;
            }
            if (listB.isEmpty()) {
                return new ArrayList();
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listB.iterator();
                    while (it3.hasNext()) {
                        if (!c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listB.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!c((Size) it4.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
