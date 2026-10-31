package p;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p82 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p82(Context context, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = context;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return new p82(context, lnmVar, (byte) 0);
            case 1:
                return new p82(context, lnmVar, (byte) 1);
            case 2:
                return new p82(context, lnmVar, (byte) 2);
            default:
                return new p82(context, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                throw null;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        qn80 qn80Var = this.b;
        qn80 qn80VarW = null;
        switch (b) {
            case 0:
                hm5.M(obj);
                try {
                    ContentResolver contentResolver = qn80Var.getContentResolver();
                    return new mmr0(new Integer(Settings.Secure.getInt(contentResolver, "limit_ad_tracking")), Settings.Secure.getString(contentResolver, "advertising_id"));
                } catch (Exception e) {
                    i1k0.C("Caught getAmazonFireAdvertisingInfo exception: " + e);
                    return null;
                }
            case 1:
                hm5.M(obj);
                qn80VarW = qn80Var instanceof Activity ? (Activity) qn80Var : null;
                if (qn80VarW != null) {
                    qn80VarW.finish();
                }
                return rih1.a;
            case 2:
                hm5.M(obj);
                Locale locale = Locale.ROOT;
                throw null;
            default:
                hm5.M(obj);
                try {
                    String str = ne.j;
                    if (str == null || str.length() == 0) {
                        i1k0.m("No Facebook App ID provided. Can't check for Meta Install Referrer");
                    } else {
                        i1k0.B("Begin getMetaInstallReferrerDetails");
                        qn80VarW = i9p1.w(p7h.O(new qn80[]{i9p1.A(qn80Var, l1d.m("content://com.facebook.katana.provider.InstallReferrerProvider/", str)), i9p1.A(qn80Var, l1d.m("content://com.instagram.contentprovider.InstallReferrerProvider/", str)), i9p1.A(qn80Var, l1d.m("content://com.facebook.lite.provider.InstallReferrerProvider/", str))}));
                    }
                    break;
                } catch (Exception e2) {
                    i1k0.n("Exception in getMetaInstallReferrerDetails: " + e2);
                }
                return qn80VarW;
        }
    }
}
