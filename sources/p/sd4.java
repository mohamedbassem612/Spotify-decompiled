package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class sd4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ sd4(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p5t0.l(0, 0, p5t0Var, (q5t0) arrayList.get(i2));
                }
                break;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    p5t0.l(0, 0, p5t0Var2, (q5t0) arrayList.get(i3));
                }
                break;
            case 2:
                p5t0 p5t0Var3 = (p5t0) obj;
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    mfh0 mfh0Var = (mfh0) arrayList.get(i4);
                    List list = mfh0Var.b;
                    boolean z = mfh0Var.h;
                    if (mfh0Var.l == Integer.MIN_VALUE) {
                        tf80.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i5 = i;
                    while (i5 < size4) {
                        q5t0 q5t0Var = (q5t0) list.get(i5);
                        int[] iArr = mfh0Var.j;
                        int i6 = i5 * 2;
                        int i7 = size3;
                        long jD = qr80.d((((long) iArr[i6 + 1]) & 4294967295L) | (((long) iArr[i6]) << 32), mfh0Var.c);
                        if (z) {
                            p5t0.w(p5t0Var3, q5t0Var, jD);
                        } else {
                            p5t0.p(p5t0Var3, q5t0Var, jD);
                        }
                        i5++;
                        size3 = i7;
                    }
                    i4++;
                    i = 0;
                }
                break;
            default:
                p5t0 p5t0Var4 = (p5t0) obj;
                int size5 = arrayList.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    p5t0.g(0, 0, p5t0Var4, (q5t0) arrayList.get(i8));
                }
                break;
        }
        return rih1Var;
    }
}
