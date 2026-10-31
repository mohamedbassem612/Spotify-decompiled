package p;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.videoview.VideoView;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zoj1 extends zda {
    public final fij1 e;
    public final r2a1 f;
    public final gpr0 g;
    public final gpr0 h;
    public final int i;
    public final hec j;
    public final dzp0 k;
    public final llm l;
    public final pj41 m;
    public VideoView n;

    public zoj1(fij1 fij1Var, r2a1 r2a1Var, gpr0 gpr0Var, gpr0 gpr0Var2, int i, hec hecVar, dzp0 dzp0Var) {
        super(new f3a(2131626307, 2131431594));
        this.e = fij1Var;
        this.f = r2a1Var;
        this.g = gpr0Var;
        this.h = gpr0Var2;
        this.i = i;
        this.j = hecVar;
        this.k = dzp0Var;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        z8n z8nVar = new z8n("VideoFullScreenScene");
        bs50Var.getClass();
        this.l = smo1.e(flo1.l(bs50Var, z8nVar));
        this.m = new nj41(fij1Var.c);
    }

    @Override // p.zda
    public final void a() {
        super.a();
        op71.q(this.l.a, new CancellationException("VideoFullScreenScene disposed"));
        String str = this.e.a;
        dzp0 dzp0Var = this.k;
        j6k1 j6k1Var = (j6k1) ((LinkedHashMap) dzp0Var.d).remove(str);
        if (j6k1Var != null) {
            uoa uoaVar = j6k1Var.a;
            uoaVar.i();
            ((woa) dzp0Var.c).c(uoaVar);
        }
        this.n = null;
    }

    @Override // p.zda
    public final pj41 b() {
        return this.m;
    }

    @Override // p.zda
    public final void c(u6c1 u6c1Var) {
        String str = this.e.a;
        int iC = l1d.C(u6c1Var.a);
        dzp0 dzp0Var = this.k;
        if (iC == 0) {
            dzp0Var.c(str).a().p(2);
        } else if (iC == 1) {
            dzp0Var.c(str).a().o(false);
        } else {
            eg.o();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.spotify.campaigns.videoview.VideoView] */
    @Override // p.zda
    public final void d(ConstraintLayout constraintLayout) {
        ?? r1 = (VideoView) b8k1.n(constraintLayout, 2131431594);
        r1.setVisibility(8);
        r1.setAlpha(1.0f);
        fij1 fij1Var = this.e;
        String str = fij1Var.a;
        Uri uri = fij1Var.b;
        w2k1 w2k1Var = new w2k1();
        djj1 djj1Var = new djj1((byte) 1);
        djj1Var.b = f6k1.a;
        dzp0 dzp0Var = this.k;
        uoa uoaVarA = woa.a((woa) dzp0Var.c, (String) dzp0Var.b, (o2u0) null, w2k1Var, (kma) null, Collections.singletonList(new cv7(djj1Var, (byte) 14)), false, (bas) null, new sn10(false), 746);
        uoaVarA.h(new o2u0(uri.toString(), 14, (Map) null), new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 251));
        if (((j6k1) ((LinkedHashMap) dzp0Var.d).put(str, new j6k1(uoaVarA, w2k1Var, djj1Var))) == null) {
            this.n = r1;
        } else {
            k220.f("Trying to initialize 2 videos with the same videoId: ".concat(str));
        }
    }

    @Override // p.zda
    public final void e() {
        this.k.c(this.e.a).a().f();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.spotify.campaigns.videoview.VideoView, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.zda
    public final void f(uk41 uk41Var) {
        this.d = uk41Var;
        rmr rmrVar = this.b;
        if (rmrVar != null) {
            rmrVar.f();
        }
        ?? r1 = this.n;
        if (r1 != 0) {
            r1.setErrorTitle(this.g);
            r1.setErrorSubtitle(this.h);
            r1.setErrorBackground(this.i);
            fn31.T(this.l, (o8n) null, 0, new k6g1(this, r1, null, (byte) 29), 3);
            zb91 zb91Var = new zb91(this, (byte) 28);
            String str = this.e.a;
            f2g1 f2g1Var = new f2g1(this, (byte) 9);
            dzp0 dzp0Var = this.k;
            j6k1 j6k1VarC = dzp0Var.c(str);
            uoa uoaVar = j6k1VarC.a;
            j6k1VarC.b.a(r1.getT0());
            djj1 djj1Var = j6k1VarC.c;
            g2z g2zVar = new g2z((Object) r1, zb91Var, f2g1Var, dzp0Var, str, this.f);
            djj1Var.c = g2zVar;
            g2zVar.I((i6k1) djj1Var.b);
            uoaVar.q(false);
            uoaVar.l();
            r1.setVisibility(0);
        }
    }

    @Override // p.zda
    public final void g() {
        this.k.c(this.e.a).a().l();
    }

    public final void h(egi1 egi1Var) {
        q881 q881Var;
        if (!(this.m instanceof nj41) || (q881Var = this.c) == null) {
            return;
        }
        ((fgi1) q881Var.b).a.onNext(egi1Var);
    }
}
