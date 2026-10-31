package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vna1 {
    public final qna1 a;
    public final a710 b;
    public final a77 c;
    public final peu0 d;
    public final zle1 e;
    public final q8n f;
    public final q8n g;
    public final q8n h;
    public final llm i;
    public faa0 j;

    public vna1(qna1 qna1Var, a710 a710Var, a77 a77Var, peu0 peu0Var, zle1 zle1Var, q8n q8nVar, q8n q8nVar2, q8n q8nVar3, llm llmVar) {
        this.a = qna1Var;
        this.b = a710Var;
        this.c = a77Var;
        this.d = peu0Var;
        this.e = zle1Var;
        this.f = q8nVar;
        this.g = q8nVar2;
        this.h = q8nVar3;
        this.i = llmVar;
    }

    public static void b(vna1 vna1Var, int i, String str, VoiceAssistantLoggingContext voiceAssistantLoggingContext, t45 t45Var, Exception exc, Integer num, int i2) {
        if ((i2 & 16) != 0) {
            exc = null;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        a77 a77Var = vna1Var.c;
        if (t45Var != null) {
            t45Var.a("outcome", us71.c(i));
            t45Var.g(str);
            ((s45) vna1Var.e).b(t45Var.e());
        }
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                if (exc == null) {
                    a77Var.c(voiceAssistantLoggingContext);
                    return;
                } else {
                    a77Var.d(exc, voiceAssistantLoggingContext);
                    return;
                }
            }
            if (iC == 2) {
                a77Var.b.h(new d77(voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), gvg.e((num != null ? num.intValue() : 0) / 1000, "Playlist was not generated within ", " seconds"), voiceAssistantLoggingContext.getInteractionId(), 5, (String) null, voiceAssistantLoggingContext.getUserId()));
                a77Var.a.a(kkv.k);
            } else if (iC != 3) {
                if (iC == 4) {
                    a77Var.a(voiceAssistantLoggingContext, null, null);
                } else {
                    eg.o();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, t45 t45Var, onm onmVar) {
        tna1 tna1Var;
        if (onmVar instanceof tna1) {
            tna1Var = (tna1) onmVar;
            int i = tna1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tna1Var.d = i - Integer.MIN_VALUE;
            } else {
                tna1Var = new tna1(this, onmVar);
            }
        } else {
            tna1Var = new tna1(this, onmVar);
        }
        Object objB = tna1Var.b;
        int i2 = tna1Var.d;
        if (i2 == 0) {
            hm5.M(objB);
            String strUri = context.uri();
            tna1Var.a = t45Var;
            tna1Var.d = 1;
            objB = this.d.b(strUri, tna1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t45Var = tna1Var.a;
            hm5.M(objB);
        }
        ieu0 ieu0Var = (leu0) objB;
        boolean zJ = u890.j(ieu0Var, jeu0.a);
        zle1 zle1Var = this.e;
        if (zJ) {
            if (t45Var != null) {
                t45Var.g("player_start_to_playback_started");
                t45Var.a("outcome", us71.c(1));
                ((s45) zle1Var).b(t45Var.e());
            }
        } else if (u890.j(ieu0Var, keu0.a)) {
            if (t45Var != null) {
                t45Var.g("player_start_to_playback_started");
                t45Var.a("outcome", us71.c(3));
                ((s45) zle1Var).b(t45Var.e());
            }
        } else {
            if (!(ieu0Var instanceof ieu0)) {
                eg.o();
                return null;
            }
            Logger.e(ieu0Var.a(), "Error observing player state", new Object[0]);
        }
        return rih1.a;
    }

    public final Object c(CommandPlayResponse commandPlayResponse, Context context, t45 t45Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, onm onmVar) {
        faa0 faa0Var = this.j;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.j = c921.y(this.i, (o8n) null, 0, new uk71(this, context, t45Var, (lnm) null, (byte) 24), 3);
        if (t45Var != null) {
            t45Var.g("command_to_player_start");
            t45Var.l("player_start_to_playback_started", null, (2 & 4) != 0);
        }
        Object objH = c921.H(this.f, new bj81((byte) 3, this, commandPlayResponse, context, voiceAssistantLoggingContext, t45Var, (lnm) null), onmVar);
        return objH == d9n.a ? objH : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20, types: [p.t45] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final Object d(Uri uri, String str, t45 t45Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, onm onmVar) {
        una1 una1Var;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext2;
        Exception exc;
        ?? r5;
        CommandPlayRequest commandPlayRequest;
        t45 t45Var2;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext3;
        Exception e;
        t45 t45Var3;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext4;
        CommandPlayResponse commandPlayResponse;
        CommandPlayRequest commandPlayRequest2;
        Context context;
        t45 t45Var4;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext5;
        t45 t45Var5;
        ?? r6;
        t45 t45Var6 = t45Var;
        if (onmVar instanceof una1) {
            una1Var = (una1) onmVar;
            int i = una1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                una1Var.f = i - Integer.MIN_VALUE;
            } else {
                una1Var = new una1(this, onmVar);
            }
        } else {
            una1Var = new una1(this, onmVar);
        }
        una1 una1Var2 = una1Var;
        Object obj = una1Var2.d;
        int i2 = una1Var2.f;
        int i3 = 2;
        rih1 rih1Var = rih1.a;
        ?? r7 = 2;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        CommandPlayRequest commandPlayRequest3 = una1Var2.c;
                        VoiceAssistantLoggingContext voiceAssistantLoggingContext6 = una1Var2.b;
                        t45 t45Var7 = una1Var2.a;
                        try {
                            hm5.M(obj);
                            voiceAssistantLoggingContext2 = voiceAssistantLoggingContext6;
                            commandPlayRequest = commandPlayRequest3;
                            t45Var6 = t45Var7;
                        } catch (Exception e2) {
                            e = e2;
                            voiceAssistantLoggingContext3 = voiceAssistantLoggingContext6;
                            t45Var2 = t45Var7;
                            i3 = 2;
                            exc = e;
                            r6 = t45Var2;
                            b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                            return rih1Var;
                        }
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        VoiceAssistantLoggingContext voiceAssistantLoggingContext7 = una1Var2.b;
                        t45 t45Var8 = una1Var2.a;
                        try {
                            hm5.M(obj);
                            return rih1Var;
                        } catch (Exception e3) {
                            exc = e3;
                            voiceAssistantLoggingContext3 = voiceAssistantLoggingContext7;
                            t45Var5 = t45Var8;
                        }
                    }
                    i3 = 2;
                    r6 = t45Var5;
                    b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                    return rih1Var;
                }
                hm5.M(obj);
                if (t45Var6 != null) {
                    t45Var6.l("command_to_player_start", null, (2 & 4) != 0);
                }
                CommandPlayRequest commandPlayRequest4 = new CommandPlayRequest(uri.toString(), str, true);
                try {
                    q8n q8nVar = this.h;
                    sna1 sna1Var = new sna1(this, commandPlayRequest4, (lnm) null, (byte) 1);
                    una1Var2.a = t45Var6;
                    voiceAssistantLoggingContext2 = voiceAssistantLoggingContext;
                    try {
                        una1Var2.b = voiceAssistantLoggingContext2;
                        una1Var2.c = commandPlayRequest4;
                        una1Var2.f = 1;
                        Object objH = c921.H(q8nVar, sna1Var, una1Var2);
                        if (objH != d9nVar) {
                            commandPlayRequest = commandPlayRequest4;
                            obj = objH;
                        }
                        return d9nVar;
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        r5 = t45Var6;
                        voiceAssistantLoggingContext3 = voiceAssistantLoggingContext2;
                        r6 = r5;
                        b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                        return rih1Var;
                    }
                } catch (Exception e5) {
                    e = e5;
                    voiceAssistantLoggingContext2 = voiceAssistantLoggingContext;
                }
                if (!u890.j(commandPlayResponse.getPlaybackReadiness(), "IN_PROGRESS")) {
                    t45 t45Var9 = t45Var6;
                    try {
                        if (!u890.j(commandPlayResponse.getPlaybackReadiness(), "READY") || context == null) {
                            VoiceAssistantLoggingContext voiceAssistantLoggingContext8 = voiceAssistantLoggingContext2;
                            try {
                                b(this, 2, "command_to_player_start", voiceAssistantLoggingContext8, t45Var9, null, null, 48);
                                return rih1Var;
                            } catch (Exception e6) {
                                e = e6;
                                voiceAssistantLoggingContext4 = voiceAssistantLoggingContext8;
                                t45Var3 = t45Var9;
                                i3 = 2;
                                VoiceAssistantLoggingContext voiceAssistantLoggingContext9 = voiceAssistantLoggingContext4;
                                t45Var2 = t45Var3;
                                voiceAssistantLoggingContext3 = voiceAssistantLoggingContext9;
                                exc = e;
                                r6 = t45Var2;
                                b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                                return rih1Var;
                            }
                        }
                        if (t45Var9 != null) {
                            t45Var9.a("requires_polling", "false");
                        }
                        try {
                            una1Var2.a = t45Var9;
                            una1Var2.b = voiceAssistantLoggingContext2;
                            una1Var2.c = null;
                            una1Var2.f = 3;
                            t45Var4 = t45Var9;
                            voiceAssistantLoggingContext5 = voiceAssistantLoggingContext2;
                            try {
                                if (c(commandPlayResponse, context, t45Var4, voiceAssistantLoggingContext5, una1Var2) == d9nVar) {
                                    return d9nVar;
                                }
                                return rih1Var;
                            } catch (Exception e7) {
                                e = e7;
                                VoiceAssistantLoggingContext voiceAssistantLoggingContext10 = voiceAssistantLoggingContext5;
                                t45Var5 = t45Var4;
                                voiceAssistantLoggingContext3 = voiceAssistantLoggingContext10;
                                exc = e;
                                i3 = 2;
                                r6 = t45Var5;
                                b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                                return rih1Var;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            t45Var4 = t45Var9;
                            voiceAssistantLoggingContext5 = voiceAssistantLoggingContext2;
                            VoiceAssistantLoggingContext voiceAssistantLoggingContext11 = voiceAssistantLoggingContext5;
                            t45Var5 = t45Var4;
                            voiceAssistantLoggingContext3 = voiceAssistantLoggingContext11;
                            exc = e;
                            i3 = 2;
                            r6 = t45Var5;
                            b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                            return rih1Var;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        t45Var3 = t45Var9;
                        i3 = 2;
                        voiceAssistantLoggingContext4 = voiceAssistantLoggingContext2;
                        VoiceAssistantLoggingContext voiceAssistantLoggingContext12 = voiceAssistantLoggingContext4;
                        t45Var2 = t45Var3;
                        voiceAssistantLoggingContext3 = voiceAssistantLoggingContext12;
                        exc = e;
                        r6 = t45Var2;
                        b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                        return rih1Var;
                    }
                }
                try {
                    Context context2 = commandPlayResponse.getContext();
                    List<Integer> retryDelayMs = commandPlayResponse.getRetryDelayMs();
                    una1Var2.a = t45Var6;
                    una1Var2.b = voiceAssistantLoggingContext2;
                    una1Var2.c = null;
                    una1Var2.f = 2;
                    t45 t45Var10 = t45Var6;
                    VoiceAssistantLoggingContext voiceAssistantLoggingContext13 = voiceAssistantLoggingContext2;
                    try {
                        Object objS = smo1.s(new zvy(this, commandPlayRequest2, retryDelayMs, t45Var10, voiceAssistantLoggingContext13, context2, (lnm) null, (byte) 3), una1Var2);
                        if (objS != d9nVar) {
                            objS = rih1Var;
                        }
                        if (objS == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    } catch (Exception e10) {
                        e = e10;
                        voiceAssistantLoggingContext2 = voiceAssistantLoggingContext13;
                        r7 = t45Var10;
                        exc = e;
                        r5 = r7;
                        voiceAssistantLoggingContext3 = voiceAssistantLoggingContext2;
                        r6 = r5;
                        b(this, i3, "command_to_player_start", voiceAssistantLoggingContext3, r6, exc, null, 32);
                        return rih1Var;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r7 = t45Var6;
                }
            } catch (Exception e12) {
                e = e12;
            }
            commandPlayResponse = (CommandPlayResponse) obj;
            commandPlayRequest2 = commandPlayRequest;
            context = commandPlayResponse.getContext();
        } catch (Exception e13) {
            e = e13;
            t45Var3 = t45Var6;
        }
    }
}
