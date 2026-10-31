package p;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class za61 extends ua61 {
    public final wgz0 i = new wgz0((byte) 9);
    public boolean j = true;
    public boolean k = false;
    public final ArrayList l = new ArrayList();

    public final void a(bb61 bb61Var) {
        Object objE;
        vnd vndVar = this.b;
        HashSet hashSet = (HashSet) vndVar.c;
        wnd wndVar = bb61Var.g;
        eqq0 eqq0Var = wndVar.b;
        int i = wndVar.c;
        if (i != -1) {
            this.k = true;
            int i2 = vndVar.b;
            List list = bb61.i;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            vndVar.b = i;
        }
        sy8 sy8Var = wnd.j;
        Object objE2 = i29.f;
        try {
            objE2 = eqq0Var.e(sy8Var);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objE2;
        Objects.requireNonNull(range);
        Range range2 = i29.f;
        if (!range.equals(range2)) {
            xdn0 xdn0Var = (xdn0) vndVar.d;
            sy8 sy8Var2 = wnd.j;
            xdn0Var.getClass();
            try {
                objE = xdn0Var.e(sy8Var2);
            } catch (IllegalArgumentException unused2) {
                objE = range2;
            }
            if (((Range) objE).equals(range2)) {
                ((xdn0) vndVar.d).r(wnd.j, range);
            } else {
                xdn0 xdn0Var2 = (xdn0) vndVar.d;
                sy8 sy8Var3 = wnd.j;
                Object objE3 = i29.f;
                xdn0Var2.getClass();
                try {
                    objE3 = xdn0Var2.e(sy8Var3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) objE3).equals(range)) {
                    this.j = false;
                    j2h1.o("ValidatingBuilder");
                }
            }
        }
        int iA = wndVar.a();
        if (iA != 0 && iA != 0) {
            ((xdn0) vndVar.d).r(i4i1.J0, Integer.valueOf(iA));
        }
        int iB = wndVar.b();
        if (iB != 0 && iB != 0) {
            ((xdn0) vndVar.d).r(i4i1.K0, Integer.valueOf(iB));
        }
        ((yen0) vndVar.f).a.putAll((Map) wndVar.f.a);
        this.c.addAll(bb61Var.c);
        this.d.addAll(bb61Var.d);
        vndVar.a(wndVar.d);
        this.e.addAll(bb61Var.e);
        ya61 ya61Var = bb61Var.f;
        if (ya61Var != null) {
            this.l.add(ya61Var);
        }
        InputConfiguration inputConfiguration = bb61Var.h;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = bb61Var.a;
        LinkedHashSet<b29> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(wndVar.a));
        ArrayList arrayList2 = new ArrayList();
        for (b29 b29Var : linkedHashSet) {
            arrayList2.add(b29Var.a);
            Iterator it = b29Var.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((j2t) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            j2h1.o("ValidatingBuilder");
            this.j = false;
        }
        b29 b29Var2 = bb61Var.b;
        if (b29Var2 != null) {
            b29 b29Var3 = this.h;
            if (b29Var3 == b29Var2 || b29Var3 == null) {
                this.h = b29Var2;
            } else {
                j2h1.o("ValidatingBuilder");
                this.j = false;
            }
        }
        vndVar.i(eqq0Var);
    }

    public final bb61 b() {
        if (!this.j) {
            hhg1.n("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.a);
        wgz0 wgz0Var = this.i;
        if (wgz0Var.b) {
            Collections.sort(arrayList, new ena1(wgz0Var));
        }
        return new bb61(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.j(), this.l.isEmpty() ? null : new pq70(this, (byte) 4), this.g, this.h);
    }
}
