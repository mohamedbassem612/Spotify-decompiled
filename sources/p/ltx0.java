package p;

import android.view.View;
import com.spotify.aiplaylist.promptcreation.presentation.PromptCreationHeaderView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ltx0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PromptCreationHeaderView b;

    public /* synthetic */ ltx0(PromptCreationHeaderView promptCreationHeaderView, byte b) {
        this.a = b;
        this.b = promptCreationHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        PromptCreationHeaderView promptCreationHeaderView = this.b;
        switch (b) {
            case 0:
                Function0 function0 = promptCreationHeaderView.W0;
                if (function0 != null) {
                    function0.invoke();
                    return;
                } else {
                    u890.C("onMoreOptionsButtonClick");
                    throw null;
                }
            case 1:
                Function0 function1 = promptCreationHeaderView.V0;
                if (function1 != null) {
                    function1.invoke();
                    return;
                } else {
                    u890.C("onCloseClick");
                    throw null;
                }
            default:
                Function0 function2 = promptCreationHeaderView.U0;
                if (function2 != null) {
                    function2.invoke();
                    return;
                } else {
                    u890.C("onBackClick");
                    throw null;
                }
        }
    }
}
