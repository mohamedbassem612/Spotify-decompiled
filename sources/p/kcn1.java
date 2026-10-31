package p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kcn1 extends jfn1 {
    public final bcn1 d;
    public final mhn1 e;
    public final mhn1 f;
    public final Integer g;

    public kcn1(bcn1 bcn1Var, mhn1 mhn1Var, mhn1 mhn1Var2, Integer num) {
        this.d = bcn1Var;
        this.e = mhn1Var;
        this.f = mhn1Var2;
        this.g = num;
    }

    public static kcn1 x(acn1 acn1Var, mhn1 mhn1Var, Integer num) throws GeneralSecurityException {
        mhn1 mhn1VarA;
        String str = acn1Var.b;
        byte[] bArr = mhn1Var.a;
        bcn1 bcn1Var = new bcn1(acn1Var);
        acn1 acn1Var2 = acn1.f;
        if (acn1Var != acn1Var2 && num == null) {
            throw new GeneralSecurityException(l1d.q(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (acn1Var == acn1Var2 && num != null) {
            k220.r("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(gvg.l(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (acn1Var == acn1Var2) {
            mhn1VarA = sep1.a;
        } else if (acn1Var == acn1.d || acn1Var == acn1.e) {
            mhn1VarA = sep1.a(num.intValue());
        } else {
            if (acn1Var != acn1.c) {
                eg.m("Unknown Variant: ".concat(str));
                return null;
            }
            mhn1VarA = sep1.b(num.intValue());
        }
        return new kcn1(bcn1Var, mhn1Var, mhn1VarA, num);
    }

    @Override // p.pno1
    public final /* synthetic */ w9p1 u() {
        return this.d;
    }

    @Override // p.pno1
    public final Integer v() {
        return this.g;
    }

    @Override // p.jfn1
    public final mhn1 w() {
        return this.f;
    }
}
