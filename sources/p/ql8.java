package p;

import com.spotify.messages.ZeroFrictionAuthentication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ql8 implements ol8 {
    public final p3n1 a;
    public final x2g1 b;
    public final dp21 c;
    public final i5u d;
    public final vo5 e;
    public final List f = p7h.M(ek8.c, hk8.c, ik8.c, jk8.c, nk8.c, uk8.c, vk8.c, xk8.c, wk8.c, lk8.c, kk8.c, rk8.c, dk8.c, tk8.c, mk8.c, qk8.c, pk8.c, fk8.c, gk8.c, sk8.c, ok8.c);

    public ql8(p3n1 p3n1Var, x2g1 x2g1Var, dp21 dp21Var, i5u i5uVar, vo5 vo5Var) {
        this.a = p3n1Var;
        this.b = x2g1Var;
        this.c = dp21Var;
        this.d = i5uVar;
        this.e = vo5Var;
    }

    @Override // p.ol8
    public final void a(ck8 ck8Var) {
        Object obj;
        List listM;
        pl8 pl8Var = new pl8(ck8Var.c, ck8Var.a, ck8Var.d);
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            yk8 yk8Var = (yk8) next;
            bk8 bk8Var = bk8.O0;
            bk8 bk8Var2 = bk8.g;
            bk8 bk8Var3 = bk8.Z;
            bk8 bk8Var4 = bk8.e;
            bk8 bk8Var5 = bk8.c;
            bk8 bk8Var6 = bk8.d;
            bk8 bk8Var7 = bk8.f;
            bk8 bk8Var8 = bk8.a;
            Iterator it2 = it;
            if (u890.j(yk8Var, ek8.c)) {
                pl8 pl8Var2 = new pl8("password", false, bk8Var8);
                pl8 pl8Var3 = new pl8("oneTimeToken", false, bk8Var8);
                pl8 pl8Var4 = new pl8("storedCredentials", false, bk8Var8);
                bk8 bk8Var9 = bk8.h;
                listM = p7h.M(pl8Var2, pl8Var3, pl8Var4, new pl8("identityless", false, bk8Var9), new pl8("oneTimeToken", false, bk8Var9));
            } else if (u890.j(yk8Var, hk8.c)) {
                listM = p7h.M(new pl8("password", true, bk8Var8), new pl8("oneTimeToken", true, bk8Var8));
            } else if (u890.j(yk8Var, ik8.c)) {
                listM = p7h.M(new pl8("facebook", false, bk8Var7), new pl8("storedCredentials", false, bk8Var7));
            } else if (u890.j(yk8Var, jk8.c)) {
                listM = p7h.M(new pl8("facebook", true, bk8Var7), new pl8("oneTimeToken", true, bk8Var7));
            } else if (u890.j(yk8Var, nk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", false, bk8.b));
            } else if (u890.j(yk8Var, uk8.c)) {
                listM = p7h.M(new pl8("phoneNumber", false, bk8Var6), new pl8("storedCredentials", false, bk8Var6));
            } else if (u890.j(yk8Var, vk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", true, bk8Var6));
            } else if (u890.j(yk8Var, xk8.c)) {
                listM = p7h.M(new pl8("oneTimeToken", true, bk8Var5), new pl8("samsungsignin", true, bk8Var5), new pl8("password", true, bk8Var5));
            } else if (u890.j(yk8Var, wk8.c)) {
                listM = p7h.M(new pl8("oneTimeToken", false, bk8Var5), new pl8("samsungsignin", false, bk8Var5));
            } else if (u890.j(yk8Var, lk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", true, bk8Var4));
            } else if (u890.j(yk8Var, kk8.c)) {
                listM = p7h.M(new pl8("googleSignIn", false, bk8Var4), new pl8("storedCredentials", false, bk8Var4));
            } else if (u890.j(yk8Var, rk8.c)) {
                listM = k4p1.x(new pl8("parentChild", false, bk8.i));
            } else if (u890.j(yk8Var, dk8.c)) {
                listM = p7h.M(new pl8("password", false, bk8Var3), new pl8("oneTimeToken", false, bk8Var3));
            } else if (u890.j(yk8Var, tk8.c)) {
                listM = k4p1.x(new pl8("authnPlatform", false, bk8Var3));
            } else if (u890.j(yk8Var, mk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", true, bk8.N0));
            } else if (u890.j(yk8Var, pk8.c)) {
                listM = k4p1.x(new pl8("naver", false, bk8Var2));
            } else if (u890.j(yk8Var, qk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", true, bk8Var2));
            } else if (u890.j(yk8Var, fk8.c)) {
                listM = p7h.M(new pl8("password", false, bk8Var), new pl8("oneTimeToken", false, bk8Var));
            } else if (u890.j(yk8Var, gk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", true, bk8Var));
            } else if (u890.j(yk8Var, sk8.c)) {
                listM = k4p1.x(new pl8("oneTimeToken", false, bk8.Y));
            } else {
                if (!u890.j(yk8Var, ok8.c)) {
                    eg.o();
                    return;
                }
                listM = p7h.M(new pl8("oneTimeToken", false, bk8.t), new pl8("oneTimeToken", false, bk8.X));
            }
            if (listM.contains(pl8Var)) {
                obj = next;
                break;
            }
            it = it2;
        }
        yk8 yk8Var2 = (yk8) obj;
        if (yk8Var2 == null) {
            n57.e("No matcher for this authentication data, username=" + ck8Var.b + ", accountWasCreated=" + ck8Var.a + ", authType=" + ck8Var.c + ", authSource=" + ck8Var.d);
            return;
        }
        Objects.toString(yk8Var2.b);
        n3n1 n3n1VarN = ZeroFrictionAuthentication.n();
        n3n1VarN.v(this.b.a.a());
        n3n1VarN.u(this.b.a.b());
        n3n1VarN.t(this.c.a.k(dp21.b));
        n3n1VarN.q(yk8Var2.a);
        n3n1VarN.r(yk8Var2.b.a);
        n3n1VarN.s(yk8Var2.b.b);
        n3n1VarN.n(this.e.a.a());
        ZeroFrictionAuthentication zeroFrictionAuthentication = (ZeroFrictionAuthentication) n3n1VarN.build();
        String str = ck8Var.b;
        boolean z = this.d.a;
        if (z && str != null) {
            p3n1 p3n1Var = this.a;
            zeroFrictionAuthentication.getClass();
            p3n1Var.c.b(zeroFrictionAuthentication.toByteArray(), str);
            return;
        }
        if (z) {
            n57.e("Username is null in onSuccess, falling back to queued publish");
        }
        p3n1 p3n1Var2 = this.a;
        zeroFrictionAuthentication.getClass();
        nt71 nt71Var = p3n1Var2.b;
        synchronized ("authenticated_message_lock") {
            dma1 dma1Var = nt71Var.a;
            bma1 bma1Var = nt71.b;
            String strE = dma1Var.e(bma1Var, (String) null);
            ArrayList arrayList = new ArrayList(strE != null ? x3p1.k(strE) : z6x.a);
            arrayList.add(zeroFrictionAuthentication);
            hma1 hma1VarEdit = nt71Var.a.edit();
            hma1VarEdit.d(bma1Var, x3p1.p(arrayList));
            hma1VarEdit.g();
        }
    }
}
