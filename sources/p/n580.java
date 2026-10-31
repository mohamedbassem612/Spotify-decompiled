package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class n580 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ n580(int i, Context context, byte b) {
        this.a = b;
        this.b = i;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                if (!dhn.a.contains(o580.class)) {
                    try {
                        o580.a.a(i, context.getPackageName());
                    } catch (Throwable th) {
                        dhn.a(o580.class, th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!dhn.a.contains(o580.class)) {
                    try {
                        o580.a.a(i, context.getPackageName());
                    } catch (Throwable th2) {
                        dhn.a(o580.class, th2);
                    }
                    break;
                }
                break;
        }
    }
}
