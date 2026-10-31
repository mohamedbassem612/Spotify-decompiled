package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u58 extends FrameLayout {
    public final Drawable N0;
    public final Drawable O0;
    public final ImageView a;
    public final AppCompatTextView b;
    public final IconExclamationCircle c;
    public final Drawable d;
    public ViewPropertyAnimator e;
    public t58 f;
    public final ColorStateList g;
    public final ColorStateList h;
    public final ColorStateList i;
    public final Drawable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u58(Context context) {
        super(context, null, 0);
        Drawable drawable = null;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, 2131624052, this);
        this.a = (ImageView) viewGroup.findViewById(2131427661);
        this.b = viewGroup.findViewById(2131427662);
        this.c = viewGroup.findViewById(2131427663);
        Drawable drawable2 = context.getDrawable(2131230969);
        this.d = drawable2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
        this.g = ColorStateList.valueOf(ago1.o(getContext(), 2130969892, 0));
        this.h = ColorStateList.valueOf(ago1.o(getContext(), 2130968775, 0));
        this.i = ColorStateList.valueOf(ago1.o(getContext(), 2130968774, 0));
        Drawable drawable3 = context.getDrawable(2131232858);
        if (drawable3 != null) {
            drawable3.setTintList(x74.E(context, 2131100196));
        } else {
            drawable3 = null;
        }
        this.t = drawable3;
        Drawable drawable4 = context.getDrawable(2131232418);
        if (drawable4 != null) {
            drawable4.setTintList(x74.E(context, 2131100196));
        } else {
            drawable4 = null;
        }
        this.N0 = drawable4;
        Drawable drawable5 = context.getDrawable(2131232443);
        if (drawable5 != null) {
            drawable5.setTintList(x74.E(context, 2131100196));
            drawable = drawable5;
        }
        this.O0 = drawable;
        setBackground(drawable2);
        setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
    }
}
