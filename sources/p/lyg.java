package p;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.FacebookException;
import com.google.android.material.appbar.MaterialToolbar;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PrefetchLevel;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class lyg {
    public static final z9 a = new z9((byte) 24);
    public static b180 b;
    public static b180 c;

    public static final EsPreparePlayOptions.PreparePlayOptions A(PreparePlayOptions preparePlayOptions) {
        kqz kqzVar;
        nqz nqzVar;
        lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
        if (preparePlayOptions.playbackId().c()) {
            lqzVarS.w(eth.M((String) preparePlayOptions.playbackId().b()));
        }
        if (preparePlayOptions.alwaysPlaySomething().c()) {
            lqzVarS.s(((Boolean) preparePlayOptions.alwaysPlaySomething().b()).booleanValue());
        }
        if (preparePlayOptions.skipTo().c()) {
            SkipToTrack skipToTrack = (SkipToTrack) preparePlayOptions.skipTo().b();
            wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
            wrzVarP.q((String) skipToTrack.pageUrl().e(""));
            if (skipToTrack.pageIndex().c()) {
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(((Number) skipToTrack.pageIndex().b()).longValue());
                wrzVarP.n(qpzVarP.build());
            }
            wrzVarP.s((String) skipToTrack.trackUid().e(""));
            wrzVarP.t((String) skipToTrack.trackUri().e(""));
            if (skipToTrack.trackIndex().c()) {
                qpz qpzVarP2 = EsOptional.OptionalInt64.p();
                qpzVarP2.n(((Number) skipToTrack.trackIndex().b()).longValue());
                wrzVarP.r(qpzVarP2.build());
            }
            lqzVarS.C(wrzVarP.build());
        }
        if (preparePlayOptions.seekTo().c()) {
            qpz qpzVarP3 = EsOptional.OptionalInt64.p();
            qpzVarP3.n(((Number) preparePlayOptions.seekTo().b()).longValue());
            lqzVarS.z(qpzVarP3.build());
        }
        if (preparePlayOptions.seekToCreatorTimestamp().c()) {
            lqzVarS.A((String) preparePlayOptions.seekToCreatorTimestamp().b());
        }
        if (preparePlayOptions.initiallyPaused().c()) {
            lqzVarS.u(((Boolean) preparePlayOptions.initiallyPaused().b()).booleanValue());
        }
        if (preparePlayOptions.systemInitiated().c()) {
            lqzVarS.E(((Boolean) preparePlayOptions.systemInitiated().b()).booleanValue());
        }
        if (preparePlayOptions.playerOptionsOverride().c()) {
            PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) preparePlayOptions.playerOptionsOverride().b();
            imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
            if (playerOptionOverrides.shufflingContext().c()) {
                ppz ppzVarN = EsOptional.OptionalBoolean.n();
                ppzVarN.n(((Boolean) playerOptionOverrides.shufflingContext().b()).booleanValue());
                imzVarO.t(ppzVarN.build());
            }
            if (playerOptionOverrides.repeatingContext().c()) {
                ppz ppzVarN2 = EsOptional.OptionalBoolean.n();
                ppzVarN2.n(((Boolean) playerOptionOverrides.repeatingContext().b()).booleanValue());
                imzVarO.r(ppzVarN2.build());
            }
            if (playerOptionOverrides.repeatingTrack().c()) {
                ppz ppzVarN3 = EsOptional.OptionalBoolean.n();
                ppzVarN3.n(((Boolean) playerOptionOverrides.repeatingTrack().b()).booleanValue());
                imzVarO.s(ppzVarN3.build());
            }
            imzVarO.n(playerOptionOverrides.modes());
            lqzVarS.x(imzVarO.build());
        }
        if (preparePlayOptions.suppressions().c()) {
            lqzVarS.n(((Suppressions) preparePlayOptions.suppressions().b()).providers());
        }
        if (preparePlayOptions.prefetchLevel().c()) {
            PrefetchLevel prefetchLevel = (PrefetchLevel) preparePlayOptions.prefetchLevel().b();
            int i = prefetchLevel == null ? -1 : oxv0.a[prefetchLevel.ordinal()];
            if (i == -1 || i == 1) {
                nqzVar = nqz.NONE;
            } else {
                if (i != 2) {
                    eg.o();
                    return null;
                }
                nqzVar = nqz.MEDIA;
            }
            lqzVarS.y(nqzVar);
        }
        if (preparePlayOptions.audioStream().c()) {
            AudioStream audioStream = (AudioStream) preparePlayOptions.audioStream().b();
            int i2 = audioStream == null ? -1 : oxv0.b[audioStream.ordinal()];
            if (i2 == -1 || i2 == 1) {
                kqzVar = kqz.b;
            } else {
                if (i2 != 2) {
                    eg.o();
                    return null;
                }
                kqzVar = kqz.c;
            }
            lqzVarS.t(kqzVar);
        }
        if (preparePlayOptions.sessionId().c()) {
            lqzVarS.B((String) preparePlayOptions.sessionId().b());
        }
        if (preparePlayOptions.license().c()) {
            lqzVarS.v((String) preparePlayOptions.license().b());
        }
        lqzVarS.r(preparePlayOptions.configurationOverride());
        return lqzVarS.build();
    }

    public static final mr20 B(y2l y2lVar, boolean z) {
        return rqt0.u(new x3s(((c3l) y2lVar).g(z), (byte) 6));
    }

    public static final void a(obk obkVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        dzo1 dzo1Var;
        b0k b0kVar2;
        boolean z;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1681417347);
        int i2 = i | (b0kVar3.g(obkVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0VarN = anm1.N("concert_campaign_header_action_row", qim0Var);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            boolean z2 = obkVar.h;
            nim0 nim0Var = nim0.a;
            dzo1 dzo1Var2 = z50.c;
            if (z2) {
                b0kVar3.i0(1011793135);
                pk1 pk1Var = new pk1(obkVar.e ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
                qim0 qim0VarN2 = anm1.N("concert_campaign_save_button", nim0Var);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT = b0kVar3.T();
                if (z3 || objT == m4cVar) {
                    objT = new gmj(iu30Var, obkVar, (byte) 10);
                    b0kVar3.s0(objT);
                }
                gbx gbxVar = new gbx(dzo1Var2, (Function0) objT);
                z = true;
                b0kVar2 = b0kVar3;
                dzo1Var = dzo1Var2;
                h7p1.a(pk1Var, gbxVar, qim0VarN2, (max) null, (gdx) null, b0kVar2, 0, 24);
                b0kVar2.r(false);
            } else {
                dzo1Var = dzo1Var2;
                b0kVar2 = b0kVar3;
                z = true;
                b0kVar2.i0(1012246913);
                b0kVar2.r(false);
            }
            int i3 = i2 & 112;
            boolean z4 = i3 == 32 ? z : false;
            Object objT2 = b0kVar2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new erj(iu30Var, (byte) 20);
                b0kVar2.s0(objT2);
            }
            gbx gbxVar2 = new gbx(dzo1Var, (Function0) objT2);
            ldx ldxVar = ldx.c;
            b0kVar3 = b0kVar2;
            foo1.c(gbxVar2, ldxVar, anm1.N("concert_campaign_share_button", nim0Var), (max) null, yla.s(b0kVar2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hei.d, b0kVar3, 0, 48, 2008);
            boolean z5 = i3 == 32;
            Object objT3 = b0kVar3.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new erj(iu30Var, (byte) 21);
                b0kVar3.s0(objT3);
            }
            foo1.c(new gbx(dzo1Var, (Function0) objT3), ldxVar, anm1.N("concert_campaign_overflow_button", nim0Var), (max) null, yla.s(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hei.e, b0kVar3, 0, 48, 2008);
            b0kVar3.r(true);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(obkVar, iu30Var, qim0Var, i, (byte) 5);
        }
    }

    public static final void b(int i, Function0 function0, lkb lkbVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(835788529);
        int i2 = (x340Var.g(lkbVar) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            e((i2 & 126) | 384 | ((i2 << 3) & 7168), function0, lkbVar, x340Var, qim0Var3, z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(lkbVar, z, function0, qim0Var2, i, (byte) 9);
        }
    }

    public static final void c(lz30 lz30Var, qim0 qim0Var, b0k b0kVar, int i) {
        List list = lz30Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-569782688);
        int i2 = (i & 6) == 0 ? (x340Var.g(lz30Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(list);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                List<e040> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (e040 e040Var : list2) {
                    String str = e040Var.c;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new phx(8, 0L, str, e040Var.a, e040Var.b));
                }
                objT = mqo1.F(arrayList);
                x340Var.s0(objT);
            }
            fc11.a((c9) objT, qim0Var, hcx.b, (hux) null, false, 2, (gbx) null, (String) null, (idn0) null, x340Var, 221576 | (i2 & 112), 456);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(lz30Var, qim0Var, i, (byte) 16);
        }
    }

    public static final void d(obk obkVar, iu30 iu30Var, lbs lbsVar, d0r d0rVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1283322638);
        int i2 = i | (b0kVar3.g(obkVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(lbsVar) ? 256 : 128) | (b0kVar3.i(d0rVar) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = lbsVar.a.a(d0rVar);
                b0kVar3.s0(objT);
            }
            jqm0 jqm0Var = (jqm0) objT;
            Configuration configuration = (Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a);
            float fU0 = ((wat) b0kVar3.k(t4k.h)).U0();
            boolean z = configuration.orientation == 2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            j2i j2iVarR = apo.r(-1188246200, new fbk(z, configuration, fU0, obkVar, iu30Var, jqm0Var, d0rVar), b0kVar3);
            b0kVar2 = b0kVar3;
            w2g0.c(qim0VarF, (tl3) null, j2iVarR, b0kVar2, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 2, i, obkVar, iu30Var, lbsVar, d0rVar, qim0Var2);
        }
    }

    public static final void e(int i, Function0 function0, lkb lkbVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(944990837);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(lkbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarJ = u291.j(65.0f, 0.0f, 2, u291.f(anm1.N("bluetooth-entrypoint", qim0Var), 1.0f));
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            ogx ogxVar = ogx.e;
            String strO0 = cwl1.o0(b0kVar3, 2131951706);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarJ, graVar, (hw61) null, ogxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(-373411938, new zw2(lkbVar, z, (byte) 3), b0kVar3), b0kVar2, 3120, 48, 1508);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(lkbVar, z, qim0Var, function0, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    public static final void f(g040 g040Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        boolean z;
        gdx gdxVarR;
        float f;
        gdx gdxVar;
        ilz0 ilz0Var;
        String str;
        String str2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1093389486);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g040Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            upf upfVar = g040Var.d;
            boolean z3 = g040Var.f;
            sqe sqeVar = g040Var.a;
            boolean z4 = upfVar instanceof iz30;
            boolean z5 = sqeVar instanceof ez30;
            boolean z6 = sqeVar instanceof dz30;
            if (z5) {
                qtg qtgVar = g040Var.e;
                if (!(qtgVar instanceof lz30) || ((lz30) qtgVar).d.size() < 2) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z3 != 0) {
                x340Var.i0(1519710647);
                gdxVarR = yla.s(x340Var);
            } else {
                x340Var.i0(1519711544);
                gdxVarR = yla.r(x340Var);
            }
            x340Var.r(false);
            gdx gdxVar2 = gdxVarR;
            if (z3) {
                x340Var.i0(1519714554);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 6.0f;
            } else {
                x340Var.i0(1519715865);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            }
            if (z) {
                x340Var.i0(-133389539);
                cvx cvxVar3 = cbx.b(x340Var).b;
                gdx gdxVarB = gdx.b(gdxVar2, (zzq0) null, 0.0f, 0.0f, 0.0f, 47);
                x340Var.r(false);
                gdxVar = gdxVarB;
            } else {
                x340Var.i0(-133302956);
                x340Var.r(false);
                gdxVar = gdxVar2;
            }
            if (z6) {
                ilz0Var = klz0Var.b;
                str = ilz0Var.d.c;
            } else if (!z5) {
                eg.o();
                return;
            } else {
                ilz0Var = klz0Var.b;
                str = ilz0Var.d.a;
            }
            f631 f631Var = ilz0Var.d;
            if (z6) {
                str2 = f631Var.d;
            } else {
                if (!z5) {
                    eg.o();
                    return;
                }
                str2 = f631Var.b;
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            String str3 = str2;
            String str4 = str;
            mbh mbhVarA = jbh.a(new d36(f, true, new um5(false)), een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g(str4, gdxVar, z4, z, z6, g040Var.e, function0, x340Var, (i2 << 15) & 3670016);
            if (g040Var.h) {
                x340Var.i0(-642680504);
                boolean z7 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z7 || objT == fkj0.X) {
                    objT = new zg20(function1, (byte) 9);
                    x340Var.s0(objT);
                }
                z2 = true;
                foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, gdxVar2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1597214850, new ps00(str3, (byte) 18), x340Var), x340Var, 0, 48, 2012);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z2 = true;
                x340Var.i0(-642436410);
                x340Var.r(false);
            }
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(g040Var, function0, function1, i, (byte) 12);
        }
    }

    public static final void g(String str, gdx gdxVar, boolean z, boolean z2, boolean z3, qtg qtgVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        hax haxVar;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1448058338);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(gdxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(qtgVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            klz0 klz0Var = (klz0) b0kVar3.k(llz0.a);
            boolean z4 = z2 || z || z3;
            boolean z5 = (3670016 & i2) == 1048576;
            Object objT = b0kVar3.T();
            if (z5 || objT == fkj0.X) {
                objT = new zg20(function0, (byte) 10);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            hdx hdxVarD = lzj.d(klz0Var.a);
            if (z) {
                b0kVar3.i0(-453910151);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131956157));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-453769442);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            if (z4) {
                b0kVar3.i0(-453648604);
                j2iVarR = apo.r(-743097933, new v040(z2, z, z3, qtgVar), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-453395954);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, hdxVarD, (qim0) null, haxVar, gdxVar, (vzq0) null, (idn0) null, (ga80) null, j2iVarR, (vu30) null, apo.r(751058303, new ps00(str, (byte) 19), b0kVar3), b0kVar2, (i2 << 12) & 458752, 48, 1484);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new w040(str, gdxVar, z, z2, z3, qtgVar, function0, i);
        }
    }

    public static final void h(boolean z, boolean z2, boolean z3, qtg qtgVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(680516413);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.h(z3) ? 256 : 128) | (x340Var.g(qtgVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(619641500);
                lz30 lz30Var = (lz30) qtgVar;
                boolean z4 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z4 || objT == fkj0.X) {
                    objT = new mj10((byte) 2, z2);
                    x340Var.s0(objT);
                }
                c(lz30Var, i541.C(nim0Var, (iu30) objT), x340Var, (i2 >> 9) & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(619871179);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(619893282);
                xto1.e((qim0) null, 2, 0L, 0L, x340Var, 48, 13);
                x340Var.r(false);
            } else {
                x340Var.i0(619963435);
                x340Var.r(false);
            }
            if (z3) {
                x340Var.i0(619991428);
                w0h1.a(fsx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var, fsx.d | 48, 60);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(620121163);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v040(z, z2, z3, qtgVar, i);
        }
    }

    public static final void i(ne31 ne31Var, iu30 iu30Var, b0k b0kVar, int i) {
        gbx gbxVar;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-576756928);
        int i2 = (b0kVar2.g(ne31Var) ? 4 : 2) | i | (b0kVar2.i(iu30Var) ? 32 : 16);
        if (!b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2.b0();
        } else {
            if (ihc1.y0(ne31Var.a)) {
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new pe31(ne31Var, iu30Var, i, (byte) 1);
                    return;
                }
                return;
            }
            boolean z = ne31Var.d != null;
            List listI0 = f46.i0(new String[]{cwl1.o0(b0kVar2, 2131952633), ne31Var.b});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI0) {
                if (!ihc1.y0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, oe31.d, 30);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            rqo1.g(0, 1, b0kVar2, (qim0) null);
            qim0 qim0VarN = anm1.N("rich_audiobook_series_element", nim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(16.0f, 12.0f, 16.0f, 12.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            if (z) {
                b0kVar2.i0(482519145);
                boolean z2 = (i2 & 112) == 32;
                Object objT = b0kVar2.T();
                if (z2 || objT == fkj0.X) {
                    objT = new dv11(iu30Var, (byte) 27);
                    b0kVar2.s0(objT);
                }
                gbxVar = new gbx(z50.c, (Function0) objT);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(482632574);
                b0kVar2.r(false);
                gbxVar = null;
            }
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, apo.r(1896098945, new re31(ne31Var, (byte) 0), b0kVar2), apo.r(-2122849023, new iww0(strY0, (byte) 9), b0kVar2), (xu30) null, z ? aej.a : null, (xu30) null, (xu30) null, apo.r(1132292806, new re31(ne31Var, (byte) 1), b0kVar2), b0kVar2, 805306432, 196614, 27068);
            b0kVar2 = b0kVar2;
            rqo1.g(0, 1, b0kVar2, (qim0) null);
            b0kVar2.r(true);
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new pe31(ne31Var, iu30Var, i, (byte) 2);
        }
    }

    public static final void j(iu30 iu30Var, lcc lccVar, iu30 iu30Var2, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        char c2;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2046085550);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lccVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= x340Var.h(z) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(gr81.t);
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = pqo.h(qim0Var3, !z);
            boolean z2 = ((i3 & 57344) == 16384) | ((i3 & 14) == 4);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ag21(iu30Var, z, (byte) 2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarH, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
            if (lccVar.equals(fi91.e)) {
                c2 = 1;
            } else if (lccVar.equals(fi91.g)) {
                c2 = 2;
            } else if (lccVar.equals(gi91.e)) {
                c2 = 3;
            } else {
                if (!lccVar.equals(fi91.f)) {
                    eg.o();
                    return;
                }
                c2 = 4;
            }
            if (c2 == 1) {
                str = "smart_shuffle_element_state_Linear";
            } else if (c2 == 2) {
                str = "smart_shuffle_element_state_Shuffle";
            } else if (c2 == 3) {
                str = "smart_shuffle_element_state_SmartShuffle";
            } else {
                if (c2 != 4) {
                    throw null;
                }
                str = "smart_shuffle_element_state_Loading";
            }
            qim0 qim0VarN = anm1.N(str, qim0VarX);
            boolean zI = x340Var.i(tob1Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new lws0(tob1Var, (byte) 19);
                x340Var.s0(objT3);
            }
            qim0 qim0VarX2 = ern1.x(qim0VarN, (iu30) objT3);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = fe91.Y0;
                x340Var.s0(objT4);
            }
            iu30 iu30Var3 = (iu30) objT4;
            boolean zI2 = x340Var.i(lccVar) | x340Var.i(tob1Var) | ((i3 & 896) == 256);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new ny51(lccVar, iu30Var2, tob1Var, (byte) 13);
                x340Var.s0(objT5);
            }
            dm5.a(iu30Var3, qim0VarX2, (iu30) objT5, x340Var, 6, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(iu30Var, lccVar, iu30Var2, qim0Var2, z, i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    public static final void k(cce cceVar, o0i o0iVar, o8l1 o8l1Var, qim0 qim0Var, b0k b0kVar, int i) {
        cce cceVar2;
        int i2;
        vu30 vu30Var;
        vu30 vu30Var2;
        ?? r3;
        boolean z;
        boolean z2;
        ArrayList arrayList = o8l1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1899077078);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            cceVar2 = cceVar;
            i2 = (x340Var.i(cceVar2) ? 4 : 2) | i;
        } else {
            cceVar2 = cceVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(o8l1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarQ = i1p1.q(dug.f(qim0Var, cbx.a(x340Var).a.c, d4o1.a), er31.b(24.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            vu30 vu30Var3 = y580.O0;
            nko1.H(gfh0VarC, x340Var, vu30Var3);
            vu30 vu30Var4 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar);
            nko1.F(x340Var);
            llj lljVar2 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar2);
            vpl vplVar = o8l1Var.a;
            nim0 nim0Var = nim0.a;
            if (vplVar == null) {
                x340Var.i0(225473091);
                r3 = 0;
                x340Var.r(false);
                vu30Var2 = vu30Var3;
                vu30Var = vu30Var4;
            } else {
                x340Var.i0(225473092);
                vu30Var = vu30Var4;
                vu30Var2 = vu30Var3;
                cceVar2.a(392 | ((i3 >> 3) & 14) | ((i3 << 9) & 7168), o0iVar, vplVar, x340Var, u291.d(nim0Var, 1.0f));
                r3 = 0;
                x340Var.r(false);
            }
            if (arrayList.isEmpty()) {
                z = true;
                x340Var.i0(226396582);
                x340Var.r((boolean) r3);
            } else {
                x340Var.i0(225630665);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r3);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, vu30Var2);
                nko1.H(xos0VarM2, x340Var, vu30Var);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar2);
                pbh pbhVar = pbh.a;
                op71.g(x340Var, pbhVar.a(0.2f, nim0Var, true));
                int i4 = ((i3 << 9) & 7168) | ((i3 >> 3) & 14) | 8;
                cceVar.a(i4, o0iVar, (z0i) arrayList.get(0), x340Var, pbhVar.a(0.28f, u291.f(nim0Var, 1.0f), true));
                z = true;
                op71.g(x340Var, pbhVar.a(0.08f, nim0Var, true));
                if (arrayList.size() > 1) {
                    x340Var.i0(-2092535973);
                    cceVar.a(i4, o0iVar, (z0i) arrayList.get(1), x340Var, pbhVar.a(0.28f, u291.f(nim0Var, 1.0f), true));
                    op71.g(x340Var, pbhVar.a(0.16f, nim0Var, true));
                    z2 = false;
                    x340Var.r(false);
                } else {
                    z2 = false;
                    x340Var.i0(-2092255547);
                    op71.g(x340Var, pbhVar.a(0.46f, nim0Var, true));
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z2);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, cceVar, o0iVar, o8l1Var, qim0Var, (byte) 4);
        }
    }

    public static final boolean l(t0a t0aVar) {
        return ((gpd1) oap1.B(t0aVar).e1.f).O0;
    }

    public static final Object m(Flowable flowable, pt2 pt2Var) {
        return rc2.O(250L, new st2(flowable, null, (byte) 0), pt2Var);
    }

    public static final boolean n(PlayerState playerState) {
        j380 j380VarMetadata;
        if (playerState.signals().contains("switch-to-video")) {
            return true;
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return u890.j((contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata.get(ContextTrack$Metadata.KEY_TRACK_PLAYER), "video");
    }

    public static final boolean o(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }

    public static final String p(PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null) {
            return "UNKNOWN";
        }
        if (l4o1.G(contextTrack)) {
            return "AUDIOBOOK";
        }
        if (nhc1.Y(contextTrack.uri(), "spotify:episode:", false)) {
            return "PODCAST";
        }
        return l4o1.W(contextTrack) ? "MUSIC" : "UNKNOWN";
    }

    public static xd q(Bundle bundle, String str) {
        String string;
        Date dateN = fpi1.n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateN2 = fpi1.n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new xd(string2, str, string, stringArrayList, (Collection) null, (Collection) null, oe.c, dateN, new Date(), dateN2, bundle.getString("graph_domain"));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public static xd r(Collection collection, Bundle bundle, oe oeVar, String str) throws FacebookException {
        ArrayList arrayListH;
        ArrayList arrayListH2;
        Date dateN = fpi1.n(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date dateN2 = fpi1.n(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                String[] strArr = (String[]) ihc1.Q0(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                collection = p7h.H(Arrays.copyOf(strArr, strArr.length));
            }
            Collection collection2 = collection;
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListH = null;
            } else {
                String[] strArr2 = (String[]) ihc1.Q0(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListH = p7h.H(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListH2 = null;
            } else {
                String[] strArr3 = (String[]) ihc1.Q0(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListH2 = p7h.H(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!fpi1.y(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    throw new FacebookException("Authorization response does not contain the signed_request");
                }
                try {
                    String[] strArr4 = (String[]) ihc1.Q0(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                    if (strArr4.length == 2) {
                        return new xd(string, str, new JSONObject(new String(Base64.decode(strArr4[1], 0), nne.a)).getString("user_id"), collection2, arrayListH, arrayListH2, oeVar, dateN, new Date(), dateN2, string5);
                    }
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                throw new FacebookException("Failed to retrieve user_id from signed_request");
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public static rl8 s(Bundle bundle, String str) throws FacebookException {
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new rl8(string, str);
        } catch (Exception e) {
            throw new FacebookException(e.getMessage(), e);
        }
    }

    public static final long t(boolean z, x340 x340Var) {
        long j;
        if (z) {
            x340Var.i0(981013565);
            uwr uwrVar = cbx.a;
            j = cbx.a(x340Var).b.c;
        } else {
            x340Var.i0(981014805);
            uwr uwrVar2 = cbx.a;
            j = cbx.a(x340Var).b.a;
        }
        x340Var.r(false);
        return j;
    }

    public static final mr20 u(x010 x010Var) {
        return rqt0.u(new ve1(x010Var, (byte) 5));
    }

    public static TextView v(MaterialToolbar materialToolbar, CharSequence charSequence) {
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static final mr20 w(ov20 ov20Var) {
        return rqt0.u(new ek(z(ov20Var), (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(Flowable flowable, onm onmVar) {
        wut wutVar;
        if (onmVar instanceof wut) {
            wutVar = (wut) onmVar;
            int i = wutVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wutVar.b = i - Integer.MIN_VALUE;
            } else {
                wutVar = new wut(onmVar);
            }
        } else {
            wutVar = new wut(onmVar);
        }
        Object objM = wutVar.a;
        int i2 = wutVar.b;
        if (i2 == 0) {
            hm5.M(objM);
            st2 st2Var = new st2(flowable, null, (byte) 1);
            wutVar.b = 1;
            objM = rc2.M(500L, st2Var, wutVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        return objM;
    }

    public static brl0 y() {
        return new brl0((byte) 27);
    }

    public static final lt20 z(ov20 ov20Var) {
        return new lt20(rqt0.u(new php0(((bw20) ov20Var).c("on-demand-trial-in-progress", "unknown"), (byte) 10)), new i440(3, (lnm) null, (byte) 27), (byte) 0);
    }
}
