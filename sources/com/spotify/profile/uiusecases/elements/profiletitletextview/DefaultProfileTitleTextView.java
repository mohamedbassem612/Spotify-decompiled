package com.spotify.profile.uiusecases.elements.profiletitletextview;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.lr80;
import p.pze0;
import p.sr80;
import p.tlv;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/profile/uiusecases/elements/profiletitletextview/DefaultProfileTitleTextView;", "", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_profile_uiusecases_elements_profiletitletextview-profiletitletextview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultProfileTitleTextView extends AppCompatTextView implements tlv {
    public /* synthetic */ DefaultProfileTitleTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void f(Object obj) {
        pze0.m(obj);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        Float fValueOf;
        super.onMeasure(i, i2);
        if (getLayout() != null) {
            Layout layout = getLayout();
            lr80 it = yoi1.Q(0, layout.getLineCount()).iterator();
            sr80 sr80Var = (sr80) it;
            if (sr80Var.hasNext()) {
                lr80 lr80Var = it;
                float lineWidth = layout.getLineWidth(lr80Var.nextInt());
                while (sr80Var.hasNext()) {
                    lineWidth = Math.max(lineWidth, layout.getLineWidth(lr80Var.nextInt()));
                }
                fValueOf = Float.valueOf(lineWidth);
            } else {
                fValueOf = null;
            }
            setMeasuredDimension(getCompoundPaddingRight() + getCompoundPaddingLeft() + (fValueOf != null ? (int) Math.ceil(fValueOf.floatValue()) : 0), getMeasuredHeight());
        }
    }

    public DefaultProfileTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultProfileTitleTextView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }
}
