package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xvz0 implements jzi0 {
    public final s2j0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public xvz0(s2j0 s2j0Var, String str, Object[] objArr) {
        this.a = s2j0Var;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p.jzi0
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // p.jzi0
    public final s2j0 b() {
        return this.a;
    }

    @Override // p.jzi0
    public final int c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
