package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class gcu0 implements pf40 {
    public static final gcu0 a;
    private static final h661 descriptor;

    static {
        gcu0 gcu0Var = new gcu0();
        a = gcu0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.PlayerRestrictions", gcu0Var, 6);
        m0v0Var.j("can_skip_next", false);
        m0v0Var.j("can_skip_prev", false);
        m0v0Var.j("can_repeat_track", false);
        m0v0Var.j("can_repeat_context", false);
        m0v0Var.j("can_toggle_shuffle", false);
        m0v0Var.j("can_seek", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{gpbVar, gpbVar, gpbVar, gpbVar, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    break;
                case 0:
                    zM = x1kVarB.M(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zM2 = x1kVarB.M(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zM3 = x1kVarB.M(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zM4 = x1kVarB.M(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zM5 = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zM6 = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new icu0(i, zM, zM2, zM3, zM4, zM5, zM6);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        icu0 icu0Var = (icu0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, icu0Var.a);
        z1kVarB.E(h661Var, 1, icu0Var.b);
        z1kVarB.E(h661Var, 2, icu0Var.c);
        z1kVarB.E(h661Var, 3, icu0Var.d);
        z1kVarB.E(h661Var, 4, icu0Var.e);
        z1kVarB.E(h661Var, 5, icu0Var.f);
        z1kVarB.a(h661Var);
    }
}
