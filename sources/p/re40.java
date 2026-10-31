package p;

import androidx.glance.appwidget.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class re40 implements kzi0 {
    public static final re40 b = new re40(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ re40(byte b2) {
        this.a = b2;
    }

    @Override // p.kzi0
    public final vvz0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!e.class.isAssignableFrom(cls)) {
                    hhg1.n("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (vvz0) e.c(cls.asSubclass(e.class)).b(3);
                } catch (Exception e) {
                    bhn0.o("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p.kzi0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return e.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
