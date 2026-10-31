package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f5j0 implements Supplier {
    public final /* synthetic */ MessageRequest a;
    public final /* synthetic */ i5j0 b;
    public final /* synthetic */ String c;

    public f5j0(MessageRequest messageRequest, i5j0 i5j0Var, String str) {
        this.a = messageRequest;
        this.b = i5j0Var;
        this.c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        long millis;
        CappingRule.TimeBased timeBased;
        MessageRequest messageRequest = this.a;
        int i = e5j0.a[messageRequest.getTriggerType().ordinal()];
        String str = this.c;
        i5j0 i5j0Var = this.b;
        int i2 = 1;
        if (i == 1) {
            ((tlc) i5j0Var.b).a(messageRequest.getTriggerPattern());
        } else if (i == 2) {
            ajc ajcVar = i5j0Var.a;
            String triggerPattern = messageRequest.getTriggerPattern();
            TriggerType triggerType = messageRequest.getTriggerType();
            List<ClientMessage> suppliedMessages = messageRequest.getSuppliedMessages();
            ArrayList arrayList = new ArrayList(q7h.U(suppliedMessages, 10));
            for (ClientMessage clientMessage : suppliedMessages) {
                List listX = k4p1.x(new Trigger(messageRequest.getTriggerType(), messageRequest.getTriggerPattern()));
                String id = clientMessage.getId();
                Format format = clientMessage.getFormat();
                MessageSource messageSource = MessageSource.LOCAL;
                LoggingData loggingData = new LoggingData(clientMessage.getUuid(), 0L, 0L, 0L, 0L, "", yhm0.e(clientMessage.getFormat()), upn1.m(), messageSource, false, 512, (DefaultConstructorMarker) null);
                MessageType messageType = MessageType.LOCAL;
                Set cappingRules = clientMessage.getCappingRules();
                Pacing pacing = clientMessage.getPacing();
                if (pacing.getInterval() <= 0) {
                    timeBased = null;
                } else {
                    int i3 = xhm0.a[pacing.getTimeUnit().ordinal()];
                    if (i3 != i2) {
                        TimeUnit timeUnit = TimeUnit.DAYS;
                        if (i3 == 2) {
                            millis = timeUnit.toMillis(pacing.getInterval());
                        } else {
                            if (i3 != 3) {
                                eg.o();
                                return null;
                            }
                            millis = timeUnit.toMillis(((long) pacing.getInterval()) * 7);
                        }
                    } else {
                        millis = TimeUnit.HOURS.toMillis(pacing.getInterval());
                    }
                    timeBased = new CappingRule.TimeBased(millis);
                }
                arrayList.add(new Message.CreativeMessage(listX, id, format, messageSource, loggingData, Long.MAX_VALUE, messageType, dm61.y0(cappingRules, p7h.N(timeBased)), clientMessage.getPacing()));
                i2 = 1;
            }
            gmc gmcVar = new gmc(str, triggerPattern, triggerType, messageRequest.getPageUri(), arrayList, messageRequest.getInteractionLoggingResult(), messageRequest.getRulesConfig(), messageRequest.getDynamicTagsMetadata(), messageRequest.getConflictResolutionStrategy(), messageRequest.getOrchestrationMetadata());
            cjc cjcVar = (cjc) ajcVar;
            ObservableSource observableSourceHide = cjcVar.a.a.hide();
            kmc kmcVar = cjcVar.b;
            Observable.combineLatest(observableSourceHide, kmcVar.a.map(new n4b(kmcVar, (byte) 2)), (BiFunction) new jc9(gmcVar, (byte) 8)).filter(bya0.N0).take(1L).ignoreElements().subscribe((CompletableObserver) new bjc(cjcVar, gmcVar));
        }
        return i5j0Var.c.a.hide().filter(new ljp1(str, (byte) 12)).first(new MessageResponse.Failure(messageRequest, str, DiscardReason.MessageNotFound.INSTANCE));
    }
}
