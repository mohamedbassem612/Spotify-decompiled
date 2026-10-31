package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class dw40 {
    public static final List a;
    public static final List b;

    static {
        List listM = p7h.M(new e8h[]{new e8h(4, 3, p7h.M(new u7h[]{new u7h(z4p1.g(4279887500L)), new u7h(z4p1.g(4280211296L)), new u7h(z4p1.g(4284478800L)), new u7h(z4p1.g(4288006413L))})), new e8h(2, 2, p7h.M(new u7h[]{new u7h(z4p1.g(4278255615L)), new u7h(z4p1.g(4287753946L)), new u7h(z4p1.g(4291818858L)), new u7h(z4p1.g(4294763855L))})), new e8h(1, 1, p7h.M(new u7h[]{new u7h(z4p1.g(4294943787L)), new u7h(z4p1.g(4294920244L)), new u7h(z4p1.g(4293932708L)), new u7h(z4p1.g(4291329535L)), new u7h(z4p1.g(4284063990L))}))});
        a = listM;
        Iterator it = listM.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return;
        }
        byte b2 = ((e8h) it.next()).c;
        while (it.hasNext()) {
            byte b3 = ((e8h) it.next()).c;
            if (b2 < b3) {
                b2 = b3;
            }
        }
        b = p7h.M(new u7h[]{new u7h(z4p1.g(4280211296L)), new u7h(z4p1.g(4279685286L)), new u7h(z4p1.g(4284063990L))});
    }
}
