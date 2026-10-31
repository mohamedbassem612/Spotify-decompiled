package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jn61 implements xpw {
    public final Context a;
    public final ogr b;
    public final ljm0 c;
    public final ia00 d;
    public final psw e;

    public jn61(Context context, ogr ogrVar) {
        this.a = context;
        this.b = ogrVar;
        in61 in61Var = new in61(this, (byte) 0);
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        in61 in61Var2 = new in61(this, (byte) 1);
        j2i j2iVar = new j2i(666437009, new wcy0(this, (byte) 6), true);
        xas xasVar = new xas();
        in61Var2.invoke(xasVar);
        this.c = new ljm0(xasVar, in61Var, bs50Var, j2iVar);
        this.d = n3o1.q(this).a(vp51.Z0, new aaq0(this, (byte) 23));
        j2i j2iVar2 = ngj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar2, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(gn61 gn61Var) {
        gu61 gu61Var = gn61Var.a;
        String str = gn61Var.b;
        String str2 = gn61Var.c;
        hma1 hma1VarEdit = ((nu71) this.b.b).a(gu61Var.a).edit();
        hma1VarEdit.a(bma1.b.n(gvg.h("settings_dialog_do_not_show_again_", str, "_", str2)), true);
        hma1VarEdit.g();
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
