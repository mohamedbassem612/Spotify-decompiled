package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class pm2 implements Update {
    public static final pm2 a = new pm2();

    public final Next a(Object obj, Object obj2) {
        xm2 xm2Var = (xm2) obj;
        nm2 nm2Var = (nm2) obj2;
        rk2 rk2Var = xm2Var.a;
        if (nm2Var instanceof dm2) {
            pk2 pk2Var = ((dm2) nm2Var).a;
            qk2 qk2VarA = rk2Var.a();
            qk2VarA.a = 2;
            qk2VarA.d = pk2Var.a;
            qk2VarA.g = 2131952102;
            qk2VarA.h = 2131952097;
            qk2VarA.i = pk2Var.b;
            qk2VarA.j = false;
            return Next.h(new um2(qk2VarA.a()));
        }
        if (nm2Var.equals(cm2.a)) {
            qk2 qk2VarA2 = rk2Var.a();
            qk2VarA2.a = 3;
            qk2VarA2.f = 2131952098;
            qk2VarA2.g = 2131952101;
            qk2VarA2.h = 2131952097;
            qk2VarA2.j = false;
            return Next.h(new tm2(qk2VarA2.a()));
        }
        boolean zEquals = nm2Var.equals(cm2.b);
        xk2 xk2Var = xk2.a;
        if (zEquals) {
            return Next.a(Effects.a(new xk2[]{xk2Var}));
        }
        if (nm2Var.equals(cm2.c)) {
            return Next.a(Effects.a(new xk2[]{xk2Var}));
        }
        if (!nm2Var.equals(cm2.d)) {
            if (nm2Var instanceof hm2) {
                return Next.a(Effects.a(new zk2[]{new zk2(((hm2) nm2Var).a)}));
            }
            eg.o();
            return null;
        }
        if (!(xm2Var instanceof tm2)) {
            if (!(xm2Var instanceof um2)) {
                return Next.j();
            }
            String str = ((um2) xm2Var).b.i;
            str.getClass();
            return Next.a(Effects.a(new zk2[]{new zk2(str)}));
        }
        qk2 qk2VarA3 = ((tm2) xm2Var).b.a();
        qk2VarA3.a = 4;
        qk2VarA3.f = 2131952098;
        qk2VarA3.g = 0;
        qk2VarA3.h = 2131952097;
        qk2VarA3.j = true;
        return Next.i(new vm2(qk2VarA3.a()), Effects.a(new el2[]{el2.a}));
    }
}
