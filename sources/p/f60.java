package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f60 extends AppCompatImageView implements h60 {
    public final /* synthetic */ g60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f60(g60 g60Var, Context context) {
        super(context, (AttributeSet) null, 2130968611);
        this.d = g60Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        e9k.z(this, getContentDescription());
        setOnTouchListener(new b60(this, this));
    }

    @Override // p.h60
    public final boolean a() {
        return false;
    }

    @Override // p.h60
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performClick() {
        if (super/*android.view.View*/.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super/*android.widget.ImageView*/.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
