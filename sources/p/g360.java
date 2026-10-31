package p;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g360 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g360(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        int i9 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                Drawable background = ((Toolbar) ((h72) obj).X).getBackground();
                if (background != null) {
                    background.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.DST_OVER));
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                Drawable background2 = ((Toolbar) ((byp) obj).g).getBackground();
                if (background2 != null) {
                    background2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.DST_OVER));
                }
                break;
        }
    }
}
