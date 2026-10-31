package p;

import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u000f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/pnv0;", "", "", "locale", "source", "pageUri", "", "flattenSocialNotificationPreferences", "Lio/reactivex/rxjava3/core/Single;", "Lp/mh90;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/Single;", "", "Lp/xmq0;", "optOutRecords", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "filterChannel", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_notifications_datasource-datasource"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface pnv0 {
    static /* synthetic */ Single c(pnv0 pnv0Var, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getPreferencesV8");
            return null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return pnv0Var.d(str, str2, str3, z);
    }

    @yyq0("notifs-preferences/v8/enableAll")
    Completable a(@u0z0("channel") String filterChannel, @dv50("source") String source, @dv50("page-uri") String pageUri);

    @yyq0("notifs-preferences/v8/preferences")
    Completable b(@elb List<xmq0> optOutRecords, @dv50("source") String source, @dv50("page-uri") String pageUri);

    @ay30("notifs-preferences/v8/preferences")
    Single<mh90> d(@u0z0("locale") String locale, @dv50("source") String source, @dv50("page-uri") String pageUri, @u0z0("flatten_social_notification_preferences") boolean flattenSocialNotificationPreferences);

    @yyq0("notifs-preferences/v8/disableAll")
    Completable e(@dv50("source") String source, @dv50("page-uri") String pageUri);
}
