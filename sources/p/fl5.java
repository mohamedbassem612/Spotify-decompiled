package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fl5 extends gl5 {
    @Override // p.gl5
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p.gl5
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
