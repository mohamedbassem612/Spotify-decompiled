package p;

import com.google.protobuf.h;
import com.spotify.show_esperanto.proto.GetShowRequest;
import com.spotify.show_esperanto.proto.QueryFilter;
import com.spotify.show_esperanto.proto.d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qos {
    public final GetShowRequest a(b481 b481Var) {
        oia1 oia1Var;
        GetShowRequest.Range.Focus focus;
        com.spotify.show_esperanto.proto.a aVarN = GetShowRequest.n();
        aVarN.y(b481Var.f());
        aVarN.A(500);
        x0z0 x0z0VarN = QueryFilter.n();
        if (u890.j(b481Var.h(), Boolean.TRUE)) {
            x0z0VarN.n();
        }
        i620 i620VarC = b481Var.c();
        if (i620VarC instanceof i620) {
            x0z0VarN.r(i620VarC.v());
        } else if (i620VarC.equals(g620.c)) {
            x0z0VarN.s();
        } else if (i620VarC.equals(g620.g)) {
            x0z0VarN.t();
        } else if (i620VarC.equals(g620.h)) {
            x0z0VarN.q();
        } else if (i620VarC.equals(g620.e)) {
            x0z0VarN.u(b1z0.c);
        } else if (i620VarC.equals(g620.f)) {
            x0z0VarN.u(b1z0.b);
        } else if (!i620VarC.equals(g620.d)) {
            eg.o();
            return null;
        }
        aVarN.u(x0z0VarN.build());
        int iC = l1d.C(b481Var.g());
        if (iC == 0) {
            oia1Var = oia1.b;
        } else if (iC == 1) {
            oia1Var = oia1.c;
        } else if (iC == 2) {
            oia1Var = oia1.d;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            oia1Var = oia1.e;
        }
        aVarN.z(oia1Var);
        aVarN.r();
        Boolean boolE = b481Var.e();
        aVarN.t(boolE != null ? boolE.booleanValue() : false);
        t881 t881VarD = b481Var.d();
        y381 y381Var = t881VarD != null ? t881VarD.a : null;
        if (y381Var != null) {
            x381 x381Var = y381Var.b;
            if (x381Var != null) {
                aVarN.n(i481.a(x381Var));
            }
            e3z e3zVar = y381Var.a;
            if (e3zVar != null) {
                aVarN.s(j481.a(e3zVar));
            }
            aqa0 aqa0Var = y381Var.c;
            if (aqa0Var != null) {
                aVarN.x(pvc.n(aqa0Var));
            }
        }
        o8z o8zVarB = b481Var.b();
        com.spotify.show_esperanto.proto.b bVarN = GetShowRequest.Range.n();
        if (o8zVarB instanceof o8z) {
            bVarN.r(0);
            bVarN.q(o8zVarB.E());
        } else {
            if (!(o8zVarB instanceof r8z)) {
                eg.o();
                return null;
            }
            r8z r8zVar = (r8z) o8zVarB;
            q8z q8zVarF = r8zVar.F();
            if (q8zVarF.equals(p8z.c)) {
                com.spotify.show_esperanto.proto.c cVarN = GetShowRequest.Range.Focus.n();
                cVarN.q(d.c);
                h hVarBuild = cVarN.build();
                hVarBuild.getClass();
                focus = (GetShowRequest.Range.Focus) hVarBuild;
            } else if (q8zVarF.equals(p8z.d)) {
                com.spotify.show_esperanto.proto.c cVarN2 = GetShowRequest.Range.Focus.n();
                cVarN2.q(d.b);
                h hVarBuild2 = cVarN2.build();
                hVarBuild2.getClass();
                focus = (GetShowRequest.Range.Focus) hVarBuild2;
            } else {
                com.spotify.show_esperanto.proto.c cVarN3 = GetShowRequest.Range.Focus.n();
                cVarN3.q(d.d);
                cVarN3.n(q8zVarF.y());
                GetShowRequest.Range.Focus focusBuild = cVarN3.build();
                focusBuild.getClass();
                focus = focusBuild;
            }
            bVarN.n(focus);
            bVarN.q(r8zVar.E());
        }
        aVarN.w(bVarN.build());
        return aVarN.build();
    }
}
