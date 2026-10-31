package p;

import android.os.Trace;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ghp0 implements Runnable {
    public static final ghp0 b = new ghp0(0);
    public static final /* synthetic */ ghp0 c = new ghp0(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ ghp0(byte b2) {
        this.a = b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                krw0 krw0Var = krw0.i;
                krw0.i.f.a(new fhp0());
                return;
            case 1:
                try {
                    int i = pif1.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (a4x.d()) {
                        a4x.a().f();
                        break;
                    }
                    return;
                } finally {
                    int i2 = pif1.a;
                    Trace.endSection();
                }
            case 2:
            case 3:
            default:
                return;
        }
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final void c() {
    }
}
