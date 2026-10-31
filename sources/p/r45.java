package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r45 implements pdy0 {
    public final boolean a;
    public final int b;
    public final q45 c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public r45(boolean z, int i, q45 q45Var, boolean z2, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = q45Var;
        this.d = z2;
        this.e = lukVar;
        this.f = new idd1(new k25(this, (byte) 24));
    }

    public final boolean a() {
        r45 r45Var = (r45) this.f.getValue();
        return r45Var != null ? r45Var.a() : this.a;
    }

    public final int b() {
        r45 r45Var = (r45) this.f.getValue();
        return r45Var != null ? r45Var.b() : this.b;
    }

    public final q45 c() {
        q45 q45VarC;
        r45 r45Var = (r45) this.f.getValue();
        return (r45Var == null || (q45VarC = r45Var.c()) == null) ? this.c : q45VarC;
    }

    public final boolean d() {
        r45 r45Var = (r45) this.f.getValue();
        return r45Var != null ? r45Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("prevent_stacked_pages", "android-the-stage-vtec", a());
        fpb fpbVar2 = new fpb("rehearsal_port", "android-the-stage-vtec", b(), 1, 49151);
        String str = c().a;
        q45[] q45VarArrValues = q45.values();
        ArrayList arrayList = new ArrayList(q45VarArrValues.length);
        for (q45 q45Var : q45VarArrValues) {
            arrayList.add(q45Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, new fpb("rehearsal_site_override", "android-the-stage-vtec", str, arrayList), new fpb("remote_debugging_enabled", "android-the-stage-vtec", d()));
    }

    public r45(luk lukVar) {
        this(true, 8080, q45.NONE, false, lukVar);
    }
}
