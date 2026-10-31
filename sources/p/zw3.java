package p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zw3 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zw3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void onDestroy(iac0 iac0Var) {
        x8c0 lifecycle;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ax3 ax3Var = (ax3) obj3;
                ax3Var.b.k((er91) obj2);
                ax3Var.h.f(((wqk0) obj).e(), (Set) null);
                break;
            case 1:
                ((kt91) ((z72) obj3).h).k(new er91((fs91) null, (String) obj2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                ((x8c0) obj).d(this);
                break;
            case 2:
                ((kt91) ((uwl) obj3).h).k(new er91((fs91) null, (String) obj2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                ((x8c0) obj).d(this);
                break;
            case 3:
                p1t0 p1t0Var = ((ca40) obj3).d;
                String str = (String) obj2;
                if (p1t0Var.a.get(str) == ((iu30) obj)) {
                    p1t0Var.a.remove(str);
                }
                iac0Var.getLifecycle().d(this);
                break;
            case 4:
                iac0 iac0Var2 = (iac0) ((p811) obj3).a;
                if (iac0Var2 != null && (lifecycle = iac0Var2.getLifecycle()) != null) {
                    lifecycle.d(this);
                }
                View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) ((p811) obj2).a;
                if (onAttachStateChangeListener != null) {
                    ((ConstraintLayout) obj).removeOnAttachStateChangeListener(onAttachStateChangeListener);
                }
                break;
            default:
                ((uek1) obj3).a.a.remove(((MessageResponseToken) obj2).getRequestId());
                ((ReplaySubject) obj).onComplete();
                break;
        }
    }
}
