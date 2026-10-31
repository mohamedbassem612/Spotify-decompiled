package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yee1 implements ueg1 {
    public BehaviorSubject a;

    public final void a(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            this.a.onNext(new oeg1(textView.getMaxLines(), new wrb1(textView, (((ViewGroup) textView.getParent()).getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd())));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.height = viewGroup.getPaddingBottom() + textView.getPaddingBottom() + textView.getPaddingTop() + (textView.getMaxLines() * textView.getLineHeight());
            viewGroup.setLayoutParams(layoutParams);
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new eg7(this, (byte) 24));
        } else {
            a(view);
        }
    }

    @Override // p.ueg1
    public final Observable t1() {
        return this.a.distinctUntilChanged();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
