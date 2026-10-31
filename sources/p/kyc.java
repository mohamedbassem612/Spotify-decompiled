package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyc implements Serializable {
    public static final kyc a = new kyc();

    private Object readResolve() {
        return a;
    }
}
