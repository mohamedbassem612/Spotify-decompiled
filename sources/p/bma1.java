package p;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bma1 {
    public static final nbc b = new nbc((byte) 25);
    public static final HashSet c = new HashSet(64);
    public final String a;

    public bma1(String str) {
        this.a = str;
    }

    public static final synchronized bma1 a(String str) {
        return b.q(str);
    }

    public static final synchronized bma1 b(String str) {
        return b.u(str);
    }
}
