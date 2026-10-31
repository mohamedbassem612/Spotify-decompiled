package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jez0 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jez0(int i, int i2, int i3, int i4, j2i j2iVar, int i5, int i6) {
        super(2);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j2iVar;
        this.f = i5;
        this.g = i6;
    }

    public final Object invoke(Object obj, Object obj2) {
        tlc1 tlc1Var = (tlc1) obj;
        long j = ((hjl) obj2).a;
        List listP = tlc1Var.P(lc91.b, new j2i(-1421242355, new j2r0(this.e, (byte) 6), true));
        int size = listP.size();
        if (size < 1) {
            size = 1;
        }
        int iMin = Math.min(3, size);
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = ((i2 - i3) - ((iMin - 1) * i)) / iMin;
        List list = listP;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return null;
        }
        int iD = ((afh0) it.next()).d(i4);
        while (it.hasNext()) {
            int iD2 = ((afh0) it.next()).d(i4);
            if (iD < iD2) {
                iD = iD2;
            }
        }
        if (!((iD >= 0) & (i4 >= 0))) {
            sf80.a("width and height must be >= 0");
        }
        long jH = jjl.h(i4, i4, iD, iD);
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((afh0) it2.next()).H(jH));
        }
        return tlc1Var.S(((arrayList.size() - 1) * i) + (arrayList.size() * i4) + i3, iD + this.d, b7x.a, new n6m(this.f, this.g, i, arrayList));
    }
}
