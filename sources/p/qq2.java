package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class qq2 {
    public static final List a = p7h.M(new u7h[]{new u7h(z4p1.g(4280211296L)), new u7h(z4p1.g(4279685286L)), new u7h(z4p1.g(4284063990L))});
    public static final List b = p7h.M(new u7h[]{new u7h(z4p1.g(4279685286L)), new u7h(z4p1.g(4284063990L)), new u7h(z4p1.g(4280211296L))});

    public static long a(float f, List list) {
        int size = list.size();
        float f2 = size;
        float f3 = (f / 4.0f) % f2;
        if (f3 < 0.0f) {
            f3 += f2;
        }
        int iFloor = (int) Math.floor(f3);
        float f4 = f3 - iFloor;
        long j = ((u7h) list.get(iFloor % size)).a;
        long j2 = ((u7h) list.get((iFloor + 1) % size)).a;
        return z4p1.h(((u7h.g(j2) - u7h.g(j)) * f4) + u7h.g(j), ((u7h.f(j2) - u7h.f(j)) * f4) + u7h.f(j), ((u7h.d(j2) - u7h.d(j)) * f4) + u7h.d(j), 1.0f, 16);
    }
}
