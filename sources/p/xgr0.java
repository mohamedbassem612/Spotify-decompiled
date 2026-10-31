package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xgr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgr0(int i, byte b) {
        super(2);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        gjz0 gjz0Var;
        goj0 goj0VarA;
        v6v0 v6v0Var;
        int i;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = false;
        int i2 = 2;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                bzn1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                yxr0 yxr0Var = (yxr0) obj2;
                return eyr0.f((wxr0) obj, yxr0Var.a, yxr0Var.b);
            case 2:
                ((Number) obj2).intValue();
                mmo1.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                mmo1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                a2s0 a2s0Var = (Parcelable) jhc1.t((Bundle) obj, "externalState", a2s0.class);
                a2s0Var.getClass();
                return new c2s0((b2s0) obj2, a2s0Var);
            case 5:
                k7s0 k7s0Var = (k7s0) obj;
                return ((Boolean) obj2).booleanValue() ? k7s0Var : ng20.l(k7s0Var);
            case 6:
                ((Number) obj2).intValue();
                wro1.u((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pox poxVar = pox.c;
                    uwr uwrVar = cbx.a;
                    long j2 = cbx.a(x340Var2).b.a;
                    qim0 qim0VarF = dug.f(h2c.a.a(nim0Var, een.Y), cbx.a(x340Var2).a.c, er31.a);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(qim0VarF, 4.0f);
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(poxVar, isl.a, u291.r(qim0VarX, 12.0f), j2, 0L, true, x340Var2, pox.d | 196656, 16);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 8:
                cob1 cob1Var = (cob1) obj;
                umo umoVar = (umo) obj2;
                if (cob1Var != null) {
                    int iOrdinal = cob1Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                eg.o();
                                return null;
                            }
                            return ast0.a;
                        }
                        return ast0.b;
                    }
                    return ast0.c;
                }
                if (umoVar != null) {
                    if (!(umoVar instanceof tmo)) {
                        if (!(umoVar instanceof smo)) {
                            if (!umoVar.equals(rmo.a)) {
                                eg.o();
                                return null;
                            }
                        }
                        return ast0.b;
                    }
                    return ast0.a;
                }
                return ast0.c;
            case 9:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strUid = contextTrack != null ? contextTrack.uid() : null;
                ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                if (u890.j(strUid, contextTrack2 != null ? contextTrack2.uid() : null)) {
                    ContextTrack contextTrack3 = (ContextTrack) playerState.track().h();
                    String str = contextTrack3 != null ? (String) contextTrack3.metadata().get("repeating_track.count") : null;
                    ContextTrack contextTrack4 = (ContextTrack) playerState2.track().h();
                    if (u890.j(str, contextTrack4 != null ? (String) contextTrack4.metadata().get("repeating_track.count") : null)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                ((Number) obj2).intValue();
                m6p1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                m6p1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                afv0 afv0Var = (afv0) obj;
                String str2 = afv0Var.b;
                int i3 = afv0Var.c;
                String str3 = afv0Var.a;
                String str4 = ((zev0) obj2).a;
                return new bfv0(str2, i3, ihc1.h0(str3, "episode", false) ? l1d.m("spotify:podcastcharts:chart:topepisodes:", str4) : l1d.m("spotify:podcastcharts:chart:top:", str4));
            case 13:
                return z6x.a;
            case 14:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    rhx0.a(anm1.N("loading-indicator", u291.r(nim0Var, 24.0f)), cbx.a(x340Var4).c.b, 0.0f, 0L, 0, 0.0f, x340Var4, 0, 60);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                a8o.p((b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                v8r.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e("", (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var6, 1572864, 0, 1726);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                yah0.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarX2 = uyn1.x(u291.f(nim0Var, 1.0f), 16.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarX2);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(hmb0.t1);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    uwr uwrVar3 = cbx.a;
                    shx0.b(0.0f, 0, 0, 28, cbx.a(x340Var8).c.c, 0L, x340Var8, u291.r(nim0Var, 48.0f));
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                yon1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                return Next.h(z47.w(de40.g((v5y0) obj), ((a6y0) obj2).a()));
            case 22:
                ((Number) obj2).intValue();
                eio1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                return rwj.r();
            case 24:
                icx icxVar = ((afx) obj).a;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    j = icxVar.c;
                } else if (iOrdinal2 == 1) {
                    j = icxVar.e;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    j = icxVar.d;
                }
                return new u7h(j);
            case 25:
                fjz0 fjz0Var = (fjz0) obj;
                i1r i1rVar = (k1r) obj2;
                jlz0 jlz0Var = fjz0Var.f;
                String str5 = fjz0Var.b;
                String str6 = fjz0Var.a;
                if (i1rVar instanceof i1r) {
                    int i4 = fjz0Var.c;
                    String str7 = fjz0Var.d;
                    ejz0 ejz0Var = (ejz0) i1rVar.a;
                    String str8 = ejz0Var.a;
                    if (str8 == null) {
                        str8 = "";
                    }
                    gjz0Var = new gjz0(str6, str5, i4, str7, false, jlz0Var, str8, ejz0Var.b);
                } else {
                    gjz0Var = new gjz0(str6, str5, fjz0Var.c, fjz0Var.d, false, jlz0Var, "", (String) null);
                }
                return jjz0.f(gjz0Var);
            case 26:
                String str9 = ((vsz0) obj).a;
                dsz0 bsz0Var = wdx0.d;
                hoj0 hoj0VarC = ((ioj0) obj2).c(v6v0.class, str9);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (v6v0Var = (v6v0) goj0VarA.a) != null) {
                    int i5 = v6v0Var.a.a;
                    t6v0 t6v0Var = v6v0Var.c;
                    bsz0Var = new bsz0(i5 > 0, i5, t6v0Var.a, t6v0Var.b, t6v0Var.c);
                }
                return new xsz0(bsz0Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                k8g1 k8g1Var = ((r801) obj).X;
                String str10 = k8g1Var.a;
                qpe1 qpe1Var = k8g1Var.X;
                String str11 = k8g1Var.b;
                String str12 = k8g1Var.c;
                String str13 = k8g1Var.d;
                String str14 = k8g1Var.e;
                int i6 = k8g1Var.f;
                int i7 = k8g1Var.g;
                int i8 = k8g1Var.h;
                List list = k8g1Var.i;
                boolean z2 = k8g1Var.t;
                if (k8g1Var.Y && qpe1Var == qpe1.b) {
                    i = i2;
                } else if (qpe1Var == qpe1.c) {
                    i = 1;
                } else {
                    i2 = qpe1Var == qpe1.d ? 4 : 3;
                    i = i2;
                }
                return new m901(str10, str11, str12, str13, str14, i6, i7, i8, list, z2, i, false, k8g1Var.Z);
            case 28:
                ((Number) obj2).intValue();
                cto1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                guo1.s((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgr0(byte b, int i, boolean z) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xgr0(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
