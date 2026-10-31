package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zvw0 {
    public final long a;
    public final ie30 b;
    public final List c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final long h;
    public adc i;
    public final idd1 j;

    public zvw0(long j, ie30 ie30Var, List list, String str, String str2, long j2, long j3) {
        this.a = j;
        this.b = ie30Var;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = j2;
        this.g = j2 * 1000000;
        int i = whc.a;
        this.h = zoi1.W(j3);
        this.j = new idd1(new l5v0(this, (byte) 1));
    }

    public final List a() {
        return this.c;
    }

    public final int b() {
        String str = zoi1.a;
        long j = this.h;
        long j2 = this.g;
        return (int) (((j + j2) - 1) / j2);
    }

    public final long c(long j) {
        if (b() == -1 || j != b() - 1) {
            return this.f * 1000000;
        }
        return this.h - (j * this.g);
    }

    public final int d(long j) {
        int i;
        int iB = b();
        if (iB != 0 && (i = (int) (j / this.g)) >= 0) {
            return iB == -1 ? i : (int) Math.min(i, iB - 1);
        }
        return 0;
    }

    public final vqz0 e(long j) {
        long j2 = j * this.f;
        return new vqz0(nhc1.W(nhc1.W(this.e, "{{profile_id}}", String.valueOf(this.a)), "{{segment_timestamp}}", String.valueOf(j2)), -1L);
    }
}
