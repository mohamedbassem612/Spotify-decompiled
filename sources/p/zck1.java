package p;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zck1 extends EncoreTextView {
    public TouchDelegate N0;
    public final eg7 O0;
    public final int i;
    public ViewGroup t;

    /* JADX WARN: Multi-variable type inference failed */
    public zck1(Context context) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.i = getResources().getDimensionPixelSize(2131165793);
        this.O0 = new eg7(this, (byte) 29);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        addOnLayoutChangeListener(this.O0);
        post(new seg1(this, (byte) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        ViewGroup viewGroup;
        removeOnLayoutChangeListener(this.O0);
        ViewGroup viewGroup2 = this.t;
        if ((viewGroup2 != null ? viewGroup2.getTouchDelegate() : null) == this.N0 && (viewGroup = this.t) != null) {
            viewGroup.setTouchDelegate(null);
        }
        this.t = null;
        this.N0 = null;
        super/*androidx.appcompat.widget.AppCompatTextView*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        Object next;
        if (!isAttachedToWindow() || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        ViewGroup viewGroup = this.t;
        int i = this.i;
        if (viewGroup == null) {
            ViewParent parent = getParent();
            Iterator it = z561.c0(eak1.i, parent instanceof ViewGroup ? (ViewGroup) parent : null).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ViewGroup viewGroup2 = (ViewGroup) next;
                if (viewGroup2.getWidth() >= i && viewGroup2.getHeight() >= i && viewGroup2.getTouchDelegate() == null) {
                    break;
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) next;
            if (viewGroup3 != null) {
                this.t = viewGroup3;
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                return;
            }
        }
        if (viewGroup.getTouchDelegate() == null || viewGroup.getTouchDelegate() == this.N0) {
            Rect rect = new Rect(0, 0, getWidth(), getHeight());
            viewGroup.offsetDescendantRectToMyCoords(this, rect);
            if (rect.width() < i) {
                int iWidth = i - rect.width();
                int i2 = iWidth / 2;
                rect.left -= i2;
                rect.right = (iWidth - i2) + rect.right;
            }
            if (rect.height() < i) {
                int iHeight = i - rect.height();
                int i3 = iHeight / 2;
                rect.top -= i3;
                rect.bottom = (iHeight - i3) + rect.bottom;
            }
            int i4 = rect.left;
            if (i4 < 0) {
                rect.offset(-i4, 0);
            }
            if (rect.right > viewGroup.getWidth()) {
                rect.offset(viewGroup.getWidth() - rect.right, 0);
            }
            int i5 = rect.top;
            if (i5 < 0) {
                rect.offset(0, -i5);
            }
            if (rect.bottom > viewGroup.getHeight()) {
                rect.offset(0, viewGroup.getHeight() - rect.bottom);
            }
            TouchDelegate touchDelegate = new TouchDelegate(rect, this);
            this.N0 = touchDelegate;
            viewGroup.setTouchDelegate(touchDelegate);
        }
    }
}
