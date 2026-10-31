package p;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fdn1 {
    public static final BigInteger e;
    public static final BigInteger f;
    public Integer a = null;
    public BigInteger b = idn1.e;
    public gdn1 c = null;
    public hdn1 d = hdn1.f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        e = bigIntegerValueOf;
        f = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final idn1 b() throws InvalidAlgorithmParameterException {
        Integer num = this.a;
        if (num == null) {
            k220.r("key size is not set");
            return null;
        }
        if (this.b == null) {
            k220.r("publicExponent is not set");
            return null;
        }
        if (this.c == null) {
            k220.r("hash type is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.a));
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(idn1.e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new idn1(this.a.intValue(), this.b, this.d, this.c);
    }
}
