package p;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zts implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lvc1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zts(lvc1 lvc1Var, int i, byte b) {
        this.a = b;
        this.b = lvc1Var;
        this.c = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        int i9 = this.c;
        lvc1 lvc1Var = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ((ViewPager2) lvc1Var.d).setCurrentItem(i9);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                ((ViewPager2) lvc1Var.d).setCurrentItem(i9);
                break;
        }
    }
}
