package p;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bm70 implements lqc1 {
    public final izr0 a;

    public bm70(byte b) {
        switch (b) {
            case 1:
                this.a = new izr0();
                break;
            default:
                this.a = new izr0(10);
                break;
        }
    }

    public hjj0 a(fc10 fc10Var, xl70 xl70Var, int i) {
        izr0 izr0Var;
        int i2;
        int i3 = 0;
        hjj0 hjj0VarT = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                izr0Var = this.a;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = izr0Var.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    fc10Var.h(i6 - i7, izr0Var.a, i7);
                    izr0Var.R(i5);
                    izr0Var.Q(i6);
                    if (izr0Var.a() < 3) {
                        tw20.q(izr0Var.b, izr0Var.c, ", limit=", "position=");
                        return null;
                    }
                    int iH = izr0Var.H();
                    i2 = izr0Var.b - 3;
                    izr0Var.b = i2;
                    if (iH == 4801587) {
                        break;
                    }
                    if (kqn1.t(izr0Var.m()) == -1) {
                        if (i4 == 0) {
                            izr0Var.d(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    fc10Var.f();
                    fc10Var.k(i3);
                    return hjj0VarT;
                } catch (EOFException unused) {
                }
            }
            izr0Var.S(6);
            int iD = izr0Var.D();
            int i8 = iD + 10;
            if (hjj0VarT == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(izr0Var.a, i2, bArr2, 0, 10);
                fc10Var.h(10, bArr2, iD);
                hjj0VarT = new zl70(xl70Var).t(bArr2, i8);
            } else {
                fc10Var.k(iD);
            }
            i3 += i8;
        }
    }

    public void g(byte[] bArr, int i, int i2, kqc1 kqc1Var, akl aklVar) {
        feo feoVarA;
        izr0 izr0Var = this.a;
        izr0Var.P(bArr, i2 + i);
        izr0Var.R(i);
        ArrayList arrayList = new ArrayList();
        while (izr0Var.a() > 0) {
            dm5.n(izr0Var.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iQ = izr0Var.q();
            if (izr0Var.q() == 1987343459) {
                int i3 = iQ - 8;
                CharSequence charSequenceF = null;
                eeo eeoVarA = null;
                while (i3 > 0) {
                    dm5.n(i3 >= 8, "Incomplete vtt cue box header found.");
                    int iQ2 = izr0Var.q();
                    int iQ3 = izr0Var.q();
                    int i4 = iQ2 - 8;
                    byte[] bArr2 = izr0Var.a;
                    int i5 = izr0Var.b;
                    String str = zoi1.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    izr0Var.S(i4);
                    i3 = (i3 - 8) - i4;
                    if (iQ3 == 1937011815) {
                        yll1 yll1Var = new yll1();
                        zll1.e(str2, yll1Var);
                        eeoVarA = yll1Var.a();
                    } else if (iQ3 == 1885436268) {
                        charSequenceF = zll1.f(null, Collections.EMPTY_LIST, str2.trim());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (eeoVarA != null) {
                    eeoVarA.a = charSequenceF;
                    eeoVarA.b = null;
                    feoVarA = eeoVarA.a();
                } else {
                    Pattern pattern = zll1.a;
                    yll1 yll1Var2 = new yll1();
                    yll1Var2.c = charSequenceF;
                    feoVarA = yll1Var2.a().a();
                }
                arrayList.add(feoVarA);
            } else {
                izr0Var.S(iQ - 8);
            }
        }
        aklVar.accept(new bfo(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public int i() {
        return 2;
    }
}
