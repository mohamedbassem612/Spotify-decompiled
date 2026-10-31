package p;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ubh0 {
    public final /* synthetic */ MaterialButtonToggleGroup a;

    public ubh0(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.a = materialButtonToggleGroup;
    }

    public final void a(MaterialButton materialButton, boolean z) {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.a;
        if (materialButtonToggleGroup.g) {
            return;
        }
        if (materialButtonToggleGroup.h) {
            materialButtonToggleGroup.t = z ? materialButton.getId() : -1;
        }
        if (materialButtonToggleGroup.d(materialButton.getId(), z)) {
            materialButton.getId();
            materialButtonToggleGroup.b();
        }
        materialButtonToggleGroup.invalidate();
    }
}
