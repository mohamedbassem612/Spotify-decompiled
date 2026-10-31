package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class izv implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ otu b;

    public /* synthetic */ izv(otu otuVar, byte b) {
        this.a = b;
        this.b = otuVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        otu otuVar = this.b;
        switch (b) {
            case 0:
                ((kh0) otuVar.c).a(new String[]{"android.permission.CAMERA"});
                break;
            default:
                ((kh0) otuVar.c).a(new String[]{"android.permission.CAMERA"});
                break;
        }
    }
}
