package p;

import android.animation.ValueAnimator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.equalizer.uiusecases.equalizerpicker.RotatingLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hfz {
    public final ConstraintLayout a;
    public final int b;
    public final TextView c;
    public final SeekBar d;
    public final RotatingLayout e;
    public boolean f = false;
    public ValueAnimator g = null;

    public hfz(ConstraintLayout constraintLayout, int i, TextView textView, SeekBar seekBar, RotatingLayout rotatingLayout) {
        this.a = constraintLayout;
        this.b = i;
        this.c = textView;
        this.d = seekBar;
        this.e = rotatingLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hfz) {
            hfz hfzVar = (hfz) obj;
            if (this.a.equals(hfzVar.a) && this.b == hfzVar.b && this.c.equals(hfzVar.c) && this.d.equals(hfzVar.d) && this.e == hfzVar.e && this.f == hfzVar.f && u890.j(this.g, hfzVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f);
        ValueAnimator valueAnimator = this.g;
        return iG + (valueAnimator == null ? 0 : valueAnimator.hashCode());
    }
}
