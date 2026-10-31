package p;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.spotify.legacyglue.emptystates.EmptyView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i0c0 implements f8x {
    public final EmptyView a;
    public final jl00 b = new jl00(this, (byte) 23);
    public final Button c;
    public final Button d;

    public i0c0(EmptyView emptyView) {
        this.a = emptyView;
        emptyView.setId(2131428614);
        Context context = emptyView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = (Button) yoi1.w(context, Button.class, 2130969379);
        this.c = button;
        button.setId(2131427863);
        button.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setVisibility(8);
        linearLayout.addView(button, new LinearLayout.LayoutParams(-2, -2));
        Button button2 = (Button) yoi1.w(context, Button.class, 2130969944);
        this.d = button2;
        button2.setId(2131427866);
        button2.setSingleLine(true);
        button2.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a8o.y(16.0f, context.getResources());
        button2.setLayoutParams(layoutParams);
        linearLayout.addView(button2);
        button2.setVisibility(8);
        emptyView.setAccessoryView(linearLayout);
    }

    public final View getView() {
        return this.a;
    }

    @Override // p.sw40
    public final void setSubtitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // p.sw40
    public final void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }
}
