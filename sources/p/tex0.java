package p;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.p000rive.runtime.kotlin.R;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tex0 extends ConstraintLayout {
    /* JADX WARN: Multi-variable type inference failed */
    public tex0(Context context) {
        super(context);
        setId(2131427907);
        setLayoutParams(new qhl(-2, -2));
        int i = (int) ((12.0f * getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        int iY = y(4);
        int iY2 = y(2);
        int iY3 = y(8);
        ArtworkView artworkView = new ArtworkView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        artworkView.setId(2131427611);
        artworkView.setDuplicateParentStateEnabled(true);
        artworkView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        artworkView.setPlaceholderInsetRatio(0.5f);
        qhl qhlVar = new qhl(-1, 0);
        ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin = iY3;
        qhlVar.G = "H,1:1";
        qhlVar.i = 0;
        qhlVar.t = 0;
        qhlVar.v = 0;
        qhlVar.k = R.id.title;
        addView(artworkView, qhlVar);
        DownloadBadgeView downloadBadgeView = new DownloadBadgeView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        downloadBadgeView.setId(2131428510);
        downloadBadgeView.setContentDescription(null);
        downloadBadgeView.setVisibility(8);
        qhl qhlVar2 = new qhl(0, i);
        qhlVar2.setMarginEnd(iY);
        ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin = iY2;
        qhlVar2.G = "1:1";
        qhlVar2.t = 0;
        qhlVar2.u = R.id.title;
        qhlVar2.i = R.id.title;
        qhlVar2.J = 0;
        addView(downloadBadgeView, qhlVar2);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.title);
        textView.setDuplicateParentStateEnabled(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(8388611);
        textView.setMaxLines(2);
        textView.setTextAppearance(2132018007);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(2130968787, typedValue, true);
        textView.setTextColor(typedValue.data);
        textView.setTextDirection(5);
        qhl qhlVar3 = new qhl(0, -2);
        qhlVar3.s = 2131428510;
        qhlVar3.v = 2131427611;
        qhlVar3.j = 2131427611;
        qhlVar3.k = 2131431115;
        addView(textView, qhlVar3);
        DownloadBadgeView downloadBadgeView2 = new DownloadBadgeView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        downloadBadgeView2.setId(2131428509);
        downloadBadgeView2.setContentDescription(null);
        downloadBadgeView2.setVisibility(8);
        qhl qhlVar4 = new qhl(0, i);
        qhlVar4.setMarginEnd(iY);
        ((ViewGroup.MarginLayoutParams) qhlVar4).topMargin = iY2;
        qhlVar4.G = "1:1";
        qhlVar4.t = 0;
        qhlVar4.u = 2131431115;
        qhlVar4.i = 2131431115;
        qhlVar4.J = 0;
        addView(downloadBadgeView2, qhlVar4);
        TextView textView2 = new TextView(getContext());
        textView2.setId(2131431115);
        textView2.setDuplicateParentStateEnabled(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(8388611);
        textView2.setMaxLines(2);
        textView2.setTextAppearance(2132018006);
        TypedValue typedValue2 = new TypedValue();
        getContext().getTheme().resolveAttribute(2130968791, typedValue2, true);
        textView2.setTextColor(typedValue2.data);
        textView2.setTextDirection(5);
        qhl qhlVar5 = new qhl(0, -2);
        qhlVar5.s = 2131428509;
        qhlVar5.v = 2131427611;
        qhlVar5.j = R.id.title;
        addView(textView2, qhlVar5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int y(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
