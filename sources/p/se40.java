package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class se40 implements lzi0 {
    public static final se40 a = new se40();

    public final wvz0 a(Class cls) {
        if (!e.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (wvz0) e.g(cls.asSubclass(e.class)).f(3);
        } catch (Exception e) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    public final boolean b(Class cls) {
        return e.class.isAssignableFrom(cls);
    }
}
