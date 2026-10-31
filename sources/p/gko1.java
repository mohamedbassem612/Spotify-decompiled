package p;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gko1 implements ThreadFactory {
    public final String a;
    public final Integer b;
    public final ThreadFactory c = Executors.defaultThreadFactory();

    public gko1(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.c.newThread(runnable);
        threadNewThread.getClass();
        Integer num = this.b;
        if (num != null) {
            threadNewThread.setPriority(num.intValue());
        }
        String name = threadNewThread.getName();
        String strValueOf = String.valueOf(name);
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb.append(str);
        sb.append("_");
        sb.append(name);
        threadNewThread.setName(sb.toString());
        return threadNewThread;
    }
}
