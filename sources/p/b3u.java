package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b3u extends LinearLayout {
    public final ImageView N0;
    public View O0;
    public final View P0;
    public CharSequence Q0;
    public t230 R0;
    public Button a;
    public Button b;
    public final Button c;
    public final Button d;
    public final Button e;
    public final Button f;
    public final LinearLayout g;
    public final TextView h;
    public final TextView i;
    public final ViewGroup t;

    public b3u(Context context, boolean z) {
        super(context, null);
        View.inflate(context, z ? 2131625360 : 2131625361, this);
        this.c = (Button) findViewById(2131429742);
        this.e = (Button) findViewById(2131430980);
        this.f = (Button) findViewById(2131430979);
        this.d = (Button) findViewById(2131430697);
        this.g = (LinearLayout) findViewById(2131427850);
        this.h = (TextView) findViewById(2131431356);
        this.i = (TextView) findViewById(2131427729);
        this.t = (ViewGroup) findViewById(2131428203);
        this.N0 = (ImageView) findViewById(2131429612);
        this.P0 = findViewById(2131431361);
    }

    public TextView getBodyView() {
        return this.i;
    }

    public LinearLayout getButtonBar() {
        return this.g;
    }

    public View getContentView() {
        return this.O0;
    }

    public ImageView getImageView() {
        return this.N0;
    }

    public Button getLeftButton() {
        return this.c;
    }

    public Button getNegativeButton() {
        return this.b;
    }

    public Button getPositiveButton() {
        return this.a;
    }

    public Button getRightButton() {
        return this.d;
    }

    public Button getSingleNegativeButton() {
        return this.f;
    }

    public Button getSinglePositiveButton() {
        return this.e;
    }

    public TextView getTitleView() {
        return this.h;
    }

    public void setBody(int i) {
        setBody(getResources().getText(i));
    }

    public void setContentView(View view) {
        View view2 = this.O0;
        ViewGroup viewGroup = this.t;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        if (view == null) {
            viewGroup.setVisibility(8);
            return;
        }
        this.O0 = view;
        viewGroup.addView(view, -1, -2);
        viewGroup.setVisibility(0);
    }

    public void setImage(int i) {
        ImageView imageView = this.N0;
        imageView.setVisibility(0);
        imageView.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.h.setText(charSequence);
        this.P0.setVisibility(0);
    }

    public void setBody(CharSequence charSequence) {
        TextView textView = this.i;
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public void setTitle(int i) {
        setTitle(getResources().getText(i));
    }
}
