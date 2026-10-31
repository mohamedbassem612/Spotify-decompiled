package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kru {
    public final j0v a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final dzu h;

    public kru(j0v j0vVar, int i, long j, long j2, long j3, int i2, int i3, dzu dzuVar) {
        dzuVar.getClass();
        boolean z = false;
        dm5.m((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            dm5.m(z);
        }
        this.a = j0vVar;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = dzuVar;
    }

    public final long a() {
        return this.h.a;
    }

    public final float b() {
        return this.h.b;
    }

    public final boolean c() {
        int i = this.b;
        return i == 3 || i == 4;
    }

    public kru(j0v j0vVar, int i, long j, long j2, int i2) {
        this(j0vVar, i, j, j2, -1L, i2, 0, new dzu());
    }
}
