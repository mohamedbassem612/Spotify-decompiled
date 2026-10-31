package com.spotify.jam.features.shareoptions.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bhn0;
import p.caz;
import p.m5n1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/spotify/jam/features/shareoptions/impl/ShareOptionItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lp/rih1;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "resourceId", "setImageByResId", "(I)V", "src_main_java_com_spotify_jam_features_shareoptions_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareOptionItemView extends ConstraintLayout {
    public final caz T0;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareOptionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626128, (ViewGroup) this, false);
        addView(constraintLayoutInflate);
        int i2 = 2131430943;
        if (m5n1.t(constraintLayoutInflate, 2131430943) != null) {
            i2 = 2131430944;
            ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131430944);
            if (imageView != null) {
                i2 = 2131430945;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430945);
                if (textView != null) {
                    i2 = 2131430946;
                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430946);
                    if (textView2 != null) {
                        this.T0 = new caz(constraintLayoutInflate, imageView, textView, textView2);
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166992);
                        imageView.setImageBitmap(Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888));
                        return;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setImageByResId(int resourceId) {
        this.T0.a.setImageResource(resourceId);
    }

    public final void setSubtitle(CharSequence subtitle) {
        TextView textView = this.T0.b;
        textView.setText(subtitle);
        if (subtitle instanceof SpannableString) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void setTitle(CharSequence title) {
        this.T0.c.setText(title);
    }

    public ShareOptionItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShareOptionItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShareOptionItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
