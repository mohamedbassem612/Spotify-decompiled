package p;

import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ue40 implements nzi0 {
    public static final ue40 a = new ue40();

    public final yvz0 a(Class cls) {
        if (!e.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (yvz0) e.e(cls.asSubclass(e.class)).d(3);
        } catch (Exception e) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    public final boolean b(Class cls) {
        return e.class.isAssignableFrom(cls);
    }
}
