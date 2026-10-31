package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rjh implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjh b;
    public final /* synthetic */ String c;

    public /* synthetic */ rjh(tjh tjhVar, String str, byte b) {
        this.a = b;
        this.b = tjhVar;
        this.c = str;
    }

    public final void run() {
        byte b = this.a;
        String str = this.c;
        tjh tjhVar = this.b;
        switch (b) {
            case 0:
                tjhVar.b(0L, str);
                break;
            default:
                tjhVar.b(0L, str);
                break;
        }
    }
}
