package p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x6a0 extends hab0 implements Function0 {
    public final /* synthetic */ z6a0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6a0(z6a0 z6a0Var, long j, long j2, int i, boolean z) {
        super(0);
        this.a = z6a0Var;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = z;
    }

    public final Object invoke() {
        long j;
        z6x z6xVar;
        z6a0 z6a0Var = this.a;
        boolean z = z6a0Var.i;
        ArrayList arrayList = z6a0Var.h;
        Object obj = null;
        if (!z) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j = this.b;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            t6a0 t6a0Var = (t6a0) next;
            if (t6a0Var.c == this.d && Math.abs(t6a0Var.a - j) <= 1000000) {
                obj = next;
                break;
            }
        }
        t6a0 t6a0Var2 = (t6a0) obj;
        if (t6a0Var2 == null) {
            arrayList.add(new t6a0(this.d, this.b, this.c, this.e));
        } else {
            t6a0Var2.b = Math.max(t6a0Var2.b, this.c);
            t6a0Var2.d = t6a0Var2.d || this.e;
        }
        long jMax = Math.max(z6a0Var.P0, j);
        z6a0Var.P0 = jMax;
        long j2 = jMax - 50000000;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((t6a0) obj2).a <= j2) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            z6xVar = z6x.a;
        } else {
            arrayList.removeAll(o7h.p1(arrayList2));
            List listA1 = o7h.a1(arrayList2, new cvt((byte) 18));
            z6x arrayList3 = new ArrayList(q7h.U(listA1, 10));
            Iterator it2 = listA1.iterator();
            while (it2.hasNext()) {
                arrayList3.add(z6a0Var.a((t6a0) it2.next()));
            }
            z6xVar = arrayList3;
        }
        if (!arrayList.isEmpty() && !z6a0Var.t) {
            long j3 = z6a0Var.X + 1;
            z6a0Var.X = j3;
            ((Handler) z6a0Var.a.b).postDelayed(new is3(new y6a0(z6a0Var, j3), (byte) 5), 50L);
            z6a0Var.t = true;
        }
        return z6a0Var.b(z6xVar);
    }
}
