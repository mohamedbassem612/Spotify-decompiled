package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o4 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Uri uri, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = uri;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new o4(this.b, lnmVar, (byte) 0);
            case 1:
                return new o4(this.b, lnmVar, (byte) 1);
            case 2:
                return new o4(this.b, lnmVar, (byte) 2);
            default:
                return new o4(this.b, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Uri uri = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (uri != null) {
                    return new wgf(new xgf(new fhf(uri), new y47("1:1")), null, new r771(tyo1.p(blc0.gg, new String[0])));
                }
                return null;
            case 1:
                hm5.M(obj);
                if (uri != null) {
                    return new bkc0(uri.toString(), (String) null, 62, (String) null);
                }
                return null;
            case 2:
                hm5.M(obj);
                if (uri != null) {
                    return new bkc0(uri.toString(), (String) null, 62, (String) null);
                }
                return null;
            default:
                hm5.M(obj);
                if (uri != null) {
                    return new bkc0(uri.toString(), (String) null, 62, (String) null);
                }
                return null;
        }
    }
}
