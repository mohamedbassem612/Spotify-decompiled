package p;

import java.security.SecureRandom;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y6n1 implements tug {
    public final byte[] a(int i) {
        SecureRandom secureRandom;
        synchronized (this) {
            SecureRandom secureRandom2 = SecureRandom.getInstance("SHA1PRNG");
            secureRandom2.nextBytes(new byte[32]);
            byte[] bArrGenerateSeed = secureRandom2.generateSeed(32);
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.nextBytes(new byte[32]);
            secureRandom.setSeed(bArrGenerateSeed);
        }
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
