package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tua {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public tua(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = h(j2, j3, j4, j5, j6, j7);
    }

    public static long a(tua tuaVar) {
        return tuaVar.a;
    }

    public static long b(tua tuaVar) {
        return tuaVar.f;
    }

    public static long c(tua tuaVar) {
        return tuaVar.g;
    }

    public static long d(tua tuaVar) {
        return tuaVar.h;
    }

    public static long e(tua tuaVar) {
        return tuaVar.b;
    }

    public static void f(tua tuaVar, long j, long j2) {
        tuaVar.e = j;
        tuaVar.g = j2;
        tuaVar.h = h(tuaVar.b, tuaVar.d, j, tuaVar.f, j2, tuaVar.c);
    }

    public static void g(tua tuaVar, long j, long j2) {
        tuaVar.d = j;
        tuaVar.f = j2;
        tuaVar.h = h(tuaVar.b, j, tuaVar.e, j2, tuaVar.g, tuaVar.c);
    }

    public static long h(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return zoi1.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
