package p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class epf1 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final EnhancedBadgeView c;
    public View d;

    public epf1(Context context) {
        super(context, null, 0);
        View.inflate(context, 2131626284, this);
        setOrientation(1);
        TextView textView = (TextView) findViewById(2131431483);
        this.a = textView;
        TextView textView2 = (TextView) findViewById(2131431482);
        this.b = textView2;
        this.c = findViewById(2131428664);
        this.d = findViewById(2131428187);
        textView.setSelected(true);
        textView2.setSelected(true);
    }
}
