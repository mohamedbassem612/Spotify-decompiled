package p;

import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a351 implements r3f1 {
    public final /* synthetic */ u961 a;

    public a351(u961 u961Var) {
        this.a = u961Var;
    }

    public final void a() {
        u961 u961Var = this.a;
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) u961Var.d;
        if (!toolbarSearchFieldView.getQueryEditText().hasFocus()) {
            u961Var.p();
        }
        if (toolbarSearchFieldView.getQueryEditText().hasFocus()) {
            toolbarSearchFieldView.getQueryEditText().getText().clear();
        } else {
            toolbarSearchFieldView.O0.w();
        }
        Iterator it = ((CopyOnWriteArraySet) u961Var.a).iterator();
        while (it.hasNext()) {
            ((s151) it.next()).a();
        }
    }
}
