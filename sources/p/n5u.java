package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n5u implements Executor {
    public static volatile n5u b;
    public static final n5u c = new n5u(1);
    public static final n5u d = new n5u(2);
    public static final n5u e = new n5u(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ n5u(byte b2) {
        this.a = b2;
    }

    public static n5u a() {
        if (b != null) {
            return b;
        }
        synchronized (n5u.class) {
            try {
                if (b == null) {
                    b = new n5u((byte) 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                q26.e().b(runnable);
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                new Thread(runnable).start();
                break;
            case 5:
                q26.e().a(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
