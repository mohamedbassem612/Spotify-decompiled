package p;

import android.content.Context;
import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ryq0 implements w310 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ryq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Single b(r9c r9cVar) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((uw0) obj).n(14).b(r9cVar).map(new v9c(this, (byte) 18));
            case 1:
                return ((uw0) obj).n(2).b(r9cVar).map(new dgb(this, (byte) 23));
            case 2:
                if (r9cVar.g) {
                    return ((uw0) obj).n(6).b(r9cVar);
                }
                Single singleJust = Single.just(new z310(z6xVar, (f410) null, (m510) null, (String) null));
                singleJust.getClass();
                return singleJust;
            default:
                if (r9cVar.h) {
                    Single singleJust2 = Single.just(new z310(p7h.M(new u310[]{c("com.spotify.androidauto.home", 2131952340, 2131233208, true), c("com.spotify.recently-played", 2131952341, 2131233213, false), c("com.spotify.browse", 2131952339, 2131233204, true), c("com.spotify.your-library", 2131952342, 2131233216, false)}), (f410) null, (m510) null, (String) null));
                    singleJust2.getClass();
                    return singleJust2;
                }
                Single singleJust3 = Single.just(new z310(z6xVar, (f410) null, (m510) null, (String) null));
                singleJust3.getClass();
                return singleJust3;
        }
    }

    public u310 c(String str, int i, int i2, boolean z) {
        Context context = (Context) this.b;
        Integer num = z ? 2 : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return new u310(str, (String) null, gm50.p(context.getString(i), Locale.getDefault()), (String) null, kno1.q(context, i2), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, sqg0.J(new mmr0[]{new mmr0("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", Integer.valueOf(iIntValue)), new mmr0("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", Integer.valueOf(iIntValue))}), (String) null, (String) null, (oz0) null, -1073743894, 15);
    }
}
