package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class md1 implements xpw {
    public final /* synthetic */ byte a;
    public final lzn0 b;
    public final n8l0 c;
    public final rey0 d;
    public final ia00 e;
    public final psw f;

    public md1(lzn0 lzn0Var, n8l0 n8l0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = lzn0Var;
                this.c = n8l0Var;
                this.d = new rey0(new n1r0(this, (byte) 9));
                this.e = n3o1.q(this).a(new x3o0(this, (byte) 17), new aaq0(this, (byte) 1));
                j2i j2iVar = g6j.b;
                ien0 ien0Var = qsw.a;
                this.f = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = lzn0Var;
                this.c = n8l0Var;
                this.d = new rey0(new o2(this, (byte) 15));
                this.e = n3o1.q(this).a(new m3(this, (byte) 25), new yxl1(this, (byte) 23));
                j2i j2iVar2 = b4i.a;
                ien0 ien0Var2 = qsw.a;
                this.f = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public static String e(ld1 ld1Var) {
        iyr0 iyr0Var = ld1Var.b;
        String str = ld1Var.a;
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            return nik1.X5.b("spotify:internal:parental-control:child:" + str + ":manage-content:approved:add").a;
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        return nik1.W5.b("spotify:internal:parental-control:child:" + str + ":manage-content:blocked:add").a;
    }

    public static String f(pxr0 pxr0Var) {
        iyr0 iyr0Var = pxr0Var.b;
        String str = pxr0Var.a;
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            return nik1.X5.b("spotify:internal:parental-control:child:" + str + ":manage-content:approved:add").a;
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        return nik1.W5.b("spotify:internal:parental-control:child:" + str + ":manage-content:blocked:add").a;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.d;
    }
}
