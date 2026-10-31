package p;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r7a0 implements Runnable {
    public final /* synthetic */ byte a;
    public final Runnable b;

    public /* synthetic */ r7a0(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                runnable.run();
                break;
            case 1:
                try {
                    runnable.run();
                } catch (Exception unused) {
                    pdp1.k("Executor");
                    return;
                }
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                Deque deque = (Deque) tok0.b.get();
                zod.s(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                tok0.b.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }

    public String toString() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 2:
                return runnable.toString();
            case 3:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
