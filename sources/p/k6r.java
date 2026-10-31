package p;

import android.app.DatePickerDialog;
import android.view.View;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k6r implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k6r(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((DatePickerDialog) obj).dismiss();
                break;
            case 1:
                cqw cqwVar = (cqw) obj;
                cqwVar.a(false);
                cqwVar.b((String) null);
                break;
            case 2:
                smo1.p((c9n) obj, (CancellationException) null);
                break;
            case 3:
                kku kkuVar = (kku) obj;
                if (kkuVar != null) {
                    kkuVar.dispose();
                }
                break;
            case 4:
                ((fsw) obj).dispose();
                break;
            case 5:
                ((guj) obj).b.s();
                break;
            case 6:
                uhk1 uhk1Var = (uhk1) ((ttw) obj).f;
                llm llmVar = (llm) uhk1Var.d;
                if (llmVar != null) {
                    smo1.q(llmVar);
                }
                uhk1Var.d = null;
                uhk1Var.e = null;
                break;
            case 7:
                scx scxVar = (scx) obj;
                scxVar.b = false;
                scxVar.a.setValue(Boolean.FALSE);
                break;
            case 8:
                rtm0 rtm0Var = (rtm0) obj;
                if (rtm0Var != null) {
                    rtm0Var.a(ysm0.a);
                }
                break;
            case 9:
                ((scz) obj).d.invoke((Object) null);
                break;
            case 10:
                ((sq00) obj).d.a = null;
                break;
            case 11:
                qt00 qt00Var = (qt00) obj;
                View view = qt00Var.b;
                if (qt00Var.a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(qt00Var);
                    qt00Var.a = false;
                }
                view.removeOnAttachStateChangeListener(qt00Var);
                break;
            case 12:
                ((yt40) obj).d.invoke();
                break;
            case 13:
                op71.q(((tg80) ((res) obj).e).k.a, (CancellationException) null);
                break;
            case 14:
                ((z990) ((da90) obj).a.f).invoke();
                break;
            case 15:
                ((sa90) obj).f.invoke();
                break;
            case 16:
                ((vyz0) obj).a.clear();
                break;
            case 17:
                ((csb0) obj).d = null;
                break;
            case 18:
                tsb0 tsb0Var = (tsb0) obj;
                rl1 rl1Var = tsb0Var.c;
                if (rl1Var != null) {
                    rl1Var.b = false;
                }
                tsb0Var.c = null;
                break;
            case 19:
                ((gcd0) obj).a.o(4);
                break;
            case 20:
                ((tso) ((et9) obj).g).a.e = null;
                break;
            case 21:
                ((MainLayoutContentContainerView) obj).O0.l((Object) null);
                break;
            case 22:
                ((s6g0) obj).d(false);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((f6h0) obj).f.J();
                break;
            case 24:
                ((p410) obj).D();
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((ysh0) ((pt) obj).g).c = null;
                break;
            case 26:
                ((b431) obj).unregister();
                break;
            case 27:
                arj0 arj0Var = (arj0) obj;
                dg30 dg30Var = arj0Var.f;
                if (dg30Var.isFinishing() && !dg30Var.isChangingConfigurations()) {
                    grj0 grj0Var = new grj0(false);
                    if (arj0Var.l.compareAndSet(false, true)) {
                        arj0Var.j.b(grj0Var);
                        break;
                    }
                }
                break;
            case 28:
                tdm0 tdm0Var = (tdm0) obj;
                tdm0Var.dismiss();
                tdm0Var.h.l();
                break;
            default:
                ((kjm0) obj).d--;
                break;
        }
    }
}
