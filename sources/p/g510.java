package p;

import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteInteraction;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g510 {
    public final t2j0 a;
    public final sjq0 b;
    public final g0l c;
    public final i8h1 d;
    public final d48 e;
    public final kly0 f;
    public final List g = p7h.M("com.android.bluetooth", "com.google.android.bluetooth");
    public final uqk0 h = new uqk0();

    public g510(t2j0 t2j0Var, sjq0 sjq0Var, g0l g0lVar, i8h1 i8h1Var, d48 d48Var, g5t g5tVar) {
        this.a = t2j0Var;
        this.b = sjq0Var;
        this.c = g0lVar;
        this.d = i8h1Var;
        this.e = d48Var;
        this.f = g5tVar;
    }

    public static /* synthetic */ Single f(g510 g510Var, m210 m210Var, String str, w7h1 w7h1Var, ou80 ou80Var, int i) {
        if ((i & 4) != 0) {
            w7h1Var = null;
        }
        if ((i & 8) != 0) {
            ou80Var = null;
        }
        return g510Var.e(m210Var, str, w7h1Var, ou80Var, 1);
    }

    public static Single q(g510 g510Var, m210 m210Var, w7h1 w7h1Var) {
        g510Var.getClass();
        return Single.defer(new h23((Object) null, g510Var, w7h1Var, m210Var, (byte) 1));
    }

    public final ExternalAccessoryRemoteInteraction a(m210 m210Var, w7h1 w7h1Var, String str, String str2, String str3) {
        v210 v210VarP = ExternalAccessoryRemoteInteraction.p();
        v210VarP.z(str);
        if (w7h1Var.d.a().b().length() > 0) {
            v210VarP.u(w7h1Var.d.a().b());
        }
        String str4 = m210Var.a;
        String str5 = m210Var.k;
        String str6 = m210Var.b;
        String str7 = m210Var.i;
        String str8 = m210Var.h;
        String str9 = m210Var.g;
        String str10 = m210Var.c;
        String str11 = m210Var.f;
        String str12 = m210Var.d;
        String str13 = m210Var.j;
        if (str4.length() > 0) {
            v210VarP.y(m210Var.a);
        }
        if (str13.length() > 0) {
            v210VarP.B(str13);
        }
        if (str12.length() > 0) {
            v210VarP.E(str12);
        }
        if (str11.length() > 0) {
            v210VarP.t(str11);
        }
        if (str10.length() > 0) {
            v210VarP.s(str10);
        }
        if (str9.length() > 0) {
            v210VarP.w(str9);
        }
        if (str8.length() > 0) {
            v210VarP.A(str8);
        }
        if (str7.length() > 0) {
            v210VarP.F(str7);
        }
        if (str6.length() > 0) {
            v210VarP.x(str6);
        }
        if (str5.length() > 0) {
            v210VarP.D(str5);
        }
        if (str2 != null) {
            v210VarP.C(str2);
        }
        if (str3 != null) {
            v210VarP.v(str3);
        }
        if (this.g.contains(v210VarP.n()) && !v210VarP.q()) {
            List list = (List) ((ck) this.f.get()).f.getValue();
            if (list.size() != 1) {
                list = null;
            }
            hi hiVar = list != null ? (hi) list.get(0) : null;
            if (hiVar != null) {
                qi qiVar = (qi) hiVar;
                String str14 = qiVar.b;
                if (str14 != null && str14.length() != 0) {
                    v210VarP.s(str14);
                }
                String str15 = qiVar.d;
                if (str15 == null) {
                    str15 = "1024";
                }
                v210VarP.r(str15);
            }
        }
        return v210VarP.build();
    }

    public final void b(m210 m210Var, w7h1 w7h1Var, ou80 ou80Var) {
        String str = ou80Var.a;
        String strP = p();
        a48 a48Var = this.e.j;
        this.a.a(a(m210Var, w7h1Var, str, strP, a48Var != null ? a48Var.b() : null));
    }

    public final Single c(m210 m210Var, boolean z) {
        return this.b.u0().flatMap(new oi(this, m210Var, z, (byte) 20));
    }

    public final Single d(m210 m210Var) {
        return this.b.u0().flatMap(new f510(m210Var, this, (byte) 0));
    }

    public final Single e(m210 m210Var, String str, w7h1 w7h1Var, ou80 ou80Var, int i) {
        w7h1 w7h1VarM;
        int iC = l1d.C(i);
        uqk0 uqk0Var = this.h;
        if (iC == 0) {
            w7h1VarM = uqk0Var.m(str);
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            w7h1VarM = uqk0Var.y(str);
        }
        return Single.defer(new h23(ou80Var, this, w7h1Var == null ? w7h1VarM : w7h1Var, m210Var, (byte) 1));
    }

    public final Single g(m210 m210Var) {
        return q(this, m210Var, this.h.r());
    }

    public final Single h(m210 m210Var) {
        return q(this, m210Var, this.h.q());
    }

    public final Single i(m210 m210Var) {
        return q(this, m210Var, this.h.s());
    }

    public final Single j(m210 m210Var) {
        return this.b.u0().flatMap(new d510(m210Var, this, (byte) 1));
    }

    public final Single k(long j, m210 m210Var) {
        return q(this, m210Var, this.h.v(Integer.valueOf((int) j)));
    }

    public final Single l(long j, m210 m210Var) {
        return q(this, m210Var, this.h.w(Integer.valueOf((int) j)));
    }

    public final Single m(m210 m210Var, int i, int i2) {
        int i3;
        int iC = l1d.C(i);
        int i4 = 3;
        if (iC == 0) {
            i3 = 1;
        } else if (iC == 1) {
            i3 = 2;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            i3 = 3;
        }
        int iC2 = l1d.C(i2);
        if (iC2 == 0) {
            i4 = 1;
        } else if (iC2 == 1) {
            i4 = 2;
        } else if (iC2 != 2) {
            eg.o();
            return null;
        }
        return q(this, m210Var, this.h.x(i3, i4));
    }

    public final Single n(m210 m210Var) {
        return this.b.v0().flatMap(new f510(m210Var, this, (byte) 1));
    }

    public final Single o(m210 m210Var) {
        return this.b.v0().flatMap(new d510(m210Var, this, (byte) 2));
    }

    public final String p() {
        l0l l0lVarC;
        c1l c1lVarG;
        inr inrVar = this.c;
        l0l l0lVarC2 = inrVar.c();
        if (l0lVarC2 == null || l0lVarC2.l() || (l0lVarC = inrVar.c()) == null || (c1lVarG = l0lVarC.G()) == null) {
            return null;
        }
        return c1lVarG.a;
    }

    public final ou80 r(m210 m210Var, w7h1 w7h1Var, w7h1 w7h1Var2) {
        w7h1 w7h1Var3 = w7h1Var2 == null ? w7h1Var : w7h1Var2;
        ou80 ou80Var = this.d.m(w7h1Var3, null).a;
        String str = ou80Var.a;
        String strP = p();
        a48 a48Var = this.e.j;
        this.a.a(a(m210Var, w7h1Var3, str, strP, a48Var != null ? a48Var.b() : null));
        return ou80Var;
    }
}
