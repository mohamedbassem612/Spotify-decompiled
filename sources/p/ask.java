package p;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ask implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ ask(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            case 1:
                return new Thread(runnable, str);
            default:
                return new Thread(runnable, str);
        }
    }
}
