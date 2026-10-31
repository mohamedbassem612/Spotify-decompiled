package p;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.nowplayingqueue.bottomsheet.view.JamHeaderContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueInteractionLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mnb0 {
    public final QueueInteractionLayout a;
    public final ConstraintLayout b;
    public final RecyclerView c;
    public final JamHeaderContainerView d;
    public final ComposeView e;

    public mnb0(mnb0 mnb0Var) {
        this.a = mnb0Var.a;
        this.b = mnb0Var.b;
        this.c = mnb0Var.c;
        this.d = mnb0Var.d;
        this.e = mnb0Var.e;
    }

    public mnb0(QueueInteractionLayout queueInteractionLayout, JamHeaderContainerView jamHeaderContainerView, ConstraintLayout constraintLayout, ComposeView composeView, RecyclerView recyclerView) {
        this.a = queueInteractionLayout;
        this.d = jamHeaderContainerView;
        this.b = constraintLayout;
        this.e = composeView;
        this.c = recyclerView;
    }
}
