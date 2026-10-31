package p;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jmb implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jmb(byte b, Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = serializable;
        this.f = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.f;
        n811 n811Var = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                pmb pmbVar = (pmb) obj4;
                xab1 xab1Var = pmbVar.g;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                fn31.T(cto1.q(pmbVar.a), (o8n) null, 0, new imb(pmbVar, (String) n811Var, (String) obj, null, (byte) 0), 3);
                ((zqg0) obj3).d.invoke(leu.b);
                pmbVar.c.b();
                pmbVar.d.m((w7h1) obj2, (xj61) null);
                break;
            default:
                l811 l811Var = (l811) obj4;
                boolean z = l811Var.a;
                l811Var.a = !z;
                ver verVar = (ver) obj3;
                f0a f0aVar = (f0a) verVar.b;
                ((ImageView) f0aVar.b).animate().rotation(!z ? 180.0f : 0.0f).setDuration(250L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                boolean z2 = l811Var.a;
                View view2 = (View) f0aVar.e;
                if (z2) {
                    view2.animate().alpha(0.0f).setDuration(250L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new dhs(verVar, (byte) 1)).start();
                } else {
                    view2.setAlpha(0.0f);
                    view2.setVisibility(0);
                    view2.animate().alpha(1.0f).setDuration(250L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                }
                int i = l811Var.a ? 2131956551 : 2131962404;
                ImageView imageView = (ImageView) f0aVar.b;
                imageView.setContentDescription(imageView.getResources().getString(i));
                boolean z3 = l811Var.a;
                int i2 = ((n811) obj2).a;
                int i3 = n811Var.a;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
                layoutParams.getClass();
                ValueAnimator valueAnimatorOfInt = z3 ? ValueAnimator.ofInt(i2, i3) : ValueAnimator.ofInt(i3, i2);
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfInt.addUpdateListener(new ocg(layoutParams, verVar, (byte) 2));
                valueAnimatorOfInt.start();
                break;
        }
    }
}
