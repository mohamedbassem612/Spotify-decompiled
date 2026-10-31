package p;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l2g extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public l2g(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Chip chip = this.a;
        if (Chip.a(chip) != null) {
            Chip.a(chip).getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
