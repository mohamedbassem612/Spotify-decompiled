package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uem0 implements h0r0 {
    public final qyj a;
    public final wem0 b;
    public final iem0 c;
    public final w7q0 d;
    public final z4q0 e;
    public final y4q0 f;
    public final v1q0 g;
    public final ldj0 h;
    public final d7q i;
    public final w8s j;
    public final v8s k;
    public final q8n l;
    public boolean m = true;
    public final bpb1 n;
    public final bpb1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cbr0 f88p;

    public uem0(qyj qyjVar, wem0 wem0Var, iem0 iem0Var, w7q0 w7q0Var, z4q0 z4q0Var, y4q0 y4q0Var, v1q0 v1q0Var, ldj0 ldj0Var, d7q d7qVar, w8s w8sVar, v8s v8sVar, q8n q8nVar) {
        p6r0 p6r0VarG2;
        this.a = qyjVar;
        this.b = wem0Var;
        this.c = iem0Var;
        this.d = w7q0Var;
        this.e = z4q0Var;
        this.f = y4q0Var;
        this.g = v1q0Var;
        this.h = ldj0Var;
        this.i = d7qVar;
        this.j = w8sVar;
        this.k = v8sVar;
        this.l = q8nVar;
        Boolean bool = Boolean.FALSE;
        this.n = gio1.b(bool);
        this.o = gio1.b(bool);
        if (wem0Var.a().getMessageData().getFormat().getTemplate() instanceof ModalTemplate.JitModal) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG2 = yon1.f2();
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG2 = yon1.g2();
        }
        this.f88p = new cbr0(new dbr0[]{new bn70(p6r0VarG2, nik1.M1, (nar0) null), new s9h1(14, true, false, false), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f88p;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(600846008, new tem0(this), true));
    }
}
