package p;

import com.google.protobuf.h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class te40 implements mzi0 {
    public static final te40 a = new te40();

    public final jzi0 a(Class cls) {
        if (!h.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (jzi0) h.getDefaultInstance(cls.asSubclass(h.class)).buildMessageInfo();
        } catch (Exception e) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    public final boolean b(Class cls) {
        return h.class.isAssignableFrom(cls);
    }
}
