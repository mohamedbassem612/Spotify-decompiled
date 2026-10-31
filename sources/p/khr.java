package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionShow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class khr implements Function {
    public final /* synthetic */ mhr a;
    public final /* synthetic */ String b;

    public khr(mhr mhrVar, String str) {
        this.a = mhrVar;
        this.b = str;
    }

    public final Object apply(Object obj) {
        CollectionShow collectionShow = (CollectionShow) o7h.s0(((CollectionDecorateResponse) obj).q());
        if (collectionShow == null || !collectionShow.s() || !collectionShow.q().hasCovers() || !collectionShow.q().hasName()) {
            Single singleNever = Single.never();
            singleNever.getClass();
            return singleNever;
        }
        mhr mhrVar = this.a;
        ljg ljgVar = mhrVar.g;
        String str = this.b;
        String strM = l1d.m("AUDIOBOOK_PROGRESS_BOTTOMSHEET:", str);
        String string = UUID.randomUUID().toString();
        phr phrVar = mhrVar.j;
        String name = collectionShow.q().getName();
        String standardLink = collectionShow.q().getCovers().getStandardLink();
        Context context = phrVar.a;
        return ljg.c(ljgVar, this.b, (TriggerType) null, (String) null, Collections.singletonList(new ClientMessage(strM, string, new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet((Signifier) null, standardLink, context.getString(2131952632), context.getString(2131952631, name), new Button("primaryCta", new ButtonStyle(context.getString(2131952630), (String) null, (String) null, new Icon(IconName.PLUS, "black"), (ButtonType) null, (EncoreFont) null, (ButtonIconAlignment) null, 112, (DefaultConstructorMarker) null), new ClickAction("ADD_AUDIOBOOK", str, (Map) null, 4, (DefaultConstructorMarker) null)), (Button) null)), w7x.a, new Pacing(5, PacingTimeUnit.HOURS))), (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 502);
    }
}
