package p;

import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ych implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zch b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ych(zch zchVar, String str, String str2, byte b) {
        this.a = b;
        this.b = zchVar;
        this.c = str;
        this.d = str2;
    }

    public final Object get() {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        zch zchVar = this.b;
        switch (b) {
            case 0:
                return zchVar.a.b(str2, str).doOnDispose(new xch(zchVar.b.b(str2, str).subscribe(), (byte) 0));
            default:
                return zchVar.a.a(str2, str).doOnDispose(new xch(zchVar.b.a(str2, str).subscribe(), (byte) 1));
        }
    }
}
