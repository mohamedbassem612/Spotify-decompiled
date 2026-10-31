package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m5u implements Executor {
    public static final m5u b = new m5u(0);
    public static final /* synthetic */ m5u c = new m5u(1);
    public static final /* synthetic */ m5u d = new m5u(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ m5u(byte b2) {
        this.a = b2;
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
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
