package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cl81 extends nl81 {
    public final int a;
    public final int b;
    public final float c;
    public final long d;
    public final int e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;

    public cl81(int i, int i2, float f, long j, int i3, int i4, List list) {
        String str;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = j;
        this.e = i3;
        this.f = i4;
        this.g = list;
        this.h = l1d.j(i2 - i, i4, "● LEAK? heap +", "MB over ", "s ↑");
        StringBuilder sbQ = cy30.q(i, i2, "baseline ", "MB → now ", "MB · gc ran ");
        sbQ.append(j);
        sbQ.append("× · min ");
        sbQ.append(i3);
        sbQ.append("MB");
        this.i = sbQ.toString();
        if (list.isEmpty()) {
            str = "";
        } else {
            List list2 = list;
            int iIntValue = ((Number) o7h.I0(list2)).intValue();
            int iIntValue2 = ((Number) o7h.F0(list2)).intValue() - iIntValue;
            iIntValue2 = iIntValue2 < 1 ? 1 : iIntValue2;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Character.valueOf("▁▂▃▄▅▆▇█".charAt(yoi1.p((int) (((((Number) it.next()).intValue() - iIntValue) / iIntValue2) * 7.0f), 0, 7))));
            }
            str = o7h.q0(list) + "MB " + o7h.y0(arrayList, "", (String) null, (String) null, (iu30) null, 62) + " " + o7h.A0(list) + "MB";
        }
        this.j = str;
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.d;
    }

    @Override // p.nl81
    public final String b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl81)) {
            return false;
        }
        cl81 cl81Var = (cl81) obj;
        return this.a == cl81Var.a && this.b == cl81Var.b && Float.compare(this.c, cl81Var.c) == 0 && this.d == cl81Var.d && this.e == cl81Var.e && this.f == cl81Var.f && this.g.equals(cl81Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(this.f, kaa0.f(this.e, cy30.f(x0d.f(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), this.d, 31), 31), 31);
    }
}
