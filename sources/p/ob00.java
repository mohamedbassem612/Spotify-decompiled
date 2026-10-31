package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ob00 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob00(byte b) {
        super(3, (lnm) null);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                ob00 ob00Var = new ob00(b2, lnmVar, (byte) 0);
                ob00Var.b = th;
                ob00Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                ob00 ob00Var2 = new ob00(b2, lnmVar, (byte) 1);
                ob00Var2.b = th;
                ob00Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                ob00 ob00Var3 = new ob00(b2, lnmVar, (byte) 2);
                ob00Var3.b = th;
                ob00Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                ob00 ob00Var4 = new ob00(b2, lnmVar, b2);
                ob00Var4.b = th;
                ob00Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                ob00 ob00Var5 = new ob00(b2, lnmVar, (byte) 4);
                ob00Var5.b = th;
                ob00Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                ob00 ob00Var6 = new ob00(b2, lnmVar, (byte) 5);
                ob00Var6.b = th;
                ob00Var6.invokeSuspend(rih1Var);
                throw null;
            case 6:
                ob00 ob00Var7 = new ob00(b2, lnmVar, (byte) 6);
                ob00Var7.b = th;
                ob00Var7.invokeSuspend(rih1Var);
                throw null;
            case 7:
                ob00 ob00Var8 = new ob00(b2, lnmVar, (byte) 7);
                ob00Var8.b = th;
                ob00Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                ob00 ob00Var9 = new ob00(b2, lnmVar, (byte) 8);
                ob00Var9.b = th;
                ob00Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                ob00 ob00Var10 = new ob00(b2, lnmVar, (byte) 9);
                ob00Var10.b = th;
                ob00Var10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                ob00 ob00Var11 = new ob00(b2, lnmVar, (byte) 10);
                ob00Var11.b = th;
                ob00Var11.invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                ob00 ob00Var12 = new ob00(b2, lnmVar, (byte) 11);
                ob00Var12.b = th;
                ob00Var12.invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                ob00 ob00Var13 = new ob00(b2, lnmVar, (byte) 12);
                ob00Var13.b = th;
                ob00Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                ob00 ob00Var14 = new ob00(b2, lnmVar, (byte) 13);
                ob00Var14.b = th;
                ob00Var14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                ob00 ob00Var15 = new ob00(b2, lnmVar, (byte) 14);
                ob00Var15.b = th;
                ob00Var15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                ob00 ob00Var16 = new ob00(b2, lnmVar, (byte) 15);
                ob00Var16.b = th;
                ob00Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                ob00 ob00Var17 = new ob00(b2, lnmVar, (byte) 16);
                ob00Var17.b = th;
                ob00Var17.invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                ob00 ob00Var18 = new ob00(b2, lnmVar, (byte) 17);
                ob00Var18.b = th;
                ob00Var18.invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                ob00 ob00Var19 = new ob00(b2, lnmVar, (byte) 18);
                ob00Var19.b = th;
                ob00Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                ob00 ob00Var20 = new ob00(b2, lnmVar, (byte) 19);
                ob00Var20.b = th;
                ob00Var20.invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                ob00 ob00Var21 = new ob00(b2, lnmVar, (byte) 20);
                ob00Var21.b = th;
                ob00Var21.invokeSuspend(rih1Var);
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                ob00 ob00Var22 = new ob00(b2, lnmVar, (byte) 21);
                ob00Var22.b = th;
                ob00Var22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                ob00 ob00Var23 = new ob00(b2, lnmVar, (byte) 22);
                ob00Var23.b = th;
                ob00Var23.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                ob00 ob00Var24 = new ob00(b2, lnmVar, (byte) 23);
                ob00Var24.b = th;
                ob00Var24.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                ob00 ob00Var25 = new ob00(b2, lnmVar, (byte) 24);
                ob00Var25.b = th;
                ob00Var25.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                ob00 ob00Var26 = new ob00(b2, lnmVar, (byte) 25);
                ob00Var26.b = th;
                ob00Var26.invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                ob00 ob00Var27 = new ob00(b2, lnmVar, (byte) 26);
                ob00Var27.b = th;
                ob00Var27.invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                ob00 ob00Var28 = new ob00(b2, lnmVar, (byte) 27);
                ob00Var28.b = th;
                ob00Var28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                ob00 ob00Var29 = new ob00(b2, lnmVar, (byte) 28);
                ob00Var29.b = th;
                ob00Var29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                ob00 ob00Var30 = new ob00(b2, lnmVar, (byte) 29);
                ob00Var30.b = th;
                ob00Var30.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Throwable th = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Logger.e(th, "Failed to observe reachability for cue-pipeline Gabito logging", new Object[0]);
                return rih1Var;
            case 1:
                hm5.M(obj);
                Logger.e(th, "Failed to observe show follow state", new Object[0]);
                return rih1Var;
            case 2:
                hm5.M(obj);
                Logger.d("GlassesConnectionAccessoryProvider: Error in glassesConnectionObserver " + th, new Object[0]);
                return rih1Var;
            case 3:
                hm5.M(obj);
                Logger.e(th, "Failed to observe player state for internal reports", new Object[0]);
                return rih1Var;
            case 4:
                hm5.M(obj);
                Logger.e(th, "[CAL] Error getting queue permissions", new Object[0]);
                return rih1Var;
            case 5:
                hm5.M(obj);
                if (th instanceof TimeoutCancellationException) {
                    throw new TimeoutException();
                }
                throw th;
            case 6:
                hm5.M(obj);
                Logger.d("EIS: Couldn't load list, error: %s", new Object[]{th.getMessage()});
                throw th;
            case 7:
                hm5.M(obj);
                Logger.e(th, "Failed to load DSL selection data", new Object[0]);
                return rih1Var;
            case 8:
                hm5.M(obj);
                Logger.e(th, "GOS->Error updating MediaRouteDescriptors", new Object[0]);
                return rih1Var;
            case 9:
                hm5.M(obj);
                Logger.e(th, "GOS->Error maintaining route listing preferences", new Object[0]);
                return rih1Var;
            case 10:
                hm5.M(obj);
                Logger.e(th, "Error fetching the routes from MediaRouter2", new Object[0]);
                return rih1Var;
            case 11:
                hm5.M(obj);
                Logger.e(th, "Failed to fetch state for standard list header action play button", new Object[0]);
                return rih1Var;
            case 12:
                hm5.M(obj);
                Logger.l(th, "Failed to detect viewable impression timing.", new Object[0]);
                return rih1Var;
            case 13:
                hm5.M(obj);
                Logger.e(th, "[CAL] Error getting dj playing availability", new Object[0]);
                return rih1Var;
            case 14:
                hm5.M(obj);
                Logger.e(th, "[CAL] Error getting cal permissions", new Object[0]);
                return rih1Var;
            case 15:
                hm5.M(obj);
                Logger.e(th, "[CAL] Error getting queue permissions", new Object[0]);
                return rih1Var;
            case 16:
                hm5.M(obj);
                Logger.e(th, "[CAL] Error getting context subtitle", new Object[0]);
                return rih1Var;
            case 17:
                hm5.M(obj);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw th;
                }
                Logger.l(th, "Failed to get playerState", new Object[0]);
                return rih1Var;
            case 18:
                hm5.M(obj);
                Logger.e(th, "Error while collecting ad detection response", new Object[0]);
                return rih1Var;
            case 19:
                hm5.M(obj);
                n57.t("Failed to observe persistent usage milestone", th);
                return rih1Var;
            case 20:
                hm5.M(obj);
                Logger.e(th, "Failed to fetch state for standard list header action play button", new Object[0]);
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                Logger.d("Error observing player errors for version sunsetting", new Object[]{th});
                return rih1Var;
            case 22:
                hm5.M(obj);
                n57.t("SubscribeUserToCanonicalTimestamp stream failed", th);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                hm5.M(obj);
                Logger.e(th, "Failed to observe pre-save state", new Object[0]);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                Logger.e(th, "GOS->Error while waiting for local route selection event", new Object[0]);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                hm5.M(obj);
                n57.g("[CAL] Error fetching jam state", th);
                return rih1Var;
            case 26:
                hm5.M(obj);
                Logger.e(th, "Error collecting player errors", new Object[0]);
                return rih1Var;
            case 27:
                hm5.M(obj);
                Logger.e(th, "Error collecting player state", new Object[0]);
                return rih1Var;
            case 28:
                hm5.M(obj);
                Logger.e(th, "GOS->Error selecting route from active Connect entity", new Object[0]);
                return rih1Var;
            default:
                hm5.M(obj);
                Logger.e(th, "GOS->Error unselecting after entity transition to self", new Object[0]);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob00(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
