package p;

import android.content.res.Resources;
import android.util.Base64;
import com.google.protobuf.Any;
import com.google.protobuf.Timestamp;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$EditPromptablePlaylistResponse;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$PromptablePlaylistError;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$Suggestion;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$SuggestionChild;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$SuggestionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h3y0 {
    public final tby0 a;
    public final zwz0 b;
    public final Resources c;

    public h3y0(tby0 tby0Var, zwz0 zwz0Var, Resources resources) {
        this.a = tby0Var;
        this.b = zwz0Var;
        this.c = resources;
    }

    public static List b(sy21 sy21Var) {
        n4y0 f4y0Var;
        String strC = sy21Var.a.f.c("grpc-status-details-bin");
        if (strC == null) {
            strC = null;
        }
        if (strC == null) {
            return Collections.singletonList(new i4y0());
        }
        h290 h290VarN = Promptableplaylist.Status.o(Base64.decode(strC, 0)).n();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarN.iterator();
        while (it.hasNext()) {
            Promptableplaylist$PromptablePlaylistError promptableplaylist$PromptablePlaylistErrorQ = Promptableplaylist$PromptablePlaylistError.q(((Any) it.next()).q());
            int i = c3y0.a[promptableplaylist$PromptablePlaylistErrorQ.o().ordinal()];
            if (i == 1) {
                f4y0Var = new f4y0(promptableplaylist$PromptablePlaylistErrorQ.n());
            } else if (i == 2) {
                f4y0Var = new k4y0(promptableplaylist$PromptablePlaylistErrorQ.n());
            } else if (i == 3) {
                f4y0Var = new m4y0(promptableplaylist$PromptablePlaylistErrorQ.n());
            } else if (i != 4) {
                f4y0Var = i != 5 ? new i4y0(promptableplaylist$PromptablePlaylistErrorQ.n()) : new i4y0(promptableplaylist$PromptablePlaylistErrorQ.n());
            } else {
                String strN = promptableplaylist$PromptablePlaylistErrorQ.n();
                Timestamp timestampO = promptableplaylist$PromptablePlaylistErrorQ.p().o();
                f4y0Var = new h4y0(strN, Instant.ofEpochSecond(timestampO.q(), timestampO.p()).toString());
            }
            arrayList.add(f4y0Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, boolean z, nmu0 nmu0Var, onm onmVar) {
        d3y0 d3y0Var;
        j1y0 j1y0Var;
        if (onmVar instanceof d3y0) {
            d3y0Var = (d3y0) onmVar;
            int i = d3y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3y0Var.c = i - Integer.MIN_VALUE;
            } else {
                d3y0Var = new d3y0(this, onmVar);
            }
        } else {
            d3y0Var = new d3y0(this, onmVar);
        }
        Object objC = d3y0Var.a;
        int i2 = d3y0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            g1y0 g1y0VarO = Promptableplaylist.EditPromptablePlaylistRequest.o();
            g1y0VarO.r(str);
            e1y0 e1y0VarN = Promptableplaylist.AttributeUpdate.n();
            e1y0VarN.q(str2);
            g1y0VarO.n(e1y0VarN.build());
            if (nmu0Var != null) {
                e1y0 e1y0VarN2 = Promptableplaylist.AttributeUpdate.n();
                int iOrdinal = nmu0Var.ordinal();
                if (iOrdinal == 0) {
                    j1y0Var = j1y0.PLAYLIST_GENERATION_MODE_ITERATIVE_UPDATE;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    j1y0Var = j1y0.PLAYLIST_GENERATION_MODE_FULL_GENERATION;
                }
                e1y0VarN2.n(j1y0Var);
                g1y0VarO.n(e1y0VarN2.build());
            }
            g1y0VarO.q(z);
            Promptableplaylist.EditPromptablePlaylistRequest editPromptablePlaylistRequestBuild = g1y0VarO.build();
            editPromptablePlaylistRequestBuild.getClass();
            d3y0Var.c = 1;
            objC = this.a.c(editPromptablePlaylistRequestBuild, d3y0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        sy21 sy21Var = (sy21) objC;
        if (!sy21Var.a.Q0) {
            return new f2w(b(sy21Var));
        }
        Object obj = sy21Var.b;
        if (obj != null) {
            Promptableplaylist$EditPromptablePlaylistResponse promptableplaylist$EditPromptablePlaylistResponse = (Promptableplaylist$EditPromptablePlaylistResponse) obj;
            return new g2w(promptableplaylist$EditPromptablePlaylistResponse.o(), promptableplaylist$EditPromptablePlaylistResponse.n());
        }
        hhg1.n("Response body is null for successful edit playlist response");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012d A[Catch: Exception -> 0x0057, TryCatch #1 {Exception -> 0x0057, blocks: (B:17:0x0052, B:59:0x0125, B:61:0x012d, B:63:0x0140, B:22:0x005e, B:48:0x00e2, B:50:0x00eb, B:52:0x00ef, B:54:0x0107, B:55:0x010e, B:56:0x010f), top: B:80:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0140 A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #1 {Exception -> 0x0057, blocks: (B:17:0x0052, B:59:0x0125, B:61:0x012d, B:63:0x0140, B:22:0x005e, B:48:0x00e2, B:50:0x00eb, B:52:0x00ef, B:54:0x0107, B:55:0x010e, B:56:0x010f), top: B:80:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
    
        if (r4 == r14) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.n8y0] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r17, java.lang.String r18, p.n8y0 r19, boolean r20, java.lang.String r21, boolean r22, p.nmu0 r23, p.onm r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h3y0.c(java.lang.String, java.lang.String, p.n8y0, boolean, java.lang.String, boolean, p.nmu0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        f3y0 f3y0Var;
        if (onmVar instanceof f3y0) {
            f3y0Var = (f3y0) onmVar;
            int i = f3y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f3y0Var.c = i - Integer.MIN_VALUE;
            } else {
                f3y0Var = new f3y0(this, onmVar);
            }
        } else {
            f3y0Var = new f3y0(this, onmVar);
        }
        Object objE = f3y0Var.a;
        int i2 = f3y0Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            i1y0 i1y0VarN = Promptableplaylist.GetPromptablePlaylistRequest.n();
            i1y0VarN.n();
            Promptableplaylist.GetPromptablePlaylistRequest getPromptablePlaylistRequestBuild = i1y0VarN.build();
            getPromptablePlaylistRequestBuild.getClass();
            f3y0Var.c = 1;
            objE = this.a.e(getPromptablePlaylistRequestBuild, f3y0Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        sy21 sy21Var = (sy21) objE;
        if (!sy21Var.a.Q0) {
            return new gwc1(z6x.a);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get suggestions response");
            return null;
        }
        h290<Promptableplaylist$Suggestion> h290VarN = ((Promptableplaylist$SuggestionResponse) obj).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (Promptableplaylist$Suggestion promptableplaylist$Suggestion : h290VarN) {
            String strN = promptableplaylist$Suggestion.n();
            h290 h290VarO = promptableplaylist$Suggestion.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            Iterator it = h290VarO.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Promptableplaylist$SuggestionChild) it.next()).n());
            }
            arrayList.add(new fwc1(strN, arrayList2));
        }
        return new gwc1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, o8y0 o8y0Var, onm onmVar) {
        g3y0 g3y0Var;
        o1y0 o1y0Var;
        if (onmVar instanceof g3y0) {
            g3y0Var = (g3y0) onmVar;
            int i = g3y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3y0Var.c = i - Integer.MIN_VALUE;
            } else {
                g3y0Var = new g3y0(this, onmVar);
            }
        } else {
            g3y0Var = new g3y0(this, onmVar);
        }
        Object objA = g3y0Var.a;
        int i2 = g3y0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            n1y0 n1y0VarN = Promptableplaylist.RefreshPromptablePlaylistRequest.n();
            n1y0VarN.q(str);
            int iOrdinal = o8y0Var.ordinal();
            if (iOrdinal == 0) {
                o1y0Var = o1y0.UNSPECIFIED;
            } else if (iOrdinal == 1) {
                o1y0Var = o1y0.MANUAL;
            } else if (iOrdinal == 2) {
                o1y0Var = o1y0.SCHEDULED;
            } else if (iOrdinal == 3) {
                o1y0Var = o1y0.OUTDATED_PROMPT_VERSION_TRIGGER;
            } else {
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                o1y0Var = o1y0.OVERDUE_SCHEDULED_PLAYLIST_OPENED;
            }
            n1y0VarN.n(o1y0Var);
            Promptableplaylist.RefreshPromptablePlaylistRequest refreshPromptablePlaylistRequestBuild = n1y0VarN.build();
            refreshPromptablePlaylistRequestBuild.getClass();
            g3y0Var.c = 1;
            objA = this.a.a(refreshPromptablePlaylistRequestBuild, g3y0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        sy21 sy21Var = (sy21) objA;
        return sy21Var.a.Q0 ? le11.a : new ke11(b(sy21Var));
    }
}
