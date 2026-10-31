package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwc extends Drawable {
    public static final /* synthetic */ int d = 0;
    public final View a;
    public final TextView b;
    public final TextView c;

    public wwc(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131624307, (ViewGroup) null);
        this.a = viewInflate;
        this.b = (TextView) viewInflate.findViewById(2131429992);
        this.c = (TextView) viewInflate.findViewById(2131428399);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.isOpaque() ? -1 : 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824);
        View view = this.a;
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        view.layout(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        View view = this.a;
        if (view instanceof ImageView) {
            ((ImageView) view).setColorFilter(colorFilter);
        }
    }
}
