package p;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u3g implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3g(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ChipGroup chipGroup = (ChipGroup) obj;
                if (!chipGroup.O0) {
                    if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.h) {
                        chipGroup.c(compoundButton.getId(), true);
                        chipGroup.N0 = compoundButton.getId();
                    } else {
                        int id = compoundButton.getId();
                        int i = chipGroup.N0;
                        if (z) {
                            if (i != -1 && i != id && chipGroup.g) {
                                chipGroup.c(i, false);
                            }
                            chipGroup.setCheckedId(id);
                        } else if (i == id) {
                            chipGroup.setCheckedId(-1);
                        }
                    }
                    break;
                }
                break;
            case 1:
                compoundButton.setChecked(false);
                iu30 iu30Var = (iu30) ((yir) obj).b;
                if (iu30Var != null) {
                    iu30Var.invoke(cy51.a);
                }
                break;
            default:
                ((ym) obj).invoke(Boolean.valueOf(z));
                break;
        }
    }
}
