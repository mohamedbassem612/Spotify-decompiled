package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import p.uah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimatedVectorDrawable d;
    public final AnimatedVectorDrawable e;
    public final String f;
    public final String g;
    public boolean h;
    public View.OnClickListener i;

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        TypedValue typedValue;
        int color;
        super(context, attributeSet, i);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131233681);
        this.d = animatedVectorDrawable;
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131233680);
        this.e = animatedVectorDrawable2;
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{2130969030});
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color == 0) {
                typedValue = new TypedValue();
                context.getTheme().resolveAttribute(2130969030, typedValue, true);
                if (typedValue.resourceId != 0) {
                    color = context.getResources().getColor(typedValue.resourceId);
                } else {
                    color = typedValue.data;
                }
            }
        } else {
            typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969030, typedValue, true);
            if (typedValue.resourceId != 0) {
                color = context.getResources().getColor(typedValue.resourceId);
            } else {
                color = typedValue.data;
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(uah.e(-1, color) < 3.0d ? -570425344 : -1, PorterDuff.Mode.SRC_IN);
        animatedVectorDrawable.setColorFilter(porterDuffColorFilter);
        animatedVectorDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(2131958925);
        this.f = string;
        this.g = context.getString(2131958923);
        setImageDrawable(animatedVectorDrawable);
        setContentDescription(string);
        super.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
                AnimatedVectorDrawable animatedVectorDrawable3 = mediaRouteExpandCollapseButton.e;
                AnimatedVectorDrawable animatedVectorDrawable4 = mediaRouteExpandCollapseButton.d;
                boolean z = mediaRouteExpandCollapseButton.h;
                mediaRouteExpandCollapseButton.h = !z;
                if (z) {
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable3);
                    animatedVectorDrawable3.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(animatedVectorDrawable4);
                    animatedVectorDrawable4.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.g);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }
}
