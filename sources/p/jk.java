package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jk extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(rey reyVar, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 27;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                jk jkVar = new jk(b2, lnmVar, (byte) 0);
                jkVar.b = th;
                jkVar.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                jk jkVar2 = new jk(b2, lnmVar, (byte) 1);
                jkVar2.b = th;
                jkVar2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                jk jkVar3 = new jk(b2, lnmVar, (byte) 2);
                jkVar3.b = th;
                jkVar3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                jk jkVar4 = new jk(b2, lnmVar, b2);
                jkVar4.b = th;
                jkVar4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                jk jkVar5 = new jk(b2, lnmVar, (byte) 4);
                jkVar5.b = th;
                jkVar5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                jk jkVar6 = new jk(b2, lnmVar, (byte) 5);
                jkVar6.b = th;
                jkVar6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                jk jkVar7 = new jk(b2, lnmVar, (byte) 6);
                jkVar7.b = th;
                jkVar7.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                jk jkVar8 = new jk(b2, lnmVar, (byte) 7);
                jkVar8.b = th;
                jkVar8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                jk jkVar9 = new jk(b2, lnmVar, (byte) 8);
                jkVar9.b = th;
                jkVar9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                jk jkVar10 = new jk(b2, lnmVar, (byte) 9);
                jkVar10.b = th;
                jkVar10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                jk jkVar11 = new jk(b2, lnmVar, (byte) 10);
                jkVar11.b = th;
                jkVar11.invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                jk jkVar12 = new jk(b2, lnmVar, (byte) 11);
                jkVar12.b = th;
                jkVar12.invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                jk jkVar13 = new jk(b2, lnmVar, (byte) 12);
                jkVar13.b = th;
                jkVar13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                jk jkVar14 = new jk(b2, lnmVar, (byte) 13);
                jkVar14.b = th;
                jkVar14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                jk jkVar15 = new jk(b2, lnmVar, (byte) 14);
                jkVar15.b = th;
                jkVar15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                jk jkVar16 = new jk(b2, lnmVar, (byte) 15);
                jkVar16.b = th;
                jkVar16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                jk jkVar17 = new jk(b2, lnmVar, (byte) 16);
                jkVar17.b = th;
                jkVar17.invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                jk jkVar18 = new jk(b2, lnmVar, (byte) 17);
                jkVar18.b = th;
                jkVar18.invokeSuspend(rih1Var);
                throw null;
            case 18:
                jk jkVar19 = new jk(b2, lnmVar, (byte) 18);
                jkVar19.b = th;
                jkVar19.invokeSuspend(rih1Var);
                throw null;
            case 19:
                jk jkVar20 = new jk(b2, lnmVar, (byte) 19);
                jkVar20.b = th;
                jkVar20.invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                jk jkVar21 = new jk(b2, lnmVar, (byte) 20);
                jkVar21.b = th;
                jkVar21.invokeSuspend(rih1Var);
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                jk jkVar22 = new jk(b2, lnmVar, (byte) 21);
                jkVar22.b = th;
                jkVar22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                jk jkVar23 = new jk(b2, lnmVar, (byte) 22);
                jkVar23.b = th;
                jkVar23.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                jk jkVar24 = new jk(b2, lnmVar, (byte) 23);
                jkVar24.b = th;
                jkVar24.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                jk jkVar25 = new jk(b2, lnmVar, (byte) 24);
                jkVar25.b = th;
                jkVar25.invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                jk jkVar26 = new jk(b2, lnmVar, (byte) 25);
                jkVar26.b = th;
                jkVar26.invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                jk jkVar27 = new jk(b2, lnmVar, (byte) 26);
                jkVar27.b = th;
                jkVar27.invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                jk jkVar28 = new jk(null, lnmVar);
                jkVar28.b = th;
                jkVar28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                jk jkVar29 = new jk(b2, lnmVar, (byte) 28);
                jkVar29.b = th;
                jkVar29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                jk jkVar30 = new jk(b2, lnmVar, (byte) 29);
                jkVar30.b = th;
                jkVar30.invokeSuspend(rih1Var);
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
                Logger.e(th, "Error converting accessories to AudioOutputs", new Object[0]);
                return rih1Var;
            case 1:
                hm5.M(obj);
                String message = th.getMessage();
                if (message == null) {
                    message = "Error AdCarModeObserver";
                }
                n57.e(message);
                return rih1Var;
            case 2:
                hm5.M(obj);
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "Error AdDataSaverObserver";
                }
                n57.e(message2);
                return rih1Var;
            case 3:
                hm5.M(obj);
                Objects.toString(th);
                return rih1Var;
            case 4:
                hm5.M(obj);
                Logger.e(th, "Failed to observe permission invalidation", new Object[0]);
                return rih1Var;
            case 5:
                hm5.M(obj);
                Logger.e(th, "Error blocking video playback", new Object[0]);
                return rih1Var;
            case 6:
                hm5.M(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                Logger.k("Exception caught in NetworkReporter " + th, new Object[0]);
                return rih1Var;
            case 8:
                hm5.M(obj);
                Logger.e(th, "Failed to refresh allowlisted tracks", new Object[0]);
                return rih1Var;
            case 9:
                hm5.M(obj);
                Logger.e(th, "Failed to observe permission changes", new Object[0]);
                return rih1Var;
            case 10:
                hm5.M(obj);
                Logger.e(th, "Error resolving primary artists from extended metadata.", new Object[0]);
                return rih1Var;
            case 11:
                hm5.M(obj);
                Logger.e(th, "Error while fetching bluetooth devices on foreground event", new Object[0]);
                return rih1Var;
            case 12:
                hm5.M(obj);
                Logger.d("CarConnectionAccessoryProvider: Error in carConnectionObserver " + th, new Object[0]);
                return rih1Var;
            case 13:
                hm5.M(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                return rih1Var;
            case 14:
                hm5.M(obj);
                Logger.e(th, "ConditionsChangeObserver: Failed. Its OK! We will catch this error in another chain (i.e. we don't want multiple chain failures)", new Object[0]);
                return rih1Var;
            case 15:
                hm5.M(obj);
                Logger.e(th, "Error observing AvailableAudioOutputs", new Object[0]);
                return rih1Var;
            case 16:
                hm5.M(obj);
                Logger.e(th, "Error observing RecommendedLocalIdentifiers", new Object[0]);
                return rih1Var;
            case 17:
                hm5.M(obj);
                Logger.e(th, f4i1.f("Error fetching connect state ", th.getMessage(), " "), new Object[0]);
                throw th;
            case 18:
                hm5.M(obj);
                Logger.d(l1d.m("Error fetching install spotify state ", th.getMessage()), new Object[0]);
                throw th;
            case 19:
                hm5.M(obj);
                Logger.e(th, "ContextMenuComponentImpl failed to observe commonEventUtils.events.", new Object[0]);
                return rih1Var;
            case 20:
                hm5.M(obj);
                Logger.e(th, "There was a problem observing player commands", new Object[0]);
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                Logger.l(th, "Failed to detect viewable impression timing.", new Object[0]);
                return rih1Var;
            case 22:
                hm5.M(obj);
                Logger.e(th, "Error in accessory flow", new Object[0]);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                hm5.M(obj);
                Logger.e(th, "Error in events flow", new Object[0]);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                Logger.e(th, "Error in routes categorization flow", new Object[0]);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                hm5.M(obj);
                Logger.e(th, "Error subscribing to player state", new Object[0]);
                return rih1Var;
            case 26:
                hm5.M(obj);
                Logger.e(th, "Something unexpected happened when listening for triggers.", new Object[0]);
                return rih1Var;
            case 27:
                hm5.M(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                throw null;
            case 28:
                hm5.M(obj);
                n57.t("Failed to load download sizes", th);
                return rih1Var;
            default:
                hm5.M(obj);
                n57.t("Failed to observe download sessions", th);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(byte b) {
        super(3, (lnm) null);
        this.a = b;
    }
}
