package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class zrv0 implements Update {
    public final Next a(Object obj, Object obj2) {
        lvv0 lvv0Var = (lvv0) obj;
        tuv0 tuv0Var = (tuv0) obj2;
        String str = lvv0Var.b;
        boolean z = lvv0Var.f;
        String str2 = lvv0Var.a;
        djw0 djw0Var = lvv0Var.d;
        boolean z2 = lvv0Var.e;
        svv0 svv0Var = lvv0Var.c;
        if (tuv0Var instanceof muv0) {
            return Next.h(lvv0.a(lvv0Var, null, new nvv0(((muv0) tuv0Var).a), false, 59));
        }
        if (tuv0Var instanceof ruv0) {
            return Next.a(Effects.a(new wtv0[]{new wtv0(((ruv0) tuv0Var).a, djw0Var)}));
        }
        if (tuv0Var instanceof puv0) {
            return Next.h(lvv0.a(lvv0Var, null, new pvv0(((puv0) tuv0Var).a), false, 51));
        }
        if (tuv0Var instanceof kuv0) {
            mvv0 mvv0Var = ((kuv0) tuv0Var).a;
            ytv0 ytv0Var = ytv0.a;
            return !z2 ? Next.a(Effects.a(new euv0[]{new cuv0(mvv0Var), ytv0Var})) : Next.i(lvv0.a(lvv0Var, null, new pvv0(mvv0Var), false, 59), Effects.a(new ytv0[]{ytv0Var}));
        }
        if (tuv0Var instanceof juv0) {
            int i = ((juv0) tuv0Var).a;
            if (svv0Var instanceof pvv0) {
                return Next.j();
            }
            return ((svv0Var instanceof ovv0) && ((ovv0) svv0Var).a == i) ? Next.j() : Next.h(lvv0.a(lvv0Var, null, new ovv0(i), false, 51));
        }
        if (tuv0Var instanceof nuv0) {
            return (!(svv0Var instanceof rvv0) || ((rvv0) svv0Var).a) ? Next.j() : Next.h(lvv0.a(lvv0Var, null, new rvv0(true), false, 59));
        }
        if (tuv0Var instanceof suv0) {
            String str3 = ((suv0) tuv0Var).a;
            if (djw0Var != null) {
                return Next.j();
            }
            if (str3.equals("premium")) {
                return Next.a(Effects.a(new auv0[]{auv0.a}));
            }
            return svv0Var instanceof rvv0 ? Next.i(lvv0.a(lvv0Var, str3, null, false, 61), Effects.a(new xtv0[]{new xtv0(str2, str3, djw0Var, z)})) : Next.j();
        }
        if (tuv0Var instanceof quv0) {
            return djw0Var != null ? Next.j() : Next.h(lvv0Var);
        }
        if (!(tuv0Var instanceof luv0)) {
            if (tuv0Var instanceof ouv0) {
                return Next.h(lvv0.a(lvv0Var, null, new pvv0(((ouv0) tuv0Var).a), false, 59));
            }
            eg.o();
            return null;
        }
        boolean z3 = ((luv0) tuv0Var).a;
        if (z2 && (svv0Var instanceof pvv0) && !z3) {
            return Next.i(lvv0.a(lvv0Var, null, null, false, 47), Effects.a(new cuv0[]{new cuv0(((pvv0) svv0Var).a)}));
        }
        return (z2 || str == null || !z3) ? Next.h(lvv0.a(lvv0Var, null, null, z3, 47)) : Next.i(lvv0.a(lvv0Var, null, null, true, 47), Effects.a(new xtv0[]{new xtv0(str2, str, djw0Var, z)}));
    }
}
