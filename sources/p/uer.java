package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uer implements qzh {
    public final /* synthetic */ byte a = 0;
    public final TextView b;

    public uer(Context context) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(2131624513, (ViewGroup) null);
        this.b = textView;
        b8k1.p(textView, new zdc((byte) 11));
    }

    public final void f(Object obj) {
        byte b = this.a;
        TextView textView = this.b;
        switch (b) {
            case 0:
                textView.setText(((sm0) obj).a);
                textView.setTextAppearance(2132018013);
                break;
            default:
                textView.setText((String) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }

    public uer(TextView textView) {
        this.b = textView;
    }
}
