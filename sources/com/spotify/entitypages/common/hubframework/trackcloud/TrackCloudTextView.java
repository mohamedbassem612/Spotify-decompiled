package com.spotify.entitypages.common.hubframework.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.fa30;
import p.u890;
import p.zkf1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/entitypages/common/hubframework/trackcloud/TrackCloudTextView;", "Lcom/spotify/encoremobile/component/textview/EncoreTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/zkf1;", "trackCloudText", "Lp/rih1;", "setTrackCloudText", "(Lp/zkf1;)V", "src_main_java_com_spotify_entitypages_common-common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrackCloudTextView extends EncoreTextView {
    public zkf1 i;

    public /* synthetic */ TrackCloudTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onLayout(z, i, i2, i3, i4);
        zkf1 zkf1Var = this.i;
        if (zkf1Var == null) {
            u890.C("trackCloudText");
            throw null;
        }
        String str = zkf1Var.e;
        int lineCount = getLineCount();
        int i5 = lineCount - 1;
        if (TextUtils.isEmpty(str) || lineCount <= 0 || getLayout().getEllipsisCount(i5) <= 0) {
            return;
        }
        SpannableString spannableStringA = zkf1.a(getContext());
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(2131101506)), 0, spannableString.length(), 33);
        int lineEnd = getLayout().getLineEnd(i5) - getLayout().getEllipsisCount(i5);
        int length = str.length() + spannableStringA.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        int i6 = lineEnd - length;
        if (i6 >= 0) {
            spannableStringBuilder.delete(i6, spannableStringBuilder.length());
            int length2 = spannableStringBuilder.length();
            zkf1 zkf1Var2 = this.i;
            if (zkf1Var2 == null) {
                u890.C("trackCloudText");
                throw null;
            }
            spannableStringBuilder.delete(zkf1Var2.b(length2), length2);
            spannableStringBuilder.append((CharSequence) spannableStringA);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTrackCloudText(zkf1 trackCloudText) {
        this.i = trackCloudText;
        setMaxLines(trackCloudText.g);
        setText(trackCloudText.a);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackCloudTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fa30.a(this, context);
    }

    public TrackCloudTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
