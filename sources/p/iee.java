package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iee implements r331, xpw {
    public final q8n a;
    public final cir0 b;
    public final c9c c;
    public final bpb1 d = gio1.b((Object) null);
    public final dt71 e;
    public final e7m0 f;
    public final ia00 g;
    public final psw h;

    public iee(bnw bnwVar, mcp mcpVar, q8n q8nVar, cir0 cir0Var, m3n m3nVar, c9c c9cVar) {
        this.a = q8nVar;
        this.b = cir0Var;
        this.c = c9cVar;
        dt71 dt71VarE = mgo1.e(1, 0, 2, 2);
        this.e = dt71VarE;
        b431 b431VarA = cir0Var.h().a(uj1.y, this);
        rh0 rh0VarH = cir0Var.b().m().h("COVER_ART_PERMISSIONS_REQUEST", new e1r0((byte) 3, false), new dh0(dt71VarE, (byte) 1));
        q8n q8nVar2 = (q8n) ((ypv) ((tnm) mcpVar.a.c).b).b.get();
        c8o.l(q8nVar2);
        ro30 ro30Var = new ro30(q8nVar2, b431VarA, (byte) 19);
        hhm0 hhm0Var = new hhm0((String) null, false, (Uri) null, false, 127);
        n4 n4Var = n4.s;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        qmw qmwVar = new qmw(ro30Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ofw.class), runSequentially.a(qmwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rmw(rh0VarH)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new smw(m3nVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pew.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ymw(bnwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qgw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new anw(bnwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ifw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new umw(bnwVar.e)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jfw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new wmw(new ke71(((tnm) bnwVar.d.a.c).g(), cir0Var, (byte) 12))));
        this.f = sbl.z(hhm0Var, n4Var, new a(bnwVar.a, coroutinesSubtypeEffectHandlerBuilderI), new qza(this, (byte) 6), new hee(this));
        this.g = n3o1.q(this).a(emd.U0, emd.V0);
        j2i j2iVar = new j2i(1553163709, new gtd(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final void e(d331 d331Var) {
        Uri data;
        if (d331Var instanceof y231) {
            Intent intent = (Intent) ((y231) d331Var).a;
            if (intent.getData() == null || (data = intent.getData()) == null) {
                return;
            }
            bpb1 bpb1Var = this.d;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, data);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
