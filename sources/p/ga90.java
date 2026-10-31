package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.gamesservice.musicguesser.v1.DailyIntro;
import com.spotify.gamesservice.musicguesser.v1.GetDailyIntroResponse;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ga90 {
    public final h3n0 a;
    public final ruz b;
    public final upa0 c;
    public final cz30 d;

    public ga90(h3n0 h3n0Var, ruz ruzVar, upa0 upa0Var, cz30 cz30Var) {
        this.a = h3n0Var;
        this.b = ruzVar;
        this.c = upa0Var;
        this.d = cz30Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0157 A[PHI: r3
      0x0157: PHI (r3v11 p.ma90) = (r3v10 p.ma90), (r3v15 p.ma90) binds: [B:52:0x0154, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(lnm lnmVar) {
        fa90 fa90Var;
        ma90 ma90Var;
        List listSingletonList;
        String str;
        if (lnmVar instanceof fa90) {
            fa90Var = (fa90) lnmVar;
            int i = fa90Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fa90Var.e = i - Integer.MIN_VALUE;
            } else {
                fa90Var = new fa90(this, lnmVar);
            }
        } else {
            fa90Var = new fa90(this, lnmVar);
        }
        Object objD = fa90Var.c;
        int i2 = fa90Var.e;
        cz30 cz30Var = this.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            fa90Var.e = 1;
            objD = this.a.d(fa90Var);
            if (objD != d9nVar) {
            }
        }
        if (i2 == 1) {
            hm5.M(objD);
        } else {
            if (i2 == 2) {
                ma90Var = fa90Var.a;
                hm5.M(objD);
                listSingletonList = Collections.singletonList(ma90Var.d.f);
                fa90Var.a = ma90Var;
                fa90Var.e = 3;
                if (guo1.H(new v4e0(listSingletonList, this.c, (lnm) null, (byte) 7), fa90Var) != d9nVar) {
                    str = ma90Var.d.g;
                    if (str.length() > 0) {
                        fa90Var.a = ma90Var;
                        fa90Var.b = str;
                        fa90Var.e = 4;
                        if (cz30Var.d(str, fa90Var) != d9nVar) {
                        }
                    }
                }
            }
            if (i2 == 3) {
                ma90 ma90Var2 = fa90Var.a;
                hm5.M(objD);
                ma90Var = ma90Var2;
                str = ma90Var.d.g;
                if (str.length() > 0) {
                    fa90Var.a = ma90Var;
                    fa90Var.b = str;
                    fa90Var.e = 4;
                    if (cz30Var.d(str, fa90Var) != d9nVar) {
                    }
                }
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ma90 ma90Var3 = fa90Var.a;
                hm5.M(objD);
                return ma90Var3;
            }
            str = fa90Var.b;
            ma90Var = fa90Var.a;
            hm5.M(objD);
        }
        fa90Var.a = ma90Var;
        fa90Var.b = null;
        fa90Var.e = 5;
        return cz30Var.c(str, fa90Var) == d9nVar ? d9nVar : ma90Var;
        sy21 sy21Var = (sy21) objD;
        ry21 ry21Var = sy21Var.a;
        if (!ry21Var.Q0) {
            eg.m(f4i1.c(ry21Var.d, "Failed to load game state: "));
            return null;
        }
        GetDailyIntroResponse getDailyIntroResponse = (GetDailyIntroResponse) sy21Var.b;
        if (getDailyIntroResponse == null) {
            Logger.d("MusicGuesser:Intro: Received empty response.", new Object[0]);
            eg.m("Empty response body");
            return null;
        }
        getDailyIntroResponse.p().toString();
        switch (ea90.a[getDailyIntroResponse.p().ordinal()]) {
            case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
            case 5:
            case 6:
                Logger.d("MusicGuesser:Intro: Unknown game state received: " + getDailyIntroResponse.p(), new Object[0]);
                bhn0.y(getDailyIntroResponse.p(), "Unknown game state: ");
                return null;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
            case 2:
            case 3:
                String strN = getDailyIntroResponse.n();
                boolean z = getDailyIntroResponse.p() == eai1.USER_GAME_STATE_COMPLETED;
                boolean z2 = getDailyIntroResponse.p() == eai1.USER_GAME_STATE_AVAILABLE_FIRST_GAME;
                DailyIntro dailyIntroO = getDailyIntroResponse.o();
                ma90 ma90Var4 = new ma90(strN, z, z2, new m5r0(dailyIntroO.getTitle(), dailyIntroO.getSubtitle(), dailyIntroO.t(), dailyIntroO.p(), dailyIntroO.o(), dailyIntroO.u(), dailyIntroO.n()));
                fa90Var.a = ma90Var4;
                fa90Var.e = 2;
                Object objI = fc11.i(this.b.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("musicguesser").build()).build())).ignoreElement(), fa90Var);
                if (objI != d9nVar) {
                    objI = rih1.a;
                }
                if (objI != d9nVar) {
                    ma90Var = ma90Var4;
                    listSingletonList = Collections.singletonList(ma90Var.d.f);
                    fa90Var.a = ma90Var;
                    fa90Var.e = 3;
                    if (guo1.H(new v4e0(listSingletonList, this.c, (lnm) null, (byte) 7), fa90Var) != d9nVar) {
                        str = ma90Var.d.g;
                        if (str.length() > 0) {
                            fa90Var.a = ma90Var;
                            fa90Var.b = str;
                            fa90Var.e = 4;
                            if (cz30Var.d(str, fa90Var) != d9nVar) {
                                fa90Var.a = ma90Var;
                                fa90Var.b = null;
                                fa90Var.e = 5;
                                if (cz30Var.c(str, fa90Var) == d9nVar) {
                                }
                            }
                        }
                    }
                }
            case 4:
                return new la90(getDailyIntroResponse.o().s(), getDailyIntroResponse.o().r());
        }
    }

    public final o6e0 c() {
        return new o6e0(new v6a(1, this, ga90.class, "load", "load(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 4), f46.I(new p6e0[0]));
    }
}
