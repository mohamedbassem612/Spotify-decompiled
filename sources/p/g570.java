package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g570 extends RecyclerView {
    public final /* synthetic */ byte l2 = 0;
    public final Object m2;

    /* JADX WARN: Multi-variable type inference failed */
    public g570(Context context) {
        super(context, (AttributeSet) null, 0);
        this.m2 = new f570(getResources());
    }

    public CharSequence getAccessibilityClassName() {
        switch (this.l2) {
            case 1:
                ((ViewPager2) this.m2).W0.getClass();
                break;
        }
        return super.getAccessibilityClassName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.l2) {
            case 1:
                super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
                ViewPager2 viewPager2 = (ViewPager2) this.m2;
                accessibilityEvent.setFromIndex(viewPager2.d);
                accessibilityEvent.setToIndex(viewPager2.d);
                accessibilityEvent.setSource(viewPager2.W0.d);
                accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
                break;
            default:
                super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.l2) {
            case 1:
                return ((ViewPager2) this.m2).U0 && super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    public void onMeasure(int i, int i2) {
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        switch (this.l2) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                z511 adapter = getAdapter();
                if (size > 0 && adapter != null && adapter.e() > 0) {
                    f570 f570Var = (f570) this.m2;
                    int i4 = 0;
                    int iG = adapter.g(0);
                    f570Var.getClass();
                    if (iG == 2131429182 || iG == 2131429183 || iG == 2131429184 || iG == 2131429157 || iG == 2131429158 || iG == 2131429159 || iG == 2131429156) {
                        i4 = f570Var.a;
                        i3 = f570Var.b;
                    } else if (iG == 2131429180 || iG == 2131429148) {
                        i3 = f570Var.e;
                        f = f570Var.f;
                        int i5 = size / ((int) (i3 * f));
                        int i6 = f570Var.d;
                        float f5 = size;
                        f2 = f5 / (((int) (((i3 + i4) - i4) * f)) + i6);
                        f3 = (int) f2;
                        f4 = f2 - f3;
                        if (f4 < 0.2f) {
                            f2 = f3 + 0.2f;
                        } else if (f4 > 0.8f) {
                            f2 = ((int) (f2 + 1.0f)) + 0.2f;
                        }
                        i2 = View.MeasureSpec.makeMeasureSpec(((int) ((1.0f / f) * (((int) (f5 / Math.max(f2, i5 + 0.2f))) - i6))) + i4, 1073741824);
                    } else if (iG == 2131429181) {
                        i3 = f570Var.c;
                    } else {
                        i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    }
                    f = 1.0f;
                    int i7 = size / ((int) (i3 * f));
                    int i8 = f570Var.d;
                    float f6 = size;
                    f2 = f6 / (((int) (((i3 + i4) - i4) * f)) + i8);
                    f3 = (int) f2;
                    f4 = f2 - f3;
                    if (f4 < 0.2f) {
                        f2 = f3 + 0.2f;
                    } else if (f4 > 0.8f) {
                        f2 = ((int) (f2 + 1.0f)) + 0.2f;
                    }
                    i2 = View.MeasureSpec.makeMeasureSpec(((int) ((1.0f / f) * (((int) (f6 / Math.max(f2, i7 + 0.2f))) - i8))) + i4, 1073741824);
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.l2) {
            case 1:
                return ((ViewPager2) this.m2).U0 && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g570(ViewPager2 viewPager2, Context context) {
        super(context);
        this.m2 = viewPager2;
    }
}
