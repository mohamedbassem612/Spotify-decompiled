package p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class hz50 extends cz50 {
    public final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz50(View view, byte b) {
        super(view);
        switch (b) {
            case 1:
                super(view);
                TextView textView = (TextView) view.findViewById(R.id.text2);
                this.c = textView;
                TextView[] textViewArr = {textView};
                r6p1.y(textViewArr);
                r6p1.x(textViewArr);
                r6p1.w(view);
                break;
            default:
                this.c = (TextView) view.findViewById(R.id.text2);
                break;
        }
    }
}
