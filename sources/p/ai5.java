package p;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ai5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntConsumer b;
    public final /* synthetic */ int c;

    public /* synthetic */ ai5(IntConsumer intConsumer, int i, byte b) {
        this.a = b;
        this.b = intConsumer;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        IntConsumer intConsumer = this.b;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                intConsumer.accept(i);
                break;
        }
    }
}
