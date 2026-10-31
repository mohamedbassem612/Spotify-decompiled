package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i37 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i37(ArrayList arrayList, int i, int i2, byte b) {
        super(1);
        this.a = b;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        int i2 = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    p5t0Var.k((q5t0) it.next(), i3, 0, 0.0f);
                    i3 += i2 - i;
                }
                return rih1Var;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    p5t0Var2.k((q5t0) it2.next(), i4, 0, 0.0f);
                    i4 += i2 + i;
                }
                return rih1Var;
            default:
                p5t0 p5t0Var3 = (p5t0) obj;
                int i5 = 0;
                for (Object obj2 : arrayList) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    p5t0Var3.f((q5t0) obj2, 0, (i2 + i) * i5, 0.0f);
                    i5 = i6;
                }
                return rih1Var;
        }
    }
}
