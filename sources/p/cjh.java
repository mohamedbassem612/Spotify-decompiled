package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cjh extends hgh {
    public final /* synthetic */ byte W0;
    public final qzh X0;
    public final boolean Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjh(qzh qzhVar, boolean z, byte b) {
        super(qzhVar.getView(), rc11.a.b(ekh.class));
        this.W0 = b;
        switch (b) {
            case 1:
                super(qzhVar.getView(), rc11.a.b(hkh.class));
                this.X0 = qzhVar;
                this.Y0 = z;
                Context context = qzhVar.getView().getContext();
                boolean z2 = context.getResources().getConfiguration().getLayoutDirection() == 1;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165904) + (context.getResources().getDimensionPixelSize(2131165897) * 2);
                View view = qzhVar.getView();
                view.setPadding(!z2 ? dimensionPixelSize : 0, view.getPaddingTop(), z2 ? dimensionPixelSize : 0, view.getPaddingBottom());
                break;
            default:
                this.X0 = qzhVar;
                this.Y0 = z;
                break;
        }
    }

    @Override // p.hgh
    public final void F(pkh pkhVar, int i, qka qkaVar) {
        byte b = this.W0;
        qzh qzhVar = this.X0;
        switch (b) {
            case 0:
                qzhVar.n(new gu2((ekh) pkhVar, i, qkaVar, (byte) 9));
                break;
            default:
                qzhVar.n(new ju01((hkh) pkhVar, i, qkaVar, (byte) 3));
                break;
        }
    }

    @Override // p.hgh
    public final void G(pkh pkhVar, int i, boolean z, String str) {
        int i2;
        whh whhVar;
        ComposeView composeView;
        View childAt;
        whh whhVar2;
        View childAt2;
        byte b = this.W0;
        boolean z2 = this.Y0;
        qzh qzhVar = this.X0;
        switch (b) {
            case 0:
                ekh ekhVar = (ekh) pkhVar;
                Comment comment = ekhVar.b;
                int iP = comment.p();
                i2 = iP != 0 ? bjh.a[l1d.C(iP)] : -1;
                if (i2 != 1) {
                    whhVar = i2 != 2 ? new whh() : new vhh(comment.B().p(), comment.B().o());
                } else {
                    whhVar = new whh(comment.E().q(), comment.E().p(), comment.E().getUsername(), z2 && comment.E().o());
                }
                qzhVar.f(new fih(whhVar, comment.q(), i, comment.r(), z, (String) o7h.s0(comment.s()), comment.w(), comment.x(), comment.t(), str, ekhVar.c, comment.A(), ekhVar.d, w6p1.h(ekhVar.e, comment.C())));
                ComposeView view = qzhVar.getView();
                composeView = view instanceof ComposeView ? view : null;
                if (composeView != null && (childAt = composeView.getChildAt(0)) != null) {
                    childAt.requestLayout();
                    break;
                }
                break;
            default:
                hkh hkhVar = (hkh) pkhVar;
                Reply reply = hkhVar.b;
                int iN = reply.n();
                i2 = iN != 0 ? th21.a[l1d.C(iN)] : -1;
                if (i2 != 1) {
                    whhVar2 = i2 != 2 ? new whh() : new vhh(reply.v().p(), reply.v().o());
                } else {
                    whhVar2 = new whh(reply.x().q(), reply.x().p(), reply.x().getUsername(), z2 && reply.x().o());
                }
                qzhVar.f(new fih(whhVar2, reply.u(), i, reply.o(), z, (String) null, reply.r(), false, reply.p(), str, hkhVar.c, reply.t(), false, w6p1.h(hkhVar.d, reply.w())));
                ComposeView view2 = qzhVar.getView();
                composeView = view2 instanceof ComposeView ? view2 : null;
                if (composeView != null && (childAt2 = composeView.getChildAt(0)) != null) {
                    childAt2.requestLayout();
                    break;
                }
                break;
        }
    }
}
