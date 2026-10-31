package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sjh implements Action {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ tjh b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public sjh(String str, String str2, tjh tjhVar) {
        this.c = str;
        this.d = str2;
        this.b = tjhVar;
    }

    public final void run() {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        tjh tjhVar = this.b;
        switch (b) {
            case 0:
                tjhVar.e.remove(new ojh(str2, str));
                tjhVar.b(0L, str);
                break;
            default:
                tjhVar.i.onNext(new njh(str2, ""));
                tjhVar.b(500L, str);
                break;
        }
    }

    public sjh(tjh tjhVar, String str, String str2) {
        this.b = tjhVar;
        this.c = str;
        this.d = str2;
    }
}
