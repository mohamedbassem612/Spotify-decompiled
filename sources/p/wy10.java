package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wy10 extends s5 {
    public final vy10 a;
    public final char b;
    public final int c;
    public String d;
    public final StringBuilder e;

    public wy10(int i, int i2, char c) {
        vy10 vy10Var = new vy10();
        this.a = vy10Var;
        this.e = new StringBuilder();
        this.b = c;
        this.c = i;
        String.valueOf(c);
        Integer numValueOf = Integer.valueOf(i);
        if (i < 3) {
            hhg1.n("openingFenceLength needs to be >= 3");
            throw null;
        }
        Integer num = vy10Var.h;
        if (num != null && num.intValue() < i) {
            hhg1.n("fence lengths required to be: closingFenceLength >= openingFenceLength");
            throw null;
        }
        vy10Var.g = numValueOf;
        vy10Var.i = i2;
    }

    @Override // p.s5
    public final void a(ala1 ala1Var) {
        String str = this.d;
        CharSequence charSequence = ala1Var.a;
        if (str == null) {
            this.d = charSequence.toString();
            return;
        }
        StringBuilder sb = this.e;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // p.s5
    public final void e() {
        atz.b(this.d.trim());
        this.a.j = this.e.toString();
    }

    @Override // p.s5
    public final e6b f() {
        return this.a;
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        int i = cquVar.f;
        int i2 = cquVar.c;
        CharSequence charSequence = cquVar.a.a;
        int i3 = cquVar.h;
        vy10 vy10Var = this.a;
        if (i3 < 4 && i < charSequence.length()) {
            int length = charSequence.length();
            for (int i4 = i; i4 < length; i4++) {
                if (charSequence.charAt(i4) != this.b) {
                    length = i4;
                    break;
                }
            }
            int i5 = length - i;
            if (i5 >= this.c && zno1.w(i + i5, charSequence.length(), charSequence) == charSequence.length()) {
                Integer numValueOf = Integer.valueOf(i5);
                if (i5 < 3) {
                    hhg1.n("closingFenceLength needs to be >= 3");
                    return null;
                }
                Integer num = vy10Var.g;
                if (num == null || i5 >= num.intValue()) {
                    vy10Var.h = numValueOf;
                    return new jwg(-1, -1, true);
                }
                hhg1.n("fence lengths required to be: closingFenceLength >= openingFenceLength");
                return null;
            }
        }
        int length2 = charSequence.length();
        for (int i6 = vy10Var.i; i6 > 0 && i2 < length2 && charSequence.charAt(i2) == ' '; i6--) {
            i2++;
        }
        return jwg.a(i2);
    }
}
