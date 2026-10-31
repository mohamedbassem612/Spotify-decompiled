package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.radio.radio.formatlist.RadioFormatListService;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class po5 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ro5 ro5Var = (ro5) this.b;
                fy8 fy8Var = (fy8) this.c;
                lag lagVar = ro5Var.b;
                xig xigVar = fy8Var.d;
                xigVar.getClass();
                lagVar.j(xigVar.a, ((Throwable) obj).getMessage());
                break;
            case 1:
                hq8 hq8Var = (hq8) this.b;
                gr8 gr8Var = (gr8) this.c;
                wp8 wp8Var = (wp8) obj;
                Context context = hq8Var.c;
                wp8Var.getClass();
                ((AuthorizationActivity) gr8Var).o0(new dr8(nhz.f, context.getString(2131952402), wp8Var.a));
                break;
            case 2:
                mp8 mp8Var = (mp8) this.b;
                py8 py8Var = (py8) this.c;
                synchronized (mp8Var) {
                }
                leh lehVar = (leh) mp8Var.b;
                if (lehVar != null) {
                    lehVar.c(py8Var);
                }
                break;
            case 3:
                bjx bjxVar = (bjx) this.b;
                lvc lvcVar = (lvc) bjxVar.f;
                ((g1s0) bjxVar.c).getClass();
                lvcVar.f((slc0) this.c, "Samsung", true, (String) obj, "", "");
                break;
            case 4:
                RadioFormatListService radioFormatListService = (RadioFormatListService) this.b;
                Context context2 = (Context) this.c;
                spq0 spq0Var = (spq0) obj;
                int i = RadioFormatListService.e;
                if (spq0Var.c()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) spq0Var.b()));
                    intent.setFlags(335544320);
                    context2.startActivity(intent);
                } else {
                    radioFormatListService.d.a(2131963281, new Object[0]);
                }
                radioFormatListService.stopSelf();
                break;
            case 5:
                oh61 oh61Var = (oh61) this.b;
                mq5 mq5Var = (mq5) this.c;
                g510 g510Var = oh61Var.k;
                g510Var.r(oh61Var.z, g510Var.h.a(mq5Var.b), (w7h1) null);
                break;
            default:
                grb1 grb1Var = (grb1) this.b;
                grb1Var.m.b(((FlowableObserveOn) this.c).subscribe(new fv5(grb1Var, (byte) 26)));
                break;
        }
    }
}
