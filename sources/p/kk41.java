package p;

import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kk41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ kk41(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        List<h5k> list = this.b;
        switch (b) {
            case 0:
                if (valueAnimator.isStarted()) {
                    for (h5k h5kVar : list) {
                        h5kVar.c.invoke(Float.valueOf(mgo1.u(h5kVar.d, h5kVar.e, ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                    }
                    break;
                }
                break;
            case 1:
                if (valueAnimator.isStarted()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i5k i5kVar = (i5k) it.next();
                        i5kVar.c.invoke(Float.valueOf(mgo1.u(i5kVar.d, i5kVar.e, ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                    }
                    break;
                }
                break;
            default:
                if (valueAnimator.isStarted()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        j5k j5kVar = (j5k) it2.next();
                        j5kVar.c.invoke(Float.valueOf(mgo1.u(j5kVar.d, j5kVar.e, ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                    }
                    break;
                }
                break;
        }
    }
}
