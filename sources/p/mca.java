package p;

import android.text.Editable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import com.spotify.mobius.functions.Consumer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mca extends afe1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mca(Object obj, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = obj;
    }

    public void afterTextChanged(Editable editable) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                u961 u961Var = (u961) this.c;
                String string = editable != null ? editable.toString() : null;
                ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) u961Var.d;
                Iterator it = ((CopyOnWriteArraySet) u961Var.a).iterator();
                while (it.hasNext()) {
                    ((s151) it.next()).c(string);
                }
                boolean z = string == null || string.length() == 0;
                toolbarSearchFieldView.getClass();
                toolbarSearchFieldView.setRightButtonVisible(true ^ z);
                break;
            default:
                super.afterTextChanged(editable);
                break;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.b) {
            case 1:
                ((Consumer) this.c).accept(new f6s0(charSequence.toString(), false));
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}
