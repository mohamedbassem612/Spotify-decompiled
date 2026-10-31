package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g7a implements r4j0 {
    public final y6a a;
    public final l4q b;
    public final gw70 c;
    public final w7q0 d;
    public final y4q0 e;
    public final v1q0 f;
    public final q8n g;
    public mmr0 h;
    public z7a i;
    public final LinkedHashSet j;
    public final bpb1 k;
    public final bpb1 l;

    public g7a(y6a y6aVar, q8n q8nVar, l4q l4qVar, dg30 dg30Var, gw70 gw70Var, v1q0 v1q0Var, y4q0 y4q0Var, w7q0 w7q0Var) {
        this.a = y6aVar;
        this.b = l4qVar;
        this.c = gw70Var;
        this.d = w7q0Var;
        this.e = y4q0Var;
        this.f = v1q0Var;
        this.g = q8nVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.j = linkedHashSet;
        Boolean bool = Boolean.FALSE;
        this.k = gio1.b(bool);
        this.l = gio1.b(bool);
        linkedHashSet.add(fn31.T(cto1.q(dg30Var), (o8n) null, 0, new vk6(this, (lnm) null, (byte) 7), 3));
    }

    @Override // p.r4j0
    public final void a(MessageResponseToken messageResponseToken, iu30 iu30Var) {
        this.h = new mmr0(messageResponseToken, iu30Var.invoke(messageResponseToken));
    }

    @Override // p.r4j0
    public final void b(Function0 function0) {
        y2j0 y2j0Var;
        MessageResponseToken messageResponseToken;
        MessageRequest messageRequest;
        d3j0 orchestrationMetadata;
        MessageResponseToken messageResponseToken2;
        MessageRequest messageRequest2;
        d3j0 orchestrationMetadata2;
        if (this.i == null) {
            f5a f5aVar = new f5a(new d7a(this));
            mmr0 mmr0Var = this.h;
            c3j0 c3j0Var = (mmr0Var == null || (messageResponseToken2 = (MessageResponseToken) mmr0Var.a) == null || (messageRequest2 = messageResponseToken2.getMessageRequest()) == null || (orchestrationMetadata2 = messageRequest2.getOrchestrationMetadata()) == null) ? null : orchestrationMetadata2.a;
            boolean z = c3j0Var instanceof z2j0 ? ((z2j0) c3j0Var).a : false;
            mmr0 mmr0Var2 = this.h;
            if (mmr0Var2 == null || (messageResponseToken = (MessageResponseToken) mmr0Var2.a) == null || (messageRequest = messageResponseToken.getMessageRequest()) == null || (orchestrationMetadata = messageRequest.getOrchestrationMetadata()) == null || (y2j0Var = orchestrationMetadata.b) == null) {
                y2j0Var = x2j0.a;
            }
            z7a z7aVarB = this.a.b(f5aVar, z, y2j0Var);
            xab1 xab1VarT = fn31.T(smo1.e(flo1.l(op71.f(), igu.b)), (o8n) null, 0, new w7a(z7aVarB, new e7a(this, null, (byte) 0), (lnm) null, (byte) 2), 3);
            LinkedHashSet linkedHashSet = this.j;
            linkedHashSet.add(xab1VarT);
            gaa0 gaa0VarF = op71.f();
            q8n q8nVar = this.g;
            linkedHashSet.add(fn31.T(smo1.e(flo1.l(gaa0VarF, q8nVar)), (o8n) null, 0, new w7a(z7aVarB, new f7a(this, null), (lnm) null, (byte) 0), 3));
            linkedHashSet.add(fn31.T(smo1.e(flo1.l(op71.f(), q8nVar)), (o8n) null, 0, new w7a(z7aVarB, new e7a(this, null, (byte) 1), (lnm) null, (byte) 1), 3));
            this.i = z7aVarB;
        }
    }

    public final void c(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-794569933);
        int i2 = (x340Var.i(qim0Var) ? 32 : 16) | i | (x340Var.g(str) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mod.b(oi7.a.a(this.c), apo.r(1782777459, new z6a(qim0Var, str, j2iVar, (byte) 0), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, this, j2iVar, qim0Var, str, (byte) 22);
        }
    }

    @Override // p.r4j0
    public final void dismiss() {
        z7a z7aVar = this.i;
        if (z7aVar != null) {
            z7aVar.a();
        }
        this.i = null;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((faa0) it.next()).d((CancellationException) null);
        }
    }
}
