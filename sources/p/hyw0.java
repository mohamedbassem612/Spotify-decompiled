package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hyw0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2u b;

    public /* synthetic */ hyw0(j2u j2uVar, byte b) {
        this.a = b;
        this.b = j2uVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        j2u j2uVar = this.b;
        switch (b) {
            case 0:
                j2uVar.C();
                break;
            default:
                j2uVar.Y(((xxw0) obj).a);
                break;
        }
    }
}
