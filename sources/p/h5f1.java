package p;

import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$NoTooltipAnchorViewFound;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAnchorView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h5f1 implements r4j0 {
    public final dg30 a;
    public final sic b;
    public final w7q0 c;
    public final z4q0 d;
    public final v1q0 e;
    public final y4q0 f;
    public final n4f1 g;
    public final gw70 h;
    public final i8h1 i;
    public final l6h1 j;
    public final x4f1 k;
    public mmr0 l;
    public final LinkedHashSet m;
    public final bpb1 n;
    public final bpb1 o;

    public h5f1(dg30 dg30Var, t2b t2bVar, sic sicVar, w7q0 w7q0Var, z4q0 z4q0Var, v1q0 v1q0Var, y4q0 y4q0Var, n4f1 n4f1Var, gw70 gw70Var, i8h1 i8h1Var, l6h1 l6h1Var, x4f1 x4f1Var) {
        this.a = dg30Var;
        this.b = sicVar;
        this.c = w7q0Var;
        this.d = z4q0Var;
        this.e = v1q0Var;
        this.f = y4q0Var;
        this.g = n4f1Var;
        this.h = gw70Var;
        this.i = i8h1Var;
        this.j = l6h1Var;
        this.k = x4f1Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.m = linkedHashSet;
        Boolean bool = Boolean.FALSE;
        this.n = gio1.b(bool);
        this.o = gio1.b(bool);
        linkedHashSet.add(fn31.T(cto1.q(dg30Var), (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 1), 3));
    }

    @Override // p.r4j0
    public final void a(MessageResponseToken messageResponseToken, iu30 iu30Var) {
        this.l = new mmr0(messageResponseToken, iu30Var.invoke(messageResponseToken));
    }

    @Override // p.r4j0
    public final void b(Function0 function0) {
        int i;
        mmr0 mmr0Var = this.l;
        if (mmr0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        MessageResponseToken messageResponseToken = (MessageResponseToken) mmr0Var.a;
        Format.Tooltip format = messageResponseToken.getMessageData().getFormat();
        TooltipAnchorView anchorView = format.getAnchorView();
        if (!(anchorView instanceof TooltipAnchorView.Type)) {
            eg.o();
            return;
        }
        WeakReference weakReference = (WeakReference) this.b.a.get(((TooltipAnchorView.Type) anchorView).getType());
        View view = weakReference != null ? (View) weakReference.get() : null;
        dg30 dg30Var = this.a;
        if (view == null) {
            pih1 pih1VarP = yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId());
            Message.CreativeMessage messageData = messageResponseToken.getMessageData();
            String simpleName = dg30Var.getClass().getSimpleName();
            TooltipAnchorView anchorView2 = format.getAnchorView();
            if (!(anchorView2 instanceof TooltipAnchorView.Type)) {
                eg.o();
                return;
            } else {
                this.f.a(pih1VarP, messageData, new DiscardReason$NoTooltipAnchorViewFound(simpleName, ((TooltipAnchorView.Type) anchorView2).getType().name()));
                d();
                return;
            }
        }
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new a5f1(view, this, mmr0Var, format, view));
            return;
        }
        String requestId = messageResponseToken.getRequestId();
        oh31 oh31Var = new oh31();
        int i2 = z4f1.a[format.getTooltipDirection().ordinal()];
        if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            i = 3;
            if (i2 != 3) {
                if (i2 != 4) {
                    eg.o();
                    return;
                }
                i = 4;
            }
        } else {
            i = 2;
        }
        oh31Var.e = i;
        oh31Var.c = new b5f1(mmr0Var, this);
        oh31Var.d = new c5f1(mmr0Var, this);
        ComposeView composeView = new ComposeView(this.a, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        op80 jp80Var = new jp80(new it1(composeView, (byte) 4));
        op80 eq80Var = new eq80(new e3h1(this.j, (n7h1) null, this.i));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(composeView, jp80Var);
        composeView.setContent(new j2i(629604074, new f5f1(mmr0Var, this), true));
        oh31Var.h = composeView;
        x4f1.a(this.k, t2b.e(dg30Var, requestId, oh31Var), view, new d5f1(this, (byte) 2), new g5f1(mmr0Var, this), 4);
    }

    public final void c(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1116656042);
        int i2 = (x340Var.i(qim0Var) ? 32 : 16) | i | (x340Var.g(str) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(m511.e);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ely0 ely0VarA = oi7.a.a(this.h);
            kiv kivVar = gfe0.a;
            boolean zI = x340Var.i(ven0Var) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new x0e1(this, ven0Var, (byte) 12);
                x340Var.s0(objT2);
            }
            mod.c(new ely0[]{ely0VarA, gfe0.d((Function0) objT2, x340Var)}, apo.r(1219339882, new ot91(qim0Var, str, ven0Var, j2iVar, (byte) 3), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(this, j2iVar, qim0Var, str, i, (byte) 6);
        }
    }

    public final void d() {
        this.k.d();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((faa0) it.next()).d((CancellationException) null);
        }
    }

    @Override // p.r4j0
    public final void dismiss() {
        d();
    }
}
