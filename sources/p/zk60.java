package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zk60 implements Comparable {
    public final boolean X;
    public final String a;
    public final yk60 b;
    public final long c;
    public final int d;
    public final long e;
    public final x8v f;
    public final String g;
    public final String h;
    public final long i;
    public final long t;

    public zk60(String str, yk60 yk60Var, long j, int i, long j2, x8v x8vVar, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = yk60Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = x8vVar;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.t = j4;
        this.X = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
