package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class xes implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ xes(byte b, long j, String str) {
        this.a = b;
        this.b = str;
        this.c = j;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        long j = this.c;
        String str = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                n57.t("Error playing podcast episode: " + str + " at " + j, th);
                break;
            default:
                n57.t("Error playing podcast episode: " + str + " at " + j, th);
                break;
        }
    }
}
