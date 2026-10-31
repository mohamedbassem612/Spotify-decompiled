package p;

import com.spotify.interapp.service.IapException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class nh61 implements Function, Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ nh61(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    public Object apply(Object obj) {
        char c;
        byte b = this.a;
        wq5 wq5Var = cv5.a;
        switch (b) {
            case 0:
                return new ns5((PlayerState) obj);
            case 1:
                return new rt5(Boolean.valueOf(!((PlayerState) obj).options().shufflingContext()));
            case 2:
                return LoggingParams.builder().interactionId(((ou80) obj).a).build();
            case 3:
                return LoggingParams.builder().interactionId(((ou80) obj).a).build();
            case 4:
            case 14:
            case 16:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            default:
                return ((ContextTrack) obj).uri();
            case 5:
                return ((Boolean) obj).booleanValue() ? Observable.just(wq5Var) : Observable.empty();
            case 6:
                Throwable th = (Throwable) obj;
                return th instanceof TimeoutException ? IapException.a("Failed to switch to local device.") : Observable.error(th);
            case 7:
                z310 z310Var = (z310) obj;
                return oh61.c(z310Var, 0, z310Var.a.size());
            case 8:
                return iu5.a((PlayerState) obj);
            case 9:
                eao eaoVar = (eao) obj;
                Boolean boolValueOf = Boolean.valueOf(eaoVar.a);
                Integer numValueOf = Integer.valueOf(eaoVar.b);
                tq5 tq5Var = new tq5();
                tq5Var.b = boolValueOf;
                tq5Var.c = numValueOf;
                return tq5Var;
            case 10:
                return new rt5((PlayerState) obj);
            case 11:
                Boolean bool = (Boolean) obj;
                return bool.booleanValue() ? Observable.just(bool) : IapException.a("Playback speed can only be set on local device");
            case 12:
                return LoggingParams.builder().interactionId(((ou80) obj).a).build();
            case 13:
                return LoggingParams.builder().interactionId(((ou80) obj).a).build();
            case 15:
                PlayerState playerState = (PlayerState) obj;
                if (playerState == null) {
                    c = 0;
                } else if (playerState.options().repeatingTrack()) {
                    c = 1;
                } else if (playerState.options().repeatingContext()) {
                    c = 2;
                } else {
                    c = 0;
                }
                if (c != 1) {
                    return c != 2 ? new zs5((Integer) 2) : new zs5((Integer) 1);
                }
                return new zs5((Integer) 0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return wq5Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Throwable th2 = (Throwable) obj;
                return th2 instanceof TimeoutException ? IapException.a("Failed to play.") : Observable.error(th2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 22:
                return wq5Var;
            case 23:
                Throwable th3 = (Throwable) obj;
                return th3 instanceof TimeoutException ? IapException.a("Failed to pause.") : Observable.error(th3);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ft5((PlayerState) obj);
            case 25:
                qs5 qs5Var = (qs5) obj;
                gu5 gu5Var = qs5Var.d;
                String str = qs5Var.b;
                if (!gu5Var.k.booleanValue() || !qs5Var.d.l.booleanValue()) {
                    blc0 blc0Var = blc0.fh;
                    Set set = s4b1.f;
                    if (!uic.g(str, blc0Var) && !uic.g(str, blc0.bh)) {
                        return IapException.a("Playback speed is only supported for Podcast playback");
                    }
                }
                return Observable.just(qs5Var);
            case 26:
                return ((PlayerState) obj).track();
            case 27:
                return (ContextTrack) ((spq0) obj).b();
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((Boolean) obj).booleanValue();
            case 14:
                return !((PlayerState) obj).isPaused();
            case 16:
                return !((PlayerState) obj).isPaused();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                PlayerState playerState = (PlayerState) obj;
                return playerState.isPaused() || !playerState.isPlaying();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                PlayerState playerState2 = (PlayerState) obj;
                return playerState2.isPaused() || !playerState2.isPlaying();
            default:
                nmr0 nmr0Var = (nmr0) obj;
                th61 th61Var = (th61) nmr0Var.a;
                Boolean bool = (Boolean) nmr0Var.b;
                boolean z = th61Var.b;
                boolean z2 = th61Var.h;
                return !(z || th61Var.c) || (bool.booleanValue() && !z2) || (th61Var.b && z2);
        }
    }
}
