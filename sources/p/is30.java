package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class is30 implements h0r0 {
    public final qyj a;
    public final ks30 b;
    public final yr30 c;
    public final w7q0 d;
    public final z4q0 e;
    public final y4q0 f;
    public final v1q0 g;
    public final ldj0 h;
    public final q8n i;
    public final d7q j;
    public boolean k = true;
    public final bpb1 l;
    public final bpb1 m;
    public final cbr0 n;

    public is30(qyj qyjVar, ks30 ks30Var, yr30 yr30Var, w7q0 w7q0Var, z4q0 z4q0Var, y4q0 y4q0Var, v1q0 v1q0Var, ldj0 ldj0Var, q8n q8nVar, d7q d7qVar) {
        p6r0 p6r0VarD2;
        this.a = qyjVar;
        this.b = ks30Var;
        this.c = yr30Var;
        this.d = w7q0Var;
        this.e = z4q0Var;
        this.f = y4q0Var;
        this.g = v1q0Var;
        this.h = ldj0Var;
        this.i = q8nVar;
        this.j = d7qVar;
        Boolean bool = Boolean.FALSE;
        this.l = gio1.b(bool);
        this.m = gio1.b(bool);
        if (ks30Var.a().getMessageData().getFormat().getTemplate() instanceof FullscreenTemplate.JitFullscreen) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarD2 = yon1.e2();
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarD2 = yon1.d2();
        }
        this.n = new cbr0(new dbr0[]{new bn70(p6r0VarD2, nik1.M1, (nar0) null), new s9h1(14, true, false, false), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.n;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(588089478, new hs30(this), true));
    }
}
