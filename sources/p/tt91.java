package p;

import android.app.Application;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tt91 implements r4j0 {
    public final dg30 a;
    public final vox0 b;
    public final w7q0 c;
    public final z4q0 d;
    public final v1q0 e;
    public final y4q0 f;
    public final kr91 g;
    public final gw70 h;
    public final i8h1 i;
    public final l6h1 j;
    public final q8n k;
    public mmr0 l;
    public sox0 m;
    public final LinkedHashSet n;
    public final bpb1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bpb1 f78p;

    public tt91(q8n q8nVar, dg30 dg30Var, gw70 gw70Var, v1q0 v1q0Var, y4q0 y4q0Var, z4q0 z4q0Var, w7q0 w7q0Var, vox0 vox0Var, kr91 kr91Var, l6h1 l6h1Var, i8h1 i8h1Var) {
        this.a = dg30Var;
        this.b = vox0Var;
        this.c = w7q0Var;
        this.d = z4q0Var;
        this.e = v1q0Var;
        this.f = y4q0Var;
        this.g = kr91Var;
        this.h = gw70Var;
        this.i = i8h1Var;
        this.j = l6h1Var;
        this.k = q8nVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.n = linkedHashSet;
        Boolean bool = Boolean.FALSE;
        this.o = gio1.b(bool);
        this.f78p = gio1.b(bool);
        linkedHashSet.add(fn31.T(cto1.q(dg30Var), (o8n) null, 0, new b751(this, (lnm) null, (byte) 27), 3));
    }

    @Override // p.r4j0
    public final void a(MessageResponseToken messageResponseToken, iu30 iu30Var) {
        this.l = new mmr0(messageResponseToken, iu30Var.invoke(messageResponseToken));
    }

    @Override // p.r4j0
    public final void b(Function0 function0) {
        sox0 sox0Var;
        mmr0 mmr0Var = this.l;
        if (mmr0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        SnackBarTemplate snackBarTemplate = (SnackBarTemplate) mmr0Var.b;
        rox0 rox0Var = new rox0(snackBarTemplate.text(), snackBarTemplate.buttonText(), snackBarTemplate.primaryButton() != null ? new d37((byte) 12) : null, new q081(this, mmr0Var, (byte) 16));
        vox0 vox0Var = this.b;
        g0i g0iVar = (g0i) vox0Var.b.c.a.getValue();
        if (g0iVar == null) {
            sox0Var = new sox0(vox0Var, wox0.g);
        } else {
            sox0Var = new sox0(vox0Var, wox0.a);
            rl1 rl1Var = new rl1(sox0Var, rox0Var, j991.D((Application) vox0Var.c.a.a.x1.a));
            rl1Var.e = new tox0(sox0Var, (byte) 0);
            kt91 kt91Var = vox0Var.a;
            d3j0 d3j0Var = new d3j0(new z2j0(false), x2j0.a);
            tox0 tox0Var = new tox0(sox0Var, (byte) 1);
            int i = mr91.b;
            kt91.m(kt91Var, rl1Var, n4j0.a, d3j0Var, g0iVar, (iu30) null, tox0Var, e9k.q(), 16);
        }
        this.m = sox0Var;
        this.n.add(fn31.T(smo1.e(flo1.l(op71.f(), this.k)), (o8n) null, 0, new uk71(sox0Var, this, mmr0Var, (lnm) null, (byte) 20), 3));
    }

    public final void c(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1458644513);
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
                objT2 = new fh61(this, ven0Var, (byte) 28);
                x340Var.s0(objT2);
            }
            mod.c(new ely0[]{ely0VarA, gfe0.d((Function0) objT2, x340Var)}, apo.r(-1798760095, new ot91(qim0Var, str, ven0Var, j2iVar, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, j2iVar, qim0Var, str, (byte) 13);
        }
    }

    public final void d() {
        sox0 sox0Var = this.m;
        if (sox0Var != null && sox0Var.b.a.getValue() == wox0.b) {
            sox0Var.c.a.b();
        }
        this.m = null;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((faa0) it.next()).d((CancellationException) null);
        }
    }

    @Override // p.r4j0
    public final void dismiss() {
        d();
    }
}
