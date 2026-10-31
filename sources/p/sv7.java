package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.adsdisplay.products.cmp.CMPActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sv7 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv7(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                new sv7((rwj) this.b, (lnm) obj4, (byte) 0).invokeSuspend(rih1Var);
                break;
            case 1:
                new sv7((ham) this.b, (lnm) obj4, (byte) 1).invokeSuspend(rih1Var);
                break;
            default:
                sv7 sv7Var = new sv7(4, (lnm) obj4);
                sv7Var.b = (wr70) obj2;
                sv7Var.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                cw7 cw7Var = (cw7) ((rwj) this.b).g;
                dwn0 dwn0Var = new dwn0("spotify:nowplaying:video-settings:audio-language", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                lzn0 lzn0Var = cw7Var.b;
                if (lzn0Var.j(cw7Var.a)) {
                    lzn0Var.f(dwn0Var);
                } else {
                    a1r0.j(cw7Var.c, "spotify:nowplaying:video-settings:audio-language", (String) null, (Bundle) null, false, 14);
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                Activity activity = (Activity) ((ham) this.b).b;
                activity.startActivity(new Intent(activity, (Class<?>) CMPActivity.class));
                return rih1Var;
            default:
                wr70 wr70Var = (wr70) this.b;
                hm5.M(obj);
                if (wr70Var != null) {
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv7(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 2;
    }
}
