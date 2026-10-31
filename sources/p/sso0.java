package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/sso0;", "Lp/hip;", "Lp/o6r0;", "<init>", "()V", "src_main_java_com_spotify_notifications_permissionsimpl-permissionsimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class sso0 extends hip implements o6r0 {
    public pf30 G1;
    public dma1 H1;
    public bnj0 I1;
    public qnv0 J1;

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("PERMISSIONS_NOTIFICATIONS_PROMPT", "permissions-notifications-prompt", 1427, "permissions-notifications-prompt");
    }

    public final void v0(Context context) {
        super.v0(context);
        this.G1 = a0(pso0.a, new e1r0((byte) 4));
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        if (bundle == null) {
            bnj0 bnj0Var = this.I1;
            if (bnj0Var == null) {
                u890.C("ubiLogger");
                throw null;
            }
            i8h1 i8h1Var = (i8h1) bnj0Var.b;
            x6h1 x6h1VarC = ((yvk0) bnj0Var.c).b.c();
            x6h1VarC.i.add(new a7h1("reinstall_opt_in_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            bnj0 bnj0Var2 = this.I1;
            if (bnj0Var2 == null) {
                u890.C("ubiLogger");
                throw null;
            }
            i8h1 i8h1Var2 = (i8h1) bnj0Var2.b;
            x6h1 x6h1VarC2 = ((yvk0) bnj0Var2.c).b.c();
            x6h1VarC2.i.add(new a7h1("reinstall_dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var2.f(k7h1Var2.a(), (Set) null);
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super/*p.zf30*/.x0(layoutInflater, viewGroup, bundle);
        N0().J().a(n0(), new ydb(this, (byte) 17));
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(1013707315, new rso0(this, (byte) 1), true));
        return composeView;
    }
}
