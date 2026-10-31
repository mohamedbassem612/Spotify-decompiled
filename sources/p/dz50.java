package p;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class dz50 extends cz50 implements k6m {
    public final ImageView c;
    public final boolean d;

    public dz50(View view) {
        super(view);
        this.c = (ImageView) view.findViewById(2131428269);
        this.d = view.getResources().getConfiguration().orientation != 2;
    }

    @Override // p.cz50, p.bz50
    public final int g() {
        return this.a.getMeasuredWidth() / 2;
    }

    @Override // p.cz50, p.bz50
    public final int j() {
        ImageView imageView = this.c;
        return (imageView.getHeight() / 2) + imageView.getTop();
    }

    @Override // p.cz50, p.bz50
    public final boolean p() {
        return this.d;
    }
}
