package p;

import android.view.View;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions$Builder;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p2c implements o1i {
    public final cce a;
    public final bcl1 b;
    public final lzn0 c;
    public final b7r0 d;
    public final m0t e;
    public final kt91 f;
    public final e7p0 g;
    public final muz h;
    public final yp10 i;
    public final j8m0 j;
    public final t75 k;

    public p2c(cce cceVar, bcl1 bcl1Var, lzn0 lzn0Var, b7r0 b7r0Var, m0t m0tVar, kt91 kt91Var, e7p0 e7p0Var, muz muzVar, yp10 yp10Var, j8m0 j8m0Var, t75 t75Var) {
        this.a = cceVar;
        this.b = bcl1Var;
        this.c = lzn0Var;
        this.d = b7r0Var;
        this.e = m0tVar;
        this.f = kt91Var;
        this.g = e7p0Var;
        this.h = muzVar;
        this.i = yp10Var;
        this.j = j8m0Var;
        this.k = t75Var;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        l2c l2cVar = (l2c) z0iVar;
        hp80 hp80Var = o0iVar.e;
        x2g0 x2g0Var = l2cVar.f;
        return new x0i(new w0i(hp80Var, "boxed_entity_row", x2g0Var != null ? x2g0Var.C() : null, l2cVar.X));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(l2c l2cVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1550900230);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(l2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            boolean zI = x340Var.i(this) | (i3 == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ztb(this, l2cVar, (byte) 3);
                x340Var.s0(objT);
            }
            int i4 = i2 & 112;
            oto1.c(l2cVar, o0iVar, (iu30) objT, x340Var, i3 | 64 | i4);
            boolean zI2 = (i3 == 4) | x340Var.i(this);
            if (i4 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = zI2 | z;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new d1c(l2cVar, this, o0iVar, (byte) 1);
                x340Var.s0(objT2);
            }
            int i5 = i2 << 6;
            rqg0.a(this.a, o0iVar, l2cVar, (Function0) objT2, qim0Var2, x340Var, 64 | i4 | (i5 & 896) | (i5 & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, l2cVar, o0iVar, qim0Var, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(o0i o0iVar, String str, String str2, boolean z, boolean z2, String str3, onm onmVar) {
        o2c o2cVar;
        String str4;
        Context contextFromTrackUris;
        tv80 tv80Var;
        l2u0 l2u0Var;
        l2u0 l2u0Var2;
        Long lA;
        feh m231Var;
        if (onmVar instanceof o2c) {
            o2cVar = (o2c) onmVar;
            int i = o2cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o2cVar.d = i - Integer.MIN_VALUE;
            } else {
                o2cVar = new o2c(this, onmVar);
            }
        } else {
            o2cVar = new o2c(this, onmVar);
        }
        Object objJ = o2cVar.b;
        int i2 = o2cVar.d;
        m0t m0tVar = this.e;
        if (i2 == 0) {
            hm5.M(objJ);
            if (str.length() > 0) {
                contextFromTrackUris = Context.fromUri(str);
                str4 = str2;
            } else {
                str4 = str2;
                contextFromTrackUris = Context.fromTrackUris(str4, b380.t(str2));
            }
            PreparePlayOptions$Builder preparePlayOptions$BuilderBuilder = PreparePlayOptions.builder();
            if (z) {
                n2u0 n2u0Var = o0iVar.c.b;
                long j = 0;
                long jLongValue = (n2u0Var == null || (lA = n2u0Var.a()) == null) ? 0L : lA.longValue();
                if (n2u0Var != null && (l2u0Var2 = (l2u0) n2u0Var.c.getValue()) != null) {
                    j = l2u0Var2.d;
                }
                if (!((n2u0Var == null || (l2u0Var = (l2u0) n2u0Var.c.getValue()) == null) ? false : l2u0Var.g)) {
                    jLongValue += j;
                }
                preparePlayOptions$BuilderBuilder.seekTo(new Long(jLongValue));
            }
            if (str.length() > 0) {
                preparePlayOptions$BuilderBuilder.skipTo(SkipToTrack.fromUri(str4));
            }
            if (z2) {
                preparePlayOptions$BuilderBuilder.playerOptionsOverride(PlayerOptionOverrides.builder().modes(Collections.singletonMap("media", "video")).build());
            }
            PreparePlayOptions preparePlayOptionsBuild = preparePlayOptions$BuilderBuilder.alwaysPlaySomething(true).build();
            hp80 hp80Var = o0iVar.e;
            bcl1 bcl1Var = this.b;
            bcl1Var.getClass();
            x6h1 x6h1VarC = bcl1Var.h(hp80Var.b()).a.c();
            x6h1VarC.i.add(new a7h1("watch_feed_component", "boxed_entity_row", (Integer) null, str4, str3));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            String str5 = nik1.p1.a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            if (str5 == null) {
                str5 = "";
            }
            tv80 tv80VarM = bcl1Var.a.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            PlayCommand.Builder builder = PlayCommand.builder(contextFromTrackUris, PlayOrigin.builder("watch-feed").build());
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(tv80VarM.a.a);
            y6r0 y6r0Var = this.d.get();
            String str6 = y6r0Var != null ? y6r0Var.a : null;
            PlayCommand playCommandBuild = builder.loggingParams(builderInteractionId.pageInstanceId(str6 != null ? str6 : "").build()).options(preparePlayOptionsBuild).build();
            m0t.a(m0tVar, 7);
            try {
                Single singleA = this.h.a(playCommandBuild);
                o2cVar.a = tv80VarM;
                o2cVar.d = 1;
                objJ = fc11.j(singleA, o2cVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                tv80Var = tv80VarM;
            } catch (Throwable th) {
                th = th;
                tv80Var = tv80VarM;
                m231Var = new m231(th);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80Var = o2cVar.a;
            try {
                hm5.M(objJ);
            } catch (Throwable th2) {
                th = th2;
                m231Var = new m231(th);
            }
        }
        m231Var = (feh) objJ;
        op71.x(o2cVar.getContext());
        boolean z3 = m231Var instanceof m231;
        if (z3) {
            m0tVar.b();
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963832});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            this.f.k(new er91((fs91) null, "", 2131963832, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else {
            if (z3) {
                m231Var = null;
            }
            feh fehVar = m231Var;
            if (fehVar == null || !(fehVar instanceof ceh)) {
                m0tVar.b();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963832});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                this.f.k(new er91((fs91) null, "", 2131963832, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            } else {
                ou80 ou80Var = tv80Var.a;
                lik1 lik1Var = NowPlayingActivity.y1;
                this.g.a(mqn1.L(mhc.e().a, ou80Var), true, ou80Var);
            }
        }
        return rih1.a;
    }
}
