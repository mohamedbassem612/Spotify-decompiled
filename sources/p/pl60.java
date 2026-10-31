package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pl60 implements gtf1 {
    public static final ie30 f;
    public static final ie30 g;
    public final gtf1 a;
    public final ie30 b;
    public ie30 c;
    public byte[] d;
    public int e;

    static {
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("application/id3");
        f = new ie30(ge30Var);
        ge30 ge30Var2 = new ge30();
        ge30Var2.o = asj0.p("application/x-emsg");
        g = new ie30(ge30Var2);
    }

    public pl60(gtf1 gtf1Var, int i) {
        this.a = gtf1Var;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                hhg1.n(f4i1.c(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // p.gtf1
    public final void a(ie30 ie30Var) {
        this.c = ie30Var;
        this.a.a(this.b);
    }

    @Override // p.gtf1
    public final void b(long j, int i, int i2, int i3, ftf1 ftf1Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        izr0 izr0Var = new izr0(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.f66p;
        ie30 ie30Var = this.b;
        String str2 = ie30Var.f66p;
        String str3 = ie30Var.f66p;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.f66p)) {
                oon1.H("Ignoring sample for unsupported format: " + this.c.f66p);
                return;
            }
            ib00 ib00VarT = to5.t(izr0Var);
            ie30 ie30VarA = ib00VarT.a();
            if (ie30VarA == null || !Objects.equals(str3, ie30VarA.f66p)) {
                oon1.H("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + ib00VarT.a());
                return;
            }
            byte[] bArrC = ib00VarT.c();
            bArrC.getClass();
            izr0Var = new izr0(bArrC);
        }
        int iA = izr0Var.a();
        gtf1 gtf1Var = this.a;
        gtf1Var.f(iA, izr0Var);
        gtf1Var.b(j, i, iA, 0, ftf1Var);
    }

    @Override // p.gtf1
    public final void c(izr0 izr0Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArrCopyOf = this.d;
        if (bArrCopyOf.length < i3) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i3 / 2) + i3);
            this.d = bArrCopyOf;
        }
        izr0Var.o(this.e, bArrCopyOf, i);
        this.e += i;
    }

    @Override // p.gtf1
    public final int d(z0r z0rVar, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArrCopyOf = this.d;
        if (bArrCopyOf.length < i2) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i2 / 2) + i2);
            this.d = bArrCopyOf;
        }
        int i3 = z0rVar.read(bArrCopyOf, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        eg.l();
        return 0;
    }
}
