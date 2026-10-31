package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s64 implements x310 {
    public final /* synthetic */ byte a;
    public final Object b;

    public s64(uw0 uw0Var, ynb0 ynb0Var) {
        this.a = (byte) 0;
        this.b = new idd1(new ft0(uw0Var, ynb0Var, (byte) 1));
    }

    public final boolean a(r9c r9cVar) {
        switch (this.a) {
            case 0:
                return "com.spotify.androidauto.home".equals(r9cVar.e());
            case 1:
                if (r9cVar.g() == null || !r9cVar.g().equals("default-cars") || r9cVar.f() != 1 || !r9cVar.l()) {
                    return false;
                }
                n57.s("CarIntegrationsRootLoader is being used");
                return true;
            case 2:
                m210 m210VarB = r9cVar.b();
                if (m210VarB != null) {
                    return u890.j(m210VarB.f, "widget");
                }
                return false;
            default:
                return r9cVar.j() && o7h.i0(zgl.a(), r9cVar.c());
        }
    }

    public final w310 b(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (w6o0) ((idd1) obj).getValue();
            case 1:
                return (w310) ((ynb0) obj).get();
            case 2:
                return (v1v0) obj;
            default:
                return ((uw0) obj).n(4);
        }
    }

    public /* synthetic */ s64(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
