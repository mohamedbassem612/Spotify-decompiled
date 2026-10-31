package p;

import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.widgets.widgetstate.WidgetStateKt;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hjm1 implements ejm1 {
    public final y441 a;
    public final xim1 b;
    public final zsc c;
    public final o860 d;

    public hjm1(y441 y441Var, xim1 xim1Var, zsc zscVar, o860 o860Var) {
        this.a = y441Var;
        this.b = xim1Var;
        this.c = zscVar;
        this.d = o860Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        fjm1 fjm1Var;
        if (onmVar instanceof fjm1) {
            fjm1Var = (fjm1) onmVar;
            int i = fjm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjm1Var.d = i - Integer.MIN_VALUE;
            } else {
                fjm1Var = new fjm1(this, onmVar);
            }
        } else {
            fjm1Var = new fjm1(this, onmVar);
        }
        Object objB = fjm1Var.b;
        int i2 = fjm1Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            fjm1Var.d = 1;
            objB = b(str, fjm1Var);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                WidgetState widgetState = fjm1Var.a;
                hm5.M(objB);
                return widgetState;
            }
            if (i2 == 3) {
                WidgetState widgetState2 = fjm1Var.a;
                hm5.M(objB);
                return widgetState2;
            }
            if (i2 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WidgetState widgetState3 = fjm1Var.a;
            hm5.M(objB);
            return widgetState3;
        }
        hm5.M(objB);
        WidgetState widgetState4 = (WidgetState) objB;
        boolean z = widgetState4 instanceof WidgetState.WrappedStory;
        nbm1 nbm1Var = nbm1.b;
        nbm1 nbm1Var2 = nbm1.a;
        o860 o860Var = this.d;
        if (z) {
            WidgetState.WrappedStory wrappedStory = (WidgetState.WrappedStory) widgetState4;
            Map mapJ = sqg0.J(new mmr0[]{new mmr0(nbm1Var2, wrappedStory.getBackgroundImageUrl()), new mmr0(nbm1Var, wrappedStory.getBackgroundGrainUrl()), new mmr0(nbm1.c, wrappedStory.getRingsImageUrl()), new mmr0(nbm1.d, wrappedStory.getLogoImageUrl())});
            fjm1Var.a = widgetState4;
            fjm1Var.d = 2;
            if (o860Var.B(mapJ, fjm1Var) != obj) {
                return widgetState4;
            }
        } else if (widgetState4 instanceof WidgetState.WrappedPlaylist) {
            WidgetState.WrappedPlaylist wrappedPlaylist = (WidgetState.WrappedPlaylist) widgetState4;
            Map mapJ2 = sqg0.J(new mmr0[]{new mmr0(nbm1Var2, wrappedPlaylist.getBackgroundImageUrl()), new mmr0(nbm1Var, wrappedPlaylist.getBackgroundGrainUrl()), new mmr0(nbm1.e, wrappedPlaylist.getPlaylistCoverUrl())});
            fjm1Var.a = widgetState4;
            fjm1Var.d = 3;
            if (o860Var.B(mapJ2, fjm1Var) != obj) {
                return widgetState4;
            }
        } else {
            fjm1Var.a = widgetState4;
            fjm1Var.d = 4;
            if (o860Var.e(fjm1Var) != obj) {
                return widgetState4;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, onm onmVar) {
        gjm1 gjm1Var;
        String str2;
        Object objI;
        String str3;
        vim1 vim1Var;
        WidgetState wrappedStory;
        if (onmVar instanceof gjm1) {
            gjm1Var = (gjm1) onmVar;
            int i = gjm1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjm1Var.e = i - Integer.MIN_VALUE;
            } else {
                gjm1Var = new gjm1(this, onmVar);
            }
        } else {
            gjm1Var = new gjm1(this, onmVar);
        }
        Object obj = gjm1Var.c;
        int i2 = gjm1Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            str2 = str;
            gjm1Var.a = str2;
            gjm1Var.e = 1;
            objI = this.a.i(gjm1Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            String str4 = gjm1Var.a;
            hm5.M(obj);
            objI = obj;
            str2 = str4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WidgetState widgetState = gjm1Var.b;
                hm5.M(obj);
                return widgetState;
            }
            String str5 = gjm1Var.a;
            hm5.M(obj);
            str3 = str5;
        }
        vim1Var = (vim1) obj;
        if (!(vim1Var instanceof sim1)) {
            if (vim1Var instanceof sim1) {
                wrappedStory = null;
            } else if (vim1Var instanceof tim1) {
                tim1 tim1Var = (tim1) vim1Var;
                wrappedStory = new WidgetState.WrappedPlaylist(tim1Var.a, tim1Var.b, tim1Var.c, tim1Var.d, tim1Var.e, "spotify:playlist:37i9dQZEVXgvuLLK4005a0", str3, false, tim1Var.f, null, 640, null);
            } else {
                if (vim1Var instanceof uim1) {
                    eg.o();
                    return null;
                }
                uim1 uim1Var = (uim1) vim1Var;
                wrappedStory = new WidgetState.WrappedStory(uim1Var.a, uim1Var.b, uim1Var.c, uim1Var.d, uim1Var.e, uim1Var.f, "spotify:datastories:wrapped", str3, false, uim1Var.g, uim1Var.h, uim1Var.i, null, 4352, null);
            }
            if (wrappedStory != null) {
                if (wrappedStory.getIsWorkProfile() && WidgetStateKt.hasArtwork(wrappedStory)) {
                    gjm1Var.a = null;
                    gjm1Var.b = wrappedStory;
                    gjm1Var.e = 3;
                    if (this.c.D(wrappedStory, gjm1Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return wrappedStory;
            }
        }
        return null;
        if (((Boolean) objI).booleanValue()) {
            gjm1Var.a = str2;
            gjm1Var.e = 2;
            Object objA = this.b.a(gjm1Var);
            if (objA != d9nVar) {
                str3 = str2;
                obj = objA;
                vim1Var = (vim1) obj;
                if (!(vim1Var instanceof sim1)) {
                    if (vim1Var instanceof sim1) {
                        wrappedStory = null;
                    } else if (vim1Var instanceof tim1) {
                        tim1 tim1Var2 = (tim1) vim1Var;
                        wrappedStory = new WidgetState.WrappedPlaylist(tim1Var2.a, tim1Var2.b, tim1Var2.c, tim1Var2.d, tim1Var2.e, "spotify:playlist:37i9dQZEVXgvuLLK4005a0", str3, false, tim1Var2.f, null, 640, null);
                    } else {
                        if (vim1Var instanceof uim1) {
                            eg.o();
                            return null;
                        }
                        uim1 uim1Var2 = (uim1) vim1Var;
                        wrappedStory = new WidgetState.WrappedStory(uim1Var2.a, uim1Var2.b, uim1Var2.c, uim1Var2.d, uim1Var2.e, uim1Var2.f, "spotify:datastories:wrapped", str3, false, uim1Var2.g, uim1Var2.h, uim1Var2.i, null, 4352, null);
                    }
                    if (wrappedStory != null) {
                        if (wrappedStory.getIsWorkProfile()) {
                            gjm1Var.a = null;
                            gjm1Var.b = wrappedStory;
                            gjm1Var.e = 3;
                            if (this.c.D(wrappedStory, gjm1Var) == d9nVar) {
                            }
                        }
                        return wrappedStory;
                    }
                }
            }
            return d9nVar;
        }
        return null;
    }
}
