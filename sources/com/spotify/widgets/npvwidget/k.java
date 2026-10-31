package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import p.a7h1;
import p.ae5;
import p.b7x;
import p.beh;
import p.d9n;
import p.d9u0;
import p.eg;
import p.eth;
import p.f3t0;
import p.fc11;
import p.feh;
import p.fn31;
import p.gal;
import p.hl0;
import p.hm5;
import p.i3o1;
import p.i8h1;
import p.ihc1;
import p.j9u0;
import p.kk0;
import p.l9u0;
import p.lnm;
import p.mmr0;
import p.o7h;
import p.o9u0;
import p.onm;
import p.q8n;
import p.r6h1;
import p.rih1;
import p.ruz;
import p.smo1;
import p.sqg0;
import p.sqk0;
import p.tv80;
import p.u890;
import p.vnr;
import p.w7h1;
import p.x6h1;
import p.x7h1;
import p.xj61;
import p.xm41;
import p.y210;
import p.y610;
import p.y6h1;
import p.z7h1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k {
    public final y610 a;
    public final ruz b;
    public final m c;
    public final y210 d;
    public final Context e;
    public final vnr f;
    public final ae5 g;
    public final gal h;
    public final xm41 i;
    public final q8n j;

    public k(y610 y610Var, ruz ruzVar, m mVar, y210 y210Var, Context context, vnr vnrVar, ae5 ae5Var, gal galVar, xm41 xm41Var, q8n q8nVar) {
        this.a = y610Var;
        this.b = ruzVar;
        this.c = mVar;
        this.d = y210Var;
        this.e = context;
        this.f = vnrVar;
        this.g = ae5Var;
        this.h = galVar;
        this.i = xm41Var;
        this.j = q8nVar;
    }

    public final Object a(Bundle bundle, f3t0 f3t0Var) {
        Object objY;
        w7h1 w7h1Var;
        m mVar = this.c;
        i8h1 i8h1Var = mVar.a;
        WidgetInteraction widgetInteraction = Build.VERSION.SDK_INT >= 33 ? (WidgetInteraction) bundle.getParcelable("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", WidgetInteraction.class) : (WidgetInteraction) bundle.getParcelable("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION");
        String string = bundle.getString("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY");
        if (string == null) {
            string = "";
        }
        boolean z = widgetInteraction instanceof WidgetInteraction.ItemClick;
        xm41 xm41Var = this.i;
        b7x b7xVar = b7x.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            WidgetInteraction.ItemClick itemClick = (WidgetInteraction.ItemClick) widgetInteraction;
            if (itemClick instanceof WidgetInteraction.ItemClick.GridItemClick) {
                WidgetInteraction.ItemClick.GridItemClick gridItemClick = (WidgetInteraction.ItemClick.GridItemClick) itemClick;
                sqk0 sqk0VarA = m.a(gridItemClick);
                String string2 = gridItemClick.getItemUri().toString();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (string2 == null) {
                    string2 = "";
                }
                w7h1Var = new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", string2)), sqk0VarA.b, r6h1.c, System.currentTimeMillis());
            } else {
                if (!(itemClick instanceof WidgetInteraction.ItemClick.HeroItemClick)) {
                    eg.o();
                    return null;
                }
                WidgetInteraction.ItemClick.HeroItemClick heroItemClick = (WidgetInteraction.ItemClick.HeroItemClick) itemClick;
                String pageIdentifier = heroItemClick.getPageIdentifier();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-widget-npv-recommendations";
                x6h1VarI.f = "7.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = pageIdentifier;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("any");
                String string3 = heroItemClick.getHeroItemUri().toString();
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("hero_item", (String) null, (Integer) null, string3, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                String string4 = heroItemClick.getHeroItemUri().toString();
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                if (string4 == null) {
                    string4 = "";
                }
                w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", string4)), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            }
            w7h1 w7h1Var2 = w7h1Var;
            mVar.b(itemClick.getPageIdentifier());
            tv80 tv80VarM = i8h1Var.m(w7h1Var2, (xj61) null);
            eth.z(xm41Var, new e(tv80VarM, itemClick, string));
            Object objS = smo1.s(new g(this, itemClick, tv80VarM, string, null), f3t0Var);
            if (objS != d9nVar) {
                objS = rih1Var;
            }
            if (objS == d9nVar) {
                return objS;
            }
        } else {
            String str = string;
            if (widgetInteraction instanceof WidgetInteraction.PlayCommand) {
                WidgetInteraction.PlayCommand playCommand = (WidgetInteraction.PlayCommand) widgetInteraction;
                String pageIdentifier2 = playCommand.getPageIdentifier();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-widget-npv-recommendations";
                x6h1VarI2.f = "7.2.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = pageIdentifier2;
                x6h1 x6h1VarR = kk0.r(x6h1VarI2, "any");
                x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                x6h1 x6h1VarC2 = x6h1VarR.a().c();
                x6h1VarC2.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                w7h1 w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", "")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                mVar.b(playCommand.getPageIdentifier());
                tv80 tv80VarM2 = i8h1Var.m(w7h1Var3, (xj61) null);
                if (playCommand.getContextUri().length() > 0) {
                    eth.z(xm41Var, new c(tv80VarM2, playCommand, str));
                }
                Object objS2 = smo1.s(new d(this, tv80VarM2, str, null), f3t0Var);
                if (objS2 != d9nVar) {
                    objS2 = rih1Var;
                }
                if (objS2 == d9nVar) {
                    return objS2;
                }
            } else if (widgetInteraction instanceof WidgetInteraction.PauseCommand) {
                Object objC = c((WidgetInteraction.PauseCommand) widgetInteraction, str, f3t0Var);
                if (objC == d9nVar) {
                    return objC;
                }
            } else if (widgetInteraction instanceof WidgetInteraction.NextCommand) {
                Object objB = b((WidgetInteraction.NextCommand) widgetInteraction, str, f3t0Var);
                if (objB == d9nVar) {
                    return objB;
                }
            } else if (widgetInteraction instanceof WidgetInteraction.PreviousCommand) {
                Object objD = d((WidgetInteraction.PreviousCommand) widgetInteraction, str, f3t0Var);
                if (objD == d9nVar) {
                    return objD;
                }
            } else if (widgetInteraction instanceof WidgetInteraction.SeekBackwardCommand) {
                Object objE = e((WidgetInteraction.SeekBackwardCommand) widgetInteraction, str, f3t0Var);
                if (objE == d9nVar) {
                    return objE;
                }
            } else if (widgetInteraction instanceof WidgetInteraction.SeekForwardCommand) {
                Object objF = f((WidgetInteraction.SeekForwardCommand) widgetInteraction, str, f3t0Var);
                if (objF == d9nVar) {
                    return objF;
                }
            } else if (widgetInteraction instanceof WidgetInteraction.CurateCommand) {
                WidgetInteraction.CurateCommand curateCommand = (WidgetInteraction.CurateCommand) widgetInteraction;
                String albumUri = curateCommand.getTrackMetadata().getAlbumUri();
                if (albumUri == null) {
                    albumUri = curateCommand.getTrackMetadata().getUri();
                }
                int iOrdinal = curateCommand.getCurrentCurationState().ordinal();
                q8n q8nVar = this.j;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        String pageIdentifier3 = curateCommand.getPageIdentifier();
                        y6h1 y6h1Var3 = y6h1.i;
                        x6h1 x6h1VarI3 = i3o1.i();
                        x6h1VarI3.h = "music";
                        x6h1VarI3.a = "mobile-widget-npv-recommendations";
                        x6h1VarI3.f = "7.2.0";
                        x6h1VarI3.g = "22.0.0";
                        x6h1VarI3.b = pageIdentifier3;
                        x6h1 x6h1VarR2 = kk0.r(x6h1VarI3, "any");
                        x6h1VarR2.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR2.j = false;
                        x6h1 x6h1VarC4 = x6h1VarR2.a().c();
                        x6h1VarC4.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                        x6h1VarC5.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1 w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", albumUri)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                        mVar.b(pageIdentifier3);
                        i8h1Var.m(w7h1Var4, (xj61) null);
                        objY = fn31.Y(q8nVar, new hl0(this, curateCommand.getTrackMetadata(), false, (lnm) null, (byte) 4), f3t0Var);
                        if (objY != d9nVar) {
                            objY = rih1Var;
                        }
                        if (objY != d9nVar) {
                        }
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        g(this.f.a.getString(2131959280));
                    }
                    objY = rih1Var;
                } else {
                    String pageIdentifier4 = curateCommand.getPageIdentifier();
                    y6h1 y6h1Var4 = y6h1.i;
                    x6h1 x6h1VarI4 = i3o1.i();
                    x6h1VarI4.h = "music";
                    x6h1VarI4.a = "mobile-widget-npv-recommendations";
                    x6h1VarI4.f = "7.2.0";
                    x6h1VarI4.g = "22.0.0";
                    x6h1VarI4.b = pageIdentifier4;
                    x6h1 x6h1VarR3 = kk0.r(x6h1VarI4, "any");
                    x6h1VarR3.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR3.j = false;
                    x6h1 x6h1VarC6 = x6h1VarR3.a().c();
                    x6h1VarC6.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1 w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", albumUri)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    mVar.b(pageIdentifier4);
                    i8h1Var.m(w7h1Var5, (xj61) null);
                    objY = fn31.Y(q8nVar, new hl0(this, curateCommand.getTrackMetadata(), true, (lnm) null, (byte) 4), f3t0Var);
                    if (objY != d9nVar) {
                        objY = rih1Var;
                    }
                    if (objY != d9nVar) {
                        objY = rih1Var;
                    }
                }
                if (objY == d9nVar) {
                    return objY;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(WidgetInteraction.NextCommand nextCommand, String str, onm onmVar) {
        a aVar;
        String str2;
        if (onmVar instanceof a) {
            aVar = (a) onmVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, onmVar);
            }
        } else {
            aVar = new a(this, onmVar);
        }
        Object objJ = aVar.b;
        int i2 = aVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            String pageIdentifier = nextCommand.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            x6h1 x6h1VarC = x6h1VarR.a().c();
            x6h1VarC.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("skip_next", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", ""), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            String pageIdentifier2 = nextCommand.getPageIdentifier();
            m mVar = this.c;
            mVar.b(pageIdentifier2);
            mVar.a.m(w7h1Var, (xj61) null);
            Single singleA = this.b.a(new l9u0());
            aVar.a = str;
            aVar.d = 1;
            objJ = fc11.j(singleA, aVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = aVar.a;
            hm5.M(objJ);
        }
        beh behVar = (feh) objJ;
        if (behVar instanceof beh) {
            String str3 = behVar.a;
            Logger.k("'Next' command failed: %s", new Object[]{str3});
            String string = u890.j((String) o7h.s0(ihc1.Q0(str3, new String[]{","}, 0, 6)), "mft_disallow") ? this.f.a.getString(2131959284) : null;
            if (string != null) {
                g(string);
            }
            this.g.c(4, str2, str3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(WidgetInteraction.PauseCommand pauseCommand, String str, onm onmVar) {
        b bVar;
        String str2;
        if (onmVar instanceof b) {
            bVar = (b) onmVar;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, onmVar);
            }
        } else {
            bVar = new b(this, onmVar);
        }
        Object objJ = bVar.b;
        int i2 = bVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            String pageIdentifier = pauseCommand.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            x6h1 x6h1VarC = x6h1VarR.a().c();
            x6h1VarC.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            String pageIdentifier2 = pauseCommand.getPageIdentifier();
            m mVar = this.c;
            mVar.b(pageIdentifier2);
            mVar.a.m(w7h1Var, (xj61) null);
            Single singleA = this.b.a(new d9u0("proactiveplatforms-widget", false));
            bVar.a = str;
            bVar.d = 1;
            objJ = fc11.j(singleA, bVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = bVar.a;
            hm5.M(objJ);
        }
        beh behVar = (feh) objJ;
        if (behVar instanceof beh) {
            String str3 = behVar.a;
            Logger.k("'Pause' command failed: %s", new Object[]{str3});
            this.g.c(3, str2, str3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(WidgetInteraction.PreviousCommand previousCommand, String str, onm onmVar) {
        h hVar;
        String str2;
        if (onmVar instanceof h) {
            hVar = (h) onmVar;
            int i = hVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.d = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, onmVar);
            }
        } else {
            hVar = new h(this, onmVar);
        }
        Object objJ = hVar.b;
        int i2 = hVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            String pageIdentifier = previousCommand.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            x6h1 x6h1VarC = x6h1VarR.a().c();
            x6h1VarC.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("skip_previous", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", ""), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            String pageIdentifier2 = previousCommand.getPageIdentifier();
            m mVar = this.c;
            mVar.b(pageIdentifier2);
            mVar.a.m(w7h1Var, (xj61) null);
            Single singleA = this.b.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
            hVar.a = str;
            hVar.d = 1;
            objJ = fc11.j(singleA, hVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = hVar.a;
            hm5.M(objJ);
        }
        beh behVar = (feh) objJ;
        if (behVar instanceof beh) {
            String str3 = behVar.a;
            Logger.k("'Previous' command failed: %s", new Object[]{str3});
            this.g.c(5, str2, str3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(WidgetInteraction.SeekBackwardCommand seekBackwardCommand, String str, onm onmVar) {
        i iVar;
        String str2;
        if (onmVar instanceof i) {
            iVar = (i) onmVar;
            int i = iVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.d = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, onmVar);
            }
        } else {
            iVar = new i(this, onmVar);
        }
        Object objJ = iVar.b;
        int i2 = iVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            String pageIdentifier = seekBackwardCommand.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            x6h1 x6h1VarC = x6h1VarR.a().c();
            x6h1VarC.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("skip_previous", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA = x6h1VarC2.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            String strValueOf = String.valueOf(-15000);
            if (strValueOf == null) {
                strValueOf = "";
            }
            w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 2, sqg0.J(new mmr0[]{new mmr0("ms_seeked_offset", strValueOf), new mmr0("position_ms", "")})), y6h1VarA, r6h1.c, System.currentTimeMillis());
            String pageIdentifier2 = seekBackwardCommand.getPageIdentifier();
            m mVar = this.c;
            mVar.b(pageIdentifier2);
            mVar.a.m(w7h1Var, (xj61) null);
            Single singleA = this.b.a(new j9u0(SeekToCommand.builder(-15000L).relative(SeekToCommand.Relative.CURRENT).build()));
            iVar.a = str;
            iVar.d = 1;
            objJ = fc11.j(singleA, iVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = iVar.a;
            hm5.M(objJ);
        }
        beh behVar = (feh) objJ;
        if (behVar instanceof beh) {
            String str3 = behVar.a;
            Logger.k("'Skip back 15sec' command failed: %s", new Object[]{str3});
            this.g.c(7, str2, str3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(WidgetInteraction.SeekForwardCommand seekForwardCommand, String str, onm onmVar) {
        j jVar;
        String str2;
        if (onmVar instanceof j) {
            jVar = (j) onmVar;
            int i = jVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.d = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, onmVar);
            }
        } else {
            jVar = new j(this, onmVar);
        }
        Object objJ = jVar.b;
        int i2 = jVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            String pageIdentifier = seekForwardCommand.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            x6h1 x6h1VarC = x6h1VarR.a().c();
            x6h1VarC.i.add(new a7h1("playback_controls", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("skip_next", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA = x6h1VarC2.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            String strValueOf = String.valueOf(15000);
            if (strValueOf == null) {
                strValueOf = "";
            }
            w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 2, sqg0.J(new mmr0[]{new mmr0("ms_seeked_offset", strValueOf), new mmr0("position_ms", "")})), y6h1VarA, r6h1.c, System.currentTimeMillis());
            String pageIdentifier2 = seekForwardCommand.getPageIdentifier();
            m mVar = this.c;
            mVar.b(pageIdentifier2);
            mVar.a.m(w7h1Var, (xj61) null);
            Single singleA = this.b.a(new j9u0(SeekToCommand.builder(15000L).relative(SeekToCommand.Relative.CURRENT).build()));
            jVar.a = str;
            jVar.d = 1;
            objJ = fc11.j(singleA, jVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = jVar.a;
            hm5.M(objJ);
        }
        beh behVar = (feh) objJ;
        if (behVar instanceof beh) {
            String str3 = behVar.a;
            Logger.k("'Skip forward 15sec' command failed: %s", new Object[]{str3});
            this.g.c(6, str2, str3);
        }
        return rih1.a;
    }

    public final void g(String str) {
        Context context = this.e;
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_TOOLTIP");
        intent.putExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE", str);
        context.sendBroadcast(intent);
    }
}
