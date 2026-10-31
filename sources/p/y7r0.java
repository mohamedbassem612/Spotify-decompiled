package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y7r0 implements l5r0 {
    public View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public y7r0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131624521, viewGroup, false);
        this.a = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(2131430156);
        TextView textView2 = (TextView) this.a.findViewById(2131430155);
        TextView[] textViewArr = {textView, textView2};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        textView2.setTag(2131427698, Integer.valueOf((int) (26.0f * context.getResources().getDisplayMetrics().scaledDensity)));
        r6p1.w(this.a);
        textView.setText(this.b);
        textView2.setText(this.c);
    }

    public final View getView() {
        return this.a;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
