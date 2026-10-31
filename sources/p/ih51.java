package p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ih51 extends bh51 {
    public final TextView f;

    public ih51(View view, boolean z) {
        super(view, z);
        TextView textView = (TextView) view.findViewById(R.id.text2);
        this.f = textView;
        TextView[] textViewArr = {textView};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        r6p1.w(view);
    }
}
