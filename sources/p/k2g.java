package p;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k2g extends g2p1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k2g(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // p.g2p1
    public final void H(int i) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                d4e1 d4e1Var = (d4e1) this.d;
                d4e1Var.d = true;
                c4e1 c4e1Var = (c4e1) d4e1Var.e.get();
                if (c4e1Var != null) {
                    c4e1Var.a();
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.TextView, com.google.android.material.chip.Chip] */
    @Override // p.g2p1
    public final void I(Typeface typeface, boolean z) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ?? r0 = (Chip) obj;
                q3g q3gVar = r0.e;
                r0.setText(q3gVar.c2 ? q3gVar.e1 : r0.getText());
                r0.requestLayout();
                r0.invalidate();
                break;
            default:
                if (!z) {
                    d4e1 d4e1Var = (d4e1) obj;
                    d4e1Var.d = true;
                    c4e1 c4e1Var = (c4e1) d4e1Var.e.get();
                    if (c4e1Var != null) {
                        c4e1Var.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void K(int i) {
    }
}
